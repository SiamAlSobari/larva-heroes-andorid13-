package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyh implements zzeyv {
    private final zzfdn zza;
    private final Executor zzb;
    private final zzfya zzc = new zzeyf(this);

    public zzeyh(zzfdn zzfdnVar, Executor executor) {
        this.zza = zzfdnVar;
        this.zzb = executor;
    }

    final /* synthetic */ ListenableFuture zza(zzcvp zzcvpVar, zzeyq zzeyqVar) throws Exception {
        zzfdx zzfdxVar = zzeyqVar.zzb;
        zzbun zzbunVar = zzeyqVar.zza;
        zzfdw zzfdwVarZzb = this.zza.zzb(zzfdxVar);
        if (zzfdwVarZzb != null && zzbunVar != null) {
            zzfye.zzr(zzcvpVar.zzb().zzh(zzbunVar), this.zzc, this.zzb);
        }
        return zzfye.zzh(new zzeyg(zzfdxVar, zzbunVar, zzfdwVarZzb));
    }

    public final ListenableFuture zzb(zzeyw zzeywVar, zzeyu zzeyuVar, final zzcvp zzcvpVar) {
        return zzfye.zze(zzfye.zzn(zzfxv.zzu(new zzeyr(this.zza, zzcvpVar, this.zzb).zzc()), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzeyd
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zza(zzcvpVar, (zzeyq) obj);
            }
        }, this.zzb), Exception.class, new zzeye(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzb(zzeywVar, zzeyuVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
