package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfp extends zzcx {
    private final int zza;
    private final zzfn zzb;

    /* synthetic */ zzfp(int i, zzfn zzfnVar, zzfo zzfoVar) {
        this.zza = i;
        this.zzb = zzfnVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfp)) {
            return false;
        }
        zzfp zzfpVar = (zzfp) obj;
        return zzfpVar.zza == this.zza && zzfpVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzfp.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zzb != zzfn.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzfn zzc() {
        return this.zzb;
    }
}
