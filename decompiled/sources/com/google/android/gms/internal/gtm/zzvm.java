package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvm extends zzxf implements zzyv {
    private static final zzvm zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private byte zzl = 2;

    static {
        zzvm zzvmVar = new zzvm();
        zzd = zzvmVar;
        zzxj.zzan(zzvm.class, zzvmVar);
    }

    private zzvm() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return new zzzf(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zze", "zzf", zzuy.zza, "zzg", zzuv.zza, "zzh", zzvh.zza, "zzi", zzvk.zza, "zzj", zzve.zza, "zzk", zzvb.zza});
        }
        if (i2 == 3) {
            return new zzvm();
        }
        zzus zzusVar = null;
        if (i2 == 4) {
            return new zzut(zzusVar);
        }
        if (i2 == 5) {
            return zzd;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
