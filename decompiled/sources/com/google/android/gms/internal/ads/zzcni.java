package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcni implements zzcms {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzcni(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            boolean z = Boolean.parseBoolean(str);
            this.zzb.zzH(z);
            if (z) {
                Context context = this.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgb)).booleanValue()) {
                    context.deleteDatabase("OfflineUpload.db");
                }
                try {
                    zzfoi zzfoiVarZzj = zzfoi.zzj(context);
                    zzfoj zzfojVarZzi = zzfoj.zzi(context);
                    zzfoiVarZzj.zzk();
                    zzfoiVarZzj.zzl();
                    zzfojVarZzi.zzj();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcL)).booleanValue()) {
                        zzfojVarZzi.zzk();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcM)).booleanValue()) {
                        zzfojVarZzi.zzl();
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "clearStorageOnIdlessMode");
                }
            }
        }
        map.remove("gad_idless");
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        com.google.android.gms.ads.internal.zzt.zzn().zzr(bundle);
    }
}
