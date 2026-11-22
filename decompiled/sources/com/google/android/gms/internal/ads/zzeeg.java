package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeeg implements zzedt {
    private final Context zza;
    private final zzcpq zzb;

    zzeeg(Context context, zzcpq zzcpqVar) {
        this.zza = context;
        this.zzb = zzcpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzehf, zzfcf {
        zzefs zzefsVar = new zzefs(zzfbeVar, (zzbqc) zzedqVar.zzb, AdFormat.APP_OPEN_AD);
        zzcpn zzcpnVarZza = this.zzb.zza(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdet(zzefsVar, null), new zzcpo(zzfbeVar.zzab));
        zzefsVar.zzb(zzcpnVarZza.zzc());
        ((zzefj) zzedqVar.zzc).zzc(zzcpnVarZza.zzi());
        return zzcpnVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        try {
            ((zzbqc) zzedqVar.zzb).zzq(zzfbeVar.zzaa);
            ((zzbqc) zzedqVar.zzb).zzi(zzfbeVar.zzV, zzfbeVar.zzw.toString(), zzfbrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeef(zzedqVar, null), (zzbol) zzedqVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfcf(e);
        }
    }
}
