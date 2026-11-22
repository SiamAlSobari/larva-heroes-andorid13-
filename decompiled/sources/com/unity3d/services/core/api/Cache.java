package com.unity3d.services.core.api;

import android.media.MediaMetadataRetriever;
import android.util.Base64;
import android.util.SparseArray;
import com.unity3d.services.core.cache.c;
import com.unity3d.services.core.cache.e;
import com.unity3d.services.core.device.b;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.properties.d;
import com.unity3d.services.core.request.i;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Cache {

    static class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(d.c());
        }
    }

    private static SparseArray<String> a(String str, JSONArray jSONArray) throws JSONException, IOException, RuntimeException {
        File file = new File(str);
        SparseArray<String> sparseArray = new SparseArray<>();
        if (!file.exists()) {
            throw new IOException("File: " + file.getAbsolutePath() + " doesn't exist");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
        for (int i = 0; i < jSONArray.length(); i++) {
            int i2 = jSONArray.getInt(i);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(i2);
            if (strExtractMetadata != null) {
                sparseArray.put(i2, strExtractMetadata);
            }
        }
        return sparseArray;
    }

    private static JSONObject b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str);
        File file = new File(a(str));
        if (file.exists()) {
            jSONObject.put("found", true);
            jSONObject.put("size", file.length());
            jSONObject.put("mtime", file.lastModified());
        } else {
            jSONObject.put("found", false);
        }
        return jSONObject;
    }

    @WebViewExposed
    public static void deleteFile(String str, l lVar) {
        if (new File(a(str)).delete()) {
            lVar.a(new Object[0]);
        } else {
            lVar.a(c.FILE_IO_ERROR, new Object[0]);
        }
    }

    @WebViewExposed
    public static void download(String str, String str2, JSONArray jSONArray, Boolean bool, l lVar) {
        if (e.f()) {
            lVar.a(c.FILE_ALREADY_CACHING, new Object[0]);
            return;
        }
        if (!b.U()) {
            lVar.a(c.NO_INTERNET, new Object[0]);
            return;
        }
        try {
            e.a(str, a(str2), Request.getHeadersMap(jSONArray), bool.booleanValue());
            lVar.a(new Object[0]);
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Error mapping headers for the request", e);
            lVar.a(i.MAPPING_HEADERS_FAILED, str, str2);
        }
    }

    @WebViewExposed
    public static void getCacheDirectoryExists(l lVar) {
        File fileA = d.a();
        if (fileA == null) {
            lVar.a(c.CACHE_DIRECTORY_NULL, new Object[0]);
        } else {
            lVar.a(Boolean.valueOf(fileA.exists()));
        }
    }

    @WebViewExposed
    public static void getCacheDirectoryType(l lVar) {
        com.unity3d.services.core.cache.a aVarB = d.b();
        if (aVarB == null || aVarB.a(com.unity3d.services.core.properties.a.e()) == null) {
            lVar.a(c.CACHE_DIRECTORY_NULL, new Object[0]);
            return;
        }
        if (!aVarB.a(com.unity3d.services.core.properties.a.e()).exists()) {
            lVar.a(c.CACHE_DIRECTORY_DOESNT_EXIST, new Object[0]);
            return;
        }
        com.unity3d.services.core.cache.b bVarA = aVarB.a();
        if (bVarA == null) {
            lVar.a(c.CACHE_DIRECTORY_TYPE_NULL, new Object[0]);
        } else {
            lVar.a(bVarA.name());
        }
    }

    @WebViewExposed
    public static void getFileContent(String str, String str2, l lVar) throws Throwable {
        Object objEncodeToString;
        String strA = a(str);
        File file = new File(strA);
        if (!file.exists()) {
            lVar.a(c.FILE_NOT_FOUND, str, strA);
            return;
        }
        try {
            byte[] bArrA = j.a(file);
            if (str2 == null) {
                lVar.a(c.UNSUPPORTED_ENCODING, str, strA, str2);
                return;
            }
            if (str2.equals("UTF-8")) {
                objEncodeToString = Charset.forName("UTF-8").decode(ByteBuffer.wrap(bArrA)).toString();
            } else {
                if (!str2.equals("Base64")) {
                    lVar.a(c.UNSUPPORTED_ENCODING, str, strA, str2);
                    return;
                }
                objEncodeToString = Base64.encodeToString(bArrA, 2);
            }
            lVar.a(objEncodeToString);
        } catch (IOException e) {
            lVar.a(c.FILE_IO_ERROR, str, strA, e.getMessage() + ", " + e.getClass().getName());
        }
    }

    @WebViewExposed
    public static void getFileInfo(String str, l lVar) {
        try {
            lVar.a(b(str));
        } catch (JSONException e) {
            com.unity3d.services.core.log.a.a("Error creating JSON", e);
            lVar.a(c.JSON_ERROR, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getFilePath(String str, l lVar) {
        if (new File(a(str)).exists()) {
            lVar.a(a(str));
        } else {
            lVar.a(c.FILE_NOT_FOUND, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getFiles(l lVar) {
        File fileA = d.a();
        if (fileA == null) {
            return;
        }
        com.unity3d.services.core.log.a.b("Unity Ads cache: checking app directory for Unity Ads cached files");
        File[] fileArrListFiles = fileA.listFiles(new a());
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            lVar.a(new JSONArray());
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (File file : fileArrListFiles) {
                String strSubstring = file.getName().substring(d.c().length());
                com.unity3d.services.core.log.a.b("Unity Ads cache: found " + strSubstring + ", " + file.length() + " bytes");
                jSONArray.put(b(strSubstring));
            }
            lVar.a(jSONArray);
        } catch (JSONException e) {
            com.unity3d.services.core.log.a.a("Error creating JSON", e);
            lVar.a(c.JSON_ERROR, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getFreeSpace(l lVar) {
        lVar.a(Long.valueOf(b.a(d.a())));
    }

    @WebViewExposed
    public static void getHash(String str, l lVar) {
        lVar.a(j.a(str));
    }

    @WebViewExposed
    public static void getMetaData(String str, JSONArray jSONArray, l lVar) {
        try {
            SparseArray<String> sparseArrayA = a(a(str), jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < sparseArrayA.size(); i++) {
                JSONArray jSONArray3 = new JSONArray();
                jSONArray3.put(sparseArrayA.keyAt(i));
                jSONArray3.put(sparseArrayA.valueAt(i));
                jSONArray2.put(jSONArray3);
            }
            lVar.a(jSONArray2);
        } catch (IOException e) {
            lVar.a(c.FILE_IO_ERROR, e.getMessage());
        } catch (RuntimeException e2) {
            lVar.a(c.INVALID_ARGUMENT, e2.getMessage());
        } catch (JSONException e3) {
            lVar.a(c.JSON_ERROR, e3.getMessage());
        }
    }

    @WebViewExposed
    public static void getProgressInterval(l lVar) {
        lVar.a(Integer.valueOf(e.c()));
    }

    @WebViewExposed
    public static void getTimeouts(l lVar) {
        lVar.a(Integer.valueOf(e.b()), Integer.valueOf(e.d()));
    }

    @WebViewExposed
    public static void getTotalSpace(l lVar) {
        lVar.a(Long.valueOf(b.b(d.a())));
    }

    @WebViewExposed
    public static void isCaching(l lVar) {
        lVar.a(Boolean.valueOf(e.f()));
    }

    @WebViewExposed
    public static void recreateCacheDirectory(l lVar) {
        if (d.a().exists()) {
            lVar.a(c.CACHE_DIRECTORY_EXISTS, new Object[0]);
            return;
        }
        d.a((com.unity3d.services.core.cache.a) null);
        if (d.a() == null) {
            lVar.a(c.CACHE_DIRECTORY_NULL, new Object[0]);
        } else {
            lVar.a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setFileContent(String str, String str2, String str3, l lVar) throws Throwable {
        String strA = a(str);
        boolean z = true;
        try {
            byte[] bytes = str3.getBytes("UTF-8");
            if (str2 != null && str2.length() > 0) {
                if (str2.equals("Base64")) {
                    bytes = Base64.decode(str3, 2);
                } else if (!str2.equals("UTF-8")) {
                    lVar.a(c.UNSUPPORTED_ENCODING, str, strA, str2);
                    return;
                }
            }
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(strA);
                        try {
                            fileOutputStream2.write(bytes);
                            fileOutputStream2.flush();
                            try {
                                fileOutputStream2.close();
                            } catch (Exception e) {
                                e = e;
                                com.unity3d.services.core.log.a.a("Error closing FileOutputStream", e);
                            }
                        } catch (FileNotFoundException unused) {
                            fileOutputStream = fileOutputStream2;
                            lVar.a(c.FILE_NOT_FOUND, str, strA, str2);
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            z = false;
                        } catch (IOException unused2) {
                            fileOutputStream = fileOutputStream2;
                            lVar.a(c.FILE_IO_ERROR, str, strA, str2);
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Exception e2) {
                                    com.unity3d.services.core.log.a.a("Error closing FileOutputStream", e2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (FileNotFoundException unused3) {
                } catch (IOException unused4) {
                }
            } catch (Exception e3) {
                e = e3;
                z = false;
            }
            if (z) {
                lVar.a(new Object[0]);
            }
        } catch (UnsupportedEncodingException unused5) {
            lVar.a(c.UNSUPPORTED_ENCODING, str, strA, str2);
        }
    }

    @WebViewExposed
    public static void setProgressInterval(Integer num, l lVar) {
        e.b(num.intValue());
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void setTimeouts(Integer num, Integer num2, l lVar) {
        e.a(num.intValue());
        e.c(num2.intValue());
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void stop(l lVar) {
        if (!e.f()) {
            lVar.a(c.NOT_CACHING, new Object[0]);
        } else {
            e.a();
            lVar.a(new Object[0]);
        }
    }

    private static String a(String str) {
        return d.a() + "/" + d.c() + str;
    }
}
