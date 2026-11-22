package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfrb {
    private final String zza;
    private final zzfqz zzb;
    private zzfqz zzc;

    /* synthetic */ zzfrb(String str, zzfra zzfraVar) {
        zzfqz zzfqzVar = new zzfqz(null);
        this.zzb = zzfqzVar;
        this.zzc = zzfqzVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfqz zzfqzVar = this.zzb.zzb;
        String str = "";
        while (zzfqzVar != null) {
            Object obj = zzfqzVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzfqzVar = zzfqzVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfrb zza(@CheckForNull Object obj) {
        zzfqz zzfqzVar = new zzfqz(null);
        this.zzc.zzb = zzfqzVar;
        this.zzc = zzfqzVar;
        zzfqzVar.zza = obj;
        return this;
    }
}
