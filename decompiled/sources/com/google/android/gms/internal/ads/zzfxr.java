package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfxr extends zzfxd {

    @CheckForNull
    private zzfxq zza;

    zzfxr(zzfty zzftyVar, boolean z, Executor executor, Callable callable) {
        super(zzftyVar, z, false);
        this.zza = new zzfxp(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzfxd
    final void zzf(int i, @CheckForNull Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    protected final void zzq() {
        zzfxq zzfxqVar = this.zza;
        if (zzfxqVar != null) {
            zzfxqVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxd
    final void zzu() {
        zzfxq zzfxqVar = this.zza;
        if (zzfxqVar != null) {
            zzfxqVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxd
    final void zzy(int i) {
        super.zzy(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
