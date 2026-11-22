package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzvz implements zzxl {
    RETENTION_UNKNOWN(0),
    RETENTION_RUNTIME(1),
    RETENTION_SOURCE(2);

    private static final zzxm zzd = new zzxm() { // from class: com.google.android.gms.internal.gtm.zzvx
        @Override // com.google.android.gms.internal.gtm.zzxm
        public final /* synthetic */ zzxl zza(int i) {
            return zzvz.zzb(i);
        }
    };
    private final int zzf;

    zzvz(int i) {
        this.zzf = i;
    }

    public static zzvz zzb(int i) {
        if (i == 0) {
            return RETENTION_UNKNOWN;
        }
        if (i == 1) {
            return RETENTION_RUNTIME;
        }
        if (i != 2) {
            return null;
        }
        return RETENTION_SOURCE;
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
