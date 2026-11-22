package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgmf extends zzgrq implements zzgtb {
    private static final zzgmf zzb;
    private int zzd;
    private int zze;
    private zzgml zzf;
    private zzgqi zzg = zzgqi.zzb;

    static {
        zzgmf zzgmfVar = new zzgmf();
        zzb = zzgmfVar;
        zzgrq.zzaU(zzgmf.class, zzgmfVar);
    }

    private zzgmf() {
    }

    public static zzgme zzc() {
        return (zzgme) zzb.zzaA();
    }

    public static zzgmf zze() {
        return zzb;
    }

    public static zzgmf zzf(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgmf) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    static /* synthetic */ void zzj(zzgmf zzgmfVar, zzgml zzgmlVar) {
        zzgmlVar.getClass();
        zzgmfVar.zzf = zzgmlVar;
        zzgmfVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgmf();
        }
        zzgmd zzgmdVar = null;
        if (i2 == 4) {
            return new zzgme(zzgmdVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgml zzg() {
        zzgml zzgmlVar = this.zzf;
        return zzgmlVar == null ? zzgml.zze() : zzgmlVar;
    }

    public final zzgqi zzh() {
        return this.zzg;
    }
}
