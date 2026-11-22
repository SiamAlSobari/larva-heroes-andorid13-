package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdmi implements zzbej {
    final /* synthetic */ String zza = "_videoMediaView";
    final /* synthetic */ zzdmj zzb;

    zzdmi(zzdmj zzdmjVar, String str) {
        this.zzb = zzdmjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final void zzc() {
        zzdmj zzdmjVar = this.zzb;
        if (zzdmjVar.zzd != null) {
            zzdmjVar.zzd.zzD(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final void zzd(MotionEvent motionEvent) {
    }
}
