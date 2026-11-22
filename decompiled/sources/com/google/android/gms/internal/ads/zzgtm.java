package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtm extends zzgqa {
    final zzgtq zza;
    zzgqc zzb = zzb();
    final /* synthetic */ zzgts zzc;

    zzgtm(zzgts zzgtsVar) {
        this.zzc = zzgtsVar;
        this.zza = new zzgtq(zzgtsVar, null);
    }

    private final zzgqc zzb() {
        zzgtq zzgtqVar = this.zza;
        if (zzgtqVar.hasNext()) {
            return zzgtqVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgqc
    public final byte zza() {
        zzgqc zzgqcVar = this.zzb;
        if (zzgqcVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzgqcVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
