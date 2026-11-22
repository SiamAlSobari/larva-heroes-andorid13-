package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabc extends zzxj implements zzyv {
    private static final zzxp zza = new zzxp<Integer, zzabm>() { // from class: com.google.android.gms.internal.gtm.zzabc.1
        @Override // com.google.android.gms.internal.gtm.zzxp
        public /* bridge */ /* synthetic */ zzabm zzb(Integer num) {
            throw null;
        }
    };
    private static final zzabc zzd;
    private zzxo zze = zzag();

    static {
        zzabc zzabcVar = new zzabc();
        zzd = zzabcVar;
        zzxj.zzan(zzabc.class, zzabcVar);
    }

    private zzabc() {
    }

    public static zzabc zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzak(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"zze", zzabl.zza});
        }
        if (i2 == 3) {
            return new zzabc();
        }
        zzaaz zzaazVar = null;
        if (i2 == 4) {
            return new zzabd(zzaazVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
