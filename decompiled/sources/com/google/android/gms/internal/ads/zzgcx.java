package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgcx extends zzgaw {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgcv zzd;

    /* synthetic */ zzgcx(int i, int i2, int i3, zzgcv zzgcvVar, zzgcw zzgcwVar) {
        this.zza = i;
        this.zzd = zzgcvVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgcx)) {
            return false;
        }
        zzgcx zzgcxVar = (zzgcx) obj;
        if (zzgcxVar.zza == this.zza) {
            int i = zzgcxVar.zzb;
            int i2 = zzgcxVar.zzc;
            if (zzgcxVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgcx.class, Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.zzd) + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgcv zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd != zzgcv.zzc;
    }
}
