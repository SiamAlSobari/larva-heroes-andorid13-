package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zznf {
    private final Class zza;

    public zznf(Class cls) {
        this.zza = cls;
    }

    public abstract zzalp zza(zzalp zzalpVar) throws GeneralSecurityException;

    public abstract zzalp zzb(zzajf zzajfVar) throws zzaks;

    public Map zzc() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzalp zzalpVar) throws GeneralSecurityException;
}
