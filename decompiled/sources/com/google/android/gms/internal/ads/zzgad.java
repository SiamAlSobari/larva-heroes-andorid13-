package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgad {
    private final zzgnd zza;
    private final List zzb;
    private final zzgjt zzc;

    private zzgad(zzgnd zzgndVar, List list) {
        this.zza = zzgndVar;
        this.zzb = list;
        this.zzc = zzgjt.zza;
    }

    private zzgad(zzgnd zzgndVar, List list, zzgjt zzgjtVar) {
        this.zza = zzgndVar;
        this.zzb = list;
        this.zzc = zzgjtVar;
    }

    static final zzgad zza(zzgnd zzgndVar) throws GeneralSecurityException {
        zzi(zzgndVar);
        return new zzgad(zzgndVar, zzh(zzgndVar));
    }

    static final zzgad zzb(zzgnd zzgndVar, zzgjt zzgjtVar) throws GeneralSecurityException {
        zzi(zzgndVar);
        return new zzgad(zzgndVar, zzh(zzgndVar), zzgjtVar);
    }

    public static final zzgad zzc(zzgah zzgahVar) throws GeneralSecurityException {
        zzgaa zzgaaVar = new zzgaa();
        zzfzy zzfzyVar = new zzfzy(zzgahVar, null);
        zzfzyVar.zze();
        zzfzyVar.zzd();
        zzgaaVar.zza(zzfzyVar);
        return zzgaaVar.zzb();
    }

    private static zzghc zzf(zzgnc zzgncVar) {
        try {
            return zzghc.zza(zzgncVar.zzc().zzg(), zzgncVar.zzc().zzf(), zzgncVar.zzc().zzc(), zzgncVar.zzf(), zzgncVar.zzf() == zzgnw.RAW ? null : Integer.valueOf(zzgncVar.zza()));
        } catch (GeneralSecurityException e) {
            throw new zzghp("Creating a protokey serialization failed", e);
        }
    }

    @Nullable
    private static Object zzg(zzgfl zzgflVar, zzgnc zzgncVar, Class cls) throws GeneralSecurityException {
        try {
            zzgmq zzgmqVarZzc = zzgncVar.zzc();
            int i = zzgar.zza;
            return zzgar.zzc(zzgmqVarZzc.zzg(), zzgmqVarZzc.zzf(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e) {
            if (e.getMessage().contains("No key manager found for key type ") || e.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e;
        }
    }

    private static List zzh(zzgnd zzgndVar) {
        zzfzu zzfzuVar;
        ArrayList arrayList = new ArrayList(zzgndVar.zza());
        for (zzgnc zzgncVar : zzgndVar.zzh()) {
            int iZza = zzgncVar.zza();
            try {
                zzfzp zzfzpVarZza = zzggi.zzc().zza(zzf(zzgncVar), zzgas.zza());
                int iZzk = zzgncVar.zzk() - 2;
                if (iZzk == 1) {
                    zzfzuVar = zzfzu.zza;
                } else if (iZzk == 2) {
                    zzfzuVar = zzfzu.zzb;
                } else {
                    if (iZzk != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    zzfzuVar = zzfzu.zzc;
                }
                arrayList.add(new zzgac(zzfzpVarZza, zzfzuVar, iZza, iZza == zzgndVar.zzc(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzi(zzgnd zzgndVar) throws GeneralSecurityException {
        if (zzgndVar == null || zzgndVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    @Nullable
    private static final Object zzj(zzgfl zzgflVar, zzfzp zzfzpVar, Class cls) throws GeneralSecurityException {
        try {
            return zzggg.zza().zzc(zzfzpVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        zzgnd zzgndVar = this.zza;
        Charset charset = zzgat.zza;
        zzgnf zzgnfVarZza = zzgni.zza();
        zzgnfVarZza.zzb(zzgndVar.zzc());
        for (zzgnc zzgncVar : zzgndVar.zzh()) {
            zzgng zzgngVarZza = zzgnh.zza();
            zzgngVarZza.zzc(zzgncVar.zzc().zzg());
            zzgngVarZza.zzd(zzgncVar.zzk());
            zzgngVarZza.zzb(zzgncVar.zzf());
            zzgngVarZza.zza(zzgncVar.zza());
            zzgnfVarZza.zza((zzgnh) zzgngVarZza.zzal());
        }
        return ((zzgni) zzgnfVarZza.zzal()).toString();
    }

    final zzgnd zzd() {
        return this.zza;
    }

    public final Object zze(zzfzm zzfzmVar, Class cls) throws GeneralSecurityException {
        Class clsZzb = zzgar.zzb(cls);
        if (clsZzb == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
        }
        zzgnd zzgndVar = this.zza;
        Charset charset = zzgat.zza;
        int iZzc = zzgndVar.zzc();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgnc zzgncVar : zzgndVar.zzh()) {
            if (zzgncVar.zzk() == 3) {
                if (!zzgncVar.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgncVar.zza())));
                }
                if (zzgncVar.zzf() == zzgnw.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgncVar.zza())));
                }
                if (zzgncVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgncVar.zza())));
                }
                if (zzgncVar.zza() == iZzc) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzgncVar.zzc().zzc() == zzgmp.ASYMMETRIC_PUBLIC;
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzgaj zzgajVar = new zzgaj(clsZzb, null);
        zzgajVar.zzc(this.zzc);
        for (int i2 = 0; i2 < this.zza.zza(); i2++) {
            zzgnc zzgncVarZze = this.zza.zze(i2);
            if (zzgncVarZze.zzk() == 3) {
                zzgfl zzgflVar = (zzgfl) zzfzmVar;
                Object objZzg = zzg(zzgflVar, zzgncVarZze, clsZzb);
                Object objZzj = this.zzb.get(i2) != null ? zzj(zzgflVar, ((zzgac) this.zzb.get(i2)).zza(), clsZzb) : null;
                if (objZzj == null && objZzg == null) {
                    throw new GeneralSecurityException("Unable to get primitive " + clsZzb.toString() + " for key of type " + zzgncVarZze.zzc().zzg());
                }
                if (zzgncVarZze.zza() == this.zza.zzc()) {
                    zzgajVar.zzb(objZzj, objZzg, zzgncVarZze);
                } else {
                    zzgajVar.zza(objZzj, objZzg, zzgncVarZze);
                }
            }
        }
        return zzggg.zza().zzd(zzgajVar.zzd(), cls);
    }
}
