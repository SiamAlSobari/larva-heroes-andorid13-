package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvo implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzdvo(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfge zzfgeVar = (zzfge) this.zza.zzb();
        final CookieManager cookieManagerZzb = com.google.android.gms.ads.internal.zzt.zzq().zzb((Context) this.zzb.zzb());
        zzffv zzffvVarZzi = zzffo.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerZzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaL));
            }
        }, zzffy.WEBVIEW_COOKIE, zzfgeVar).zzi(1L, TimeUnit.SECONDS);
        final zzdvm zzdvmVar = new zzffh() { // from class: com.google.android.gms.internal.ads.zzdvm
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                return "";
            }
        };
        return zzffvVarZzi.zzc(Exception.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzffr
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzfye.zzh("");
            }
        }).zza();
    }
}
