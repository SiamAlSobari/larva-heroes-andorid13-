package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdlw {
    private final Executor zza;
    private final zzcpi zzb;
    private final zzddq zzc;

    zzdlw(Executor executor, zzcpi zzcpiVar, zzddq zzddqVar) {
        this.zza = executor;
        this.zzc = zzddqVar;
        this.zzb = zzcpiVar;
    }

    public final void zza(final zzcfi zzcfiVar) {
        if (zzcfiVar == null) {
            return;
        }
        this.zzc.zza(zzcfiVar.zzF());
        this.zzc.zzo(new zzauf() { // from class: com.google.android.gms.internal.ads.zzdls
            @Override // com.google.android.gms.internal.ads.zzauf
            public final void zzbt(zzaue zzaueVar) {
                zzcfiVar.zzN().zzp(zzaueVar.zzd.left, zzaueVar.zzd.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzauf() { // from class: com.google.android.gms.internal.ads.zzdlt
            @Override // com.google.android.gms.internal.ads.zzauf
            public final void zzbt(zzaue zzaueVar) {
                zzcfi zzcfiVar2 = zzcfiVar;
                HashMap map = new HashMap();
                map.put("isVisible", true != zzaueVar.zzj ? "0" : "1");
                zzcfiVar2.zzd("onAdVisibilityChanged", map);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcfiVar);
        zzcfiVar.zzad("/trackActiveViewUnit", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcfi) obj, map);
            }
        });
        zzcfiVar.zzad("/untrackActiveViewUnit", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdlv
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcfi) obj, map);
            }
        });
    }

    final /* synthetic */ void zzb(zzcfi zzcfiVar, Map map) {
        this.zzb.zzb();
    }

    final /* synthetic */ void zzc(zzcfi zzcfiVar, Map map) {
        this.zzb.zza();
    }
}
