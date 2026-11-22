package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdjo {
    private final zzdom zza;
    private final zzdnb zzb;
    private final zzcpi zzc;
    private final zzdik zzd;

    public zzdjo(zzdom zzdomVar, zzdnb zzdnbVar, zzcpi zzcpiVar, zzdik zzdikVar) {
        this.zza = zzdomVar;
        this.zzb = zzdnbVar;
        this.zzc = zzcpiVar;
        this.zzd = zzdikVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() throws zzcft {
        zzcfi zzcfiVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view = (View) zzcfiVarZza;
        view.setVisibility(8);
        zzcfiVarZza.zzad("/sendMessageToSdk", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdji
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcfi) obj, map);
            }
        });
        zzcfiVarZza.zzad("/adMuted", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdjj
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcfi) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zzcfiVarZza), "/loadHtml", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdjk
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, final Map map) {
                final zzdjo zzdjoVar = this.zza;
                zzcfi zzcfiVar = (zzcfi) obj;
                zzcfiVar.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzdjn
                    @Override // com.google.android.gms.internal.ads.zzcgt
                    public final void zza(boolean z, int i, String str, String str2) {
                        zzdjoVar.zzd(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcfiVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcfiVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzj(new WeakReference(zzcfiVarZza), "/showOverlay", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdjl
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                this.zza.zze((zzcfi) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zzcfiVarZza), "/hideOverlay", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdjm
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                this.zza.zzf((zzcfi) obj, map);
            }
        });
        return view;
    }

    final /* synthetic */ void zzb(zzcfi zzcfiVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(zzcfi zzcfiVar, Map map) {
        this.zzd.zzg();
    }

    final /* synthetic */ void zzd(Map map, boolean z, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void zze(zzcfi zzcfiVar, Map map) {
        zzcaa.zzi("Showing native ads overlay.");
        zzcfiVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zzf(zzcfi zzcfiVar, Map map) {
        zzcaa.zzi("Hiding native ads overlay.");
        zzcfiVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
