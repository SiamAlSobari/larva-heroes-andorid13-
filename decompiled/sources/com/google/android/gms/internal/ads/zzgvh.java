package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgvh extends zzgrq implements zzgtb {
    private static final zzgvh zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        zzgvh zzgvhVar = new zzgvh();
        zzb = zzgvhVar;
        zzgrq.zzaU(zzgvh.class, zzgvhVar);
    }

    private zzgvh() {
    }

    public static zzgvg zza() {
        return (zzgvg) zzb.zzaA();
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgvh();
        }
        zzgvf zzgvfVar = null;
        if (i2 == 4) {
            return new zzgvg(zzgvfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
