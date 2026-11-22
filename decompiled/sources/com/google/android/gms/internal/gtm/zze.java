package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zze extends zzxj implements zzyv {
    public static final zzxh zza;
    private static final zze zzd;
    private int zze;
    private zzm zzf;
    private zzg zzg;
    private byte zzh = 2;

    static {
        zze zzeVar = new zze();
        zzd = zzeVar;
        zzxj.zzan(zze.class, zzeVar);
        zza = zzxj.zzab(zzam.zzj(), zzeVar, zzeVar, null, 47497405, zzaao.MESSAGE, zze.class);
    }

    private zze() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return zzak(zzd, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zze();
        }
        zzc zzcVar = null;
        if (i2 == 4) {
            return new zzd(zzcVar);
        }
        if (i2 == 5) {
            return zzd;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
