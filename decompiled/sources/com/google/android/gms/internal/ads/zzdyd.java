package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyd {
    private final zzfyo zza;
    private final zzfyo zzb;
    private final zzdyv zzc;

    zzdyd(zzfyo zzfyoVar, zzfyo zzfyoVar2, zzdyv zzdyvVar) {
        this.zza = zzfyoVar;
        this.zzb = zzfyoVar2;
        this.zzc = zzdyvVar;
    }

    final /* synthetic */ ListenableFuture zza(zzbtr zzbtrVar) throws Exception {
        return this.zzc.zza(zzbtrVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzko)).longValue());
    }

    public final ListenableFuture zzb(final zzbtr zzbtrVar) {
        String str = zzbtrVar.zzb;
        com.google.android.gms.ads.internal.zzt.zzp();
        return zzfye.zzn(zzfye.zzf(zzfxv.zzu(com.google.android.gms.ads.internal.util.zzs.zzz(str) ? zzfye.zzg(new zzdxh(1, "Ads signal service force local")) : zzfye.zzf(zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.internal.ads.zzdxz
            @Override // com.google.android.gms.internal.ads.zzfxk
            public final ListenableFuture zza() {
                return this.zza.zza(zzbtrVar);
            }
        }, this.zza), ExecutionException.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdya
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
        }, this.zzb)), zzdxh.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdyb
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzfye.zzh(null);
            }
        }, this.zzb), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdyc
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return zzfye.zzh(jSONObject);
                }
                try {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    jSONObject = new JSONObject(com.google.android.gms.ads.internal.util.zzs.zzK(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return zzfye.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
