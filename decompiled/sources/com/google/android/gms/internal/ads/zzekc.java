package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzekc implements zzelm {
    final /* synthetic */ zzekd zza;

    zzekc(zzekd zzekdVar) {
        this.zza = zzekdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqc zzcqcVar = (zzcqc) obj;
        synchronized (this.zza) {
            zzekd zzekdVar = this.zza;
            if (zzekdVar.zzi != null) {
                zzekdVar.zzi.zzb();
            }
            this.zza.zzi = zzcqcVar;
            this.zza.zzi.zzj();
        }
    }
}
