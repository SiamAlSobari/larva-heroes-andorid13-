package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdiw;
import com.google.android.gms.internal.ads.zzdiy;
import com.google.android.gms.internal.ads.zzdsp;
import com.google.android.gms.internal.ads.zzeka;
import com.google.android.gms.internal.ads.zzewe;
import com.google.android.gms.internal.ads.zzexs;
import com.google.android.gms.internal.ads.zzezj;
import com.google.android.gms.internal.ads.zzfax;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends zzcd {
    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbof zzbofVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzeka(zzchd.zzb(context, zzbofVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbof zzbofVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzewe zzeweVarZzs = zzchd.zzb(context, zzbofVar, i).zzs();
        zzeweVarZzs.zza(str);
        zzeweVarZzs.zzb(context);
        return i >= ((Integer) zzba.zzc().zzb(zzbbr.zzfc)).intValue() ? zzeweVarZzs.zzc().zza() : new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbof zzbofVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzexs zzexsVarZzt = zzchd.zzb(context, zzbofVar, i).zzt();
        zzexsVarZzt.zzc(context);
        zzexsVarZzt.zza(zzqVar);
        zzexsVarZzt.zzb(str);
        return zzexsVarZzt.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbof zzbofVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezj zzezjVarZzu = zzchd.zzb(context, zzbofVar, i).zzu();
        zzezjVarZzu.zzc(context);
        zzezjVarZzu.zza(zzqVar);
        zzezjVarZzu.zzb(str);
        return zzezjVarZzu.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzqVar, str, new zzcag(233012000, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) {
        return zzchd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i).zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i) {
        return zzchd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbofVar, i).zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfa zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdiy((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 233012000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfg zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdiw((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbjs zzk(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i, zzbjp zzbjpVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdsp zzdspVarZzj = zzchd.zzb(context, zzbofVar, i).zzj();
        zzdspVarZzj.zzb(context);
        zzdspVarZzj.zza(zzbjpVar);
        return zzdspVarZzj.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrv zzl(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i) {
        return zzchd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbofVar, i).zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbsc zzm(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
        }
        int i = adOverlayInfoParcelZza.zzk;
        if (i == 1) {
            return new com.google.android.gms.ads.internal.overlay.zzs(activity);
        }
        if (i == 2) {
            return new zzae(activity);
        }
        if (i == 3) {
            return new zzaf(activity);
        }
        if (i != 4) {
            return i != 5 ? new com.google.android.gms.ads.internal.overlay.zzt(activity) : new zzac(activity);
        }
        return new zzy(activity, adOverlayInfoParcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvg zzn(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfax zzfaxVarZzv = zzchd.zzb(context, zzbofVar, i).zzv();
        zzfaxVarZzv.zzb(context);
        return zzfaxVarZzv.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvw zzo(IObjectWrapper iObjectWrapper, String str, zzbof zzbofVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfax zzfaxVarZzv = zzchd.zzb(context, zzbofVar, i).zzv();
        zzfaxVarZzv.zzb(context);
        zzfaxVarZzv.zza(str);
        return zzfaxVarZzv.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyr zzp(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i) {
        return zzchd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbofVar, i).zzp();
    }
}
