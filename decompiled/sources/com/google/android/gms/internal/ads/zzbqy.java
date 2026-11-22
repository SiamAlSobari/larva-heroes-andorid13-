package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbqy implements View.OnClickListener {
    final /* synthetic */ zzbqz zza;

    zzbqy(zzbqz zzbqzVar) {
        this.zza = zzbqzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
