package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrx {
    private final List zza = new ArrayList();
    private final Map zzb = new HashMap();
    private String zzc = "";
    private int zzd = 0;

    private zzrx() {
    }

    public final zzrv zza() {
        return new zzrv(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    public final zzrx zzb(zzrr zzrrVar) {
        String strZzm = com.google.android.gms.tagmanager.zzfu.zzm(com.google.android.gms.tagmanager.zzfu.zzk((zzam) zzrrVar.zzc().get(zzb.INSTANCE_NAME.toString())));
        List arrayList = (List) this.zzb.get(strZzm);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.zzb.put(strZzm, arrayList);
        }
        arrayList.add(zzrrVar);
        return this;
    }

    public final zzrx zzc(zzrz zzrzVar) {
        this.zza.add(zzrzVar);
        return this;
    }

    public final zzrx zzd(int i) {
        this.zzd = i;
        return this;
    }

    public final zzrx zze(String str) {
        this.zzc = str;
        return this;
    }

    /* synthetic */ zzrx(zzrw zzrwVar) {
    }
}
