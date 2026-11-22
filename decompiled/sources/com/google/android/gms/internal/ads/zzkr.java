package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzkr {
    public final zzts zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    zzkr(zzts zztsVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        zzdy.zzd(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        zzdy.zzd(z5);
        this.zza = zztsVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzkr zzkrVar = (zzkr) obj;
            if (this.zzb == zzkrVar.zzb && this.zzc == zzkrVar.zzc && this.zzd == zzkrVar.zzd && this.zze == zzkrVar.zze && this.zzg == zzkrVar.zzg && this.zzh == zzkrVar.zzh && this.zzi == zzkrVar.zzi && zzfk.zzD(this.zza, zzkrVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        int i = (int) this.zzb;
        int i2 = (int) this.zzc;
        return (((((((((((((iHashCode * 31) + i) * 31) + i2) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzkr zza(long j) {
        return j == this.zzc ? this : new zzkr(this.zza, this.zzb, j, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzkr zzb(long j) {
        return j == this.zzb ? this : new zzkr(this.zza, j, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
