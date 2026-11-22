package com.google.android.gms.internal.gtm;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaag extends zzaah {
    zzaag(Unsafe unsafe) {
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

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.gtm.zzaai.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.gtm.zzaai.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Method inline failed with exception
    java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative
    	at java.base/java.lang.System.arraycopy(Native Method)
    	at java.base/java.util.ArrayList.shiftTailOverGap(Unknown Source)
    	at java.base/java.util.ArrayList.removeIf(Unknown Source)
     */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.gtm.zzaai.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.gtm.zzaah
    public final void zzc(Object obj, long j, boolean z) {
        if (zzaai.zzb) {
            zzaai.zzi(obj, j, z);
        } else {
            zzaai.zzj(obj, j, z);
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
