package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeec implements zzedt {
    private final Context zza;
    private final zzcpq zzb;
    private final Executor zzc;

    zzeec(Context context, zzcpq zzcpqVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcpqVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, final zzedq zzedqVar) throws zzehf, zzfcf {
        zzcpn zzcpnVarZza = this.zzb.zza(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdet(new zzdfy() { // from class: com.google.android.gms.internal.ads.zzeeb
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(boolean z, Context context, zzcwv zzcwvVar) throws zzdfx {
                zzedq zzedqVar2 = zzedqVar;
                try {
                    ((zzfcw) zzedqVar2.zzb).zzv(z);
                    ((zzfcw) zzedqVar2.zzb).zzw(context);
                } catch (zzfcf e) {
                    throw new zzdfx(e.getCause());
                }
            }
        }, null), new zzcpo(zzfbeVar.zzab));
        zzcpnVarZza.zzd().zzo(new zzcns((zzfcw) zzedqVar.zzb), this.zzc);
        ((zzefj) zzedqVar.zzc).zzc(zzcpnVarZza.zzj());
        return zzcpnVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        ((zzfcw) zzedqVar.zzb).zzl(this.zza, zzfbrVar.zza.zza.zzd, zzfbeVar.zzw.toString(), (zzbol) zzedqVar.zzc);
    }
}
