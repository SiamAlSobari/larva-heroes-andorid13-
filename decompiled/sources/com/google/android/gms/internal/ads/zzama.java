package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzama {
    public static final boolean zza = zzamb.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzama() {
    }

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzamb.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzalz(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        long j;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j = 0;
        } else {
            long j2 = ((zzalz) this.zzb.get(0)).zzc;
            List list = this.zzb;
            j = ((zzalz) list.get(list.size() - 1)).zzc - j2;
        }
        if (j <= 0) {
            return;
        }
        long j3 = ((zzalz) this.zzb.get(0)).zzc;
        zzamb.zza("(%-4d ms) %s", Long.valueOf(j), str);
        for (zzalz zzalzVar : this.zzb) {
            long j4 = zzalzVar.zzc;
            zzamb.zza("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(zzalzVar.zzb), zzalzVar.zza);
            j3 = j4;
        }
    }
}
