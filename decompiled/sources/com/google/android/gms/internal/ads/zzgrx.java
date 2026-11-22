package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgrx extends AbstractList {
    private final List zza;
    private final zzgrw zzb;

    public zzgrx(List list, zzgrw zzgrwVar) {
        this.zza = list;
        this.zzb = zzgrwVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzayc zzaycVarZzb = zzayc.zzb(((Integer) this.zza.get(i)).intValue());
        return zzaycVarZzb == null ? zzayc.AD_FORMAT_TYPE_UNSPECIFIED : zzaycVarZzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
