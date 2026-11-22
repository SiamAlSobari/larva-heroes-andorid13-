package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyg extends zzyi {
    private zzyg() {
        super(null);
    }

    /* synthetic */ zzyg(zzyf zzyfVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.gtm.zzyi
    final List zza(Object obj, long j) {
        zzxr zzxrVar = (zzxr) zzaai.zzf(obj, j);
        if (zzxrVar.zzc()) {
            return zzxrVar;
        }
        int size = zzxrVar.size();
        zzxr zzxrVarZzd = zzxrVar.zzd(size == 0 ? 10 : size + size);
        zzaai.zzs(obj, j, zzxrVarZzd);
        return zzxrVarZzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzyi
    final void zzb(Object obj, long j) {
        ((zzxr) zzaai.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzyi
    final void zzc(Object obj, Object obj2, long j) {
        zzxr zzxrVarZzd = (zzxr) zzaai.zzf(obj, j);
        zzxr zzxrVar = (zzxr) zzaai.zzf(obj2, j);
        int size = zzxrVarZzd.size();
        int size2 = zzxrVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzxrVarZzd.zzc()) {
                zzxrVarZzd = zzxrVarZzd.zzd(size2 + size);
            }
            zzxrVarZzd.addAll(zzxrVar);
        }
        if (size > 0) {
            zzxrVar = zzxrVarZzd;
        }
        zzaai.zzs(obj, j, zzxrVar);
    }
}
