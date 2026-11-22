package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzk extends zzxj implements zzyv {
    private static final zzk zza;
    private int zzd;
    private zzam zzk;
    private byte zzl = 2;
    private zzxr zze = zzah();
    private zzxr zzf = zzah();
    private zzxr zzg = zzah();
    private zzxr zzh = zzah();
    private zzxr zzi = zzah();
    private zzxr zzj = zzah();

    static {
        zzk zzkVar = new zzk();
        zza = zzkVar;
        zzxj.zzan(zzk.class, zzkVar);
    }

    private zzk() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return zzak(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0007\u0001Л\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0000", new Object[]{"zzd", "zze", zzg.class, "zzf", zzg.class, "zzg", zzg.class, "zzh", zzg.class, "zzi", zzg.class, "zzj", zzg.class, "zzk"});
        }
        if (i2 == 3) {
            return new zzk();
        }
        zzc zzcVar = null;
        if (i2 == 4) {
            return new zzj(zzcVar);
        }
        if (i2 == 5) {
            return zza;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
