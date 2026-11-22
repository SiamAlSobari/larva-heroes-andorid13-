package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzayk extends zzgrq implements zzgtb {
    private static final zzayk zzb;
    private int zzd;
    private int zze;
    private zzbac zzf;
    private zzbac zzg;
    private zzbac zzh;
    private zzgrz zzi = zzaN();
    private int zzj;

    static {
        zzayk zzaykVar = new zzayk();
        zzb = zzaykVar;
        zzgrq.zzaU(zzayk.class, zzaykVar);
    }

    private zzayk() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzbac.class, "zzj"});
        }
        if (i2 == 3) {
            return new zzayk();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzayj(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
