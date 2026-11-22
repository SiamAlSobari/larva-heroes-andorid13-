package com.google.android.gms.internal.ads;

import com.google.firebase.messaging.Constants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdti extends zzbkr {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfhg zzd;
    final /* synthetic */ zzcas zze;
    final /* synthetic */ zzdtj zzf;

    zzdti(zzdtj zzdtjVar, Object obj, String str, long j, zzfhg zzfhgVar, zzcas zzcasVar) {
        this.zzf = zzdtjVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfhgVar;
        this.zze = zzcasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zze(String str) {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.zzf.zzo.zzb(this.zzb, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            zzfhu zzfhuVar = this.zzf.zzp;
            zzfhg zzfhgVar = this.zzd;
            zzfhgVar.zzc(str);
            zzfhgVar.zzf(false);
            zzfhuVar.zzb(zzfhgVar.zzl());
            this.zze.zzc(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zzf() {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzfhu zzfhuVar = this.zzf.zzp;
            zzfhg zzfhgVar = this.zzd;
            zzfhgVar.zzf(true);
            zzfhuVar.zzb(zzfhgVar.zzl());
            this.zze.zzc(true);
        }
    }
}
