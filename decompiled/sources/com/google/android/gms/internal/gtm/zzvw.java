package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzvw implements zzxl {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);

    private static final zzxm zzd = new zzxm() { // from class: com.google.android.gms.internal.gtm.zzvu
        @Override // com.google.android.gms.internal.gtm.zzxm
        public final /* synthetic */ zzxl zza(int i) {
            return zzvw.zzb(i);
        }
    };
    private final int zzf;

    zzvw(int i) {
        this.zzf = i;
    }

    public static zzvw zzb(int i) {
        if (i == 0) {
            return JS_NORMAL;
        }
        if (i == 1) {
            return JS_STRING;
        }
        if (i != 2) {
            return null;
        }
        return JS_NUMBER;
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
