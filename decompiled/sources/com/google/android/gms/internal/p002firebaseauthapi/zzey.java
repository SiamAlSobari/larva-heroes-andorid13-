package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzey extends zzcx {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzew zzd;

    /* synthetic */ zzey(int i, int i2, int i3, zzew zzewVar, zzex zzexVar) {
        this.zza = i;
        this.zzd = zzewVar;
    }

    public static zzev zzc() {
        return new zzev(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzey)) {
            return false;
        }
        zzey zzeyVar = (zzey) obj;
        if (zzeyVar.zza == this.zza) {
            int i = zzeyVar.zzb;
            int i2 = zzeyVar.zzc;
            if (zzeyVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzey.class, Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.zzd) + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zzd != zzew.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzew zzd() {
        return this.zzd;
    }
}
