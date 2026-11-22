package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzenn implements zzesj {
    final zzbzj zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzfyo zzd;
    private final Context zze;

    zzenn(Context context, zzbzj zzbzjVar, ScheduledExecutorService scheduledExecutorService, zzfyo zzfyoVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcC)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbzjVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcy)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcD)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcz)).booleanValue()) {
                    return zzfye.zzm(zzfom.zza(this.zzb.getAppSetIdInfo()), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzenk
                        @Override // com.google.android.gms.internal.ads.zzfqw
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                            return new zzeno(appSetIdInfo.getId(), appSetIdInfo.getScope());
                        }
                    }, zzcan.zzf);
                }
                Task<AppSetIdInfo> taskZza = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcC)).booleanValue() ? zzfde.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZza == null) {
                    return zzfye.zzh(new zzeno(null, -1));
                }
                ListenableFuture listenableFutureZzn = zzfye.zzn(zzfom.zza(taskZza), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzenl
                    @Override // com.google.android.gms.internal.ads.zzfxl
                    public final ListenableFuture zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzfye.zzh(new zzeno(null, -1)) : zzfye.zzh(new zzeno(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, zzcan.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcA)).booleanValue()) {
                    listenableFutureZzn = zzfye.zzo(listenableFutureZzn, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcB)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfye.zze(listenableFutureZzn, Exception.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzenm
                    @Override // com.google.android.gms.internal.ads.zzfqw
                    public final Object apply(Object obj) {
                        this.zza.zza.zzu((Exception) obj, "AppSetIdInfoSignal");
                        return new zzeno(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzfye.zzh(new zzeno(null, -1));
    }
}
