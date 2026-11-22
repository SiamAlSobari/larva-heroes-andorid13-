package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.plus.PlusShare;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbjj implements zzbir {
    private final Context zza;

    public zzbjj(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE)) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzQ(this.zza, intent);
        } catch (RuntimeException e) {
            zzcaa.zzk("Failed to open Share Sheet", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
