package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzesy implements zzesj {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzfyo zzc;
    private final ScheduledExecutorService zzd;
    private final zzedl zze;

    zzesy(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzfyo zzfyoVar, ScheduledExecutorService scheduledExecutorService, zzedl zzedlVar) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzfyoVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzedlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 56;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjw)).booleanValue() || !this.zza.zzR()) {
            return zzfye.zzh(new zzeta("", -1, null));
        }
        return zzfye.zzf(zzfye.zzn(zzfxv.zzu(zzfye.zzo(this.zze.zza(false), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjx)).intValue(), TimeUnit.MILLISECONDS, this.zzd)), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzesw
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                zzgvi zzgviVarZza = zzgvj.zza();
                for (Topic topic : ((GetTopicsResponse) obj).getTopics()) {
                    zzgvg zzgvgVarZza = zzgvh.zza();
                    zzgvgVarZza.zzc(topic.getTopicId());
                    zzgvgVarZza.zza(topic.getModelVersion());
                    zzgvgVarZza.zzb(topic.getTaxonomyVersion());
                    zzgviVarZza.zza((zzgvh) zzgvgVarZza.zzal());
                }
                return zzfye.zzh(new zzeta(Base64.encodeToString(((zzgvj) zzgviVarZza.zzal()).zzax(), 1), 1, null));
            }
        }, this.zzc), Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzesx
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, this.zzc);
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        zzeta zzetaVar;
        zzbtf.zza(this.zzb).zzf(th, "TopicsSignal.fetchTopicsSignal");
        if (th instanceof SecurityException) {
            zzetaVar = new zzeta("", 2, null);
        } else if (th instanceof IllegalStateException) {
            zzetaVar = new zzeta("", 3, null);
        } else if (th instanceof IllegalArgumentException) {
            zzetaVar = new zzeta("", 4, null);
        } else {
            zzetaVar = th instanceof TimeoutException ? new zzeta("", 5, null) : new zzeta("", 0, null);
        }
        return zzfye.zzh(zzetaVar);
    }
}
