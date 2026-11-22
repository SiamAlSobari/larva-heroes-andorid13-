package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzauv {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzauu zza(boolean z) {
        synchronized (this.zzb) {
            zzauu zzauuVar = null;
            if (this.zzc.isEmpty()) {
                zzcaa.zze("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzc.size() < 2) {
                zzauu zzauuVar2 = (zzauu) this.zzc.get(0);
                if (z) {
                    this.zzc.remove(0);
                } else {
                    zzauuVar2.zzi();
                }
                return zzauuVar2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (zzauu zzauuVar3 : this.zzc) {
                int iZzb = zzauuVar3.zzb();
                if (iZzb > i2) {
                    i = i3;
                }
                int i4 = iZzb > i2 ? iZzb : i2;
                if (iZzb > i2) {
                    zzauuVar = zzauuVar3;
                }
                i3++;
                i2 = i4;
            }
            this.zzc.remove(i);
            return zzauuVar;
        }
    }

    public final void zzb(zzauu zzauuVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                zzcaa.zze("Queue is full, current size = " + this.zzc.size());
                this.zzc.remove(0);
            }
            int i = this.zza;
            this.zza = i + 1;
            zzauuVar.zzj(i);
            zzauuVar.zzn();
            this.zzc.add(zzauuVar);
        }
    }

    public final boolean zzc(zzauu zzauuVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzauu zzauuVar2 = (zzauu) it.next();
                if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO() && !zzauuVar.equals(zzauuVar2) && zzauuVar2.zzf().equals(zzauuVar.zzf())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzauuVar.equals(zzauuVar2) && zzauuVar2.zzd().equals(zzauuVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzauu zzauuVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzauuVar);
        }
    }
}
