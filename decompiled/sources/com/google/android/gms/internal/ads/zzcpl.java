package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcpl {
    private final zzfgo zza;
    private final zzdrh zzb;
    private final zzfbr zzc;

    public zzcpl(zzdrh zzdrhVar, zzfbr zzfbrVar, zzfgo zzfgoVar) {
        this.zza = zzfgoVar;
        this.zzb = zzdrhVar;
        this.zzc = zzfbrVar;
    }

    private static String zzb(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return "h";
        }
        if (i2 == 1) {
            return "bb";
        }
        if (i2 == 2) {
            return "cc";
        }
        if (i2 != 3) {
            return i2 != 4 ? "u" : "ac";
        }
        return "cb";
    }

    public final void zza(long j, int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
            zzfgo zzfgoVar = this.zza;
            zzfgn zzfgnVarZzb = zzfgn.zzb("ad_closed");
            zzfgnVarZzb.zzg(this.zzc.zzb.zzb);
            zzfgnVarZzb.zza("show_time", String.valueOf(j));
            zzfgnVarZzb.zza(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
            zzfgnVarZzb.zza("acr", zzb(i));
            zzfgoVar.zzb(zzfgnVarZzb);
            return;
        }
        zzdrg zzdrgVarZza = this.zzb.zza();
        zzdrgVarZza.zze(this.zzc.zzb.zzb);
        zzdrgVarZza.zzb("action", "ad_closed");
        zzdrgVarZza.zzb("show_time", String.valueOf(j));
        zzdrgVarZza.zzb(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        zzdrgVarZza.zzb("acr", zzb(i));
        zzdrgVarZza.zzg();
    }
}
