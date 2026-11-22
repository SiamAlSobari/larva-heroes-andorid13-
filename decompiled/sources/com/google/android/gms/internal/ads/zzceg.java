package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzceg implements zzko {
    private final zzxu zzb = new zzxu(true, 65536);
    private long zzc = 15000000;
    private long zzd = 30000000;
    private long zze = 2500000;
    private long zzf = 5000000;
    private int zzg;
    private boolean zzh;

    zzceg() {
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final long zza() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzb() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzc() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzd() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final /* synthetic */ void zze(zzcw zzcwVar, zzbw zzbwVar, zzln[] zzlnVarArr, zzvs zzvsVar, zzxf[] zzxfVarArr) {
        int i = 0;
        this.zzg = 0;
        while (true) {
            int length = zzlnVarArr.length;
            if (i >= 2) {
                this.zzb.zzf(this.zzg);
                return;
            } else {
                if (zzxfVarArr[i] != null) {
                    this.zzg += zzlnVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzg(long j, long j2, float f) {
        char c;
        boolean z = true;
        if (j2 > this.zzd) {
            c = 0;
        } else {
            c = j2 < this.zzc ? (char) 2 : (char) 1;
        }
        int iZza = this.zzb.zza();
        int i = this.zzg;
        if (c != 2 && (c != 1 || !this.zzh || iZza >= i)) {
            z = false;
        }
        this.zzh = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final /* synthetic */ boolean zzh(zzcw zzcwVar, zzbw zzbwVar, long j, float f, boolean z, long j2) {
        long j3 = z ? this.zzf : this.zze;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final zzxu zzi() {
        return this.zzb;
    }

    final void zzj(boolean z) {
        this.zzg = 0;
        this.zzh = false;
        if (z) {
            this.zzb.zze();
        }
    }

    public final synchronized void zzk(int i) {
        this.zze = ((long) i) * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zzf = ((long) i) * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzc = ((long) i) * 1000;
    }
}
