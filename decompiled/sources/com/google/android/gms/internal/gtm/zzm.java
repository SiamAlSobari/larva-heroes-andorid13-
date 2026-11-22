package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzm extends zzxj implements zzyv {
    private static final zzm zza;
    private byte zzf = 2;
    private zzxr zzd = zzah();
    private zzxr zze = zzah();

    static {
        zzm zzmVar = new zzm();
        zza = zzmVar;
        zzxj.zzan(zzm.class, zzmVar);
    }

    private zzm() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i2 == 2) {
            return zzak(zza, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"zzd", zzk.class, "zze", zzg.class});
        }
        if (i2 == 3) {
            return new zzm();
        }
        zzc zzcVar = null;
        if (i2 == 4) {
            return new zzl(zzcVar);
        }
        if (i2 == 5) {
            return zza;
        }
        this.zzf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
