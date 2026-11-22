package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaac implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzaad zzb;

    zzaac(zzaad zzaadVar) {
        this.zzb = zzaadVar;
        this.zza = zzaadVar.zza.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
