package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzlf {
    private final zzoh zza;
    private final zzle zze;
    private final zzlx zzh;
    private final zzej zzi;
    private boolean zzj;
    private zzhk zzk;
    private zzvm zzl = new zzvm(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzlf(zzle zzleVar, zzlx zzlxVar, zzej zzejVar, zzoh zzohVar) {
        this.zza = zzohVar;
        this.zze = zzleVar;
        this.zzh = zzlxVar;
        this.zzi = zzejVar;
    }

    private final void zzr(int i, int i2) {
        while (i < this.zzb.size()) {
            ((zzld) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzs(zzld zzldVar) {
        zzlc zzlcVar = (zzlc) this.zzf.get(zzldVar);
        if (zzlcVar != null) {
            zzlcVar.zza.zzi(zzlcVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzld zzldVar = (zzld) it.next();
            if (zzldVar.zzc.isEmpty()) {
                zzs(zzldVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzld zzldVar) {
        if (zzldVar.zze && zzldVar.zzc.isEmpty()) {
            zzlc zzlcVar = (zzlc) this.zzf.remove(zzldVar);
            zzlcVar.getClass();
            zzlcVar.zza.zzp(zzlcVar.zzb);
            zzlcVar.zza.zzs(zzlcVar.zzc);
            zzlcVar.zza.zzr(zzlcVar.zzc);
            this.zzg.remove(zzldVar);
        }
    }

    private final void zzv(zzld zzldVar) {
        zztn zztnVar = zzldVar.zza;
        zztt zzttVar = new zztt() { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // com.google.android.gms.internal.ads.zztt
            public final void zza(zztu zztuVar, zzcw zzcwVar) {
                this.zza.zzf(zztuVar, zzcwVar);
            }
        };
        zzlb zzlbVar = new zzlb(this, zzldVar);
        this.zzf.put(zzldVar, new zzlc(zztnVar, zzttVar, zzlbVar));
        zztnVar.zzh(new Handler(zzfk.zzv(), null), zzlbVar);
        zztnVar.zzg(new Handler(zzfk.zzv(), null), zzlbVar);
        zztnVar.zzm(zzttVar, this.zzk, this.zza);
    }

    private final void zzw(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            zzld zzldVar = (zzld) this.zzb.remove(i2);
            this.zzd.remove(zzldVar.zzb);
            zzr(i2, -zzldVar.zza.zzC().zzc());
            zzldVar.zze = true;
            if (this.zzj) {
                zzu(zzldVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzcw zzb() {
        if (this.zzb.isEmpty()) {
            return zzcw.zza;
        }
        int iZzc = 0;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzld zzldVar = (zzld) this.zzb.get(i);
            zzldVar.zzd = iZzc;
            iZzc += zzldVar.zza.zzC().zzc();
        }
        return new zzll(this.zzb, this.zzl);
    }

    public final zzcw zzc(int i, int i2, List list) {
        zzdy.zzd(i >= 0 && i <= i2 && i2 <= zza());
        zzdy.zzd(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((zzld) this.zzb.get(i3)).zza.zzt((zzbp) list.get(i3 - i));
        }
        return zzb();
    }

    final /* synthetic */ void zzf(zztu zztuVar, zzcw zzcwVar) {
        this.zze.zzh();
    }

    public final void zzg(zzhk zzhkVar) {
        zzdy.zzf(!this.zzj);
        this.zzk = zzhkVar;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzld zzldVar = (zzld) this.zzb.get(i);
            zzv(zzldVar);
            this.zzg.add(zzldVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzlc zzlcVar : this.zzf.values()) {
            try {
                zzlcVar.zza.zzp(zzlcVar.zzb);
            } catch (RuntimeException e) {
                zzes.zzd("MediaSourceList", "Failed to release child source.", e);
            }
            zzlcVar.zza.zzs(zzlcVar.zzc);
            zzlcVar.zza.zzr(zzlcVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zztq zztqVar) {
        zzld zzldVar = (zzld) this.zzc.remove(zztqVar);
        zzldVar.getClass();
        zzldVar.zza.zzG(zztqVar);
        zzldVar.zzc.remove(((zztk) zztqVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzldVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzcw zzk(int i, List list, zzvm zzvmVar) {
        if (!list.isEmpty()) {
            this.zzl = zzvmVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzld zzldVar = (zzld) list.get(i2 - i);
                if (i2 > 0) {
                    zzld zzldVar2 = (zzld) this.zzb.get(i2 - 1);
                    zzldVar.zzc(zzldVar2.zzd + zzldVar2.zza.zzC().zzc());
                } else {
                    zzldVar.zzc(0);
                }
                zzr(i2, zzldVar.zza.zzC().zzc());
                this.zzb.add(i2, zzldVar);
                this.zzd.put(zzldVar.zzb, zzldVar);
                if (this.zzj) {
                    zzv(zzldVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzldVar);
                    } else {
                        zzs(zzldVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzcw zzl(int i, int i2, int i3, zzvm zzvmVar) {
        zzdy.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzcw zzm(int i, int i2, zzvm zzvmVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzdy.zzd(z);
        this.zzl = zzvmVar;
        zzw(i, i2);
        return zzb();
    }

    public final zzcw zzn(List list, zzvm zzvmVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzvmVar);
    }

    public final zzcw zzo(zzvm zzvmVar) {
        int iZza = zza();
        if (zzvmVar.zzc() != iZza) {
            zzvmVar = zzvmVar.zzf().zzg(0, iZza);
        }
        this.zzl = zzvmVar;
        return zzb();
    }

    public final zztq zzp(zzts zztsVar, zzxu zzxuVar, long j) {
        Object obj = zztsVar.zza;
        int i = zzll.zzc;
        Object obj2 = ((Pair) obj).first;
        zzts zztsVarZzc = zztsVar.zzc(((Pair) zztsVar.zza).second);
        zzld zzldVar = (zzld) this.zzd.get(obj2);
        zzldVar.getClass();
        this.zzg.add(zzldVar);
        zzlc zzlcVar = (zzlc) this.zzf.get(zzldVar);
        if (zzlcVar != null) {
            zzlcVar.zza.zzk(zzlcVar.zzb);
        }
        zzldVar.zzc.add(zztsVarZzc);
        zztk zztkVarZzH = zzldVar.zza.zzI(zztsVarZzc, zzxuVar, j);
        this.zzc.put(zztkVarZzH, zzldVar);
        zzt();
        return zztkVarZzH;
    }

    public final zzvm zzq() {
        return this.zzl;
    }
}
