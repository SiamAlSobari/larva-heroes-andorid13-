package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgkt extends zzgrq implements zzgtb {
    private static final zzgkt zzb;
    private int zzd;
    private int zze;
    private zzgkz zzf;
    private zzgqi zzg = zzgqi.zzb;

    static {
        zzgkt zzgktVar = new zzgkt();
        zzb = zzgktVar;
        zzgrq.zzaU(zzgkt.class, zzgktVar);
    }

    private zzgkt() {
    }

    public static zzgks zzc() {
        return (zzgks) zzb.zzaA();
    }

    public static zzgkt zze() {
        return zzb;
    }

    public static zzgkt zzf(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgkt) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    static /* synthetic */ void zzj(zzgkt zzgktVar, zzgkz zzgkzVar) {
        zzgkzVar.getClass();
        zzgktVar.zzf = zzgkzVar;
        zzgktVar.zzd |= 1;
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
            return new zzgkt();
        }
        zzgkr zzgkrVar = null;
        if (i2 == 4) {
            return new zzgks(zzgkrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkz zzg() {
        zzgkz zzgkzVar = this.zzf;
        return zzgkzVar == null ? zzgkz.zze() : zzgkzVar;
    }

    public final zzgqi zzh() {
        return this.zzg;
    }
}
