package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzavj {
    private final int zza;
    private final zzavg zzb = new zzavl();

    public zzavj(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzavi zzaviVar = new zzavi();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzavh(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzavk.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzavo.zzc(strArrZzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzaviVar.zzb.write(this.zzb.zzb(((zzavn) it.next()).zzb));
            } catch (IOException e) {
                zzcaa.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzaviVar.toString();
    }
}
