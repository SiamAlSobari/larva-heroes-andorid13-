package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzva extends zzst implements zzur {
    private final zzgh zza;
    private final zzqz zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzhk zzh;
    private zzbp zzi;
    private final zzux zzj;
    private final zzxy zzk;

    /* synthetic */ zzva(zzbp zzbpVar, zzgh zzghVar, zzux zzuxVar, zzqz zzqzVar, zzxy zzxyVar, int i, zzuz zzuzVar) {
        this.zzi = zzbpVar;
        this.zza = zzghVar;
        this.zzj = zzuxVar;
        this.zzb = zzqzVar;
        this.zzk = zzxyVar;
        this.zzc = i;
    }

    private final void zzw() {
        long j = this.zze;
        boolean z = this.zzf;
        boolean z2 = this.zzg;
        zzbp zzbpVarZzJ = zzJ();
        zzvn zzvnVar = new zzvn(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzbpVarZzJ, z2 ? zzbpVarZzJ.zzf : null);
        zzo(this.zzd ? new zzuw(this, zzvnVar) : zzvnVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzG(zztq zztqVar) {
        ((zzuv) zztqVar).zzM();
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final zztq zzI(zzts zztsVar, zzxu zzxuVar, long j) {
        zzgi zzgiVarZza = this.zza.zza();
        zzhk zzhkVar = this.zzh;
        if (zzhkVar != null) {
            zzgiVarZza.zzf(zzhkVar);
        }
        zzbi zzbiVar = zzJ().zzd;
        zzbiVar.getClass();
        Uri uri = zzbiVar.zzb;
        zzux zzuxVar = this.zzj;
        zzb();
        return new zzuv(uri, zzgiVarZza, new zzsv(zzuxVar.zza), this.zzb, zzc(zztsVar), this.zzk, zze(zztsVar), this, zzxuVar, null, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final synchronized zzbp zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zze;
        }
        if (!this.zzd && this.zze == j && this.zzf == z && this.zzg == z2) {
            return;
        }
        this.zze = j;
        this.zzf = z;
        this.zzg = z2;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzst
    protected final void zzn(zzhk zzhkVar) {
        this.zzh = zzhkVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzst
    protected final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzst, com.google.android.gms.internal.ads.zztu
    public final synchronized void zzt(zzbp zzbpVar) {
        this.zzi = zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzz() {
    }
}
