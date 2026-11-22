package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzban extends zzgrq implements zzgtb {
    private static final zzban zzb;
    private int zzd;
    private zzbae zze;
    private int zzf = 1000;
    private zzbal zzg;
    private zzbac zzh;

    static {
        zzban zzbanVar = new zzban();
        zzb = zzbanVar;
        zzgrq.zzaU(zzban.class, zzbanVar);
    }

    private zzban() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", zzayr.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzban();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzbam(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
