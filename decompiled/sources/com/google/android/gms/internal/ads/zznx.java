package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zznx {
    private final zzct zza;
    private zzfud zzb = zzfud.zzl();
    private zzfug zzc = zzfug.zzd();
    private zzts zzd;
    private zzts zze;
    private zzts zzf;

    public zznx(zzct zzctVar) {
        this.zza = zzctVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzts zzj(zzcp zzcpVar, zzfud zzfudVar, zzts zztsVar, zzct zzctVar) {
        zzcw zzcwVarZzn = zzcpVar.zzn();
        int iZze = zzcpVar.zze();
        Object objZzf = zzcwVarZzn.zzo() ? null : zzcwVarZzn.zzf(iZze);
        int iZzc = (zzcpVar.zzx() || zzcwVarZzn.zzo()) ? -1 : zzcwVarZzn.zzd(iZze, zzctVar, false).zzc(zzfk.zzp(zzcpVar.zzk()));
        for (int i = 0; i < zzfudVar.size(); i++) {
            zzts zztsVar2 = (zzts) zzfudVar.get(i);
            if (zzm(zztsVar2, objZzf, zzcpVar.zzx(), zzcpVar.zzb(), zzcpVar.zzc(), iZzc)) {
                return zztsVar2;
            }
        }
        if (zzfudVar.isEmpty() && zztsVar != null) {
            if (zzm(zztsVar, objZzf, zzcpVar.zzx(), zzcpVar.zzb(), zzcpVar.zzc(), iZzc)) {
                return zztsVar;
            }
        }
        return null;
    }

    private final void zzk(zzfuf zzfufVar, zzts zztsVar, zzcw zzcwVar) {
        if (zztsVar == null) {
            return;
        }
        if (zzcwVar.zza(zztsVar.zza) != -1) {
            zzfufVar.zza(zztsVar, zzcwVar);
            return;
        }
        zzcw zzcwVar2 = (zzcw) this.zzc.get(zztsVar);
        if (zzcwVar2 != null) {
            zzfufVar.zza(zztsVar, zzcwVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzl(zzcw zzcwVar) {
        zzfuf zzfufVar = new zzfuf();
        if (this.zzb.isEmpty()) {
            zzk(zzfufVar, this.zze, zzcwVar);
            if (!zzfrd.zza(this.zzf, this.zze)) {
                zzk(zzfufVar, this.zzf, zzcwVar);
            }
            if (!zzfrd.zza(this.zzd, this.zze) && !zzfrd.zza(this.zzd, this.zzf)) {
                zzk(zzfufVar, this.zzd, zzcwVar);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzfufVar, (zzts) this.zzb.get(i), zzcwVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfufVar, this.zzd, zzcwVar);
            }
        }
        this.zzc = zzfufVar.zzc();
    }

    private static boolean zzm(zzts zztsVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!zztsVar.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (zztsVar.zzb != i || zztsVar.zzc != i2) {
                return false;
            }
        } else if (zztsVar.zzb != -1 || zztsVar.zze != i3) {
            return false;
        }
        return true;
    }

    public final zzcw zza(zzts zztsVar) {
        return (zzcw) this.zzc.get(zztsVar);
    }

    public final zzts zzb() {
        return this.zzd;
    }

    public final zzts zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfud zzfudVar = this.zzb;
        if (!(zzfudVar instanceof List)) {
            Iterator<E> it = zzfudVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzfudVar.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = zzfudVar.get(zzfudVar.size() - 1);
        }
        return (zzts) obj;
    }

    public final zzts zzd() {
        return this.zze;
    }

    public final zzts zze() {
        return this.zzf;
    }

    public final void zzg(zzcp zzcpVar) {
        this.zzd = zzj(zzcpVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzts zztsVar, zzcp zzcpVar) {
        this.zzb = zzfud.zzj(list);
        if (!list.isEmpty()) {
            this.zze = (zzts) list.get(0);
            zztsVar.getClass();
            this.zzf = zztsVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcpVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzcpVar.zzn());
    }

    public final void zzi(zzcp zzcpVar) {
        this.zzd = zzj(zzcpVar, this.zzb, this.zze, this.zza);
        zzl(zzcpVar.zzn());
    }
}
