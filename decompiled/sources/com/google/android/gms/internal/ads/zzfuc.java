package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfuc extends zzfud {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfud zzc;

    zzfuc(zzfud zzfudVar, int i, int i2) {
        this.zzc = zzfudVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfri.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfud, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    @CheckForNull
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfud
    /* JADX INFO: renamed from: zzh */
    public final zzfud subList(int i, int i2) {
        zzfri.zzh(i, i2, this.zzb);
        zzfud zzfudVar = this.zzc;
        int i3 = this.zza;
        return zzfudVar.subList(i + i3, i2 + i3);
    }
}
