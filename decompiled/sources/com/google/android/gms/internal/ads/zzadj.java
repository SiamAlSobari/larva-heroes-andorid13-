package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzadj {
    protected final zzace zza;

    protected zzadj(zzace zzaceVar) {
        this.zza = zzaceVar;
    }

    protected abstract boolean zza(zzfb zzfbVar) throws zzcd;

    protected abstract boolean zzb(zzfb zzfbVar, long j) throws zzcd;

    public final boolean zzf(zzfb zzfbVar, long j) throws zzcd {
        return zza(zzfbVar) && zzb(zzfbVar, j);
    }
}
