package com.google.android.gms.internal.gtm;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaaf extends zzaah {
    zzaaf(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.gtm.zzaah
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.gtm.zzaah
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.gtm.zzaah
    public final void zzc(Object obj, long j, boolean z) {
        if (zzaai.zzb) {
            zzaai.zzD(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            zzaai.zzE(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaah
    public final void zzd(Object obj, long j, byte b) {
        if (zzaai.zzb) {
            zzaai.zzD(obj, j, b);
        } else {
            zzaai.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaah
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.gtm.zzaah
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.gtm.zzaah
    public final boolean zzg(Object obj, long j) {
        return zzaai.zzb ? zzaai.zzt(obj, j) : zzaai.zzu(obj, j);
    }
}
