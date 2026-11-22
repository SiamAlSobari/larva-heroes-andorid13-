package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbnu implements zzfxl {
    private final zzbna zza;
    private final zzbnb zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzd;

    zzbnu(ListenableFuture listenableFuture, String str, zzbnb zzbnbVar, zzbna zzbnaVar) {
        this.zzd = listenableFuture;
        this.zzb = zzbnbVar;
        this.zza = zzbnaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzfye.zzn(this.zzd, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzbns
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj2) {
                return this.zza.zzc(obj, (zzbmv) obj2);
            }
        }, zzcan.zzf);
    }

    final /* synthetic */ ListenableFuture zzc(Object obj, zzbmv zzbmvVar) throws Exception {
        zzcas zzcasVar = new zzcas();
        com.google.android.gms.ads.internal.zzt.zzp();
        String string = UUID.randomUUID().toString();
        zzbiq.zzo.zzc(string, new zzbnt(this, zzcasVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbmvVar.zzl(this.zzc, jSONObject);
        return zzcasVar;
    }
}
