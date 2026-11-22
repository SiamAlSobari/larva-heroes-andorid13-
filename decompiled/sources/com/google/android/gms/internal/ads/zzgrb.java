package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrb {
    private final Object zza;
    private final int zzb;

    zzgrb(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgrb)) {
            return false;
        }
        zzgrb zzgrbVar = (zzgrb) obj;
        return this.zza == zzgrbVar.zza && this.zzb == zzgrbVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
