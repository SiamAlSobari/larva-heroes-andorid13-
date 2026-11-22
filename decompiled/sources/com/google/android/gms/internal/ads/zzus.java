package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzus implements zzvj {
    final /* synthetic */ zzuv zza;
    private final int zzb;

    public zzus(zzuv zzuvVar, int i) {
        this.zza = zzuvVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zza(zzkn zzknVar, zzht zzhtVar, int i) {
        return this.zza.zzg(this.zzb, zzknVar, zzhtVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzd() throws IOException {
        this.zza.zzH(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final boolean zze() {
        return this.zza.zzO(this.zzb);
    }
}
