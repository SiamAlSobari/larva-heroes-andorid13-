package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgjk implements zzgik {
    private final zzghu zza;

    public zzgjk(zzghu zzghuVar) throws GeneralSecurityException {
        if (!zzgfj.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.zza = zzghuVar;
    }
}
