package com.unity3d.services.core.request;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: WebRequest.java */
/* JADX INFO: loaded from: classes2.dex */
public class h {
    private URL a;
    private String b;
    private byte[] c;
    private Map<String, List<String>> d;
    private Map<String, List<String>> e;
    private int f;
    private long g;
    private boolean h;
    private ByteArrayOutputStream i;
    private int j;
    private int k;
    private d l;

    /* JADX INFO: compiled from: WebRequest.java */
    public enum a {
        POST,
        GET,
        HEAD
    }

    public h(String str, String str2) throws MalformedURLException {
        this(str, str2, null);
    }

    private HttpURLConnection f() throws e, IllegalArgumentException {
        HttpURLConnection httpURLConnection;
        if (l().toString().startsWith("https://")) {
            try {
                httpURLConnection = (HttpsURLConnection) l().openConnection();
            } catch (IOException e) {
                throw new e("Open HTTPS connection: " + e.getMessage());
            }
        } else {
            if (!l().toString().startsWith("http://")) {
                throw new IllegalArgumentException("Invalid url-protocol in url: " + l().toString());
            }
            try {
                httpURLConnection = (HttpURLConnection) l().openConnection();
            } catch (IOException e2) {
                throw new e("Open HTTP connection: " + e2.getMessage());
            }
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(c());
        httpURLConnection.setReadTimeout(h());
        try {
            httpURLConnection.setRequestMethod(i());
            if (e() != null && e().size() > 0) {
                for (String str : e().keySet()) {
                    for (String str2 : e().get(str)) {
                        com.unity3d.services.core.log.a.b("Setting header: " + str + "=" + str2);
                        httpURLConnection.setRequestProperty(str, str2);
                    }
                }
            }
            return httpURLConnection;
        } catch (ProtocolException e3) {
            throw new e("Set Request Method: " + i() + ", " + e3.getMessage());
        }
    }

    public void a() {
        this.h = true;
    }

    public byte[] b() {
        return this.c;
    }

    public int c() {
        return this.j;
    }

    public long d() {
        return this.g;
    }

    public Map<String, List<String>> e() {
        return this.d;
    }

    public String g() {
        URL url = this.a;
        if (url != null) {
            return url.getQuery();
        }
        return null;
    }

    public int h() {
        return this.k;
    }

    public String i() {
        return this.b;
    }

    public int j() {
        return this.f;
    }

    public Map<String, List<String>> k() {
        return this.e;
    }

    public URL l() {
        return this.a;
    }

    public boolean m() {
        return this.h;
    }

    public String n() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.i = byteArrayOutputStream;
        a(byteArrayOutputStream);
        return this.i.toString("UTF-8");
    }

    public h(String str, String str2, Map<String, List<String>> map) throws MalformedURLException {
        this(str, str2, map, 30000, 30000);
    }

    public void a(String str) {
        this.c = str.getBytes(StandardCharsets.UTF_8);
    }

    public h(String str, String str2, Map<String, List<String>> map, int i, int i2) throws MalformedURLException {
        this.f = -1;
        this.g = -1L;
        this.h = false;
        this.a = new URL(str);
        this.b = str2;
        this.d = map;
        this.j = i;
        this.k = i2;
    }

    public void a(byte[] bArr) {
        this.c = bArr;
    }

    public void a(d dVar) {
        this.l = dVar;
    }

    public long a(OutputStream outputStream) throws Exception {
        InputStream errorStream;
        HttpURLConnection httpURLConnectionF = f();
        httpURLConnectionF.setDoInput(true);
        if (i().equals(a.POST.name())) {
            httpURLConnectionF.setDoOutput(true);
            OutputStream outputStream2 = null;
            try {
                try {
                    outputStream2 = httpURLConnectionF.getOutputStream();
                    if (b() == null) {
                        String strG = g();
                        if (strG != null) {
                            outputStream2.write(strG.getBytes(StandardCharsets.UTF_8));
                        }
                    } else {
                        outputStream2.write(b());
                    }
                    outputStream2.flush();
                    try {
                        outputStream2.close();
                    } catch (Exception e) {
                        com.unity3d.services.core.log.a.a("Error closing writer", e);
                        throw e;
                    }
                } catch (Throwable th) {
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (Exception e2) {
                            com.unity3d.services.core.log.a.a("Error closing writer", e2);
                            throw e2;
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                com.unity3d.services.core.log.a.a("Error while writing POST params", e3);
                throw new e("Error writing POST params: " + e3.getMessage());
            }
        }
        try {
            this.f = httpURLConnectionF.getResponseCode();
            long contentLength = httpURLConnectionF.getContentLength();
            this.g = contentLength;
            if (contentLength == -1) {
                this.g = httpURLConnectionF.getHeaderFieldInt("X-OrigLength", -1);
            }
            ByteArrayOutputStream byteArrayOutputStream = this.i;
            long j = 0;
            OutputStream outputStream3 = outputStream;
            if (byteArrayOutputStream != null && byteArrayOutputStream == outputStream3 && this.g > 0) {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream((int) this.g);
                this.i = byteArrayOutputStream2;
                outputStream3 = byteArrayOutputStream2;
            }
            if (httpURLConnectionF.getHeaderFields() != null) {
                this.e = httpURLConnectionF.getHeaderFields();
            }
            try {
                errorStream = httpURLConnectionF.getInputStream();
            } catch (IOException e4) {
                errorStream = httpURLConnectionF.getErrorStream();
                if (errorStream == null) {
                    throw new e("Can't open error stream: " + e4.getMessage());
                }
            }
            d dVar = this.l;
            if (dVar != null) {
                dVar.a(l().toString(), this.g, this.f, this.e);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(errorStream);
            byte[] bArr = new byte[4096];
            int i = 0;
            while (!m() && i != -1) {
                try {
                    i = bufferedInputStream.read(bArr);
                    if (i > 0) {
                        outputStream3.write(bArr, 0, i);
                        j += (long) i;
                        d dVar2 = this.l;
                        if (dVar2 != null) {
                            dVar2.a(l().toString(), j, this.g);
                        }
                    }
                } catch (IOException e5) {
                    throw new e("Network exception: " + e5.getMessage());
                } catch (Exception e6) {
                    throw new Exception("Unknown Exception: " + e6.getMessage());
                }
            }
            httpURLConnectionF.disconnect();
            outputStream3.flush();
            return j;
        } catch (IOException | RuntimeException e7) {
            throw new e("Response code: " + e7.getMessage());
        }
    }
}
