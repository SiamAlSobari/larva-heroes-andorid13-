package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdgd implements zzcwi, zzddf {
    private final zzbxn zza;
    private final Context zzb;
    private final zzbyf zzc;
    private final View zzd;
    private String zze;
    private final zzaxo zzf;

    public zzdgd(zzbxn zzbxnVar, Context context, zzbyf zzbyfVar, View view, zzaxo zzaxoVar) {
        this.zza = zzbxnVar;
        this.zzb = context;
        this.zzc = zzbyfVar;
        this.zzd = view;
        this.zzf = zzaxoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    @ParametersAreNonnullByDefault
    public final void zzbw(zzbvd zzbvdVar, String str, String str2) {
        if (this.zzc.zzu(this.zzb)) {
            try {
                zzbyf zzbyfVar = this.zzc;
                Context context = this.zzb;
                zzbyfVar.zzo(context, zzbyfVar.zza(context), this.zza.zza(), zzbvdVar.zzc(), zzbvdVar.zzb());
            } catch (RemoteException e) {
                zzcaa.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzs(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzddf
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzddf
    public final void zzl() {
        if (this.zzf == zzaxo.APP_OPEN) {
            return;
        }
        String strZzd = this.zzc.zzd(this.zzb);
        this.zze = strZzd;
        this.zze = String.valueOf(strZzd).concat(this.zzf == zzaxo.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
