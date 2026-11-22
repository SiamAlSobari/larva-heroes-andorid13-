package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzghi {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzghi() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzghi zza(zzgfp zzgfpVar) throws GeneralSecurityException {
        zzghk zzghkVar = new zzghk(zzgfpVar.zzd(), zzgfpVar.zzc(), null);
        if (this.zzb.containsKey(zzghkVar)) {
            zzgfp zzgfpVar2 = (zzgfp) this.zzb.get(zzghkVar);
            if (!zzgfpVar2.equals(zzgfpVar) || !zzgfpVar.equals(zzgfpVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzghkVar.toString()));
            }
        } else {
            this.zzb.put(zzghkVar, zzgfpVar);
        }
        return this;
    }

    public final zzghi zzb(zzgft zzgftVar) throws GeneralSecurityException {
        zzghm zzghmVar = new zzghm(zzgftVar.zzb(), zzgftVar.zzc(), null);
        if (this.zza.containsKey(zzghmVar)) {
            zzgft zzgftVar2 = (zzgft) this.zza.get(zzghmVar);
            if (!zzgftVar2.equals(zzgftVar) || !zzgftVar.equals(zzgftVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzghmVar.toString()));
            }
        } else {
            this.zza.put(zzghmVar, zzgftVar);
        }
        return this;
    }

    public final zzghi zzc(zzggm zzggmVar) throws GeneralSecurityException {
        zzghk zzghkVar = new zzghk(zzggmVar.zzd(), zzggmVar.zzc(), null);
        if (this.zzd.containsKey(zzghkVar)) {
            zzggm zzggmVar2 = (zzggm) this.zzd.get(zzghkVar);
            if (!zzggmVar2.equals(zzggmVar) || !zzggmVar.equals(zzggmVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzghkVar.toString()));
            }
        } else {
            this.zzd.put(zzghkVar, zzggmVar);
        }
        return this;
    }

    public final zzghi zzd(zzggq zzggqVar) throws GeneralSecurityException {
        zzghm zzghmVar = new zzghm(zzggqVar.zzc(), zzggqVar.zzd(), null);
        if (this.zzc.containsKey(zzghmVar)) {
            zzggq zzggqVar2 = (zzggq) this.zzc.get(zzghmVar);
            if (!zzggqVar2.equals(zzggqVar) || !zzggqVar.equals(zzggqVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzghmVar.toString()));
            }
        } else {
            this.zzc.put(zzghmVar, zzggqVar);
        }
        return this;
    }

    public zzghi(zzgho zzghoVar) {
        this.zza = new HashMap(zzghoVar.zza);
        this.zzb = new HashMap(zzghoVar.zzb);
        this.zzc = new HashMap(zzghoVar.zzc);
        this.zzd = new HashMap(zzghoVar.zzd);
    }
}
