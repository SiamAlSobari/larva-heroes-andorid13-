package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeai implements zzdba, com.google.android.gms.ads.internal.client.zza, zzcxc, zzcwm {
    private final Context zza;
    private final zzfcq zzb;
    private final zzfbr zzc;
    private final zzfbe zzd;
    private final zzech zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgJ)).booleanValue();
    private final zzfgo zzh;
    private final String zzi;

    public zzeai(Context context, zzfcq zzfcqVar, zzfbr zzfbrVar, zzfbe zzfbeVar, zzech zzechVar, zzfgo zzfgoVar, String str) {
        this.zza = context;
        this.zzb = zzfcqVar;
        this.zzc = zzfbrVar;
        this.zzd = zzfbeVar;
        this.zze = zzechVar;
        this.zzh = zzfgoVar;
        this.zzi = str;
    }

    private final zzfgn zzd(String str) {
        zzfgn zzfgnVarZzb = zzfgn.zzb(str);
        zzfgnVarZzb.zzh(this.zzc, null);
        zzfgnVarZzb.zzf(this.zzd);
        zzfgnVarZzb.zza("request_id", this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzfgnVarZzb.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzaj) {
            zzfgnVarZzb.zza("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzfgnVarZzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzfgnVarZzb.zza("offline_ad", "1");
        }
        return zzfgnVarZzb;
    }

    private final void zze(zzfgn zzfgnVar) {
        if (!this.zzd.zzaj) {
            this.zzh.zzb(zzfgnVar);
            return;
        }
        this.zze.zzd(new zzecj(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfgnVar), 2));
    }

    private final boolean zzf() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbq);
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String strZzn = com.google.android.gms.ads.internal.util.zzs.zzn(this.zza);
                    boolean zMatches = false;
                    if (str != null && strZzn != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzn);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzf = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzd.zzaj) {
            zze(zzd("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzg) {
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String strZza = this.zzb.zza(str);
            zzfgn zzfgnVarZzd = zzd("ifts");
            zzfgnVarZzd.zza("reason", "adapter");
            if (i >= 0) {
                zzfgnVarZzd.zza("arec", String.valueOf(i));
            }
            if (strZza != null) {
                zzfgnVarZzd.zza("areec", strZza);
            }
            this.zzh.zzb(zzfgnVarZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        if (this.zzg) {
            zzfgo zzfgoVar = this.zzh;
            zzfgn zzfgnVarZzd = zzd("ifts");
            zzfgnVarZzd.zza("reason", "blocked");
            zzfgoVar.zzb(zzfgnVarZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc(zzdfx zzdfxVar) {
        if (this.zzg) {
            zzfgn zzfgnVarZzd = zzd("ifts");
            zzfgnVarZzd.zza("reason", "exception");
            if (!TextUtils.isEmpty(zzdfxVar.getMessage())) {
                zzfgnVarZzd.zza(NotificationCompat.CATEGORY_MESSAGE, zzdfxVar.getMessage());
            }
            this.zzh.zzb(zzfgnVarZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzi() {
        if (zzf()) {
            this.zzh.zzb(zzd("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzj() {
        if (zzf()) {
            this.zzh.zzb(zzd("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if (zzf() || this.zzd.zzaj) {
            zze(zzd("impression"));
        }
    }
}
