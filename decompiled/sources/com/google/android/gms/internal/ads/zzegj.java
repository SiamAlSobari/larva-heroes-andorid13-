package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegj implements zzedt {
    private final Context zza;
    private final zzdgm zzb;
    private final Executor zzc;

    public zzegj(Context context, zzdgm zzdgmVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdgmVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfbr zzfbrVar, int i) {
        return zzfbrVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzehf, zzfcf {
        zzdic zzdicVarZzah;
        zzboq zzboqVarZzD = ((zzfcw) zzedqVar.zzb).zzD();
        zzbor zzborVarZzE = ((zzfcw) zzedqVar.zzb).zzE();
        zzbou zzbouVarZzd = ((zzfcw) zzedqVar.zzb).zzd();
        if (zzbouVarZzd != null && zzc(zzfbrVar, 6)) {
            zzdicVarZzah = zzdic.zzt(zzbouVarZzd);
        } else if (zzboqVarZzD != null && zzc(zzfbrVar, 6)) {
            zzdicVarZzah = zzdic.zzai(zzboqVarZzD);
        } else if (zzboqVarZzD != null && zzc(zzfbrVar, 2)) {
            zzdicVarZzah = zzdic.zzag(zzboqVarZzD);
        } else if (zzborVarZzE != null && zzc(zzfbrVar, 6)) {
            zzdicVarZzah = zzdic.zzaj(zzborVarZzE);
        } else {
            if (zzborVarZzE == null || !zzc(zzfbrVar, 1)) {
                throw new zzehf(1, "No native ad mappers");
            }
            zzdicVarZzah = zzdic.zzah(zzborVarZzE);
        }
        if (!zzfbrVar.zza.zza.zzg.contains(Integer.toString(zzdicVarZzah.zzc()))) {
            throw new zzehf(1, "No corresponding native ad listener");
        }
        zzdie zzdieVarZze = this.zzb.zze(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdio(zzdicVarZzah), new zzdkf(zzborVarZzE, zzboqVarZzD, zzbouVarZzd));
        ((zzefj) zzedqVar.zzc).zzc(zzdieVarZze.zzj());
        zzdieVarZze.zzd().zzo(new zzcns((zzfcw) zzedqVar.zzb), this.zzc);
        return zzdieVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        zzfcw zzfcwVar = (zzfcw) zzedqVar.zzb;
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfbrVar.zza.zza.zzd;
        String string = zzfbeVar.zzw.toString();
        String strZzl = com.google.android.gms.ads.internal.util.zzbu.zzl(zzfbeVar.zzt);
        zzbol zzbolVar = (zzbol) zzedqVar.zzc;
        zzfca zzfcaVar = zzfbrVar.zza.zza;
        zzfcwVar.zzp(context, zzlVar, string, strZzl, zzbolVar, zzfcaVar.zzi, zzfcaVar.zzg);
    }
}
