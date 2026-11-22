package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzdkd implements zzdik {
    private final zzbou zza;
    private final zzcxa zzb;
    private final zzcwg zzc;
    private final zzddu zzd;
    private final Context zze;
    private final zzfbe zzf;
    private final zzcag zzg;
    private final zzfca zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzboq zzl;
    private final zzbor zzm;

    public zzdkd(zzboq zzboqVar, zzbor zzborVar, zzbou zzbouVar, zzcxa zzcxaVar, zzcwg zzcwgVar, zzddu zzdduVar, Context context, zzfbe zzfbeVar, zzcag zzcagVar, zzfca zzfcaVar) {
        this.zzl = zzboqVar;
        this.zzm = zzborVar;
        this.zza = zzbouVar;
        this.zzb = zzcxaVar;
        this.zzc = zzcwgVar;
        this.zzd = zzdduVar;
        this.zze = context;
        this.zzf = zzfbeVar;
        this.zzg = zzcagVar;
        this.zzh = zzfcaVar;
    }

    private final void zzb(View view) {
        try {
            zzbou zzbouVar = this.zza;
            if (zzbouVar != null && !zzbouVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
                    this.zzd.zzbK();
                    return;
                }
                return;
            }
            zzboq zzboqVar = this.zzl;
            if (zzboqVar != null && !zzboqVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
                    this.zzd.zzbK();
                    return;
                }
                return;
            }
            zzbor zzborVar = this.zzm;
            if (zzborVar == null || zzborVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
                this.zzd.zzbK();
            }
        } catch (RemoteException e) {
            zzcaa.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    map2.put((String) entry.getKey(), view);
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzB() {
        return this.zzf.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        zzcaa.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzk(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            zzcaa.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzf.zzM) {
            zzb(view2);
        } else {
            zzcaa.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbou zzbouVar = this.zza;
                if (zzbouVar != null && !zzbouVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzboq zzboqVar = this.zzl;
                if (zzboqVar != null && !zzboqVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbor zzborVar = this.zzm;
                if (zzborVar == null || zzborVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            zzcaa.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        zzcaa.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzx(zzbgq zzbgqVar) {
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ce A[Catch: JSONException -> 0x0044, RemoteException -> 0x0124, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0044, blocks: (B:48:0x00b3, B:49:0x00c8, B:51:0x00ce), top: B:72:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00c8 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ClassLoader classLoader;
        Iterator it;
        IObjectWrapper iObjectWrapperZzn;
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzak;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbu)).booleanValue() && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbv)).booleanValue() && next.equals("3010")) {
                                zzbou zzbouVar = this.zza;
                                Object objUnwrap = null;
                                if (zzbouVar != null) {
                                    try {
                                        iObjectWrapperZzn = zzbouVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzboq zzboqVar = this.zzl;
                                    if (zzboqVar != null) {
                                        iObjectWrapperZzn = zzboqVar.zzk();
                                    } else {
                                        zzbor zzborVar = this.zzm;
                                        iObjectWrapperZzn = zzborVar != null ? zzborVar.zzj() : null;
                                    }
                                }
                                if (iObjectWrapperZzn != null) {
                                    objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzn);
                                }
                                if (objUnwrap != null) {
                                    cls = objUnwrap.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbu.zzc(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.zzt.zzp();
                                    classLoader = this.zze.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbu.zzc(jSONArrayOptJSONArray, arrayList2);
                                    com.google.android.gms.ads.internal.zzt.zzp();
                                    classLoader = this.zze.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzk = z;
            HashMap mapZzc = zzc(map);
            HashMap mapZzc2 = zzc(map2);
            zzbou zzbouVar2 = this.zza;
            if (zzbouVar2 != null) {
                zzbouVar2.zzy(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzc), ObjectWrapper.wrap(mapZzc2));
                return;
            }
            zzboq zzboqVar2 = this.zzl;
            if (zzboqVar2 != null) {
                zzboqVar2.zzv(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzc), ObjectWrapper.wrap(mapZzc2));
                this.zzl.zzu(iObjectWrapperWrap);
                return;
            }
            zzbor zzborVar2 = this.zzm;
            if (zzborVar2 != null) {
                zzborVar2.zzt(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzc), ObjectWrapper.wrap(mapZzc2));
                this.zzm.zzs(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            zzcaa.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzz(View view, Map map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbou zzbouVar = this.zza;
            if (zzbouVar != null) {
                zzbouVar.zzz(iObjectWrapperWrap);
                return;
            }
            zzboq zzboqVar = this.zzl;
            if (zzboqVar != null) {
                zzboqVar.zzw(iObjectWrapperWrap);
                return;
            }
            zzbor zzborVar = this.zzm;
            if (zzborVar != null) {
                zzborVar.zzu(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            zzcaa.zzk("Failed to call untrackView", e);
        }
    }
}
