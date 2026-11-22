package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgin implements zzgap {
    private static final zzgin zza = new zzgin();

    private zzgin() {
    }

    static void zzd() throws GeneralSecurityException {
        zzgar.zzf(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Class zza() {
        return zzgik.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Class zzb() {
        return zzgik.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ Object zzc(zzgao zzgaoVar) throws GeneralSecurityException {
        if (zzgaoVar.zza() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = zzgaoVar.zzd().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new zzgim(zzgaoVar, null);
    }
}
