package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaol extends zzgrq implements zzgtb {
    private static final zzaol zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        zzaol zzaolVar = new zzaol();
        zzb = zzaolVar;
        zzgrq.zzaU(zzaol.class, zzaolVar);
    }

    private zzaol() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzaoa.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzaol();
        }
        zzanu zzanuVar = null;
        if (i2 == 4) {
            return new zzaok(zzanuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
