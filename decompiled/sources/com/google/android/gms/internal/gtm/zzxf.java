package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzxf extends zzxj implements zzyv {
    protected zzwy zza = zzwy.zze();

    private final void zzc(zzxh zzxhVar) {
        if (zzxhVar.zza != ((zzxj) zzb(6, null, null))) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    final zzwy zzT() {
        if (this.zza.zzl()) {
            this.zza = this.zza.clone();
        }
        return this.zza;
    }

    public final Object zzU(zzwr zzwrVar) {
        zzxh zzxhVar = (zzxh) zzwrVar;
        zzc(zzxhVar);
        Object objZzf = this.zza.zzf(zzxhVar.zzd);
        if (objZzf == null) {
            return zzxhVar.zzb;
        }
        zzxg zzxgVar = zzxhVar.zzd;
        if (!zzxgVar.zzd) {
            return zzxhVar.zza(objZzf);
        }
        if (zzxgVar.zzc.zza() != zzaap.ENUM) {
            return objZzf;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) objZzf).iterator();
        while (it.hasNext()) {
            arrayList.add(zzxhVar.zza(it.next()));
        }
        return arrayList;
    }

    public final boolean zzV(zzwr zzwrVar) {
        zzxh zzxhVar = (zzxh) zzwrVar;
        zzc(zzxhVar);
        zzwy zzwyVar = this.zza;
        zzxg zzxgVar = zzxhVar.zzd;
        if (zzxgVar.zzd) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return zzwyVar.zza.get(zzxgVar) != null;
    }
}
