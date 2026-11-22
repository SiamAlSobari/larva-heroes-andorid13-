package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zzw {
    final /* synthetic */ zzaa zza;
    private com.google.android.gms.internal.measurement.zzfs zzb;
    private Long zzc;
    private long zzd;

    /* synthetic */ zzw(zzaa zzaaVar, zzv zzvVar) {
        this.zza = zzaaVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x0090 A[Catch: SQLiteException -> 0x00df, all -> 0x01d9, TryCatch #4 {all -> 0x01d9, blocks: (B:18:0x008a, B:20:0x0090, B:23:0x00a2, B:24:0x00ae, B:25:0x00be, B:29:0x00c9, B:38:0x00e7), top: B:85:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a2 A[Catch: SQLiteException -> 0x00df, all -> 0x01d9, TRY_LEAVE, TryCatch #4 {all -> 0x01d9, blocks: (B:18:0x008a, B:20:0x0090, B:23:0x00a2, B:24:0x00ae, B:25:0x00be, B:29:0x00c9, B:38:0x00e7), top: B:85:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x01dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v9, types: [long] */
    final com.google.android.gms.internal.measurement.zzfs zza(String str, com.google.android.gms.internal.measurement.zzfs zzfsVar) {
        zzam zzamVarZzi;
        SQLiteException e;
        Cursor cursorRawQuery;
        Pair pairCreate;
        ?? LongValue;
        String strZzh = zzfsVar.zzh();
        List listZzi = zzfsVar.zzi();
        this.zza.zzf.zzu();
        Long l = (Long) zzlb.zzC(zzfsVar, "_eid");
        if (l != null) {
            if (strZzh.equals("_ep")) {
                Preconditions.checkNotNull(l);
                this.zza.zzf.zzu();
                strZzh = (String) zzlb.zzC(zzfsVar, "_en");
                ?? r7 = 0;
                if (TextUtils.isEmpty(strZzh)) {
                    this.zza.zzs.zzay().zzh().zzb("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.zzb == null || this.zzc == null) {
                    zzamVarZzi = this.zza.zzf.zzi();
                    zzamVarZzi.zzg();
                    zzamVarZzi.zzW();
                    try {
                        try {
                            cursorRawQuery = zzamVarZzi.zzh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzfs) ((com.google.android.gms.internal.measurement.zzfr) zzlb.zzl(com.google.android.gms.internal.measurement.zzfs.zze(), cursorRawQuery.getBlob(0))).zzaE(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                    } catch (IOException e2) {
                                        zzamVarZzi.zzs.zzay().zzd().zzd("Failed to merge main event. appId, eventId", zzeo.zzn(str), l, e2);
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        pairCreate = null;
                                    }
                                } else {
                                    zzamVarZzi.zzs.zzay().zzj().zza("Main event not found");
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    pairCreate = null;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                zzamVarZzi.zzs.zzay().zzd().zzb("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.zza.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r7 = LongValue;
                            if (r7 != 0) {
                                r7.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r7 != 0) {
                            r7.close();
                        }
                        throw th;
                    }
                    if (pairCreate != null || pairCreate.first == null) {
                        this.zza.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l);
                        return null;
                    }
                    this.zzb = (com.google.android.gms.internal.measurement.zzfs) pairCreate.first;
                    this.zzd = ((Long) pairCreate.second).longValue();
                    this.zza.zzf.zzu();
                    this.zzc = (Long) zzlb.zzC(this.zzb, "_eid");
                } else {
                    LongValue = l.longValue();
                    if (LongValue != this.zzc.longValue()) {
                        zzamVarZzi = this.zza.zzf.zzi();
                        zzamVarZzi.zzg();
                        zzamVarZzi.zzW();
                        cursorRawQuery = zzamVarZzi.zzh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        if (cursorRawQuery.moveToFirst()) {
                            zzamVarZzi.zzs.zzay().zzj().zza("Main event not found");
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            pairCreate = null;
                        } else {
                            pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzfs) ((com.google.android.gms.internal.measurement.zzfr) zzlb.zzl(com.google.android.gms.internal.measurement.zzfs.zze(), cursorRawQuery.getBlob(0))).zzaE(), Long.valueOf(cursorRawQuery.getLong(1)));
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                        }
                        if (pairCreate != null) {
                        }
                        this.zza.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l);
                        return null;
                    }
                }
                long j = this.zzd - 1;
                this.zzd = j;
                if (j <= 0) {
                    zzam zzamVarZzi2 = this.zza.zzf.zzi();
                    zzamVarZzi2.zzg();
                    zzamVarZzi2.zzs.zzay().zzj().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzamVarZzi2.zzh().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e5) {
                        zzamVarZzi2.zzs.zzay().zzd().zzb("Error clearing complex main event", e5);
                    }
                } else {
                    this.zza.zzf.zzi().zzJ(str, l, this.zzd, this.zzb);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfw zzfwVar : this.zzb.zzi()) {
                    this.zza.zzf.zzu();
                    if (zzlb.zzB(zzfsVar, zzfwVar.zzg()) == null) {
                        arrayList.add(zzfwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzs.zzay().zzh().zzb("No unique parameters in main event. eventName", strZzh);
                } else {
                    arrayList.addAll(listZzi);
                    listZzi = arrayList;
                }
            } else {
                this.zzc = l;
                this.zzb = zzfsVar;
                this.zza.zzf.zzu();
                Object objZzC = zzlb.zzC(zzfsVar, "_epc");
                long jLongValue = ((Long) (objZzC != null ? objZzC : 0L)).longValue();
                this.zzd = jLongValue;
                if (jLongValue <= 0) {
                    this.zza.zzs.zzay().zzh().zzb("Complex event with zero extra param count. eventName", strZzh);
                } else {
                    this.zza.zzf.zzi().zzJ(str, (Long) Preconditions.checkNotNull(l), this.zzd, zzfsVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzfr zzfrVar = (com.google.android.gms.internal.measurement.zzfr) zzfsVar.zzby();
        zzfrVar.zzi(strZzh);
        zzfrVar.zzg();
        zzfrVar.zzd(listZzi);
        return (com.google.android.gms.internal.measurement.zzfs) zzfrVar.zzaE();
    }
}
