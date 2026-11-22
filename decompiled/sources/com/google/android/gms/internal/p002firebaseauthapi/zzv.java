package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzv extends zzz {
    final /* synthetic */ zzw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzv(zzw zzwVar, zzab zzabVar, CharSequence charSequence) {
        super(zzabVar, charSequence);
        this.zza = zzwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzz
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzz
    final int zzd(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzu.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            zzw zzwVar = this.zza;
            if (zzwVar.zza.zza(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
