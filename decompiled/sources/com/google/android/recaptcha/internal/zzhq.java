package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhq implements zzim {
    private static final zzhw zza = new zzho();
    private final zzhw zzb;

    public zzhq() {
        zzhw zzhwVar;
        zzhw[] zzhwVarArr = new zzhw[2];
        zzhwVarArr[0] = zzgh.zza();
        try {
            zzhwVar = (zzhw) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzhwVar = zza;
        }
        zzhwVarArr[1] = zzhwVar;
        zzhp zzhpVar = new zzhp(zzhwVarArr);
        byte[] bArr = zzgw.zzd;
        this.zzb = zzhpVar;
    }

    private static boolean zzb(zzhv zzhvVar) {
        return zzhvVar.zzc() == 1;
    }

    @Override // com.google.android.recaptcha.internal.zzim
    public final zzil zza(Class cls) {
        zzin.zzF(cls);
        zzhv zzhvVarZzb = this.zzb.zzb(cls);
        if (zzhvVarZzb.zzb()) {
            return zzgo.class.isAssignableFrom(cls) ? zzic.zzc(zzin.zzA(), zzgc.zzb(), zzhvVarZzb.zza()) : zzic.zzc(zzin.zzy(), zzgc.zza(), zzhvVarZzb.zza());
        }
        if (zzgo.class.isAssignableFrom(cls)) {
            return zzb(zzhvVarZzb) ? zzib.zzm(cls, zzhvVarZzb, zzif.zzb(), zzhm.zze(), zzin.zzA(), zzgc.zzb(), zzhu.zzb()) : zzib.zzm(cls, zzhvVarZzb, zzif.zzb(), zzhm.zze(), zzin.zzA(), null, zzhu.zzb());
        }
        return zzb(zzhvVarZzb) ? zzib.zzm(cls, zzhvVarZzb, zzif.zza(), zzhm.zzd(), zzin.zzy(), zzgc.zza(), zzhu.zza()) : zzib.zzm(cls, zzhvVarZzb, zzif.zza(), zzhm.zzd(), zzin.zzz(), null, zzhu.zza());
    }
}
