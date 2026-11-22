package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxr {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzxs zzxsVar) {
        zzc(zzxsVar);
        this.zza.add(new zzxq(handler, zzxsVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        for (final zzxq zzxqVar : this.zza) {
            if (!zzxqVar.zzc) {
                zzxqVar.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxp
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzxq zzxqVar2 = zzxqVar;
                        zzxqVar2.zzb.zzV(i, j, j2);
                    }
                });
            }
        }
    }

    public final void zzc(zzxs zzxsVar) {
        for (zzxq zzxqVar : this.zza) {
            if (zzxqVar.zzb == zzxsVar) {
                zzxqVar.zzc();
                this.zza.remove(zzxqVar);
            }
        }
    }
}
