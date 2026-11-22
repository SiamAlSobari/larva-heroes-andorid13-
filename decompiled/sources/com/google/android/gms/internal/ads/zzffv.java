package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffv {
    final /* synthetic */ zzffw zza;
    private final Object zzb;
    private final String zzc;
    private final ListenableFuture zzd;
    private final List zze;
    private final ListenableFuture zzf;

    private zzffv(zzffw zzffwVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        this.zza = zzffwVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }

    public final zzffj zza() {
        Object obj = this.zzb;
        String strZzf = this.zzc;
        if (strZzf == null) {
            strZzf = this.zza.zzf(obj);
        }
        final zzffj zzffjVar = new zzffj(obj, strZzf, this.zzf);
        this.zza.zzd.zza(zzffjVar);
        this.zzd.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffp
            @Override // java.lang.Runnable
            public final void run() {
                zzffv zzffvVar = this.zza;
                zzffvVar.zza.zzd.zzc(zzffjVar);
            }
        }, zzcan.zzf);
        zzfye.zzr(zzffjVar, new zzfft(this, zzffjVar), zzcan.zzf);
        return zzffjVar;
    }

    public final zzffv zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzffv zzc(Class cls, zzfxl zzfxlVar) {
        zzffw zzffwVar = this.zza;
        return new zzffv(zzffwVar, this.zzb, this.zzc, this.zzd, this.zze, zzfye.zzf(this.zzf, cls, zzfxlVar, zzffwVar.zzb));
    }

    public final zzffv zzd(final ListenableFuture listenableFuture) {
        return zzg(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzffq
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return listenableFuture;
            }
        }, zzcan.zzf);
    }

    public final zzffv zze(final zzffh zzffhVar) {
        return zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzffs
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzfye.zzh(zzffhVar.zza(obj));
            }
        });
    }

    public final zzffv zzf(zzfxl zzfxlVar) {
        return zzg(zzfxlVar, this.zza.zzb);
    }

    public final zzffv zzg(zzfxl zzfxlVar, Executor executor) {
        return new zzffv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfye.zzn(this.zzf, zzfxlVar, executor));
    }

    public final zzffv zzh(String str) {
        return new zzffv(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzffv zzi(long j, TimeUnit timeUnit) {
        zzffw zzffwVar = this.zza;
        return new zzffv(zzffwVar, this.zzb, this.zzc, this.zzd, this.zze, zzfye.zzo(this.zzf, j, timeUnit, zzffwVar.zzc));
    }
}
