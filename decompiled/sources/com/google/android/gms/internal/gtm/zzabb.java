package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzabb implements zzxl {
    DF_NONE(0),
    DF_HTTPHEADER(1),
    DF_COOKIE(2),
    DF_URL(3),
    DF_CGI_ARGS(4),
    DF_HOST_ORDER(5),
    DF_BYTE_SWAPPED(6),
    DF_LOGGING_ELEMENT_TYPE_ID(7);

    private static final zzxm zzi = new zzxm() { // from class: com.google.android.gms.internal.gtm.zzaba
        @Override // com.google.android.gms.internal.gtm.zzxm
        public final /* synthetic */ zzxl zza(int i) {
            zzabb zzabbVar = zzabb.DF_NONE;
            switch (i) {
                case 0:
                    return zzabb.DF_NONE;
                case 1:
                    return zzabb.DF_HTTPHEADER;
                case 2:
                    return zzabb.DF_COOKIE;
                case 3:
                    return zzabb.DF_URL;
                case 4:
                    return zzabb.DF_CGI_ARGS;
                case 5:
                    return zzabb.DF_HOST_ORDER;
                case 6:
                    return zzabb.DF_BYTE_SWAPPED;
                case 7:
                    return zzabb.DF_LOGGING_ELEMENT_TYPE_ID;
                default:
                    return null;
            }
        }
    };
    private final int zzk;

    zzabb(int i) {
        this.zzk = i;
    }

    public static zzxm zzb() {
        return zzi;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzk);
    }

    @Override // com.google.android.gms.internal.gtm.zzxl
    public final int zza() {
        return this.zzk;
    }
}
