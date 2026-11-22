package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvn extends zzfud {
    static final zzfud zza = new zzfvn(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzfvn(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfri.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfud, com.google.android.gms.internal.ads.zzfty
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    final Object[] zzg() {
        return this.zzb;
    }
}
