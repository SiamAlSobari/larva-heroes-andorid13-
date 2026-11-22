package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeog implements zzesj {
    private final zzeyc zza;

    zzeog(zzeyc zzeycVar) {
        this.zza = zzeycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        zzeyc zzeycVar = this.zza;
        zzesi zzesiVar = null;
        if (zzeycVar != null && zzeycVar.zza() != null && !zzeycVar.zza().isEmpty()) {
            zzesiVar = new zzesi() { // from class: com.google.android.gms.internal.ads.zzeof
                @Override // com.google.android.gms.internal.ads.zzesi
                public final void zzj(Object obj) {
                    this.zza.zzc((Bundle) obj);
                }
            };
        }
        return zzfye.zzh(zzesiVar);
    }

    final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
