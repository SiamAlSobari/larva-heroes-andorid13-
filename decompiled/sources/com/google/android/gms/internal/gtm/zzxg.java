package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzxg implements zzwx {
    final zzxm zza;
    final int zzb;
    final zzaao zzc;
    final boolean zzd;

    zzxg(zzxm zzxmVar, int i, zzaao zzaaoVar, boolean z, boolean z2) {
        this.zza = zzxmVar;
        this.zzb = i;
        this.zzc = zzaaoVar;
        this.zzd = z;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zzb - ((zzxg) obj).zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final zzyt zzb(zzyt zzytVar, zzyu zzyuVar) {
        ((zzxd) zzytVar).zzA((zzxj) zzyuVar);
        return zzytVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final zzyz zzc(zzyz zzyzVar, zzyz zzyzVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final zzaao zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final zzaap zze() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final boolean zzg() {
        return this.zzd;
    }
}
