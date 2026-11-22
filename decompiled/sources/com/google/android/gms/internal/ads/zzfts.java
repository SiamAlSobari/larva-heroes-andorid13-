package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfts {
    private static final zzfts zza = new zzftp();
    private static final zzfts zzb = new zzftq(-1);
    private static final zzfts zzc = new zzftq(1);

    /* synthetic */ zzfts(zzftr zzftrVar) {
    }

    public static zzfts zzj() {
        return zza;
    }

    public abstract int zza();

    public abstract zzfts zzb(int i, int i2);

    public abstract zzfts zzc(Object obj, Object obj2, Comparator comparator);

    public abstract zzfts zzd(boolean z, boolean z2);

    public abstract zzfts zze(boolean z, boolean z2);
}
