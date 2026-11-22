package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaon extends zzgrq implements zzgtb {
    private static final zzaon zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        zzaon zzaonVar = new zzaon();
        zzb = zzaonVar;
        zzgrq.zzaU(zzaon.class, zzaonVar);
    }

    private zzaon() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzaoy.zza});
        }
        if (i2 == 3) {
            return new zzaon();
        }
        zzanu zzanuVar = null;
        if (i2 == 4) {
            return new zzaom(zzanuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
