package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaza extends zzgrq implements zzgtb {
    private static final zzaza zzb;
    private int zzd;
    private zzayw zze;
    private zzgrz zzf = zzaN();
    private int zzg;
    private zzbac zzh;

    static {
        zzaza zzazaVar = new zzaza();
        zzb = zzazaVar;
        zzgrq.zzaU(zzaza.class, zzazaVar);
    }

    private zzaza() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzbaa.class, "zzg", zzayr.zza, "zzh"});
        }
        if (i2 == 3) {
            return new zzaza();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzayz(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
