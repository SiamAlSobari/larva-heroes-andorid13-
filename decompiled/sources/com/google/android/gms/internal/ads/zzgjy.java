package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgjy {
    private final zzfzu zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    /* synthetic */ zzgjy(zzfzu zzfzuVar, int i, String str, String str2, zzgjx zzgjxVar) {
        this.zza = zzfzuVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjy)) {
            return false;
        }
        zzgjy zzgjyVar = (zzgjy) obj;
        return this.zza == zzgjyVar.zza && this.zzb == zzgjyVar.zzb && this.zzc.equals(zzgjyVar.zzc) && this.zzd.equals(zzgjyVar.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
