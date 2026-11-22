package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbii implements zzbir {
    zzbii() {
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfi zzcfiVar = (zzcfi) obj;
        if (zzcfiVar.zzJ() != null) {
            zzcfiVar.zzJ().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = zzcfiVar.zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzM = zzcfiVar.zzM();
        if (zzlVarZzM != null) {
            zzlVarZzM.zzb();
        } else {
            zzcaa.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
