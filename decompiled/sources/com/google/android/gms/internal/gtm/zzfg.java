package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.impl.Scheduler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.text.Typography;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfg extends zzbu {
    private static final byte[] zza = "\n".getBytes();
    private final String zzb;
    private final zzfq zzc;

    zzfg(zzbx zzbxVar) {
        super(zzbxVar);
        this.zzb = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", zzbv.zza, Build.VERSION.RELEASE, zzfu.zzd(Locale.getDefault()), Build.MODEL, Build.ID);
        this.zzc = new zzfq(zzbxVar.zzr());
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[SYNTHETIC] */
    private final int zzg(URL url, byte[] bArr, int i) throws Throwable {
        HttpURLConnection httpURLConnectionZzb;
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        zzG("POST bytes, url", Integer.valueOf(length), url);
        if (zzU()) {
            zzO("Post payload\n", new String(bArr));
        }
        OutputStream outputStream = null;
        try {
            httpURLConnectionZzb = zzb(url);
            try {
                try {
                    httpURLConnectionZzb.setDoOutput(true);
                    httpURLConnectionZzb.setFixedLengthStreamingMode(length);
                    httpURLConnectionZzb.connect();
                    outputStream = httpURLConnectionZzb.getOutputStream();
                    outputStream.write(bArr);
                    zzk(httpURLConnectionZzb);
                    int responseCode = httpURLConnectionZzb.getResponseCode();
                    if (responseCode == 200) {
                        zzs().zzi();
                        responseCode = Scheduler.MAX_GREEDY_SCHEDULER_LIMIT;
                    }
                    zzF("POST status", Integer.valueOf(responseCode));
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            zzJ("Error closing http post connection output stream", e);
                        }
                    }
                    if (httpURLConnectionZzb != null) {
                        httpURLConnectionZzb.disconnect();
                    }
                    return responseCode;
                } catch (IOException e2) {
                    e = e2;
                    zzR("Network POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e3) {
                            zzJ("Error closing http post connection output stream", e3);
                        }
                    }
                    if (httpURLConnectionZzb == null) {
                        return 0;
                    }
                    httpURLConnectionZzb.disconnect();
                    return 0;
                }
            } catch (Throwable th) {
                th = th;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e4) {
                        zzJ("Error closing http post connection output stream", e4);
                    }
                }
                if (httpURLConnectionZzb != null) {
                    throw th;
                }
                httpURLConnectionZzb.disconnect();
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnectionZzb = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnectionZzb = null;
            if (outputStream != null) {
                outputStream.close();
            }
            if (httpURLConnectionZzb != null) {
                throw th;
            }
            httpURLConnectionZzb.disconnect();
            throw th;
        }
    }

    private final URL zzh() {
        zzw();
        String strZzi = zzcv.zzi();
        zzw();
        try {
            return new URL(strZzi.concat((String) zzew.zzt.zzb()));
        } catch (MalformedURLException e) {
            zzJ("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzi(zzez zzezVar) {
        String strConcat;
        if (zzezVar.zzh()) {
            zzw();
            String strZzi = zzcv.zzi();
            zzw();
            strConcat = strZzi.concat(zzcv.zzj());
        } else {
            zzw();
            String strZzk = zzcv.zzk();
            zzw();
            strConcat = strZzk.concat(zzcv.zzj());
        }
        try {
            return new URL(strConcat);
        } catch (MalformedURLException e) {
            zzJ("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzj(zzez zzezVar, String str) {
        String str2;
        if (zzezVar.zzh()) {
            zzw();
            String strZzi = zzcv.zzi();
            zzw();
            str2 = strZzi + zzcv.zzj() + "?" + str;
        } else {
            zzw();
            String strZzk = zzcv.zzk();
            zzw();
            str2 = strZzk + zzcv.zzj() + "?" + str;
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            zzJ("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final void zzk(HttpURLConnection httpURLConnection) throws Throwable {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                do {
                } while (inputStream.read(new byte[1024]) > 0);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        zzJ("Error closing http connection input stream", e);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        zzJ("Error closing http connection input stream", e2);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private static final void zzl(StringBuilder sb, String str, String str2) throws UnsupportedEncodingException {
        if (sb.length() != 0) {
            sb.append(Typography.amp);
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    final String zza(zzez zzezVar, boolean z) {
        Preconditions.checkNotNull(zzezVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : zzezVar.zzg().entrySet()) {
                String str = (String) entry.getKey();
                if (!"ht".equals(str) && !"qt".equals(str) && !"AppUID".equals(str) && !"z".equals(str) && !"_gmsv".equals(str)) {
                    zzl(sb, str, (String) entry.getValue());
                }
            }
            zzl(sb, "ht", String.valueOf(zzezVar.zzd()));
            zzl(sb, "qt", String.valueOf(zzC().currentTimeMillis() - zzezVar.zzd()));
            zzw();
            if (z) {
                long jZzc = zzezVar.zzc();
                zzl(sb, "z", jZzc != 0 ? String.valueOf(jZzc) : String.valueOf(zzezVar.zzb()));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            zzJ("Failed to encode name or value", e);
            return null;
        }
    }

    final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        zzw();
        httpURLConnection.setConnectTimeout(((Integer) zzew.zzE.zzb()).intValue());
        zzw();
        httpURLConnection.setReadTimeout(((Integer) zzew.zzF.zzb()).intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.zzb);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:101:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:103:0x020e  */
    /* JADX WARN: Code duplicated, block: B:141:0x02be  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0321 A[EDGE_INSN: B:183:0x0321->B:156:0x0321 BREAK  A[LOOP:1: B:107:0x022a->B:187:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[LOOP:1: B:107:0x022a->B:187:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01db  */
    public final List zzc(List list) throws Throwable {
        boolean z;
        boolean z2;
        HttpURLConnection httpURLConnection;
        int size;
        int iZzg;
        Integer numValueOf;
        Throwable th;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnectionZzb;
        Throwable th2;
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        Preconditions.checkNotNull(list);
        if (zzw().zza().isEmpty()) {
            z = false;
            z2 = false;
        } else {
            zzfq zzfqVar = this.zzc;
            zzw();
            if (zzfqVar.zzc(((long) ((Integer) zzew.zzC.zzb()).intValue()) * 1000)) {
                zzw();
                String str = (String) zzew.zzv.zzb();
                z = "BATCH_BY_SESSION".equalsIgnoreCase(str) || "BATCH_BY_TIME".equalsIgnoreCase(str) || "BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(str) || "BATCH_BY_COUNT".equalsIgnoreCase(str) || "BATCH_BY_SIZE".equalsIgnoreCase(str);
                zzw();
                if (true == "GZIP".equalsIgnoreCase((String) zzew.zzw.zzb())) {
                    z2 = true;
                }
            } else {
                z = false;
            }
            z2 = false;
        }
        if (!z) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzez zzezVar = (zzez) it.next();
                Preconditions.checkNotNull(zzezVar);
                String strZza = zza(zzezVar, !zzezVar.zzh());
                if (strZza == null) {
                    zzz().zzb(zzezVar, "Error formatting hit for upload");
                } else {
                    zzw();
                    if (strZza.length() <= ((Integer) zzew.zzu.zzb()).intValue()) {
                        URL urlZzj = zzj(zzezVar, strZza);
                        if (urlZzj == null) {
                            zzI("Failed to build collect GET endpoint url");
                            break;
                        }
                        Preconditions.checkNotNull(urlZzj);
                        zzF("GET request", urlZzj);
                        try {
                            HttpURLConnection httpURLConnectionZzb2 = zzb(urlZzj);
                            try {
                                httpURLConnectionZzb2.connect();
                                zzk(httpURLConnectionZzb2);
                                int responseCode = httpURLConnectionZzb2.getResponseCode();
                                if (responseCode == 200) {
                                    zzs().zzi();
                                    responseCode = Scheduler.MAX_GREEDY_SCHEDULER_LIMIT;
                                }
                                zzF("GET status", Integer.valueOf(responseCode));
                                if (httpURLConnectionZzb2 != null) {
                                    httpURLConnectionZzb2.disconnect();
                                }
                                if (responseCode != 200) {
                                    break;
                                }
                            } catch (IOException e) {
                                e = e;
                                httpURLConnection = httpURLConnectionZzb2;
                                try {
                                    zzR("Network GET connection error", e);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                httpURLConnection = httpURLConnectionZzb2;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            httpURLConnection = null;
                        } catch (Throwable th5) {
                            th = th5;
                            httpURLConnection = null;
                        }
                    } else {
                        String strZza2 = zza(zzezVar, false);
                        if (strZza2 != null) {
                            byte[] bytes = strZza2.getBytes();
                            int length = bytes.length;
                            zzw();
                            if (length <= ((Integer) zzew.zzz.zzb()).intValue()) {
                                URL urlZzi = zzi(zzezVar);
                                if (urlZzi != null) {
                                    if (zzg(urlZzi, bytes, zzezVar.zza()) != 200) {
                                        break;
                                    }
                                } else {
                                    zzI("Failed to build collect POST endpoint url");
                                    break;
                                }
                            } else {
                                zzz().zzb(zzezVar, "Hit payload exceeds size limit");
                            }
                        } else {
                            zzz().zzb(zzezVar, "Error formatting hit for POST upload");
                        }
                        arrayList.add(Long.valueOf(zzezVar.zzb()));
                        size = arrayList.size();
                        zzw();
                        if (size >= zzcv.zzh()) {
                            break;
                        }
                    }
                }
                arrayList.add(Long.valueOf(zzezVar.zzb()));
                size = arrayList.size();
                zzw();
                if (size >= zzcv.zzh()) {
                    break;
                    break;
                }
            }
            return arrayList;
        }
        Preconditions.checkArgument(!list.isEmpty());
        zzP("Uploading batched hits. compression, count", Boolean.valueOf(z2), Integer.valueOf(list.size()));
        zzff zzffVar = new zzff(this);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        int iZza = 0;
        while (it2.hasNext()) {
            zzez zzezVar2 = (zzez) it2.next();
            if (!zzffVar.zzb(zzezVar2)) {
                break;
            }
            arrayList2.add(Long.valueOf(zzezVar2.zzb()));
            if (iZza <= 0) {
                iZza = zzezVar2.zza();
            }
        }
        if (zzffVar.zza() == 0) {
            return arrayList2;
        }
        URL urlZzh = zzh();
        if (urlZzh == null) {
            zzI("Failed to build batching endpoint url");
            return Collections.emptyList();
        }
        if (z2) {
            byte[] bArrZzc = zzffVar.zzc();
            Preconditions.checkNotNull(urlZzh);
            Preconditions.checkNotNull(bArrZzc);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArrZzc);
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length2 = byteArray.length;
                Integer numValueOf2 = Integer.valueOf(length2);
                int length3 = bArrZzc.length;
                zzH("POST compressed size, ratio %, url", numValueOf2, Long.valueOf((((long) length2) * 100) / ((long) length3)), urlZzh);
                if (length2 > length3) {
                    zzS("Compressed payload is larger then uncompressed. compressed, uncompressed", numValueOf2, Integer.valueOf(length3));
                }
                if (zzU()) {
                    zzO("Post payload", "\n" + new String(bArrZzc));
                }
                httpURLConnectionZzb = zzb(urlZzh);
                try {
                    httpURLConnectionZzb.setDoOutput(true);
                    httpURLConnectionZzb.addRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
                    httpURLConnectionZzb.setFixedLengthStreamingMode(length2);
                    httpURLConnectionZzb.connect();
                    OutputStream outputStream2 = httpURLConnectionZzb.getOutputStream();
                    try {
                        outputStream2.write(byteArray);
                        outputStream2.close();
                        zzk(httpURLConnectionZzb);
                        int responseCode2 = httpURLConnectionZzb.getResponseCode();
                        if (responseCode2 == 200) {
                            zzs().zzi();
                            responseCode2 = Scheduler.MAX_GREEDY_SCHEDULER_LIMIT;
                        }
                        zzF("POST status", Integer.valueOf(responseCode2));
                        if (httpURLConnectionZzb != null) {
                            httpURLConnectionZzb.disconnect();
                        }
                        iZzg = responseCode2;
                    } catch (IOException e3) {
                        e = e3;
                        outputStream = outputStream2;
                        try {
                            zzR("Network compressed POST connection error", e);
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e4) {
                                    zzJ("Error closing http compressed post connection output stream", e4);
                                }
                            }
                            if (httpURLConnectionZzb != null) {
                                httpURLConnectionZzb.disconnect();
                            }
                            iZzg = 0;
                        } catch (Throwable th6) {
                            th2 = th6;
                            httpURLConnection2 = httpURLConnectionZzb;
                            th = th2;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e5) {
                                    zzJ("Error closing http compressed post connection output stream", e5);
                                }
                            }
                            if (httpURLConnection2 == null) {
                                throw th;
                            }
                            httpURLConnection2.disconnect();
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        httpURLConnection2 = httpURLConnectionZzb;
                        outputStream = outputStream2;
                        th = th2;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection2 == null) {
                            throw th;
                        }
                        httpURLConnection2.disconnect();
                        throw th;
                    }
                } catch (IOException e6) {
                    e = e6;
                    outputStream = null;
                    zzR("Network compressed POST connection error", e);
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnectionZzb != null) {
                        httpURLConnectionZzb.disconnect();
                    }
                    iZzg = 0;
                    if (iZzg == 200) {
                        zzO("Batched upload completed. Hits batched", Integer.valueOf(zzffVar.zza()));
                        return arrayList2;
                    }
                    numValueOf = Integer.valueOf(iZzg);
                    zzO("Network error uploading hits. status code", numValueOf);
                    if (zzw().zza().contains(numValueOf)) {
                        zzQ("Server instructed the client to stop batching");
                        this.zzc.zzb();
                    }
                    return Collections.emptyList();
                } catch (Throwable th8) {
                    th2 = th8;
                    httpURLConnection2 = httpURLConnectionZzb;
                    outputStream = null;
                }
            } catch (IOException e7) {
                e = e7;
                httpURLConnectionZzb = null;
            } catch (Throwable th9) {
                th = th9;
                outputStream = null;
                httpURLConnection2 = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection2 == null) {
                    throw th;
                }
                httpURLConnection2.disconnect();
                throw th;
            }
        } else {
            iZzg = zzg(urlZzh, zzffVar.zzc(), iZza);
        }
        if (iZzg == 200) {
            zzO("Batched upload completed. Hits batched", Integer.valueOf(zzffVar.zza()));
            return arrayList2;
        }
        numValueOf = Integer.valueOf(iZzg);
        zzO("Network error uploading hits. status code", numValueOf);
        if (zzw().zza().contains(numValueOf)) {
            zzQ("Server instructed the client to stop batching");
            this.zzc.zzb();
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
        zzO("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo activeNetworkInfo;
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        try {
            activeNetworkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzN("No network connectivity");
        return false;
    }
}
