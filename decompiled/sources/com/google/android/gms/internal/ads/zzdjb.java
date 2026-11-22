package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdjb implements zzbej {
    final /* synthetic */ zzdjy zza;
    final /* synthetic */ ViewGroup zzb;

    zzdjb(zzdjy zzdjyVar, ViewGroup viewGroup) {
        this.zza = zzdjyVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final void zzc() {
        zzdjy zzdjyVar = this.zza;
        zzfud zzfudVar = zzdiy.zza;
        Map mapZzm = zzdjyVar.zzm();
        if (mapZzm == null) {
            return;
        }
        int size = zzfudVar.size();
        int i = 0;
        while (i < size) {
            Object obj = mapZzm.get((String) zzfudVar.get(i));
            i++;
            if (obj != null) {
                this.zza.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
