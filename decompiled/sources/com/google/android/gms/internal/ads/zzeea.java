package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeea implements zzdfy {
    private final zzcag zza;
    private final ListenableFuture zzb;
    private final zzfbe zzc;
    private final zzcfi zzd;
    private final zzfca zze;
    private final zzbit zzf;
    private final boolean zzg;
    private final zzecs zzh;

    zzeea(zzcag zzcagVar, ListenableFuture listenableFuture, zzfbe zzfbeVar, zzcfi zzcfiVar, zzfca zzfcaVar, boolean z, zzbit zzbitVar, zzecs zzecsVar) {
        this.zza = zzcagVar;
        this.zzb = listenableFuture;
        this.zzc = zzfbeVar;
        this.zzd = zzcfiVar;
        this.zze = zzfcaVar;
        this.zzg = z;
        this.zzf = zzbitVar;
        this.zzh = zzecsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdfy
    public final void zza(boolean z, Context context, zzcwv zzcwvVar) {
        int i;
        zzcpn zzcpnVar = (zzcpn) zzfye.zzq(this.zzb);
        this.zzd.zzan(true);
        boolean zZze = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zZze, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzP, false);
        if (zzcwvVar != null) {
            zzcwvVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzdfn zzdfnVarZzg = zzcpnVar.zzg();
        zzcfi zzcfiVar = this.zzd;
        int i2 = this.zzc.zzR;
        if (i2 == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.zze.zzj;
            if (zzwVar != null) {
                int i3 = zzwVar.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
            }
            zzcaa.zze("Error setting app open orientation; no targeting orientation available.");
            i2 = this.zzc.zzR;
            i = i2;
        } else {
            i = i2;
        }
        zzcag zzcagVar = this.zza;
        zzfbe zzfbeVar = this.zzc;
        String str = zzfbeVar.zzC;
        zzfbk zzfbkVar = zzfbeVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzdfnVarZzg, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcfiVar, i, zzcagVar, str, zzjVar, zzfbkVar.zzb, zzfbkVar.zza, this.zze.zzf, zzcwvVar, zzfbeVar.zzaj ? this.zzh : null), true);
    }
}
