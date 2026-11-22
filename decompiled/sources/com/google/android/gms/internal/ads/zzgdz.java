package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgdz extends zzgaw {
    private final zzgdy zza;

    private zzgdz(zzgdy zzgdyVar) {
        this.zza = zzgdyVar;
    }

    public static zzgdz zzb(zzgdy zzgdyVar) {
        return new zzgdz(zzgdyVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgdz) && ((zzgdz) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgdz.class, this.zza});
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.zza.toString() + ")";
    }

    public final zzgdy zza() {
        return this.zza;
    }
}
