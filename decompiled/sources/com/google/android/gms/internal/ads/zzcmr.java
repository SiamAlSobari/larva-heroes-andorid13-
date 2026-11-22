package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcmr implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzcmr(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcmq zzb() {
        return new zzcmq(((zzgyx) this.zza).zzb(), ((zzgyx) this.zzb).zzb());
    }
}
