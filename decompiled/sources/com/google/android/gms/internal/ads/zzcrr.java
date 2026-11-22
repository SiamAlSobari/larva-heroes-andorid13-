package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcrr implements zzcxw, zzcxc {
    private final Context zza;
    private final zzcfi zzb;
    private final zzfbe zzc;
    private final zzcag zzd;
    private zzfip zze;
    private boolean zzf;

    public zzcrr(Context context, zzcfi zzcfiVar, zzfbe zzfbeVar, zzcag zzcagVar) {
        this.zza = context;
        this.zzb = zzcfiVar;
        this.zzc = zzfbeVar;
        this.zzd = zzcagVar;
    }

    private final synchronized void zza() {
        zzedh zzedhVar;
        zzedi zzediVar;
        if (this.zzc.zzU) {
            if (this.zzb == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zza)) {
                zzcag zzcagVar = this.zzd;
                String str = zzcagVar.zzb + "." + zzcagVar.zzc;
                String strZza = this.zzc.zzW.zza();
                if (this.zzc.zzW.zzb() == 1) {
                    zzedhVar = zzedh.VIDEO;
                    zzediVar = zzedi.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzedhVar = zzedh.HTML_DISPLAY;
                    zzediVar = this.zzc.zzf == 1 ? zzedi.ONE_PIXEL : zzedi.BEGIN_TO_RENDER;
                }
                zzfip zzfipVarZza = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzb.zzG(), "", "javascript", strZza, zzediVar, zzedhVar, this.zzc.zzam);
                this.zze = zzfipVarZza;
                Object obj = this.zzb;
                if (zzfipVarZza != null) {
                    com.google.android.gms.ads.internal.zzt.zzA().zzh(this.zze, (View) obj);
                    this.zzb.zzap(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzA().zzi(this.zze);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzq() {
        zzcfi zzcfiVar;
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzU || this.zze == null || (zzcfiVar = this.zzb) == null) {
            return;
        }
        zzcfiVar.zzd("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final synchronized void zzr() {
        if (this.zzf) {
            return;
        }
        zza();
    }
}
