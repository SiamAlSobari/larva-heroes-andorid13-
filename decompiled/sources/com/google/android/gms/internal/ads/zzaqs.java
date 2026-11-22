package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaqs {
    protected volatile Boolean zzb;
    private final zzary zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzfne zza = null;
    private static volatile Random zzd = null;

    public zzaqs(zzary zzaryVar) {
        this.zze = zzaryVar;
        zzaryVar.zzk().execute(new zzaqr(this));
    }

    public static final int zzd() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : zze().nextInt();
        } catch (RuntimeException unused) {
            return zze().nextInt();
        }
    }

    private static Random zze() {
        if (zzd == null) {
            synchronized (zzaqs.class) {
                if (zzd == null) {
                    zzd = new Random();
                }
            }
        }
        return zzd;
    }

    public final void zzc(int i, int i2, long j, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzanh zzanhVarZza = zzanl.zza();
            zzanhVarZza.zza(this.zze.zza.getPackageName());
            zzanhVarZza.zze(j);
            if (str != null) {
                zzanhVarZza.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzanhVarZza.zzf(stringWriter.toString());
                zzanhVarZza.zzd(exc.getClass().getName());
            }
            zzfnd zzfndVarZza = zza.zza(((zzanl) zzanhVarZza.zzal()).zzax());
            zzfndVarZza.zza(i);
            if (i2 != -1) {
                zzfndVarZza.zzb(i2);
            }
            zzfndVarZza.zzc();
        } catch (Exception unused) {
        }
    }
}
