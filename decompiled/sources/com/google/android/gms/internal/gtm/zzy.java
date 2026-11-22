package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzy extends zzxj implements zzyv {
    private static final zzy zza;
    private byte zzg = 2;
    private zzxr zzd = zzah();
    private zzxr zze = zzah();
    private zzxr zzf = zzah();

    static {
        zzy zzyVar = new zzy();
        zza = zzyVar;
        zzxj.zzan(zzy.class, zzyVar);
    }

    private zzy() {
    }

    public static zzy zzc() {
        return zza;
    }

    public final List zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zze;
    }

    public final List zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return zzak(zza, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0002\u0001Л\u0002Л\u0003\u001b", new Object[]{"zzd", zzam.class, "zze", zzam.class, "zzf", zzw.class});
        }
        if (i2 == 3) {
            return new zzy();
        }
        zzn zznVar = null;
        if (i2 == 4) {
            return new zzx(zznVar);
        }
        if (i2 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
