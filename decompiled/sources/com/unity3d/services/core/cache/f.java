package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import androidx.browser.trusted.sharing.ShareTarget;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.request.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CacheThreadHandler.java */
/* JADX INFO: loaded from: classes2.dex */
class f extends Handler {
    private h a = null;
    private boolean b = false;
    private boolean c = false;

    /* JADX INFO: compiled from: CacheThreadHandler.java */
    class a implements com.unity3d.services.core.request.d {
        private long a = System.currentTimeMillis();
        final /* synthetic */ File b;
        final /* synthetic */ int c;

        a(File file, int i) {
            this.b = file;
            this.c = i;
        }

        @Override // com.unity3d.services.core.request.d
        public void a(String str, long j, int i, Map<String, List<String>> map) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.CACHE, d.DOWNLOAD_STARTED, str, Long.valueOf(this.b.length()), Long.valueOf(j + this.b.length()), Integer.valueOf(i), Request.getResponseHeadersMap(map));
        }

        @Override // com.unity3d.services.core.request.d
        public void a(String str, long j, long j2) {
            if (this.c <= 0 || System.currentTimeMillis() - this.a <= this.c) {
                return;
            }
            this.a = System.currentTimeMillis();
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.CACHE, d.DOWNLOAD_PROGRESS, str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    f() {
    }

    public void a(boolean z) {
        h hVar;
        this.b = z;
        if (!z || (hVar = this.a) == null) {
            return;
        }
        this.c = false;
        hVar.a();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        HashMap<String, List<String>> map;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i2 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i3 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z = data.getBoolean("append", false);
        data.remove("append");
        if (data.size() > 0) {
            com.unity3d.services.core.log.a.b("There are headers left in data, reading them");
            HashMap<String, List<String>> map2 = new HashMap<>();
            for (String str : data.keySet()) {
                map2.put(str, Arrays.asList(data.getStringArray(str)));
            }
            map = map2;
        } else {
            map = null;
        }
        File file = new File(string2);
        if ((z && !file.exists()) || (!z && file.exists())) {
            this.c = false;
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.CACHE, d.DOWNLOAD_ERROR, c.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z), Boolean.valueOf(file.exists()));
        } else {
            if (message.what != 1) {
                return;
            }
            a(string, string2, i, i2, i3, map, z);
        }
    }

    public boolean a() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.unity3d.services.core.request.h] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v79 */
    /* JADX WARN: Type inference failed for: r4v80 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v41, types: [long] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private void a(String str, String str2, int i, int i2, int i3, HashMap<String, List<String>> map, boolean z) throws Throwable {
        ?? r4;
        ?? r1;
        int i4;
        ?? r6;
        char c;
        char c2;
        Throwable th;
        h hVar;
        int i5;
        ?? r7;
        h hVar2;
        int i6;
        ?? r8;
        h hVar3;
        int i7;
        ?? r9;
        h hVar4;
        int i8;
        ?? r10;
        h hVar5;
        int i9;
        ?? r11;
        h hVar6;
        int i10;
        ?? r12;
        ?? length;
        FileOutputStream fileOutputStream;
        Object obj;
        char c3;
        boolean z2;
        h hVar7;
        int i11;
        boolean z3;
        h hVar8;
        int i12;
        boolean z4;
        h hVar9;
        int i13;
        boolean z5;
        h hVar10;
        int i14;
        boolean z6;
        h hVar11;
        int i15;
        boolean z7;
        h hVar12;
        int i16;
        boolean z8;
        ?? r2 = z;
        if (this.b || str == null || str2 == null) {
            return;
        }
        File file = new File(str2);
        if (r2 != 0) {
            ?? sb = new StringBuilder("Unity Ads cache: resuming download ");
            sb.append(str);
            sb.append(" to ");
            sb.append(str2);
            sb.append(" at ");
            length = file.length();
            sb.append(length);
            sb.append(" bytes");
            com.unity3d.services.core.log.a.b(sb.toString());
            r4 = "Unity Ads cache: resuming download ";
        } else {
            com.unity3d.services.core.log.a.b("Unity Ads cache: start downloading " + str + " to " + str2);
            r4 = "Unity Ads cache: start downloading ";
        }
        if (!com.unity3d.services.core.device.b.U()) {
            com.unity3d.services.core.log.a.b("Unity Ads cache: download cancelled, no internet connection available");
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.CACHE, d.DOWNLOAD_ERROR, c.NO_INTERNET, str);
            return;
        }
        this.c = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(file, (boolean) r2);
                try {
                    h hVarA = a(str, i, i2, map);
                    this.a = hVarA;
                    hVarA.a(new a(file, i3));
                    long jA = this.a.a(fileOutputStream3);
                    this.c = false;
                    fileOutputStream = fileOutputStream3;
                    c = 1;
                    c2 = 2;
                    try {
                        a(jElapsedRealtime, str, file, jA, this.a.d(), this.a.m(), this.a.j(), this.a.k());
                        this.a = null;
                        try {
                            fileOutputStream.close();
                        } catch (Exception e) {
                            com.unity3d.services.core.log.a.a("Error closing stream", e);
                            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.CACHE, d.DOWNLOAD_ERROR, c.FILE_IO_ERROR, str, e.getMessage());
                        }
                    } catch (com.unity3d.services.core.request.e e2) {
                        e = e2;
                        hVar12 = null;
                        i16 = 3;
                        z8 = false;
                        fileOutputStream2 = fileOutputStream;
                        hVar6 = hVar12;
                        i10 = i16;
                        r12 = z8;
                        com.unity3d.services.core.log.a.a("Network error", e);
                        this.c = r12;
                        com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
                        com.unity3d.services.core.webview.b bVar = com.unity3d.services.core.webview.b.CACHE;
                        d dVar = d.DOWNLOAD_ERROR;
                        Object[] objArr = new Object[i10];
                        objArr[r12] = c.NETWORK_ERROR;
                        objArr[c] = str;
                        objArr[c2] = e.getMessage();
                        aVarC.a(bVar, dVar, objArr);
                        this.a = hVar6;
                        r2 = hVar6;
                        r4 = i10;
                        length = r12;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r2 = hVar6;
                                r4 = i10;
                                length = r12;
                            } catch (Exception e3) {
                                com.unity3d.services.core.log.a.a("Error closing stream", e3);
                                com.unity3d.services.core.webview.a aVarC2 = com.unity3d.services.core.webview.a.c();
                                com.unity3d.services.core.webview.b bVar2 = com.unity3d.services.core.webview.b.CACHE;
                                d dVar2 = d.DOWNLOAD_ERROR;
                                Object[] objArr2 = new Object[i10];
                                objArr2[r12] = c.FILE_IO_ERROR;
                                objArr2[c] = str;
                                String message = e3.getMessage();
                                objArr2[c2] = message;
                                aVarC2.a(bVar2, dVar2, objArr2);
                                r2 = message;
                                r4 = objArr2;
                                length = r12;
                            }
                        }
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        hVar11 = null;
                        i15 = 3;
                        z7 = false;
                        fileOutputStream2 = fileOutputStream;
                        hVar5 = hVar11;
                        i9 = i15;
                        r11 = z7;
                        com.unity3d.services.core.log.a.a("Couldn't create target file", e);
                        this.c = r11;
                        com.unity3d.services.core.webview.a aVarC3 = com.unity3d.services.core.webview.a.c();
                        com.unity3d.services.core.webview.b bVar3 = com.unity3d.services.core.webview.b.CACHE;
                        d dVar3 = d.DOWNLOAD_ERROR;
                        Object[] objArr3 = new Object[i9];
                        objArr3[r11] = c.FILE_IO_ERROR;
                        objArr3[c] = str;
                        objArr3[c2] = e.getMessage();
                        aVarC3.a(bVar3, dVar3, objArr3);
                        this.a = hVar5;
                        r2 = hVar5;
                        r4 = i9;
                        length = r11;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r2 = hVar5;
                                r4 = i9;
                                length = r11;
                            } catch (Exception e5) {
                                com.unity3d.services.core.log.a.a("Error closing stream", e5);
                                com.unity3d.services.core.webview.a aVarC4 = com.unity3d.services.core.webview.a.c();
                                com.unity3d.services.core.webview.b bVar4 = com.unity3d.services.core.webview.b.CACHE;
                                d dVar4 = d.DOWNLOAD_ERROR;
                                Object[] objArr4 = new Object[i9];
                                objArr4[r11] = c.FILE_IO_ERROR;
                                objArr4[c] = str;
                                String message2 = e5.getMessage();
                                objArr4[c2] = message2;
                                aVarC4.a(bVar4, dVar4, objArr4);
                                r2 = message2;
                                r4 = objArr4;
                                length = r11;
                            }
                        }
                    } catch (IllegalStateException e6) {
                        e = e6;
                        hVar10 = null;
                        i14 = 3;
                        z6 = false;
                        fileOutputStream2 = fileOutputStream;
                        hVar4 = hVar10;
                        i8 = i14;
                        r10 = z6;
                        com.unity3d.services.core.log.a.a("Illegal state", e);
                        this.c = r10;
                        com.unity3d.services.core.webview.a aVarC5 = com.unity3d.services.core.webview.a.c();
                        com.unity3d.services.core.webview.b bVar5 = com.unity3d.services.core.webview.b.CACHE;
                        d dVar5 = d.DOWNLOAD_ERROR;
                        Object[] objArr5 = new Object[i8];
                        objArr5[r10] = c.ILLEGAL_STATE;
                        objArr5[c] = str;
                        objArr5[c2] = e.getMessage();
                        aVarC5.a(bVar5, dVar5, objArr5);
                        this.a = hVar4;
                        r2 = hVar4;
                        r4 = i8;
                        length = r10;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r2 = hVar4;
                                r4 = i8;
                                length = r10;
                            } catch (Exception e7) {
                                com.unity3d.services.core.log.a.a("Error closing stream", e7);
                                com.unity3d.services.core.webview.a aVarC6 = com.unity3d.services.core.webview.a.c();
                                com.unity3d.services.core.webview.b bVar6 = com.unity3d.services.core.webview.b.CACHE;
                                d dVar6 = d.DOWNLOAD_ERROR;
                                Object[] objArr6 = new Object[i8];
                                objArr6[r10] = c.FILE_IO_ERROR;
                                objArr6[c] = str;
                                String message3 = e7.getMessage();
                                objArr6[c2] = message3;
                                aVarC6.a(bVar6, dVar6, objArr6);
                                r2 = message3;
                                r4 = objArr6;
                                length = r10;
                            }
                        }
                    } catch (MalformedURLException e8) {
                        e = e8;
                        hVar9 = null;
                        i13 = 3;
                        z5 = false;
                        fileOutputStream2 = fileOutputStream;
                        hVar3 = hVar9;
                        i7 = i13;
                        r9 = z5;
                        com.unity3d.services.core.log.a.a("Malformed URL", e);
                        this.c = r9;
                        com.unity3d.services.core.webview.a aVarC7 = com.unity3d.services.core.webview.a.c();
                        com.unity3d.services.core.webview.b bVar7 = com.unity3d.services.core.webview.b.CACHE;
                        d dVar7 = d.DOWNLOAD_ERROR;
                        Object[] objArr7 = new Object[i7];
                        objArr7[r9] = c.MALFORMED_URL;
                        objArr7[c] = str;
                        objArr7[c2] = e.getMessage();
                        aVarC7.a(bVar7, dVar7, objArr7);
                        this.a = hVar3;
                        r2 = hVar3;
                        r4 = i7;
                        length = r9;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r2 = hVar3;
                                r4 = i7;
                                length = r9;
                            } catch (Exception e9) {
                                com.unity3d.services.core.log.a.a("Error closing stream", e9);
                                com.unity3d.services.core.webview.a aVarC8 = com.unity3d.services.core.webview.a.c();
                                com.unity3d.services.core.webview.b bVar8 = com.unity3d.services.core.webview.b.CACHE;
                                d dVar8 = d.DOWNLOAD_ERROR;
                                Object[] objArr8 = new Object[i7];
                                objArr8[r9] = c.FILE_IO_ERROR;
                                objArr8[c] = str;
                                String message4 = e9.getMessage();
                                objArr8[c2] = message4;
                                aVarC8.a(bVar8, dVar8, objArr8);
                                r2 = message4;
                                r4 = objArr8;
                                length = r9;
                            }
                        }
                    } catch (IOException e10) {
                        e = e10;
                        hVar8 = null;
                        i12 = 3;
                        z4 = false;
                        fileOutputStream2 = fileOutputStream;
                        hVar2 = hVar8;
                        i6 = i12;
                        r8 = z4;
                        com.unity3d.services.core.log.a.a("Couldn't request stream", e);
                        this.c = r8;
                        com.unity3d.services.core.webview.a aVarC9 = com.unity3d.services.core.webview.a.c();
                        com.unity3d.services.core.webview.b bVar9 = com.unity3d.services.core.webview.b.CACHE;
                        d dVar9 = d.DOWNLOAD_ERROR;
                        Object[] objArr9 = new Object[i6];
                        objArr9[r8] = c.FILE_IO_ERROR;
                        objArr9[c] = str;
                        objArr9[c2] = e.getMessage();
                        aVarC9.a(bVar9, dVar9, objArr9);
                        this.a = hVar2;
                        r2 = hVar2;
                        r4 = i6;
                        length = r8;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r2 = hVar2;
                                r4 = i6;
                                length = r8;
                            } catch (Exception e11) {
                                com.unity3d.services.core.log.a.a("Error closing stream", e11);
                                com.unity3d.services.core.webview.a aVarC10 = com.unity3d.services.core.webview.a.c();
                                com.unity3d.services.core.webview.b bVar10 = com.unity3d.services.core.webview.b.CACHE;
                                d dVar10 = d.DOWNLOAD_ERROR;
                                Object[] objArr10 = new Object[i6];
                                objArr10[r8] = c.FILE_IO_ERROR;
                                objArr10[c] = str;
                                String message5 = e11.getMessage();
                                objArr10[c2] = message5;
                                aVarC10.a(bVar10, dVar10, objArr10);
                                r2 = message5;
                                r4 = objArr10;
                                length = r8;
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        hVar7 = null;
                        i11 = 3;
                        z3 = false;
                        fileOutputStream2 = fileOutputStream;
                        hVar = hVar7;
                        i5 = i11;
                        r7 = z3;
                        com.unity3d.services.core.log.a.a("Unknown error", e);
                        this.c = r7;
                        com.unity3d.services.core.webview.a aVarC11 = com.unity3d.services.core.webview.a.c();
                        com.unity3d.services.core.webview.b bVar11 = com.unity3d.services.core.webview.b.CACHE;
                        d dVar11 = d.DOWNLOAD_ERROR;
                        Object[] objArr11 = new Object[i5];
                        objArr11[r7] = c.UNKNOWN_ERROR;
                        objArr11[c] = str;
                        objArr11[c2] = e.getMessage();
                        aVarC11.a(bVar11, dVar11, objArr11);
                        this.a = hVar;
                        r2 = hVar;
                        r4 = i5;
                        length = r7;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r2 = hVar;
                                r4 = i5;
                                length = r7;
                            } catch (Exception e13) {
                                com.unity3d.services.core.log.a.a("Error closing stream", e13);
                                com.unity3d.services.core.webview.a aVarC12 = com.unity3d.services.core.webview.a.c();
                                com.unity3d.services.core.webview.b bVar12 = com.unity3d.services.core.webview.b.CACHE;
                                d dVar12 = d.DOWNLOAD_ERROR;
                                Object[] objArr12 = new Object[i5];
                                objArr12[r7] = c.FILE_IO_ERROR;
                                objArr12[c] = str;
                                String message6 = e13.getMessage();
                                objArr12[c2] = message6;
                                aVarC12.a(bVar12, dVar12, objArr12);
                                r2 = message6;
                                r4 = objArr12;
                                length = r7;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                        c3 = 3;
                        z2 = false;
                        th = th;
                        fileOutputStream2 = fileOutputStream;
                        r1 = obj;
                        i4 = c3;
                        r6 = z2;
                        this.a = r1;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                throw th;
                            } catch (Exception e14) {
                                com.unity3d.services.core.log.a.a("Error closing stream", e14);
                                com.unity3d.services.core.webview.a aVarC13 = com.unity3d.services.core.webview.a.c();
                                com.unity3d.services.core.webview.b bVar13 = com.unity3d.services.core.webview.b.CACHE;
                                d dVar13 = d.DOWNLOAD_ERROR;
                                Object[] objArr13 = new Object[i4];
                                objArr13[r6] = c.FILE_IO_ERROR;
                                objArr13[c] = str;
                                objArr13[c2] = e14.getMessage();
                                aVarC13.a(bVar13, dVar13, objArr13);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (com.unity3d.services.core.request.e e15) {
                    e = e15;
                    fileOutputStream = fileOutputStream3;
                    hVar12 = null;
                    i16 = 3;
                    z8 = false;
                    c = 1;
                    c2 = 2;
                } catch (FileNotFoundException e16) {
                    e = e16;
                    fileOutputStream = fileOutputStream3;
                    hVar11 = null;
                    i15 = 3;
                    z7 = false;
                    c = 1;
                    c2 = 2;
                } catch (IllegalStateException e17) {
                    e = e17;
                    fileOutputStream = fileOutputStream3;
                    hVar10 = null;
                    i14 = 3;
                    z6 = false;
                    c = 1;
                    c2 = 2;
                } catch (MalformedURLException e18) {
                    e = e18;
                    fileOutputStream = fileOutputStream3;
                    hVar9 = null;
                    i13 = 3;
                    z5 = false;
                    c = 1;
                    c2 = 2;
                } catch (IOException e19) {
                    e = e19;
                    fileOutputStream = fileOutputStream3;
                    hVar8 = null;
                    i12 = 3;
                    z4 = false;
                    c = 1;
                    c2 = 2;
                } catch (Exception e20) {
                    e = e20;
                    fileOutputStream = fileOutputStream3;
                    hVar7 = null;
                    i11 = 3;
                    z3 = false;
                    c = 1;
                    c2 = 2;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream3;
                    obj = null;
                    c3 = 3;
                    z2 = false;
                    c = 1;
                    c2 = 2;
                }
            } catch (Throwable th4) {
                th = th4;
                r1 = r2;
                i4 = r4;
                r6 = length;
            }
        } catch (com.unity3d.services.core.request.e e21) {
            e = e21;
            hVar6 = null;
            i10 = 3;
            r12 = 0;
            c = 1;
            c2 = 2;
            fileOutputStream2 = null;
        } catch (FileNotFoundException e22) {
            e = e22;
            hVar5 = null;
            i9 = 3;
            r11 = 0;
            c = 1;
            c2 = 2;
            fileOutputStream2 = null;
        } catch (IllegalStateException e23) {
            e = e23;
            hVar4 = null;
            i8 = 3;
            r10 = 0;
            c = 1;
            c2 = 2;
            fileOutputStream2 = null;
        } catch (MalformedURLException e24) {
            e = e24;
            hVar3 = null;
            i7 = 3;
            r9 = 0;
            c = 1;
            c2 = 2;
            fileOutputStream2 = null;
        } catch (IOException e25) {
            e = e25;
            hVar2 = null;
            i6 = 3;
            r8 = 0;
            c = 1;
            c2 = 2;
            fileOutputStream2 = null;
        } catch (Exception e26) {
            e = e26;
            hVar = null;
            i5 = 3;
            r7 = 0;
            c = 1;
            c2 = 2;
            fileOutputStream2 = null;
        } catch (Throwable th5) {
            r1 = 0;
            i4 = 3;
            r6 = 0;
            c = 1;
            c2 = 2;
            th = th5;
            fileOutputStream2 = null;
        }
    }

    private void a(long j, String str, File file, long j2, long j3, boolean z, int i, Map<String, List<String>> map) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            com.unity3d.services.core.log.a.b("Unity Ads cache: could not set file readable!");
        }
        if (!z) {
            com.unity3d.services.core.log.a.b("Unity Ads cache: File " + file.getName() + " of " + j2 + " bytes downloaded in " + jElapsedRealtime + "ms");
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.CACHE, d.DOWNLOAD_END, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(jElapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
            return;
        }
        com.unity3d.services.core.log.a.b("Unity Ads cache: downloading of " + str + " stopped");
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.CACHE, d.DOWNLOAD_STOPPED, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(jElapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
    }

    private h a(String str, int i, int i2, HashMap<String, List<String>> map) throws MalformedURLException {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        return new h(str, ShareTarget.METHOD_GET, map2, i, i2);
    }
}
