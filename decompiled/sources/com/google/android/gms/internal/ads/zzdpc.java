package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpc {
    private final zzfcu zza;
    private final zzdoz zzb;

    zzdpc(zzfcu zzfcuVar, zzdoz zzdozVar) {
        this.zza = zzfcuVar;
        this.zzb = zzdozVar;
    }

    final zzbof zza() throws RemoteException {
        zzbof zzbofVarZzb = this.zza.zzb();
        if (zzbofVarZzb != null) {
            return zzbofVarZzb;
        }
        zzcaa.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbqc zzb(String str) throws RemoteException {
        zzbqc zzbqcVarZzc = zza().zzc(str);
        this.zzb.zze(str, zzbqcVarZzc);
        return zzbqcVarZzc;
    }

    public final zzfcw zzc(String str, JSONObject jSONObject) throws zzfcf {
        zzboi zzboiVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzboiVarZzb = new zzbpf(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzboiVarZzb = new zzbpf(new zzbqu());
            } else {
                zzbof zzbofVarZza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zzbofVarZza.zze(string)) {
                            zzboiVarZzb = zzbofVarZza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzboiVarZzb = zzbofVarZza.zzd(string) ? zzbofVarZza.zzb(string) : zzbofVarZza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        zzcaa.zzh("Invalid custom event.", e);
                        zzboiVarZzb = zzbofVarZza.zzb(str);
                    }
                } else {
                    zzboiVarZzb = zzbofVarZza.zzb(str);
                }
            }
            zzfcw zzfcwVar = new zzfcw(zzboiVarZzb);
            this.zzb.zzd(str, zzfcwVar);
            return zzfcwVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziW)).booleanValue()) {
                this.zzb.zzd(str, null);
            }
            throw new zzfcf(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
