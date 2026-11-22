package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpd extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzam zzc;

    public zzpd(int i, zzam zzamVar, boolean z) {
        super("AudioTrack write failed: " + i);
        this.zzb = z;
        this.zza = i;
        this.zzc = zzamVar;
    }
}
