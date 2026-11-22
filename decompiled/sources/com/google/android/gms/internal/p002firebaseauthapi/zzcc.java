package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcc {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzcb zza(String str) throws GeneralSecurityException {
        for (zzcb zzcbVar : zza) {
            if (zzcbVar.zzb(str)) {
                return zzcbVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
