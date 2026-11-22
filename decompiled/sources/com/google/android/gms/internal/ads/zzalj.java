package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzalj extends Thread {
    private final BlockingQueue zza;
    private final zzali zzb;
    private final zzakz zzc;
    private volatile boolean zzd = false;
    private final zzalg zze;

    public zzalj(BlockingQueue blockingQueue, zzali zzaliVar, zzakz zzakzVar, zzalg zzalgVar) {
        this.zza = blockingQueue;
        this.zzb = zzaliVar;
        this.zzc = zzakzVar;
        this.zze = zzalgVar;
    }

    private void zzb() throws InterruptedException {
        zzalp zzalpVar = (zzalp) this.zza.take();
        SystemClock.elapsedRealtime();
        zzalpVar.zzt(3);
        try {
            zzalpVar.zzm("network-queue-take");
            zzalpVar.zzw();
            TrafficStats.setThreadStatsTag(zzalpVar.zzc());
            zzall zzallVarZza = this.zzb.zza(zzalpVar);
            zzalpVar.zzm("network-http-complete");
            if (zzallVarZza.zze && zzalpVar.zzv()) {
                zzalpVar.zzp("not-modified");
                zzalpVar.zzr();
                return;
            }
            zzalv zzalvVarZzh = zzalpVar.zzh(zzallVarZza);
            zzalpVar.zzm("network-parse-complete");
            if (zzalvVarZzh.zzb != null) {
                this.zzc.zzd(zzalpVar.zzj(), zzalvVarZzh.zzb);
                zzalpVar.zzm("network-cache-written");
            }
            zzalpVar.zzq();
            this.zze.zzb(zzalpVar, zzalvVarZzh, null);
            zzalpVar.zzs(zzalvVarZzh);
        } catch (zzaly e) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzalpVar, e);
            zzalpVar.zzr();
        } catch (Exception e2) {
            zzamb.zzc(e2, "Unhandled exception %s", e2.toString());
            zzaly zzalyVar = new zzaly(e2);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzalpVar, zzalyVar);
            zzalpVar.zzr();
        } finally {
            zzalpVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzamb.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
