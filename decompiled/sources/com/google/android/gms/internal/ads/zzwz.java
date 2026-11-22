package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzwz {
    public final int zza;
    public final zzcy zzb;
    public final int zzc;
    public final zzam zzd;

    public zzwz(int i, zzcy zzcyVar, int i2) {
        this.zza = i;
        this.zzb = zzcyVar;
        this.zzc = i2;
        this.zzd = zzcyVar.zzb(i2);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzwz zzwzVar);
}
