package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcj {
    private final zzaf zza = new zzaf();

    public final zzcj zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzcj zzb(zzcl zzclVar) {
        zzaf zzafVar = this.zza;
        zzah zzahVar = zzclVar.zzd;
        for (int i = 0; i < zzahVar.zzb(); i++) {
            zzafVar.zza(zzahVar.zza(i));
        }
        return this;
    }

    public final zzcj zzc(int... iArr) {
        zzaf zzafVar = this.zza;
        for (int i = 0; i < 19; i++) {
            zzafVar.zza(iArr[i]);
        }
        return this;
    }

    public final zzcj zzd(int i, boolean z) {
        zzaf zzafVar = this.zza;
        if (z) {
            zzafVar.zza(i);
        }
        return this;
    }

    public final zzcl zze() {
        return new zzcl(this.zza.zzb(), null);
    }
}
