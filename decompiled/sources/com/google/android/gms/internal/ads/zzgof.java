package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgof extends zzgrq implements zzgtb {
    private static final zzgof zzb;
    private int zzd;

    static {
        zzgof zzgofVar = new zzgof();
        zzb = zzgofVar;
        zzgrq.zzaU(zzgof.class, zzgofVar);
    }

    private zzgof() {
    }

    public static zzgof zzd() {
        return zzb;
    }

    public static zzgof zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgof) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
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
            return zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzgof();
        }
        zzgod zzgodVar = null;
        if (i2 == 4) {
            return new zzgoe(zzgodVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
