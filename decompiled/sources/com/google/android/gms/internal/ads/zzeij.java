package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeij implements zzedt {
    private final Context zza;
    private final Executor zzb;
    private final zzdnv zzc;

    public zzeij(Context context, Executor executor, zzdnv zzdnvVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdnvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) {
        try {
            ((zzfcw) zzedqVar.zzb).zzk(zzfbrVar.zza.zza.zzd, zzfbeVar.zzw.toString());
        } catch (Exception e) {
            zzcaa.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzedqVar.zza)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, final zzedq zzedqVar) throws zzehf, zzfcf {
        zzdnr zzdnrVarZze = this.zzc.zze(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdns(new zzdfy() { // from class: com.google.android.gms.internal.ads.zzeif
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(boolean z, Context context, zzcwv zzcwvVar) throws zzdfx {
                zzedq zzedqVar2 = zzedqVar;
                try {
                    ((zzfcw) zzedqVar2.zzb).zzv(z);
                    ((zzfcw) zzedqVar2.zzb).zzA();
                } catch (zzfcf e) {
                    zzcaa.zzk("Cannot show rewarded video.", e);
                    throw new zzdfx(e.getCause());
                }
            }
        }));
        zzdnrVarZze.zzd().zzo(new zzcns((zzfcw) zzedqVar.zzb), this.zzb);
        zzcxp zzcxpVarZze = zzdnrVarZze.zze();
        zzcwg zzcwgVarZzb = zzdnrVarZze.zzb();
        ((zzefk) zzedqVar.zzc).zzc(new zzeii(this, zzdnrVarZze.zza(), zzcwgVarZzb, zzcxpVarZze, zzdnrVarZze.zzg()));
        return zzdnrVarZze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        if (((zzfcw) zzedqVar.zzb).zzC()) {
            zze(zzfbrVar, zzfbeVar, zzedqVar);
            return;
        }
        ((zzefk) zzedqVar.zzc).zzd(new zzeih(this, zzfbrVar, zzfbeVar, zzedqVar));
        ((zzfcw) zzedqVar.zzb).zzh(this.zza, zzfbrVar.zza.zza.zzd, null, (zzbvo) zzedqVar.zzc, zzfbeVar.zzw.toString());
    }
}
