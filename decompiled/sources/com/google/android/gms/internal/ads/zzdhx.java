package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdhx extends zzcse {
    public static final zzfud zzc = zzfud.zzq("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzauh zzA;
    private final Executor zzd;
    private final zzdic zze;
    private final zzdik zzf;
    private final zzdjc zzg;
    private final zzdih zzh;
    private final zzdin zzi;
    private final zzgyn zzj;
    private final zzgyn zzk;
    private final zzgyn zzl;
    private final zzgyn zzm;
    private final zzgyn zzn;
    private zzdjy zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbxn zzs;
    private final zzaqx zzt;
    private final zzcag zzu;
    private final Context zzv;
    private final zzdhz zzw;
    private final zzela zzx;
    private final Map zzy;
    private final List zzz;

    public zzdhx(zzcsd zzcsdVar, Executor executor, zzdic zzdicVar, zzdik zzdikVar, zzdjc zzdjcVar, zzdih zzdihVar, zzdin zzdinVar, zzgyn zzgynVar, zzgyn zzgynVar2, zzgyn zzgynVar3, zzgyn zzgynVar4, zzgyn zzgynVar5, zzbxn zzbxnVar, zzaqx zzaqxVar, zzcag zzcagVar, Context context, zzdhz zzdhzVar, zzela zzelaVar, zzauh zzauhVar) {
        super(zzcsdVar);
        this.zzd = executor;
        this.zze = zzdicVar;
        this.zzf = zzdikVar;
        this.zzg = zzdjcVar;
        this.zzh = zzdihVar;
        this.zzi = zzdinVar;
        this.zzj = zzgynVar;
        this.zzk = zzgynVar2;
        this.zzl = zzgynVar3;
        this.zzm = zzgynVar4;
        this.zzn = zzgynVar5;
        this.zzs = zzbxnVar;
        this.zzt = zzaqxVar;
        this.zzu = zzcagVar;
        this.zzv = context;
        this.zzw = zzdhzVar;
        this.zzx = zzelaVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzauhVar;
    }

    public static boolean zzV(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjD)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        long jZzt = com.google.android.gms.ads.internal.util.zzs.zzt(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jZzt >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjE)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzX(Map map) {
        if (map == null) {
            return null;
        }
        zzfud zzfudVar = zzc;
        int size = zzfudVar.size();
        int i = 0;
        while (i < size) {
            WeakReference weakReference = (WeakReference) map.get((String) zzfudVar.get(i));
            i++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzY() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhF)).booleanValue()) {
            return null;
        }
        zzdjy zzdjyVar = this.zzo;
        if (zzdjyVar == null) {
            zzcaa.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper iObjectWrapperZzj = zzdjyVar.zzj();
        if (iObjectWrapperZzj != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzj);
        }
        return zzdjc.zza;
    }

    private final void zzZ(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeX)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        ListenableFuture listenableFutureZzw = this.zze.zzw();
        if (listenableFutureZzw == null) {
            return;
        }
        zzfye.zzr(listenableFutureZzw, new zzdhv(this, "Google", true), this.zzd);
    }

    private final synchronized void zzaa(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzY());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzab(View view, zzfip zzfipVar) {
        zzcfi zzcfiVarZzr = this.zze.zzr();
        if (!this.zzh.zzd() || zzfipVar == null || zzcfiVarZzr == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzh(zzfipVar, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzx(zzdjy zzdjyVar) {
        Iterator<String> itKeys;
        View view;
        if (this.zzp) {
            return;
        }
        this.zzo = zzdjyVar;
        this.zzg.zze(zzdjyVar);
        this.zzf.zzy(zzdjyVar.zzf(), zzdjyVar.zzm(), zzdjyVar.zzn(), zzdjyVar, zzdjyVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcr)).booleanValue()) {
            this.zzt.zzc().zzo(zzdjyVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbH)).booleanValue()) {
            zzfbe zzfbeVar = this.zzb;
            if (zzfbeVar.zzal && (itKeys = zzfbeVar.zzak.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                    this.zzy.put(next, false);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        zzaug zzaugVar = new zzaug(this.zzv, view);
                        this.zzz.add(zzaugVar);
                        zzaugVar.zzc(new zzdhu(this, next));
                    }
                }
            }
        }
        if (zzdjyVar.zzi() != null) {
            zzdjyVar.zzi().zzc(this.zzs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzy(zzdjy zzdjyVar) {
        this.zzf.zzz(zzdjyVar.zzf(), zzdjyVar.zzl());
        if (zzdjyVar.zzh() != null) {
            zzdjyVar.zzh().setClickable(false);
            zzdjyVar.zzh().removeAllViews();
        }
        if (zzdjyVar.zzi() != null) {
            zzdjyVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public final synchronized void zzA(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzf.zzj(zzcwVar);
    }

    public final synchronized void zzB(View view, View view2, Map map, Map map2, boolean z) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzk(view, view2, map, map2, z, zzY());
        if (this.zzr) {
            zzdic zzdicVar = this.zze;
            if (zzdicVar.zzs() != null) {
                zzdicVar.zzs().zzd("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    public final synchronized void zzC(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkm)).booleanValue()) {
            zzdjy zzdjyVar = this.zzo;
            if (zzdjyVar == null) {
                zzcaa.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdjyVar instanceof zzdiw;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhn
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzv(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized void zzD(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzE(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzF() {
        zzdjy zzdjyVar = this.zzo;
        if (zzdjyVar == null) {
            zzcaa.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdjyVar instanceof zzdiw;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhr
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzw(z);
                }
            });
        }
    }

    public final synchronized void zzG() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzr();
    }

    public final void zzH(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeX)).booleanValue()) {
            zzab(view, this.zze.zzu());
            return;
        }
        zzcas zzcasVarZzp = this.zze.zzp();
        if (zzcasVarZzp == null) {
            return;
        }
        zzfye.zzr(zzcasVarZzp, new zzdhw(this, view), this.zzd);
    }

    public final synchronized void zzI(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzJ(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzK(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzL() {
        this.zzf.zzv();
    }

    public final synchronized void zzM(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzw(zzcsVar);
    }

    public final synchronized void zzN(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzx.zza(zzdgVar);
    }

    public final synchronized void zzO(zzbgq zzbgqVar) {
        this.zzf.zzx(zzbgqVar);
    }

    public final synchronized void zzP(final zzdjy zzdjyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbF)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhs
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx(zzdjyVar);
                }
            });
        } else {
            zzx(zzdjyVar);
        }
    }

    public final synchronized void zzQ(final zzdjy zzdjyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbF)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdho
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzy(zzdjyVar);
                }
            });
        } else {
            zzy(zzdjyVar);
        }
    }

    public final boolean zzR() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzS() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzT() {
        return this.zzf.zzB();
    }

    public final boolean zzU() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzW(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzC = this.zzf.zzC(bundle);
        this.zzq = zZzC;
        return zZzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcse
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdht
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzu();
            }
        });
        super.zzb();
    }

    public final zzdhz zzc() {
        return this.zzw;
    }

    public final zzfip zzf(String str, boolean z) {
        String str2;
        zzedh zzedhVar;
        zzedi zzediVar;
        String str3;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        zzdic zzdicVar = this.zze;
        zzcfi zzcfiVarZzr = zzdicVar.zzr();
        zzcfi zzcfiVarZzs = zzdicVar.zzs();
        if (zzcfiVarZzr == null && zzcfiVarZzs == null) {
            zzcaa.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z2 = false;
        boolean z3 = zzcfiVarZzr != null;
        boolean z4 = zzcfiVarZzs != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeV)).booleanValue()) {
            this.zzh.zza();
            int iZzb = this.zzh.zza().zzb();
            int i = iZzb - 1;
            if (i != 0) {
                if (i != 1) {
                    if (iZzb != 1) {
                        str3 = iZzb != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = "VIDEO";
                    }
                    zzcaa.zzj("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                    return null;
                }
                if (zzcfiVarZzr == null) {
                    zzcaa.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
                z2 = true;
                z4 = false;
            } else {
                if (zzcfiVarZzs == null) {
                    zzcaa.zzj("Omid media type was video but there was no video webview.");
                    return null;
                }
                z4 = true;
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzcfiVarZzr = zzcfiVarZzs;
        }
        zzcfiVarZzr.zzG();
        if (!com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zzv)) {
            zzcaa.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        zzcag zzcagVar = this.zzu;
        String str4 = zzcagVar.zzb + "." + zzcagVar.zzc;
        if (z4) {
            zzedhVar = zzedh.VIDEO;
            zzediVar = zzedi.DEFINED_BY_JAVASCRIPT;
        } else {
            zzedhVar = zzedh.NATIVE_DISPLAY;
            zzediVar = this.zze.zzc() == 3 ? zzedi.UNSPECIFIED : zzedi.ONE_PIXEL;
        }
        zzfip zzfipVarZzb = com.google.android.gms.ads.internal.zzt.zzA().zzb(str4, zzcfiVarZzr.zzG(), "", "javascript", str2, str, zzediVar, zzedhVar, this.zzb.zzam);
        if (zzfipVarZzb == null) {
            zzcaa.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.zze.zzW(zzfipVarZzb);
        zzcfiVarZzr.zzap(zzfipVarZzb);
        if (z4) {
            com.google.android.gms.ads.internal.zzt.zzA().zzh(zzfipVarZzb, zzcfiVarZzs.zzF());
            this.zzr = true;
        }
        if (z) {
            com.google.android.gms.ads.internal.zzt.zzA().zzi(zzfipVarZzb);
            zzcfiVarZzr.zzd("onSdkLoaded", new ArrayMap());
        }
        return zzfipVarZzb;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzcse
    public final void zzj() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhp
            @Override // java.lang.Runnable
            public final void run() {
                zzdhx.zzq(this.zza);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdik zzdikVar = this.zzf;
            zzdikVar.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhq
                @Override // java.lang.Runnable
                public final void run() {
                    zzdikVar.zzp();
                }
            });
        }
        super.zzj();
    }

    public final synchronized JSONObject zzk(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzY());
    }

    public final void zzs(View view) {
        zzfip zzfipVarZzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzfipVarZzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzf(zzfipVarZzu, view);
    }

    public final synchronized void zzt() {
        this.zzf.zzh();
    }

    final /* synthetic */ void zzu() {
        this.zzf.zzi();
        this.zze.zzI();
    }

    final /* synthetic */ void zzv(View view, boolean z, int i) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzY(), i);
    }

    final /* synthetic */ void zzw(boolean z) {
        this.zzf.zzo(null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzY(), 0);
    }

    public final synchronized void zzz(View view, Map map, Map map2, boolean z) {
        if (this.zzq) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbH)).booleanValue() && this.zzb.zzal) {
            Iterator it = this.zzy.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) this.zzy.get((String) it.next())).booleanValue()) {
                    return;
                }
            }
        }
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdH)).booleanValue() && map != null) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                    if (view2 != null && zzV(view2)) {
                        zzaa(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View viewZzX = zzX(map);
        if (viewZzX == null) {
            zzaa(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdI)).booleanValue()) {
            if (zzV(viewZzX)) {
                zzaa(view, map, map2);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdJ)).booleanValue()) {
            zzaa(view, map, map2);
            return;
        }
        Rect rect = new Rect();
        if (viewZzX.getGlobalVisibleRect(rect, null) && viewZzX.getHeight() == rect.height() && viewZzX.getWidth() == rect.width()) {
            zzaa(view, map, map2);
        }
    }

    public static /* synthetic */ void zzq(zzdhx zzdhxVar) {
        try {
            zzdic zzdicVar = zzdhxVar.zze;
            int iZzc = zzdicVar.zzc();
            if (iZzc == 1) {
                if (zzdhxVar.zzi.zzb() != null) {
                    zzdhxVar.zzZ("Google", true);
                    zzdhxVar.zzi.zzb().zze((zzbfn) zzdhxVar.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 2) {
                if (zzdhxVar.zzi.zza() != null) {
                    zzdhxVar.zzZ("Google", true);
                    zzdhxVar.zzi.zza().zze((zzbfl) zzdhxVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 3) {
                if (zzdhxVar.zzi.zzd(zzdicVar.zzA()) != null) {
                    if (zzdhxVar.zze.zzs() != null) {
                        zzdhxVar.zzf("Google", true);
                    }
                    zzdhxVar.zzi.zzd(zzdhxVar.zze.zzA()).zze((zzbfq) zzdhxVar.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 6) {
                if (zzdhxVar.zzi.zzf() != null) {
                    zzdhxVar.zzZ("Google", true);
                    zzdhxVar.zzi.zzf().zze((zzbgt) zzdhxVar.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzc != 7) {
                zzcaa.zzg("Wrong native template id!");
                return;
            }
            zzdin zzdinVar = zzdhxVar.zzi;
            if (zzdinVar.zzg() != null) {
                zzdinVar.zzg().zzg((zzbld) zzdhxVar.zzm.zzb());
            }
        } catch (RemoteException e) {
            zzcaa.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }
}
