package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzayp extends zzgrq implements zzgtb {
    private static final zzayp zzb;
    private int zzd;
    private int zze;
    private zzbae zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzayp zzaypVar = new zzayp();
        zzb = zzaypVar;
        zzgrq.zzaU(zzayp.class, zzaypVar);
    }

    private zzayp() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", zzayo.zza, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzayp();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzayn(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
