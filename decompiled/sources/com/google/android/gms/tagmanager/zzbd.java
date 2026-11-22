package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzgb;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbd implements zzaw {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", "datalayer", "ID", "key", "value", "expires");
    private final Executor zzb;
    private final Context zzc;
    private final zzbb zzd;
    private final Clock zze;

    public zzbd(Context context) {
        Clock defaultClock = DefaultClock.getInstance();
        ExecutorService executorServiceZza = zzgb.zza().zza(2);
        this.zzc = context;
        this.zze = defaultClock;
        this.zzb = executorServiceZza;
        this.zzd = new zzbb(this, context, "google_tagmanager.db");
    }

    static /* bridge */ /* synthetic */ List zzf(zzbd zzbdVar) {
        ObjectInputStream objectInputStream;
        try {
            zzbdVar.zzk(zzbdVar.zze.currentTimeMillis());
            SQLiteDatabase sQLiteDatabaseZzi = zzbdVar.zzi("Error opening database for loadSerialized.");
            ArrayList<zzbc> arrayList = new ArrayList();
            if (sQLiteDatabaseZzi != null) {
                Cursor cursorQuery = sQLiteDatabaseZzi.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null);
                while (cursorQuery.moveToNext()) {
                    try {
                        arrayList.add(new zzbc(cursorQuery.getString(0), cursorQuery.getBlob(1)));
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                cursorQuery.close();
            }
            ArrayList arrayList2 = new ArrayList();
            for (zzbc zzbcVar : arrayList) {
                String str = zzbcVar.zza;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(zzbcVar.zzb);
                ObjectInputStream objectInputStream2 = null;
                object = null;
                object = null;
                object = null;
                Object object = null;
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        object = objectInputStream.readObject();
                        try {
                            objectInputStream.close();
                        } catch (IOException unused) {
                        }
                    } catch (IOException unused2) {
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                    } catch (ClassNotFoundException unused3) {
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        objectInputStream2 = objectInputStream;
                        if (objectInputStream2 != null) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException unused4) {
                                throw th;
                            }
                        }
                        byteArrayInputStream.close();
                        throw th;
                    }
                } catch (IOException unused5) {
                    objectInputStream = null;
                } catch (ClassNotFoundException unused6) {
                    objectInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                byteArrayInputStream.close();
                arrayList2.add(new zzat(str, object));
            }
            zzbdVar.zzj();
            return arrayList2;
        } catch (Throwable th4) {
            zzbdVar.zzj();
            throw th4;
        }
    }

    static /* synthetic */ void zzg(zzbd zzbdVar, String str) {
        SQLiteDatabase sQLiteDatabaseZzi = zzbdVar.zzi("Error opening database for clearKeysWithPrefix.");
        try {
            if (sQLiteDatabaseZzi == null) {
                return;
            }
            zzdg.zzb.zzd("Cleared " + sQLiteDatabaseZzi.delete("datalayer", "key = ? OR key LIKE ?", new String[]{str, str + ".%"}) + " items");
        } catch (SQLiteException e) {
            Log.w("GoogleTagManager", "Error deleting entries with key prefix: " + str + " (" + e.toString() + ").");
        } finally {
            zzbdVar.zzj();
        }
    }

    private final SQLiteDatabase zzi(String str) {
        try {
            return this.zzd.getWritableDatabase();
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", str);
            return null;
        }
    }

    private final void zzj() {
        try {
            this.zzd.close();
        } catch (SQLiteException unused) {
        }
    }

    private final void zzk(long j) {
        SQLiteDatabase sQLiteDatabaseZzi = zzi("Error opening database for deleteOlderThan.");
        if (sQLiteDatabaseZzi == null) {
            return;
        }
        try {
            zzdg.zzb.zzd("Deleted " + sQLiteDatabaseZzi.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)}) + " expired items");
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error deleting old entries.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[Catch: all -> 0x017a, PHI: r5
  0x0093: PHI (r5v13 android.database.Cursor) = (r5v12 android.database.Cursor), (r5v15 android.database.Cursor) binds: [B:46:0x00bc, B:34:0x0091] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x017a, blocks: (B:4:0x0003, B:23:0x0046, B:25:0x004b, B:35:0x0093, B:60:0x012b, B:61:0x012e, B:48:0x00bf, B:50:0x00e8, B:53:0x00ec, B:55:0x00f4, B:56:0x010f, B:58:0x0115, B:62:0x012f, B:65:0x013a, B:66:0x013e, B:68:0x0144, B:15:0x0031, B:22:0x0042, B:76:0x0176, B:77:0x0179), top: B:95:0x0003, outer: #10, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x012b A[Catch: all -> 0x017a, TryCatch #8 {all -> 0x017a, blocks: (B:4:0x0003, B:23:0x0046, B:25:0x004b, B:35:0x0093, B:60:0x012b, B:61:0x012e, B:48:0x00bf, B:50:0x00e8, B:53:0x00ec, B:55:0x00f4, B:56:0x010f, B:58:0x0115, B:62:0x012f, B:65:0x013a, B:66:0x013e, B:68:0x0144, B:15:0x0031, B:22:0x0042, B:76:0x0176, B:77:0x0179), top: B:95:0x0003, outer: #10, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    public final synchronized void zzl(List list, long j) {
        Cursor cursorRawQuery;
        int i;
        Cursor cursorQuery;
        int length;
        SQLiteDatabase sQLiteDatabaseZzi;
        try {
            long jCurrentTimeMillis = this.zze.currentTimeMillis();
            zzk(jCurrentTimeMillis);
            int size = list.size();
            SQLiteDatabase sQLiteDatabaseZzi2 = zzi("Error opening database for getNumStoredEntries.");
            ?? r5 = 0;
            try {
                if (sQLiteDatabaseZzi2 == null) {
                    i = 0;
                } else {
                    try {
                        cursorRawQuery = sQLiteDatabaseZzi2.rawQuery("SELECT COUNT(*) from datalayer", null);
                        try {
                            i = cursorRawQuery.moveToFirst() ? (int) cursorRawQuery.getLong(0) : 0;
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                        } catch (SQLiteException unused) {
                            Log.w("GoogleTagManager", "Error getting numStoredEntries");
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            i = 0;
                        }
                    } catch (SQLiteException unused2) {
                        cursorRawQuery = null;
                    } catch (Throwable th) {
                        th = th;
                        if (r5 != 0) {
                            r5.close();
                        }
                        throw th;
                    }
                }
                int i2 = (i - 2000) + size;
                if (i2 > 0) {
                    ArrayList arrayList = new ArrayList();
                    SQLiteDatabase sQLiteDatabaseZzi3 = zzi("Error opening database for peekEntryIds.");
                    if (sQLiteDatabaseZzi3 != null) {
                        try {
                            cursorQuery = sQLiteDatabaseZzi3.query("datalayer", new String[]{"ID"}, null, null, null, null, String.format("%s ASC", "ID"), Integer.toString(i2));
                            try {
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
                                    Log.w("GoogleTagManager", "Error in peekEntries fetching entryIds: " + e.getMessage());
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            cursorQuery = null;
                        } catch (Throwable th3) {
                            th = th3;
                            cursorQuery = null;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th;
                        }
                    }
                    zzdg.zzb.zzb("DataLayer store full, deleting " + arrayList.size() + " entries to make room.");
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    if (strArr != null && (length = strArr.length) != 0 && (sQLiteDatabaseZzi = zzi("Error opening database for deleteEntries.")) != null) {
                        try {
                            sQLiteDatabaseZzi.delete("datalayer", String.format("%s in (%s)", "ID", TextUtils.join(",", Collections.nCopies(length, "?"))), strArr);
                        } catch (SQLiteException unused3) {
                            Log.w("GoogleTagManager", "Error deleting entries ".concat(String.valueOf(Arrays.toString(strArr))));
                        }
                    }
                }
                long j2 = jCurrentTimeMillis + j;
                SQLiteDatabase sQLiteDatabaseZzi4 = zzi("Error opening database for writeEntryToDatabase.");
                if (sQLiteDatabaseZzi4 != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zzbc zzbcVar = (zzbc) it.next();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("expires", Long.valueOf(j2));
                        contentValues.put("key", zzbcVar.zza);
                        contentValues.put("value", zzbcVar.zzb);
                        sQLiteDatabaseZzi4.insert("datalayer", null, contentValues);
                    }
                }
                zzj();
            } catch (Throwable th4) {
                th = th4;
                r5 = sQLiteDatabaseZzi2;
            }
        } catch (Throwable th5) {
            zzj();
            throw th5;
        }
    }

    @Override // com.google.android.gms.tagmanager.zzaw
    public final void zza(String str) {
        this.zzb.execute(new zzba(this, str));
    }

    @Override // com.google.android.gms.tagmanager.zzaw
    public final void zzb(zzav zzavVar) {
        this.zzb.execute(new zzaz(this, zzavVar));
    }

    @Override // com.google.android.gms.tagmanager.zzaw
    public final void zzc(List list, long j) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzat zzatVar = (zzat) it.next();
            String str = zzatVar.zza;
            Object obj = zzatVar.zzb;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream2 = null;
            byteArray = null;
            byte[] byteArray = null;
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(obj);
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (IOException unused) {
                    if (objectOutputStream != null) {
                    }
                    byteArrayOutputStream.close();
                    arrayList.add(new zzbc(str, byteArray));
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream2 = objectOutputStream;
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException unused2) {
                            throw th;
                        }
                    }
                    byteArrayOutputStream.close();
                    throw th;
                }
            } catch (IOException unused3) {
                objectOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                objectOutputStream.close();
                byteArrayOutputStream.close();
            } catch (IOException unused4) {
            }
            arrayList.add(new zzbc(str, byteArray));
        }
        this.zzb.execute(new zzay(this, arrayList, j));
    }
}
