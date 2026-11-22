package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdmj extends zzbfp {
    private final Context zza;
    private final zzdic zzb;
    private zzdjc zzc;
    private zzdhx zzd;

    public zzdmj(Context context, zzdic zzdicVar, zzdjc zzdjcVar, zzdhx zzdhxVar) {
        this.zza = context;
        this.zzb = zzdicVar;
        this.zzc = zzdjcVar;
        this.zzd = zzdhxVar;
    }

    private final zzbej zzd(String str) {
        return new zzdmi(this, "_videoMediaView");
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final zzbet zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final zzbew zzg(String str) {
        return (zzbew) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final List zzk() {
        try {
            SimpleArrayMap simpleArrayMapZzh = this.zzb.zzh();
            SimpleArrayMap simpleArrayMapZzi = this.zzb.zzi();
            String[] strArr = new String[simpleArrayMapZzh.size() + simpleArrayMapZzi.size()];
            int i = 0;
            for (int i2 = 0; i2 < simpleArrayMapZzh.size(); i2++) {
                strArr[i] = (String) simpleArrayMapZzh.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < simpleArrayMapZzi.size(); i3++) {
                strArr[i] = (String) simpleArrayMapZzi.keyAt(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzl() {
        zzdhx zzdhxVar = this.zzd;
        if (zzdhxVar != null) {
            zzdhxVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzm() {
        try {
            String strZzC = this.zzb.zzC();
            if (strZzC != "Google" && (strZzC == null || !strZzC.equals("Google"))) {
                if (TextUtils.isEmpty(strZzC)) {
                    zzcaa.zzj("Not starting OMID session. OM partner name has not been configured.");
                    return;
                }
                zzdhx zzdhxVar = this.zzd;
                if (zzdhxVar != null) {
                    zzdhxVar.zzf(strZzC, false);
                    return;
                }
                return;
            }
            zzcaa.zzj("Illegal argument specified for omid partner name.");
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzn(String str) {
        zzdhx zzdhxVar = this.zzd;
        if (zzdhxVar != null) {
            zzdhxVar.zzD(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzo() {
        zzdhx zzdhxVar = this.zzd;
        if (zzdhxVar != null) {
            zzdhxVar.zzG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdhx zzdhxVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof View) || this.zzb.zzu() == null || (zzdhxVar = this.zzd) == null) {
            return;
        }
        zzdhxVar.zzH((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzq() {
        zzdhx zzdhxVar = this.zzd;
        return (zzdhxVar == null || zzdhxVar.zzU()) && this.zzb.zzr() != null && this.zzb.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdjc zzdjcVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdjcVar = this.zzc) == null || !zzdjcVar.zzf((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzq().zzao(zzd("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdjc zzdjcVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdjcVar = this.zzc) == null || !zzdjcVar.zzg((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzs().zzao(zzd("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzt() {
        zzfip zzfipVarZzu = this.zzb.zzu();
        if (zzfipVarZzu == null) {
            zzcaa.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzi(zzfipVarZzu);
        if (this.zzb.zzr() == null) {
            return true;
        }
        this.zzb.zzr().zzd("onSdkLoaded", new ArrayMap());
        return true;
    }
}
