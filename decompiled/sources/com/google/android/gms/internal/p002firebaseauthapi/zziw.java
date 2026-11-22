package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zziw extends zzje {
    private final int zza;
    private final zziu zzb;

    /* synthetic */ zziw(int i, zziu zziuVar, zziv zzivVar) {
        this.zza = i;
        this.zzb = zziuVar;
    }

    public static zzit zzc() {
        return new zzit(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziw)) {
            return false;
        }
        zziw zziwVar = (zziw) obj;
        return zziwVar.zza == this.zza && zziwVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zziw.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zzb != zziu.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zziu zzd() {
        return this.zzb;
    }
}
