package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzakx;
import com.google.android.gms.internal.ads.zzals;
import com.google.android.gms.internal.ads.zzamv;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcas;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzbo {
    private static zzals zzb;
    private static final Object zzc = new Object();

    @Deprecated
    public static final zzbj zza = new zzbg();

    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:15:0x0039, B:14:0x0034, B:16:0x003b), top: B:21:0x0010 }] */
    public zzbo(Context context) {
        zzals zzalsVarZza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbbr.zza(context);
                if (ClientLibraryUtils.isPackageSide()) {
                    zzalsVarZza = zzamv.zza(context, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzem)).booleanValue()) {
                        zzalsVarZza = zzax.zzb(context);
                    } else {
                        zzalsVarZza = zzamv.zza(context, null);
                    }
                }
                zzb = zzalsVarZza;
            }
        }
    }

    public final ListenableFuture zza(String str) {
        zzcas zzcasVar = new zzcas();
        zzb.zza(new zzbn(str, null, zzcasVar));
        return zzcasVar;
    }

    public final ListenableFuture zzb(int i, String str, Map map, byte[] bArr) {
        zzbl zzblVar = new zzbl(null);
        zzbh zzbhVar = new zzbh(this, str, zzblVar);
        zzbzz zzbzzVar = new zzbzz(null);
        zzbi zzbiVar = new zzbi(this, i, str, zzblVar, zzbhVar, bArr, map, zzbzzVar);
        if (zzbzz.zzk()) {
            try {
                zzbzzVar.zzd(str, ShareTarget.METHOD_GET, zzbiVar.zzl(), zzbiVar.zzx());
            } catch (zzakx e) {
                zzcaa.zzj(e.getMessage());
            }
        }
        zzb.zza(zzbiVar);
        return zzblVar;
    }
}
