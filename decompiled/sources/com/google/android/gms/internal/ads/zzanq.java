package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzanq extends zzgrq implements zzgtb {
    private static final zzanq zzb;
    private int zzd;
    private int zze = 2;

    static {
        zzanq zzanqVar = new zzanq();
        zzb = zzanqVar;
        zzgrq.zzaU(zzanq.class, zzanqVar);
    }

    private zzanq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzd", "zze", zzanr.zza});
        }
        if (i2 == 3) {
            return new zzanq();
        }
        zzanm zzanmVar = null;
        if (i2 == 4) {
            return new zzanp(zzanmVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
