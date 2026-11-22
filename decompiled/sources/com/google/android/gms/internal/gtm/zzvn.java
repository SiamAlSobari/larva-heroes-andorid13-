package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvn extends zzxf implements zzyv {
    private static final zzxp zzd = new zzxp<Integer, zzwc>() { // from class: com.google.android.gms.internal.gtm.zzvn.1
        @Override // com.google.android.gms.internal.gtm.zzxp
        public /* bridge */ /* synthetic */ zzwc zzb(Integer num) {
            throw null;
        }
    };
    private static final zzvn zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzo;
    private boolean zzq;
    private boolean zzr;
    private int zzs;
    private zzvm zzv;
    private int zzx;
    private byte zzy = 2;
    private zzxr zzn = zzze.zze();
    private boolean zzp = true;
    private zzxo zzt = zzxk.zzf();
    private zzxr zzu = zzze.zze();
    private zzxr zzw = zzze.zze();

    static {
        zzvn zzvnVar = new zzvn();
        zze = zzvnVar;
        zzxj.zzan(zzvn.class, zzvnVar);
    }

    private zzvn() {
    }

    public static zzvn zze() {
        return zze;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzy);
        }
        if (i2 == 2) {
            return new zzzf(zze, "\u0001\u0012\u0000\u0001\u0001ϧ\u0012\u0000\u0004\u0002\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0005\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0006\u000b\u001b\fဇ\u0007\rဇ\b\u000eဇ\t\u000fဇ\u0004\u0010ဇ\n\u0011᠌\u000b\u0012᠌\r\u0013ࠞ\u0014\u001b\u0015ᐉ\fϧЛ", new Object[]{"zzf", "zzg", zzvq.zza, "zzh", "zzl", "zzj", "zzi", zzvv.zza, "zzm", "zzn", zzwe.class, "zzo", "zzp", "zzq", "zzk", "zzr", "zzs", zzvy.zza, "zzx", zzwb.zza, "zzt", zzwb.zza, "zzu", zzvt.class, "zzv", "zzw", zzwp.class});
        }
        if (i2 == 3) {
            return new zzvn();
        }
        zzus zzusVar = null;
        if (i2 == 4) {
            return new zzvo(zzusVar);
        }
        if (i2 == 5) {
            return zze;
        }
        this.zzy = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
