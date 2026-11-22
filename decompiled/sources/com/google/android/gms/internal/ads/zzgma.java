package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgma extends zzgrq implements zzgtb {
    private static final zzgma zzb;

    static {
        zzgma zzgmaVar = new zzgma();
        zzb = zzgmaVar;
        zzgrq.zzaU(zzgma.class, zzgmaVar);
    }

    private zzgma() {
    }

    public static zzgma zzc() {
        return zzb;
    }

    public static zzgma zzd(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgma) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        zzgly zzglyVar = null;
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new zzgma();
        }
        if (i2 == 4) {
            return new zzglz(zzglyVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
