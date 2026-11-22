package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeul implements zzesj {
    private final Context zza;
    private final zzbzj zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzbza zzf;

    public zzeul(zzbza zzbzaVar, int i, Context context, zzbzj zzbzjVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zzf = zzbzaVar;
        this.zza = context;
        this.zzb = zzbzjVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        return zzfye.zze((zzfxv) zzfye.zzo(zzfye.zzm(zzfxv.zzu(zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.internal.ads.zzeui
            @Override // com.google.android.gms.internal.ads.zzfxk
            public final ListenableFuture zza() {
                return zzfye.zzh(null);
            }
        }, this.zzd)), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzeuj
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzeum(str);
            }
        }, this.zzd), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaT)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzeuk
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                this.zza.zzc((Exception) obj);
                return null;
            }
        }, zzfyu.zzb());
    }

    final /* synthetic */ zzeum zzc(Exception exc) {
        this.zzb.zzu(exc, "AttestationTokenSignal");
        return null;
    }
}
