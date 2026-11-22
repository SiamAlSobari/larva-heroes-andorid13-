package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaba implements zzace {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzace
    public final /* synthetic */ int zze(zzt zztVar, int i, boolean z) {
        return zzacc.zza(this, zztVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzf(zzt zztVar, int i, boolean z, int i2) throws IOException {
        int iZza = zztVar.zza(this.zza, 0, Math.min(4096, i));
        if (iZza != -1) {
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzk(zzam zzamVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final /* synthetic */ void zzq(zzfb zzfbVar, int i) {
        zzacc.zzb(this, zzfbVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzr(zzfb zzfbVar, int i, int i2) {
        zzfbVar.zzH(i);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzs(long j, int i, int i2, int i3, zzacd zzacdVar) {
    }
}
