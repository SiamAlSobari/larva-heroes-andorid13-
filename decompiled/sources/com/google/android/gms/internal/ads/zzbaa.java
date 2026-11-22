package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbaa extends zzgrq implements zzgtb {
    private static final zzbaa zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private zzbac zzg;

    static {
        zzbaa zzbaaVar = new zzbaa();
        zzb = zzbaaVar;
        zzgrq.zzaU(zzbaa.class, zzbaaVar);
    }

    private zzbaa() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzayr.zza, "zzg"});
        }
        if (i2 == 3) {
            return new zzbaa();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzazz(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
