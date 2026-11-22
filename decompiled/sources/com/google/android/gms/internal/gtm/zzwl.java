package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwl extends zzxf implements zzyv {
    private static final zzwl zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzk;
    private zzvm zzl;
    private byte zzn = 2;
    private String zzj = "";
    private zzxr zzm = zzze.zze();

    static {
        zzwl zzwlVar = new zzwl();
        zzd = zzwlVar;
        zzxj.zzan(zzwl.class, zzwlVar);
    }

    private zzwl() {
    }

    public static zzwl zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i2 == 2) {
            return new zzzf(zzd, "\u0001\b\u0000\u0001\u0001ϧ\b\u0000\u0001\u0002\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\nဈ\u0004\u000bဇ\u0005\fᐉ\u0006ϧЛ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzwp.class});
        }
        if (i2 == 3) {
            return new zzwl();
        }
        zzus zzusVar = null;
        if (i2 == 4) {
            return new zzwk(zzusVar);
        }
        if (i2 == 5) {
            return zzd;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
