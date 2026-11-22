package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzanj extends zzgrq implements zzgtb {
    private static final zzanj zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzanj zzanjVar = new zzanj();
        zzb = zzanjVar;
        zzgrq.zzaU(zzanj.class, zzanjVar);
    }

    private zzanj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzanj();
        }
        zzang zzangVar = null;
        if (i2 == 4) {
            return new zzani(zzangVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
