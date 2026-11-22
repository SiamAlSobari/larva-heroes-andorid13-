package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfro extends zzfrt {
    final /* synthetic */ zzfrp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfro(zzfrp zzfrpVar, zzfrv zzfrvVar, CharSequence charSequence) {
        super(zzfrvVar, charSequence);
        this.zza = zzfrpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    final int zzd(int i) {
        zzfqt zzfqtVar = this.zza.zza;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfri.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (zzfqtVar.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
