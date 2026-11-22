package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdsl {
    private final zzbjp zza;

    zzdsl(zzbjp zzbjpVar) {
        this.zza = zzbjpVar;
    }

    private final void zzs(zzdsk zzdskVar) throws RemoteException {
        String strZza = zzdsk.zza(zzdskVar);
        zzcaa.zzi("Dispatching AFMA event on publisher webview: ".concat(strZza));
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdsk("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("interstitial", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onAdClicked";
        this.zza.zzb(zzdsk.zza(zzdskVar));
    }

    public final void zzc(long j) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("interstitial", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onAdClosed";
        zzs(zzdskVar);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("interstitial", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onAdFailedToLoad";
        zzdskVar.zzd = Integer.valueOf(i);
        zzs(zzdskVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("interstitial", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onAdLoaded";
        zzs(zzdskVar);
    }

    public final void zzf(long j) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("interstitial", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdskVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("interstitial", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onAdOpened";
        zzs(zzdskVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("creation", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "nativeObjectCreated";
        zzs(zzdskVar);
    }

    public final void zzi(long j) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("creation", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "nativeObjectNotCreated";
        zzs(zzdskVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onAdClicked";
        zzs(zzdskVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onRewardedAdClosed";
        zzs(zzdskVar);
    }

    public final void zzl(long j, zzbvt zzbvtVar) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onUserEarnedReward";
        zzdskVar.zze = zzbvtVar.zzf();
        zzdskVar.zzf = Integer.valueOf(zzbvtVar.zze());
        zzs(zzdskVar);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onRewardedAdFailedToLoad";
        zzdskVar.zzd = Integer.valueOf(i);
        zzs(zzdskVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onRewardedAdFailedToShow";
        zzdskVar.zzd = Integer.valueOf(i);
        zzs(zzdskVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onAdImpression";
        zzs(zzdskVar);
    }

    public final void zzp(long j) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onRewardedAdLoaded";
        zzs(zzdskVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdskVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzdsk zzdskVar = new zzdsk("rewarded", null);
        zzdskVar.zza = Long.valueOf(j);
        zzdskVar.zzc = "onRewardedAdOpened";
        zzs(zzdskVar);
    }
}
