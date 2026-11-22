package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzaly;
import com.google.android.gms.internal.ads.zzcaa;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzbh implements zzalt {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbl zzb;

    zzbh(zzbo zzboVar, String str, zzbl zzblVar) {
        this.zza = str;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final void zza(zzaly zzalyVar) {
        zzcaa.zzj("Failed to load URL: " + this.zza + "\n" + zzalyVar.toString());
        this.zzb.zza((Object) null);
    }
}
