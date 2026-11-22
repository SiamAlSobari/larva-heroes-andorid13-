package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfxi extends zzfxf {
    private zzfxi() {
        super(null);
    }

    /* synthetic */ zzfxi(zzfxh zzfxhVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    final int zza(zzfxj zzfxjVar) {
        int i;
        synchronized (zzfxjVar) {
            i = zzfxjVar.remaining - 1;
            zzfxjVar.remaining = i;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    final void zzb(zzfxj zzfxjVar, @CheckForNull Set set, Set set2) {
        synchronized (zzfxjVar) {
            if (zzfxjVar.seenExceptions == null) {
                zzfxjVar.seenExceptions = set2;
            }
        }
    }
}
