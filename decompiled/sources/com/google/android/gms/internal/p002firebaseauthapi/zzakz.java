package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzakz extends zzald {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzakz() {
        super(null);
    }

    /* synthetic */ zzakz(zzaky zzakyVar) {
        super(null);
    }

    private static List zzf(Object obj, long j, int i) {
        List list;
        List listZzd;
        List list2 = (List) zzanf.zzf(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof zzakx) {
                listZzd = new zzakw(i);
            } else {
                listZzd = ((list2 instanceof zzalw) && (list2 instanceof zzakp)) ? ((zzakp) list2).zzd(i) : new ArrayList(i);
            }
            zzanf.zzs(obj, j, listZzd);
            return listZzd;
        }
        if (zza.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i);
            arrayList.addAll(list2);
            zzanf.zzs(obj, j, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof zzana)) {
                if (!(list2 instanceof zzalw) || !(list2 instanceof zzakp)) {
                    return list2;
                }
                zzakp zzakpVar = (zzakp) list2;
                if (zzakpVar.zzc()) {
                    return list2;
                }
                zzakp zzakpVarZzd = zzakpVar.zzd(list2.size() + i);
                zzanf.zzs(obj, j, zzakpVarZzd);
                return zzakpVarZzd;
            }
            zzakw zzakwVar = new zzakw(list2.size() + i);
            zzakwVar.addAll(zzakwVar.size(), (zzana) list2);
            zzanf.zzs(obj, j, zzakwVar);
            list = zzakwVar;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzanf.zzf(obj, j);
        if (list instanceof zzakx) {
            objUnmodifiableList = ((zzakx) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzalw) && (list instanceof zzakp)) {
                zzakp zzakpVar = (zzakp) list;
                if (zzakpVar.zzc()) {
                    zzakpVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzanf.zzs(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzanf.zzf(obj2, j);
        List listZzf = zzf(obj, j, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzanf.zzs(obj, j, list);
    }
}
