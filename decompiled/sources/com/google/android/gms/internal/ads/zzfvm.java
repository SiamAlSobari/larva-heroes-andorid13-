package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfvm implements Comparator {
    protected zzfvm() {
    }

    public static zzfvm zzb(Comparator comparator) {
        return comparator instanceof zzfvm ? (zzfvm) comparator : new zzfto(comparator);
    }

    public static zzfvm zzc() {
        return zzfvk.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfvm zza() {
        return new zzfvv(this);
    }
}
