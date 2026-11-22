package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefh implements zzedn {
    private final zzcqz zza;
    private final zzeeo zzb;
    private final zzfyo zzc;
    private final zzcwk zzd;
    private final ScheduledExecutorService zze;

    public zzefh(zzcqz zzcqzVar, zzeeo zzeeoVar, zzcwk zzcwkVar, ScheduledExecutorService scheduledExecutorService, zzfyo zzfyoVar) {
        this.zza = zzcqzVar;
        this.zzb = zzeeoVar;
        this.zzd = zzcwkVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzfyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final ListenableFuture zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzefe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(zzfbrVar, zzfbeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        return zzfbrVar.zza.zza.zza() != null && this.zzb.zzb(zzfbrVar, zzfbeVar);
    }

    final /* synthetic */ zzcqc zzc(final zzfbr zzfbrVar, final zzfbe zzfbeVar) throws Exception {
        return this.zza.zzb(new zzcst(zzfbrVar, zzfbeVar, null), new zzcrm(zzfbrVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzeff
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(zzfbrVar, zzfbeVar);
            }
        })).zza();
    }

    final /* synthetic */ void zzf(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        zzfye.zzr(zzfye.zzo(this.zzb.zza(zzfbrVar, zzfbeVar), zzfbeVar.zzS, TimeUnit.SECONDS, this.zze), new zzefg(this), this.zzc);
    }
}
