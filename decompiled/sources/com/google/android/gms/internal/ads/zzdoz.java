package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdoz {
    private final Map zza = new HashMap();

    zzdoz() {
    }

    @Nullable
    public final synchronized zzdoy zza(String str) {
        return (zzdoy) this.zza.get(str);
    }

    @Nullable
    public final zzdoy zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdoy zzdoyVarZza = zza((String) it.next());
            if (zzdoyVarZza != null) {
                return zzdoyVarZza;
            }
        }
        return null;
    }

    public final String zzc(String str) {
        zzbqq zzbqqVar;
        zzdoy zzdoyVarZza = zza(str);
        return (zzdoyVarZza == null || (zzbqqVar = zzdoyVarZza.zzb) == null) ? "" : zzbqqVar.toString();
    }

    final synchronized void zzd(String str, @Nullable zzfcw zzfcwVar) {
        zzbqq zzbqqVarZze;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbqq zzbqqVarZzf = null;
        if (zzfcwVar == null) {
            zzbqqVarZze = null;
        } else {
            try {
                zzbqqVarZze = zzfcwVar.zze();
            } catch (zzfcf unused) {
                zzbqqVarZze = null;
            }
        }
        if (zzfcwVar != null) {
            try {
                zzbqqVarZzf = zzfcwVar.zzf();
            } catch (zzfcf unused2) {
            }
        }
        boolean z = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziW)).booleanValue()) {
            if (zzfcwVar == null) {
                z = false;
            } else {
                try {
                    zzfcwVar.zzC();
                } catch (zzfcf unused3) {
                    z = false;
                }
            }
        }
        this.zza.put(str, new zzdoy(str, zzbqqVarZze, zzbqqVarZzf, z));
    }

    final synchronized void zze(String str, zzbqc zzbqcVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdoy(str, zzbqcVar.zzf(), zzbqcVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
