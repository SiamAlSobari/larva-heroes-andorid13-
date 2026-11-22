package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeds {
    private final String zzc;
    private zzfbi zzd = null;
    private zzfbe zze = null;
    private com.google.android.gms.ads.internal.client.zzu zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzeds(String str) {
        this.zzc = str;
    }

    private final synchronized void zzi(zzfbe zzfbeVar, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdo)).booleanValue() ? zzfbeVar.zzaq : zzfbeVar.zzx;
        if (this.zzb.containsKey(str5)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = zzfbeVar.zzw.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, zzfbeVar.zzw.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgG)).booleanValue()) {
            str = zzfbeVar.zzG;
            str2 = zzfbeVar.zzH;
            str3 = zzfbeVar.zzI;
            str4 = zzfbeVar.zzJ;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = new com.google.android.gms.ads.internal.client.zzu(zzfbeVar.zzF, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.zza.add(i, zzuVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(str5, zzuVar);
    }

    private final void zzj(zzfbe zzfbeVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        String str = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdo)).booleanValue() ? zzfbeVar.zzaq : zzfbeVar.zzx;
        if (this.zzb.containsKey(str)) {
            if (this.zze == null) {
                this.zze = zzfbeVar;
            }
            com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str);
            zzuVar.zzb = j;
            zzuVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgH)).booleanValue() && z) {
                this.zzf = zzuVar;
            }
        }
    }

    public final com.google.android.gms.ads.internal.client.zzu zza() {
        return this.zzf;
    }

    public final zzcwb zzb() {
        return new zzcwb(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfbe zzfbeVar) {
        zzi(zzfbeVar, this.zza.size());
    }

    public final void zze(zzfbe zzfbeVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzj(zzfbeVar, j, zzeVar, false);
    }

    public final void zzf(zzfbe zzfbeVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzj(zzfbeVar, j, null, true);
    }

    public final synchronized void zzg(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int iIndexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str));
            try {
                this.zza.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzi((zzfbe) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void zzh(zzfbi zzfbiVar) {
        this.zzd = zzfbiVar;
    }
}
