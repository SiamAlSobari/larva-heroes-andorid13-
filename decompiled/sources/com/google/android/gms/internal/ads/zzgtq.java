package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtq implements Iterator {
    private final ArrayDeque zza;
    private zzgqd zzb;

    /* synthetic */ zzgtq(zzgqi zzgqiVar, zzgtp zzgtpVar) {
        if (!(zzgqiVar instanceof zzgts)) {
            this.zza = null;
            this.zzb = (zzgqd) zzgqiVar;
            return;
        }
        zzgts zzgtsVar = (zzgts) zzgqiVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzgtsVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzgtsVar);
        this.zzb = zzb(zzgtsVar.zzd);
    }

    private final zzgqd zzb(zzgqi zzgqiVar) {
        while (zzgqiVar instanceof zzgts) {
            zzgts zzgtsVar = (zzgts) zzgqiVar;
            this.zza.push(zzgtsVar);
            zzgqiVar = zzgtsVar.zzd;
        }
        return (zzgqd) zzgqiVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgqd next() {
        zzgqd zzgqdVarZzb;
        zzgqd zzgqdVar = this.zzb;
        if (zzgqdVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgqdVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgqdVarZzb = zzb(((zzgts) this.zza.pop()).zze);
        } while (zzgqdVarZzb.zzd() == 0);
        this.zzb = zzgqdVarZzb;
        return zzgqdVar;
    }
}
