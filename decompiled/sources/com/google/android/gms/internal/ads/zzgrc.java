package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgrc {
    static final zzgrc zza = new zzgrc(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgrc zzd;
    private final Map zze;

    zzgrc() {
        this.zze = new HashMap();
    }

    public static zzgrc zza() {
        return zza;
    }

    public final zzgro zzc(zzgta zzgtaVar, int i) {
        return (zzgro) this.zze.get(new zzgrb(zzgtaVar, i));
    }

    zzgrc(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgrc zzb() {
        zzgrc zzgrcVar = zzd;
        if (zzgrcVar != null) {
            return zzgrcVar;
        }
        synchronized (zzgrc.class) {
            zzgrc zzgrcVar2 = zzd;
            if (zzgrcVar2 != null) {
                return zzgrcVar2;
            }
            zzgrc zzgrcVarZzb = zzgrk.zzb(zzgrc.class);
            zzd = zzgrcVarZzb;
            return zzgrcVarZzb;
        }
    }
}
