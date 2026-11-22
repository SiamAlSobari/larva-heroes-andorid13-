package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdtz {
    private final zzdtj zza;
    private final zzdoz zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzdtz(zzdtj zzdtjVar, zzdoz zzdozVar) {
        this.zza = zzdtjVar;
        this.zzb = zzdozVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        zzdoy zzdoyVarZza;
        zzdoy zzdoyVarZza2;
        zzbqq zzbqqVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbko zzbkoVar = (zzbko) it.next();
                String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziV)).booleanValue() || (zzdoyVarZza2 = this.zzb.zza(zzbkoVar.zza)) == null || (zzbqqVar = zzdoyVarZza2.zzc) == null) ? "" : zzbqqVar.toString();
                String str = string;
                boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziW)).booleanValue() && (zzdoyVarZza = this.zzb.zza(zzbkoVar.zza)) != null && zzdoyVarZza.zzd;
                List list2 = this.zzd;
                String str2 = zzbkoVar.zza;
                list2.add(new zzdty(str2, str, this.zzb.zzc(str2), zzbkoVar.zzb ? 1 : 0, zzbkoVar.zzd, zzbkoVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (!this.zza.zzt()) {
                    zzc();
                    return jSONArray;
                }
                zzd(this.zza.zzg());
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzdty) it.next()).zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdtx(this));
    }
}
