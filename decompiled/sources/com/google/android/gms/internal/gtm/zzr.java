package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzr implements zzxl {
    NO_CACHE(1),
    PRIVATE(2),
    PUBLIC(3);

    private static final zzxm zzd = new zzxm() { // from class: com.google.android.gms.internal.gtm.zzp
        @Override // com.google.android.gms.internal.gtm.zzxm
        public final /* synthetic */ zzxl zza(int i) {
            return zzr.zzb(i);
        }
    };
    private final int zzf;

    zzr(int i) {
        this.zzf = i;
    }

    public static zzr zzb(int i) {
        if (i == 1) {
            return NO_CACHE;
        }
        if (i == 2) {
            return PRIVATE;
        }
        if (i != 3) {
            return null;
        }
        return PUBLIC;
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
