package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeyr {
    private final zzfdn zza;
    private final zzcvp zzb;
    private final Executor zzc;
    private zzeyq zzd;

    public zzeyr(zzfdn zzfdnVar, zzcvp zzcvpVar, Executor executor) {
        this.zza = zzfdnVar;
        this.zzb = zzcvpVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfdx zze() {
        zzfca zzfcaVarZzg = this.zzb.zzg();
        return this.zza.zzc(zzfcaVarZzg.zzd, zzfcaVarZzg.zzf, zzfcaVarZzg.zzj);
    }

    public final ListenableFuture zzc() {
        ListenableFuture listenableFutureZze;
        zzeyq zzeyqVar = this.zzd;
        if (zzeyqVar != null) {
            return zzfye.zzh(zzeyqVar);
        }
        if (((Boolean) zzbdq.zza.zze()).booleanValue()) {
            listenableFutureZze = zzfye.zze(zzfye.zzm(zzfxv.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzeyo(this), this.zzc), zzdxh.class, new zzeyn(this), this.zzc);
        } else {
            zzeyq zzeyqVar2 = new zzeyq(null, zze(), null);
            this.zzd = zzeyqVar2;
            listenableFutureZze = zzfye.zzh(zzeyqVar2);
        }
        return zzfye.zzm(listenableFutureZze, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzeym
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return (zzeyq) obj;
            }
        }, this.zzc);
    }
}
