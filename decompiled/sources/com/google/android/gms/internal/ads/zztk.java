package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztk implements zztq, zztp {
    public final zzts zza;
    private final long zzb;
    private zztu zzc;
    private zztq zzd;
    private zztp zze;
    private long zzf = -9223372036854775807L;
    private final zzxu zzg;

    public zztk(zzts zztsVar, zzxu zzxuVar, long j) {
        this.zza = zztsVar;
        this.zzg = zzxuVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zza(long j, zzlr zzlrVar) {
        zztq zztqVar = this.zzd;
        int i = zzfk.zza;
        return zztqVar.zza(j, zzlrVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        zztq zztqVar = this.zzd;
        int i = zzfk.zza;
        return zztqVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzc() {
        zztq zztqVar = this.zzd;
        int i = zzfk.zza;
        return zztqVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        zztq zztqVar = this.zzd;
        int i = zzfk.zza;
        return zztqVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zze(long j) {
        zztq zztqVar = this.zzd;
        int i = zzfk.zza;
        return zztqVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzf(zzxf[] zzxfVarArr, boolean[] zArr, zzvj[] zzvjVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.zzf;
        if (j3 == -9223372036854775807L || j != this.zzb) {
            j2 = j;
        } else {
            this.zzf = -9223372036854775807L;
            j2 = j3;
        }
        zztq zztqVar = this.zzd;
        int i = zzfk.zza;
        return zztqVar.zzf(zzxfVarArr, zArr, zzvjVarArr, zArr2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final /* bridge */ /* synthetic */ void zzg(zzvl zzvlVar) {
        zztp zztpVar = this.zze;
        int i = zzfk.zza;
        zztpVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final zzvs zzh() {
        zztq zztqVar = this.zzd;
        int i = zzfk.zza;
        return zztqVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzi(zztq zztqVar) {
        zztp zztpVar = this.zze;
        int i = zzfk.zza;
        zztpVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzj(long j, boolean z) {
        zztq zztqVar = this.zzd;
        int i = zzfk.zza;
        zztqVar.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzk() throws IOException {
        zztq zztqVar = this.zzd;
        if (zztqVar != null) {
            zztqVar.zzk();
            return;
        }
        zztu zztuVar = this.zzc;
        if (zztuVar != null) {
            zztuVar.zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztpVar, long j) {
        this.zze = zztpVar;
        zztq zztqVar = this.zzd;
        if (zztqVar != null) {
            zztqVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final void zzm(long j) {
        zztq zztqVar = this.zzd;
        int i = zzfk.zza;
        zztqVar.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzo(long j) {
        zztq zztqVar = this.zzd;
        return zztqVar != null && zztqVar.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzp() {
        zztq zztqVar = this.zzd;
        return zztqVar != null && zztqVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzts zztsVar) {
        long jZzv = zzv(this.zzb);
        zztu zztuVar = this.zzc;
        zztuVar.getClass();
        zztq zztqVarZzI = zztuVar.zzI(zztsVar, this.zzg, jZzv);
        this.zzd = zztqVarZzI;
        if (this.zze != null) {
            zztqVarZzI.zzl(this, jZzv);
        }
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzu(zztu zztuVar) {
        zzdy.zzf(this.zzc == null);
        this.zzc = zztuVar;
    }

    public final void zzt() {
        zztq zztqVar = this.zzd;
        if (zztqVar != null) {
            zztu zztuVar = this.zzc;
            zztuVar.getClass();
            zztuVar.zzG(zztqVar);
        }
    }
}
