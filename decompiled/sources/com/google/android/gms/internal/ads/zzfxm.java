package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfxm extends zzfxo {
    zzfxm(zzfty zzftyVar, boolean z) {
        super(zzftyVar, z);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList arrayListZza = zzfur.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfxn zzfxnVar = (zzfxn) it.next();
            arrayListZza.add(zzfxnVar != null ? zzfxnVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZza);
    }
}
