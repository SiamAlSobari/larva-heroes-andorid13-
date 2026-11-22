package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzami {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzami(String str, zzaky zzakyVar) {
        String str2 = zzakyVar.zzb;
        long j = zzakyVar.zzc;
        long j2 = zzakyVar.zzd;
        long j3 = zzakyVar.zze;
        long j4 = zzakyVar.zzf;
        List arrayList = zzakyVar.zzh;
        if (arrayList == null) {
            Map map = zzakyVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzalh((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    static zzami zza(zzamj zzamjVar) throws IOException {
        if (zzaml.zze(zzamjVar) != 538247942) {
            throw new IOException();
        }
        String strZzh = zzaml.zzh(zzamjVar);
        String strZzh2 = zzaml.zzh(zzamjVar);
        long jZzf = zzaml.zzf(zzamjVar);
        long jZzf2 = zzaml.zzf(zzamjVar);
        long jZzf3 = zzaml.zzf(zzamjVar);
        long jZzf4 = zzaml.zzf(zzamjVar);
        int iZze = zzaml.zze(zzamjVar);
        if (iZze < 0) {
            throw new IOException("readHeaderList size=" + iZze);
        }
        List listEmptyList = iZze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < iZze; i++) {
            listEmptyList.add(new zzalh(zzaml.zzh(zzamjVar).intern(), zzaml.zzh(zzamjVar).intern()));
        }
        return new zzami(strZzh, strZzh2, jZzf, jZzf2, jZzf3, jZzf4, listEmptyList);
    }

    private zzami(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
