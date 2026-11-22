package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyl implements zzys {
    private final zzys[] zza;

    zzyl(zzys... zzysVarArr) {
        this.zza = zzysVarArr;
    }

    @Override // com.google.android.gms.internal.gtm.zzys
    public final zzyr zzb(Class cls) {
        zzys[] zzysVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzys zzysVar = zzysVarArr[i];
            if (zzysVar.zzc(cls)) {
                return zzysVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.gtm.zzys
    public final boolean zzc(Class cls) {
        zzys[] zzysVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzysVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
