package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfip {
    public abstract void zzb(View view, zzfiw zzfiwVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();

    public static zzfip zza(zzfiq zzfiqVar, zzfir zzfirVar) {
        if (zzfin.zzb()) {
            return new zzfit(zzfiqVar, zzfirVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
