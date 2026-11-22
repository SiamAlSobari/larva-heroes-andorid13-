package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtg {
    private static final zzgtf zza;
    private static final zzgtf zzb;

    static {
        zzgtf zzgtfVar;
        try {
            zzgtfVar = (zzgtf) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgtfVar = null;
        }
        zza = zzgtfVar;
        zzb = new zzgtf();
    }

    static zzgtf zza() {
        return zza;
    }

    static zzgtf zzb() {
        return zzb;
    }
}
