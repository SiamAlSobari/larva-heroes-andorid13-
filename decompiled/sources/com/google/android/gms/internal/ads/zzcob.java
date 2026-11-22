package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcob {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzedj zzc;
    private final zzdor zzd;
    private final zzfyo zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private zzbth zzh;

    zzcob(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzedj zzedjVar, zzdor zzdorVar, zzfyo zzfyoVar, zzfyo zzfyoVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zza = context;
        this.zzb = zzgVar;
        this.zzc = zzedjVar;
        this.zzd = zzdorVar;
        this.zze = zzfyoVar;
        this.zzf = zzfyoVar2;
        this.zzg = scheduledExecutorService;
    }

    private final ListenableFuture zzj(final String str, @Nullable final InputEvent inputEvent, Random random) {
        final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjp)) || this.zzb.zzQ()) {
            return zzfye.zzh(str);
        }
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjq), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
        if (inputEvent != null) {
            return zzfye.zzf(zzfye.zzn(zzfxv.zzu(this.zzc.zza()), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcnu
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zzd(builderBuildUpon, str, inputEvent, (Integer) obj);
                }
            }, this.zzf), Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcnv
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zze(builderBuildUpon, (Throwable) obj);
                }
            }, this.zze);
        }
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjr), "11");
        return zzfye.zzh(builderBuildUpon.toString());
    }

    public final ListenableFuture zzc(final String str, Random random) {
        return zzfye.zzf(zzj(str, this.zzd.zza(), random), Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcnw
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzfye.zzh(str);
            }
        }, this.zze);
    }

    final /* synthetic */ ListenableFuture zzd(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        int iIntValue = num.intValue();
        zzedj zzedjVar = this.zzc;
        if (iIntValue != 1) {
            builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjr), "10");
            return zzfye.zzh(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjs), "1");
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjr), "12");
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjt))) {
            builderBuildUpon.authority((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzju));
        }
        return zzfye.zzn(zzfxv.zzu(zzedjVar.zzb(builderBuildUpon.build(), inputEvent)), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcnx
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjr), "12");
                return zzfye.zzh(builder2.toString());
            }
        }, this.zzf);
    }

    final /* synthetic */ ListenableFuture zze(Uri.Builder builder, final Throwable th) throws Exception {
        this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjr), "9");
        return zzfye.zzh(builder.toString());
    }

    final /* synthetic */ void zzh(Throwable th) {
        zzbth zzbthVarZza = zzbtf.zza(this.zza);
        this.zzh = zzbthVarZza;
        zzbthVarZza.zzf(th, "AttributionReporting");
    }

    public final void zzi(String str, zzfik zzfikVar, Random random) {
        zzfye.zzr(zzfye.zzo(zzj(str, this.zzd.zza(), random), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjv)).intValue(), TimeUnit.MILLISECONDS, this.zzg), new zzcoa(this, zzfikVar, str), this.zze);
    }
}
