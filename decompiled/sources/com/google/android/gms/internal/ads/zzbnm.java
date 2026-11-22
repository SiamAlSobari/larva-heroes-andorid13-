package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbnm implements zzbmy {
    private final zzbna zza;
    private final zzbnb zzb;
    private final zzbmu zzc;
    private final String zzd;

    zzbnm(zzbmu zzbmuVar, String str, zzbnb zzbnbVar, zzbna zzbnaVar) {
        this.zzc = zzbmuVar;
        this.zzd = str;
        this.zzb = zzbnbVar;
        this.zza = zzbnaVar;
    }

    static /* bridge */ /* synthetic */ void zzd(zzbnm zzbnmVar, zzbmo zzbmoVar, zzbmv zzbmvVar, Object obj, zzcas zzcasVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            String string = UUID.randomUUID().toString();
            zzbiq.zzo.zzc(string, new zzbnl(zzbnmVar, zzbmoVar, zzcasVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", zzbnmVar.zzb.zzb(obj));
            zzbmvVar.zzl(zzbnmVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcasVar.zzd(e);
                zzcaa.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbmoVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final ListenableFuture zzb(Object obj) {
        zzcas zzcasVar = new zzcas();
        zzbmo zzbmoVarZzb = this.zzc.zzb(null);
        zzbmoVarZzb.zzi(new zzbnj(this, zzbmoVarZzb, obj, zzcasVar), new zzbnk(this, zzcasVar, zzbmoVarZzb));
        return zzcasVar;
    }
}
