package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzglo extends zzgrq implements zzgtb {
    private static final zzglo zzb;
    private int zzd;
    private int zze;

    static {
        zzglo zzgloVar = new zzglo();
        zzb = zzgloVar;
        zzgrq.zzaU(zzglo.class, zzgloVar);
    }

    private zzglo() {
    }

    public static zzgln zzd() {
        return (zzgln) zzb.zzaA();
    }

    public static zzglo zzf(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzglo) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzglo();
        }
        zzglm zzglmVar = null;
        if (i2 == 4) {
            return new zzgln(zzglmVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zze;
    }
}
