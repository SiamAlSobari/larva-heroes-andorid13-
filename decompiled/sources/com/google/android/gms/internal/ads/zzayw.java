package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzayw extends zzgrq implements zzgtb {
    private static final zzayw zzb;
    private int zzd;
    private int zzf;
    private zzbac zzh;
    private String zze = "";
    private zzgrv zzg = zzaJ();

    static {
        zzayw zzaywVar = new zzayw();
        zzb = zzaywVar;
        zzgrq.zzaU(zzayw.class, zzaywVar);
    }

    private zzayw() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzayr.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzayw();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzayv(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
