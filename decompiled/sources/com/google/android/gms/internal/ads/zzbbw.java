package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbbw {
    public static Object zza(zzfry zzfryVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzfryVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
