package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzggi {
    private static final zzggi zza;
    private final AtomicReference zzb = new AtomicReference(new zzgho(new zzghi(), null));

    static {
        try {
            zzggi zzggiVar = new zzggi();
            zzggiVar.zzf(new zzgfq(zzgfy.class, zzghc.class, new zzgfr() { // from class: com.google.android.gms.internal.ads.zzggh
            }));
            zza = zzggiVar;
        } catch (Exception e) {
            throw new zzghp(e);
        }
    }

    public static zzggi zzc() {
        return zza;
    }

    public final zzfzp zza(zzghc zzghcVar, @Nullable zzgas zzgasVar) throws GeneralSecurityException {
        return !((zzgho) this.zzb.get()).zzh(zzghcVar) ? new zzgfy(zzghcVar, zzgasVar) : ((zzgho) this.zzb.get()).zza(zzghcVar, zzgasVar);
    }

    public final zzgah zzb(zzghh zzghhVar) throws GeneralSecurityException {
        return ((zzgho) this.zzb.get()).zzb(zzghhVar);
    }

    public final zzghh zzd(zzgah zzgahVar, Class cls) throws GeneralSecurityException {
        return ((zzgho) this.zzb.get()).zzc(zzgahVar, cls);
    }

    public final synchronized void zze(zzgfp zzgfpVar) throws GeneralSecurityException {
        zzghi zzghiVar = new zzghi((zzgho) this.zzb.get());
        zzghiVar.zza(zzgfpVar);
        this.zzb.set(new zzgho(zzghiVar, null));
    }

    public final synchronized void zzf(zzgft zzgftVar) throws GeneralSecurityException {
        zzghi zzghiVar = new zzghi((zzgho) this.zzb.get());
        zzghiVar.zzb(zzgftVar);
        this.zzb.set(new zzgho(zzghiVar, null));
    }

    public final synchronized void zzg(zzggm zzggmVar) throws GeneralSecurityException {
        zzghi zzghiVar = new zzghi((zzgho) this.zzb.get());
        zzghiVar.zzc(zzggmVar);
        this.zzb.set(new zzgho(zzghiVar, null));
    }

    public final synchronized void zzh(zzggq zzggqVar) throws GeneralSecurityException {
        zzghi zzghiVar = new zzghi((zzgho) this.zzb.get());
        zzghiVar.zzd(zzggqVar);
        this.zzb.set(new zzgho(zzghiVar, null));
    }

    public final boolean zzi(zzghh zzghhVar) {
        return ((zzgho) this.zzb.get()).zzi(zzghhVar);
    }
}
