package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgsk extends zzgso {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzgsk() {
        super(null);
    }

    /* synthetic */ zzgsk(zzgsj zzgsjVar) {
        super(null);
    }

    private static List zzf(Object obj, long j, int i) {
        List list;
        List listZzd;
        List list2 = (List) zzguu.zzh(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof zzgsi) {
                listZzd = new zzgsh(i);
            } else {
                listZzd = ((list2 instanceof zzgth) && (list2 instanceof zzgrz)) ? ((zzgrz) list2).zzd(i) : new ArrayList(i);
            }
            zzguu.zzv(obj, j, listZzd);
            return listZzd;
        }
        if (zza.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i);
            arrayList.addAll(list2);
            zzguu.zzv(obj, j, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof zzgup)) {
                if (!(list2 instanceof zzgth) || !(list2 instanceof zzgrz)) {
                    return list2;
                }
                zzgrz zzgrzVar = (zzgrz) list2;
                if (zzgrzVar.zzc()) {
                    return list2;
                }
                zzgrz zzgrzVarZzd = zzgrzVar.zzd(list2.size() + i);
                zzguu.zzv(obj, j, zzgrzVarZzd);
                return zzgrzVarZzd;
            }
            zzgsh zzgshVar = new zzgsh(list2.size() + i);
            zzgshVar.addAll(zzgshVar.size(), (zzgup) list2);
            zzguu.zzv(obj, j, zzgshVar);
            list = zzgshVar;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.zzgso
    final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzgso
    final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzguu.zzh(obj, j);
        if (list instanceof zzgsi) {
            objUnmodifiableList = ((zzgsi) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgth) && (list instanceof zzgrz)) {
                zzgrz zzgrzVar = (zzgrz) list;
                if (zzgrzVar.zzc()) {
                    zzgrzVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzguu.zzv(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzgso
    final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzguu.zzh(obj2, j);
        List listZzf = zzf(obj, j, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzguu.zzv(obj, j, list);
    }
}
