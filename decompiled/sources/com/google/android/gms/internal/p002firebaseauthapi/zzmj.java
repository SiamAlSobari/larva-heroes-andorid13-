package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzmj {
    private static final Object zza = new Object();
    private static final String zzb = "zzmj";
    private final zzca zzc;
    private final zzbd zzd;
    private final zzbz zze;

    /* synthetic */ zzmj(zzmh zzmhVar, zzmi zzmiVar) {
        this.zzc = new zzmm(zzmhVar.zza, zzmhVar.zzb, zzmhVar.zzc);
        this.zzd = zzmhVar.zze;
        this.zze = zzmhVar.zzh;
    }

    static /* bridge */ /* synthetic */ boolean zzd() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public final synchronized zzby zza() throws GeneralSecurityException {
        return this.zze.zzb();
    }
}
