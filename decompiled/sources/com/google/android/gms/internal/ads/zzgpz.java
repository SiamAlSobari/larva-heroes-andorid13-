package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgpz implements Comparator {
    zzgpz() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgqi zzgqiVar = (zzgqi) obj;
        zzgqi zzgqiVar2 = (zzgqi) obj2;
        zzgqc it = zzgqiVar.iterator();
        zzgqc it2 = zzgqiVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzgqiVar.zzd()).compareTo(Integer.valueOf(zzgqiVar2.zzd()));
    }
}
