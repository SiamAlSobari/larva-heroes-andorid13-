package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabj extends zzxj implements zzyv {
    private static final zzabj zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;

    static {
        zzabj zzabjVar = new zzabj();
        zza = zzabjVar;
        zzxj.zzan(zzabj.class, zzabjVar);
    }

    private zzabj() {
    }

    public static zzabj zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzak(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဇ\b\nဇ\t\u000bဇ\u000b\fဇ\r\rဇ\f\u000eဇ\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzp", "zzr", "zzq", "zzo"});
        }
        if (i2 == 3) {
            return new zzabj();
        }
        zzaaz zzaazVar = null;
        if (i2 == 4) {
            return new zzabi(zzaazVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
