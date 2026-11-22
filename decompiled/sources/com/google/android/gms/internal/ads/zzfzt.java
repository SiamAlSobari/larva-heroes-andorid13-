package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfzt {
    private static final Logger zza = Logger.getLogger(zzfzt.class.getName());
    private final ConcurrentMap zzb;

    zzfzt() {
        this.zzb = new ConcurrentHashMap();
    }

    private final synchronized zzfzs zze(String str) throws GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzfzs) this.zzb.get(str);
    }

    private final synchronized void zzf(zzfzs zzfzsVar, boolean z) throws GeneralSecurityException {
        String strZzc = zzfzsVar.zza().zzc();
        zzfzs zzfzsVar2 = (zzfzs) this.zzb.get(strZzc);
        if (zzfzsVar2 != null && !zzfzsVar2.zza.getClass().equals(zzfzsVar.zza.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(strZzc));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzc, zzfzsVar2.zza.getClass().getName(), zzfzsVar.zza.getClass().getName()));
        }
        this.zzb.putIfAbsent(strZzc, zzfzsVar);
    }

    final zzfzq zza(String str, Class cls) throws GeneralSecurityException {
        zzfzs zzfzsVarZze = zze(str);
        if (zzfzsVarZze.zza.zzl().contains(cls)) {
            try {
                return new zzfzr(zzfzsVarZze.zza, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzfzsVarZze.zza.getClass());
        Set<Class> setZzl = zzfzsVarZze.zza.zzl();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : setZzl) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + strValueOf + ", supported primitives: " + sb.toString());
    }

    final zzfzq zzb(String str) throws GeneralSecurityException {
        return zze(str).zza();
    }

    final synchronized void zzc(zzgfw zzgfwVar) throws GeneralSecurityException {
        if (!zzgfj.zza(zzgfwVar.zzf())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgfwVar.getClass()) + " as it is not FIPS compatible.");
        }
        zzf(new zzfzs(zzgfwVar), false);
    }

    final boolean zzd(String str) {
        return this.zzb.containsKey(str);
    }

    zzfzt(zzfzt zzfztVar) {
        this.zzb = new ConcurrentHashMap(zzfztVar.zzb);
    }
}
