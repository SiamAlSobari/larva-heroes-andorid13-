package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaav extends zzxj implements zzyv {
    private static final zzaav zza;
    private int zzd;
    private int zze;
    private String zzf = "*";

    static {
        zzaav zzaavVar = new zzaav();
        zza = zzaavVar;
        zzxj.zzan(zzaav.class, zzaavVar);
    }

    private zzaav() {
    }

    public static zzaav zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzak(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzaax.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzaav();
        }
        zzaat zzaatVar = null;
        if (i2 == 4) {
            return new zzaau(zzaatVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
