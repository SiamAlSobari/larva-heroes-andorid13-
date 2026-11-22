package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.net.HttpHeaders;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyp {
    public ListenableFuture zza;
    private final zzczb zzb;
    private final zzdxx zzc;
    private final zzfge zzd;
    private final zzfca zze;
    private final zzcag zzf;
    private final zzfhu zzg;
    private final zzfhr zzh;
    private final Context zzi;
    private final zzfyo zzj;

    zzdyp(zzczb zzczbVar, zzdxx zzdxxVar, zzfge zzfgeVar, zzfca zzfcaVar, zzcag zzcagVar, zzfhu zzfhuVar, zzfhr zzfhrVar, Context context, zzfyo zzfyoVar) {
        this.zzb = zzczbVar;
        this.zzc = zzdxxVar;
        this.zzd = zzfgeVar;
        this.zze = zzfcaVar;
        this.zzf = zzcagVar;
        this.zzg = zzfhuVar;
        this.zzh = zzfhrVar;
        this.zzi = context;
        this.zzj = zzfyoVar;
    }

    final /* synthetic */ zzbtv zza(zzbun zzbunVar, zzeaa zzeaaVar) {
        Context context = this.zzi;
        zzeaaVar.zzc.put(HttpHeaders.CONTENT_TYPE, zzeaaVar.zze);
        zzeaaVar.zzc.put(HttpHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzbunVar.zzb.zza));
        String str = zzeaaVar.zza;
        int i = zzeaaVar.zzb;
        Map map = zzeaaVar.zzc;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbtv(str, i, bundle, zzeaaVar.zzd, zzeaaVar.zzf, zzbunVar.zzd, zzbunVar.zzh);
    }

    public final ListenableFuture zzc(final zzbun zzbunVar, final JSONObject jSONObject, final zzbuq zzbuqVar) {
        this.zzb.zzbr(zzbunVar);
        zzffv zzffvVarZzb = this.zzd.zzb(zzffy.PROXY, zzfye.zzm(this.zzd.zzb(zzffy.PREPARE_HTTP_REQUEST, zzfye.zzh(new zzeae(jSONObject, zzbuqVar))).zze(new zzeaf(zzbunVar.zzg, this.zzh, zzfhf.zza(this.zzi, 9))).zza(), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdyn
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return this.zza.zza(zzbunVar, (zzeaa) obj);
            }
        }, this.zzj));
        final zzdxx zzdxxVar = this.zzc;
        zzffj zzffjVarZza = zzffvVarZzb.zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdyk
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzdxxVar.zzc((zzbtv) obj);
            }
        }).zza();
        this.zza = zzffjVarZza;
        ListenableFuture listenableFutureZzn = zzfye.zzn(this.zzd.zzb(zzffy.PRE_PROCESS, zzffjVarZza).zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzdym
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                return new zzdzn(zzeab.zza(new InputStreamReader((InputStream) obj)), jSONObject, zzbuqVar);
            }
        }).zzf(com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzdzn.zza, zzbnf.zzb)).zza(), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdyl
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzd((InputStream) obj);
            }
        }, this.zzj);
        zzfye.zzr(listenableFutureZzn, new zzdyo(this), this.zzj);
        return listenableFutureZzn;
    }

    final /* synthetic */ ListenableFuture zzd(InputStream inputStream) throws Exception {
        return zzfye.zzh(new zzfbr(new zzfbo(this.zze), zzfbq.zza(new InputStreamReader(inputStream))));
    }
}
