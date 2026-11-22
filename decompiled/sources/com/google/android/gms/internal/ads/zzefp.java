package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzefp implements zzdfy {
    private final Context zza;
    private final zzcag zzb;
    private final ListenableFuture zzc;
    private final zzfbe zzd;
    private final zzcfi zze;
    private final zzfca zzf;
    private final zzbit zzg;
    private final boolean zzh;
    private final zzecs zzi;

    zzefp(Context context, zzcag zzcagVar, ListenableFuture listenableFuture, zzfbe zzfbeVar, zzcfi zzcfiVar, zzfca zzfcaVar, boolean z, zzbit zzbitVar, zzecs zzecsVar) {
        this.zza = context;
        this.zzb = zzcagVar;
        this.zzc = listenableFuture;
        this.zzd = zzfbeVar;
        this.zze = zzcfiVar;
        this.zzf = zzfcaVar;
        this.zzg = zzbitVar;
        this.zzh = z;
        this.zzi = zzecsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdfy
    public final void zza(boolean z, Context context, zzcwv zzcwvVar) {
        zzdeq zzdeqVar = (zzdeq) zzfye.zzq(this.zzc);
        this.zze.zzan(true);
        boolean zZze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zZzF = com.google.android.gms.ads.internal.util.zzs.zzF(this.zza);
        boolean z2 = this.zzh;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zZze, zZzF, z2 ? this.zzg.zzd() : false, z2 ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzP, false);
        if (zzcwvVar != null) {
            zzcwvVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzdfn zzdfnVarZzh = zzdeqVar.zzh();
        zzcfi zzcfiVar = this.zze;
        zzfbe zzfbeVar = this.zzd;
        int i = zzfbeVar.zzR;
        zzcag zzcagVar = this.zzb;
        String str = zzfbeVar.zzC;
        zzfbk zzfbkVar = zzfbeVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzdfnVarZzh, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcfiVar, i, zzcagVar, str, zzjVar, zzfbkVar.zzb, zzfbkVar.zza, this.zzf.zzf, zzcwvVar, zzfbeVar.zzaj ? this.zzi : null), true);
    }
}
