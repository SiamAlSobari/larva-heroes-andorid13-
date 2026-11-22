package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaye extends zzgrq implements zzgtb {
    private static final zzaye zzb;
    private int zzd;
    private int zze;
    private zzazy zzf;

    static {
        zzaye zzayeVar = new zzaye();
        zzb = zzayeVar;
        zzgrq.zzaU(zzaye.class, zzayeVar);
    }

    private zzaye() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzayb.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzaye();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzayd(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
