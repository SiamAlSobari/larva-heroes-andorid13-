package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsh {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzsh(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzsh.class) {
            zzsh zzshVar = (zzsh) obj;
            if (TextUtils.equals(this.zza, zzshVar.zza) && this.zzb == zzshVar.zzb && this.zzc == zzshVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 31;
        return (((iHashCode * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true == this.zzc ? 1231 : 1237);
    }
}
