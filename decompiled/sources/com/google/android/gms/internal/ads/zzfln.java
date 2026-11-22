package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfln {
    private final Context zza;
    private final Looper zzb;

    public zzfln(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfmb zzfmbVarZza = zzfmd.zza();
        zzfmbVarZza.zza(this.zza.getPackageName());
        zzfmbVarZza.zzc(2);
        zzfly zzflyVarZza = zzflz.zza();
        zzflyVarZza.zza(str);
        zzflyVarZza.zzb(2);
        zzfmbVarZza.zzb(zzflyVarZza);
        new zzflo(this.zza, this.zzb, (zzfmd) zzfmbVarZza.zzal()).zza();
    }
}
