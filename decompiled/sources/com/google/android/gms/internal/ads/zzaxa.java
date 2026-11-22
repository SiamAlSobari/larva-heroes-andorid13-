package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxa {
    private zzawp zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    zzaxa(Context context) {
        this.zzc = context;
    }

    final Future zzc(zzawq zzawqVar) {
        zzawu zzawuVar = new zzawu(this);
        zzawy zzawyVar = new zzawy(this, zzawqVar, zzawuVar);
        zzawz zzawzVar = new zzawz(this, zzawuVar);
        synchronized (this.zzd) {
            zzawp zzawpVar = new zzawp(this.zzc, com.google.android.gms.ads.internal.zzt.zzt().zzb(), zzawyVar, zzawzVar);
            this.zza = zzawpVar;
            zzawpVar.checkAvailabilityAndConnect();
        }
        return zzawuVar;
    }

    static /* bridge */ /* synthetic */ void zze(zzaxa zzaxaVar) {
        synchronized (zzaxaVar.zzd) {
            zzawp zzawpVar = zzaxaVar.zza;
            if (zzawpVar == null) {
                return;
            }
            zzawpVar.disconnect();
            zzaxaVar.zza = null;
            Binder.flushPendingCommands();
        }
    }
}
