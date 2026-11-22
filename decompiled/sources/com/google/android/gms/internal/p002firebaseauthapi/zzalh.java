package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzalh implements zzamc {
    private static final zzaln zza = new zzalf();
    private final zzaln zzb;

    public zzalh() {
        zzaln zzalnVar;
        zzaln[] zzalnVarArr = new zzaln[2];
        zzalnVarArr[0] = zzakf.zza();
        try {
            zzalnVar = (zzaln) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzalnVar = zza;
        }
        zzalnVarArr[1] = zzalnVar;
        zzalg zzalgVar = new zzalg(zzalnVarArr);
        byte[] bArr = zzakq.zzd;
        this.zzb = zzalgVar;
    }

    private static boolean zzb(zzalm zzalmVar) {
        return zzalmVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final zzamb zza(Class cls) {
        zzamd.zzr(cls);
        zzalm zzalmVarZzb = this.zzb.zzb(cls);
        if (zzalmVarZzb.zzb()) {
            return zzakk.class.isAssignableFrom(cls) ? zzalt.zzc(zzamd.zzn(), zzaka.zzb(), zzalmVarZzb.zza()) : zzalt.zzc(zzamd.zzm(), zzaka.zza(), zzalmVarZzb.zza());
        }
        if (zzakk.class.isAssignableFrom(cls)) {
            return zzb(zzalmVarZzb) ? zzals.zzl(cls, zzalmVarZzb, zzalv.zzb(), zzald.zze(), zzamd.zzn(), zzaka.zzb(), zzall.zzb()) : zzals.zzl(cls, zzalmVarZzb, zzalv.zzb(), zzald.zze(), zzamd.zzn(), null, zzall.zzb());
        }
        return zzb(zzalmVarZzb) ? zzals.zzl(cls, zzalmVarZzb, zzalv.zza(), zzald.zzd(), zzamd.zzm(), zzaka.zza(), zzall.zza()) : zzals.zzl(cls, zzalmVarZzb, zzalv.zza(), zzald.zzd(), zzamd.zzm(), null, zzall.zza());
    }
}
