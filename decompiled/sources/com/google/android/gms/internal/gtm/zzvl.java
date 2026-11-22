package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzvl implements zzxl {
    STRING_FIELD_VALIDATION_UNKNOWN(0),
    MANDATORY(1),
    HINT(2),
    NONE(3);

    private static final zzxm zze = new zzxm() { // from class: com.google.android.gms.internal.gtm.zzvj
        @Override // com.google.android.gms.internal.gtm.zzxm
        public final /* synthetic */ zzxl zza(int i) {
            return zzvl.zzb(i);
        }
    };
    private final int zzg;

    zzvl(int i) {
        this.zzg = i;
    }

    public static zzvl zzb(int i) {
        if (i == 0) {
            return STRING_FIELD_VALIDATION_UNKNOWN;
        }
        if (i == 1) {
            return MANDATORY;
        }
        if (i == 2) {
            return HINT;
        }
        if (i != 3) {
            return null;
        }
        return NONE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.gms.internal.gtm.zzxl
    public final int zza() {
        return this.zzg;
    }
}
