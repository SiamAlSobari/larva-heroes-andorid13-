package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzglx extends zzgrq implements zzgtb {
    private static final zzglx zzb;
    private int zzd;
    private zzgqi zze = zzgqi.zzb;

    static {
        zzglx zzglxVar = new zzglx();
        zzb = zzglxVar;
        zzgrq.zzaU(zzglx.class, zzglxVar);
    }

    private zzglx() {
    }

    public static zzglw zzc() {
        return (zzglw) zzb.zzaA();
    }

    public static zzglx zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzglx) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
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
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzglx();
        }
        zzglv zzglvVar = null;
        if (i2 == 4) {
            return new zzglw(zzglvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgqi zzf() {
        return this.zze;
    }
}
