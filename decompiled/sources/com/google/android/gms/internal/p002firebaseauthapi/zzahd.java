package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahd {
    public static long zza(String str) {
        Preconditions.checkNotEmpty(str);
        List listZzd = zzab.zzb(zzj.zzb('.')).zzd(str);
        if (listZzd.size() < 2) {
            throw new RuntimeException("Invalid idToken ".concat(String.valueOf(str)));
        }
        try {
            zzahe zzaheVarZza = zzahe.zza(new String(Base64Utils.decodeUrlSafeNoPadding((String) listZzd.get(1)), "UTF-8"));
            return zzaheVarZza.zzb().longValue() - zzaheVarZza.zzc().longValue();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unable to decode token", e);
        }
    }
}
