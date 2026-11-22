package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzw {
    public static zzfzv zza(String str) throws GeneralSecurityException {
        zzfzv zzfzvVar = (zzfzv) zzgar.zzd().get("AES128_GCM");
        if (zzfzvVar != null) {
            return zzfzvVar;
        }
        throw new GeneralSecurityException("cannot find key template: AES128_GCM");
    }
}
