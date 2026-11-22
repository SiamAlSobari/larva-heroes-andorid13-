package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdlx {
    private final zzfca zza;
    private final Executor zzb;
    private final zzdom zzc;
    private final zzdnh zzd;
    private final Context zze;
    private final zzdrh zzf;
    private final zzfgo zzg;
    private final zzfik zzh;
    private final zzech zzi;

    public zzdlx(zzfca zzfcaVar, Executor executor, zzdom zzdomVar, Context context, zzdrh zzdrhVar, zzfgo zzfgoVar, zzfik zzfikVar, zzech zzechVar, zzdnh zzdnhVar) {
        this.zza = zzfcaVar;
        this.zzb = executor;
        this.zzc = zzdomVar;
        this.zze = context;
        this.zzf = zzdrhVar;
        this.zzg = zzfgoVar;
        this.zzh = zzfikVar;
        this.zzi = zzechVar;
        this.zzd = zzdnhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzh(zzcfi zzcfiVar) {
        zzi(zzcfiVar);
        zzcfiVar.zzad("/video", zzbiq.zzl);
        zzcfiVar.zzad("/videoMeta", zzbiq.zzm);
        zzcfiVar.zzad("/precache", new zzcdv());
        zzcfiVar.zzad("/delayPageLoaded", zzbiq.zzp);
        zzcfiVar.zzad("/instrument", zzbiq.zzn);
        zzcfiVar.zzad("/log", zzbiq.zzg);
        zzcfiVar.zzad("/click", new zzbhr(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzcfiVar.zzN().zzD(true);
            zzcfiVar.zzad("/open", new zzbjc(null, null, null, null, null, null));
        } else {
            zzcfiVar.zzN().zzD(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(zzcfiVar.getContext())) {
            zzcfiVar.zzad("/logScionEvent", new zzbiw(zzcfiVar.getContext()));
        }
    }

    private static final void zzi(zzcfi zzcfiVar) {
        zzcfiVar.zzad("/videoClicked", zzbiq.zzh);
        zzcfiVar.zzN().zzF(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdB)).booleanValue()) {
            zzcfiVar.zzad("/getNativeAdViewSignals", zzbiq.zzs);
        }
        zzcfiVar.zzad("/getNativeClickMeta", zzbiq.zzt);
    }

    public final ListenableFuture zza(final JSONObject jSONObject) {
        return zzfye.zzn(zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdln
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zze(obj);
            }
        }, this.zzb), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdlo
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzcfi) obj);
            }
        }, this.zzb);
    }

    public final ListenableFuture zzb(final String str, final String str2, final zzfbe zzfbeVar, final zzfbi zzfbiVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdlq
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzqVar, zzfbeVar, zzfbiVar, str, str2, obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject, final zzcfi zzcfiVar) throws Exception {
        final zzcar zzcarVarZza = zzcar.zza(zzcfiVar);
        if (this.zza.zzb != null) {
            zzcfiVar.zzag(zzcgx.zzd());
        } else {
            zzcfiVar.zzag(zzcgx.zze());
        }
        zzcfiVar.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // com.google.android.gms.internal.ads.zzcgt
            public final void zza(boolean z, int i, String str, String str2) {
                this.zza.zzf(zzcfiVar, zzcarVarZza, z, i, str, str2);
            }
        });
        zzcfiVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcarVarZza;
    }

    final /* synthetic */ ListenableFuture zzd(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfbe zzfbeVar, zzfbi zzfbiVar, String str, String str2, Object obj) throws Exception {
        final zzcfi zzcfiVarZza = this.zzc.zza(zzqVar, zzfbeVar, zzfbiVar);
        final zzcar zzcarVarZza = zzcar.zza(zzcfiVarZza);
        if (this.zza.zzb != null) {
            zzh(zzcfiVarZza);
            zzcfiVarZza.zzag(zzcgx.zzd());
        } else {
            zzdne zzdneVarZzb = this.zzd.zzb();
            zzcfiVarZza.zzN().zzM(zzdneVarZzb, zzdneVarZzb, zzdneVarZzb, zzdneVarZzb, zzdneVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzi, this.zzh, this.zzf, this.zzg, null, zzdneVarZzb, null, null, null);
            zzi(zzcfiVarZza);
        }
        zzcfiVarZza.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzdlr
            @Override // com.google.android.gms.internal.ads.zzcgt
            public final void zza(boolean z, int i, String str3, String str4) {
                this.zza.zzg(zzcfiVarZza, zzcarVarZza, z, i, str3, str4);
            }
        });
        zzcfiVarZza.zzab(str, str2, null);
        return zzcarVarZza;
    }

    final /* synthetic */ ListenableFuture zze(Object obj) throws Exception {
        zzcfi zzcfiVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        final zzcar zzcarVarZza = zzcar.zza(zzcfiVarZza);
        zzh(zzcfiVarZza);
        zzcfiVarZza.zzN().zzG(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza() {
                zzcarVarZza.zzb();
            }
        });
        zzcfiVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdA));
        return zzcarVarZza;
    }

    final /* synthetic */ void zzf(zzcfi zzcfiVar, zzcar zzcarVar, boolean z, int i, String str, String str2) {
        if (this.zza.zza != null && zzcfiVar.zzq() != null) {
            zzcfiVar.zzq().zzs(this.zza.zza);
        }
        zzcarVar.zzb();
    }

    final /* synthetic */ void zzg(zzcfi zzcfiVar, zzcar zzcarVar, boolean z, int i, String str, String str2) {
        if (z) {
            if (this.zza.zza != null && zzcfiVar.zzq() != null) {
                zzcfiVar.zzq().zzs(this.zza.zza);
            }
            zzcarVar.zzb();
            return;
        }
        zzcarVar.zzd(new zzehf(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}
