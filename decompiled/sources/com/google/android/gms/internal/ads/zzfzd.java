package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfzd extends zzfxu implements RunnableFuture {

    @CheckForNull
    private volatile zzfyn zza;

    zzfzd(zzfxk zzfxkVar) {
        this.zza = new zzfzb(this, zzfxkVar);
    }

    static zzfzd zze(Runnable runnable, Object obj) {
        return new zzfzd(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzfyn zzfynVar = this.zza;
        if (zzfynVar != null) {
            zzfynVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    @CheckForNull
    protected final String zza() {
        zzfyn zzfynVar = this.zza;
        if (zzfynVar == null) {
            return super.zza();
        }
        return "task=[" + zzfynVar.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    protected final void zzb() {
        zzfyn zzfynVar;
        if (zzt() && (zzfynVar = this.zza) != null) {
            zzfynVar.zzh();
        }
        this.zza = null;
    }

    zzfzd(Callable callable) {
        this.zza = new zzfzc(this, callable);
    }
}
