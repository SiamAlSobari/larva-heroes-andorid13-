package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaou extends zzgrq implements zzgtb {
    private static final zzaou zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzgrv zzh = zzaJ();
    private long zzi;

    static {
        zzaou zzaouVar = new zzaou();
        zzb = zzaouVar;
        zzgrq.zzaU(zzaou.class, zzaouVar);
    }

    private zzaou() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzaou();
        }
        zzanu zzanuVar = null;
        if (i2 == 4) {
            return new zzaot(zzanuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
