package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdhw implements zzfya {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdhx zzb;

    zzdhw(zzdhx zzdhxVar, View view) {
        this.zzb = zzdhxVar;
        this.zza = view;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "omid native display exp");
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzab(this.zza, (zzfip) obj);
    }
}
