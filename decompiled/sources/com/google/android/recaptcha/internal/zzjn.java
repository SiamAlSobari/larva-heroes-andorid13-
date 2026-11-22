package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjn extends zzjo {
    zzjn(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzjo
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.recaptcha.internal.zzjo
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    /* JADX WARN: Failed to inline method: com.google.android.recaptcha.internal.zzjp.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.recaptcha.internal.zzjp.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.recaptcha.internal.zzjp.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.recaptcha.internal.zzjp.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.recaptcha.internal.zzjo
    public final void zzc(Object obj, long j, boolean z) {
        if (zzjp.zzb) {
            zzjp.zzi(obj, j, z);
        } else {
            zzjp.zzj(obj, j, z);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjo
    public final void zzd(Object obj, long j, byte b) {
        if (zzjp.zzb) {
            zzjp.zzD(obj, j, b);
        } else {
            zzjp.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjo
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzjo
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.recaptcha.internal.zzjo
    public final boolean zzg(Object obj, long j) {
        return zzjp.zzb ? zzjp.zzt(obj, j) : zzjp.zzu(obj, j);
    }
}
