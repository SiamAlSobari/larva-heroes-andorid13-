package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.internal.measurement.zzob;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaa extends zzkn {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzaa(zzkz zzkzVar) {
        super(zzkzVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i, int i2) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        return zzuVar.zze.get(i2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0290 A[Catch: all -> 0x02c8, SQLiteException -> 0x02cb, LOOP:11: B:102:0x0290->B:520:?, LOOP_START, TryCatch #19 {all -> 0x02c8, blocks: (B:100:0x028a, B:102:0x0290, B:104:0x02a1, B:105:0x02a9, B:109:0x02c1, B:120:0x02d3), top: B:461:0x0280 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02a1 A[Catch: all -> 0x02c8, SQLiteException -> 0x02cb, TryCatch #19 {all -> 0x02c8, blocks: (B:100:0x028a, B:102:0x0290, B:104:0x02a1, B:105:0x02a9, B:109:0x02c1, B:120:0x02d3), top: B:461:0x0280 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02bd A[PHI: r0 r5
  0x02bd: PHI (r0v70 java.util.Map) = (r0v46 java.util.Map), (r0v72 java.util.Map), (r0v40 java.util.Map) binds: [B:121:0x02ea, B:110:0x02c5, B:107:0x02bb] A[DONT_GENERATE, DONT_INLINE]
  0x02bd: PHI (r5v17 android.database.Cursor) = (r5v10 android.database.Cursor), (r5v18 android.database.Cursor), (r5v18 android.database.Cursor) binds: [B:121:0x02ea, B:110:0x02c5, B:107:0x02bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c1 A[Catch: all -> 0x02c8, SQLiteException -> 0x02cb, TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x02c8, blocks: (B:100:0x028a, B:102:0x0290, B:104:0x02a1, B:105:0x02a9, B:109:0x02c1, B:120:0x02d3), top: B:461:0x0280 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0302  */
    /* JADX WARN: Code duplicated, block: B:129:0x0310  */
    /* JADX WARN: Code duplicated, block: B:131:0x032c  */
    /* JADX WARN: Code duplicated, block: B:172:0x044f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0453  */
    /* JADX WARN: Code duplicated, block: B:178:0x0460  */
    /* JADX WARN: Code duplicated, block: B:180:0x0485  */
    /* JADX WARN: Code duplicated, block: B:186:0x049a  */
    /* JADX WARN: Code duplicated, block: B:190:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:191:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:195:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:201:0x04de  */
    /* JADX WARN: Code duplicated, block: B:208:0x0512  */
    /* JADX WARN: Code duplicated, block: B:211:0x051b  */
    /* JADX WARN: Code duplicated, block: B:213:0x0525  */
    /* JADX WARN: Code duplicated, block: B:215:0x054b  */
    /* JADX WARN: Code duplicated, block: B:216:0x054f  */
    /* JADX WARN: Code duplicated, block: B:221:0x056c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x0602  */
    /* JADX WARN: Code duplicated, block: B:249:0x0617  */
    /* JADX WARN: Code duplicated, block: B:253:0x063b  */
    /* JADX WARN: Code duplicated, block: B:254:0x067a  */
    /* JADX WARN: Code duplicated, block: B:257:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:265:0x0710  */
    /* JADX WARN: Code duplicated, block: B:272:0x0738  */
    /* JADX WARN: Code duplicated, block: B:274:0x0743  */
    /* JADX WARN: Code duplicated, block: B:281:0x0767  */
    /* JADX WARN: Code duplicated, block: B:283:0x076c A[LOOP:8: B:266:0x0712->B:283:0x076c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:286:0x0771  */
    /* JADX WARN: Code duplicated, block: B:289:0x077b  */
    /* JADX WARN: Code duplicated, block: B:309:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:313:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:315:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:319:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:325:0x080e  */
    /* JADX WARN: Code duplicated, block: B:327:0x0839 A[LOOP:10: B:323:0x0808->B:327:0x0839, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:335:0x086c  */
    /* JADX WARN: Code duplicated, block: B:338:0x087b  */
    /* JADX WARN: Code duplicated, block: B:340:0x088e  */
    /* JADX WARN: Code duplicated, block: B:344:0x08ce A[Catch: SQLiteException -> 0x092f, all -> 0x0954, LOOP:3: B:344:0x08ce->B:492:?, LOOP_START, TRY_LEAVE, TryCatch #12 {SQLiteException -> 0x092f, blocks: (B:342:0x08c8, B:344:0x08ce, B:345:0x08d3), top: B:452:0x08c8 }] */
    /* JADX WARN: Code duplicated, block: B:349:0x08f4 A[Catch: SQLiteException -> 0x092d, all -> 0x0954, TryCatch #16 {SQLiteException -> 0x092d, blocks: (B:347:0x08e4, B:349:0x08f4, B:350:0x08fc, B:353:0x0915, B:352:0x0901, B:359:0x0923), top: B:457:0x08e4 }] */
    /* JADX WARN: Code duplicated, block: B:356:0x091d  */
    /* JADX WARN: Code duplicated, block: B:358:0x0922  */
    /* JADX WARN: Code duplicated, block: B:361:0x0929 A[PHI: r0 r9
  0x0929: PHI (r0v147 java.util.Map) = (r0v149 java.util.Map), (r0v155 java.util.Map) binds: [B:371:0x094d, B:360:0x0927] A[DONT_GENERATE, DONT_INLINE]
  0x0929: PHI (r9v30 android.database.Cursor) = (r9v31 android.database.Cursor), (r9v34 android.database.Cursor) binds: [B:371:0x094d, B:360:0x0927] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:379:0x095c  */
    /* JADX WARN: Code duplicated, block: B:383:0x096b  */
    /* JADX WARN: Code duplicated, block: B:386:0x0990  */
    /* JADX WARN: Code duplicated, block: B:389:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:391:0x09b8  */
    /* JADX WARN: Code duplicated, block: B:393:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:394:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:398:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:407:0x0a58  */
    /* JADX WARN: Code duplicated, block: B:408:0x0a61  */
    /* JADX WARN: Code duplicated, block: B:411:0x0a6e  */
    /* JADX WARN: Code duplicated, block: B:416:0x0a94  */
    /* JADX WARN: Code duplicated, block: B:421:0x0af6 A[Catch: SQLiteException -> 0x0b0a, TRY_LEAVE, TryCatch #23 {SQLiteException -> 0x0b0a, blocks: (B:419:0x0aec, B:421:0x0af6), top: B:466:0x0aec }] */
    /* JADX WARN: Code duplicated, block: B:433:0x0b2c  */
    /* JADX WARN: Code duplicated, block: B:486:0x0981 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0a77 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x0a6c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x0a42 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x0b21 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0625 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0611 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0765 A[EDGE_INSN: B:508:0x0765->B:280:0x0765 BREAK  A[LOOP:8: B:266:0x0712->B:283:0x076c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x07fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x07ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x0850 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x07d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x0845 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x05ca A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x0494 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x04ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x04d8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x043a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x0214 A[EDGE_INSN: B:569:0x0214->B:77:0x0214 BREAK  A[LOOP:22: B:68:0x01cc->B:80:0x021c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x017d  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b9 A[Catch: SQLiteException -> 0x0224, all -> 0x0b28, TRY_LEAVE, TryCatch #1 {all -> 0x0b28, blocks: (B:61:0x01b3, B:63:0x01b9, B:67:0x01c7, B:68:0x01cc, B:69:0x01d6, B:70:0x01e6, B:75:0x020e, B:72:0x01f3, B:74:0x0207, B:89:0x0230), top: B:439:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c7 A[Catch: SQLiteException -> 0x0224, all -> 0x0b28, TRY_ENTER, TryCatch #1 {all -> 0x0b28, blocks: (B:61:0x01b3, B:63:0x01b9, B:67:0x01c7, B:68:0x01cc, B:69:0x01d6, B:70:0x01e6, B:75:0x020e, B:72:0x01f3, B:74:0x0207, B:89:0x0230), top: B:439:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0216  */
    /* JADX WARN: Code duplicated, block: B:80:0x021c A[LOOP:22: B:68:0x01cc->B:80:0x021c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0253  */
    /* JADX WARN: Code duplicated, block: B:96:0x0259  */
    /* JADX WARN: Code duplicated, block: B:98:0x0264  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v197, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v32, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v59, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v63, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    final List zza(String str, List list, List list2, Long l, Long l2) throws Throwable {
        int i;
        int i2;
        boolean z;
        ?? r5;
        ?? r4;
        Map map;
        ?? r6;
        zzam zzamVarZzi;
        String str2;
        ?? r7;
        Cursor cursorQuery;
        Map map2;
        String str3;
        Map map3;
        Iterator it;
        Map map4;
        String str4;
        String str5;
        int iIntValue;
        com.google.android.gms.internal.measurement.zzgh zzghVar;
        BitSet bitSet;
        BitSet bitSet2;
        ArrayMap arrayMap;
        List<com.google.android.gms.internal.measurement.zzej> list3;
        int i3;
        String str6;
        Long lValueOf;
        String str7;
        Map arrayMap2;
        ?? Zzh;
        Cursor cursorRawQuery;
        ArrayMap arrayMap3;
        Iterator it2;
        com.google.android.gms.internal.measurement.zzgh zzghVar2;
        List list4;
        Map map5;
        Integer numValueOf;
        List arrayList;
        zzw zzwVar;
        ArrayMap arrayMap4;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzfs zzfsVar;
        com.google.android.gms.internal.measurement.zzfs zzfsVarZza;
        zzam zzamVarZzi2;
        String str8;
        String strZzh;
        zzas zzasVarZzn;
        zzas zzasVar;
        long j;
        String strZzh2;
        Map mapEmptyMap;
        String str9;
        Iterator it4;
        int iIntValue2;
        Set set;
        Integer numValueOf2;
        boolean zZzd;
        zzx zzxVar;
        String str10;
        ArrayMap arrayMap5;
        Cursor cursor;
        String str11;
        Cursor cursorQuery2;
        Integer numValueOf3;
        List list5;
        List arrayList2;
        String str12;
        ArrayList arrayList3;
        Iterator it5;
        zzam zzamVarZzi3;
        String str13;
        ContentValues contentValues;
        ArrayMap arrayMap6;
        Iterator it6;
        String strZzf;
        Map mapEmptyMap2;
        Iterator it7;
        int iIntValue3;
        Set set2;
        Integer numValueOf4;
        Iterator it8;
        boolean zZzd2;
        com.google.android.gms.internal.measurement.zzes zzesVar;
        Integer numValueOf5;
        zzz zzzVar;
        Integer numValueOf6;
        zzam zzamVarZzi4;
        String str14;
        ArrayMap arrayMap7;
        Cursor cursor2;
        Cursor cursorQuery3;
        Integer numValueOf7;
        List arrayList4;
        ArrayMap arrayMap8;
        int i4;
        Cursor cursorQuery4;
        List arrayList5;
        String str15 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator it9 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it9.hasNext()) {
                z = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzfs) it9.next()).zzh())) {
                z = true;
                break;
            }
        }
        zzny.zzc();
        boolean zZzs = this.zzs.zzf().zzs(this.zza, zzeb.zzW);
        zzny.zzc();
        boolean zZzs2 = this.zzs.zzf().zzs(this.zza, zzeb.zzV);
        if (z) {
            zzam zzamVarZzi5 = this.zzf.zzi();
            String str16 = this.zza;
            zzamVarZzi5.zzW();
            zzamVarZzi5.zzg();
            Preconditions.checkNotEmpty(str16);
            ?? contentValues2 = new ContentValues();
            int i5 = 0;
            contentValues2.put("current_session_count", 0);
            try {
                ?? Zzh2 = zzamVarZzi5.zzh();
                i5 = new String[]{str16};
                Zzh2.update("events", contentValues2, "app_id = ?", i5);
                r4 = Zzh2;
                r5 = i5;
            } catch (SQLiteException e) {
                zzamVarZzi5.zzs.zzay().zzd().zzc("Error resetting session-scoped event counts. appId", zzeo.zzn(str16), e);
                r4 = "Error resetting session-scoped event counts. appId";
                r5 = i5;
            }
        }
        Map mapEmptyMap3 = Collections.emptyMap();
        String str17 = "Failed to merge filter. appId";
        String str18 = "Database error querying filters. appId";
        String str19 = "audience_id";
        ?? r8 = r4;
        r8 = r4;
        if (zZzs2 && zZzs) {
            zzam zzamVarZzi6 = this.zzf.zzi();
            String str20 = this.zza;
            Preconditions.checkNotEmpty(str20);
            ArrayMap arrayMap9 = new ArrayMap();
            try {
                try {
                    cursorQuery4 = zzamVarZzi6.zzh().query("event_filters", new String[]{"audience_id", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, "app_id=?", new String[]{str20}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzlb.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery4.getBlob(i2))).zzaE();
                                    if (zzejVar.zzo()) {
                                        Integer numValueOf8 = Integer.valueOf(cursorQuery4.getInt(i));
                                        List list6 = (List) arrayMap9.get(numValueOf8);
                                        if (list6 == null) {
                                            arrayList5 = new ArrayList();
                                            arrayMap9.put(numValueOf8, arrayList5);
                                        } else {
                                            arrayList5 = list6;
                                        }
                                        arrayList5.add(zzejVar);
                                    }
                                } catch (IOException e2) {
                                    zzamVarZzi6.zzs.zzay().zzd().zzc("Failed to merge filter. appId", zzeo.zzn(str20), e2);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i = 0;
                                i2 = 1;
                            }
                            if (cursorQuery4 != null) {
                                cursorQuery4.close();
                            }
                            map = arrayMap9;
                            r6 = arrayMap9;
                        } else {
                            mapEmptyMap3 = Collections.emptyMap();
                            r8 = arrayMap9;
                            if (cursorQuery4 != null) {
                                cursorQuery4.close();
                                r8 = arrayMap9;
                            }
                            map = mapEmptyMap3;
                            r6 = r8;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        zzamVarZzi6.zzs.zzay().zzd().zzc("Database error querying filters. appId", zzeo.zzn(str20), e);
                        mapEmptyMap3 = Collections.emptyMap();
                        r8 = arrayMap9;
                        if (cursorQuery4 != null) {
                        }
                        map = mapEmptyMap3;
                        r6 = r8;
                        zzamVarZzi = this.zzf.zzi();
                        str2 = this.zza;
                        zzamVarZzi.zzW();
                        zzamVarZzi.zzg();
                        Preconditions.checkNotEmpty(str2);
                        try {
                            cursorQuery = zzamVarZzi.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    arrayMap8 = new ArrayMap();
                                    while (true) {
                                        i4 = cursorQuery.getInt(0);
                                        try {
                                            arrayMap8.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzgh) ((com.google.android.gms.internal.measurement.zzgg) zzlb.zzl(com.google.android.gms.internal.measurement.zzgh.zzf(), cursorQuery.getBlob(1))).zzaE());
                                        } catch (IOException e4) {
                                            zzamVarZzi.zzs.zzay().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzeo.zzn(str2), Integer.valueOf(i4), e4);
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            arrayMap8 = arrayMap8;
                                            str19 = str19;
                                        } catch (SQLiteException e5) {
                                            e = e5;
                                            zzamVarZzi.zzs.zzay().zzd().zzc("Database error querying filter results. appId", zzeo.zzn(str2), e);
                                            Map mapEmptyMap4 = Collections.emptyMap();
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = mapEmptyMap4;
                                        }
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    map2 = arrayMap8;
                                } else {
                                    Map mapEmptyMap5 = Collections.emptyMap();
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    map2 = mapEmptyMap5;
                                    str19 = "audience_id";
                                }
                            } catch (SQLiteException e6) {
                                e = e6;
                                str19 = "audience_id";
                            }
                            if (map2.isEmpty()) {
                                str5 = "Database error querying filters. appId";
                                str4 = "Failed to merge filter. appId";
                            } else {
                                HashSet hashSet = new HashSet(map2.keySet());
                                if (z) {
                                    String str21 = this.zza;
                                    zzam zzamVarZzi7 = this.zzf.zzi();
                                    str7 = this.zza;
                                    zzamVarZzi7.zzW();
                                    zzamVarZzi7.zzg();
                                    Preconditions.checkNotEmpty(str7);
                                    arrayMap2 = new ArrayMap();
                                    Zzh = zzamVarZzi7.zzh();
                                    try {
                                        try {
                                            cursorRawQuery = Zzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str7, str7});
                                            try {
                                                if (cursorRawQuery.moveToFirst()) {
                                                    do {
                                                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                        arrayList = (List) arrayMap2.get(numValueOf);
                                                        if (arrayList == null) {
                                                            arrayList = new ArrayList();
                                                            arrayMap2.put(numValueOf, arrayList);
                                                        }
                                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                    } while (cursorRawQuery.moveToNext());
                                                    if (cursorRawQuery != null) {
                                                        cursorRawQuery.close();
                                                    }
                                                } else {
                                                    arrayMap2 = Collections.emptyMap();
                                                    if (cursorRawQuery != null) {
                                                        cursorRawQuery.close();
                                                    }
                                                }
                                            } catch (SQLiteException e7) {
                                                e = e7;
                                                zzamVarZzi7.zzs.zzay().zzd().zzc("Database error querying scoped filters. appId", zzeo.zzn(str7), e);
                                                arrayMap2 = Collections.emptyMap();
                                                if (cursorRawQuery != null) {
                                                }
                                                Preconditions.checkNotEmpty(str21);
                                                Preconditions.checkNotNull(map2);
                                                arrayMap3 = new ArrayMap();
                                                if (!map2.isEmpty()) {
                                                    it2 = map2.keySet().iterator();
                                                    while (it2.hasNext()) {
                                                        int iIntValue4 = ((Integer) it2.next()).intValue();
                                                        Integer numValueOf9 = Integer.valueOf(iIntValue4);
                                                        zzghVar2 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf9);
                                                        list4 = (List) arrayMap2.get(numValueOf9);
                                                        if (list4 != null) {
                                                        }
                                                        map5 = arrayMap2;
                                                        arrayMap3.put(numValueOf9, zzghVar2);
                                                        arrayMap2 = map5;
                                                        it2 = it2;
                                                        str18 = str18;
                                                    }
                                                }
                                                str3 = str18;
                                                map3 = arrayMap3;
                                                it = hashSet.iterator();
                                                map4 = map;
                                                while (it.hasNext()) {
                                                    iIntValue = ((Integer) it.next()).intValue();
                                                    zzghVar = (com.google.android.gms.internal.measurement.zzgh) map3.get(Integer.valueOf(iIntValue));
                                                    bitSet = new BitSet();
                                                    bitSet2 = new BitSet();
                                                    arrayMap = new ArrayMap();
                                                    if (zzghVar != null) {
                                                        for (com.google.android.gms.internal.measurement.zzfq zzfqVar : zzghVar.zzj()) {
                                                            if (zzfqVar.zzh()) {
                                                                Integer numValueOf10 = Integer.valueOf(zzfqVar.zza());
                                                                if (zzfqVar.zzg()) {
                                                                    lValueOf = Long.valueOf(zzfqVar.zzb());
                                                                } else {
                                                                    lValueOf = null;
                                                                }
                                                                arrayMap.put(numValueOf10, lValueOf);
                                                            }
                                                        }
                                                    }
                                                    ArrayMap arrayMap10 = new ArrayMap();
                                                    if (zzghVar != null) {
                                                        for (com.google.android.gms.internal.measurement.zzgj zzgjVar : zzghVar.zzm()) {
                                                            if (!zzgjVar.zzi()) {
                                                            }
                                                        }
                                                    }
                                                    Map map6 = map3;
                                                    if (zzghVar != null) {
                                                        i3 = 0;
                                                        while (i3 < zzghVar.zzd() * 64) {
                                                            if (zzlb.zzv(zzghVar.zzn(), i3)) {
                                                                str6 = str17;
                                                                this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                                                                bitSet2.set(i3);
                                                                if (zzlb.zzv(zzghVar.zzk(), i3)) {
                                                                    bitSet.set(i3);
                                                                }
                                                                i3++;
                                                                str17 = str6;
                                                            } else {
                                                                str6 = str17;
                                                            }
                                                            arrayMap.remove(Integer.valueOf(i3));
                                                            i3++;
                                                            str17 = str6;
                                                        }
                                                    }
                                                    String str22 = str17;
                                                    Integer numValueOf11 = Integer.valueOf(iIntValue);
                                                    com.google.android.gms.internal.measurement.zzgh zzghVar3 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf11);
                                                    if (!zZzs2) {
                                                    }
                                                    this.zzc.put(Integer.valueOf(iIntValue), new zzu(this, this.zza, zzghVar3, bitSet, bitSet2, arrayMap, arrayMap10, null));
                                                    str17 = str22;
                                                    map4 = map4;
                                                    map3 = map6;
                                                    map2 = map2;
                                                }
                                                str4 = str17;
                                                str5 = str3;
                                                if (!list.isEmpty()) {
                                                    zzwVar = new zzw(this, null);
                                                    arrayMap4 = new ArrayMap();
                                                    it3 = list.iterator();
                                                    while (it3.hasNext()) {
                                                        zzfsVar = (com.google.android.gms.internal.measurement.zzfs) it3.next();
                                                        zzfsVarZza = zzwVar.zza(this.zza, zzfsVar);
                                                        if (zzfsVarZza != null) {
                                                            zzamVarZzi2 = this.zzf.zzi();
                                                            str8 = this.zza;
                                                            strZzh = zzfsVarZza.zzh();
                                                            zzasVarZzn = zzamVarZzi2.zzn(str8, zzfsVar.zzh());
                                                            if (zzasVarZzn == null) {
                                                                zzamVarZzi2.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeo.zzn(str8), zzamVarZzi2.zzs.zzj().zzd(strZzh));
                                                                zzasVar = new zzas(str8, zzfsVar.zzh(), 1L, 1L, 1L, zzfsVar.zzd(), 0L, null, null, null, null);
                                                            } else {
                                                                zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                                                            }
                                                            this.zzf.zzi().zzE(zzasVar);
                                                            j = zzasVar.zzc;
                                                            strZzh2 = zzfsVarZza.zzh();
                                                            mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                                                            if (mapEmptyMap == null) {
                                                                zzam zzamVarZzi8 = this.zzf.zzi();
                                                                str10 = this.zza;
                                                                zzamVarZzi8.zzW();
                                                                zzamVarZzi8.zzg();
                                                                Preconditions.checkNotEmpty(str10);
                                                                Preconditions.checkNotEmpty(strZzh2);
                                                                arrayMap5 = new ArrayMap();
                                                                SQLiteDatabase sQLiteDatabaseZzh = zzamVarZzi8.zzh();
                                                                try {
                                                                    try {
                                                                        String[] strArr = new String[2];
                                                                        str11 = str19;
                                                                        try {
                                                                            strArr[0] = str11;
                                                                            strArr[1] = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                                                            str9 = str15;
                                                                            try {
                                                                                cursorQuery2 = sQLiteDatabaseZzh.query("event_filters", strArr, "app_id=? AND event_name=?", new String[]{str10, strZzh2}, null, null, null);
                                                                                try {
                                                                                    try {
                                                                                        if (cursorQuery2.moveToFirst()) {
                                                                                            str19 = str11;
                                                                                            while (true) {
                                                                                                try {
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.zzej zzejVar2 = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzlb.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzaE();
                                                                                                        numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                        list5 = (List) arrayMap5.get(numValueOf3);
                                                                                                        if (list5 == null) {
                                                                                                            zzasVar = zzasVar;
                                                                                                            try {
                                                                                                                arrayList2 = new ArrayList();
                                                                                                                arrayMap5.put(numValueOf3, arrayList2);
                                                                                                            } catch (SQLiteException e8) {
                                                                                                                e = e8;
                                                                                                                cursor = cursorQuery2;
                                                                                                                try {
                                                                                                                    zzamVarZzi8.zzs.zzay().zzd().zzc(str5, zzeo.zzn(str10), e);
                                                                                                                    mapEmptyMap = Collections.emptyMap();
                                                                                                                    if (cursor != null) {
                                                                                                                        cursor.close();
                                                                                                                    }
                                                                                                                } catch (Throwable th) {
                                                                                                                    th = th;
                                                                                                                    if (cursor != null) {
                                                                                                                        cursor.close();
                                                                                                                    }
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            zzasVar = zzasVar;
                                                                                                            arrayList2 = list5;
                                                                                                        }
                                                                                                        arrayList2.add(zzejVar2);
                                                                                                    } catch (IOException e9) {
                                                                                                        zzasVar = zzasVar;
                                                                                                        zzamVarZzi8.zzs.zzay().zzd().zzc(str4, zzeo.zzn(str10), e9);
                                                                                                    }
                                                                                                    if (!cursorQuery2.moveToNext()) {
                                                                                                        break;
                                                                                                    }
                                                                                                    zzasVar = zzasVar;
                                                                                                } catch (SQLiteException e10) {
                                                                                                    e = e10;
                                                                                                    zzasVar = zzasVar;
                                                                                                    cursor = cursorQuery2;
                                                                                                    zzamVarZzi8.zzs.zzay().zzd().zzc(str5, zzeo.zzn(str10), e);
                                                                                                    mapEmptyMap = Collections.emptyMap();
                                                                                                    if (cursor != null) {
                                                                                                        cursor.close();
                                                                                                    }
                                                                                                    arrayMap4.put(strZzh2, mapEmptyMap);
                                                                                                    it4 = mapEmptyMap.keySet().iterator();
                                                                                                    while (it4.hasNext()) {
                                                                                                        iIntValue2 = ((Integer) it4.next()).intValue();
                                                                                                        set = this.zzb;
                                                                                                        numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                                        if (set.contains(numValueOf2)) {
                                                                                                            this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                                        } else {
                                                                                                            zZzd = true;
                                                                                                            for (com.google.android.gms.internal.measurement.zzej zzejVar3 : (List) mapEmptyMap.get(numValueOf2)) {
                                                                                                                zzxVar = new zzx(this, this.zza, iIntValue2, zzejVar3);
                                                                                                                zZzd = zzxVar.zzd(this.zzd, this.zze, zzfsVarZza, j, zzasVar, zzf(iIntValue2, zzejVar3.zzb()));
                                                                                                                if (zZzd) {
                                                                                                                    this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                                    break;
                                                                                                                }
                                                                                                                zzd(Integer.valueOf(iIntValue2)).zzc(zzxVar);
                                                                                                            }
                                                                                                            if (!zZzd) {
                                                                                                                this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    zzwVar = zzwVar;
                                                                                                    it3 = it3;
                                                                                                    str15 = str9;
                                                                                                }
                                                                                            }
                                                                                            if (cursorQuery2 != null) {
                                                                                                cursorQuery2.close();
                                                                                            }
                                                                                            mapEmptyMap = arrayMap5;
                                                                                        } else {
                                                                                            str19 = str11;
                                                                                            zzasVar = zzasVar;
                                                                                            mapEmptyMap = Collections.emptyMap();
                                                                                            if (cursorQuery2 != null) {
                                                                                                cursorQuery2.close();
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th2) {
                                                                                        th = th2;
                                                                                        cursor = cursorQuery2;
                                                                                        if (cursor != null) {
                                                                                            cursor.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                } catch (SQLiteException e11) {
                                                                                    e = e11;
                                                                                    str19 = str11;
                                                                                }
                                                                            } catch (SQLiteException e12) {
                                                                                e = e12;
                                                                                str19 = str11;
                                                                                cursor = null;
                                                                                zzamVarZzi8.zzs.zzay().zzd().zzc(str5, zzeo.zzn(str10), e);
                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                if (cursor != null) {
                                                                                    cursor.close();
                                                                                }
                                                                                arrayMap4.put(strZzh2, mapEmptyMap);
                                                                                it4 = mapEmptyMap.keySet().iterator();
                                                                                while (it4.hasNext()) {
                                                                                    iIntValue2 = ((Integer) it4.next()).intValue();
                                                                                    set = this.zzb;
                                                                                    numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                    if (set.contains(numValueOf2)) {
                                                                                        this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                    } else {
                                                                                        zZzd = true;
                                                                                        while (r5.hasNext()) {
                                                                                            zzxVar = new zzx(this, this.zza, iIntValue2, zzejVar3);
                                                                                            zZzd = zzxVar.zzd(this.zzd, this.zze, zzfsVarZza, j, zzasVar, zzf(iIntValue2, zzejVar3.zzb()));
                                                                                            if (zZzd) {
                                                                                                this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                break;
                                                                                            }
                                                                                            zzd(Integer.valueOf(iIntValue2)).zzc(zzxVar);
                                                                                        }
                                                                                        if (!zZzd) {
                                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zzwVar = zzwVar;
                                                                                it3 = it3;
                                                                                str15 = str9;
                                                                            }
                                                                        } catch (SQLiteException e13) {
                                                                            e = e13;
                                                                            str19 = str11;
                                                                            str9 = str15;
                                                                            cursor = null;
                                                                            zzamVarZzi8.zzs.zzay().zzd().zzc(str5, zzeo.zzn(str10), e);
                                                                            mapEmptyMap = Collections.emptyMap();
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                            arrayMap4.put(strZzh2, mapEmptyMap);
                                                                            it4 = mapEmptyMap.keySet().iterator();
                                                                            while (it4.hasNext()) {
                                                                                iIntValue2 = ((Integer) it4.next()).intValue();
                                                                                set = this.zzb;
                                                                                numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                if (set.contains(numValueOf2)) {
                                                                                    this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                } else {
                                                                                    zZzd = true;
                                                                                    while (r5.hasNext()) {
                                                                                        zzxVar = new zzx(this, this.zza, iIntValue2, zzejVar3);
                                                                                        zZzd = zzxVar.zzd(this.zzd, this.zze, zzfsVarZza, j, zzasVar, zzf(iIntValue2, zzejVar3.zzb()));
                                                                                        if (zZzd) {
                                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                            break;
                                                                                        }
                                                                                        zzd(Integer.valueOf(iIntValue2)).zzc(zzxVar);
                                                                                    }
                                                                                    if (!zZzd) {
                                                                                        this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                    }
                                                                                }
                                                                            }
                                                                            zzwVar = zzwVar;
                                                                            it3 = it3;
                                                                            str15 = str9;
                                                                        }
                                                                    } catch (SQLiteException e14) {
                                                                        e = e14;
                                                                    }
                                                                    arrayMap4.put(strZzh2, mapEmptyMap);
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    cursor = null;
                                                                }
                                                            } else {
                                                                zzasVar = zzasVar;
                                                                str9 = str15;
                                                            }
                                                            it4 = mapEmptyMap.keySet().iterator();
                                                            while (it4.hasNext()) {
                                                                iIntValue2 = ((Integer) it4.next()).intValue();
                                                                set = this.zzb;
                                                                numValueOf2 = Integer.valueOf(iIntValue2);
                                                                if (set.contains(numValueOf2)) {
                                                                    this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                } else {
                                                                    zZzd = true;
                                                                    while (r5.hasNext()) {
                                                                        zzxVar = new zzx(this, this.zza, iIntValue2, zzejVar3);
                                                                        zZzd = zzxVar.zzd(this.zzd, this.zze, zzfsVarZza, j, zzasVar, zzf(iIntValue2, zzejVar3.zzb()));
                                                                        if (zZzd) {
                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                            break;
                                                                        }
                                                                        zzd(Integer.valueOf(iIntValue2)).zzc(zzxVar);
                                                                    }
                                                                    if (!zZzd) {
                                                                        this.zzb.add(Integer.valueOf(iIntValue2));
                                                                    }
                                                                }
                                                            }
                                                            zzwVar = zzwVar;
                                                            it3 = it3;
                                                            str15 = str9;
                                                        }
                                                    }
                                                }
                                                str12 = str15;
                                                if (!list2.isEmpty()) {
                                                    arrayMap6 = new ArrayMap();
                                                    it6 = list2.iterator();
                                                    while (it6.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) it6.next();
                                                        strZzf = zzglVar.zzf();
                                                        mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                                                        if (mapEmptyMap2 == null) {
                                                            zzamVarZzi4 = this.zzf.zzi();
                                                            str14 = this.zza;
                                                            zzamVarZzi4.zzW();
                                                            zzamVarZzi4.zzg();
                                                            Preconditions.checkNotEmpty(str14);
                                                            Preconditions.checkNotEmpty(strZzf);
                                                            arrayMap7 = new ArrayMap();
                                                            try {
                                                                cursorQuery3 = zzamVarZzi4.zzh().query("property_filters", new String[]{str19, Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, "app_id=? AND property_name=?", new String[]{str14, strZzf}, null, null, null);
                                                                try {
                                                                    try {
                                                                        if (cursorQuery3.moveToFirst()) {
                                                                            do {
                                                                                try {
                                                                                    com.google.android.gms.internal.measurement.zzes zzesVar2 = (com.google.android.gms.internal.measurement.zzes) ((com.google.android.gms.internal.measurement.zzer) zzlb.zzl(com.google.android.gms.internal.measurement.zzes.zzc(), cursorQuery3.getBlob(1))).zzaE();
                                                                                    try {
                                                                                        numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                        arrayList4 = (List) arrayMap7.get(numValueOf7);
                                                                                        if (arrayList4 == null) {
                                                                                            arrayList4 = new ArrayList();
                                                                                            arrayMap7.put(numValueOf7, arrayList4);
                                                                                        }
                                                                                        arrayList4.add(zzesVar2);
                                                                                    } catch (SQLiteException e15) {
                                                                                        e = e15;
                                                                                        zzamVarZzi4.zzs.zzay().zzd().zzc(str5, zzeo.zzn(str14), e);
                                                                                        mapEmptyMap2 = Collections.emptyMap();
                                                                                        if (cursorQuery3 != null) {
                                                                                            cursorQuery3.close();
                                                                                        }
                                                                                    }
                                                                                } catch (IOException e16) {
                                                                                    zzamVarZzi4.zzs.zzay().zzd().zzc("Failed to merge filter", zzeo.zzn(str14), e16);
                                                                                }
                                                                            } while (cursorQuery3.moveToNext());
                                                                            if (cursorQuery3 != null) {
                                                                                cursorQuery3.close();
                                                                            }
                                                                            mapEmptyMap2 = arrayMap7;
                                                                        } else {
                                                                            mapEmptyMap2 = Collections.emptyMap();
                                                                            if (cursorQuery3 != null) {
                                                                                cursorQuery3.close();
                                                                            }
                                                                        }
                                                                    } catch (SQLiteException e17) {
                                                                        e = e17;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    cursor2 = cursorQuery3;
                                                                    if (cursor2 != null) {
                                                                        cursor2.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (SQLiteException e18) {
                                                                e = e18;
                                                                cursorQuery3 = null;
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                cursor2 = null;
                                                            }
                                                            arrayMap6.put(strZzf, mapEmptyMap2);
                                                        }
                                                        it7 = mapEmptyMap2.keySet().iterator();
                                                        while (it7.hasNext()) {
                                                            iIntValue3 = ((Integer) it7.next()).intValue();
                                                            set2 = this.zzb;
                                                            numValueOf4 = Integer.valueOf(iIntValue3);
                                                            if (set2.contains(numValueOf4)) {
                                                                this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                                                break;
                                                            }
                                                            it8 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                                            zZzd2 = true;
                                                            while (true) {
                                                                if (it8.hasNext()) {
                                                                    zzesVar = (com.google.android.gms.internal.measurement.zzes) it8.next();
                                                                    if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                                                        zzem zzemVarZzj = this.zzs.zzay().zzj();
                                                                        Integer numValueOf12 = Integer.valueOf(iIntValue3);
                                                                        if (zzesVar.zzj()) {
                                                                            numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                                        } else {
                                                                            numValueOf6 = null;
                                                                        }
                                                                        zzemVarZzj.zzd("Evaluating filter. audience, filter, property", numValueOf12, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                                                        this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzesVar));
                                                                    }
                                                                    if (zzesVar.zzj()) {
                                                                    }
                                                                    zzem zzemVarZzk = this.zzs.zzay().zzk();
                                                                    Object objZzn = zzeo.zzn(this.zza);
                                                                    if (zzesVar.zzj()) {
                                                                        numValueOf5 = Integer.valueOf(zzesVar.zza());
                                                                    } else {
                                                                        numValueOf5 = null;
                                                                    }
                                                                    zzemVarZzk.zzc("Invalid property filter ID. appId, id", objZzn, String.valueOf(numValueOf5));
                                                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                                                }
                                                                if (!zZzd2) {
                                                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                                                }
                                                                zzd(Integer.valueOf(iIntValue3)).zzc(zzzVar);
                                                            }
                                                        }
                                                    }
                                                }
                                                arrayList3 = new ArrayList();
                                                Set setKeySet = this.zzc.keySet();
                                                setKeySet.removeAll(this.zzb);
                                                it5 = setKeySet.iterator();
                                                while (it5.hasNext()) {
                                                    int iIntValue5 = ((Integer) it5.next()).intValue();
                                                    Map map7 = this.zzc;
                                                    Integer numValueOf13 = Integer.valueOf(iIntValue5);
                                                    zzu zzuVar = (zzu) map7.get(numValueOf13);
                                                    Preconditions.checkNotNull(zzuVar);
                                                    com.google.android.gms.internal.measurement.zzfo zzfoVarZza = zzuVar.zza(iIntValue5);
                                                    arrayList3.add(zzfoVarZza);
                                                    zzamVarZzi3 = this.zzf.zzi();
                                                    str13 = this.zza;
                                                    com.google.android.gms.internal.measurement.zzgh zzghVarZzd = zzfoVarZza.zzd();
                                                    zzamVarZzi3.zzW();
                                                    zzamVarZzi3.zzg();
                                                    Preconditions.checkNotEmpty(str13);
                                                    Preconditions.checkNotNull(zzghVarZzd);
                                                    byte[] bArrZzbv = zzghVarZzd.zzbv();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str13);
                                                    String str23 = str19;
                                                    contentValues.put(str23, numValueOf13);
                                                    String str24 = str12;
                                                    contentValues.put(str24, bArrZzbv);
                                                    try {
                                                        try {
                                                            if (zzamVarZzi3.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                zzamVarZzi3.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeo.zzn(str13));
                                                            }
                                                        } catch (SQLiteException e19) {
                                                            e = e19;
                                                            zzamVarZzi3.zzs.zzay().zzd().zzc("Error storing filter results. appId", zzeo.zzn(str13), e);
                                                        }
                                                    } catch (SQLiteException e20) {
                                                        e = e20;
                                                    }
                                                    str12 = str24;
                                                    str19 = str23;
                                                }
                                                return arrayList3;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            if (Zzh != 0) {
                                                Zzh.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e21) {
                                        e = e21;
                                        cursorRawQuery = null;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        Zzh = 0;
                                        if (Zzh != 0) {
                                            Zzh.close();
                                        }
                                        throw th;
                                    }
                                    Preconditions.checkNotEmpty(str21);
                                    Preconditions.checkNotNull(map2);
                                    arrayMap3 = new ArrayMap();
                                    if (!map2.isEmpty()) {
                                        it2 = map2.keySet().iterator();
                                        while (it2.hasNext()) {
                                            int iIntValue6 = ((Integer) it2.next()).intValue();
                                            Integer numValueOf14 = Integer.valueOf(iIntValue6);
                                            zzghVar2 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf14);
                                            list4 = (List) arrayMap2.get(numValueOf14);
                                            if (list4 != null) {
                                            }
                                            map5 = arrayMap2;
                                            arrayMap3.put(numValueOf14, zzghVar2);
                                            arrayMap2 = map5;
                                            it2 = it2;
                                            str18 = str18;
                                        }
                                    }
                                    str3 = str18;
                                    map3 = arrayMap3;
                                } else {
                                    str3 = "Database error querying filters. appId";
                                    map3 = map2;
                                }
                                it = hashSet.iterator();
                                map4 = map;
                                while (it.hasNext()) {
                                    iIntValue = ((Integer) it.next()).intValue();
                                    zzghVar = (com.google.android.gms.internal.measurement.zzgh) map3.get(Integer.valueOf(iIntValue));
                                    bitSet = new BitSet();
                                    bitSet2 = new BitSet();
                                    arrayMap = new ArrayMap();
                                    if (zzghVar != null) {
                                        while (r2.hasNext()) {
                                            if (zzfqVar.zzh()) {
                                                Integer numValueOf15 = Integer.valueOf(zzfqVar.zza());
                                                if (zzfqVar.zzg()) {
                                                    lValueOf = Long.valueOf(zzfqVar.zzb());
                                                } else {
                                                    lValueOf = null;
                                                }
                                                arrayMap.put(numValueOf15, lValueOf);
                                            }
                                        }
                                    }
                                    ArrayMap arrayMap11 = new ArrayMap();
                                    if (zzghVar != null) {
                                        while (r2.hasNext()) {
                                            if (!zzgjVar.zzi()) {
                                            }
                                        }
                                    }
                                    Map map8 = map3;
                                    if (zzghVar != null) {
                                        i3 = 0;
                                        while (i3 < zzghVar.zzd() * 64) {
                                            if (zzlb.zzv(zzghVar.zzn(), i3)) {
                                                str6 = str17;
                                                this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                                                bitSet2.set(i3);
                                                if (zzlb.zzv(zzghVar.zzk(), i3)) {
                                                    bitSet.set(i3);
                                                }
                                                i3++;
                                                str17 = str6;
                                            } else {
                                                str6 = str17;
                                            }
                                            arrayMap.remove(Integer.valueOf(i3));
                                            i3++;
                                            str17 = str6;
                                        }
                                    }
                                    String str25 = str17;
                                    Integer numValueOf16 = Integer.valueOf(iIntValue);
                                    com.google.android.gms.internal.measurement.zzgh zzghVar4 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf16);
                                    if (!zZzs2) {
                                    }
                                    this.zzc.put(Integer.valueOf(iIntValue), new zzu(this, this.zza, zzghVar4, bitSet, bitSet2, arrayMap, arrayMap11, null));
                                    str17 = str25;
                                    map4 = map4;
                                    map3 = map8;
                                    map2 = map2;
                                }
                                str4 = str17;
                                str5 = str3;
                            }
                            if (!list.isEmpty()) {
                                zzwVar = new zzw(this, null);
                                arrayMap4 = new ArrayMap();
                                it3 = list.iterator();
                                while (it3.hasNext()) {
                                    zzfsVar = (com.google.android.gms.internal.measurement.zzfs) it3.next();
                                    zzfsVarZza = zzwVar.zza(this.zza, zzfsVar);
                                    if (zzfsVarZza != null) {
                                        zzamVarZzi2 = this.zzf.zzi();
                                        str8 = this.zza;
                                        strZzh = zzfsVarZza.zzh();
                                        zzasVarZzn = zzamVarZzi2.zzn(str8, zzfsVar.zzh());
                                        if (zzasVarZzn == null) {
                                            zzamVarZzi2.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeo.zzn(str8), zzamVarZzi2.zzs.zzj().zzd(strZzh));
                                            zzasVar = new zzas(str8, zzfsVar.zzh(), 1L, 1L, 1L, zzfsVar.zzd(), 0L, null, null, null, null);
                                        } else {
                                            zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                                        }
                                        this.zzf.zzi().zzE(zzasVar);
                                        j = zzasVar.zzc;
                                        strZzh2 = zzfsVarZza.zzh();
                                        mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                                        if (mapEmptyMap == null) {
                                            zzam zzamVarZzi9 = this.zzf.zzi();
                                            str10 = this.zza;
                                            zzamVarZzi9.zzW();
                                            zzamVarZzi9.zzg();
                                            Preconditions.checkNotEmpty(str10);
                                            Preconditions.checkNotEmpty(strZzh2);
                                            arrayMap5 = new ArrayMap();
                                            SQLiteDatabase sQLiteDatabaseZzh2 = zzamVarZzi9.zzh();
                                            String[] strArr2 = new String[2];
                                            str11 = str19;
                                            strArr2[0] = str11;
                                            strArr2[1] = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                            str9 = str15;
                                            cursorQuery2 = sQLiteDatabaseZzh2.query("event_filters", strArr2, "app_id=? AND event_name=?", new String[]{str10, strZzh2}, null, null, null);
                                            if (cursorQuery2.moveToFirst()) {
                                                str19 = str11;
                                                while (true) {
                                                    com.google.android.gms.internal.measurement.zzej zzejVar4 = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzlb.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzaE();
                                                    numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                    list5 = (List) arrayMap5.get(numValueOf3);
                                                    if (list5 == null) {
                                                        zzasVar = zzasVar;
                                                        arrayList2 = new ArrayList();
                                                        arrayMap5.put(numValueOf3, arrayList2);
                                                    } else {
                                                        zzasVar = zzasVar;
                                                        arrayList2 = list5;
                                                    }
                                                    arrayList2.add(zzejVar4);
                                                    if (!cursorQuery2.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    zzasVar = zzasVar;
                                                }
                                                if (cursorQuery2 != null) {
                                                    cursorQuery2.close();
                                                }
                                                mapEmptyMap = arrayMap5;
                                            } else {
                                                str19 = str11;
                                                zzasVar = zzasVar;
                                                mapEmptyMap = Collections.emptyMap();
                                                if (cursorQuery2 != null) {
                                                    cursorQuery2.close();
                                                }
                                            }
                                            arrayMap4.put(strZzh2, mapEmptyMap);
                                        } else {
                                            zzasVar = zzasVar;
                                            str9 = str15;
                                        }
                                        it4 = mapEmptyMap.keySet().iterator();
                                        while (it4.hasNext()) {
                                            iIntValue2 = ((Integer) it4.next()).intValue();
                                            set = this.zzb;
                                            numValueOf2 = Integer.valueOf(iIntValue2);
                                            if (set.contains(numValueOf2)) {
                                                this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                            } else {
                                                zZzd = true;
                                                while (r5.hasNext()) {
                                                    zzxVar = new zzx(this, this.zza, iIntValue2, zzejVar3);
                                                    zZzd = zzxVar.zzd(this.zzd, this.zze, zzfsVarZza, j, zzasVar, zzf(iIntValue2, zzejVar3.zzb()));
                                                    if (zZzd) {
                                                        this.zzb.add(Integer.valueOf(iIntValue2));
                                                        break;
                                                    }
                                                    zzd(Integer.valueOf(iIntValue2)).zzc(zzxVar);
                                                }
                                                if (!zZzd) {
                                                    this.zzb.add(Integer.valueOf(iIntValue2));
                                                }
                                            }
                                        }
                                        zzwVar = zzwVar;
                                        it3 = it3;
                                        str15 = str9;
                                    }
                                }
                            }
                            str12 = str15;
                            if (!list2.isEmpty()) {
                                arrayMap6 = new ArrayMap();
                                it6 = list2.iterator();
                                while (it6.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzgl zzglVar2 = (com.google.android.gms.internal.measurement.zzgl) it6.next();
                                    strZzf = zzglVar2.zzf();
                                    mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                                    if (mapEmptyMap2 == null) {
                                        zzamVarZzi4 = this.zzf.zzi();
                                        str14 = this.zza;
                                        zzamVarZzi4.zzW();
                                        zzamVarZzi4.zzg();
                                        Preconditions.checkNotEmpty(str14);
                                        Preconditions.checkNotEmpty(strZzf);
                                        arrayMap7 = new ArrayMap();
                                        cursorQuery3 = zzamVarZzi4.zzh().query("property_filters", new String[]{str19, Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, "app_id=? AND property_name=?", new String[]{str14, strZzf}, null, null, null);
                                        if (cursorQuery3.moveToFirst()) {
                                            do {
                                                com.google.android.gms.internal.measurement.zzes zzesVar3 = (com.google.android.gms.internal.measurement.zzes) ((com.google.android.gms.internal.measurement.zzer) zzlb.zzl(com.google.android.gms.internal.measurement.zzes.zzc(), cursorQuery3.getBlob(1))).zzaE();
                                                numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                arrayList4 = (List) arrayMap7.get(numValueOf7);
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                    arrayMap7.put(numValueOf7, arrayList4);
                                                }
                                                arrayList4.add(zzesVar3);
                                            } while (cursorQuery3.moveToNext());
                                            if (cursorQuery3 != null) {
                                                cursorQuery3.close();
                                            }
                                            mapEmptyMap2 = arrayMap7;
                                        } else {
                                            mapEmptyMap2 = Collections.emptyMap();
                                            if (cursorQuery3 != null) {
                                                cursorQuery3.close();
                                            }
                                        }
                                        arrayMap6.put(strZzf, mapEmptyMap2);
                                    }
                                    it7 = mapEmptyMap2.keySet().iterator();
                                    while (it7.hasNext()) {
                                        iIntValue3 = ((Integer) it7.next()).intValue();
                                        set2 = this.zzb;
                                        numValueOf4 = Integer.valueOf(iIntValue3);
                                        if (set2.contains(numValueOf4)) {
                                            this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                            break;
                                            break;
                                        }
                                        it8 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                        zZzd2 = true;
                                        while (true) {
                                            if (it8.hasNext()) {
                                                zzesVar = (com.google.android.gms.internal.measurement.zzes) it8.next();
                                                if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                                    zzem zzemVarZzj2 = this.zzs.zzay().zzj();
                                                    Integer numValueOf17 = Integer.valueOf(iIntValue3);
                                                    if (zzesVar.zzj()) {
                                                        numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                    } else {
                                                        numValueOf6 = null;
                                                    }
                                                    zzemVarZzj2.zzd("Evaluating filter. audience, filter, property", numValueOf17, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                                    this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzesVar));
                                                }
                                                if (zzesVar.zzj()) {
                                                }
                                                zzem zzemVarZzk2 = this.zzs.zzay().zzk();
                                                Object objZzn2 = zzeo.zzn(this.zza);
                                                if (zzesVar.zzj()) {
                                                    numValueOf5 = Integer.valueOf(zzesVar.zza());
                                                } else {
                                                    numValueOf5 = null;
                                                }
                                                zzemVarZzk2.zzc("Invalid property filter ID. appId, id", objZzn2, String.valueOf(numValueOf5));
                                                this.zzb.add(Integer.valueOf(iIntValue3));
                                            }
                                            if (!zZzd2) {
                                                this.zzb.add(Integer.valueOf(iIntValue3));
                                            }
                                            zzd(Integer.valueOf(iIntValue3)).zzc(zzzVar);
                                        }
                                    }
                                }
                            }
                            arrayList3 = new ArrayList();
                            Set setKeySet2 = this.zzc.keySet();
                            setKeySet2.removeAll(this.zzb);
                            it5 = setKeySet2.iterator();
                            while (it5.hasNext()) {
                                int iIntValue7 = ((Integer) it5.next()).intValue();
                                Map map9 = this.zzc;
                                Integer numValueOf18 = Integer.valueOf(iIntValue7);
                                zzu zzuVar2 = (zzu) map9.get(numValueOf18);
                                Preconditions.checkNotNull(zzuVar2);
                                com.google.android.gms.internal.measurement.zzfo zzfoVarZza2 = zzuVar2.zza(iIntValue7);
                                arrayList3.add(zzfoVarZza2);
                                zzamVarZzi3 = this.zzf.zzi();
                                str13 = this.zza;
                                com.google.android.gms.internal.measurement.zzgh zzghVarZzd2 = zzfoVarZza2.zzd();
                                zzamVarZzi3.zzW();
                                zzamVarZzi3.zzg();
                                Preconditions.checkNotEmpty(str13);
                                Preconditions.checkNotNull(zzghVarZzd2);
                                byte[] bArrZzbv2 = zzghVarZzd2.zzbv();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", str13);
                                String str26 = str19;
                                contentValues.put(str26, numValueOf18);
                                String str27 = str12;
                                contentValues.put(str27, bArrZzbv2);
                                if (zzamVarZzi3.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                    zzamVarZzi3.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeo.zzn(str13));
                                }
                                str12 = str27;
                                str19 = str26;
                            }
                            return arrayList3;
                        } catch (Throwable th8) {
                            th = th8;
                            r7 = r6;
                            if (r7 != 0) {
                                r7.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    if (r5 != 0) {
                        r5.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e22) {
                e = e22;
                cursorQuery4 = null;
            } catch (Throwable th10) {
                th = th10;
                r5 = 0;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
        } else {
            map = mapEmptyMap3;
            r6 = r8;
        }
        zzamVarZzi = this.zzf.zzi();
        str2 = this.zza;
        zzamVarZzi.zzW();
        zzamVarZzi.zzg();
        Preconditions.checkNotEmpty(str2);
        try {
            cursorQuery = zzamVarZzi.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map mapEmptyMap6 = Collections.emptyMap();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                map2 = mapEmptyMap6;
                str19 = "audience_id";
            } else {
                arrayMap8 = new ArrayMap();
                while (true) {
                    i4 = cursorQuery.getInt(0);
                    arrayMap8.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzgh) ((com.google.android.gms.internal.measurement.zzgg) zzlb.zzl(com.google.android.gms.internal.measurement.zzgh.zzf(), cursorQuery.getBlob(1))).zzaE());
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    arrayMap8 = arrayMap8;
                    str19 = str19;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                map2 = arrayMap8;
            }
        } catch (SQLiteException e23) {
            e = e23;
            str19 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th11) {
            th = th11;
            r7 = 0;
            if (r7 != 0) {
                r7.close();
            }
            throw th;
        }
        if (map2.isEmpty()) {
            str5 = "Database error querying filters. appId";
            str4 = "Failed to merge filter. appId";
        } else {
            HashSet hashSet2 = new HashSet(map2.keySet());
            if (z) {
                String str28 = this.zza;
                zzam zzamVarZzi10 = this.zzf.zzi();
                str7 = this.zza;
                zzamVarZzi10.zzW();
                zzamVarZzi10.zzg();
                Preconditions.checkNotEmpty(str7);
                arrayMap2 = new ArrayMap();
                Zzh = zzamVarZzi10.zzh();
                cursorRawQuery = Zzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str7, str7});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) arrayMap2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            arrayMap2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } else {
                    arrayMap2 = Collections.emptyMap();
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                }
                Preconditions.checkNotEmpty(str28);
                Preconditions.checkNotNull(map2);
                arrayMap3 = new ArrayMap();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        int iIntValue8 = ((Integer) it2.next()).intValue();
                        Integer numValueOf19 = Integer.valueOf(iIntValue8);
                        zzghVar2 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf19);
                        list4 = (List) arrayMap2.get(numValueOf19);
                        if (list4 != null || list4.isEmpty()) {
                            map5 = arrayMap2;
                            arrayMap3.put(numValueOf19, zzghVar2);
                            arrayMap2 = map5;
                            it2 = it2;
                            str18 = str18;
                        } else {
                            map5 = arrayMap2;
                            List listZzq = this.zzf.zzu().zzq(zzghVar2.zzk(), list4);
                            if (listZzq.isEmpty()) {
                                arrayMap2 = map5;
                            } else {
                                com.google.android.gms.internal.measurement.zzgg zzggVar = (com.google.android.gms.internal.measurement.zzgg) zzghVar2.zzby();
                                zzggVar.zzf();
                                zzggVar.zzb(listZzq);
                                List listZzq2 = this.zzf.zzu().zzq(zzghVar2.zzn(), list4);
                                zzggVar.zzh();
                                zzggVar.zzd(listZzq2);
                                zzob.zzc();
                                if (this.zzs.zzf().zzs(null, zzeb.zzaA)) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it10 = zzghVar2.zzj().iterator();
                                    while (it10.hasNext()) {
                                        com.google.android.gms.internal.measurement.zzfq zzfqVar2 = (com.google.android.gms.internal.measurement.zzfq) it10.next();
                                        Iterator it11 = it10;
                                        if (!list4.contains(Integer.valueOf(zzfqVar2.zza()))) {
                                            arrayList6.add(zzfqVar2);
                                        }
                                        it10 = it11;
                                    }
                                    zzggVar.zze();
                                    zzggVar.zza(arrayList6);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (com.google.android.gms.internal.measurement.zzgj zzgjVar2 : zzghVar2.zzm()) {
                                        if (!list4.contains(Integer.valueOf(zzgjVar2.zzb()))) {
                                            arrayList7.add(zzgjVar2);
                                        }
                                    }
                                    zzggVar.zzg();
                                    zzggVar.zzc(arrayList7);
                                } else {
                                    for (int i6 = 0; i6 < zzghVar2.zza(); i6++) {
                                        if (list4.contains(Integer.valueOf(zzghVar2.zze(i6).zza()))) {
                                            zzggVar.zzi(i6);
                                        }
                                    }
                                    for (int i7 = 0; i7 < zzghVar2.zzc(); i7++) {
                                        if (list4.contains(Integer.valueOf(zzghVar2.zzi(i7).zzb()))) {
                                            zzggVar.zzj(i7);
                                        }
                                    }
                                }
                                arrayMap3.put(Integer.valueOf(iIntValue8), (com.google.android.gms.internal.measurement.zzgh) zzggVar.zzaE());
                                arrayMap2 = map5;
                                it2 = it2;
                                str18 = str18;
                            }
                        }
                    }
                }
                str3 = str18;
                map3 = arrayMap3;
            } else {
                str3 = "Database error querying filters. appId";
                map3 = map2;
            }
            it = hashSet2.iterator();
            map4 = map;
            while (it.hasNext()) {
                iIntValue = ((Integer) it.next()).intValue();
                zzghVar = (com.google.android.gms.internal.measurement.zzgh) map3.get(Integer.valueOf(iIntValue));
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                arrayMap = new ArrayMap();
                if (zzghVar != null && zzghVar.zza() != 0) {
                    while (r2.hasNext()) {
                        if (zzfqVar.zzh()) {
                            Integer numValueOf110 = Integer.valueOf(zzfqVar.zza());
                            if (zzfqVar.zzg()) {
                                lValueOf = Long.valueOf(zzfqVar.zzb());
                            } else {
                                lValueOf = null;
                            }
                            arrayMap.put(numValueOf110, lValueOf);
                        }
                    }
                }
                ArrayMap arrayMap12 = new ArrayMap();
                if (zzghVar != null && zzghVar.zzc() != 0) {
                    while (r2.hasNext()) {
                        if (!zzgjVar.zzi() && zzgjVar.zza() > 0) {
                            arrayMap12.put(Integer.valueOf(zzgjVar.zzb()), Long.valueOf(zzgjVar.zzc(zzgjVar.zza() - 1)));
                            map3 = map3;
                        }
                    }
                }
                Map map10 = map3;
                if (zzghVar != null) {
                    i3 = 0;
                    while (i3 < zzghVar.zzd() * 64) {
                        if (zzlb.zzv(zzghVar.zzn(), i3)) {
                            str6 = str17;
                            this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                            bitSet2.set(i3);
                            if (zzlb.zzv(zzghVar.zzk(), i3)) {
                                bitSet.set(i3);
                            }
                            i3++;
                            str17 = str6;
                        } else {
                            str6 = str17;
                        }
                        arrayMap.remove(Integer.valueOf(i3));
                        i3++;
                        str17 = str6;
                    }
                }
                String str29 = str17;
                Integer numValueOf111 = Integer.valueOf(iIntValue);
                com.google.android.gms.internal.measurement.zzgh zzghVar5 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf111);
                if (!zZzs2 && zZzs && (list3 = (List) map4.get(numValueOf111)) != null && this.zze != null && this.zzd != null) {
                    for (com.google.android.gms.internal.measurement.zzej zzejVar5 : list3) {
                        int iZzb = zzejVar5.zzb();
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzejVar5.zzm()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf20 = Integer.valueOf(iZzb);
                        if (arrayMap.containsKey(numValueOf20)) {
                            arrayMap.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                        if (arrayMap12.containsKey(numValueOf20)) {
                            arrayMap12.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                    }
                }
                this.zzc.put(Integer.valueOf(iIntValue), new zzu(this, this.zza, zzghVar5, bitSet, bitSet2, arrayMap, arrayMap12, null));
                str17 = str29;
                map4 = map4;
                map3 = map10;
                map2 = map2;
            }
            str4 = str17;
            str5 = str3;
        }
        if (!list.isEmpty()) {
            zzwVar = new zzw(this, null);
            arrayMap4 = new ArrayMap();
            it3 = list.iterator();
            while (it3.hasNext()) {
                zzfsVar = (com.google.android.gms.internal.measurement.zzfs) it3.next();
                zzfsVarZza = zzwVar.zza(this.zza, zzfsVar);
                if (zzfsVarZza != null) {
                    zzamVarZzi2 = this.zzf.zzi();
                    str8 = this.zza;
                    strZzh = zzfsVarZza.zzh();
                    zzasVarZzn = zzamVarZzi2.zzn(str8, zzfsVar.zzh());
                    if (zzasVarZzn == null) {
                        zzamVarZzi2.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeo.zzn(str8), zzamVarZzi2.zzs.zzj().zzd(strZzh));
                        zzasVar = new zzas(str8, zzfsVar.zzh(), 1L, 1L, 1L, zzfsVar.zzd(), 0L, null, null, null, null);
                    } else {
                        zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                    }
                    this.zzf.zzi().zzE(zzasVar);
                    j = zzasVar.zzc;
                    strZzh2 = zzfsVarZza.zzh();
                    mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                    if (mapEmptyMap == null) {
                        zzam zzamVarZzi11 = this.zzf.zzi();
                        str10 = this.zza;
                        zzamVarZzi11.zzW();
                        zzamVarZzi11.zzg();
                        Preconditions.checkNotEmpty(str10);
                        Preconditions.checkNotEmpty(strZzh2);
                        arrayMap5 = new ArrayMap();
                        SQLiteDatabase sQLiteDatabaseZzh3 = zzamVarZzi11.zzh();
                        String[] strArr3 = new String[2];
                        str11 = str19;
                        strArr3[0] = str11;
                        strArr3[1] = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                        str9 = str15;
                        cursorQuery2 = sQLiteDatabaseZzh3.query("event_filters", strArr3, "app_id=? AND event_name=?", new String[]{str10, strZzh2}, null, null, null);
                        if (cursorQuery2.moveToFirst()) {
                            str19 = str11;
                            while (true) {
                                com.google.android.gms.internal.measurement.zzej zzejVar6 = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzlb.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzaE();
                                numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                list5 = (List) arrayMap5.get(numValueOf3);
                                if (list5 == null) {
                                    zzasVar = zzasVar;
                                    arrayList2 = new ArrayList();
                                    arrayMap5.put(numValueOf3, arrayList2);
                                } else {
                                    zzasVar = zzasVar;
                                    arrayList2 = list5;
                                }
                                arrayList2.add(zzejVar6);
                                if (!cursorQuery2.moveToNext()) {
                                    break;
                                    break;
                                }
                                zzasVar = zzasVar;
                            }
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                            mapEmptyMap = arrayMap5;
                        } else {
                            str19 = str11;
                            zzasVar = zzasVar;
                            mapEmptyMap = Collections.emptyMap();
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                        }
                        arrayMap4.put(strZzh2, mapEmptyMap);
                    } else {
                        zzasVar = zzasVar;
                        str9 = str15;
                    }
                    it4 = mapEmptyMap.keySet().iterator();
                    while (it4.hasNext()) {
                        iIntValue2 = ((Integer) it4.next()).intValue();
                        set = this.zzb;
                        numValueOf2 = Integer.valueOf(iIntValue2);
                        if (set.contains(numValueOf2)) {
                            this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                        } else {
                            zZzd = true;
                            while (r5.hasNext()) {
                                zzxVar = new zzx(this, this.zza, iIntValue2, zzejVar3);
                                zZzd = zzxVar.zzd(this.zzd, this.zze, zzfsVarZza, j, zzasVar, zzf(iIntValue2, zzejVar3.zzb()));
                                if (zZzd) {
                                    this.zzb.add(Integer.valueOf(iIntValue2));
                                    break;
                                }
                                zzd(Integer.valueOf(iIntValue2)).zzc(zzxVar);
                            }
                            if (!zZzd) {
                                this.zzb.add(Integer.valueOf(iIntValue2));
                            }
                        }
                    }
                    zzwVar = zzwVar;
                    it3 = it3;
                    str15 = str9;
                }
            }
        }
        str12 = str15;
        if (!list2.isEmpty()) {
            arrayMap6 = new ArrayMap();
            it6 = list2.iterator();
            while (it6.hasNext()) {
                com.google.android.gms.internal.measurement.zzgl zzglVar3 = (com.google.android.gms.internal.measurement.zzgl) it6.next();
                strZzf = zzglVar3.zzf();
                mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                if (mapEmptyMap2 == null) {
                    zzamVarZzi4 = this.zzf.zzi();
                    str14 = this.zza;
                    zzamVarZzi4.zzW();
                    zzamVarZzi4.zzg();
                    Preconditions.checkNotEmpty(str14);
                    Preconditions.checkNotEmpty(strZzf);
                    arrayMap7 = new ArrayMap();
                    cursorQuery3 = zzamVarZzi4.zzh().query("property_filters", new String[]{str19, Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, "app_id=? AND property_name=?", new String[]{str14, strZzf}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        do {
                            com.google.android.gms.internal.measurement.zzes zzesVar4 = (com.google.android.gms.internal.measurement.zzes) ((com.google.android.gms.internal.measurement.zzer) zzlb.zzl(com.google.android.gms.internal.measurement.zzes.zzc(), cursorQuery3.getBlob(1))).zzaE();
                            numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                            arrayList4 = (List) arrayMap7.get(numValueOf7);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                arrayMap7.put(numValueOf7, arrayList4);
                            }
                            arrayList4.add(zzesVar4);
                        } while (cursorQuery3.moveToNext());
                        if (cursorQuery3 != null) {
                            cursorQuery3.close();
                        }
                        mapEmptyMap2 = arrayMap7;
                    } else {
                        mapEmptyMap2 = Collections.emptyMap();
                        if (cursorQuery3 != null) {
                            cursorQuery3.close();
                        }
                    }
                    arrayMap6.put(strZzf, mapEmptyMap2);
                }
                it7 = mapEmptyMap2.keySet().iterator();
                while (it7.hasNext()) {
                    iIntValue3 = ((Integer) it7.next()).intValue();
                    set2 = this.zzb;
                    numValueOf4 = Integer.valueOf(iIntValue3);
                    if (set2.contains(numValueOf4)) {
                        this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                        break;
                        break;
                    }
                    it8 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                    zZzd2 = true;
                    while (true) {
                        if (it8.hasNext()) {
                            zzesVar = (com.google.android.gms.internal.measurement.zzes) it8.next();
                            if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                zzem zzemVarZzj3 = this.zzs.zzay().zzj();
                                Integer numValueOf112 = Integer.valueOf(iIntValue3);
                                if (zzesVar.zzj()) {
                                    numValueOf6 = Integer.valueOf(zzesVar.zza());
                                } else {
                                    numValueOf6 = null;
                                }
                                zzemVarZzj3.zzd("Evaluating filter. audience, filter, property", numValueOf112, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzesVar));
                            }
                            if (zzesVar.zzj() || zzesVar.zza() > 256) {
                                zzem zzemVarZzk3 = this.zzs.zzay().zzk();
                                Object objZzn3 = zzeo.zzn(this.zza);
                                if (zzesVar.zzj()) {
                                    numValueOf5 = Integer.valueOf(zzesVar.zza());
                                } else {
                                    numValueOf5 = null;
                                }
                                zzemVarZzk3.zzc("Invalid property filter ID. appId, id", objZzn3, String.valueOf(numValueOf5));
                                this.zzb.add(Integer.valueOf(iIntValue3));
                            } else {
                                zzzVar = new zzz(this, this.zza, iIntValue3, zzesVar);
                                zZzd2 = zzzVar.zzd(this.zzd, this.zze, zzglVar3, zzf(iIntValue3, zzesVar.zza()));
                                if (zZzd2) {
                                    zzd(Integer.valueOf(iIntValue3)).zzc(zzzVar);
                                } else {
                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                }
                            }
                        }
                        if (!zZzd2) {
                            this.zzb.add(Integer.valueOf(iIntValue3));
                        }
                    }
                }
            }
        }
        arrayList3 = new ArrayList();
        Set setKeySet3 = this.zzc.keySet();
        setKeySet3.removeAll(this.zzb);
        it5 = setKeySet3.iterator();
        while (it5.hasNext()) {
            int iIntValue9 = ((Integer) it5.next()).intValue();
            Map map11 = this.zzc;
            Integer numValueOf113 = Integer.valueOf(iIntValue9);
            zzu zzuVar3 = (zzu) map11.get(numValueOf113);
            Preconditions.checkNotNull(zzuVar3);
            com.google.android.gms.internal.measurement.zzfo zzfoVarZza3 = zzuVar3.zza(iIntValue9);
            arrayList3.add(zzfoVarZza3);
            zzamVarZzi3 = this.zzf.zzi();
            str13 = this.zza;
            com.google.android.gms.internal.measurement.zzgh zzghVarZzd3 = zzfoVarZza3.zzd();
            zzamVarZzi3.zzW();
            zzamVarZzi3.zzg();
            Preconditions.checkNotEmpty(str13);
            Preconditions.checkNotNull(zzghVarZzd3);
            byte[] bArrZzbv3 = zzghVarZzd3.zzbv();
            contentValues = new ContentValues();
            contentValues.put("app_id", str13);
            String str210 = str19;
            contentValues.put(str210, numValueOf113);
            String str211 = str12;
            contentValues.put(str211, bArrZzbv3);
            if (zzamVarZzi3.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzamVarZzi3.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeo.zzn(str13));
            }
            str12 = str211;
            str19 = str210;
        }
        return arrayList3;
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    protected final boolean zzb() {
        return false;
    }
}
