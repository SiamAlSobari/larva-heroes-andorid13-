package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvs {
    public final int zzc;
    private final zzfud zze;
    private int zzf;
    public static final zzvs zza = new zzvs(new zzcy[0]);
    private static final String zzd = Integer.toString(0, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzvr
    };

    /* JADX WARN: Multi-variable type inference failed */
    public zzvs(zzcy... zzcyVarArr) {
        this.zze = zzfud.zzk(zzcyVarArr);
        this.zzc = zzcyVarArr.length;
        int i = 0;
        while (i < this.zze.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zze.size(); i3++) {
                if (((zzcy) this.zze.get(i)).equals(this.zze.get(i3))) {
                    zzes.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzvs zzvsVar = (zzvs) obj;
            if (this.zzc == zzvsVar.zzc && this.zze.equals(zzvsVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zze.hashCode();
        this.zzf = iHashCode;
        return iHashCode;
    }

    public final int zza(zzcy zzcyVar) {
        int iIndexOf = this.zze.indexOf(zzcyVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzcy zzb(int i) {
        return (zzcy) this.zze.get(i);
    }
}
