package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzamc implements zzalo {
    private final Map zza = new HashMap();
    private final zzalb zzb;
    private final BlockingQueue zzc;
    private final zzalg zzd;

    zzamc(zzalb zzalbVar, BlockingQueue blockingQueue, zzalg zzalgVar) {
        this.zzd = zzalgVar;
        this.zzb = zzalbVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzalo
    public final synchronized void zza(zzalp zzalpVar) {
        String strZzj = zzalpVar.zzj();
        List list = (List) this.zza.remove(strZzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzamb.zzb) {
            zzamb.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
        }
        zzalp zzalpVar2 = (zzalp) list.remove(0);
        this.zza.put(strZzj, list);
        zzalpVar2.zzu(this);
        try {
            this.zzc.put(zzalpVar2);
        } catch (InterruptedException e) {
            zzamb.zzb("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalo
    public final void zzb(zzalp zzalpVar, zzalv zzalvVar) {
        List list;
        zzaky zzakyVar = zzalvVar.zzb;
        if (zzakyVar == null || zzakyVar.zza(System.currentTimeMillis())) {
            zza(zzalpVar);
            return;
        }
        String strZzj = zzalpVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(strZzj);
        }
        if (list != null) {
            if (zzamb.zzb) {
                zzamb.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zzb((zzalp) it.next(), zzalvVar, null);
            }
        }
    }

    final synchronized boolean zzc(zzalp zzalpVar) {
        String strZzj = zzalpVar.zzj();
        if (!this.zza.containsKey(strZzj)) {
            this.zza.put(strZzj, null);
            zzalpVar.zzu(this);
            if (zzamb.zzb) {
                zzamb.zza("new request, sending to network %s", strZzj);
            }
            return false;
        }
        List arrayList = (List) this.zza.get(strZzj);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        zzalpVar.zzm("waiting-for-response");
        arrayList.add(zzalpVar);
        this.zza.put(strZzj, arrayList);
        if (zzamb.zzb) {
            zzamb.zza("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
        }
        return true;
    }
}
