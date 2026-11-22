package com.google.android.gms.internal.p002firebaseauthapi;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzanc extends zzane {
    zzanc(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final void zzc(Object obj, long j, boolean z) {
        if (zzanf.zzb) {
            zzanf.zzD(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            zzanf.zzE(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final void zzd(Object obj, long j, byte b) {
        if (zzanf.zzb) {
            zzanf.zzD(obj, j, b);
        } else {
            zzanf.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzane
    public final boolean zzg(Object obj, long j) {
        return zzanf.zzb ? zzanf.zzt(obj, j) : zzanf.zzu(obj, j);
    }
}
