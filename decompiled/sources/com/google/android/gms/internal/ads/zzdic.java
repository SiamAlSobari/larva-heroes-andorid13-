package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdic {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzbeo zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzel zzg;
    private Bundle zzh;
    private zzcfi zzi;
    private zzcfi zzj;
    private zzcfi zzk;
    private zzfip zzl;
    private ListenableFuture zzm;
    private zzcas zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbew zzs;
    private zzbew zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    public static zzdic zzag(zzboq zzboqVar) {
        try {
            zzdib zzdibVarZzak = zzak(zzboqVar.zzg(), null);
            zzbeo zzbeoVarZzh = zzboqVar.zzh();
            View view = (View) zzam(zzboqVar.zzj());
            String strZzo = zzboqVar.zzo();
            List listZzr = zzboqVar.zzr();
            String strZzm = zzboqVar.zzm();
            Bundle bundleZzf = zzboqVar.zzf();
            String strZzn = zzboqVar.zzn();
            View view2 = (View) zzam(zzboqVar.zzk());
            IObjectWrapper iObjectWrapperZzl = zzboqVar.zzl();
            String strZzq = zzboqVar.zzq();
            String strZzp = zzboqVar.zzp();
            double dZze = zzboqVar.zze();
            zzbew zzbewVarZzi = zzboqVar.zzi();
            zzdic zzdicVar = new zzdic();
            zzdicVar.zza = 2;
            zzdicVar.zzb = zzdibVarZzak;
            zzdicVar.zzc = zzbeoVarZzh;
            zzdicVar.zzd = view;
            zzdicVar.zzZ("headline", strZzo);
            zzdicVar.zze = listZzr;
            zzdicVar.zzZ("body", strZzm);
            zzdicVar.zzh = bundleZzf;
            zzdicVar.zzZ("call_to_action", strZzn);
            zzdicVar.zzo = view2;
            zzdicVar.zzq = iObjectWrapperZzl;
            zzdicVar.zzZ("store", strZzq);
            zzdicVar.zzZ("price", strZzp);
            zzdicVar.zzr = dZze;
            zzdicVar.zzs = zzbewVarZzi;
            return zzdicVar;
        } catch (RemoteException e) {
            zzcaa.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdic zzah(zzbor zzborVar) {
        try {
            zzdib zzdibVarZzak = zzak(zzborVar.zzf(), null);
            zzbeo zzbeoVarZzg = zzborVar.zzg();
            View view = (View) zzam(zzborVar.zzi());
            String strZzo = zzborVar.zzo();
            List listZzp = zzborVar.zzp();
            String strZzm = zzborVar.zzm();
            Bundle bundleZze = zzborVar.zze();
            String strZzn = zzborVar.zzn();
            View view2 = (View) zzam(zzborVar.zzj());
            IObjectWrapper iObjectWrapperZzk = zzborVar.zzk();
            String strZzl = zzborVar.zzl();
            zzbew zzbewVarZzh = zzborVar.zzh();
            zzdic zzdicVar = new zzdic();
            zzdicVar.zza = 1;
            zzdicVar.zzb = zzdibVarZzak;
            zzdicVar.zzc = zzbeoVarZzg;
            zzdicVar.zzd = view;
            zzdicVar.zzZ("headline", strZzo);
            zzdicVar.zze = listZzp;
            zzdicVar.zzZ("body", strZzm);
            zzdicVar.zzh = bundleZze;
            zzdicVar.zzZ("call_to_action", strZzn);
            zzdicVar.zzo = view2;
            zzdicVar.zzq = iObjectWrapperZzk;
            zzdicVar.zzZ("advertiser", strZzl);
            zzdicVar.zzt = zzbewVarZzh;
            return zzdicVar;
        } catch (RemoteException e) {
            zzcaa.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdic zzai(zzboq zzboqVar) {
        try {
            return zzal(zzak(zzboqVar.zzg(), null), zzboqVar.zzh(), (View) zzam(zzboqVar.zzj()), zzboqVar.zzo(), zzboqVar.zzr(), zzboqVar.zzm(), zzboqVar.zzf(), zzboqVar.zzn(), (View) zzam(zzboqVar.zzk()), zzboqVar.zzl(), zzboqVar.zzq(), zzboqVar.zzp(), zzboqVar.zze(), zzboqVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            zzcaa.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdic zzaj(zzbor zzborVar) {
        try {
            return zzal(zzak(zzborVar.zzf(), null), zzborVar.zzg(), (View) zzam(zzborVar.zzi()), zzborVar.zzo(), zzborVar.zzp(), zzborVar.zzm(), zzborVar.zze(), zzborVar.zzn(), (View) zzam(zzborVar.zzj()), zzborVar.zzk(), null, null, -1.0d, zzborVar.zzh(), zzborVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            zzcaa.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdib zzak(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbou zzbouVar) {
        if (zzdqVar == null) {
            return null;
        }
        return new zzdib(zzdqVar, zzbouVar);
    }

    private static zzdic zzal(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbeo zzbeoVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbew zzbewVar, String str6, float f) {
        zzdic zzdicVar = new zzdic();
        zzdicVar.zza = 6;
        zzdicVar.zzb = zzdqVar;
        zzdicVar.zzc = zzbeoVar;
        zzdicVar.zzd = view;
        zzdicVar.zzZ("headline", str);
        zzdicVar.zze = list;
        zzdicVar.zzZ("body", str2);
        zzdicVar.zzh = bundle;
        zzdicVar.zzZ("call_to_action", str3);
        zzdicVar.zzo = view2;
        zzdicVar.zzq = iObjectWrapper;
        zzdicVar.zzZ("store", str4);
        zzdicVar.zzZ("price", str5);
        zzdicVar.zzr = d;
        zzdicVar.zzs = zzbewVar;
        zzdicVar.zzZ("advertiser", str6);
        zzdicVar.zzR(f);
        return zzdicVar;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdic zzt(zzbou zzbouVar) {
        try {
            return zzal(zzak(zzbouVar.zzj(), zzbouVar), zzbouVar.zzk(), (View) zzam(zzbouVar.zzm()), zzbouVar.zzs(), zzbouVar.zzv(), zzbouVar.zzq(), zzbouVar.zzi(), zzbouVar.zzr(), (View) zzam(zzbouVar.zzn()), zzbouVar.zzo(), zzbouVar.zzu(), zzbouVar.zzt(), zzbouVar.zze(), zzbouVar.zzl(), zzbouVar.zzp(), zzbouVar.zzf());
        } catch (RemoteException e) {
            zzcaa.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF("price");
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        zzcfi zzcfiVar = this.zzi;
        if (zzcfiVar != null) {
            zzcfiVar.destroy();
            this.zzi = null;
        }
        zzcfi zzcfiVar2 = this.zzj;
        if (zzcfiVar2 != null) {
            zzcfiVar2.destroy();
            this.zzj = null;
        }
        zzcfi zzcfiVar3 = this.zzk;
        if (zzcfiVar3 != null) {
            zzcfiVar3.destroy();
            this.zzk = null;
        }
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        zzcas zzcasVar = this.zzn;
        if (zzcasVar != null) {
            zzcasVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzJ(zzbeo zzbeoVar) {
        this.zzc = zzbeoVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(com.google.android.gms.ads.internal.client.zzel zzelVar) {
        this.zzg = zzelVar;
    }

    public final synchronized void zzM(zzbew zzbewVar) {
        this.zzs = zzbewVar;
    }

    public final synchronized void zzN(String str, zzbei zzbeiVar) {
        try {
            if (zzbeiVar == null) {
                this.zzv.remove(str);
            } else {
                this.zzv.put(str, zzbeiVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzO(zzcfi zzcfiVar) {
        this.zzj = zzcfiVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbew zzbewVar) {
        this.zzt = zzbewVar;
    }

    public final synchronized void zzR(float f) {
        this.zzx = f;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcfi zzcfiVar) {
        this.zzk = zzcfiVar;
    }

    public final synchronized void zzU(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzfip zzfipVar) {
        this.zzl = zzfipVar;
    }

    public final synchronized void zzX(zzcas zzcasVar) {
        this.zzn = zzcasVar;
    }

    public final synchronized void zzY(double d) {
        this.zzr = d;
    }

    public final synchronized void zzZ(String str, String str2) {
        try {
            if (str2 == null) {
                this.zzw.remove(str);
            } else {
                this.zzw.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i) {
        this.zza = i;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcfi zzcfiVar) {
        this.zzi = zzcfiVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized SimpleArrayMap zzh() {
        return this.zzv;
    }

    public final synchronized SimpleArrayMap zzi() {
        return this.zzw;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzel zzk() {
        return this.zzg;
    }

    public final synchronized zzbeo zzl() {
        return this.zzc;
    }

    public final zzbew zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbev.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzbew zzn() {
        return this.zzs;
    }

    public final synchronized zzbew zzo() {
        return this.zzt;
    }

    public final synchronized zzcas zzp() {
        return this.zzn;
    }

    public final synchronized zzcfi zzq() {
        return this.zzj;
    }

    public final synchronized zzcfi zzr() {
        return this.zzk;
    }

    public final synchronized zzcfi zzs() {
        return this.zzi;
    }

    public final synchronized zzfip zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    public final synchronized ListenableFuture zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
