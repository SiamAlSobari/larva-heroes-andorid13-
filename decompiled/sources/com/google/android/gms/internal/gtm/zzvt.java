package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvt extends zzxj implements zzyv {
    private static final zzvt zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzvt zzvtVar = new zzvt();
        zza = zzvtVar;
        zzxj.zzan(zzvt.class, zzvtVar);
    }

    private zzvt() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzzf(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzvt();
        }
        zzus zzusVar = null;
        if (i2 == 4) {
            return new zzvs(zzusVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
