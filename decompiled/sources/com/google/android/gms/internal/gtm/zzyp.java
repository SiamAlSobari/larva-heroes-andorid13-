package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyp {
    zzyp() {
    }

    public static final int zza(int i, Object obj, Object obj2) {
        zzyo zzyoVar = (zzyo) obj;
        if (zzyoVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzyoVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzyo) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzyo zzyoVarZzb = (zzyo) obj;
        zzyo zzyoVar = (zzyo) obj2;
        if (!zzyoVar.isEmpty()) {
            if (!zzyoVarZzb.zze()) {
                zzyoVarZzb = zzyoVarZzb.zzb();
            }
            zzyoVarZzb.zzd(zzyoVar);
        }
        return zzyoVarZzb;
    }
}
