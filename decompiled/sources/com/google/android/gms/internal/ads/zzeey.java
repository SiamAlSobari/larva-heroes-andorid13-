package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeey implements zzedt {
    private final Context zza;
    private final zzcqz zzb;
    private View zzc;
    private zzboo zzd;

    public zzeey(Context context, zzcqz zzcqzVar) {
        this.zza = context;
        this.zzb = zzcqzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, final zzfbe zzfbeVar, final zzedq zzedqVar) throws zzehf, zzfcf {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbeVar.zzah) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfcf(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzeeu
                            @Override // com.google.android.gms.internal.ads.zzfxl
                            public final ListenableFuture zza(Object obj) {
                                return this.zza.zzc(view, zzfbeVar, obj);
                            }
                        }, zzcan.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfcf(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfcf(e2);
            }
        } else {
            view = this.zzc;
        }
        zzcqd zzcqdVarZza = this.zzb.zza(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzcqj(view, null, new zzcsc() { // from class: com.google.android.gms.internal.ads.zzeev
            @Override // com.google.android.gms.internal.ads.zzcsc
            public final com.google.android.gms.ads.internal.client.zzdq zza() throws zzfcf {
                try {
                    return ((zzbqc) zzedqVar.zzb).zze();
                } catch (RemoteException e3) {
                    throw new zzfcf(e3);
                }
            }
        }, (zzfbf) zzfbeVar.zzv.get(0)));
        zzcqdVarZza.zzg().zza(view);
        ((zzefj) zzedqVar.zzc).zzc(zzcqdVarZza.zzi());
        return zzcqdVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        try {
            ((zzbqc) zzedqVar.zzb).zzq(zzfbeVar.zzaa);
            zzeew zzeewVar = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbeVar.zzah) {
                ((zzbqc) zzedqVar.zzb).zzk(zzfbeVar.zzV, zzfbeVar.zzw.toString(), zzfbrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeex(this, zzedqVar, zzeewVar), (zzbol) zzedqVar.zzc, zzfbrVar.zza.zza.zze);
            } else {
                ((zzbqc) zzedqVar.zzb).zzj(zzfbeVar.zzV, zzfbeVar.zzw.toString(), zzfbrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeex(this, zzedqVar, zzeewVar), (zzbol) zzedqVar.zzc, zzfbrVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfcf(e);
        }
    }

    final /* synthetic */ ListenableFuture zzc(View view, zzfbe zzfbeVar, Object obj) throws Exception {
        return zzfye.zzh(zzcrq.zza(this.zza, view, zzfbeVar));
    }
}
