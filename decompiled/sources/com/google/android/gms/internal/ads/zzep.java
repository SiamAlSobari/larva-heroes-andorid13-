package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzep {
    private final zzdz zza;
    private final zzej zzb;
    private final zzen zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzep(Looper looper, zzdz zzdzVar, zzen zzenVar) {
        this(new CopyOnWriteArraySet(), looper, zzdzVar, zzenVar, true);
    }

    public static /* synthetic */ boolean zzg(zzep zzepVar, Message message) {
        Iterator it = zzepVar.zzd.iterator();
        while (it.hasNext()) {
            ((zzeo) it.next()).zzb(zzepVar.zzc);
            if (zzepVar.zzb.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    private final void zzh() {
        if (this.zzi) {
            zzdy.zzf(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    public final zzep zza(Looper looper, zzen zzenVar) {
        return new zzep(this.zzd, looper, this.zza, zzenVar, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new zzeo(obj));
        }
    }

    public final void zzc() {
        zzh();
        if (this.zzf.isEmpty()) {
            return;
        }
        if (!this.zzb.zzg(0)) {
            zzej zzejVar = this.zzb;
            zzejVar.zzk(zzejVar.zzb(0));
        }
        boolean z = !this.zze.isEmpty();
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if (z) {
            return;
        }
        while (!this.zze.isEmpty()) {
            ((Runnable) this.zze.peekFirst()).run();
            this.zze.removeFirst();
        }
    }

    public final void zzd(final int i, final zzem zzemVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzel
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i2 = i;
                zzem zzemVar2 = zzemVar;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((zzeo) it.next()).zza(i2, zzemVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzeo) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        for (zzeo zzeoVar : this.zzd) {
            if (zzeoVar.zza.equals(obj)) {
                zzeoVar.zzc(this.zzc);
                this.zzd.remove(zzeoVar);
            }
        }
    }

    private zzep(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzdz zzdzVar, zzen zzenVar, boolean z) {
        this.zza = zzdzVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzenVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzdzVar.zzb(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzek
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzep.zzg(this.zza, message);
                return true;
            }
        });
        this.zzi = z;
    }
}
