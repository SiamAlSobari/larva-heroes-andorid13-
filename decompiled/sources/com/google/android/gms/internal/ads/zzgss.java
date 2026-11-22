package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgss implements zzgtu {
    private static final zzgsy zza = new zzgsq();
    private final zzgsy zzb;

    public zzgss() {
        zzgsy zzgsyVar;
        zzgsy[] zzgsyVarArr = new zzgsy[2];
        zzgsyVarArr[0] = zzgrl.zza();
        try {
            zzgsyVar = (zzgsy) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzgsyVar = zza;
        }
        zzgsyVarArr[1] = zzgsyVar;
        zzgsr zzgsrVar = new zzgsr(zzgsyVarArr);
        byte[] bArr = zzgsa.zzd;
        this.zzb = zzgsrVar;
    }

    private static boolean zzb(zzgsx zzgsxVar) {
        return zzgsxVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtu
    public final zzgtt zza(Class cls) {
        zzgtv.zzr(cls);
        zzgsx zzgsxVarZzb = this.zzb.zzb(cls);
        if (zzgsxVarZzb.zzb()) {
            return zzgrq.class.isAssignableFrom(cls) ? zzgte.zzc(zzgtv.zzn(), zzgrf.zzb(), zzgsxVarZzb.zza()) : zzgte.zzc(zzgtv.zzm(), zzgrf.zza(), zzgsxVarZzb.zza());
        }
        if (zzgrq.class.isAssignableFrom(cls)) {
            return zzb(zzgsxVarZzb) ? zzgtd.zzl(cls, zzgsxVarZzb, zzgtg.zzb(), zzgso.zze(), zzgtv.zzn(), zzgrf.zzb(), zzgsw.zzb()) : zzgtd.zzl(cls, zzgsxVarZzb, zzgtg.zzb(), zzgso.zze(), zzgtv.zzn(), null, zzgsw.zzb());
        }
        return zzb(zzgsxVarZzb) ? zzgtd.zzl(cls, zzgsxVarZzb, zzgtg.zza(), zzgso.zzd(), zzgtv.zzm(), zzgrf.zza(), zzgsw.zza()) : zzgtd.zzl(cls, zzgsxVarZzb, zzgtg.zza(), zzgso.zzd(), zzgtv.zzm(), null, zzgsw.zza());
    }
}
