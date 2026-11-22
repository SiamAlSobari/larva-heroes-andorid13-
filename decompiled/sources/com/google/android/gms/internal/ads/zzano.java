package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzano extends zzgrq implements zzgtb {
    private static final zzano zzb;
    private int zzd;
    private zzanq zze;
    private zzant zzf;

    static {
        zzano zzanoVar = new zzano();
        zzb = zzanoVar;
        zzgrq.zzaU(zzano.class, zzanoVar);
    }

    private zzano() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzano();
        }
        zzanm zzanmVar = null;
        if (i2 == 4) {
            return new zzann(zzanmVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
