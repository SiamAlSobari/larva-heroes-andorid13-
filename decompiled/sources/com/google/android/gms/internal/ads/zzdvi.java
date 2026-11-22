package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvi {
    private final zzfyo zza;
    private final zzfyo zzb;
    private final zzdwq zzc;
    private final zzgyn zzd;

    public zzdvi(zzfyo zzfyoVar, zzfyo zzfyoVar2, zzdwq zzdwqVar, zzgyn zzgynVar) {
        this.zza = zzfyoVar;
        this.zzb = zzfyoVar2;
        this.zzc = zzdwqVar;
        this.zzd = zzgynVar;
    }

    final /* synthetic */ ListenableFuture zza(zzbun zzbunVar, int i, zzdxh zzdxhVar) throws Exception {
        return ((zzdzo) this.zzd.zzb()).zzc(zzbunVar, i);
    }

    public final ListenableFuture zzb(final zzbun zzbunVar) {
        String str = zzbunVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        ListenableFuture listenableFutureZzg = com.google.android.gms.ads.internal.util.zzs.zzz(str) ? zzfye.zzg(new zzdxh(1)) : zzfye.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(zzbunVar);
            }
        }), ExecutionException.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdvg
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzfye.zzg(((ExecutionException) obj).getCause());
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzfye.zzf(listenableFutureZzg, zzdxh.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdvh
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zza(zzbunVar, callingUid, (zzdxh) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzc(zzbun zzbunVar) throws Exception {
        zzcas zzcasVar;
        final zzdwq zzdwqVar = this.zzc;
        synchronized (zzdwqVar.zzb) {
            if (zzdwqVar.zzc) {
                zzcasVar = zzdwqVar.zza;
            } else {
                zzdwqVar.zzc = true;
                zzdwqVar.zze = zzbunVar;
                zzdwqVar.zzf.checkAvailabilityAndConnect();
                zzdwqVar.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwp
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdwqVar.zza();
                    }
                }, zzcan.zzf);
                zzcasVar = zzdwqVar.zza;
            }
        }
        return (InputStream) zzcasVar.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfr)).intValue(), TimeUnit.SECONDS);
    }
}
