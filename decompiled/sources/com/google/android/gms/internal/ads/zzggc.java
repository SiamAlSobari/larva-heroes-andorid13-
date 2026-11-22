package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzggc {
    public static final zzgju zza = new zzggb(null);

    public static zzgka zza(zzgao zzgaoVar) {
        zzfzu zzfzuVar;
        zzgjw zzgjwVar = new zzgjw();
        zzgjwVar.zzb(zzgaoVar.zzb());
        Iterator it = zzgaoVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzgak zzgakVar : (List) it.next()) {
                int iZzh = zzgakVar.zzh() - 2;
                if (iZzh == 1) {
                    zzfzuVar = zzfzu.zza;
                } else if (iZzh == 2) {
                    zzfzuVar = zzfzu.zzb;
                } else {
                    if (iZzh != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzfzuVar = zzfzu.zzc;
                }
                int iZza = zzgakVar.zza();
                String strZzf = zzgakVar.zzf();
                if (strZzf.startsWith("type.googleapis.com/google.crypto.")) {
                    strZzf = strZzf.substring(34);
                }
                zzgjwVar.zza(zzfzuVar, iZza, strZzf, zzgakVar.zzc().name());
            }
        }
        if (zzgaoVar.zza() != null) {
            zzgjwVar.zzc(zzgaoVar.zza().zza());
        }
        try {
            return zzgjwVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
