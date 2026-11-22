package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.common.net.HttpHeaders;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeac implements zzffh {
    protected final Context zza;
    protected final String zzb;
    protected final zzbuz zzc;

    public zzeac(Context context, String str, zzbuz zzbuzVar, int i) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbuzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffh
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzeab zza(zzeaa zzeaaVar) throws zzdve {
        int i;
        HttpURLConnection httpURLConnection;
        zzeab zzeabVar;
        zzeac zzeacVar = this;
        String str = zzeaaVar.zza;
        int i2 = zzeaaVar.zzb;
        Map map = zzeaaVar.zzc;
        byte[] bArr = zzeaaVar.zzd;
        String str2 = zzeaaVar.zze;
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        try {
            zzeab zzeabVar2 = new zzeab();
            zzcaa.zzi("SDK version: " + zzeacVar.zzb);
            zzcaa.zze("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap map2 = new HashMap();
            int i3 = 0;
            while (true) {
                httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    com.google.android.gms.ads.internal.util.zzs zzsVarZzp = com.google.android.gms.ads.internal.zzt.zzp();
                    Context context = zzeacVar.zza;
                    String str3 = zzeacVar.zzb;
                    zzeab zzeabVar3 = zzeabVar2;
                    i = 1;
                    try {
                        try {
                            zzsVarZzp.zzf(context, str3, false, httpURLConnection, false, i2);
                            for (Map.Entry entry : map.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, str2);
                            }
                            int length = bArr.length;
                            Closeable closeable = null;
                            if (length > 0) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setFixedLengthStreamingMode(length);
                                try {
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                    try {
                                        bufferedOutputStream.write(bArr);
                                        IOUtils.closeQuietly(bufferedOutputStream);
                                    } catch (Throwable th) {
                                        th = th;
                                        closeable = bufferedOutputStream;
                                        IOUtils.closeQuietly(closeable);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            zzbzz zzbzzVar = new zzbzz(null);
                            zzbzzVar.zzc(httpURLConnection, bArr);
                            int responseCode = httpURLConnection.getResponseCode();
                            for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                                String key = entry2.getKey();
                                List<String> value = entry2.getValue();
                                if (map2.containsKey(key)) {
                                    ((List) map2.get(key)).addAll(value);
                                } else {
                                    map2.put(key, new ArrayList(value));
                                }
                            }
                            zzbzzVar.zze(httpURLConnection, responseCode);
                            zzeabVar = zzeabVar3;
                            try {
                                zzeabVar.zza = responseCode;
                                zzeabVar.zzb = map2;
                                zzeabVar.zzc = "";
                                if (responseCode >= 200 && responseCode < 300) {
                                    try {
                                        InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                                        try {
                                            com.google.android.gms.ads.internal.zzt.zzp();
                                            String strZzK = com.google.android.gms.ads.internal.util.zzs.zzK(inputStreamReader);
                                            IOUtils.closeQuietly(inputStreamReader);
                                            zzbzzVar.zzg(strZzK);
                                            zzeabVar.zzc = strZzK;
                                            if (TextUtils.isEmpty(strZzK)) {
                                                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfo)).booleanValue()) {
                                                    throw new zzdve(3);
                                                }
                                            }
                                            zzeabVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime;
                                            break;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            closeable = inputStreamReader;
                                            IOUtils.closeQuietly(closeable);
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } else {
                                    if (responseCode < 300 || responseCode >= 400) {
                                        zzcaa.zzj("Received error HTTP response code: " + responseCode);
                                        throw new zzdve(1, "Received error HTTP response code: " + responseCode);
                                    }
                                    String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                                    if (TextUtils.isEmpty(headerField)) {
                                        zzcaa.zzj("No location header to follow redirect.");
                                        throw new zzdve(1, "No location header to follow redirect");
                                    }
                                    URL url2 = new URL(headerField);
                                    i3++;
                                    if (i3 > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeQ)).intValue()) {
                                        zzcaa.zzj("Too many redirects.");
                                        throw new zzdve(1, "Too many redirects");
                                    }
                                    try {
                                        httpURLConnection.disconnect();
                                        zzeacVar = this;
                                        url = url2;
                                        zzeabVar2 = zzeabVar;
                                    } catch (IOException e) {
                                        e = e;
                                        String strConcat = "Error while connecting to ad server: ".concat(String.valueOf(e.getMessage()));
                                        zzcaa.zzj(strConcat);
                                        throw new zzdve(i, strConcat, e);
                                    }
                                }
                            } catch (zzdve e2) {
                                e = e2;
                                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhW)).booleanValue()) {
                                    throw e;
                                }
                                zzeabVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime;
                            }
                        } catch (zzdve e3) {
                            e = e3;
                            zzeabVar = zzeabVar3;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (zzdve e4) {
                    e = e4;
                    zzeabVar = zzeabVar2;
                } catch (Throwable th6) {
                    th = th6;
                }
            }
            httpURLConnection.disconnect();
            return zzeabVar;
        } catch (IOException e5) {
            e = e5;
            i = 1;
        }
    }
}
