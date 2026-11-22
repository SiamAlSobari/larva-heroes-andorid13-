package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfkp extends zzfkq {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfkp(zzfki zzfkiVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfkiVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
