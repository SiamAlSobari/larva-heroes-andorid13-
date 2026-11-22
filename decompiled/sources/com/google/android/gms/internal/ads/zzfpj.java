package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfpj extends zzfpv {
    final /* synthetic */ zzfpk zza;
    private final zzfpp zzb;

    zzfpj(zzfpk zzfpkVar, zzfpp zzfppVar) {
        this.zza = zzfpkVar;
        this.zzb = zzfppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfpn zzfpnVarZzc = zzfpo.zzc();
        zzfpnVarZzc.zzb(i);
        if (string != null) {
            zzfpnVarZzc.zza(string);
        }
        this.zzb.zza(zzfpnVarZzc.zzc());
        if (i == 8157) {
            this.zza.zzc();
        }
    }
}
