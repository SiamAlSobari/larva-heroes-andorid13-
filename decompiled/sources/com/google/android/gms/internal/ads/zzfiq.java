package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfiq {
    private final zzfiy zza;
    private final zzfiy zzb;
    private final zzfiu zzc;
    private final zzfix zzd;

    private zzfiq(zzfiu zzfiuVar, zzfix zzfixVar, zzfiy zzfiyVar, zzfiy zzfiyVar2, boolean z) {
        this.zzc = zzfiuVar;
        this.zzd = zzfixVar;
        this.zza = zzfiyVar;
        if (zzfiyVar2 == null) {
            this.zzb = zzfiy.NONE;
        } else {
            this.zzb = zzfiyVar2;
        }
    }

    public static zzfiq zza(zzfiu zzfiuVar, zzfix zzfixVar, zzfiy zzfiyVar, zzfiy zzfiyVar2, boolean z) {
        zzfke.zzb(zzfixVar, "ImpressionType is null");
        zzfke.zzb(zzfiyVar, "Impression owner is null");
        if (zzfiyVar == zzfiy.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfiuVar == zzfiu.DEFINED_BY_JAVASCRIPT && zzfiyVar == zzfiy.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfixVar == zzfix.DEFINED_BY_JAVASCRIPT && zzfiyVar == zzfiy.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfiq(zzfiuVar, zzfixVar, zzfiyVar, zzfiyVar2, true);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfjz.zze(jSONObject, "impressionOwner", this.zza);
        zzfjz.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfjz.zze(jSONObject, "creativeType", this.zzc);
        zzfjz.zze(jSONObject, "impressionType", this.zzd);
        zzfjz.zze(jSONObject, "isolateVerificationScripts", true);
        return jSONObject;
    }
}
