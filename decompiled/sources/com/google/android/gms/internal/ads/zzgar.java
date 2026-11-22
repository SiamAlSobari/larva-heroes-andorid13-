package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgar {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzgar.class.getName());
    private static final AtomicReference zzc = new AtomicReference(new zzfzt());
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzgar() {
    }

    public static synchronized zzgmq zza(zzgmv zzgmvVar) throws GeneralSecurityException {
        zzfzq zzfzqVarZzb;
        zzfzqVarZzb = ((zzfzt) zzc.get()).zzb(zzgmvVar.zzh());
        if (!((Boolean) zze.get(zzgmvVar.zzh())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgmvVar.zzh())));
        }
        return zzfzqVarZzb.zza(zzgmvVar.zzg());
    }

    @Nullable
    public static Class zzb(Class cls) {
        try {
            return zzggg.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzc(String str, zzgqi zzgqiVar, Class cls) throws GeneralSecurityException {
        return ((zzfzt) zzc.get()).zza(str, cls).zzb(zzgqiVar);
    }

    static synchronized Map zzd() {
        return Collections.unmodifiableMap(zzg);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.gms.internal.ads.zzgta, java.lang.Object] */
    public static synchronized void zze(zzgfw zzgfwVar, boolean z) throws GeneralSecurityException {
        AtomicReference atomicReference = zzc;
        zzfzt zzfztVar = new zzfzt((zzfzt) atomicReference.get());
        zzfztVar.zzc(zzgfwVar);
        Map mapZzc = zzgfwVar.zza().zzc();
        String strZzd = zzgfwVar.zzd();
        zzg(strZzd, mapZzc, true);
        if (!((zzfzt) atomicReference.get()).zzd(strZzd)) {
            zzd.put(strZzd, new zzgaq(zzgfwVar));
            for (Map.Entry entry : zzgfwVar.zza().zzc().entrySet()) {
                zzg.put((String) entry.getKey(), zzfzv.zzc(strZzd, ((zzgfu) entry.getValue()).zza.zzax(), ((zzgfu) entry.getValue()).zzb));
            }
        }
        zze.put(strZzd, true);
        zzc.set(zzfztVar);
    }

    public static synchronized void zzf(zzgap zzgapVar) throws GeneralSecurityException {
        zzggg.zza().zzf(zzgapVar);
    }

    private static synchronized void zzg(String str, Map map, boolean z) throws GeneralSecurityException {
        ConcurrentMap concurrentMap = zze;
        if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
        }
        if (((zzfzt) zzc.get()).zzd(str)) {
            for (Map.Entry entry : map.entrySet()) {
                if (!zzg.containsKey(entry.getKey())) {
                    throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                }
            }
        } else {
            for (Map.Entry entry2 : map.entrySet()) {
                if (zzg.containsKey(entry2.getKey())) {
                    throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                }
            }
        }
    }
}
