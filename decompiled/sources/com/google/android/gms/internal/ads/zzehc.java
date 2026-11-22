package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehc {
    private final Clock zza;
    private final zzehd zzb;
    private final zzfik zzc;
    private final List zzd = Collections.synchronizedList(new ArrayList());
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgK)).booleanValue();
    private final zzeds zzf;

    public zzehc(Clock clock, zzehd zzehdVar, zzeds zzedsVar, zzfik zzfikVar) {
        this.zza = clock;
        this.zzb = zzehdVar;
        this.zzf = zzedsVar;
        this.zzc = zzfikVar;
    }

    static /* bridge */ /* synthetic */ void zzg(zzehc zzehcVar, String str, int i, long j, String str2, Integer num) {
        String str3 = str + "." + i + "." + j;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbz)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        zzehcVar.zzd.add(str3);
    }

    final ListenableFuture zze(zzfbr zzfbrVar, zzfbe zzfbeVar, ListenableFuture listenableFuture, zzfig zzfigVar) {
        zzfbi zzfbiVar = zzfbrVar.zzb.zzb;
        long jElapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfbeVar.zzx;
        if (str != null) {
            zzfye.zzr(listenableFuture, new zzehb(this, jElapsedRealtime, str, zzfbeVar, zzfbiVar, zzfigVar, zzfbrVar), zzcan.zzf);
        }
        return listenableFuture;
    }

    public final String zzf() {
        return TextUtils.join("_", this.zzd);
    }
}
