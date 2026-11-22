package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfuk extends zzfse {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfrj zzb;

    zzfuk(Iterator it, zzfrj zzfrjVar) {
        this.zza = it;
        this.zzb = zzfrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfse
    @CheckForNull
    protected final Object zza() {
        while (this.zza.hasNext()) {
            Object next = this.zza.next();
            if (this.zzb.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
