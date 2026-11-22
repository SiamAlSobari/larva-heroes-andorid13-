package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzij implements zzkp {
    private final zzlu zza;
    private final zzii zzb;
    private zzln zzc;
    private zzkp zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzij(zzii zziiVar, zzdz zzdzVar) {
        this.zzb = zziiVar;
        this.zza = new zzlu(zzdzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    public final long zzb(boolean z) {
        zzch zzchVarZzc;
        zzln zzlnVar = this.zzc;
        if (zzlnVar == null || zzlnVar.zzS() || (!this.zzc.zzT() && (z || this.zzc.zzM()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzkp zzkpVar = this.zzd;
            zzkpVar.getClass();
            long jZza = zzkpVar.zza();
            if (!this.zze) {
                this.zza.zzb(jZza);
                zzchVarZzc = zzkpVar.zzc();
                if (!zzchVarZzc.equals(this.zza.zzc())) {
                    this.zza.zzg(zzchVarZzc);
                    this.zzb.zza(zzchVarZzc);
                }
            } else if (jZza < this.zza.zza()) {
                this.zza.zze();
            } else {
                this.zze = false;
                if (this.zzf) {
                    this.zza.zzd();
                }
                this.zza.zzb(jZza);
                zzchVarZzc = zzkpVar.zzc();
                if (!zzchVarZzc.equals(this.zza.zzc())) {
                    this.zza.zzg(zzchVarZzc);
                    this.zzb.zza(zzchVarZzc);
                }
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzkp zzkpVar2 = this.zzd;
        zzkpVar2.getClass();
        return zzkpVar2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzch zzc() {
        zzkp zzkpVar = this.zzd;
        return zzkpVar != null ? zzkpVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzln zzlnVar) {
        if (zzlnVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzln zzlnVar) throws zzil {
        zzkp zzkpVar;
        zzkp zzkpVarZzk = zzlnVar.zzk();
        if (zzkpVarZzk == null || zzkpVarZzk == (zzkpVar = this.zzd)) {
            return;
        }
        if (zzkpVar != null) {
            throw zzil.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzkpVarZzk;
        this.zzc = zzlnVar;
        zzkpVarZzk.zzg(this.zza.zzc());
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzch zzchVar) {
        zzkp zzkpVar = this.zzd;
        if (zzkpVar != null) {
            zzkpVar.zzg(zzchVar);
            zzchVar = this.zzd.zzc();
        }
        this.zza.zzg(zzchVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
