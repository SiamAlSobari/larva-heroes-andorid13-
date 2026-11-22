package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpa {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    /* synthetic */ zzpa(zzou zzouVar, zzoz zzozVar) {
        this.zza = new HashMap(zzouVar.zza);
        this.zzb = new HashMap(zzouVar.zzb);
        this.zzc = new HashMap(zzouVar.zzc);
        this.zzd = new HashMap(zzouVar.zzd);
    }

    public final zzbn zza(zzot zzotVar, @Nullable zzcr zzcrVar) throws GeneralSecurityException {
        zzow zzowVar = new zzow(zzotVar.getClass(), zzotVar.zzd(), null);
        if (this.zzb.containsKey(zzowVar)) {
            return ((zzna) this.zzb.get(zzowVar)).zza(zzotVar, zzcrVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + zzowVar.toString() + " available");
    }

    public final zzce zzb(zzot zzotVar) throws GeneralSecurityException {
        zzow zzowVar = new zzow(zzotVar.getClass(), zzotVar.zzd(), null);
        if (this.zzd.containsKey(zzowVar)) {
            return ((zznx) this.zzd.get(zzowVar)).zza(zzotVar);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + zzowVar.toString() + " available");
    }

    public final zzot zzc(zzce zzceVar, Class cls) throws GeneralSecurityException {
        zzoy zzoyVar = new zzoy(zzceVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzoyVar)) {
            return ((zzob) this.zzc.get(zzoyVar)).zza(zzceVar);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + zzoyVar.toString() + " available");
    }

    public final boolean zzh(zzot zzotVar) {
        return this.zzb.containsKey(new zzow(zzotVar.getClass(), zzotVar.zzd(), null));
    }

    public final boolean zzi(zzot zzotVar) {
        return this.zzd.containsKey(new zzow(zzotVar.getClass(), zzotVar.zzd(), null));
    }
}
