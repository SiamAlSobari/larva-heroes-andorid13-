package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqq implements zzdba, com.google.android.gms.ads.internal.client.zza, zzcxc, zzcwm {
    private final Context zza;
    private final zzfcq zzb;
    private final zzdrh zzc;
    private final zzfbr zzd;
    private final zzfbe zze;
    private final zzech zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgJ)).booleanValue();

    public zzdqq(Context context, zzfcq zzfcqVar, zzdrh zzdrhVar, zzfbr zzfbrVar, zzfbe zzfbeVar, zzech zzechVar) {
        this.zza = context;
        this.zzb = zzfcqVar;
        this.zzc = zzdrhVar;
        this.zzd = zzfbrVar;
        this.zze = zzfbeVar;
        this.zzf = zzechVar;
    }

    private final zzdrg zzd(String str) {
        zzdrg zzdrgVarZza = this.zzc.zza();
        zzdrgVarZza.zze(this.zzd.zzb.zzb);
        zzdrgVarZza.zzd(this.zze);
        zzdrgVarZza.zzb("action", str);
        if (!this.zze.zzu.isEmpty()) {
            zzdrgVarZza.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzaj) {
            zzdrgVarZza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzdrgVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzdrgVarZza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgS)).booleanValue()) {
            boolean z = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(this.zzd.zza.zza) != 1;
            zzdrgVarZza.zzb("scar", String.valueOf(z));
            if (z) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzd.zza.zza.zzd;
                zzdrgVarZza.zzc("ragent", zzlVar.zzp);
                zzdrgVarZza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzlVar)));
            }
        }
        return zzdrgVarZza;
    }

    private final void zze(zzdrg zzdrgVar) {
        if (!this.zze.zzaj) {
            zzdrgVar.zzg();
            return;
        }
        this.zzf.zzd(new zzecj(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdrgVar.zzf(), 2));
    }

    private final boolean zzf() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
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
                    this.zzg = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzaj) {
            zze(zzd("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzh) {
            zzdrg zzdrgVarZzd = zzd("ifts");
            zzdrgVarZzd.zzb("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzdrgVarZzd.zzb("arec", String.valueOf(i));
            }
            String strZza = this.zzb.zza(str);
            if (strZza != null) {
                zzdrgVarZzd.zzb("areec", strZza);
            }
            zzdrgVarZzd.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        if (this.zzh) {
            zzdrg zzdrgVarZzd = zzd("ifts");
            zzdrgVarZzd.zzb("reason", "blocked");
            zzdrgVarZzd.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc(zzdfx zzdfxVar) {
        if (this.zzh) {
            zzdrg zzdrgVarZzd = zzd("ifts");
            zzdrgVarZzd.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdfxVar.getMessage())) {
                zzdrgVarZzd.zzb(NotificationCompat.CATEGORY_MESSAGE, zzdfxVar.getMessage());
            }
            zzdrgVarZzd.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzi() {
        if (zzf()) {
            zzd("adapter_shown").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzj() {
        if (zzf()) {
            zzd("adapter_impression").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if (zzf() || this.zze.zzaj) {
            zze(zzd("impression"));
        }
    }
}
