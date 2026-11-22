package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzuw implements zzxl {
    ENUM_TYPE_UNKNOWN(0),
    OPEN(1),
    CLOSED(2);

    private static final zzxm zzd = new zzxm() { // from class: com.google.android.gms.internal.gtm.zzuu
        @Override // com.google.android.gms.internal.gtm.zzxm
        public final /* synthetic */ zzxl zza(int i) {
            return zzuw.zzb(i);
        }
    };
    private final int zzf;

    zzuw(int i) {
        this.zzf = i;
    }

    public static zzuw zzb(int i) {
        if (i == 0) {
            return ENUM_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i != 2) {
            return null;
        }
        return CLOSED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.gtm.zzxl
    public final int zza() {
        return this.zzf;
    }
}
