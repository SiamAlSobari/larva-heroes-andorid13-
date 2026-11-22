package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqa implements zzcm {
    private static final zzqa zza = new zzqa();

    private zzqa() {
    }

    static void zzd() throws GeneralSecurityException {
        zzcq.zzh(zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final Class zza() {
        return zzpx.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final Class zzb() {
        return zzpx.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final /* bridge */ /* synthetic */ Object zzc(zzcl zzclVar) throws GeneralSecurityException {
        if (zzclVar.zza() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = zzclVar.zzd().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new zzpz(zzclVar, null);
    }
}
