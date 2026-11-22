package com.google.android.gms.tagmanager;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzea extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.RANDOM.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.MIN.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.MAX.toString();

    public zzea() {
        super(zza, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        double d = 0.0d;
        double d2 = 2.147483647E9d;
        if (zzamVar != null && zzamVar != zzfu.zza() && zzamVar2 != null && zzamVar2 != zzfu.zza()) {
            zzft zzftVarZzd = zzfu.zzd(zzfu.zzk(zzamVar));
            zzft zzftVarZzd2 = zzfu.zzd(zzfu.zzk(zzamVar2));
            if (zzftVarZzd != zzfu.zzc() && zzftVarZzd2 != zzfu.zzc()) {
                double dDoubleValue = zzftVarZzd.doubleValue();
                double dDoubleValue2 = zzftVarZzd2.doubleValue();
                if (dDoubleValue <= dDoubleValue2) {
                    d = dDoubleValue;
                    d2 = dDoubleValue2;
                }
            }
        }
        return zzfu.zzb(Long.valueOf(Math.round((Math.random() * (d2 - d)) + d)));
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}
