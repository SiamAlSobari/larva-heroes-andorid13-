package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdgu implements zzbir {
    private final WeakReference zza;

    /* synthetic */ zzdgu(zzdgz zzdgzVar, zzdgt zzdgtVar) {
        this.zza = new WeakReference(zzdgzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        zzdgz zzdgzVar = (zzdgz) this.zza.get();
        if (zzdgzVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzdgzVar.zzh.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
                zzdgzVar.zzi.zzbK();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdgzVar.zzi.zzs();
            }
        }
    }
}
