package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwi implements zzdxg {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdvi zzb;
    private final zzfyo zzc;
    private final zzfca zzd;
    private final ScheduledExecutorService zze;
    private final zzebe zzf;
    private final zzfhr zzg;
    private final Context zzh;

    zzdwi(Context context, zzfca zzfcaVar, zzdvi zzdviVar, zzfyo zzfyoVar, ScheduledExecutorService scheduledExecutorService, zzebe zzebeVar, zzfhr zzfhrVar) {
        this.zzh = context;
        this.zzd = zzfcaVar;
        this.zzb = zzdviVar;
        this.zzc = zzfyoVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzebeVar;
        this.zzg = zzfhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxg
    public final ListenableFuture zzb(zzbun zzbunVar) {
        ListenableFuture listenableFutureZzb = this.zzb.zzb(zzbunVar);
        zzfhg zzfhgVarZza = zzfhf.zza(this.zzh, 11);
        zzfhq.zzd(listenableFutureZzb, zzfhgVarZza);
        ListenableFuture listenableFutureZzn = zzfye.zzn(listenableFutureZzb, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdwf
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc((InputStream) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfq)).booleanValue()) {
            listenableFutureZzn = zzfye.zzf(zzfye.zzo(listenableFutureZzn, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfr)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdwg
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj) {
                    return zzfye.zzg(new zzdve(5));
                }
            }, zzcan.zzf);
        }
        zzfhq.zza(listenableFutureZzn, this.zzg, zzfhgVarZza);
        zzfye.zzr(listenableFutureZzn, new zzdwh(this), zzcan.zzf);
        return listenableFutureZzn;
    }

    final /* synthetic */ ListenableFuture zzc(InputStream inputStream) throws Exception {
        return zzfye.zzh(new zzfbr(new zzfbo(this.zzd), zzfbq.zza(new InputStreamReader(inputStream))));
    }
}
