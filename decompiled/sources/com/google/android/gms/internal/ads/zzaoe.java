package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaoe extends zzgrq implements zzgtb {
    private static final zzaoe zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        zzaoe zzaoeVar = new zzaoe();
        zzb = zzaoeVar;
        zzgrq.zzaU(zzaoe.class, zzaoeVar);
    }

    private zzaoe() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgru zzgruVar = zzaoy.zza;
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", zzgruVar, "zzg", zzgruVar});
        }
        if (i2 == 3) {
            return new zzaoe();
        }
        zzanu zzanuVar = null;
        if (i2 == 4) {
            return new zzaod(zzanuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
