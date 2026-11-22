package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdhz {
    private zzbet zza;

    public zzdhz(zzdhl zzdhlVar) {
        this.zza = zzdhlVar;
    }

    public final synchronized zzbet zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbet zzbetVar) {
        this.zza = zzbetVar;
    }
}
