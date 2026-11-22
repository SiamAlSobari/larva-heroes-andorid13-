package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcie implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzcie(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbuy zzb() {
        Context contextZza = ((zzchj) this.zza).zza();
        zzfhu zzfhuVar = (zzfhu) this.zzb.zzb();
        com.google.android.gms.ads.internal.zzt.zzf().zzb(contextZza, zzcag.zza(), zzfhuVar).zza("google.afma.request.getAdDictionary", zzbnf.zza, zzbnf.zza);
        zzbni zzbniVarZzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(contextZza, zzcag.zza(), zzfhuVar);
        zzbnc zzbncVar = zzbnf.zza;
        return new zzbux(contextZza, zzbniVarZzb.zza("google.afma.sdkConstants.getSdkConstants", zzbncVar, zzbncVar));
    }
}
