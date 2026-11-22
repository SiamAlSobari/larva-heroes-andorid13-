package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzug implements zztq, zztp {
    private final zztq zza;
    private final long zzb;
    private zztp zzc;

    public zzug(zztq zztqVar, long j) {
        this.zza = zztqVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zza(long j, zzlr zzlrVar) {
        return this.zza.zza(j - this.zzb, zzlrVar) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        long jZzd = this.zza.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zze(long j) {
        return this.zza.zze(j - this.zzb) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzf(zzxf[] zzxfVarArr, boolean[] zArr, zzvj[] zzvjVarArr, boolean[] zArr2, long j) {
        zzvj[] zzvjVarArr2 = new zzvj[zzvjVarArr.length];
        int i = 0;
        while (true) {
            zzvj zzvjVarZzc = null;
            if (i >= zzvjVarArr.length) {
                break;
            }
            zzuh zzuhVar = (zzuh) zzvjVarArr[i];
            if (zzuhVar != null) {
                zzvjVarZzc = zzuhVar.zzc();
            }
            zzvjVarArr2[i] = zzvjVarZzc;
            i++;
        }
        long jZzf = this.zza.zzf(zzxfVarArr, zArr, zzvjVarArr2, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zzvjVarArr.length; i2++) {
            zzvj zzvjVar = zzvjVarArr2[i2];
            if (zzvjVar == null) {
                zzvjVarArr[i2] = null;
            } else {
                zzvj zzvjVar2 = zzvjVarArr[i2];
                if (zzvjVar2 == null || ((zzuh) zzvjVar2).zzc() != zzvjVar) {
                    zzvjVarArr[i2] = new zzuh(zzvjVar, this.zzb);
                }
            }
        }
        return jZzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final /* bridge */ /* synthetic */ void zzg(zzvl zzvlVar) {
        zztp zztpVar = this.zzc;
        zztpVar.getClass();
        zztpVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final zzvs zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztpVar, long j) {
        this.zzc = zztpVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzo(long j) {
        return this.zza.zzo(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzi(zztq zztqVar) {
        zztp zztpVar = this.zzc;
        zztpVar.getClass();
        zztpVar.zzi(this);
    }
}
