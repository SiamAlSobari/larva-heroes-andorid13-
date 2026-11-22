package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzow {
    private final Class zza;
    private final zzzo zzb;

    /* synthetic */ zzow(Class cls, zzzo zzzoVar, zzov zzovVar) {
        this.zza = cls;
        this.zzb = zzzoVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzow)) {
            return false;
        }
        zzow zzowVar = (zzow) obj;
        return zzowVar.zza.equals(this.zza) && zzowVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        zzzo zzzoVar = this.zzb;
        return this.zza.getSimpleName() + ", object identifier: " + String.valueOf(zzzoVar);
    }
}
