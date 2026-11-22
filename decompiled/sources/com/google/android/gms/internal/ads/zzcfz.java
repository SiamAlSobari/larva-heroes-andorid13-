package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcfz implements zzbir {
    final /* synthetic */ zzcgb zza;

    zzcfz(zzcgb zzcgbVar) {
        this.zza = zzcgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzcgb zzcgbVar = this.zza;
                    if (zzcgbVar.zzG != i) {
                        zzcgbVar.zzG = i;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e) {
                zzcaa.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
