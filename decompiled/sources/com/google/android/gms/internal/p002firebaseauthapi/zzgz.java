package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgz extends zzcx {
    private final String zza;
    private final zzgx zzb;
    private final zzcx zzc;

    /* synthetic */ zzgz(String str, zzgx zzgxVar, zzcx zzcxVar, zzgy zzgyVar) {
        this.zza = str;
        this.zzb = zzgxVar;
        this.zzc = zzcxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgzVar = (zzgz) obj;
        return zzgzVar.zzb.equals(this.zzb) && zzgzVar.zzc.equals(this.zzc) && zzgzVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgz.class, this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        zzcx zzcxVar = this.zzc;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zza + ", dekParsingStrategy: " + String.valueOf(this.zzb) + ", dekParametersForNewKeys: " + String.valueOf(zzcxVar) + ")";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return false;
    }

    public final zzcx zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza;
    }
}
