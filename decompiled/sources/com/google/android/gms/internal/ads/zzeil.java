package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeil implements zzedp {
    private final zzejp zza;
    private final zzdpc zzb;

    zzeil(zzejp zzejpVar, zzdpc zzdpcVar) {
        this.zza = zzejpVar;
        this.zzb = zzdpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final zzedq zza(String str, JSONObject jSONObject) throws zzfcf {
        zzbqc zzbqcVarZzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbB)).booleanValue()) {
            try {
                zzbqcVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e) {
                zzcaa.zzh("Coundn't create RTB adapter: ", e);
                zzbqcVarZzb = null;
            }
        } else {
            zzbqcVarZzb = this.zza.zza(str);
        }
        if (zzbqcVarZzb == null) {
            return null;
        }
        return new zzedq(zzbqcVarZzb, new zzefj(), str);
    }
}
