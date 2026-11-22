package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzeyn implements zzfqw {
    final /* synthetic */ zzeyr zza;

    zzeyn(zzeyr zzeyrVar) {
        this.zza = zzeyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzcaa.zzh("", (zzdxh) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzeyr zzeyrVar = this.zza;
        zzeyrVar.zzd = new zzeyq(null, zzeyrVar.zze(), null);
        return this.zza.zzd;
    }
}
