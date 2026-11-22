package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzebl implements zzfya {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzebm zzb;

    zzebl(zzebm zzebmVar, boolean z) {
        this.zzb = zzebmVar;
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzcaa.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a9  */
    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listEmptyList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        byte b;
        zzayc zzaycVar;
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzf()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listEmptyList = Collections.emptyList();
            }
            arrayList = new ArrayList();
            it = listEmptyList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        b = 0;
                        break;
                    case "native":
                        b = 2;
                        break;
                    case "rewarded":
                        b = 3;
                        break;
                    case "interstitial":
                        b = 1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b != 0) {
                    zzaycVar = zzayc.BANNER;
                } else if (b != 1) {
                    zzaycVar = zzayc.INTERSTITIAL;
                } else if (b != 2) {
                    zzaycVar = zzayc.NATIVE_APP_INSTALL;
                } else if (b != 3) {
                    zzaycVar = zzayc.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzaycVar = zzayc.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzaycVar);
            }
            final zzazr zzazrVarZzb = zzebm.zzb(this.zzb, bundle);
            final zzazi zzaziVarZza = zzebm.zza(this.zzb, bundle);
            zzeba zzebaVar = this.zzb.zza;
            final boolean z = this.zza;
            zzebaVar.zza(new zzffh() { // from class: com.google.android.gms.internal.ads.zzebk
                @Override // com.google.android.gms.internal.ads.zzffh
                public final Object zza(Object obj3) {
                    zzebl zzeblVar = this.zza;
                    boolean z2 = z;
                    ArrayList arrayList2 = arrayList;
                    zzazi zzaziVar = zzaziVarZza;
                    zzazr zzazrVar = zzazrVarZzb;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (zzeblVar.zzb.zzf()) {
                        return null;
                    }
                    byte[] bArrZze = zzebm.zze(zzeblVar.zzb, z2, arrayList2, zzaziVar, zzazrVar);
                    zzebp.zzg(sQLiteDatabase, z2, true);
                    zzebp.zzd(sQLiteDatabase, zzeblVar.zzb.zzf.zzd(), bArrZze);
                    return null;
                }
            });
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listEmptyList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listEmptyList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r1.equals("banner")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case -1052618729:
                    if (!r1.equals("native")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -239580146:
                    if (!r1.equals("rewarded")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case 604727084:
                    if (!r1.equals("interstitial")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b != 0) {
                zzaycVar = zzayc.BANNER;
            } else if (b != 1) {
                zzaycVar = zzayc.INTERSTITIAL;
            } else if (b != 2) {
                zzaycVar = zzayc.NATIVE_APP_INSTALL;
            } else if (b != 3) {
                zzaycVar = zzayc.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                zzaycVar = zzayc.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(zzaycVar);
        }
        final zzazr zzazrVarZzb2 = zzebm.zzb(this.zzb, bundle);
        final zzazi zzaziVarZza2 = zzebm.zza(this.zzb, bundle);
        zzeba zzebaVar2 = this.zzb.zza;
        final boolean z2 = this.zza;
        zzebaVar2.zza(new zzffh() { // from class: com.google.android.gms.internal.ads.zzebk
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj4) {
                zzebl zzeblVar = this.zza;
                boolean z3 = z2;
                ArrayList arrayList3 = arrayList;
                zzazi zzaziVar = zzaziVarZza2;
                zzazr zzazrVar = zzazrVarZzb2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                if (zzeblVar.zzb.zzf()) {
                    return null;
                }
                byte[] bArrZze = zzebm.zze(zzeblVar.zzb, z3, arrayList3, zzaziVar, zzazrVar);
                zzebp.zzg(sQLiteDatabase, z3, true);
                zzebp.zzd(sQLiteDatabase, zzeblVar.zzb.zzf.zzd(), bArrZze);
                return null;
            }
        });
    }
}
