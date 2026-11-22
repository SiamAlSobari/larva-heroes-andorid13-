package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzwi implements zzxl {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);

    private static final zzxm zzd = new zzxm() { // from class: com.google.android.gms.internal.gtm.zzwg
        @Override // com.google.android.gms.internal.gtm.zzxm
        public final /* synthetic */ zzxl zza(int i) {
            return zzwi.zzb(i);
        }
    };
    private final int zzf;

    zzwi(int i) {
        this.zzf = i;
    }

    public static zzwi zzb(int i) {
        if (i == 1) {
            return SPEED;
        }
        if (i == 2) {
            return CODE_SIZE;
        }
        if (i != 3) {
            return null;
        }
        return LITE_RUNTIME;
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
