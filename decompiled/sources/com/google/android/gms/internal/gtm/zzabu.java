package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabu extends zzxj implements zzyv {
    private static final zzabu zza;
    private byte zze = 2;
    private zzxr zzd = zzah();

    static {
        zzabu zzabuVar = new zzabu();
        zza = zzabuVar;
        zzxj.zzan(zzabu.class, zzabuVar);
    }

    private zzabu() {
    }

    public static zzabu zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i2 == 2) {
            return zzak(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", zzabt.class});
        }
        if (i2 == 3) {
            return new zzabu();
        }
        zzabo zzaboVar = null;
        if (i2 == 4) {
            return new zzabr(zzaboVar);
        }
        if (i2 == 5) {
            return zza;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
