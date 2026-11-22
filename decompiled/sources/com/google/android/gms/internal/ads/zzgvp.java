package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgvp extends zzgrq implements zzgtb {
    private static final zzgvp zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private zzgqi zzg = zzgqi.zzb;

    static {
        zzgvp zzgvpVar = new zzgvp();
        zzb = zzgvpVar;
        zzgrq.zzaU(zzgvp.class, zzgvpVar);
    }

    private zzgvp() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", zzgvo.zza, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgvp();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgvn(zzgvkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
