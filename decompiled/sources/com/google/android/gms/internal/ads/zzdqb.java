package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqb implements zzczd, zzcxw, zzcwl, zzcxc, com.google.android.gms.ads.internal.client.zza, zzdbp {
    private final zzaxe zza;
    private boolean zzb = false;

    public zzdqb(zzaxe zzaxeVar, @Nullable zzeyz zzeyzVar) {
        this.zza = zzaxeVar;
        zzaxeVar.zzc(2);
        if (zzeyzVar != null) {
            zzaxeVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbunVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(final zzfbr zzfbrVar) {
        this.zza.zzb(new zzaxd() { // from class: com.google.android.gms.internal.ads.zzdpx
            @Override // com.google.android.gms.internal.ads.zzaxd
            public final void zza(zzayt zzaytVar) {
                zzfbr zzfbrVar2 = zzfbrVar;
                zzaxp zzaxpVar = (zzaxp) zzaytVar.zza().zzaB();
                zzayh zzayhVar = (zzayh) zzaytVar.zza().zzd().zzaB();
                zzayhVar.zza(zzfbrVar2.zzb.zzb.zzb);
                zzaxpVar.zzb(zzayhVar);
                zzaytVar.zze(zzaxpVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zzi(final zzaxz zzaxzVar) {
        this.zza.zzb(new zzaxd() { // from class: com.google.android.gms.internal.ads.zzdqa
            @Override // com.google.android.gms.internal.ads.zzaxd
            public final void zza(zzayt zzaytVar) {
                zzaytVar.zzf(zzaxzVar);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zzj(final zzaxz zzaxzVar) {
        this.zza.zzb(new zzaxd() { // from class: com.google.android.gms.internal.ads.zzdpz
            @Override // com.google.android.gms.internal.ads.zzaxd
            public final void zza(zzayt zzaytVar) {
                zzaytVar.zzf(zzaxzVar);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zzl(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zzm(final zzaxz zzaxzVar) {
        this.zza.zzb(new zzaxd() { // from class: com.google.android.gms.internal.ads.zzdpy
            @Override // com.google.android.gms.internal.ads.zzaxd
            public final void zza(zzayt zzaytVar) {
                zzaytVar.zzf(zzaxzVar);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zzn(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzq() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        this.zza.zzc(3);
    }
}
