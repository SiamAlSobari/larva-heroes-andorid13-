package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzavh implements Comparator {
    zzavh(zzavj zzavjVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzavn zzavnVar = (zzavn) obj;
        zzavn zzavnVar2 = (zzavn) obj2;
        int i = zzavnVar.zzc - zzavnVar2.zzc;
        return i != 0 ? i : (zzavnVar.zza > zzavnVar2.zza ? 1 : (zzavnVar.zza == zzavnVar2.zza ? 0 : -1));
    }
}
