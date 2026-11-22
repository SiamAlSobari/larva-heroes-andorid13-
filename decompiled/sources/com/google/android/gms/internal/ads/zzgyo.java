package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgyo {
    final LinkedHashMap zza;

    zzgyo(int i) {
        this.zza = zzgyq.zzb(i);
    }

    final zzgyo zza(Object obj, zzgzg zzgzgVar) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgzb.zza(obj, "key");
        zzgzb.zza(zzgzgVar, "provider");
        linkedHashMap.put(obj, zzgzgVar);
        return this;
    }
}
