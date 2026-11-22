package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgum extends zzguk {
    zzgum() {
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* synthetic */ int zza(Object obj) {
        return ((zzgul) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* synthetic */ int zzb(Object obj) {
        return ((zzgul) obj).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzgrq zzgrqVar = (zzgrq) obj;
        zzgul zzgulVar = zzgrqVar.zzc;
        if (zzgulVar != zzgul.zzc()) {
            return zzgulVar;
        }
        zzgul zzgulVarZzf = zzgul.zzf();
        zzgrqVar.zzc = zzgulVarZzf;
        return zzgulVarZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* synthetic */ Object zzd(Object obj) {
        return ((zzgrq) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zzgul.zzc().equals(obj2)) {
            return obj;
        }
        if (zzgul.zzc().equals(obj)) {
            return zzgul.zze((zzgul) obj, (zzgul) obj2);
        }
        ((zzgul) obj).zzd((zzgul) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* synthetic */ Object zzf() {
        return zzgul.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* synthetic */ Object zzg(Object obj) {
        ((zzgul) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzgul) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzgul) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzgul) obj).zzj((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzgqi zzgqiVar) {
        ((zzgul) obj).zzj((i << 3) | 2, zzgqiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzgul) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final void zzm(Object obj) {
        ((zzgrq) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzgrq) obj).zzc = (zzgul) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzgrq) obj).zzc = (zzgul) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final boolean zzq(zzgtl zzgtlVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    final /* synthetic */ void zzr(Object obj, zzgqy zzgqyVar) throws IOException {
        ((zzgul) obj).zzk(zzgqyVar);
    }
}
