package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaby {
    public final zzacb zza;
    public final zzacb zzb;

    public zzaby(zzacb zzacbVar, zzacb zzacbVar2) {
        this.zza = zzacbVar;
        this.zzb = zzacbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaby zzabyVar = (zzaby) obj;
            if (this.zza.equals(zzabyVar.zza) && this.zzb.equals(zzabyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "[" + this.zza.toString() + (this.zza.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString())) + "]";
    }
}
