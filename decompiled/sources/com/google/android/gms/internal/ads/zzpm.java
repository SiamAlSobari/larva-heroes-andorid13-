package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpm {
    private Boolean zza;

    public zzpm() {
    }

    public zzpm(Context context) {
    }

    public final zzom zza(zzam zzamVar, zzk zzkVar) {
        zzamVar.getClass();
        zzkVar.getClass();
        if (zzfk.zza < 29 || zzamVar.zzA == -1) {
            return zzom.zza;
        }
        Boolean bool = this.zza;
        if (bool != null) {
            bool.booleanValue();
        } else {
            Boolean bool2 = false;
            this.zza = bool2;
            bool2.booleanValue();
        }
        String str = zzamVar.zzm;
        str.getClass();
        int iZza = zzcc.zza(str, zzamVar.zzj);
        if (iZza == 0 || zzfk.zza < zzfk.zzf(iZza)) {
            return zzom.zza;
        }
        int iZzg = zzfk.zzg(zzamVar.zzz);
        if (iZzg == 0) {
            return zzom.zza;
        }
        try {
            AudioFormat audioFormatZzt = zzfk.zzt(zzamVar.zzA, iZzg, iZza);
            return zzfk.zza >= 31 ? zzpl.zza(audioFormatZzt, zzkVar.zza().zza, false) : zzpk.zza(audioFormatZzt, zzkVar.zza().zza, false);
        } catch (IllegalArgumentException unused) {
            return zzom.zza;
        }
    }
}
