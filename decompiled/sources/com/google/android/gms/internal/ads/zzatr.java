package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzatr extends zzgrq implements zzgtb {
    private static final zzatr zzb;
    private int zzd;
    private zzatu zze;
    private zzgqi zzf = zzgqi.zzb;
    private zzgqi zzg = zzgqi.zzb;

    static {
        zzatr zzatrVar = new zzatr();
        zzb = zzatrVar;
        zzgrq.zzaU(zzatr.class, zzatrVar);
    }

    private zzatr() {
    }

    public static zzatr zzc(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzatr) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzatr();
        }
        zzatp zzatpVar = null;
        if (i2 == 4) {
            return new zzatq(zzatpVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzatu zzd() {
        zzatu zzatuVar = this.zze;
        return zzatuVar == null ? zzatu.zzg() : zzatuVar;
    }

    public final zzgqi zze() {
        return this.zzg;
    }

    public final zzgqi zzf() {
        return this.zzf;
    }
}
