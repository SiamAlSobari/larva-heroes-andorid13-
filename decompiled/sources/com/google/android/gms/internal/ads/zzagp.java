package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzagp implements zzagm {
    private final zzfb zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzagp(zzagi zzagiVar) {
        zzfb zzfbVar = zzagiVar.zza;
        this.zza = zzfbVar;
        zzfbVar.zzG(12);
        this.zzc = zzfbVar.zzo() & 255;
        this.zzb = zzfbVar.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzagm
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzagm
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagm
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzl();
        }
        if (i == 16) {
            return this.zza.zzp();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzl = this.zza.zzl();
        this.zze = iZzl;
        return (iZzl & 240) >> 4;
    }
}
