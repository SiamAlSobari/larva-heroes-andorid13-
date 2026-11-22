package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzvb implements zzxo {
    public long zza;
    public long zzb;
    public zzxn zzc;
    public zzvb zzd;

    public zzvb(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzvb zzb() {
        this.zzc = null;
        zzvb zzvbVar = this.zzd;
        this.zzd = null;
        return zzvbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final zzxn zzc() {
        zzxn zzxnVar = this.zzc;
        zzxnVar.getClass();
        return zzxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final zzxo zzd() {
        zzvb zzvbVar = this.zzd;
        if (zzvbVar == null || zzvbVar.zzc == null) {
            return null;
        }
        return zzvbVar;
    }

    public final void zze(long j, int i) {
        zzdy.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }
}
