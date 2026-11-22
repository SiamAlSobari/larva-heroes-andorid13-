package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgow {
    public static final zzgow zza = new zzgow(new zzgox());
    public static final zzgow zzb = new zzgow(new zzgpb());
    public static final zzgow zzc = new zzgow(new zzgpd());
    public static final zzgow zzd = new zzgow(new zzgpc());
    public static final zzgow zze = new zzgow(new zzgoy());
    public static final zzgow zzf = new zzgow(new zzgpa());
    public static final zzgow zzg = new zzgow(new zzgoz());
    private final zzgov zzh;

    public zzgow(zzgpe zzgpeVar) {
        if (zzgfk.zzb()) {
            this.zzh = new zzgou(zzgpeVar, null);
        } else if (zzgpl.zza()) {
            this.zzh = new zzgoq(zzgpeVar, null);
        } else {
            this.zzh = new zzgos(zzgpeVar, null);
        }
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzh.zza(str);
    }
}
