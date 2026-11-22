package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfpa;
import com.google.android.gms.internal.ads.zzfpb;
import com.google.android.gms.internal.ads.zzfpc;
import com.google.android.gms.internal.ads.zzfpd;
import com.google.android.gms.internal.ads.zzfpm;
import com.google.android.gms.internal.ads.zzfpo;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfpq;
import com.google.android.gms.internal.ads.zzfpr;
import com.google.android.gms.internal.ads.zzfql;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzw {
    private zzfpp zzf;
    private zzcfi zzc = null;
    private boolean zze = false;
    private String zza = null;
    private zzfpc zzd = null;
    private String zzb = null;

    private final zzfpr zzl() {
        zzfpq zzfpqVarZzc = zzfpr.zzc();
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzkj)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzfpqVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfpqVarZzc.zza(this.zzb);
        }
        return zzfpqVarZzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzv(this);
        }
    }

    public final synchronized void zza(zzcfi zzcfiVar, Context context) {
        this.zzc = zzcfiVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        zze("on_play_store_bind", map);
    }

    public final void zzb() {
        zzfpc zzfpcVar;
        if (!this.zze || (zzfpcVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfpcVar.zza(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
        }
    }

    public final void zzc() {
        zzfpc zzfpcVar;
        if (!this.zze || (zzfpcVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfpa zzfpaVarZzc = zzfpb.zzc();
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzkj)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzfpaVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfpaVarZzc.zza(this.zzb);
        }
        zzfpcVar.zzb(zzfpaVarZzc.zzc(), this.zzf);
    }

    final void zzd(String str) {
        zze(str, new HashMap());
    }

    final void zze(final String str, final Map map) {
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(str, map);
            }
        });
    }

    final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            zze("onError", map);
        }
    }

    public final void zzg() {
        zzfpc zzfpcVar;
        if (!this.zze || (zzfpcVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfpcVar.zzc(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
        }
    }

    final /* synthetic */ void zzh(String str, Map map) {
        zzcfi zzcfiVar = this.zzc;
        if (zzcfiVar != null) {
            zzcfiVar.zzd(str, map);
        }
    }

    final void zzi(zzfpo zzfpoVar) {
        if (!TextUtils.isEmpty(zzfpoVar.zzb())) {
            if (!((Boolean) zzba.zzc().zzb(zzbbr.zzkj)).booleanValue()) {
                this.zza = zzfpoVar.zzb();
            }
        }
        switch (zzfpoVar.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                break;
            case 8153:
                zzd("onLMDOverlayClicked");
                break;
            case 8155:
                zzd("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, String.valueOf(zzfpoVar.zza()));
                zze("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final void zzj(zzcfi zzcfiVar, zzfpm zzfpmVar) {
        if (zzcfiVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcfiVar;
        if (!this.zze && !zzk(zzcfiVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzkj)).booleanValue()) {
            this.zzb = zzfpmVar.zzg();
        }
        zzm();
        zzfpc zzfpcVar = this.zzd;
        if (zzfpcVar != null) {
            zzfpcVar.zzd(zzfpmVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfql.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfpd.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
