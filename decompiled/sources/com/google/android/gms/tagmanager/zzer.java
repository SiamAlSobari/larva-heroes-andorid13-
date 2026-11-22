package com.google.android.gms.tagmanager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzer {
    private final zzdr zza;
    private final com.google.android.gms.internal.gtm.zzam zzb;

    public zzer(zzdr zzdrVar, com.google.android.gms.internal.gtm.zzam zzamVar) {
        this.zza = zzdrVar;
        this.zzb = zzamVar;
    }

    public final int zza() {
        int iZzX = ((com.google.android.gms.internal.gtm.zzam) this.zza.zza()).zzX();
        com.google.android.gms.internal.gtm.zzam zzamVar = this.zzb;
        return iZzX + (zzamVar == null ? 0 : zzamVar.zzX());
    }

    public final com.google.android.gms.internal.gtm.zzam zzb() {
        return this.zzb;
    }

    public final zzdr zzc() {
        return this.zza;
    }
}
