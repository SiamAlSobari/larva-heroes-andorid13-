package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgc extends Handler {
    private final Looper zza;

    public zzgc() {
        this.zza = Looper.getMainLooper();
    }

    public zzgc(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public zzgc(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}
