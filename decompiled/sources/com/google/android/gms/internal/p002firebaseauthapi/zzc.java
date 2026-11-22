package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzc extends Handler {
    private final Looper zza;

    public zzc() {
        this.zza = Looper.getMainLooper();
    }

    public zzc(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
