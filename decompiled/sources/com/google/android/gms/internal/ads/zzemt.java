package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzemt implements zzesj {
    private final Set zza;

    zzemt(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzfye.zzh(new zzesi() { // from class: com.google.android.gms.internal.ads.zzems
            @Override // com.google.android.gms.internal.ads.zzesi
            public final void zzj(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
