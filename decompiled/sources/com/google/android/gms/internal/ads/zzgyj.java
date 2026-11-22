package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgyj implements Iterator {
    int zza = 0;
    final /* synthetic */ zzgyk zzb;

    zzgyj(zzgyk zzgykVar) {
        this.zzb = zzgykVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzgyk zzgykVar = this.zzb;
            zzgykVar.zza.add(zzgykVar.zzb.next());
            return next();
        }
        List list = this.zzb.zza;
        int i = this.zza;
        this.zza = i + 1;
        return list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
