package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzyh {
    public static final zzyb zza = new zzyb(0, -9223372036854775807L, null);
    public static final zzyb zzb = new zzyb(1, -9223372036854775807L, null);
    public static final zzyb zzc = new zzyb(2, -9223372036854775807L, null);
    public static final zzyb zzd = new zzyb(3, -9223372036854775807L, null);
    private final ExecutorService zze = zzfk.zzB("ExoPlayer:Loader:ProgressiveMediaPeriod");
    private zzyc zzf;
    private IOException zzg;

    public zzyh(String str) {
    }

    public static zzyb zzb(boolean z, long j) {
        return new zzyb(z ? 1 : 0, j, null);
    }

    public final long zza(zzyd zzydVar, zzxz zzxzVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        zzdy.zzb(looperMyLooper);
        this.zzg = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzyc(this, looperMyLooper, zzydVar, zzxzVar, i, jElapsedRealtime).zzc(0L);
        return jElapsedRealtime;
    }

    public final void zzg() {
        zzyc zzycVar = this.zzf;
        zzdy.zzb(zzycVar);
        zzycVar.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zzg;
        if (iOException != null) {
            throw iOException;
        }
        zzyc zzycVar = this.zzf;
        if (zzycVar != null) {
            zzycVar.zzb(i);
        }
    }

    public final void zzj(zzye zzyeVar) {
        zzyc zzycVar = this.zzf;
        if (zzycVar != null) {
            zzycVar.zza(true);
        }
        this.zze.execute(new zzyf(zzyeVar));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
