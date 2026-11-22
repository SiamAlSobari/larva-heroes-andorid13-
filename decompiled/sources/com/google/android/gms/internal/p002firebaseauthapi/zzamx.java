package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzamx extends zzamv {
    zzamx() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* synthetic */ int zza(Object obj) {
        return ((zzamw) obj).zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* synthetic */ int zzb(Object obj) {
        return ((zzamw) obj).zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzakk zzakkVar = (zzakk) obj;
        zzamw zzamwVar = zzakkVar.zzc;
        if (zzamwVar != zzamw.zzc()) {
            return zzamwVar;
        }
        zzamw zzamwVarZzf = zzamw.zzf();
        zzakkVar.zzc = zzamwVarZzf;
        return zzamwVarZzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* synthetic */ Object zzd(Object obj) {
        return ((zzakk) obj).zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zzamw.zzc().equals(obj2)) {
            return obj;
        }
        if (zzamw.zzc().equals(obj)) {
            return zzamw.zze((zzamw) obj, (zzamw) obj2);
        }
        ((zzamw) obj).zzd((zzamw) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* synthetic */ Object zzf() {
        return zzamw.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* synthetic */ Object zzg(Object obj) {
        ((zzamw) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzamw) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzamw) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzamw) obj).zzj((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzajf zzajfVar) {
        ((zzamw) obj).zzj((i << 3) | 2, zzajfVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzamw) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final void zzm(Object obj) {
        ((zzakk) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzakk) obj).zzc = (zzamw) obj2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzakk) obj).zzc = (zzamw) obj2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final boolean zzq(zzama zzamaVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    final /* synthetic */ void zzr(Object obj, zzajt zzajtVar) throws IOException {
        ((zzamw) obj).zzk(zzajtVar);
    }
}
