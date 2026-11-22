package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfrq extends zzfrt {
    final /* synthetic */ zzfrr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfrq(zzfrr zzfrrVar, zzfrv zzfrvVar, CharSequence charSequence) {
        super(zzfrvVar, charSequence);
        this.zza = zzfrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final int zzd(int i) {
        int length = this.zzb.length();
        int i2 = i + GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND;
        if (i2 < length) {
            return i2;
        }
        return -1;
    }
}
