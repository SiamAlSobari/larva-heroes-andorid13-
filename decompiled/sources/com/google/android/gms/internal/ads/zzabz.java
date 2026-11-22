package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzabz implements zzaca {
    private final long zza;
    private final zzaby zzb;

    public zzabz(long j, long j2) {
        this.zza = j;
        zzacb zzacbVar = j2 == 0 ? zzacb.zza : new zzacb(0L, j2);
        this.zzb = new zzaby(zzacbVar, zzacbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return false;
    }
}
