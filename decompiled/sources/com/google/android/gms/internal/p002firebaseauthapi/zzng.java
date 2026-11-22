package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzng {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    protected zzng(Class cls, zzog... zzogVarArr) {
        this.zza = cls;
        HashMap map = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzog zzogVar = zzogVarArr[i];
            if (map.containsKey(zzogVar.zzb())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzogVar.zzb().getCanonicalName())));
            }
            map.put(zzogVar.zzb(), zzogVar);
        }
        this.zzc = zzogVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(map);
    }

    public zznf zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzwh zzb();

    public abstract zzalp zzc(zzajf zzajfVar) throws zzaks;

    public abstract String zzd();

    public abstract void zze(zzalp zzalpVar) throws GeneralSecurityException;

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzalp zzalpVar, Class cls) throws GeneralSecurityException {
        zzog zzogVar = (zzog) this.zzb.get(cls);
        if (zzogVar != null) {
            return zzogVar.zza(zzalpVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
