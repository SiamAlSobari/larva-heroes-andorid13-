package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzalg {
    private final Executor zza;

    public zzalg(Handler handler) {
        this.zza = new zzale(this, handler);
    }

    public final void zza(zzalp zzalpVar, zzaly zzalyVar) {
        zzalpVar.zzm("post-error");
        zzalv zzalvVarZza = zzalv.zza(zzalyVar);
        Executor executor = this.zza;
        ((zzale) executor).zza.post(new zzalf(zzalpVar, zzalvVarZza, null));
    }

    public final void zzb(zzalp zzalpVar, zzalv zzalvVar, Runnable runnable) {
        zzalpVar.zzq();
        zzalpVar.zzm("post-response");
        Executor executor = this.zza;
        ((zzale) executor).zza.post(new zzalf(zzalpVar, zzalvVar, runnable));
    }
}
