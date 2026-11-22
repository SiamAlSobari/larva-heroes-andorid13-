package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqr extends IOException {
    public final int zza;

    public zzqr(Throwable th, int i) {
        super(th);
        this.zza = GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER;
    }
}
