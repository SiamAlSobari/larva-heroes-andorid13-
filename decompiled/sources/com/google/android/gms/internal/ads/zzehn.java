package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehn implements zzedt {
    private final Context zza;
    private final Executor zzb;
    private final zzdnv zzc;

    public zzehn(Context context, Executor executor, zzdnv zzdnvVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, final zzedq zzedqVar) throws zzehf, zzfcf {
        zzdnr zzdnrVarZze = this.zzc.zze(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdns(new zzdfy() { // from class: com.google.android.gms.internal.ads.zzehm
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(boolean z, Context context, zzcwv zzcwvVar) throws zzdfx {
                zzedq zzedqVar2 = zzedqVar;
                try {
                    ((zzfcw) zzedqVar2.zzb).zzv(z);
                    ((zzfcw) zzedqVar2.zzb).zzz(context);
                } catch (zzfcf e) {
                    throw new zzdfx(e.getCause());
                }
            }
        }));
        zzdnrVarZze.zzd().zzo(new zzcns((zzfcw) zzedqVar.zzb), this.zzb);
        ((zzefj) zzedqVar.zzc).zzc(zzdnrVarZze.zzm());
        return zzdnrVarZze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        try {
            zzfca zzfcaVar = zzfbrVar.zza.zza;
            if (zzfcaVar.zzo.zza == 3) {
                ((zzfcw) zzedqVar.zzb).zzr(this.zza, zzfcaVar.zzd, zzfbeVar.zzw.toString(), (zzbol) zzedqVar.zzc);
            } else {
                ((zzfcw) zzedqVar.zzb).zzq(this.zza, zzfcaVar.zzd, zzfbeVar.zzw.toString(), (zzbol) zzedqVar.zzc);
            }
        } catch (Exception e) {
            zzcaa.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzedqVar.zza)), e);
        }
    }
}
