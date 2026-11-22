package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbt {
    private static final Logger zza = Logger.getLogger(zzbt.class.getName());
    private final ConcurrentMap zzb;

    zzbt() {
        this.zzb = new ConcurrentHashMap();
    }

    private final synchronized zzbs zzf(String str) throws GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzbs) this.zzb.get(str);
    }

    private final synchronized void zzg(zzbs zzbsVar, boolean z) throws GeneralSecurityException {
        String strZzc = zzbsVar.zzb().zzc();
        zzbs zzbsVar2 = (zzbs) this.zzb.get(strZzc);
        if (zzbsVar2 != null && !zzbsVar2.zzc().equals(zzbsVar.zzc())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(strZzc));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzc, zzbsVar2.zzc().getName(), zzbsVar.zzc().getName()));
        }
        if (z) {
            this.zzb.put(strZzc, zzbsVar);
        } else {
            this.zzb.putIfAbsent(strZzc, zzbsVar);
        }
    }

    final zzbo zza(String str, Class cls) throws GeneralSecurityException {
        zzbs zzbsVarZzf = zzf(str);
        if (zzbsVarZzf.zze().contains(cls)) {
            return zzbsVarZzf.zza(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzbsVarZzf.zzc());
        Set<Class> setZze = zzbsVarZzf.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : setZze) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + strValueOf + ", supported primitives: " + sb.toString());
    }

    final zzbo zzb(String str) throws GeneralSecurityException {
        return zzf(str).zzb();
    }

    final synchronized void zzc(zzon zzonVar, zzng zzngVar) throws GeneralSecurityException {
        Class clsZzd;
        if (!zzij.zza(1)) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzonVar.getClass()) + " as it is not FIPS compatible.");
        }
        if (!zzij.zza(zzngVar.zzf())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzngVar.getClass()) + " as it is not FIPS compatible.");
        }
        String strZzd = zzonVar.zzd();
        String strZzd2 = zzngVar.zzd();
        if (this.zzb.containsKey(strZzd) && ((zzbs) this.zzb.get(strZzd)).zzd() != null && (clsZzd = ((zzbs) this.zzb.get(strZzd)).zzd()) != null && !clsZzd.getName().equals(zzngVar.getClass().getName())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + strZzd + " with inconsistent public key type " + strZzd2);
            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzonVar.getClass().getName(), clsZzd.getName(), zzngVar.getClass().getName()));
        }
        zzg(new zzbr(zzonVar, zzngVar), true);
        zzg(new zzbq(zzngVar), false);
    }

    final synchronized void zzd(zzng zzngVar) throws GeneralSecurityException {
        if (!zzij.zza(zzngVar.zzf())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzngVar.getClass()) + " as it is not FIPS compatible.");
        }
        zzg(new zzbq(zzngVar), false);
    }

    final boolean zze(String str) {
        return this.zzb.containsKey(str);
    }

    zzbt(zzbt zzbtVar) {
        this.zzb = new ConcurrentHashMap(zzbtVar.zzb);
    }
}
