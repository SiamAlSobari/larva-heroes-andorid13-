package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapb extends zzgrq implements zzgtb {
    private static final zzapb zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzgqi zzg = zzgqi.zzb;

    static {
        zzapb zzapbVar = new zzapb();
        zzb = zzapbVar;
        zzgrq.zzaU(zzapb.class, zzapbVar);
    }

    private zzapb() {
    }

    public static zzapb zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzapb();
        }
        zzanu zzanuVar = null;
        if (i2 == 4) {
            return new zzapa(zzanuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zze() {
        return (this.zzd & 1) != 0;
    }
}
