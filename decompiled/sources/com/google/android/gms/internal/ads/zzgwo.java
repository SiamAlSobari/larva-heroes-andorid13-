package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgwo extends zzgrq implements zzgtb {
    private static final zzgwo zzb;
    private int zzd;
    private zzgwn zze;
    private zzgqi zzh;
    private int zzi;
    private zzgqi zzj;
    private byte zzk = 2;
    private zzgrz zzf = zzaN();
    private zzgqi zzg = zzgqi.zzb;

    static {
        zzgwo zzgwoVar = new zzgwo();
        zzb = zzgwoVar;
        zzgrq.zzaU(zzgwo.class, zzgwoVar);
    }

    private zzgwo() {
        zzgqi zzgqiVar = zzgqi.zzb;
        this.zzh = zzgqiVar;
        this.zzj = zzgqiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", zzgwg.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzgwo();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgwl(zzgvkVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
