package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzete implements zzesj {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbza zzg;

    zzete(zzbza zzbzaVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzbzaVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaS)).booleanValue()) {
            return zzfye.zzg(new Exception("Did not ad Ad ID into query param."));
        }
        return zzfye.zze((zzfxv) zzfye.zzo(zzfye.zzm(zzfxv.zzu(this.zzg.zza(this.zza, this.zzd)), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzetc
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return this.zza.zzc((AdvertisingIdClient.Info) obj);
            }
        }, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaT)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzetd
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return this.zza.zzd((Throwable) obj);
            }
        }, this.zzc);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    final /* synthetic */ zzetf zzc(AdvertisingIdClient.Info info) {
        zzfof zzfofVar = new zzfof();
        if (!this.zze) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcN)).booleanValue()) {
                zzfoi zzfoiVarZzj = zzfoi.zzj(this.zza);
                info.getClass();
                String id = info.getId();
                id.getClass();
                zzfofVar = zzfoiVarZzj.zzi(id, this.zza.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcU)).longValue(), this.zzf);
            } else if (this.zze) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcO)).booleanValue()) {
                    try {
                        zzfoi zzfoiVarZzj2 = zzfoi.zzj(this.zza);
                        info.getClass();
                        String id2 = info.getId();
                        id2.getClass();
                        zzfofVar = zzfoiVarZzj2.zzi(id2, this.zza.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcU)).longValue(), this.zzf);
                    } catch (IOException | IllegalArgumentException e) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdIdInfoSignalSource.getPaidV1");
                        zzfofVar = new zzfof();
                    }
                }
            }
        } else if (this.zze) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcO)).booleanValue()) {
                zzfoi zzfoiVarZzj3 = zzfoi.zzj(this.zza);
                info.getClass();
                String id3 = info.getId();
                id3.getClass();
                zzfofVar = zzfoiVarZzj3.zzi(id3, this.zza.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcU)).longValue(), this.zzf);
            }
        }
        return new zzetf(info, null, zzfofVar);
    }

    final /* synthetic */ zzetf zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzetf(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfof());
    }
}
