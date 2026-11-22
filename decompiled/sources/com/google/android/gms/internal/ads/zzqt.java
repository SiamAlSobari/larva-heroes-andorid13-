package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqt {
    public final int zza;
    public final zzts zzb;
    private final CopyOnWriteArrayList zzc;

    public zzqt() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzqt(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzts zztsVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztsVar;
    }

    public final zzqt zza(int i, zzts zztsVar) {
        return new zzqt(this.zzc, 0, zztsVar);
    }

    public final void zzb(Handler handler, zzqu zzquVar) {
        this.zzc.add(new zzqs(handler, zzquVar));
    }

    public final void zzc(zzqu zzquVar) {
        for (zzqs zzqsVar : this.zzc) {
            if (zzqsVar.zzb == zzquVar) {
                this.zzc.remove(zzqsVar);
            }
        }
    }
}
