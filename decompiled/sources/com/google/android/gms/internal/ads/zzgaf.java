package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgaf {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzgae zza(String str) throws GeneralSecurityException {
        for (zzgae zzgaeVar : zza) {
            if (zzgaeVar.zza()) {
                return zzgaeVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
