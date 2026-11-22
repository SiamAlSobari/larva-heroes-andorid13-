package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzggx {
    private final Map zza;
    private final Map zzb;

    private zzggx() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzggx zza(zzggu zzgguVar) throws GeneralSecurityException {
        zzggz zzggzVar = new zzggz(zzgguVar.zzc(), zzgguVar.zzd(), null);
        if (this.zza.containsKey(zzggzVar)) {
            zzggu zzgguVar2 = (zzggu) this.zza.get(zzggzVar);
            if (!zzgguVar2.equals(zzgguVar) || !zzgguVar.equals(zzgguVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzggzVar.toString()));
            }
        } else {
            this.zza.put(zzggzVar, zzgguVar);
        }
        return this;
    }

    public final zzggx zzb(zzgap zzgapVar) throws GeneralSecurityException {
        if (zzgapVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Map map = this.zzb;
        Class clsZzb = zzgapVar.zzb();
        if (map.containsKey(clsZzb)) {
            zzgap zzgapVar2 = (zzgap) this.zzb.get(clsZzb);
            if (!zzgapVar2.equals(zzgapVar) || !zzgapVar.equals(zzgapVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
            }
        } else {
            this.zzb.put(clsZzb, zzgapVar);
        }
        return this;
    }

    /* synthetic */ zzggx(zzggw zzggwVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    /* synthetic */ zzggx(zzghb zzghbVar, zzggw zzggwVar) {
        this.zza = new HashMap(zzghbVar.zza);
        this.zzb = new HashMap(zzghbVar.zzb);
    }
}
