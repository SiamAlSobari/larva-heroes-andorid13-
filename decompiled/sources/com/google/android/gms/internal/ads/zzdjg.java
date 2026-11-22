package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdjg implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdnb zzd;
    private final Clock zze;
    private zzbgq zzf;
    private zzbir zzg;

    public zzdjg(zzdnb zzdnbVar, Clock clock) {
        this.zzd = zzdnbVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            map.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzg("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final zzbgq zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(final zzbgq zzbgqVar) {
        this.zzf = zzbgqVar;
        zzbir zzbirVar = this.zzg;
        if (zzbirVar != null) {
            this.zzd.zzk("/unconfirmedClick", zzbirVar);
        }
        zzbir zzbirVar2 = new zzbir() { // from class: com.google.android.gms.internal.ads.zzdjf
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                zzdjg zzdjgVar = this.zza;
                zzbgq zzbgqVar2 = zzbgqVar;
                try {
                    zzdjgVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    zzcaa.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzdjgVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbgqVar2 == null) {
                    zzcaa.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbgqVar2.zzf(str);
                } catch (RemoteException e) {
                    zzcaa.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzg = zzbirVar2;
        this.zzd.zzi("/unconfirmedClick", zzbirVar2);
    }
}
