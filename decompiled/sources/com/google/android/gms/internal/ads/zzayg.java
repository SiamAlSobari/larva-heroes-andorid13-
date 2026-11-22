package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzayg extends zzgrq implements zzgtb {
    private static final zzayg zzb;
    private int zzd;
    private String zze = "";
    private zzgrz zzf = zzaN();
    private int zzg;

    static {
        zzayg zzaygVar = new zzayg();
        zzb = zzaygVar;
        zzgrq.zzaU(zzayg.class, zzaygVar);
    }

    private zzayg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzaye.class, "zzg", zzayr.zza});
        }
        if (i2 == 3) {
            return new zzayg();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzayf(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
