package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzye extends zzyi {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzye() {
        super(null);
    }

    /* synthetic */ zzye(zzyd zzydVar) {
        super(null);
    }

    private static List zzf(Object obj, long j, int i) {
        List list;
        List listZzd;
        List list2 = (List) zzaai.zzf(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof zzyc) {
                listZzd = new zzyb(i);
            } else {
                listZzd = ((list2 instanceof zzzc) && (list2 instanceof zzxr)) ? ((zzxr) list2).zzd(i) : new ArrayList(i);
            }
            zzaai.zzs(obj, j, listZzd);
            return listZzd;
        }
        if (zza.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i);
            arrayList.addAll(list2);
            zzaai.zzs(obj, j, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof zzaad)) {
                if (!(list2 instanceof zzzc) || !(list2 instanceof zzxr)) {
                    return list2;
                }
                zzxr zzxrVar = (zzxr) list2;
                if (zzxrVar.zzc()) {
                    return list2;
                }
                zzxr zzxrVarZzd = zzxrVar.zzd(list2.size() + i);
                zzaai.zzs(obj, j, zzxrVarZzd);
                return zzxrVarZzd;
            }
            zzyb zzybVar = new zzyb(list2.size() + i);
            zzybVar.addAll(zzybVar.size(), (zzaad) list2);
            zzaai.zzs(obj, j, zzybVar);
            list = zzybVar;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.gtm.zzyi
    final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.gtm.zzyi
    final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzaai.zzf(obj, j);
        if (list instanceof zzyc) {
            objUnmodifiableList = ((zzyc) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzzc) && (list instanceof zzxr)) {
                zzxr zzxrVar = (zzxr) list;
                if (zzxrVar.zzc()) {
                    zzxrVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzaai.zzs(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.gtm.zzyi
    final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzaai.zzf(obj2, j);
        List listZzf = zzf(obj, j, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzaai.zzs(obj, j, list);
    }
}
