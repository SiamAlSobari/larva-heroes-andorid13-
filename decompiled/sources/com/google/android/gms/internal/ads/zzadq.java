package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzadq implements zzabe {
    private final long zzb;
    private final zzabe zzc;

    public zzadq(long j, zzabe zzabeVar) {
        this.zzb = j;
        this.zzc = zzabeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final void zzC() {
        this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final void zzN(zzaca zzacaVar) {
        this.zzc.zzN(new zzadp(this, zzacaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final zzace zzv(int i, int i2) {
        return this.zzc.zzv(i, i2);
    }
}
