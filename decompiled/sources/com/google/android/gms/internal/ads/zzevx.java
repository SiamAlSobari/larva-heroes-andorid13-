package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevx implements zzesj {
    private final zzbzj zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzfyo zze;
    private final String zzf;
    private final zzbyy zzg;

    zzevx(zzbzj zzbzjVar, boolean z, boolean z2, zzbyy zzbyyVar, zzfyo zzfyoVar, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzbzjVar;
        this.zzb = z;
        this.zzc = z2;
        this.zzg = zzbyyVar;
        this.zze = zzfyoVar;
        this.zzf = str;
        this.zzd = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzha)).booleanValue() && this.zzc) {
            return zzfye.zzh(null);
        }
        return !this.zzb ? zzfye.zzh(null) : zzfye.zze(zzfye.zzo(zzfye.zzm(zzfye.zzh(null), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzevv
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzevy(str);
            }
        }, this.zze), ((Long) zzbdx.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzevw
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                this.zza.zzc((Exception) obj);
                return null;
            }
        }, this.zze);
    }

    final /* synthetic */ zzevy zzc(Exception exc) {
        this.zza.zzu(exc, "TrustlessTokenSignal");
        return null;
    }
}
