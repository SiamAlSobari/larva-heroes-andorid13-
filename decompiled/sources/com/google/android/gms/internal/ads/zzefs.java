package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzefs implements zzdfy {
    private final zzfbe zza;
    private final zzbqc zzb;
    private final AdFormat zzc;
    private zzcxa zzd = null;

    zzefs(zzfbe zzfbeVar, zzbqc zzbqcVar, AdFormat adFormat) {
        this.zza = zzfbeVar;
        this.zzb = zzbqcVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdfy
    public final void zza(boolean z, Context context, zzcwv zzcwvVar) throws zzdfx {
        boolean zZzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 6) {
                        zZzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                    }
                    throw new zzdfx("Adapter failed to show.");
                }
                zZzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            }
            if (zZzs) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbt)).booleanValue() || this.zza.zzZ != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzdfx("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdfx(th);
        }
    }

    public final void zzb(zzcxa zzcxaVar) {
        this.zzd = zzcxaVar;
    }
}
