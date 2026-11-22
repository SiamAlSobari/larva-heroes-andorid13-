package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzggz {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzggz(Class cls, Class cls2, zzggy zzggyVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggz)) {
            return false;
        }
        zzggz zzggzVar = (zzggz) obj;
        return zzggzVar.zza.equals(this.zza) && zzggzVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return this.zza.getSimpleName() + " with primitive type: " + this.zzb.getSimpleName();
    }
}
