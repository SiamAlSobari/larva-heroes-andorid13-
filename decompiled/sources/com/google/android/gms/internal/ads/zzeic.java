package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeic implements zzdfy {
    private final Context zza;
    private final zzdom zzb;
    private final zzfca zzc;
    private final zzcag zzd;
    private final zzfbe zze;
    private final ListenableFuture zzf;
    private final zzcfi zzg;
    private final zzbit zzh;
    private final boolean zzi;
    private final zzecs zzj;

    zzeic(Context context, zzdom zzdomVar, zzfca zzfcaVar, zzcag zzcagVar, zzfbe zzfbeVar, ListenableFuture listenableFuture, zzcfi zzcfiVar, zzbit zzbitVar, boolean z, zzecs zzecsVar) {
        this.zza = context;
        this.zzb = zzdomVar;
        this.zzc = zzfcaVar;
        this.zzd = zzcagVar;
        this.zze = zzfbeVar;
        this.zzf = listenableFuture;
        this.zzg = zzcfiVar;
        this.zzh = zzbitVar;
        this.zzi = z;
        this.zzj = zzecsVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
    /* JADX WARN: Code duplicated, block: B:22:0x009e  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00eb  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdfy
    public final void zza(boolean z, Context context, zzcwv zzcwvVar) {
        zzcfi zzcfiVar;
        zzcfi zzcfiVar2;
        boolean zZze;
        boolean z2;
        boolean zZzd;
        float fZza;
        zzdnr zzdnrVar = (zzdnr) zzfye.zzq(this.zzf);
        try {
            zzfbe zzfbeVar = this.zze;
            if (this.zzg.zzaB()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaK)).booleanValue()) {
                    final zzcfi zzcfiVarZza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbji.zzb(zzcfiVarZza, zzdnrVar.zzg());
                    final zzdoq zzdoqVar = new zzdoq();
                    zzdoqVar.zza(this.zza, (View) zzcfiVarZza);
                    zzdnrVar.zzl().zzi(zzcfiVarZza, true, this.zzi ? this.zzh : null);
                    zzcfiVarZza.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzeia
                        @Override // com.google.android.gms.internal.ads.zzcgt
                        public final void zza(boolean z3, int i, String str, String str2) {
                            zzdoq zzdoqVar2 = zzdoqVar;
                            zzcfi zzcfiVar3 = zzcfiVarZza;
                            zzdoqVar2.zzb();
                            zzcfiVar3.zzY();
                            zzcfiVar3.zzN().zzq();
                        }
                    });
                    zzcfiVarZza.zzN().zzG(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzeib
                        @Override // com.google.android.gms.internal.ads.zzcgu
                        public final void zza() {
                            zzcfiVarZza.zzX();
                        }
                    });
                    zzfbk zzfbkVar = zzfbeVar.zzt;
                    zzcfiVarZza.zzab(zzfbkVar.zzb, zzfbkVar.zza, null);
                    zzcfiVar = zzcfiVarZza;
                } else {
                    zzcfiVar2 = this.zzg;
                }
                zzcfiVar.zzan(true);
                if (this.zzi) {
                    zZze = this.zzh.zze(false);
                } else {
                    zZze = false;
                }
                com.google.android.gms.ads.internal.zzt.zzp();
                boolean zZzF = com.google.android.gms.ads.internal.util.zzs.zzF(this.zza);
                z2 = this.zzi;
                if (z2) {
                    zZzd = this.zzh.zzd();
                } else {
                    zZzd = false;
                }
                if (z2) {
                    fZza = this.zzh.zza();
                } else {
                    fZza = 0.0f;
                }
                zzfbe zzfbeVar2 = this.zze;
                com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zZze, zZzF, zZzd, fZza, -1, z, zzfbeVar2.zzP, zzfbeVar2.zzQ);
                if (zzcwvVar != null) {
                    zzcwvVar.zzf();
                }
                com.google.android.gms.ads.internal.zzt.zzi();
                zzdfn zzdfnVarZzh = zzdnrVar.zzh();
                zzfbe zzfbeVar3 = this.zze;
                int i = zzfbeVar3.zzR;
                zzcag zzcagVar = this.zzd;
                String str = zzfbeVar3.zzC;
                zzfbk zzfbkVar2 = zzfbeVar3.zzt;
                com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzdfnVarZzh, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcfiVar, i, zzcagVar, str, zzjVar, zzfbkVar2.zzb, zzfbkVar2.zza, this.zzc.zzf, zzcwvVar, zzfbeVar3.zzaj ? this.zzj : null), true);
            }
            zzcfiVar2 = this.zzg;
            zzcfiVar = zzcfiVar2;
            zzcfiVar.zzan(true);
            if (this.zzi) {
                zZze = this.zzh.zze(false);
            } else {
                zZze = false;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            boolean zZzF2 = com.google.android.gms.ads.internal.util.zzs.zzF(this.zza);
            z2 = this.zzi;
            if (z2) {
                zZzd = this.zzh.zzd();
            } else {
                zZzd = false;
            }
            if (z2) {
                fZza = this.zzh.zza();
            } else {
                fZza = 0.0f;
            }
            zzfbe zzfbeVar4 = this.zze;
            com.google.android.gms.ads.internal.zzj zzjVar2 = new com.google.android.gms.ads.internal.zzj(zZze, zZzF2, zZzd, fZza, -1, z, zzfbeVar4.zzP, zzfbeVar4.zzQ);
            if (zzcwvVar != null) {
                zzcwvVar.zzf();
            }
            com.google.android.gms.ads.internal.zzt.zzi();
            zzdfn zzdfnVarZzh2 = zzdnrVar.zzh();
            zzfbe zzfbeVar5 = this.zze;
            int i2 = zzfbeVar5.zzR;
            zzcag zzcagVar2 = this.zzd;
            String str2 = zzfbeVar5.zzC;
            zzfbk zzfbkVar3 = zzfbeVar5.zzt;
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzdfnVarZzh2, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcfiVar, i2, zzcagVar2, str2, zzjVar2, zzfbkVar3.zzb, zzfbkVar3.zza, this.zzc.zzf, zzcwvVar, zzfbeVar5.zzaj ? this.zzj : null), true);
        } catch (zzcft e) {
            zzcaa.zzh("", e);
        }
    }
}
