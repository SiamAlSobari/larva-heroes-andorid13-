package com.unity3d.services.core.cache;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: CacheDirectory.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private String a;
    private boolean b = false;
    private File c = null;
    private b d = null;

    public a(String str) {
        this.a = str;
    }

    public synchronized File a(Context context) {
        File fileA;
        if (this.b) {
            return this.c;
        }
        this.b = true;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            try {
                fileA = a(context.getExternalCacheDir(), this.a);
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Creating external cache directory failed", e);
                fileA = null;
            }
            if (b(fileA)) {
                a(fileA);
                this.c = fileA;
                this.d = b.EXTERNAL;
                com.unity3d.services.core.log.a.b("Unity Ads is using external cache directory: " + fileA.getAbsolutePath());
                return this.c;
            }
        } else {
            com.unity3d.services.core.log.a.b("External media not mounted");
        }
        File filesDir = context.getFilesDir();
        if (!b(filesDir)) {
            com.unity3d.services.core.log.a.c("Unity Ads failed to initialize cache directory");
            return null;
        }
        this.c = filesDir;
        this.d = b.INTERNAL;
        com.unity3d.services.core.log.a.b("Unity Ads is using internal cache directory: " + filesDir.getAbsolutePath());
        return this.c;
    }

    public boolean b(File file) {
        if (file != null && file.isDirectory()) {
            try {
                byte[] bytes = "test".getBytes("UTF-8");
                int length = bytes.length;
                byte[] bArr = new byte[length];
                File file2 = new File(file, "UnityAdsTest.txt");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.close();
                FileInputStream fileInputStream = new FileInputStream(file2);
                int i = fileInputStream.read(bArr, 0, length);
                fileInputStream.close();
                if (!file2.delete()) {
                    com.unity3d.services.core.log.a.b("Failed to delete testfile " + file2.getAbsoluteFile());
                    return false;
                }
                if (i != length) {
                    com.unity3d.services.core.log.a.b("Read buffer size mismatch");
                    return false;
                }
                if (new String(bArr, "UTF-8").equals("test")) {
                    return true;
                }
                com.unity3d.services.core.log.a.b("Read buffer content mismatch");
                return false;
            } catch (Exception e) {
                com.unity3d.services.core.log.a.b("Unity Ads exception while testing cache directory " + file.getAbsolutePath() + ": " + e.getMessage());
            }
        }
        return false;
    }

    public b a() {
        return this.d;
    }

    public File a(File file, String str) {
        if (file == null) {
            return null;
        }
        File file2 = new File(file, str);
        file2.mkdirs();
        if (file2.isDirectory()) {
            return file2;
        }
        return null;
    }

    private void a(File file) {
        try {
            if (new File(file, ".nomedia").createNewFile()) {
                com.unity3d.services.core.log.a.b("Successfully created .nomedia file");
            } else {
                com.unity3d.services.core.log.a.b("Using existing .nomedia file");
            }
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Failed to create .nomedia file", e);
        }
    }
}
