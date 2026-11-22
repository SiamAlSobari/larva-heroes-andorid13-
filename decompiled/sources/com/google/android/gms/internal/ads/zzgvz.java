package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgvz extends zzgrq implements zzgtb {
    private static final zzgvz zzb;
    private int zzd;
    private zzgqi zze = zzgqi.zzb;

    static {
        zzgvz zzgvzVar = new zzgvz();
        zzb = zzgvzVar;
        zzgrq.zzaU(zzgvz.class, zzgvzVar);
    }

    private zzgvz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzgvz();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgvy(zzgvkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
