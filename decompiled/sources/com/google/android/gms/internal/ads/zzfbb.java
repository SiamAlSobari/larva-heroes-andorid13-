package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfbb extends zzbvf {
    private final zzfar zza;
    private final zzfah zzb;
    private final zzfbs zzc;
    private zzdnq zzd;
    private boolean zze = false;

    public zzfbb(zzfar zzfarVar, zzfah zzfahVar, zzfbs zzfbsVar) {
        this.zza = zzfarVar;
        this.zzb = zzfahVar;
        this.zzc = zzfbsVar;
    }

    private final synchronized boolean zzy() {
        zzdnq zzdnqVar = this.zzd;
        return (zzdnqVar == null || zzdnqVar.zze()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdnq zzdnqVar = this.zzd;
        return zzdnqVar != null ? zzdnqVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgF)).booleanValue()) {
            return null;
        }
        zzdnq zzdnqVar = this.zzd;
        if (zzdnqVar == null) {
            return null;
        }
        return zzdnqVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final synchronized String zzd() throws RemoteException {
        zzdnq zzdnqVar = this.zzd;
        if (zzdnqVar == null || zzdnqVar.zzl() == null) {
            return null;
        }
        return zzdnqVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0019, B:12:0x0022, B:13:0x002b, B:15:0x0031, B:19:0x0045), top: B:25:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0043, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzbvg
    public final synchronized void zzg(zzbvk zzbvkVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzbvkVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfk);
        if (str2 == null || str == null) {
            if (zzy()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfm)).booleanValue()) {
                    return;
                }
            }
            zzfaj zzfajVar = new zzfaj(null);
            this.zzd = null;
            this.zza.zzj(1);
            this.zza.zzb(zzbvkVar.zza, zzbvkVar.zzb, zzfajVar, new zzfaz(this));
            return;
        }
        try {
            if (Pattern.matches(str2, str)) {
                return;
            }
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "NonagonUtil.isPatternMatched");
        }
        if (zzy()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfm)).booleanValue()) {
                return;
            }
        }
        zzfaj zzfajVar2 = new zzfaj(null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzbvkVar.zza, zzbvkVar.zzb, zzfajVar2, new zzfaz(this));
        return;
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzl(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfba(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final synchronized void zzn(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzo(zzbvj zzbvjVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbvjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (objUnwrap instanceof Activity) {
                    activity = (Activity) objUnwrap;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final boolean zzt() {
        zzdnq zzdnqVar = this.zzd;
        return zzdnqVar != null && zzdnqVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzu(zzbve zzbveVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbveVar);
    }
}
