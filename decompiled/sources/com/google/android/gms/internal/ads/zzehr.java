package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehr implements zzedt {
    private final Context zza;
    private final zzdnv zzb;

    public zzehr(Context context, zzdnv zzdnvVar) {
        this.zza = context;
        this.zzb = zzdnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzehf, zzfcf {
        zzefs zzefsVar = new zzefs(zzfbeVar, (zzbqc) zzedqVar.zzb, AdFormat.REWARDED);
        zzdnr zzdnrVarZze = this.zzb.zze(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdns(zzefsVar));
        zzefsVar.zzb(zzdnrVarZze.zzc());
        ((zzefj) zzedqVar.zzc).zzc(zzdnrVarZze.zzn());
        return zzdnrVarZze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        try {
            ((zzbqc) zzedqVar.zzb).zzq(zzfbeVar.zzaa);
            if (zzfbrVar.zza.zza.zzo.zza == 3) {
                ((zzbqc) zzedqVar.zzb).zzo(zzfbeVar.zzV, zzfbeVar.zzw.toString(), zzfbrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehq(this, zzedqVar, null), (zzbol) zzedqVar.zzc);
            } else {
                ((zzbqc) zzedqVar.zzb).zzp(zzfbeVar.zzV, zzfbeVar.zzw.toString(), zzfbrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehq(this, zzedqVar, null), (zzbol) zzedqVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
