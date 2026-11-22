package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhx {
    private final Context zza;
    private final zzhv zzb;

    public zzhx(Context context, Handler handler, zzhw zzhwVar) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzhv(this, handler, zzhwVar);
    }
}
