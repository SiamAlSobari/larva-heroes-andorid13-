package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhi extends zzhm {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzhi() {
        super(null);
    }

    /* synthetic */ zzhi(zzhh zzhhVar) {
        super(null);
    }

    private static List zzf(Object obj, long j, int i) {
        List list;
        List listZzd;
        List list2 = (List) zzjp.zzf(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof zzhg) {
                listZzd = new zzhf(i);
            } else {
                listZzd = ((list2 instanceof zzig) && (list2 instanceof zzgv)) ? ((zzgv) list2).zzd(i) : new ArrayList(i);
            }
            zzjp.zzs(obj, j, listZzd);
            return listZzd;
        }
        if (zza.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i);
            arrayList.addAll(list2);
            zzjp.zzs(obj, j, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof zzjk)) {
                if (!(list2 instanceof zzig) || !(list2 instanceof zzgv)) {
                    return list2;
                }
                zzgv zzgvVar = (zzgv) list2;
                if (zzgvVar.zzc()) {
                    return list2;
                }
                zzgv zzgvVarZzd = zzgvVar.zzd(list2.size() + i);
                zzjp.zzs(obj, j, zzgvVarZzd);
                return zzgvVarZzd;
            }
            zzhf zzhfVar = new zzhf(list2.size() + i);
            zzhfVar.addAll(zzhfVar.size(), (zzjk) list2);
            zzjp.zzs(obj, j, zzhfVar);
            list = zzhfVar;
        }
        return list;
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzjp.zzf(obj, j);
        if (list instanceof zzhg) {
            objUnmodifiableList = ((zzhg) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzig) && (list instanceof zzgv)) {
                zzgv zzgvVar = (zzgv) list;
                if (zzgvVar.zzc()) {
                    zzgvVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzjp.zzs(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzjp.zzf(obj2, j);
        List listZzf = zzf(obj, j, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzjp.zzs(obj, j, list);
    }
}
