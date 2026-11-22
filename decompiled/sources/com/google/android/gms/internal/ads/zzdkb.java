package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdkb implements zzcxc {
    private final zzdic zza;
    private final zzdih zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdkb(zzdic zzdicVar, zzdih zzdihVar, Executor executor, Executor executor2) {
        this.zza = zzdicVar;
        this.zzb = zzdihVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzcfi zzcfiVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // java.lang.Runnable
            public final void run() {
                zzcfiVar.zzd("onSdkImpression", new ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if (this.zzb.zzd()) {
            zzdic zzdicVar = this.zza;
            zzfip zzfipVarZzu = zzdicVar.zzu();
            if (zzfipVarZzu == null && zzdicVar.zzw() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeX)).booleanValue()) {
                zzdic zzdicVar2 = this.zza;
                ListenableFuture listenableFutureZzw = zzdicVar2.zzw();
                zzcas zzcasVarZzp = zzdicVar2.zzp();
                if (listenableFutureZzw == null || zzcasVarZzp == null) {
                    return;
                }
                zzfye.zzr(zzfye.zzl(listenableFutureZzw, zzcasVarZzp), new zzdka(this), this.zzd);
                return;
            }
            if (zzfipVarZzu == null) {
                return;
            }
            zzdic zzdicVar3 = this.zza;
            zzcfi zzcfiVarZzr = zzdicVar3.zzr();
            zzcfi zzcfiVarZzs = zzdicVar3.zzs();
            if (zzcfiVarZzr == null) {
                zzcfiVarZzr = zzcfiVarZzs != null ? zzcfiVarZzs : null;
            }
            if (zzcfiVarZzr != null) {
                zzb(zzcfiVarZzr);
            }
        }
    }
}
