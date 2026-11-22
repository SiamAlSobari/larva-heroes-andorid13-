package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhz implements zzbir {
    zzbhz() {
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfi zzcfiVar = (zzcfi) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfpl zzfplVarZzj = zzfpm.zzj();
        zzfplVarZzj.zzb((String) map.get("appId"));
        zzfplVarZzj.zzh(zzcfiVar.getWidth());
        zzfplVarZzj.zzg(zzcfiVar.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzfplVarZzj.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzfplVarZzj.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzfplVarZzj.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzfplVarZzj.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzfplVarZzj.zza((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzj().zzj(zzcfiVar, zzfplVarZzj.zzi());
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
