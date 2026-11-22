package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgww extends zzgrq implements zzgtb {
    private static final zzgww zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        zzgww zzgwwVar = new zzgww();
        zzb = zzgwwVar;
        zzgrq.zzaU(zzgww.class, zzgwwVar);
    }

    private zzgww() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", zzgwv.zza, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgww();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgwu(zzgvkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
