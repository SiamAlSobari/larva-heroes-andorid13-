package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgxt extends zzgrq implements zzgtb {
    private static final zzgxt zzb;
    private int zzd;
    private int zze;
    private int zzh;
    private String zzf = "";
    private zzgrv zzg = zzaJ();
    private zzgrz zzi = zzaN();
    private zzgqi zzj = zzgqi.zzb;

    static {
        zzgxt zzgxtVar = new zzgxt();
        zzb = zzgxtVar;
        zzgrq.zzaU(zzgxt.class, zzgxtVar);
    }

    private zzgxt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzgxr.class, "zzj"});
        }
        if (i2 == 3) {
            return new zzgxt();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgxs(zzgvkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
