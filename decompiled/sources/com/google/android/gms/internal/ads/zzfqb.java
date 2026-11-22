package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfqb extends zzfpy {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzfpy zzb;
    final /* synthetic */ zzfqi zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfqb(zzfqi zzfqiVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfpy zzfpyVar) {
        super(taskCompletionSource);
        this.zzc = zzfqiVar;
        this.zza = taskCompletionSource2;
        this.zzb = zzfpyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpy
    public final void zza() {
        synchronized (this.zzc.zzg) {
            zzfqi.zzn(this.zzc, this.zza);
            if (this.zzc.zzl.getAndIncrement() > 0) {
                this.zzc.zzc.zzc("Already connected to the service.", new Object[0]);
            }
            zzfqi.zzp(this.zzc, this.zzb);
        }
    }
}
