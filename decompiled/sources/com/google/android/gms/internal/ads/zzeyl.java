package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyl implements zzeyv {
    private final zzeyv zza;
    private zzcvp zzb;

    public zzeyl(zzeyv zzeyvVar) {
        this.zza = zzeyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcvp zzd() {
        return this.zzb;
    }

    public final synchronized ListenableFuture zzb(zzeyw zzeywVar, zzeyu zzeyuVar, zzcvp zzcvpVar) {
        this.zzb = zzcvpVar;
        if (zzeywVar.zza == null) {
            return ((zzeyk) this.zza).zzb(zzeywVar, zzeyuVar, zzcvpVar);
        }
        zzctl zzctlVarZzb = this.zzb.zzb();
        return zzctlVarZzb.zzi(zzctlVarZzb.zzk(zzfye.zzh(zzeywVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzb(zzeywVar, zzeyuVar, null);
    }
}
