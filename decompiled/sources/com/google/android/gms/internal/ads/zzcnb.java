package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcnb implements zzcms {
    private final zzedl zza;

    zzcnb(zzedl zzedlVar) {
        this.zza = zzedlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjw)).booleanValue()) {
            zzfye.zzf(zzfxv.zzu(this.zza.zza(true)), Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcna
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu((Throwable) obj, "GetTopicsApiWithRecordObservationActionHandler");
                    return zzfye.zzh(new GetTopicsResponse(zzfud.zzl()));
                }
            }, zzcan.zza);
        }
    }
}
