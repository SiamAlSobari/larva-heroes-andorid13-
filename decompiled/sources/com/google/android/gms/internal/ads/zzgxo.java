package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgxo extends zzgrq implements zzgtb {
    private static final zzgxo zzb;
    private int zzd;
    private String zze = "";
    private zzgqi zzf = zzgqi.zzb;

    static {
        zzgxo zzgxoVar = new zzgxo();
        zzb = zzgxoVar;
        zzgrq.zzaU(zzgxo.class, zzgxoVar);
    }

    private zzgxo() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgxo();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgxn(zzgvkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
