package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzftp extends zzfts {
    zzftp() {
        super(null);
    }

    static final zzfts zzf(int i) {
        if (i < 0) {
            return zzfts.zzb;
        }
        return i > 0 ? zzfts.zzc : zzfts.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final zzfts zzb(int i, int i2) {
        int i3;
        if (i < i2) {
            i3 = -1;
        } else {
            i3 = i > i2 ? 1 : 0;
        }
        return zzf(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final zzfts zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final zzfts zzd(boolean z, boolean z2) {
        return zzf(zzfwk.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final zzfts zze(boolean z, boolean z2) {
        return zzf(zzfwk.zza(false, false));
    }
}
