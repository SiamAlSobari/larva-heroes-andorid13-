package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbbv {
    static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbcw.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbdh.zza);
        zzc(arrayList, zzbdh.zzb);
        zzc(arrayList, zzbdh.zzc);
        zzc(arrayList, zzbdh.zzd);
        zzc(arrayList, zzbdh.zze);
        zzc(arrayList, zzbdh.zzu);
        zzc(arrayList, zzbdh.zzf);
        zzc(arrayList, zzbdh.zzm);
        zzc(arrayList, zzbdh.zzn);
        zzc(arrayList, zzbdh.zzo);
        zzc(arrayList, zzbdh.zzp);
        zzc(arrayList, zzbdh.zzq);
        zzc(arrayList, zzbdh.zzr);
        zzc(arrayList, zzbdh.zzs);
        zzc(arrayList, zzbdh.zzt);
        zzc(arrayList, zzbdh.zzg);
        zzc(arrayList, zzbdh.zzh);
        zzc(arrayList, zzbdh.zzi);
        zzc(arrayList, zzbdh.zzj);
        zzc(arrayList, zzbdh.zzk);
        zzc(arrayList, zzbdh.zzl);
        return arrayList;
    }

    static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbdu.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbcw zzbcwVar) {
        String str = (String) zzbcwVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
