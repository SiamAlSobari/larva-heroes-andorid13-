package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgsr implements zzgsy {
    private final zzgsy[] zza;

    zzgsr(zzgsy... zzgsyVarArr) {
        this.zza = zzgsyVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    public final zzgsx zzb(Class cls) {
        zzgsy[] zzgsyVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzgsy zzgsyVar = zzgsyVarArr[i];
            if (zzgsyVar.zzc(cls)) {
                return zzgsyVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    public final boolean zzc(Class cls) {
        zzgsy[] zzgsyVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzgsyVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
