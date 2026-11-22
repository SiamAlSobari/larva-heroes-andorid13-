package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgw {

    @Nullable
    private String zza;

    @Nullable
    private zzgx zzb;

    @Nullable
    private zzcx zzc;

    private zzgw() {
    }

    /* synthetic */ zzgw(zzgv zzgvVar) {
    }

    public final zzgw zza(zzcx zzcxVar) {
        this.zzc = zzcxVar;
        return this;
    }

    public final zzgw zzb(zzgx zzgxVar) {
        this.zzb = zzgxVar;
        return this;
    }

    public final zzgw zzc(String str) {
        this.zza = str;
        return this;
    }

    public final zzgz zzd() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzgx zzgxVar = this.zzb;
        if (zzgxVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzcx zzcxVar = this.zzc;
        if (zzcxVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzcxVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must note have ID Requirements");
        }
        if ((zzgxVar.equals(zzgx.zza) && (zzcxVar instanceof zzey)) || ((zzgxVar.equals(zzgx.zzc) && (zzcxVar instanceof zzga)) || ((zzgxVar.equals(zzgx.zzb) && (zzcxVar instanceof zzhr)) || ((zzgxVar.equals(zzgx.zzd) && (zzcxVar instanceof zzdn)) || ((zzgxVar.equals(zzgx.zze) && (zzcxVar instanceof zzeh)) || (zzgxVar.equals(zzgx.zzf) && (zzcxVar instanceof zzfp))))))) {
            return new zzgz(this.zza, this.zzb, this.zzc, null);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + this.zzb.toString() + " when new keys are picked according to " + String.valueOf(this.zzc) + ".");
    }
}
