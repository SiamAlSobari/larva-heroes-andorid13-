package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdfz implements zzcxw, com.google.android.gms.ads.internal.overlay.zzo, zzcxc {
    zzfip zza;
    private final Context zzb;
    private final zzcfi zzc;
    private final zzfbe zzd;
    private final zzcag zze;
    private final zzaxo zzf;

    public zzdfz(Context context, zzcfi zzcfiVar, zzfbe zzfbeVar, zzcag zzcagVar, zzaxo zzaxoVar) {
        this.zzb = context;
        this.zzc = zzcfiVar;
        this.zzd = zzfbeVar;
        this.zze = zzcagVar;
        this.zzf = zzaxoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeW)).booleanValue()) {
            return;
        }
        this.zzc.zzd("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeW)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new ArrayMap());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        zzedi zzediVar;
        zzedh zzedhVar;
        zzaxo zzaxoVar;
        if ((this.zzf == zzaxo.REWARD_BASED_VIDEO_AD || (zzaxoVar = this.zzf) == zzaxo.INTERSTITIAL || zzaxoVar == zzaxo.APP_OPEN) && this.zzd.zzU && this.zzc != null && com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zzb)) {
            zzcag zzcagVar = this.zze;
            String str = zzcagVar.zzb + "." + zzcagVar.zzc;
            String strZza = this.zzd.zzW.zza();
            if (this.zzd.zzW.zzb() == 1) {
                zzedhVar = zzedh.VIDEO;
                zzediVar = zzedi.DEFINED_BY_JAVASCRIPT;
            } else {
                zzediVar = this.zzd.zzZ == 2 ? zzedi.UNSPECIFIED : zzedi.BEGIN_TO_RENDER;
                zzedhVar = zzedh.HTML_DISPLAY;
            }
            zzfip zzfipVarZza = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzc.zzG(), "", "javascript", strZza, zzediVar, zzedhVar, this.zzd.zzam);
            this.zza = zzfipVarZza;
            if (zzfipVarZza != null) {
                com.google.android.gms.ads.internal.zzt.zzA().zzh(this.zza, (View) this.zzc);
                this.zzc.zzap(this.zza);
                com.google.android.gms.ads.internal.zzt.zzA().zzi(this.zza);
                this.zzc.zzd("onSdkLoaded", new ArrayMap());
            }
        }
    }
}
