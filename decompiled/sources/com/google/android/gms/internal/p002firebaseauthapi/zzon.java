package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzon extends zzng {
    private final Class zza;

    @SafeVarargs
    protected zzon(Class cls, Class cls2, zzog... zzogVarArr) {
        super(cls, zzogVarArr);
        this.zza = cls2;
    }

    public abstract zzalp zzg(zzalp zzalpVar) throws GeneralSecurityException;
}
