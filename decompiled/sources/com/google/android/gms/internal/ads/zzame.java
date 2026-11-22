package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzame implements zzali {
    protected final zzamg zza;

    @Deprecated
    protected final zzamd zzb;
    private final zzamd zzc;

    public zzame(zzamd zzamdVar) {
        zzamg zzamgVar = new zzamg(4096);
        this.zzc = zzamdVar;
        this.zzb = zzamdVar;
        this.zza = zzamgVar;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:145:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x02db  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:164:0x0336  */
    /* JADX WARN: Code duplicated, block: B:176:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x038f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0389 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzali
    public zzall zza(zzalp zzalpVar) throws Throwable {
        zzamn zzamnVar;
        byte[] bArr;
        int iZzb;
        zzamr zzamrVar;
        zzall zzallVar;
        zzamr zzamrVar2;
        int iZzb2;
        Map mapEmptyMap;
        byte[] byteArray;
        byte[] bArrZzb;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            boolean z = true;
            try {
                zzaky zzakyVarZzd = zzalpVar.zzd();
                if (zzakyVarZzd == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    String str = zzakyVarZzd.zzb;
                    if (str != null) {
                        map.put(HttpHeaders.IF_NONE_MATCH, str);
                    }
                    long j = zzakyVarZzd.zzd;
                    if (j > 0) {
                        map.put(HttpHeaders.IF_MODIFIED_SINCE, zzamm.zzc(j));
                    }
                    mapEmptyMap = map;
                }
                String strZzk = zzalpVar.zzk();
                HashMap map2 = new HashMap();
                map2.putAll(mapEmptyMap);
                map2.putAll(zzalpVar.zzl());
                URL url = new URL(strZzk);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int iZzb3 = zzalpVar.zzb();
                httpURLConnection.setConnectTimeout(iZzb3);
                httpURLConnection.setReadTimeout(iZzb3);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str2 : map2.keySet()) {
                        httpURLConnection.setRequestProperty(str2, (String) map2.get(str2));
                    }
                    if (zzalpVar.zza() != 0) {
                        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                        byte[] bArrZzx = zzalpVar.zzx();
                        if (bArrZzx != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey(HttpHeaders.CONTENT_TYPE)) {
                                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(bArrZzx);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (!z) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    }
                    zzalpVar.zza();
                    if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                        zzamnVar = new zzamn(responseCode, zzamp.zza(httpURLConnection.getHeaderFields()), -1, null);
                        httpURLConnection.disconnect();
                    } else {
                        try {
                            zzamnVar = new zzamn(responseCode, zzamp.zza(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzamo(httpURLConnection));
                        } catch (Throwable th2) {
                            th = th2;
                            if (!z) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (IOException e) {
                                    e = e;
                                    zzamnVar = null;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                        zzamrVar = new zzamr("socket", new zzalx(), null);
                                    } else {
                                        if (!(e instanceof MalformedURLException)) {
                                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzalpVar.zzk())), e);
                                        }
                                        if (zzamnVar != null) {
                                            throw new zzalm(e);
                                        }
                                        iZzb = zzamnVar.zzb();
                                        zzamb.zzb("Unexpected response code %d for %s", Integer.valueOf(iZzb), zzalpVar.zzk());
                                        if (bArr != null) {
                                            zzallVar = new zzall(iZzb, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzamnVar.zzd());
                                            if (iZzb == 401) {
                                            }
                                            zzamrVar = new zzamr("auth", new zzakx(zzallVar), null);
                                        } else {
                                            zzamrVar = new zzamr("network", new zzalk(), null);
                                        }
                                    }
                                    zzamrVar2 = zzamrVar;
                                    zzald zzaldVarZzy = zzalpVar.zzy();
                                    iZzb2 = zzalpVar.zzb();
                                    try {
                                        zzaldVarZzy.zzc(zzamrVar2.zzb);
                                        zzalpVar.zzm(String.format("%s-retry [timeout=%s]", zzamrVar2.zza, Integer.valueOf(iZzb2)));
                                    } catch (zzaly e2) {
                                        zzalpVar.zzm(String.format("%s-timeout-giveup [timeout=%s]", zzamrVar2.zza, Integer.valueOf(iZzb2)));
                                        throw e2;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        int iZzb4 = zzamnVar.zzb();
                        List listZzd = zzamnVar.zzd();
                        if (iZzb4 == 304) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            zzaky zzakyVarZzd2 = zzalpVar.zzd();
                            if (zzakyVarZzd2 == null) {
                                return new zzall(304, (byte[]) null, true, jElapsedRealtime2, listZzd);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!listZzd.isEmpty()) {
                                Iterator it = listZzd.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((zzalh) it.next()).zza());
                                }
                            }
                            ArrayList arrayList = new ArrayList(listZzd);
                            List list = zzakyVarZzd2.zzh;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (zzalh zzalhVar : zzakyVarZzd2.zzh) {
                                        if (!treeSet.contains(zzalhVar.zza())) {
                                            arrayList.add(zzalhVar);
                                        }
                                    }
                                }
                            } else if (!zzakyVarZzd2.zzg.isEmpty()) {
                                for (Map.Entry entry : zzakyVarZzd2.zzg.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new zzalh((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new zzall(304, zzakyVarZzd2.zza, true, jElapsedRealtime2, (List) arrayList);
                        }
                        InputStream inputStreamZzc = zzamnVar.zzc();
                        if (inputStreamZzc != null) {
                            int iZza = zzamnVar.zza();
                            try {
                                zzamg zzamgVar = this.zza;
                                zzams zzamsVar = new zzams(zzamgVar, iZza);
                                try {
                                    bArrZzb = zzamgVar.zzb(1024);
                                    while (true) {
                                        try {
                                            int i = inputStreamZzc.read(bArrZzb);
                                            if (i == -1) {
                                                break;
                                            }
                                            zzamsVar.write(bArrZzb, 0, i);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                inputStreamZzc.close();
                                            } catch (IOException unused) {
                                                zzamb.zzd("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            zzamgVar.zza(bArrZzb);
                                            zzamsVar.close();
                                            throw th;
                                        }
                                        if (e instanceof SocketTimeoutException) {
                                            zzamrVar = new zzamr("socket", new zzalx(), null);
                                        } else {
                                            if (!(e instanceof MalformedURLException)) {
                                                throw new RuntimeException("Bad URL ".concat(String.valueOf(zzalpVar.zzk())), e);
                                            }
                                            if (zzamnVar != null) {
                                                throw new zzalm(e);
                                            }
                                            iZzb = zzamnVar.zzb();
                                            zzamb.zzb("Unexpected response code %d for %s", Integer.valueOf(iZzb), zzalpVar.zzk());
                                            if (bArr != null) {
                                                zzallVar = new zzall(iZzb, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzamnVar.zzd());
                                                if (iZzb == 401 && iZzb != 403) {
                                                    if (iZzb < 400 || iZzb > 499) {
                                                        throw new zzalw(zzallVar);
                                                    }
                                                    throw new zzalc(zzallVar);
                                                }
                                                zzamrVar = new zzamr("auth", new zzakx(zzallVar), null);
                                            } else {
                                                zzamrVar = new zzamr("network", new zzalk(), null);
                                            }
                                        }
                                        zzamrVar2 = zzamrVar;
                                        zzald zzaldVarZzy2 = zzalpVar.zzy();
                                        iZzb2 = zzalpVar.zzb();
                                        zzaldVarZzy2.zzc(zzamrVar2.zzb);
                                        zzalpVar.zzm(String.format("%s-retry [timeout=%s]", zzamrVar2.zza, Integer.valueOf(iZzb2)));
                                    }
                                    byteArray = zzamsVar.toByteArray();
                                    try {
                                        inputStreamZzc.close();
                                    } catch (IOException unused2) {
                                        zzamb.zzd("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzamgVar.zza(bArrZzb);
                                    zzamsVar.close();
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArrZzb = null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                bArr = null;
                            }
                        } else {
                            byteArray = new byte[0];
                        }
                        try {
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (zzamb.zzb || jElapsedRealtime3 > 3000) {
                                Object[] objArr = new Object[5];
                                objArr[0] = zzalpVar;
                                objArr[1] = Long.valueOf(jElapsedRealtime3);
                                objArr[2] = byteArray != null ? Integer.valueOf(byteArray.length) : "null";
                                objArr[3] = Integer.valueOf(iZzb4);
                                objArr[4] = Integer.valueOf(zzalpVar.zzy().zza());
                                zzamb.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                            }
                            if (iZzb4 < 200 || iZzb4 > 299) {
                                throw new IOException();
                            }
                            return new zzall(iZzb4, byteArray, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzd);
                        } catch (IOException e4) {
                            e = e4;
                            bArr = byteArray;
                        }
                    } catch (IOException e5) {
                        e = e5;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e6) {
                e = e6;
            }
        }
    }
}
