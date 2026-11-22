package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzct {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzxa zza(zzwv zzwvVar) {
        zzwx zzwxVarZza = zzxa.zza();
        zzwxVarZza.zzb(zzwvVar.zzb());
        for (zzwu zzwuVar : zzwvVar.zzh()) {
            zzwy zzwyVarZzb = zzwz.zzb();
            zzwyVarZzb.zzc(zzwuVar.zzb().zzf());
            zzwyVarZzb.zzd(zzwuVar.zzk());
            zzwyVarZzb.zzb(zzwuVar.zze());
            zzwyVarZzb.zza(zzwuVar.zza());
            zzwxVarZza.zza((zzwz) zzwyVarZzb.zzi());
        }
        return (zzxa) zzwxVarZza.zzi();
    }
}
