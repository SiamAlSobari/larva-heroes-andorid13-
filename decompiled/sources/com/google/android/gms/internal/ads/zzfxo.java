package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfxo extends zzfxd {

    @CheckForNull
    private List zza;

    zzfxo(zzfty zzftyVar, boolean z) {
        super(zzftyVar, z, true);
        List listEmptyList = zzftyVar.isEmpty() ? Collections.emptyList() : zzfur.zza(zzftyVar.size());
        for (int i = 0; i < zzftyVar.size(); i++) {
            listEmptyList.add(null);
        }
        this.zza = listEmptyList;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzfxd
    final void zzf(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzfxn(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxd
    final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxd
    final void zzy(int i) {
        super.zzy(i);
        this.zza = null;
    }
}
