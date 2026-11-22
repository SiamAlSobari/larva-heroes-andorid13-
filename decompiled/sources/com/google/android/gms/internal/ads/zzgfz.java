package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgfz extends zzgah {
    private final zzghd zza;

    public zzgfz(zzghd zzghdVar) {
        this.zza = zzghdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfz)) {
            return false;
        }
        zzghd zzghdVar = ((zzgfz) obj).zza;
        return this.zza.zzc().zzf().equals(zzghdVar.zzc().zzf()) && this.zza.zzc().zzh().equals(zzghdVar.zzc().zzh()) && this.zza.zzc().zzg().equals(zzghdVar.zzc().zzg());
    }

    public final int hashCode() {
        zzghd zzghdVar = this.zza;
        return Arrays.hashCode(new Object[]{zzghdVar.zzc(), zzghdVar.zzd()});
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zzc().zzh();
        zzgnw zzgnwVarZzf = this.zza.zzc().zzf();
        zzgnw zzgnwVar = zzgnw.UNKNOWN_PREFIX;
        int iOrdinal = zzgnwVarZzf.ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    public final zzghd zza() {
        return this.zza;
    }
}
