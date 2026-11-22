package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsz implements zzuc, zzqu {
    final /* synthetic */ zztb zza;
    private final Object zzb;
    private zzub zzc;
    private zzqt zzd;

    public zzsz(zztb zztbVar, Object obj) {
        this.zza = zztbVar;
        this.zzc = zztbVar.zze(null);
        this.zzd = zztbVar.zzc(null);
        this.zzb = obj;
    }

    private final zzto zzf(zzto zztoVar) {
        zztb zztbVar = this.zza;
        Object obj = this.zzb;
        long j = zztoVar.zzc;
        zztbVar.zzx(obj, j);
        zztb zztbVar2 = this.zza;
        Object obj2 = this.zzb;
        long j2 = zztoVar.zzd;
        zztbVar2.zzx(obj2, j2);
        return (j == zztoVar.zzc && j2 == zztoVar.zzd) ? zztoVar : new zzto(1, zztoVar.zza, zztoVar.zzb, 0, null, j, j2);
    }

    private final boolean zzg(int i, zzts zztsVar) {
        zzts zztsVarZzy;
        if (zztsVar != null) {
            zztsVarZzy = this.zza.zzy(this.zzb, zztsVar);
            if (zztsVarZzy == null) {
                return false;
            }
        } else {
            zztsVarZzy = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzub zzubVar = this.zzc;
        int i2 = zzubVar.zza;
        if (!zzfk.zzD(zzubVar.zzb, zztsVarZzy)) {
            this.zzc = this.zza.zzf(0, zztsVarZzy);
        }
        zzqt zzqtVar = this.zzd;
        int i3 = zzqtVar.zza;
        if (zzfk.zzD(zzqtVar.zzb, zztsVarZzy)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zztsVarZzy);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzac(int i, zzts zztsVar, zzto zztoVar) {
        if (zzg(0, zztsVar)) {
            this.zzc.zzc(zzf(zztoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzad(int i, zzts zztsVar, zztj zztjVar, zzto zztoVar) {
        if (zzg(0, zztsVar)) {
            this.zzc.zzd(zztjVar, zzf(zztoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzae(int i, zzts zztsVar, zztj zztjVar, zzto zztoVar) {
        if (zzg(0, zztsVar)) {
            this.zzc.zze(zztjVar, zzf(zztoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzaf(int i, zzts zztsVar, zztj zztjVar, zzto zztoVar, IOException iOException, boolean z) {
        if (zzg(0, zztsVar)) {
            this.zzc.zzf(zztjVar, zzf(zztoVar), iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzag(int i, zzts zztsVar, zztj zztjVar, zzto zztoVar) {
        if (zzg(0, zztsVar)) {
            this.zzc.zzg(zztjVar, zzf(zztoVar));
        }
    }
}
