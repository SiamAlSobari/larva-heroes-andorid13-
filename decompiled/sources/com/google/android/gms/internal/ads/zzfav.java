package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfav extends zzbvv {
    private final zzfar zza;
    private final zzfah zzb;
    private final String zzc;
    private final zzfbs zzd;
    private final Context zze;
    private final zzcag zzf;
    private final zzaqx zzg;
    private final zzdrh zzh;
    private zzdnq zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaD)).booleanValue();

    public zzfav(String str, zzfar zzfarVar, Context context, zzfah zzfahVar, zzfbs zzfbsVar, zzcag zzcagVar, zzaqx zzaqxVar, zzdrh zzdrhVar) {
        this.zzc = str;
        this.zza = zzfarVar;
        this.zzb = zzfahVar;
        this.zzd = zzfbsVar;
        this.zze = context;
        this.zzf = zzcagVar;
        this.zzg = zzaqxVar;
        this.zzh = zzdrhVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbwd zzbwdVar, int i) throws RemoteException {
        boolean z = false;
        if (((Boolean) zzbdi.zzl.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkc)).booleanValue()) {
                z = true;
            }
        }
        if (this.zzf.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkd)).intValue() || !z) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        }
        this.zzb.zzk(zzbwdVar);
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzE(this.zze) && zzlVar.zzs == null) {
            zzcaa.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzbF(zzfdb.zzd(4, null, null));
            return;
        }
        if (this.zzi != null) {
            return;
        }
        zzfaj zzfajVar = new zzfaj(null);
        this.zza.zzj(i);
        this.zza.zzb(zzlVar, this.zzc, zzfajVar, new zzfau(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdnq zzdnqVar = this.zzi;
        return zzdnqVar != null ? zzdnqVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final com.google.android.gms.ads.internal.client.zzdn zzc() {
        zzdnq zzdnqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgF)).booleanValue() && (zzdnqVar = this.zzi) != null) {
            return zzdnqVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final zzbvt zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdnq zzdnqVar = this.zzi;
        if (zzdnqVar != null) {
            return zzdnqVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final synchronized String zze() throws RemoteException {
        zzdnq zzdnqVar = this.zzi;
        if (zzdnqVar == null || zzdnqVar.zzl() == null) {
            return null;
        }
        return zzdnqVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbwd zzbwdVar) throws RemoteException {
        zzu(zzlVar, zzbwdVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbwd zzbwdVar) throws RemoteException {
        zzu(zzlVar, zzbwdVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final synchronized void zzh(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        if (zzddVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfat(this, zzddVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            zzcaa.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzi(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzk(zzbvz zzbvzVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbvzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final synchronized void zzl(zzbwk zzbwkVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfbs zzfbsVar = this.zzd;
        zzfbsVar.zza = zzbwkVar.zza;
        zzfbsVar.zzb = zzbwkVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            zzcaa.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzp(zzfdb.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcv)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdnq zzdnqVar = this.zzi;
        return (zzdnqVar == null || zzdnqVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzp(zzbwe zzbweVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbweVar);
    }
}
