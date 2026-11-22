package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zznj extends zzce {
    private final zzop zza;

    public zznj(zzop zzopVar) {
        this.zza = zzopVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznj)) {
            return false;
        }
        zzop zzopVar = ((zznj) obj).zza;
        return this.zza.zzc().zze().equals(zzopVar.zzc().zze()) && this.zza.zzc().zzg().equals(zzopVar.zzc().zzg()) && this.zza.zzc().zzf().equals(zzopVar.zzc().zzf());
    }

    public final int hashCode() {
        zzop zzopVar = this.zza;
        return Arrays.hashCode(new Object[]{zzopVar.zzc(), zzopVar.zzd()});
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zzc().zzg();
        zzxo zzxoVarZze = this.zza.zzc().zze();
        zzxo zzxoVar = zzxo.UNKNOWN_PREFIX;
        int iOrdinal = zzxoVarZze.ordinal();
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        throw null;
    }

    public final zzop zzb() {
        return this.zza;
    }
}
