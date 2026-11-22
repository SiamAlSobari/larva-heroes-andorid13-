package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzftg extends AbstractSet {
    final /* synthetic */ zzftm zza;

    zzftg(zzftm zzftmVar) {
        this.zza = zzftmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Map mapZzj = this.zza.zzj();
        if (mapZzj != null) {
            return mapZzj.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzq = this.zza.zzq(entry.getKey());
            if (iZzq != -1) {
                Object[] objArr = this.zza.zzc;
                objArr.getClass();
                if (zzfrd.zza(objArr[iZzq], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzftm zzftmVar = this.zza;
        Map mapZzj = zzftmVar.zzj();
        return mapZzj != null ? mapZzj.entrySet().iterator() : new zzfte(zzftmVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Map mapZzj = this.zza.zzj();
        if (mapZzj != null) {
            return mapZzj.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzftm zzftmVar = this.zza;
        if (zzftmVar.zzo()) {
            return false;
        }
        int iZzp = zzftmVar.zzp();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object objZzh = zzftm.zzh(this.zza);
        zzftm zzftmVar2 = this.zza;
        int[] iArr = zzftmVar2.zza;
        iArr.getClass();
        Object[] objArr = zzftmVar2.zzb;
        objArr.getClass();
        Object[] objArr2 = zzftmVar2.zzc;
        objArr2.getClass();
        int iZzb = zzftn.zzb(key, value, iZzp, objZzh, iArr, objArr, objArr2);
        if (iZzb == -1) {
            return false;
        }
        this.zza.zzn(iZzb, iZzp);
        this.zza.zzg--;
        this.zza.zzl();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
