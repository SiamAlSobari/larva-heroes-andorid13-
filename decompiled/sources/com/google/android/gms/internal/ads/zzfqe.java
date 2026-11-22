package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfqe extends zzfpy {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfqh zzb;

    zzfqe(zzfqh zzfqhVar, IBinder iBinder) {
        this.zzb = zzfqhVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.zzfpy
    public final void zza() {
        this.zzb.zza.zzn = zzfpt.zzb(this.zza);
        zzfqi.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        Iterator it = this.zzb.zza.zze.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.zzb.zza.zze.clear();
    }
}
