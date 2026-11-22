package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgmi extends zzgrq implements zzgtb {
    private static final zzgmi zzb;
    private int zzd;
    private zzgml zze;
    private int zzf;
    private int zzg;

    static {
        zzgmi zzgmiVar = new zzgmi();
        zzb = zzgmiVar;
        zzgrq.zzaU(zzgmi.class, zzgmiVar);
    }

    private zzgmi() {
    }

    public static zzgmh zzd() {
        return (zzgmh) zzb.zzaA();
    }

    public static zzgmi zzf() {
        return zzb;
    }

    public static zzgmi zzg(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgmi) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    static /* synthetic */ void zzi(zzgmi zzgmiVar, zzgml zzgmlVar) {
        zzgmlVar.getClass();
        zzgmiVar.zze = zzgmlVar;
        zzgmiVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgmi();
        }
        zzgmg zzgmgVar = null;
        if (i2 == 4) {
            return new zzgmh(zzgmgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zzg;
    }

    public final zzgml zzh() {
        zzgml zzgmlVar = this.zze;
        return zzgmlVar == null ? zzgml.zze() : zzgmlVar;
    }
}
