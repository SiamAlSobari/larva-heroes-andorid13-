package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdsw implements zzdsg {
    private final long zza;
    private final zzdsl zzb;
    private final zzfav zzc;

    zzdsw(long j, Context context, zzdsl zzdslVar, zzchd zzchdVar, String str) {
        this.zza = j;
        this.zzb = zzdslVar;
        zzfax zzfaxVarZzv = zzchdVar.zzv();
        zzfaxVarZzv.zzb(context);
        zzfaxVarZzv.zza(str);
        this.zzc = zzfaxVarZzv.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzc.zzf(zzlVar, new zzdsu(this));
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdsv(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
        }
    }
}
