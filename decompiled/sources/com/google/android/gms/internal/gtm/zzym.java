package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzym implements zzzi {
    private static final zzys zza = new zzyk();
    private final zzys zzb;

    public zzym() {
        zzys zzysVar;
        zzys[] zzysVarArr = new zzys[2];
        zzysVarArr[0] = zzxc.zza();
        try {
            zzysVar = (zzys) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzysVar = zza;
        }
        zzysVarArr[1] = zzysVar;
        zzyl zzylVar = new zzyl(zzysVarArr);
        byte[] bArr = zzxs.zzd;
        this.zzb = zzylVar;
    }

    private static boolean zzb(zzyr zzyrVar) {
        return zzyrVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final zzzh zza(Class cls) {
        zzzj.zzE(cls);
        zzyr zzyrVarZzb = this.zzb.zzb(cls);
        if (zzyrVarZzb.zzb()) {
            return zzxj.class.isAssignableFrom(cls) ? zzyy.zzc(zzzj.zzz(), zzww.zzb(), zzyrVarZzb.zza()) : zzyy.zzc(zzzj.zzy(), zzww.zza(), zzyrVarZzb.zza());
        }
        if (zzxj.class.isAssignableFrom(cls)) {
            return zzb(zzyrVarZzb) ? zzyx.zzl(cls, zzyrVarZzb, zzzb.zzb(), zzyi.zze(), zzzj.zzz(), zzww.zzb(), zzyq.zzb()) : zzyx.zzl(cls, zzyrVarZzb, zzzb.zzb(), zzyi.zze(), zzzj.zzz(), null, zzyq.zzb());
        }
        return zzb(zzyrVarZzb) ? zzyx.zzl(cls, zzyrVarZzb, zzzb.zza(), zzyi.zzd(), zzzj.zzy(), zzww.zza(), zzyq.zza()) : zzyx.zzl(cls, zzyrVarZzb, zzzb.zza(), zzyi.zzd(), zzzj.zzy(), null, zzyq.zza());
    }
}
