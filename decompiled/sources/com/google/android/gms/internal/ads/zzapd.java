package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapd extends zzgrq implements zzgtb {
    private static final zzapd zzb;
    private int zzd;
    private String zze = "";

    static {
        zzapd zzapdVar = new zzapd();
        zzb = zzapdVar;
        zzgrq.zzaU(zzapd.class, zzapdVar);
    }

    private zzapd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzapd();
        }
        zzanu zzanuVar = null;
        if (i2 == 4) {
            return new zzapc(zzanuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
