package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcvs {
    private final Context zza;
    private final zzfca zzb;
    private final Bundle zzc;
    private final zzfbs zzd;
    private final zzcvk zze;
    private final zzeds zzf;

    /* synthetic */ zzcvs(zzcvq zzcvqVar, zzcvr zzcvrVar) {
        this.zza = zzcvqVar.zza;
        this.zzb = zzcvqVar.zzb;
        this.zzc = zzcvqVar.zzc;
        this.zzd = zzcvqVar.zzd;
        this.zze = zzcvqVar.zze;
        this.zzf = zzcvqVar.zzf;
    }

    final Context zza(Context context) {
        return this.zza;
    }

    final Bundle zzb() {
        return this.zzc;
    }

    final zzcvk zzc() {
        return this.zze;
    }

    final zzcvq zzd() {
        zzcvq zzcvqVar = new zzcvq();
        zzcvqVar.zze(this.zza);
        zzcvqVar.zzi(this.zzb);
        zzcvqVar.zzf(this.zzc);
        zzcvqVar.zzg(this.zze);
        zzcvqVar.zzd(this.zzf);
        return zzcvqVar;
    }

    final zzeds zze(String str) {
        zzeds zzedsVar = this.zzf;
        return zzedsVar != null ? zzedsVar : new zzeds(str);
    }

    final zzfbs zzf() {
        return this.zzd;
    }

    final zzfca zzg() {
        return this.zzb;
    }
}
