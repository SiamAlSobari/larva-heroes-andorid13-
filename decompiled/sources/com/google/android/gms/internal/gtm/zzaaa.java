package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaaa extends zzzy {
    zzaaa() {
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* synthetic */ int zza(Object obj) {
        return ((zzzz) obj).zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* synthetic */ int zzb(Object obj) {
        return ((zzzz) obj).zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzxj zzxjVar = (zzxj) obj;
        zzzz zzzzVar = zzxjVar.zzc;
        if (zzzzVar != zzzz.zzc()) {
            return zzzzVar;
        }
        zzzz zzzzVarZzf = zzzz.zzf();
        zzxjVar.zzc = zzzzVarZzf;
        return zzzzVarZzf;
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* synthetic */ Object zzd(Object obj) {
        return ((zzxj) obj).zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zzzz.zzc().equals(obj2)) {
            return obj;
        }
        if (zzzz.zzc().equals(obj)) {
            return zzzz.zze((zzzz) obj, (zzzz) obj2);
        }
        ((zzzz) obj).zzd((zzzz) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* synthetic */ Object zzf() {
        return zzzz.zzf();
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* synthetic */ Object zzg(Object obj) {
        ((zzzz) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzzz) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzzz) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzzz) obj).zzj((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzud zzudVar) {
        ((zzzz) obj).zzj((i << 3) | 2, zzudVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzzz) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final void zzm(Object obj) {
        ((zzxj) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzxj) obj).zzc = (zzzz) obj2;
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzxj) obj).zzc = (zzzz) obj2;
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final boolean zzq(zzzg zzzgVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* synthetic */ void zzr(Object obj, zzur zzurVar) throws IOException {
        ((zzzz) obj).zzk(zzurVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzy
    final /* synthetic */ void zzs(Object obj, zzur zzurVar) throws IOException {
        ((zzzz) obj).zzl(zzurVar);
    }
}
