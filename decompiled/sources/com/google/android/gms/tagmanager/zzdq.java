package com.google.android.gms.tagmanager;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzdq extends zzdx {
    public zzdq(String str) {
        super(str);
    }

    protected abstract boolean zzc(zzft zzftVar, zzft zzftVar2, Map map);

    @Override // com.google.android.gms.tagmanager.zzdx
    protected final boolean zzd(com.google.android.gms.internal.gtm.zzam zzamVar, com.google.android.gms.internal.gtm.zzam zzamVar2, Map map) {
        zzft zzftVarZzd = zzfu.zzd(zzfu.zzk(zzamVar));
        zzft zzftVarZzd2 = zzfu.zzd(zzfu.zzk(zzamVar2));
        if (zzftVarZzd == zzfu.zzc() || zzftVarZzd2 == zzfu.zzc()) {
            return false;
        }
        return zzc(zzftVarZzd, zzftVarZzd2, map);
    }
}
