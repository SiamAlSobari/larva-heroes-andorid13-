package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbnl implements zzbjf {
    final /* synthetic */ zzbnm zza;
    private final zzbmo zzb;
    private final zzcas zzc;

    public zzbnl(zzbnm zzbnmVar, zzbmo zzbmoVar, zzcas zzcasVar) {
        this.zza = zzbnmVar;
        this.zzb = zzbmoVar;
        this.zzc = zzcasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void zza(String str) {
        zzbmo zzbmoVar;
        try {
            if (str == null) {
                this.zzc.zzd(new zzbmx());
            } else {
                this.zzc.zzd(new zzbmx(str));
            }
            zzbmoVar = this.zzb;
        } catch (IllegalStateException unused) {
            zzbmoVar = this.zzb;
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        zzbmoVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void zzb(JSONObject jSONObject) {
        zzbmo zzbmoVar;
        try {
            try {
                this.zzc.zzc(this.zza.zza.zza(jSONObject));
                zzbmoVar = this.zzb;
            } catch (IllegalStateException unused) {
                zzbmoVar = this.zzb;
            } catch (JSONException e) {
                this.zzc.zzd(e);
                zzbmoVar = this.zzb;
            }
            zzbmoVar.zzb();
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
    }
}
