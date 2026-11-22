package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfjh {
    private static final zzfjh zza = new zzfjh();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfjh() {
    }

    public static zzfjh zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfit zzfitVar) {
        this.zzb.add(zzfitVar);
    }

    public final void zze(zzfit zzfitVar) {
        boolean zZzg = zzg();
        this.zzb.remove(zzfitVar);
        this.zzc.remove(zzfitVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfjo.zzb().zzg();
    }

    public final void zzf(zzfit zzfitVar) {
        boolean zZzg = zzg();
        this.zzc.add(zzfitVar);
        if (zZzg) {
            return;
        }
        zzfjo.zzb().zzf();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
