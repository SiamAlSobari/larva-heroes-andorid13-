package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzalb extends zzald {
    private zzalb() {
        super(null);
    }

    /* synthetic */ zzalb(zzala zzalaVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    final List zza(Object obj, long j) {
        zzakp zzakpVar = (zzakp) zzanf.zzf(obj, j);
        if (zzakpVar.zzc()) {
            return zzakpVar;
        }
        int size = zzakpVar.size();
        zzakp zzakpVarZzd = zzakpVar.zzd(size == 0 ? 10 : size + size);
        zzanf.zzs(obj, j, zzakpVarZzd);
        return zzakpVarZzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    final void zzb(Object obj, long j) {
        ((zzakp) zzanf.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    final void zzc(Object obj, Object obj2, long j) {
        zzakp zzakpVarZzd = (zzakp) zzanf.zzf(obj, j);
        zzakp zzakpVar = (zzakp) zzanf.zzf(obj2, j);
        int size = zzakpVarZzd.size();
        int size2 = zzakpVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzakpVarZzd.zzc()) {
                zzakpVarZzd = zzakpVarZzd.zzd(size2 + size);
            }
            zzakpVarZzd.addAll(zzakpVar);
        }
        if (size > 0) {
            zzakpVar = zzakpVarZzd;
        }
        zzanf.zzs(obj, j, zzakpVar);
    }
}
