package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbji implements zzbir {
    private final zzbjh zza;

    public zzbji(zzbjh zzbjhVar) {
        this.zza = zzbjhVar;
    }

    public static void zzb(zzcfi zzcfiVar, zzbjh zzbjhVar) {
        zzcfiVar.zzad("/reward", new zzbji(zzbjhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzb();
                    return;
                }
                return;
            }
        }
        zzbvp zzbvpVar = null;
        try {
            int i = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbvpVar = new zzbvp(str2, i);
            }
        } catch (NumberFormatException e) {
            zzcaa.zzk("Unable to parse reward amount.", e);
        }
        this.zza.zza(zzbvpVar);
    }
}
