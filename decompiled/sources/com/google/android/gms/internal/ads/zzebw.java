package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.games.GamesActivityResultCodes;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzebw {
    private final zzaxe zza;
    private final Context zzb;
    private final zzeba zzc;
    private final zzcag zzd;
    private final String zze;
    private final zzfgo zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzebw(Context context, zzcag zzcagVar, zzaxe zzaxeVar, zzeba zzebaVar, String str, zzfgo zzfgoVar) {
        this.zzb = context;
        this.zzd = zzcagVar;
        this.zza = zzaxeVar;
        this.zzc = zzebaVar;
        this.zze = str;
        this.zzf = zzfgoVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long jZze = 0;
        for (int i = 0; i < size; i++) {
            zzazn zzaznVar = (zzazn) arrayList.get(i);
            if (zzaznVar.zzw() == 2 && zzaznVar.zze() > jZze) {
                jZze = zzaznVar.zze();
            }
        }
        if (jZze != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jZze));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new zzffh() { // from class: com.google.android.gms.internal.ads.zzebs
                @Override // com.google.android.gms.internal.ads.zzffh
                public final Object zza(Object obj) throws Exception {
                    this.zza.zza(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            zzcaa.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
            zzfgn zzfgnVarZzb = zzfgn.zzb("oa_upload");
            zzfgnVarZzb.zza("oa_failed_reqs", String.valueOf(zzebp.zza(sQLiteDatabase, 0)));
            zzfgnVarZzb.zza("oa_total_reqs", String.valueOf(zzebp.zza(sQLiteDatabase, 1)));
            zzfgnVarZzb.zza("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzfgnVarZzb.zza("oa_last_successful_time", String.valueOf(zzebp.zzb(sQLiteDatabase, 2)));
            zzfgnVarZzb.zza("oa_session_id", this.zzg.zzQ() ? "" : this.zze);
            this.zzf.zzb(zzfgnVarZzb);
            ArrayList arrayListZzc = zzebp.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, arrayListZzc);
            int size = arrayListZzc.size();
            for (int i = 0; i < size; i++) {
                zzazn zzaznVar = (zzazn) arrayListZzc.get(i);
                zzfgn zzfgnVarZzb2 = zzfgn.zzb("oa_signals");
                zzfgnVarZzb2.zza("oa_session_id", this.zzg.zzQ() ? "" : this.zze);
                zzazi zzaziVarZzf = zzaznVar.zzf();
                String strValueOf = zzaziVarZzf.zzf() ? String.valueOf(zzaziVarZzf.zzh() - 1) : "-1";
                String string = zzfur.zzb(zzaznVar.zzk(), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzebv
                    @Override // com.google.android.gms.internal.ads.zzfqw
                    public final Object apply(Object obj) {
                        return ((zzayc) obj).name();
                    }
                }).toString();
                zzfgnVarZzb2.zza("oa_sig_ts", String.valueOf(zzaznVar.zze()));
                zzfgnVarZzb2.zza("oa_sig_status", String.valueOf(zzaznVar.zzw() - 1));
                zzfgnVarZzb2.zza("oa_sig_resp_lat", String.valueOf(zzaznVar.zzd()));
                zzfgnVarZzb2.zza("oa_sig_render_lat", String.valueOf(zzaznVar.zzc()));
                zzfgnVarZzb2.zza("oa_sig_formats", string);
                zzfgnVarZzb2.zza("oa_sig_nw_type", strValueOf);
                zzfgnVarZzb2.zza("oa_sig_wifi", String.valueOf(zzaznVar.zzx() - 1));
                zzfgnVarZzb2.zza("oa_sig_airplane", String.valueOf(zzaznVar.zzt() - 1));
                zzfgnVarZzb2.zza("oa_sig_data", String.valueOf(zzaznVar.zzu() - 1));
                zzfgnVarZzb2.zza("oa_sig_nw_resp", String.valueOf(zzaznVar.zza()));
                zzfgnVarZzb2.zza("oa_sig_offline", String.valueOf(zzaznVar.zzv() - 1));
                zzfgnVarZzb2.zza("oa_sig_nw_state", String.valueOf(zzaznVar.zzj().zza()));
                if (zzaziVarZzf.zze() && zzaziVarZzf.zzf() && zzaziVarZzf.zzh() == 2) {
                    zzfgnVarZzb2.zza("oa_sig_cell_type", String.valueOf(zzaziVarZzf.zzg() - 1));
                }
                this.zzf.zzb(zzfgnVarZzb2);
            }
        } else {
            ArrayList arrayListZzc2 = zzebp.zzc(sQLiteDatabase);
            zzazo zzazoVarZza = zzazs.zza();
            zzazoVarZza.zzb(this.zzb.getPackageName());
            zzazoVarZza.zzd(Build.MODEL);
            zzazoVarZza.zze(zzebp.zza(sQLiteDatabase, 0));
            zzazoVarZza.zza(arrayListZzc2);
            zzazoVarZza.zzg(zzebp.zza(sQLiteDatabase, 1));
            zzazoVarZza.zzc(zzebp.zza(sQLiteDatabase, 3));
            zzazoVarZza.zzh(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
            zzazoVarZza.zzf(zzebp.zzb(sQLiteDatabase, 2));
            final zzazs zzazsVar = (zzazs) zzazoVarZza.zzal();
            zzc(sQLiteDatabase, arrayListZzc2);
            this.zza.zzb(new zzaxd() { // from class: com.google.android.gms.internal.ads.zzebt
                @Override // com.google.android.gms.internal.ads.zzaxd
                public final void zza(zzayt zzaytVar) {
                    zzaytVar.zzi(zzazsVar);
                }
            });
            zzbad zzbadVarZza = zzbae.zza();
            zzbadVarZza.zza(this.zzd.zzb);
            zzbadVarZza.zzc(this.zzd.zzc);
            zzbadVarZza.zzb(true == this.zzd.zzd ? 0 : 2);
            final zzbae zzbaeVar = (zzbae) zzbadVarZza.zzal();
            this.zza.zzb(new zzaxd() { // from class: com.google.android.gms.internal.ads.zzebu
                @Override // com.google.android.gms.internal.ads.zzaxd
                public final void zza(zzayt zzaytVar) {
                    zzbae zzbaeVar2 = zzbaeVar;
                    zzayl zzaylVar = (zzayl) zzaytVar.zzb().zzaB();
                    zzaylVar.zzb(zzbaeVar2);
                    zzaytVar.zzg(zzaylVar);
                }
            });
            this.zza.zzc(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
        }
        zzebp.zzf(sQLiteDatabase);
        return null;
    }
}
