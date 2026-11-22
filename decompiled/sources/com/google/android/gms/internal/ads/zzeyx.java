package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyx implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzeyx(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeyv zzb() {
        Context context = (Context) this.zza.zzb();
        zzfdj zzfdjVar = (zzfdj) this.zzb.zzb();
        zzfeb zzfebVar = (zzfeb) this.zzc.zzb();
        zzbzd zzbzdVarZzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgj)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh() : com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        boolean z = false;
        if (zzbzdVarZzh != null && zzbzdVarZzh.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgz)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgi)).booleanValue() || z) {
                zzfea zzfeaVarZza = zzfebVar.zza(zzfdr.AppOpen, context, zzfdjVar, new zzexz(new zzexw()));
                return new zzeyb(new zzeyl(new zzeyk()), new zzeyh(zzfeaVarZza.zza, zzcan.zza), zzfeaVarZza.zzb, zzfeaVarZza.zza.zza().zzf, zzcan.zza);
            }
        }
        return new zzeyk();
    }
}
