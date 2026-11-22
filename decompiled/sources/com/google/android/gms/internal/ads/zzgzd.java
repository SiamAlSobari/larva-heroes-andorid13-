package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgzd {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzgzd(int i, int i2, zzgzc zzgzcVar) {
        this.zza = zzgyq.zzc(i);
        this.zzb = zzgyq.zzc(i2);
    }

    public final zzgzd zza(zzgzg zzgzgVar) {
        this.zzb.add(zzgzgVar);
        return this;
    }

    public final zzgzd zzb(zzgzg zzgzgVar) {
        this.zza.add(zzgzgVar);
        return this;
    }

    public final zzgze zzc() {
        return new zzgze(this.zza, this.zzb, null);
    }
}
