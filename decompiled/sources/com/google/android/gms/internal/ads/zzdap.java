package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdap implements AppEventListener, OnAdMetadataChangedListener, zzcwi, com.google.android.gms.ads.internal.client.zza, zzcyt, zzcxc, zzcyh, com.google.android.gms.ads.internal.overlay.zzo, zzcwy, zzddw {
    private final zzdan zza = new zzdan(this, null);

    @Nullable
    private zzekx zzb;

    @Nullable
    private zzelb zzc;

    @Nullable
    private zzexc zzd;

    @Nullable
    private zzfah zze;

    private static void zzn(Object obj, zzdao zzdaoVar) {
        if (obj != null) {
            zzdaoVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzn(this.zzb, new zzdao() { // from class: com.google.android.gms.internal.ads.zzdad
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzekx) obj).onAdClicked();
            }
        });
        zzn(this.zzc, new zzdao() { // from class: com.google.android.gms.internal.ads.zzdae
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzelb) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzn(this.zze, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczw
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzfah) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzn(this.zzb, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczf
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzekx) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
        zzn(this.zzb, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczx
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzekx) obj).zza();
            }
        });
        zzn(this.zze, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczy
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzfah) obj).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
        zzn(this.zzb, new zzdao() { // from class: com.google.android.gms.internal.ads.zzdaa
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzekx) obj).zzb();
            }
        });
        zzn(this.zze, new zzdao() { // from class: com.google.android.gms.internal.ads.zzdaf
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzfah) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzn(this.zzb, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczs
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzekx) obj).zzbK();
            }
        });
        zzn(this.zzc, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczt
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzelb) obj).zzbK();
            }
        });
        zzn(this.zze, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczu
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzfah) obj).zzbK();
            }
        });
        zzn(this.zzd, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczv
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzexc) obj).zzbK();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        zzn(this.zzd, new zzdao() { // from class: com.google.android.gms.internal.ads.zzdab
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        zzn(this.zzd, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczi
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        zzn(this.zzd, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczl
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzexc) obj).zzbu();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        zzn(this.zzd, new zzdao() { // from class: com.google.android.gms.internal.ads.zzdaj
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzexc) obj).zzbv();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(final zzbvd zzbvdVar, final String str, final String str2) {
        zzn(this.zzb, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczo
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczq
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzfah) obj).zzbw(zzbvdVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        zzn(this.zzd, new zzdao() { // from class: com.google.android.gms.internal.ads.zzcze
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzexc) obj).zzbx();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(final int i) {
        zzn(this.zzd, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczz
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzexc) obj).zzby(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
        zzn(this.zzb, new zzdao() { // from class: com.google.android.gms.internal.ads.zzdak
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzekx) obj).zzc();
            }
        });
        zzn(this.zze, new zzdao() { // from class: com.google.android.gms.internal.ads.zzdal
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzfah) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
        zzn(this.zzb, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczg
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczh
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzfah) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
        zzn(this.zzb, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczj
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczk
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzfah) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzg() {
        zzn(this.zzd, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczr
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzexc) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzn(this.zzb, new zzdao() { // from class: com.google.android.gms.internal.ads.zzdag
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzekx) obj).zzh(zzsVar);
            }
        });
        zzn(this.zze, new zzdao() { // from class: com.google.android.gms.internal.ads.zzdah
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzfah) obj).zzh(zzsVar);
            }
        });
        zzn(this.zzd, new zzdao() { // from class: com.google.android.gms.internal.ads.zzdai
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzexc) obj).zzh(zzsVar);
            }
        });
    }

    public final zzdan zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcwy
    public final void zzp(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzn(this.zze, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczm
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzfah) obj).zzp(zzeVar);
            }
        });
        zzn(this.zzb, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczn
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzekx) obj).zzp(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        zzn(this.zzb, new zzdao() { // from class: com.google.android.gms.internal.ads.zzczp
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzekx) obj).zzq();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
        zzn(this.zzb, new zzdao() { // from class: com.google.android.gms.internal.ads.zzdac
            @Override // com.google.android.gms.internal.ads.zzdao
            public final void zza(Object obj) {
                ((zzekx) obj).zzs();
            }
        });
    }
}
