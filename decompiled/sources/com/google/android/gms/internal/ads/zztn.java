package com.google.android.gms.internal.ads;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztn extends zzvu {
    private final boolean zzb;
    private final zzcv zzc;
    private final zzct zzd;
    private zztl zze;
    private zztk zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zztn(zztu zztuVar, boolean z) {
        boolean z2;
        super(zztuVar);
        if (z) {
            zztuVar.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzcv();
        this.zzd = new zzct();
        zztuVar.zzM();
        this.zze = zztl.zzq(zztuVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zzf == null || !obj.equals(zztl.zzd)) ? obj : this.zze.zzf;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzL(long j) {
        zztk zztkVar = this.zzf;
        int iZza = this.zze.zza(zztkVar.zza.zza);
        if (iZza == -1) {
            return;
        }
        zztl zztlVar = this.zze;
        zzct zzctVar = this.zzd;
        zztlVar.zzd(iZza, zzctVar, false);
        long j2 = zzctVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zztkVar.zzs(j);
    }

    public final zzcw zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    protected final zzts zzD(zzts zztsVar) {
        Object obj = zztsVar.zza;
        if (this.zze.zzf != null && this.zze.zzf.equals(obj)) {
            obj = zztl.zzd;
        }
        return zztsVar.zzc(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.zzvu
    protected final void zzE(zzcw zzcwVar) {
        long j;
        zzts zztsVarZzc = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzcwVar);
            zztk zztkVar = this.zzf;
            if (zztkVar != null) {
                zzL(zztkVar.zzn());
            }
        } else if (zzcwVar.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzcwVar) : zztl.zzr(zzcwVar, zzcv.zza, zztl.zzd);
        } else {
            zzcwVar.zze(0, this.zzc, 0L);
            Object obj = this.zzc.zzc;
            zztk zztkVar2 = this.zzf;
            if (zztkVar2 != null) {
                long jZzq = zztkVar2.zzq();
                this.zze.zzn(zztkVar2.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                if (jZzq != 0) {
                    j = jZzq;
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            Pair pairZzl = zzcwVar.zzl(this.zzc, this.zzd, 0, j);
            Object obj2 = pairZzl.first;
            long jLongValue = ((Long) pairZzl.second).longValue();
            this.zze = this.zzi ? this.zze.zzp(zzcwVar) : zztl.zzr(zzcwVar, obj, obj2);
            zztk zztkVar3 = this.zzf;
            if (zztkVar3 != null) {
                zzL(jLongValue);
                zzts zztsVar = zztkVar3.zza;
                zztsVarZzc = zztsVar.zzc(zzK(zztsVar.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zztsVarZzc != null) {
            zztk zztkVar4 = this.zzf;
            zztkVar4.getClass();
            zztkVar4.zzr(zztsVarZzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void zzF() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzB(null, ((zzvu) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zztu
    public final void zzG(zztq zztqVar) {
        ((zztk) zztqVar).zzt();
        if (zztqVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zztu
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zztk zzI(zzts zztsVar, zzxu zzxuVar, long j) {
        zztk zztkVar = new zztk(zztsVar, zzxuVar, j);
        zztkVar.zzu(this.zza);
        if (this.zzh) {
            zztkVar.zzr(zztsVar.zzc(zzK(zztsVar.zza)));
        } else {
            this.zzf = zztkVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzvu) this).zza);
            }
        }
        return zztkVar;
    }

    @Override // com.google.android.gms.internal.ads.zztb, com.google.android.gms.internal.ads.zzst
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzst, com.google.android.gms.internal.ads.zztu
    public final void zzt(zzbp zzbpVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzvq(this.zze.zzc, zzbpVar));
        } else {
            this.zze = zztl.zzq(zzbpVar);
        }
        this.zza.zzt(zzbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zztb, com.google.android.gms.internal.ads.zztu
    public final void zzz() {
    }
}
