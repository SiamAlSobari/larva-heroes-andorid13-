package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfti implements Iterator {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ zzftm zze;

    /* synthetic */ zzfti(zzftm zzftmVar, zzfth zzfthVar) {
        this.zze = zzftmVar;
        this.zzb = zzftmVar.zzf;
        this.zzc = zzftmVar.zze();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.zzc;
        this.zzd = i;
        Object objZza = zza(i);
        this.zzc = this.zze.zzf(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfri.zzj(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzftm zzftmVar = this.zze;
        int i = this.zzd;
        Object[] objArr = zzftmVar.zzb;
        objArr.getClass();
        zzftmVar.remove(objArr[i]);
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i);
}
