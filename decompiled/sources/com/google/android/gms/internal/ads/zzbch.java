package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbch {
    private final Map zza = new HashMap();
    private final zzbcj zzb;

    public zzbch(zzbcj zzbcjVar) {
        this.zzb = zzbcjVar;
    }

    public final zzbcj zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbcg zzbcgVar) {
        this.zza.put(str, zzbcgVar);
    }

    public final void zzc(String str, String str2, long j) {
        zzbcj zzbcjVar = this.zzb;
        zzbcg zzbcgVar = (zzbcg) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbcgVar != null) {
            zzbcjVar.zze(zzbcgVar, j, strArr);
        }
        this.zza.put(str, new zzbcg(j, null, null));
    }
}
