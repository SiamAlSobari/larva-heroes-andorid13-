package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzebq implements zzfgf {
    private final zzebe zza;
    private final zzebi zzb;

    zzebq(zzebe zzebeVar, zzebi zzebiVar) {
        this.zza = zzebeVar;
        this.zzb = zzebiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbH(zzffy zzffyVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgb)).booleanValue() && zzffy.RENDERER == zzffyVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbI(zzffy zzffyVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgb)).booleanValue()) {
            if (zzffy.RENDERER == zzffyVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
                return;
            }
            if (zzffy.PRELOADED_LOADER == zzffyVar || zzffy.SERVER_TRANSACTION == zzffyVar) {
                this.zza.zzh(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
                final zzebi zzebiVar = this.zzb;
                final long jZzd = this.zza.zzd();
                zzebiVar.zza.zza(new zzffh() { // from class: com.google.android.gms.internal.ads.zzebh
                    @Override // com.google.android.gms.internal.ads.zzffh
                    public final Object zza(Object obj) {
                        zzebi zzebiVar2 = zzebiVar;
                        long j = jZzd;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzebiVar2.zzf()) {
                            return null;
                        }
                        zzazm zzazmVarZzg = zzazn.zzg();
                        zzazmVarZzg.zzh(j);
                        byte[] bArrZzax = ((zzazn) zzazmVarZzg.zzal()).zzax();
                        zzebp.zzg(sQLiteDatabase, false, false);
                        zzebp.zzd(sQLiteDatabase, j, bArrZzax);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffyVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgb)).booleanValue() && zzffy.RENDERER == zzffyVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }
}
