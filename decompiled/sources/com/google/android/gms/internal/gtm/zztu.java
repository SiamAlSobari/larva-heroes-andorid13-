package com.google.android.gms.internal.gtm;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zztu extends zztw {
    final /* synthetic */ zzud zza;
    private int zzb = 0;
    private final int zzc;

    zztu(zzud zzudVar) {
        this.zza = zzudVar;
        this.zzc = zzudVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzty
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
