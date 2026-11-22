package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzahl implements zzaca {
    final /* synthetic */ zzahm zza;

    /* synthetic */ zzahl(zzahm zzahmVar, zzahk zzahkVar) {
        this.zza = zzahmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        zzahm zzahmVar = this.zza;
        return zzahmVar.zzd.zzf(zzahmVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j) {
        zzahm zzahmVar = this.zza;
        long jZzg = zzahmVar.zzd.zzg(j);
        long j2 = zzahmVar.zzb;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jZzg);
        zzahm zzahmVar2 = this.zza;
        long jLongValue = j2 + bigIntegerValueOf.multiply(BigInteger.valueOf(zzahmVar2.zzc - zzahmVar2.zzb)).divide(BigInteger.valueOf(this.zza.zzf)).longValue();
        zzahm zzahmVar3 = this.zza;
        zzacb zzacbVar = new zzacb(j, Math.max(zzahmVar3.zzb, Math.min(jLongValue - 30000, zzahmVar3.zzc - 1)));
        return new zzaby(zzacbVar, zzacbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
