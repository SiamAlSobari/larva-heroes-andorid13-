package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgdo extends zzgaw {
    private final int zza;
    private final zzgdm zzb;

    /* synthetic */ zzgdo(int i, zzgdm zzgdmVar, zzgdn zzgdnVar) {
        this.zza = i;
        this.zzb = zzgdmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgdo)) {
            return false;
        }
        zzgdo zzgdoVar = (zzgdo) obj;
        return zzgdoVar.zza == this.zza && zzgdoVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgdo.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgdm zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzb != zzgdm.zzc;
    }
}
