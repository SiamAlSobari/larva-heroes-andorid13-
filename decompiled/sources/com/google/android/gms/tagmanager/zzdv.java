package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdv implements zzcc {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time");
    private final zzdu zzb;
    private volatile zzbj zzc;
    private final Context zzd;
    private final String zze;
    private long zzf;
    private final Clock zzg;
    private final int zzh;
    private final zzey zzi;

    zzdv(zzey zzeyVar, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        this.zze = "gtm_urls.db";
        this.zzi = zzeyVar;
        this.zzg = DefaultClock.getInstance();
        this.zzb = new zzdu(this, applicationContext, "gtm_urls.db");
        this.zzc = new zzfi(applicationContext, new zzdt(this));
        this.zzf = 0L;
        this.zzh = 2000;
    }

    static /* synthetic */ void zzi(zzdv zzdvVar, long j, long j2) {
        SQLiteDatabase sQLiteDatabaseZzk = zzdvVar.zzk("Error opening database for getNumStoredHits.");
        if (sQLiteDatabaseZzk == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_first_send_time", Long.valueOf(j2));
        try {
            sQLiteDatabaseZzk.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error setting HIT_FIRST_DISPATCH_TIME for hitId: " + j);
            zzdvVar.zzl(j);
        }
    }

    private final SQLiteDatabase zzk(String str) {
        try {
            return this.zzb.getWritableDatabase();
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(long j) {
        zzj(new String[]{String.valueOf(j)});
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0136 A[Catch: all -> 0x00fa, TryCatch #11 {all -> 0x00fa, blocks: (B:20:0x00ab, B:23:0x00b2, B:25:0x00bf, B:27:0x00ea, B:26:0x00ce, B:46:0x010e, B:47:0x0130, B:49:0x0136, B:54:0x014a), top: B:112:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0149  */
    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    /* JADX WARN: Code duplicated, block: B:59:0x0156  */
    /* JADX WARN: Code duplicated, block: B:77:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x0199  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:94:0x01df  */
    @Override // com.google.android.gms.tagmanager.zzcc
    public final void zza() throws Throwable {
        char c;
        Cursor cursor;
        Cursor cursor2;
        ArrayList<zzbz> arrayList;
        Cursor cursorQuery;
        boolean z;
        SQLiteDatabase sQLiteDatabaseZzk;
        int count;
        zzdg.zzb.zzd("GTM Dispatch running...");
        if (this.zzc.zzb()) {
            ArrayList arrayList2 = new ArrayList();
            SQLiteDatabase sQLiteDatabaseZzk2 = zzk("Error opening database for peekHits");
            Cursor cursorQuery2 = null;
            if (sQLiteDatabaseZzk2 == null) {
                c = 0;
            } else {
                try {
                    try {
                        c = 0;
                        try {
                            Cursor cursorQuery3 = sQLiteDatabaseZzk2.query("gtm_hits", new String[]{"hit_id", "hit_time", "hit_first_send_time"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(40));
                            try {
                                try {
                                    ArrayList arrayList3 = new ArrayList();
                                    try {
                                        if (cursorQuery3.moveToFirst()) {
                                            do {
                                                arrayList3.add(new zzbz(cursorQuery3.getLong(0), cursorQuery3.getLong(1), cursorQuery3.getLong(2)));
                                            } while (cursorQuery3.moveToNext());
                                        }
                                        if (cursorQuery3 != null) {
                                            cursorQuery3.close();
                                        }
                                        try {
                                            arrayList = arrayList3;
                                            cursor2 = cursorQuery3;
                                            try {
                                                cursorQuery = sQLiteDatabaseZzk2.query("gtm_hits", new String[]{"hit_id", "hit_url"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(40));
                                                try {
                                                    try {
                                                        if (cursorQuery.moveToFirst()) {
                                                            int i = 0;
                                                            do {
                                                                if (((SQLiteCursor) cursorQuery).getWindow().getNumRows() > 0) {
                                                                    ((zzbz) arrayList.get(i)).zzd(cursorQuery.getString(1));
                                                                } else {
                                                                    Log.w("GoogleTagManager", String.format("HitString for hitId %d too large.  Hit will be deleted.", Long.valueOf(((zzbz) arrayList.get(i)).zzb())));
                                                                }
                                                                i++;
                                                            } while (cursorQuery.moveToNext());
                                                        }
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        arrayList2 = arrayList;
                                                    } catch (SQLiteException e) {
                                                        e = e;
                                                        Log.w("GoogleTagManager", "Error in peekHits fetching hit url: " + e.getMessage());
                                                        arrayList2 = new ArrayList();
                                                        z = false;
                                                        for (zzbz zzbzVar : arrayList) {
                                                            if (!TextUtils.isEmpty(zzbzVar.zzc())) {
                                                                if (z) {
                                                                    break;
                                                                } else {
                                                                    z = true;
                                                                }
                                                            }
                                                            arrayList2.add(zzbzVar);
                                                        }
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e2) {
                                                e = e2;
                                                cursorQuery = cursor2;
                                                Log.w("GoogleTagManager", "Error in peekHits fetching hit url: " + e.getMessage());
                                                arrayList2 = new ArrayList();
                                                z = false;
                                                while (r0.hasNext()) {
                                                    if (!TextUtils.isEmpty(zzbzVar.zzc())) {
                                                        if (z) {
                                                            break;
                                                            break;
                                                        }
                                                        z = true;
                                                    }
                                                    arrayList2.add(zzbzVar);
                                                }
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                if (arrayList2.isEmpty()) {
                                                    zzdg.zzb.zzd("...nothing to dispatch");
                                                    this.zzi.zza(true);
                                                    return;
                                                }
                                                this.zzc.zza(arrayList2);
                                                sQLiteDatabaseZzk = zzk("Error opening database for getNumStoredHits.");
                                                if (sQLiteDatabaseZzk == null) {
                                                    return;
                                                }
                                                try {
                                                    try {
                                                        String[] strArr = new String[2];
                                                        strArr[c] = "hit_id";
                                                        strArr[1] = "hit_first_send_time";
                                                        cursorQuery2 = sQLiteDatabaseZzk.query("gtm_hits", strArr, "hit_first_send_time=0", null, null, null, null);
                                                        count = cursorQuery2.getCount();
                                                        if (cursorQuery2 != null) {
                                                            cursorQuery2.close();
                                                        }
                                                    } catch (SQLiteException unused) {
                                                        Log.w("GoogleTagManager", "Error getting num untried hits");
                                                        if (cursorQuery2 != null) {
                                                            cursorQuery2.close();
                                                            return;
                                                        }
                                                        count = 0;
                                                    }
                                                    if (count > 0) {
                                                        zzfe.zzg().zza();
                                                    }
                                                } catch (Throwable th2) {
                                                    if (cursorQuery2 != null) {
                                                        cursorQuery2.close();
                                                    }
                                                    throw th2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cursorQuery = cursor2;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            arrayList = arrayList3;
                                            cursor2 = cursorQuery3;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            cursor2 = cursorQuery3;
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        arrayList2 = arrayList3;
                                        cursor = cursorQuery3;
                                        try {
                                            Log.w("GoogleTagManager", "Error in peekHits fetching hitIds: " + e.getMessage());
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            cursorQuery2 = cursor;
                                            if (cursorQuery2 != null) {
                                                cursorQuery2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    cursorQuery2 = cursorQuery3;
                                    if (cursorQuery2 != null) {
                                        cursorQuery2.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e5) {
                                e = e5;
                            }
                        } catch (SQLiteException e6) {
                            e = e6;
                            cursor = null;
                            Log.w("GoogleTagManager", "Error in peekHits fetching hitIds: " + e.getMessage());
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (arrayList2.isEmpty()) {
                                zzdg.zzb.zzd("...nothing to dispatch");
                                this.zzi.zza(true);
                                return;
                            }
                            this.zzc.zza(arrayList2);
                            sQLiteDatabaseZzk = zzk("Error opening database for getNumStoredHits.");
                            if (sQLiteDatabaseZzk == null) {
                                return;
                            }
                            String[] strArr2 = new String[2];
                            strArr2[c] = "hit_id";
                            strArr2[1] = "hit_first_send_time";
                            cursorQuery2 = sQLiteDatabaseZzk.query("gtm_hits", strArr2, "hit_first_send_time=0", null, null, null, null);
                            count = cursorQuery2.getCount();
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                            if (count > 0) {
                                zzfe.zzg().zza();
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    c = 0;
                }
            }
            if (arrayList2.isEmpty()) {
                zzdg.zzb.zzd("...nothing to dispatch");
                this.zzi.zza(true);
                return;
            }
            this.zzc.zza(arrayList2);
            sQLiteDatabaseZzk = zzk("Error opening database for getNumStoredHits.");
            if (sQLiteDatabaseZzk == null) {
                return;
            }
            String[] strArr3 = new String[2];
            strArr3[c] = "hit_id";
            strArr3[1] = "hit_first_send_time";
            cursorQuery2 = sQLiteDatabaseZzk.query("gtm_hits", strArr3, "hit_first_send_time=0", null, null, null, null);
            count = cursorQuery2.getCount();
            if (cursorQuery2 != null) {
                cursorQuery2.close();
            }
            if (count > 0) {
                zzfe.zzg().zza();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bc A[PHI: r2
  0x00bc: PHI (r2v8 android.database.Cursor) = (r2v7 android.database.Cursor), (r2v9 android.database.Cursor) binds: [B:31:0x00ba, B:22:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.database.Cursor] */
    @Override // com.google.android.gms.tagmanager.zzcc
    public final void zzb(long j, String str) throws Throwable {
        Cursor cursorQuery;
        long jCurrentTimeMillis = this.zzg.currentTimeMillis();
        if (jCurrentTimeMillis > this.zzf + 86400000) {
            this.zzf = jCurrentTimeMillis;
            SQLiteDatabase sQLiteDatabaseZzk = zzk("Error opening database for deleteStaleHits.");
            if (sQLiteDatabaseZzk != null) {
                sQLiteDatabaseZzk.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.zzg.currentTimeMillis() - 2592000000L)});
                this.zzi.zza(zzc() == 0);
            }
        }
        ?? Zzc = (zzc() - this.zzh) + 1;
        ?? r4 = 0;
        if (Zzc > 0) {
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase sQLiteDatabaseZzk2 = zzk("Error opening database for peekHitIds.");
            try {
                if (sQLiteDatabaseZzk2 != null) {
                    try {
                        cursorQuery = sQLiteDatabaseZzk2.query("gtm_hits", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(Zzc));
                        try {
                            if (cursorQuery.moveToFirst()) {
                                do {
                                    arrayList.add(String.valueOf(cursorQuery.getLong(0)));
                                } while (cursorQuery.moveToNext());
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            Log.w("GoogleTagManager", "Error in peekHits fetching hitIds: " + e.getMessage());
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursorQuery = null;
                    } catch (Throwable th) {
                        th = th;
                        if (r4 != 0) {
                            r4.close();
                        }
                        throw th;
                    }
                }
                zzdg.zzb.zzd("Store full, deleting " + arrayList.size() + " hits to make room.");
                zzj((String[]) arrayList.toArray(new String[0]));
            } catch (Throwable th2) {
                th = th2;
                r4 = Zzc;
            }
        }
        SQLiteDatabase sQLiteDatabaseZzk3 = zzk("Error opening database for putHit");
        if (sQLiteDatabaseZzk3 == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_time", Long.valueOf(j));
        contentValues.put("hit_url", str);
        contentValues.put("hit_first_send_time", (Integer) 0);
        try {
            sQLiteDatabaseZzk3.insert("gtm_hits", null, contentValues);
            this.zzi.zza(false);
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error storing hit");
        }
    }

    final int zzc() {
        SQLiteDatabase sQLiteDatabaseZzk = zzk("Error opening database for getNumStoredHits.");
        int i = 0;
        if (sQLiteDatabaseZzk == null) {
            return 0;
        }
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseZzk.rawQuery("SELECT COUNT(*) from gtm_hits", null);
                i = cursorRawQuery.moveToFirst() ? (int) cursorRawQuery.getLong(0) : 0;
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return i;
                }
            } catch (SQLiteException unused) {
                Log.w("GoogleTagManager", "Error getting numStoredHits");
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return 0;
                }
            }
            return i;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    final void zzj(String[] strArr) {
        int length;
        SQLiteDatabase sQLiteDatabaseZzk;
        if (strArr == null || (length = strArr.length) == 0 || (sQLiteDatabaseZzk = zzk("Error opening database for deleteHits.")) == null) {
            return;
        }
        boolean z = true;
        try {
            sQLiteDatabaseZzk.delete("gtm_hits", String.format("HIT_ID in (%s)", TextUtils.join(",", Collections.nCopies(length, "?"))), strArr);
            zzey zzeyVar = this.zzi;
            if (zzc() != 0) {
                z = false;
            }
            zzeyVar.zza(z);
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error deleting hits");
        }
    }
}
