package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgsm extends zzgso {
    private zzgsm() {
        super(null);
    }

    /* synthetic */ zzgsm(zzgsl zzgslVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgso
    final List zza(Object obj, long j) {
        zzgrz zzgrzVar = (zzgrz) zzguu.zzh(obj, j);
        if (zzgrzVar.zzc()) {
            return zzgrzVar;
        }
        int size = zzgrzVar.size();
        zzgrz zzgrzVarZzd = zzgrzVar.zzd(size == 0 ? 10 : size + size);
        zzguu.zzv(obj, j, zzgrzVarZzd);
        return zzgrzVarZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgso
    final void zzb(Object obj, long j) {
        ((zzgrz) zzguu.zzh(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgso
    final void zzc(Object obj, Object obj2, long j) {
        zzgrz zzgrzVarZzd = (zzgrz) zzguu.zzh(obj, j);
        zzgrz zzgrzVar = (zzgrz) zzguu.zzh(obj2, j);
        int size = zzgrzVarZzd.size();
        int size2 = zzgrzVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzgrzVarZzd.zzc()) {
                zzgrzVarZzd = zzgrzVarZzd.zzd(size2 + size);
            }
            zzgrzVarZzd.addAll(zzgrzVar);
        }
        if (size > 0) {
            zzgrzVar = zzgrzVarZzd;
        }
        zzguu.zzv(obj, j, zzgrzVar);
    }
}
