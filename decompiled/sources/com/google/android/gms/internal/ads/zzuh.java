package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzuh implements zzvj {
    private final zzvj zza;
    private final long zzb;

    public zzuh(zzvj zzvjVar, long j) {
        this.zza = zzvjVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zza(zzkn zzknVar, zzht zzhtVar, int i) {
        int iZza = this.zza.zza(zzknVar, zzhtVar, i);
        if (iZza != -4) {
            return iZza;
        }
        zzhtVar.zzd += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzvj zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final boolean zze() {
        return this.zza.zze();
    }
}
