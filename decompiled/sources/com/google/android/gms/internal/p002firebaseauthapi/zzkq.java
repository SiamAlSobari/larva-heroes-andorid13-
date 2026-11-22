package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzkq extends zzlg {
    private final zzkn zza;
    private final zzkm zzb;
    private final zzkh zzc;
    private final zzko zzd;

    /* synthetic */ zzkq(zzkn zzknVar, zzkm zzkmVar, zzkh zzkhVar, zzko zzkoVar, zzkp zzkpVar) {
        this.zza = zzknVar;
        this.zzb = zzkmVar;
        this.zzc = zzkhVar;
        this.zzd = zzkoVar;
    }

    public static zzkl zzc() {
        return new zzkl(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkq)) {
            return false;
        }
        zzkq zzkqVar = (zzkq) obj;
        return this.zza == zzkqVar.zza && this.zzb == zzkqVar.zzb && this.zzc == zzkqVar.zzc && this.zzd == zzkqVar.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzkq.class, this.zza, this.zzb, this.zzc, this.zzd});
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        throw null;
    }

    public final zzkh zzb() {
        return this.zzc;
    }

    public final zzkm zzd() {
        return this.zzb;
    }

    public final zzkn zze() {
        return this.zza;
    }

    public final zzko zzf() {
        return this.zzd;
    }
}
