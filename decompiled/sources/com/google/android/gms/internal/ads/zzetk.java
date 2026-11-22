package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzetk implements zzesj {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzbza zzd;

    public zzetk(zzbza zzbzaVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zzd = zzbzaVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        return zzfye.zzf(zzfye.zzm(zzfye.zzh(this.zzb), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzeti
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return new zzetl((String) obj);
            }
        }, this.zza), Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzetj
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        return zzfye.zzh(new zzetl(this.zzb));
    }
}
