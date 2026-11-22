package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzatl {
    protected static final String zza = "zzatl";
    private final zzary zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzatl(zzary zzaryVar, String str, String str2, Class... clsArr) {
        this.zzb = zzaryVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzaryVar.zzk().submit(new zzatk(this));
    }

    static /* bridge */ /* synthetic */ void zzb(zzatl zzatlVar) {
        CountDownLatch countDownLatch;
        try {
            try {
                zzary zzaryVar = zzatlVar.zzb;
                Class clsLoadClass = zzaryVar.zzi().loadClass(zzatlVar.zzc(zzaryVar.zzu(), zzatlVar.zzc));
                if (clsLoadClass == null) {
                    countDownLatch = zzatlVar.zzg;
                } else {
                    zzatlVar.zze = clsLoadClass.getMethod(zzatlVar.zzc(zzatlVar.zzb.zzu(), zzatlVar.zzd), zzatlVar.zzf);
                    countDownLatch = zzatlVar.zze == null ? zzatlVar.zzg : zzatlVar.zzg;
                }
            } catch (zzarc | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
            }
        } catch (NullPointerException unused2) {
            countDownLatch = zzatlVar.zzg;
        } catch (Throwable th) {
            zzatlVar.zzg.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzarc, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
