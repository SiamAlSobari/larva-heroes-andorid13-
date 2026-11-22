package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfyb implements Runnable {
    final Future zza;
    final zzfya zzb;

    zzfyb(Future future, zzfya zzfyaVar) {
        this.zza = future;
        this.zzb = zzfyaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Object obj = this.zza;
        if ((obj instanceof zzfzg) && (thZza = zzfzh.zza((zzfzg) obj)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzfye.zzp(this.zza));
        } catch (Error e) {
            e = e;
            this.zzb.zza(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.zzb.zza(e);
        } catch (ExecutionException e3) {
            this.zzb.zza(e3.getCause());
        }
    }

    public final String toString() {
        zzfrb zzfrbVarZza = zzfrc.zza(this);
        zzfrbVarZza.zza(this.zzb);
        return zzfrbVarZza.toString();
    }
}
