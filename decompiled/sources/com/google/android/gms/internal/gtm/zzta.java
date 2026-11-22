package com.google.android.gms.internal.gtm;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzta extends zzst {
    final /* synthetic */ zztb zza;

    zzta(zztb zztbVar) {
        this.zza = zztbVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzsl.zza(i, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zztb zztbVar = this.zza;
        int i2 = i + i;
        Object obj = zztbVar.zzb[i2];
        obj.getClass();
        Object obj2 = zztbVar.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
