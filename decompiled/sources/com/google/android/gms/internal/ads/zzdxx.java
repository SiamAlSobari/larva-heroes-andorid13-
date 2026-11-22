package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdxx {
    private final zzfyo zza;
    private final zzfyo zzb;
    private final zzdys zzc;
    private final zzgyn zzd;

    zzdxx(zzfyo zzfyoVar, zzfyo zzfyoVar2, zzdys zzdysVar, zzgyn zzgynVar) {
        this.zza = zzfyoVar;
        this.zzb = zzfyoVar2;
        this.zzc = zzdysVar;
        this.zzd = zzgynVar;
    }

    final /* synthetic */ ListenableFuture zza(zzbtv zzbtvVar) throws Exception {
        return this.zzc.zza(zzbtvVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkp)).longValue());
    }

    final /* synthetic */ ListenableFuture zzb(zzbtv zzbtvVar, int i, zzdxh zzdxhVar) throws Exception {
        return ((zzdzy) this.zzd.zzb()).zzb(zzbtvVar, i);
    }

    public final ListenableFuture zzc(final zzbtv zzbtvVar) {
        String str = zzbtvVar.zzf;
        com.google.android.gms.ads.internal.zzt.zzp();
        ListenableFuture listenableFutureZzg = com.google.android.gms.ads.internal.util.zzs.zzz(str) ? zzfye.zzg(new zzdxh(1, "Ads service proxy force local")) : zzfye.zzf(zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.internal.ads.zzdxu
            @Override // com.google.android.gms.internal.ads.zzfxk
            public final ListenableFuture zza() {
                return this.zza.zza(zzbtvVar);
            }
        }, this.zza), ExecutionException.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxv
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                ExecutionException cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return zzfye.zzg(cause2);
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzfye.zzf(listenableFutureZzg, zzdxh.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxw
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzbtvVar, callingUid, (zzdxh) obj);
            }
        }, this.zzb);
    }
}
