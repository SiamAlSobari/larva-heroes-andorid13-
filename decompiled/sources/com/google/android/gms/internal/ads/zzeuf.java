package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeuf implements zzesj {
    private final zzbzj zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzfyo zzd;
    private final zzawh zze;

    zzeuf(String str, zzawh zzawhVar, zzbzj zzbzjVar, ScheduledExecutorService scheduledExecutorService, zzfyo zzfyoVar) {
        this.zzb = str;
        this.zze = zzawhVar;
        this.zza = zzbzjVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcy)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcD)).booleanValue()) {
                ListenableFuture listenableFutureZzn = zzfye.zzn(zzfom.zza(Tasks.forResult(null)), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzeud
                    @Override // com.google.android.gms.internal.ads.zzfxl
                    public final ListenableFuture zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzfye.zzh(new zzeug(null, -1)) : zzfye.zzh(new zzeug(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzd);
                if (((Boolean) zzbcz.zza.zze()).booleanValue()) {
                    listenableFutureZzn = zzfye.zzo(listenableFutureZzn, ((Long) zzbcz.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfye.zze(listenableFutureZzn, Exception.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzeue
                    @Override // com.google.android.gms.internal.ads.zzfqw
                    public final Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, this.zzd);
            }
        }
        return zzfye.zzh(new zzeug(null, -1));
    }

    final /* synthetic */ zzeug zzc(Exception exc) {
        this.zza.zzu(exc, "AppSetIdInfoGmscoreSignal");
        return new zzeug(null, -1);
    }
}
