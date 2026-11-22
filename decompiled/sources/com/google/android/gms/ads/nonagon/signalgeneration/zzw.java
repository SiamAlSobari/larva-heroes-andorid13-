package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfya;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzw implements zzfya {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzbyv zzb;
    final /* synthetic */ zzbyo zzc;
    final /* synthetic */ zzfhg zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzaa zzf;

    zzw(zzaa zzaaVar, ListenableFuture listenableFuture, zzbyv zzbyvVar, zzbyo zzbyoVar, zzfhg zzfhgVar, long j) {
        this.zzf = zzaaVar;
        this.zza = listenableFuture;
        this.zzb = zzbyvVar;
        this.zzc = zzbyoVar;
        this.zzd = zzfhgVar;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        String message = th.getMessage();
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SignalGeneratorImpl.generateSignals");
        zzaa zzaaVar = this.zzf;
        zzf.zzc(zzaaVar.zzr, zzaaVar.zzj, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(jCurrentTimeMillis)));
        zzfhr zzfhrVarZzr = zzaa.zzr(this.zza, this.zzb);
        if (((Boolean) zzbdd.zze.zze()).booleanValue() && zzfhrVarZzr != null) {
            zzfhg zzfhgVar = this.zzd;
            zzfhgVar.zzg(th);
            zzfhgVar.zzf(false);
            zzfhrVarZzr.zza(zzfhgVar);
            zzfhrVarZzr.zzg();
        }
        try {
            this.zzc.zzb("Internal error. " + message);
        } catch (RemoteException e) {
            zzcaa.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzam zzamVar = (zzam) obj;
        zzfhr zzfhrVarZzr = zzaa.zzr(this.zza, this.zzb);
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzht)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                zzcaa.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) zzbdd.zze.zze()).booleanValue() || zzfhrVarZzr == null) {
                return;
            }
            zzfhg zzfhgVar = this.zzd;
            zzfhgVar.zzc("QueryInfo generation has been disabled.");
            zzfhgVar.zzf(false);
            zzfhrVarZzr.zza(zzfhgVar);
            zzfhrVarZzr.zzg();
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        try {
            if (zzamVar == null) {
                this.zzc.zzc(null, null, null);
                zzaa zzaaVar = this.zzf;
                zzf.zzc(zzaaVar.zzr, zzaaVar.zzj, "sgs", new Pair("rid", "-1"));
                this.zzd.zzf(true);
                if (!((Boolean) zzbdd.zze.zze()).booleanValue() || zzfhrVarZzr == null) {
                    return;
                }
                zzfhrVarZzr.zza(this.zzd);
                zzfhrVarZzr.zzg();
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(zzamVar.zzb);
                String strOptString = jSONObject.optString("request_id", "");
                if (TextUtils.isEmpty(strOptString)) {
                    zzcaa.zzj("The request ID is empty in request JSON.");
                    this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                    zzaa zzaaVar2 = this.zzf;
                    zzf.zzc(zzaaVar2.zzr, zzaaVar2.zzj, "sgf", new Pair("sgf_reason", "rid_missing"));
                    zzfhg zzfhgVar2 = this.zzd;
                    zzfhgVar2.zzc("Request ID empty");
                    zzfhgVar2.zzf(false);
                    if (!((Boolean) zzbdd.zze.zze()).booleanValue() || zzfhrVarZzr == null) {
                        return;
                    }
                    zzfhrVarZzr.zza(this.zzd);
                    zzfhrVarZzr.zzg();
                    return;
                }
                zzaa zzaaVar3 = this.zzf;
                zzaa.zzG(zzaaVar3, strOptString, zzamVar.zzb, zzaaVar3.zzj);
                Bundle bundle = zzamVar.zzc;
                zzaa zzaaVar4 = this.zzf;
                if (zzaaVar4.zzw && bundle != null && bundle.getInt(zzaaVar4.zzy, -1) == -1) {
                    zzaa zzaaVar5 = this.zzf;
                    bundle.putInt(zzaaVar5.zzy, zzaaVar5.zzz.get());
                }
                zzaa zzaaVar6 = this.zzf;
                if (zzaaVar6.zzv && bundle != null && TextUtils.isEmpty(bundle.getString(zzaaVar6.zzx))) {
                    if (TextUtils.isEmpty(this.zzf.zzB)) {
                        zzaa zzaaVar7 = this.zzf;
                        com.google.android.gms.ads.internal.util.zzs zzsVarZzp = com.google.android.gms.ads.internal.zzt.zzp();
                        zzaa zzaaVar8 = this.zzf;
                        zzaaVar7.zzB = zzsVarZzp.zzc(zzaaVar8.zzg, zzaaVar8.zzA.zza);
                    }
                    zzaa zzaaVar9 = this.zzf;
                    bundle.putString(zzaaVar9.zzx, zzaaVar9.zzB);
                }
                this.zzc.zzc(zzamVar.zza, zzamVar.zzb, bundle);
                zzaa zzaaVar10 = this.zzf;
                zzdrm zzdrmVar = zzaaVar10.zzr;
                zzdrc zzdrcVar = zzaaVar10.zzj;
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("tqgt", String.valueOf(jCurrentTimeMillis));
                String str = "na";
                if (((Boolean) zzba.zzc().zzb(zzbbr.zzjg)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e2) {
                        zzcaa.zzh("Error retrieving JSONObject from the requestJson, ", e2);
                    }
                }
                pairArr[1] = new Pair("tpc", str);
                zzf.zzc(zzdrmVar, zzdrcVar, "sgs", pairArr);
                this.zzd.zzf(true);
                if (!((Boolean) zzbdd.zze.zze()).booleanValue() || zzfhrVarZzr == null) {
                    return;
                }
                zzfhrVarZzr.zza(this.zzd);
                zzfhrVarZzr.zzg();
            } catch (JSONException e3) {
                zzcaa.zzj("Failed to create JSON object from the request string.");
                this.zzc.zzb("Internal error for request JSON: " + e3.toString());
                zzaa zzaaVar11 = this.zzf;
                zzf.zzc(zzaaVar11.zzr, zzaaVar11.zzj, "sgf", new Pair("sgf_reason", "request_invalid"));
                zzfhg zzfhgVar3 = this.zzd;
                zzfhgVar3.zzg(e3);
                zzfhgVar3.zzf(false);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbdd.zze.zze()).booleanValue() || zzfhrVarZzr == null) {
                    return;
                }
                zzfhrVarZzr.zza(this.zzd);
                zzfhrVarZzr.zzg();
            }
        } catch (RemoteException e4) {
            zzfhg zzfhgVar4 = this.zzd;
            zzfhgVar4.zzg(e4);
            zzfhgVar4.zzf(false);
            zzcaa.zzh("", e4);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e4, "SignalGeneratorImpl.generateSignals.onSuccess");
        } finally {
            if (((Boolean) zzbdd.zze.zze()).booleanValue() && zzfhrVarZzr != null) {
                zzfhrVarZzr.zza(this.zzd);
                zzfhrVarZzr.zzg();
            }
        }
    }
}
