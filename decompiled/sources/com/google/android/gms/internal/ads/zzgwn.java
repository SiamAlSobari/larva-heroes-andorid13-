package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgwn extends zzgrq implements zzgtb {
    private static final zzgwn zzb;
    private int zzd;
    private int zze;
    private zzgqi zzf = zzgqi.zzb;
    private zzgqi zzg = zzgqi.zzb;

    static {
        zzgwn zzgwnVar = new zzgwn();
        zzb = zzgwnVar;
        zzgrq.zzaU(zzgwn.class, zzgwnVar);
    }

    private zzgwn() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgwn();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgwm(zzgvkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
