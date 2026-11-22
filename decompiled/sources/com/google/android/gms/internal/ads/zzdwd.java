package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwd {
    private final ScheduledExecutorService zza;
    private final zzfyo zzb;
    private final zzfyo zzc;
    private final zzdwu zzd;
    private final zzgyn zze;

    public zzdwd(ScheduledExecutorService scheduledExecutorService, zzfyo zzfyoVar, zzfyo zzfyoVar2, zzdwu zzdwuVar, zzgyn zzgynVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzfyoVar;
        this.zzc = zzfyoVar2;
        this.zzd = zzdwuVar;
        this.zze = zzgynVar;
    }

    final /* synthetic */ ListenableFuture zza(zzbun zzbunVar, int i, Throwable th) throws Exception {
        return ((zzdzo) this.zze.zzb()).zzd(zzbunVar, i);
    }

    public final ListenableFuture zzb(final zzbun zzbunVar) {
        ListenableFuture listenableFutureZzb;
        String str = zzbunVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzz(str)) {
            listenableFutureZzb = zzfye.zzg(new zzdxh(1));
        } else {
            listenableFutureZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhs)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzc(zzbunVar);
                }
            }) : this.zzd.zzb(zzbunVar);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfye.zzf((zzfxv) zzfye.zzo(zzfxv.zzu(listenableFutureZzb), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfr)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdwc
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zza(zzbunVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzc(zzbun zzbunVar) throws Exception {
        return (InputStream) this.zzd.zzb(zzbunVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfr)).intValue(), TimeUnit.SECONDS);
    }
}
