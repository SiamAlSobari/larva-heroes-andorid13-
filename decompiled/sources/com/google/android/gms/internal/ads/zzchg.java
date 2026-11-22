package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzchg {
    private final zzcag zza;
    private final Context zzb;
    private final WeakReference zzc;

    /* synthetic */ zzchg(zzche zzcheVar, zzchf zzchfVar) {
        this.zza = zzcheVar.zza;
        this.zzb = zzcheVar.zzb;
        this.zzc = zzcheVar.zzc;
    }

    final Context zza() {
        return this.zzb;
    }

    public final zzaqx zzb() {
        return new zzaqx(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }

    final zzbed zzc() {
        return new zzbed(this.zzb);
    }

    final zzcag zzd() {
        return this.zza;
    }

    final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    final WeakReference zzf() {
        return this.zzc;
    }
}
