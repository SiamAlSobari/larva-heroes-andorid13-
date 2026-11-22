package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdgw implements zzbir {
    private final WeakReference zza;

    /* synthetic */ zzdgw(zzdgz zzdgzVar, zzdgv zzdgvVar) {
        this.zza = new WeakReference(zzdgzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        zzdgz zzdgzVar = (zzdgz) this.zza.get();
        if (zzdgzVar == null) {
            return;
        }
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
