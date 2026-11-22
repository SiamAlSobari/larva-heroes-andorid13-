package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgwe extends zzgrq implements zzgtb {
    private static final zzgwe zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        zzgwe zzgweVar = new zzgwe();
        zzb = zzgweVar;
        zzgrq.zzaU(zzgwe.class, zzgweVar);
    }

    private zzgwe() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", zzgwd.zza, "zzf", zzgwb.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgwe();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgwc(zzgvkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
