package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcss {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcss(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    static /* bridge */ /* synthetic */ void zzb(final zzcss zzcssVar, List list, final zzfya zzfyaVar) {
        if (list == null || list.isEmpty()) {
            zzcssVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsm
                @Override // java.lang.Runnable
                public final void run() {
                    zzfyaVar.zza(new zzdve(3));
                }
            });
            return;
        }
        ListenableFuture listenableFutureZzh = zzfye.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it.next();
            listenableFutureZzh = zzfye.zzn(zzfye.zzf(listenableFutureZzh, Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcsn
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj) {
                    zzfyaVar.zza((Throwable) obj);
                    return zzfye.zzh(null);
                }
            }, zzcssVar.zza), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcso
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zza(zzfyaVar, listenableFuture, (zzcse) obj);
                }
            }, zzcssVar.zza);
        }
        zzfye.zzr(listenableFutureZzh, new zzcsr(zzcssVar, zzfyaVar), zzcssVar.zza);
    }

    final /* synthetic */ ListenableFuture zza(zzfya zzfyaVar, ListenableFuture listenableFuture, zzcse zzcseVar) throws Exception {
        if (zzcseVar != null) {
            zzfyaVar.zzb(zzcseVar);
        }
        return zzfye.zzo(listenableFuture, ((Long) zzbdw.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzfya zzfyaVar) {
        zzfye.zzr(this.zzc, new zzcsq(this, zzfyaVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
