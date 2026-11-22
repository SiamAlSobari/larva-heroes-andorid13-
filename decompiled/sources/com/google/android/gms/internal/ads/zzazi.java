package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzazi extends zzgrq implements zzgtb {
    private static final zzazi zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzazi zzaziVar = new zzazi();
        zzb = zzaziVar;
        zzgrq.zzaU(zzazi.class, zzaziVar);
    }

    private zzazi() {
    }

    public static zzazb zza() {
        return (zzazb) zzb.zzaA();
    }

    public static zzazi zzd() {
        return zzb;
    }

    static /* synthetic */ void zzi(zzazi zzaziVar, int i) {
        zzaziVar.zze = i - 1;
        zzaziVar.zzd |= 1;
    }

    static /* synthetic */ void zzj(zzazi zzaziVar, int i) {
        zzaziVar.zzf = i - 1;
        zzaziVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzazg.zza, "zzf", zzazd.zza});
        }
        if (i2 == 3) {
            return new zzazi();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzazb(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zze() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }

    public final int zzg() {
        int iZza = zzaze.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzh() {
        int iZza = zzazh.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
