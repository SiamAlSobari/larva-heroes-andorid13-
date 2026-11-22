package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.mrgames.larvaheroesfree.network.GpTouchConstants;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyc extends Handler implements Runnable {
    final /* synthetic */ zzyh zza;
    private final zzyd zzb;
    private final long zzc;
    private zzxz zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzyc(zzyh zzyhVar, Looper looper, zzyd zzydVar, zzxz zzxzVar, int i, long j) {
        super(looper);
        this.zza = zzyhVar;
        this.zzb = zzydVar;
        this.zzd = zzxzVar;
        this.zzc = j;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        if (message.what == 0) {
            zzd();
            return;
        }
        if (message.what == 3) {
            throw ((Error) message.obj);
        }
        this.zza.zzf = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.zzc;
        zzxz zzxzVar = this.zzd;
        zzxzVar.getClass();
        if (this.zzh) {
            zzxzVar.zzI(this.zzb, jElapsedRealtime, j, false);
            return;
        }
        int i = message.what;
        if (i == 1) {
            try {
                zzxzVar.zzJ(this.zzb, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                zzes.zzd("LoadTask", "Unexpected exception handling load completed", e);
                this.zza.zzg = new zzyg(e);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i2 = this.zzf + 1;
        this.zzf = i2;
        zzyb zzybVarZzt = zzxzVar.zzt(this.zzb, jElapsedRealtime, j, iOException, i2);
        if (zzybVarZzt.zza == 3) {
            this.zza.zzg = this.zze;
        } else if (zzybVarZzt.zza != 2) {
            if (zzybVarZzt.zza == 1) {
                this.zzf = 1;
            }
            zzc(zzybVarZzt.zzb != -9223372036854775807L ? zzybVarZzt.zzb : Math.min((this.zzf - 1) * 1000, GpTouchConstants.SYNC_INTERVAL));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z) {
                String str = "load:" + this.zzb.getClass().getSimpleName();
                int i = zzfk.zza;
                Trace.beginSection(str);
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Exception e2) {
            if (this.zzi) {
                return;
            }
            zzes.zzd("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(2, new zzyg(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.zzi) {
                return;
            }
            zzes.zzd("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(2, new zzyg(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.zzi) {
                zzes.zzd("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzxz zzxzVar = this.zzd;
            zzxzVar.getClass();
            zzxzVar.zzI(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzdy.zzf(this.zza.zzf == null);
        this.zza.zzf = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }

    private final void zzd() {
        this.zze = null;
        zzyh zzyhVar = this.zza;
        ExecutorService executorService = zzyhVar.zze;
        zzyc zzycVar = zzyhVar.zzf;
        zzycVar.getClass();
        executorService.execute(zzycVar);
    }
}
