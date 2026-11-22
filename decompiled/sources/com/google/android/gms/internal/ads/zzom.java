package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzom {
    public static final zzom zza = new zzok().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* synthetic */ zzom(zzok zzokVar, zzol zzolVar) {
        this.zzb = zzokVar.zza;
        this.zzc = zzokVar.zzb;
        this.zzd = zzokVar.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzom zzomVar = (zzom) obj;
            if (this.zzb == zzomVar.zzb && this.zzc == zzomVar.zzc && this.zzd == zzomVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.zzb ? 1 : 0) << 2;
        boolean z = this.zzc;
        return i + (z ? 1 : 0) + (z ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
