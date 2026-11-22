package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnl extends VideoController.VideoLifecycleCallbacks {
    private final zzdic zza;

    public zzdnl(zzdic zzdicVar) {
        this.zza = zzdicVar;
    }

    private static com.google.android.gms.ads.internal.client.zzdt zza(zzdic zzdicVar) {
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzj = zzdicVar.zzj();
        if (zzdqVarZzj == null) {
            return null;
        }
        try {
            return zzdqVarZzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzdt zzdtVarZza = zza(this.zza);
        if (zzdtVarZza == null) {
            return;
        }
        try {
            zzdtVarZza.zze();
        } catch (RemoteException e) {
            zzcaa.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzdt zzdtVarZza = zza(this.zza);
        if (zzdtVarZza == null) {
            return;
        }
        try {
            zzdtVarZza.zzg();
        } catch (RemoteException e) {
            zzcaa.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzdt zzdtVarZza = zza(this.zza);
        if (zzdtVarZza == null) {
            return;
        }
        try {
            zzdtVarZza.zzi();
        } catch (RemoteException e) {
            zzcaa.zzk("Unable to call onVideoEnd()", e);
        }
    }
}
