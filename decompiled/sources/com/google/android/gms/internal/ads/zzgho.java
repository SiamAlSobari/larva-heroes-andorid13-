package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgho {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    /* synthetic */ zzgho(zzghi zzghiVar, zzghn zzghnVar) {
        this.zza = new HashMap(zzghiVar.zza);
        this.zzb = new HashMap(zzghiVar.zzb);
        this.zzc = new HashMap(zzghiVar.zzc);
        this.zzd = new HashMap(zzghiVar.zzd);
    }

    public final zzfzp zza(zzghh zzghhVar, @Nullable zzgas zzgasVar) throws GeneralSecurityException {
        zzghk zzghkVar = new zzghk(zzghhVar.getClass(), zzghhVar.zzd(), null);
        if (this.zzb.containsKey(zzghkVar)) {
            return ((zzgfp) this.zzb.get(zzghkVar)).zza(zzghhVar, zzgasVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + zzghkVar.toString() + " available");
    }

    public final zzgah zzb(zzghh zzghhVar) throws GeneralSecurityException {
        zzghk zzghkVar = new zzghk(zzghhVar.getClass(), zzghhVar.zzd(), null);
        if (this.zzd.containsKey(zzghkVar)) {
            return ((zzggm) this.zzd.get(zzghkVar)).zza(zzghhVar);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + zzghkVar.toString() + " available");
    }

    public final zzghh zzc(zzgah zzgahVar, Class cls) throws GeneralSecurityException {
        zzghm zzghmVar = new zzghm(zzgahVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzghmVar)) {
            return ((zzggq) this.zzc.get(zzghmVar)).zza(zzgahVar);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + zzghmVar.toString() + " available");
    }

    public final boolean zzh(zzghh zzghhVar) {
        return this.zzb.containsKey(new zzghk(zzghhVar.getClass(), zzghhVar.zzd(), null));
    }

    public final boolean zzi(zzghh zzghhVar) {
        return this.zzd.containsKey(new zzghk(zzghhVar.getClass(), zzghhVar.zzd(), null));
    }
}
