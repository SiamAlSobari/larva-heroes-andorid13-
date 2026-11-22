package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzat extends zzam {
    final /* synthetic */ zzau zza;

    zzat(zzau zzauVar) {
        this.zza = zzauVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzu.zza(i, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzau zzauVar = this.zza;
        int i2 = i + i;
        Object obj = zzauVar.zzb[i2];
        obj.getClass();
        Object obj2 = zzauVar.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
