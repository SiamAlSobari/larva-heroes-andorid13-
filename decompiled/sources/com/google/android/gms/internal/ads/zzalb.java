package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzalb extends Thread {
    private static final boolean zza = zzamb.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzakz zzd;
    private volatile boolean zze = false;
    private final zzamc zzf;
    private final zzalg zzg;

    public zzalb(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzakz zzakzVar, zzalg zzalgVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzakzVar;
        this.zzg = zzalgVar;
        this.zzf = new zzamc(this, blockingQueue2, zzalgVar);
    }

    private void zzc() throws InterruptedException {
        zzalp zzalpVar = (zzalp) this.zzb.take();
        zzalpVar.zzm("cache-queue-take");
        zzalpVar.zzt(1);
        try {
            zzalpVar.zzw();
            zzaky zzakyVarZza = this.zzd.zza(zzalpVar.zzj());
            if (zzakyVarZza == null) {
                zzalpVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzalpVar)) {
                    this.zzc.put(zzalpVar);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (zzakyVarZza.zza(jCurrentTimeMillis)) {
                zzalpVar.zzm("cache-hit-expired");
                zzalpVar.zze(zzakyVarZza);
                if (!this.zzf.zzc(zzalpVar)) {
                    this.zzc.put(zzalpVar);
                }
                return;
            }
            zzalpVar.zzm("cache-hit");
            zzalv zzalvVarZzh = zzalpVar.zzh(new zzall(zzakyVarZza.zza, zzakyVarZza.zzg));
            zzalpVar.zzm("cache-hit-parsed");
            if (!zzalvVarZzh.zzc()) {
                zzalpVar.zzm("cache-parsing-failed");
                this.zzd.zzc(zzalpVar.zzj(), true);
                zzalpVar.zze(null);
                if (!this.zzf.zzc(zzalpVar)) {
                    this.zzc.put(zzalpVar);
                }
                return;
            }
            if (zzakyVarZza.zzf < jCurrentTimeMillis) {
                zzalpVar.zzm("cache-hit-refresh-needed");
                zzalpVar.zze(zzakyVarZza);
                zzalvVarZzh.zzd = true;
                if (this.zzf.zzc(zzalpVar)) {
                    this.zzg.zzb(zzalpVar, zzalvVarZzh, null);
                } else {
                    this.zzg.zzb(zzalpVar, zzalvVarZzh, new zzala(this, zzalpVar));
                }
            } else {
                this.zzg.zzb(zzalpVar, zzalvVarZzh, null);
            }
        } finally {
            zzalpVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzamb.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzamb.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
