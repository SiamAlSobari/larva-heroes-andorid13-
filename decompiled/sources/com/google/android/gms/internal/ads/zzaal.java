package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaal {
    public static final zzaal zza = new zzaal(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzaal(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzaal zzd(long j, long j2) {
        return new zzaal(-1, j, j2);
    }

    public static zzaal zze(long j) {
        return new zzaal(0, -9223372036854775807L, j);
    }

    public static zzaal zzf(long j, long j2) {
        return new zzaal(-2, j, j2);
    }
}
