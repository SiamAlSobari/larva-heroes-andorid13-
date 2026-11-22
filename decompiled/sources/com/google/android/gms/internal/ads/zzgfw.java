package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgfw {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    protected zzgfw(Class cls, zzggv... zzggvVarArr) {
        this.zza = cls;
        HashMap map = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzggv zzggvVar = zzggvVarArr[i];
            if (map.containsKey(zzggvVar.zzb())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzggvVar.zzb().getCanonicalName())));
            }
            map.put(zzggvVar.zzb(), zzggvVar);
        }
        this.zzc = zzggvVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(map);
    }

    public zzgfv zza() {
        throw null;
    }

    public abstract zzgmp zzb();

    public abstract zzgta zzc(zzgqi zzgqiVar) throws zzgsc;

    public abstract String zzd();

    public abstract void zze(zzgta zzgtaVar) throws GeneralSecurityException;

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgta zzgtaVar, Class cls) throws GeneralSecurityException {
        zzggv zzggvVar = (zzggv) this.zzb.get(cls);
        if (zzggvVar != null) {
            return zzggvVar.zza(zzgtaVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
