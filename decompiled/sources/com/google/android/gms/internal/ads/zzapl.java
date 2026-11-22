package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzapl implements Runnable {
    private zzapl() {
    }

    /* synthetic */ zzapl(zzapk zzapkVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzapm.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzapm.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzapm.zzb;
        } catch (Throwable th) {
            zzapm.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
