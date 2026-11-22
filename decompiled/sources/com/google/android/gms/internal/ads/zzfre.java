package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfre implements Serializable {
    zzfre() {
    }

    public static zzfre zzc() {
        return zzfqm.zza;
    }

    public static zzfre zzd(@CheckForNull Object obj) {
        return obj == null ? zzfqm.zza : new zzfrn(obj);
    }

    public abstract zzfre zza(zzfqw zzfqwVar);

    public abstract Object zzb(Object obj);
}
