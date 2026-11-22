package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbm extends zzgaw {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgbk zze;
    private final zzgbj zzf;

    /* synthetic */ zzgbm(int i, int i2, int i3, int i4, zzgbk zzgbkVar, zzgbj zzgbjVar, zzgbl zzgblVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzgbkVar;
        this.zzf = zzgbjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgbm)) {
            return false;
        }
        zzgbm zzgbmVar = (zzgbm) obj;
        return zzgbmVar.zza == this.zza && zzgbmVar.zzb == this.zzb && zzgbmVar.zzc == this.zzc && zzgbmVar.zzd == this.zzd && zzgbmVar.zze == this.zze && zzgbmVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgbm.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf});
    }

    public final String toString() {
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.zze) + ", hashType: " + String.valueOf(this.zzf) + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final zzgbj zze() {
        return this.zzf;
    }

    public final zzgbk zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zze != zzgbk.zzc;
    }
}
