package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlu implements zzkp {
    private final zzdz zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzch zze = zzch.zza;

    public zzlu(zzdz zzdzVar) {
        this.zza = zzdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        long j = this.zzc;
        if (!this.zzb) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
        zzch zzchVar = this.zze;
        return j + (zzchVar.zzc == 1.0f ? zzfk.zzp(jElapsedRealtime) : zzchVar.zza(jElapsedRealtime));
    }

    public final void zzb(long j) {
        this.zzc = j;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzch zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (this.zzb) {
            return;
        }
        this.zzd = SystemClock.elapsedRealtime();
        this.zzb = true;
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzch zzchVar) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzchVar;
    }
}
