package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzoi {
    private final Map zza;
    private final Map zzb;

    private zzoi() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzoi zza(zzof zzofVar) throws GeneralSecurityException {
        zzok zzokVar = new zzok(zzofVar.zzc(), zzofVar.zzd(), null);
        if (this.zza.containsKey(zzokVar)) {
            zzof zzofVar2 = (zzof) this.zza.get(zzokVar);
            if (!zzofVar2.equals(zzofVar) || !zzofVar.equals(zzofVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzokVar.toString()));
            }
        } else {
            this.zza.put(zzokVar, zzofVar);
        }
        return this;
    }

    public final zzoi zzb(zzcm zzcmVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZzb = zzcmVar.zzb();
        if (map.containsKey(clsZzb)) {
            zzcm zzcmVar2 = (zzcm) this.zzb.get(clsZzb);
            if (!zzcmVar2.equals(zzcmVar) || !zzcmVar.equals(zzcmVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
            }
        } else {
            this.zzb.put(clsZzb, zzcmVar);
        }
        return this;
    }

    /* synthetic */ zzoi(zzoh zzohVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    /* synthetic */ zzoi(zzom zzomVar, zzoh zzohVar) {
        this.zza = new HashMap(zzomVar.zza);
        this.zzb = new HashMap(zzomVar.zzb);
    }
}
