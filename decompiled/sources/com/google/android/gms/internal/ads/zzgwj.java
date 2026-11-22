package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgwj extends zzgrq implements zzgtb {
    private static final zzgwj zzb;
    private int zzd;
    private zzgqi zze = zzgqi.zzb;
    private zzgqi zzf;
    private zzgqi zzg;

    static {
        zzgwj zzgwjVar = new zzgwj();
        zzb = zzgwjVar;
        zzgrq.zzaU(zzgwj.class, zzgwjVar);
    }

    private zzgwj() {
        zzgqi zzgqiVar = zzgqi.zzb;
        this.zzf = zzgqiVar;
        this.zzg = zzgqiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgwj();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgwi(zzgvkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
