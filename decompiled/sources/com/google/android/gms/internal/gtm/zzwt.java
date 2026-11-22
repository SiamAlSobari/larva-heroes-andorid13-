package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public class zzwt {
    static final zzwt zza = new zzwt(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzwt zzd;
    private final Map zze;

    zzwt() {
        this.zze = new HashMap();
    }

    public zzxh zzb(zzyu zzyuVar, int i) {
        return (zzxh) this.zze.get(new zzws(zzyuVar, i));
    }

    zzwt(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzwt zza() {
        zzwt zzwtVar = zzd;
        if (zzwtVar != null) {
            return zzwtVar;
        }
        synchronized (zzwt.class) {
            zzwt zzwtVar2 = zzd;
            if (zzwtVar2 != null) {
                return zzwtVar2;
            }
            zzwt zzwtVarZzb = zzxb.zzb(zzwt.class);
            zzd = zzwtVarZzb;
            return zzwtVarZzb;
        }
    }
}
