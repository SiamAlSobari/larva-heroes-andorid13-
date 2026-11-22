package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfxl;
import com.google.android.gms.internal.ads.zzfye;
import com.google.common.util.concurrent.ListenableFuture;
import com.unity3d.ads.metadata.MediationMetaData;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzcag zzcagVar, String str, Runnable runnable, zzfhu zzfhuVar) {
        zzb(context, zzcagVar, true, null, str, null, runnable, zzfhuVar);
    }

    final void zzb(Context context, zzcag zzcagVar, boolean z, zzbzd zzbzdVar, String str, String str2, Runnable runnable, final zzfhu zzfhuVar) {
        PackageInfo packageInfo;
        if (zzt.zzB().elapsedRealtime() - this.zzb < 5000) {
            zzcaa.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzB().elapsedRealtime();
        if (zzbzdVar != null && !TextUtils.isEmpty(zzbzdVar.zzc())) {
            if (zzt.zzB().currentTimeMillis() - zzbzdVar.zza() <= ((Long) zzba.zzc().zzb(zzbbr.zzdT)).longValue() && zzbzdVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            zzcaa.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzcaa.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfhg zzfhgVarZza = zzfhf.zza(context, 4);
        zzfhgVarZza.zzh();
        zzbmy zzbmyVarZza = zzt.zzf().zza(this.zza, zzcagVar, zzfhuVar).zza("google.afma.config.fetchAppSettings", zzbnf.zza, zzbnf.zza);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            zzbbj zzbbjVar = zzbbr.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zza().zza()));
            jSONObject.put("js", zzcagVar.zza);
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put(MediationMetaData.KEY_VERSION, packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            ListenableFuture listenableFutureZzb = zzbmyVarZza.zzb(jSONObject);
            ListenableFuture listenableFutureZzn = zzfye.zzn(listenableFutureZzb, new zzfxl() { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj) throws JSONException {
                    zzfhu zzfhuVar2 = zzfhuVar;
                    zzfhg zzfhgVar = zzfhgVarZza;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        zzt.zzo().zzh().zzu(jSONObject2.getString("appSettingsJson"));
                    }
                    zzfhgVar.zzf(zOptBoolean);
                    zzfhuVar2.zzb(zzfhgVar.zzl());
                    return zzfye.zzh(null);
                }
            }, zzcan.zzf);
            if (runnable != null) {
                listenableFutureZzb.addListener(runnable, zzcan.zzf);
            }
            zzcaq.zza(listenableFutureZzn, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e) {
            zzcaa.zzh("Error requesting application settings", e);
            zzfhgVarZza.zzg(e);
            zzfhgVarZza.zzf(false);
            zzfhuVar.zzb(zzfhgVarZza.zzl());
        }
    }

    public final void zzc(Context context, zzcag zzcagVar, String str, zzbzd zzbzdVar, zzfhu zzfhuVar) {
        zzb(context, zzcagVar, false, zzbzdVar, zzbzdVar != null ? zzbzdVar.zzb() : null, str, null, zzfhuVar);
    }
}
