package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgws extends zzgrq implements zzgtb {
    private static final zzgws zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzgws zzgwsVar = new zzgws();
        zzb = zzgwsVar;
        zzgrq.zzaU(zzgws.class, zzgwsVar);
    }

    private zzgws() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgru zzgruVar = zzgwq.zza;
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", zzgruVar, "zzf", "zzg", zzgruVar});
        }
        if (i2 == 3) {
            return new zzgws();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgwr(zzgvkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
