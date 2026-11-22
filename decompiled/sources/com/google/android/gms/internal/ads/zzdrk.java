package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdrk implements zzfgf {
    private final zzdrc zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdrk(zzdrc zzdrcVar, Set set, Clock clock) {
        this.zzb = zzdrcVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdrj zzdrjVar = (zzdrj) it.next();
            this.zzd.put(zzdrjVar.zzc, zzdrjVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzffy zzffyVar, boolean z) {
        zzffy zzffyVar2 = ((zzdrj) this.zzd.get(zzffyVar)).zzb;
        if (this.zza.containsKey(zzffyVar2)) {
            String str = true != z ? "f." : "s.";
            this.zzb.zza().put("label.".concat(((zzdrj) this.zzd.get(zzffyVar)).zza), str.concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffyVar2)).longValue()))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbH(zzffy zzffyVar, String str, Throwable th) {
        if (this.zza.containsKey(zzffyVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffyVar)).longValue();
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzffyVar)) {
            zze(zzffyVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbI(zzffy zzffyVar, String str) {
        this.zza.put(zzffyVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffyVar, String str) {
        if (this.zza.containsKey(zzffyVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffyVar)).longValue();
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzffyVar)) {
            zze(zzffyVar, true);
        }
    }
}
