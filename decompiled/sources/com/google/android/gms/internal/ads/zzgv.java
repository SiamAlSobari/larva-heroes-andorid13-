package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgv extends zzgc implements zzhf {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzhe zzf;
    private final zzhe zzg;
    private zzgn zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzgv() {
        this(null, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, false, null, null, false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    private final HttpURLConnection zzk(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        StringBuilder sb;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzc);
        httpURLConnection.setReadTimeout(this.zzd);
        HashMap map2 = new HashMap();
        map2.putAll(this.zzf.zza());
        map2.putAll(this.zzg.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j != 0) {
            sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        } else if (j2 == -1) {
            string = null;
        } else {
            j = 0;
            sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.RANGE, string);
        }
        String str = this.zze;
        if (str != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str);
        }
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i2 = zzgn.zzj;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzgn zzgnVar) throws zzhb {
        if (str == null) {
            throw new zzhb("Null location redirect", zzgnVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzhb("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzgnVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE, 1);
            }
            if (this.zzb || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzhb("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", zzgnVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE, 1);
        } catch (MalformedURLException e) {
            throw new zzhb(e, zzgnVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzes.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:19:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws zzhb {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            if (j != -1) {
                long j2 = j - this.zzn;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.zzj;
                    int i4 = zzfk.zza;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.zzn += (long) i3;
                        zzg(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.zzj;
                int i5 = zzfk.zza;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 == -1) {
                    this.zzn += (long) i3;
                    zzg(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            zzgn zzgnVar = this.zzh;
            int i6 = zzfk.zza;
            throw zzhb.zza(e, zzgnVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws zzhb {
        int i;
        HttpURLConnection httpURLConnectionZzk;
        byte[] byteArray;
        long j;
        this.zzh = zzgnVar;
        this.zzn = 0L;
        this.zzm = 0L;
        zzi(zzgnVar);
        try {
            URL url = new URL(zzgnVar.zza.toString());
            int i2 = zzgnVar.zzb;
            byte[] bArr = zzgnVar.zzc;
            long j2 = zzgnVar.zzf;
            long j3 = zzgnVar.zzg;
            boolean zZza = zzgnVar.zza(1);
            if (this.zzb) {
                URL urlZzl = url;
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (i3 > 20) {
                        i = 1;
                        throw new zzhb(new NoRouteToHostException("Too many redirects: " + i4), zzgnVar, GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE, 1);
                    }
                    long j4 = j3;
                    long j5 = j2;
                    URL url2 = urlZzl;
                    HttpURLConnection httpURLConnectionZzk2 = zzk(urlZzl, 1, null, j2, j3, zZza, false, zzgnVar.zzd);
                    int responseCode = httpURLConnectionZzk2.getResponseCode();
                    String headerField = httpURLConnectionZzk2.getHeaderField(HttpHeaders.LOCATION);
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        httpURLConnectionZzk = httpURLConnectionZzk2;
                        break;
                    }
                    i = 1;
                    try {
                        httpURLConnectionZzk2.disconnect();
                        urlZzl = zzl(url2, headerField, zzgnVar);
                        i3 = i4;
                        j3 = j4;
                        j2 = j5;
                    } catch (IOException e) {
                        e = e;
                    }
                    e = e;
                    zzm();
                    throw zzhb.zza(e, zzgnVar, i);
                }
            }
            httpURLConnectionZzk = zzk(url, 1, null, j2, j3, zZza, true, zzgnVar.zzd);
            try {
                this.zzi = httpURLConnectionZzk;
                this.zzl = httpURLConnectionZzk.getResponseCode();
                String responseMessage = httpURLConnectionZzk.getResponseMessage();
                int i5 = this.zzl;
                if (i5 < 200 || i5 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
                    if (this.zzl == 416) {
                        if (zzgnVar.zzf == zzhg.zzb(httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                            this.zzk = true;
                            zzj(zzgnVar);
                            long j6 = zzgnVar.zzg;
                            if (j6 != -1) {
                                return j6;
                            }
                            return 0L;
                        }
                    }
                    InputStream errorStream = httpURLConnectionZzk.getErrorStream();
                    try {
                        if (errorStream != null) {
                            int i6 = zzfk.zza;
                            byte[] bArr2 = new byte[4096];
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            while (true) {
                                int i7 = errorStream.read(bArr2);
                                if (i7 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i7);
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                        } else {
                            byteArray = zzfk.zzf;
                        }
                    } catch (IOException unused) {
                        byteArray = zzfk.zzf;
                    }
                    zzm();
                    throw new zzhd(this.zzl, responseMessage, this.zzl == 416 ? new zzgj(2008) : null, headerFields, zzgnVar, byteArray);
                }
                httpURLConnectionZzk.getContentType();
                if (this.zzl == 200) {
                    j = zzgnVar.zzf;
                    if (j == 0) {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_ENCODING));
                if (zEqualsIgnoreCase) {
                    this.zzm = zzgnVar.zzg;
                } else {
                    long j7 = zzgnVar.zzg;
                    if (j7 != -1) {
                        this.zzm = j7;
                    } else {
                        long jZza = zzhg.zza(httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_LENGTH), httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_RANGE));
                        this.zzm = jZza != -1 ? jZza - j : -1L;
                    }
                }
                try {
                    this.zzj = httpURLConnectionZzk.getInputStream();
                    if (zEqualsIgnoreCase) {
                        this.zzj = new GZIPInputStream(this.zzj);
                    }
                    this.zzk = true;
                    zzj(zzgnVar);
                    if (j != 0) {
                        try {
                            byte[] bArr3 = new byte[4096];
                            while (j > 0) {
                                int iMin = (int) Math.min(j, 4096L);
                                InputStream inputStream = this.zzj;
                                int i8 = zzfk.zza;
                                int i9 = inputStream.read(bArr3, 0, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzhb(new InterruptedIOException(), zzgnVar, 2000, 1);
                                }
                                if (i9 == -1) {
                                    throw new zzhb(zzgnVar, 2008, 1);
                                }
                                j -= (long) i9;
                                zzg(i9);
                            }
                        } catch (IOException e2) {
                            zzm();
                            if (e2 instanceof zzhb) {
                                throw ((zzhb) e2);
                            }
                            throw new zzhb(e2, zzgnVar, 2000, 1);
                        }
                    }
                    return this.zzm;
                } catch (IOException e3) {
                    zzm();
                    throw new zzhb(e3, zzgnVar, 2000, 1);
                }
            } catch (IOException e4) {
                e = e4;
                i = 1;
                zzm();
                throw zzhb.zza(e, zzgnVar, i);
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008c */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[Catch: Exception -> 0x006b, all -> 0x008c, TRY_LEAVE, TryCatch #0 {Exception -> 0x006b, blocks: (B:15:0x0020, B:17:0x0028, B:23:0x0037, B:25:0x0047, B:27:0x004f, B:29:0x005a), top: B:45:0x0020 }] */
    @Override // com.google.android.gms.internal.ads.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd() throws zzhb {
        String name;
        InputStream inputStream = this.zzj;
        if (inputStream != null) {
            long j = this.zzm;
            long j2 = j == -1 ? -1L : j - this.zzn;
            HttpURLConnection httpURLConnection = this.zzi;
            if (httpURLConnection != null) {
                int i = zzfk.zza;
                if (zzfk.zza <= 20) {
                    try {
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        if (j2 == -1) {
                            if (inputStream2.read() != -1) {
                                name = inputStream2.getClass().getName();
                                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                    Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                    superclass.getClass();
                                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream2, new Object[0]);
                                }
                            }
                            this.zzj = null;
                            zzm();
                            if (this.zzk) {
                                this.zzk = false;
                                zzh();
                            }
                            throw th;
                        }
                        if (j2 > 2048) {
                            name = inputStream2.getClass().getName();
                            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name)) {
                                Class<? super Object> superclass2 = inputStream2.getClass().getSuperclass();
                                superclass2.getClass();
                                Method declaredMethod2 = superclass2.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod2.setAccessible(true);
                                declaredMethod2.invoke(inputStream2, new Object[0]);
                            } else {
                                Class<? super Object> superclass3 = inputStream2.getClass().getSuperclass();
                                superclass3.getClass();
                                Method declaredMethod3 = superclass3.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod3.setAccessible(true);
                                declaredMethod3.invoke(inputStream2, new Object[0]);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                zzgn zzgnVar = this.zzh;
                int i2 = zzfk.zza;
                throw new zzhb(e, zzgnVar, 2000, 3);
            }
        }
        this.zzj = null;
        zzm();
        if (this.zzk) {
            this.zzk = false;
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgc, com.google.android.gms.internal.ads.zzgi
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? zzfug.zzd() : new zzgt(httpURLConnection.getHeaderFields());
    }

    private zzgv(String str, int i, int i2, boolean z, zzhe zzheVar, zzfrj zzfrjVar, boolean z2) {
        super(true);
        this.zze = str;
        this.zzc = i;
        this.zzd = i2;
        this.zzb = z;
        this.zzf = zzheVar;
        this.zzg = new zzhe();
    }
}
