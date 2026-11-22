package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfxd extends zzfxj {
    private static final Logger zza = Logger.getLogger(zzfxd.class.getName());

    @CheckForNull
    private zzfty zzb;
    private final boolean zzc;
    private final boolean zze;

    zzfxd(zzfty zzftyVar, boolean z, boolean z2) {
        super(zzftyVar.size());
        zzftyVar.getClass();
        this.zzb = zzftyVar;
        this.zzc = z;
        this.zze = z2;
    }

    private final void zzG(int i, Future future) {
        try {
            zzf(i, zzfye.zzp(future));
        } catch (Error e) {
            e = e;
            zzI(e);
        } catch (RuntimeException e2) {
            e = e2;
            zzI(e);
        } catch (ExecutionException e3) {
            zzI(e3.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzx(@CheckForNull zzfty zzftyVar) {
        int iZzA = zzA();
        int i = 0;
        zzfri.zzj(iZzA >= 0, "Less than 0 remaining futures");
        if (iZzA == 0) {
            if (zzftyVar != null) {
                zzfwd it = zzftyVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private static void zzJ(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    @CheckForNull
    protected final String zza() {
        zzfty zzftyVar = this.zzb;
        return zzftyVar != null ? "futures=".concat(zzftyVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    protected final void zzb() {
        zzfty zzftyVar = this.zzb;
        zzy(1);
        if ((zzftyVar != null) && isCancelled()) {
            boolean zZzt = zzt();
            zzfwd it = zzftyVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzt);
            }
        }
    }

    abstract void zzf(int i, Object obj);

    abstract void zzu();

    final void zzv() {
        zzfty zzftyVar = this.zzb;
        zzftyVar.getClass();
        if (zzftyVar.isEmpty()) {
            zzu();
            return;
        }
        if (!this.zzc) {
            final zzfty zzftyVar2 = this.zze ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx(zzftyVar2);
                }
            };
            zzfwd it = this.zzb.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).addListener(runnable, zzfxs.INSTANCE);
            }
            return;
        }
        zzfwd it2 = this.zzb.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it2.next();
            listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzw(listenableFuture, i);
                }
            }, zzfxs.INSTANCE);
            i++;
        }
    }

    final /* synthetic */ void zzw(ListenableFuture listenableFuture, int i) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, listenableFuture);
            }
        } finally {
            zzx(null);
        }
    }

    void zzy(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    final void zze(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        thZzl.getClass();
        zzK(set, thZzl);
    }

    private final void zzI(Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzK(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }
}
