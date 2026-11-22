package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfi implements zzbj {
    private final String zza;
    private final Context zzb;
    private final zzfh zzc;
    private final zzfg zzd = new zzfg();

    zzfi(Context context, zzfh zzfhVar) {
        this.zzb = context.getApplicationContext();
        this.zzc = zzfhVar;
        String str = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        String string = null;
        if (locale != null && locale.getLanguage() != null && locale.getLanguage().length() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage().toLowerCase());
            if (locale.getCountry() != null && locale.getCountry().length() != 0) {
                sb.append("-");
                sb.append(locale.getCountry().toLowerCase());
            }
            string = sb.toString();
        }
        this.zza = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleTagManager", "4.00", str, string, Build.MODEL, Build.ID);
    }

    static final URL zzc(zzbz zzbzVar) {
        try {
            return new URL(zzbzVar.zzc());
        } catch (MalformedURLException unused) {
            Log.e("GoogleTagManager", "Error trying to parse the GTM url.");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.tagmanager.zzbj
    public final void zza(List list) throws Throwable {
        boolean z;
        IOException e;
        int iMin = Math.min(list.size(), 40);
        boolean z2 = true;
        for (int i = 0; i < iMin; i++) {
            zzbz zzbzVar = (zzbz) list.get(i);
            URL urlZzc = zzc(zzbzVar);
            if (urlZzc == null) {
                Log.w("GoogleTagManager", "No destination: discarding hit.");
                ((zzdt) this.zzc).zza.zzl(zzbzVar.zzb());
                zzdg.zzb.zzd("Permanent failure dispatching hitId: " + zzbzVar.zzb());
            } else {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) urlZzc.openConnection();
                    InputStream inputStream = null;
                    if (z2) {
                        try {
                            Context context = this.zzb;
                            Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
                            intent.addCategory(context.getPackageName());
                            intent.putExtra(zzdj.zza, true);
                            context.sendBroadcast(intent);
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e2) {
                                    e = e2;
                                    Log.w("GoogleTagManager", "Exception sending hit: ".concat(String.valueOf(e.getClass().getSimpleName())));
                                    Log.w("GoogleTagManager", e.getMessage());
                                    this.zzc.zza(zzbzVar);
                                    z2 = z;
                                }
                            }
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    }
                    try {
                        httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.zza);
                        int responseCode = httpURLConnection.getResponseCode();
                        inputStream = httpURLConnection.getInputStream();
                        if (responseCode != 200) {
                            Log.w("GoogleTagManager", "Bad response: " + responseCode);
                            this.zzc.zza(zzbzVar);
                        } else {
                            ((zzdt) this.zzc).zza.zzl(zzbzVar.zzb());
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                e = e3;
                                z = false;
                                Log.w("GoogleTagManager", "Exception sending hit: ".concat(String.valueOf(e.getClass().getSimpleName())));
                                Log.w("GoogleTagManager", e.getMessage());
                                this.zzc.zza(zzbzVar);
                                z2 = z;
                            }
                        }
                        httpURLConnection.disconnect();
                        z2 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (IOException e4) {
                    z = z2;
                    e = e4;
                }
            }
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbj
    public final boolean zzb() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzb.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzdg.zzb.zzd("...no network connectivity");
        return false;
    }
}
