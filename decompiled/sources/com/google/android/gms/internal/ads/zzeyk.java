package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyk implements zzeyv {
    private zzcvp zza;

    @Override // com.google.android.gms.internal.ads.zzeyv
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcvp zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzb(zzeywVar, zzeyuVar, null);
    }

    public final synchronized ListenableFuture zzb(zzeyw zzeywVar, zzeyu zzeyuVar, zzcvp zzcvpVar) {
        zzctl zzctlVarZzb;
        try {
            if (zzcvpVar != null) {
                this.zza = zzcvpVar;
            } else {
                this.zza = (zzcvp) zzeyuVar.zza(zzeywVar.zzb).zzh();
            }
            zzctlVarZzb = this.zza.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return zzctlVarZzb.zzi(zzctlVarZzb.zzj());
    }
}
