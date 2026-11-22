package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzejp {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdpc zzb;

    public zzejp(zzdpc zzdpcVar) {
        this.zzb = zzdpcVar;
    }

    @CheckForNull
    public final zzbqc zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbqc) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            zzcaa.zzh("Couldn't create RTB adapter : ", e);
        }
    }
}
