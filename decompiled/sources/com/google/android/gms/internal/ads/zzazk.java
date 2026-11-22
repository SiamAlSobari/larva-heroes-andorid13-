package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzazk extends zzgrq implements zzgtb {
    private static final zzazk zzb;
    private int zzd;
    private int zze;
    private zzbac zzf;

    static {
        zzazk zzazkVar = new zzazk();
        zzb = zzazkVar;
        zzgrq.zzaU(zzazk.class, zzazkVar);
    }

    private zzazk() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzayr.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzazk();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzazj(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
