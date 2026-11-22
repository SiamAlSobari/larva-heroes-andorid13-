package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcrk extends zzcqc {
    private final zzbgn zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcrk(zzcsd zzcsdVar, zzbgn zzbgnVar, Runnable runnable, Executor executor) {
        super(zzcsdVar);
        this.zzc = zzbgnVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final View zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final zzfbf zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final zzfbf zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcse
    public final void zzj() {
        final zzcri zzcriVar = new zzcri(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk(zzcriVar);
            }
        });
    }

    final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (this.zzc.zzb(ObjectWrapper.wrap(runnable))) {
                return;
            }
            zzi(((zzcri) runnable).zza);
        } catch (RemoteException unused) {
            zzi(((zzcri) runnable).zza);
        }
    }
}
