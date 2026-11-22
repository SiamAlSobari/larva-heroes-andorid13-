package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdxs {
    private final zzfyo zza;
    private final zzdwy zzb;
    private final zzgyn zzc;
    private final zzfhu zzd;
    private final Context zze;
    private final zzcag zzf;

    public zzdxs(zzfyo zzfyoVar, zzdwy zzdwyVar, zzgyn zzgynVar, zzfhu zzfhuVar, Context context, zzcag zzcagVar) {
        this.zza = zzfyoVar;
        this.zzb = zzdwyVar;
        this.zzc = zzgynVar;
        this.zzd = zzfhuVar;
        this.zze = context;
        this.zzf = zzcagVar;
    }

    private final ListenableFuture zzh(final zzbun zzbunVar, zzdxr zzdxrVar, final zzdxr zzdxrVar2, final zzfxl zzfxlVar) {
        String str = zzbunVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        return zzfye.zzf(zzfye.zzn(zzfxv.zzu(com.google.android.gms.ads.internal.util.zzs.zzz(str) ? zzfye.zzg(new zzdxh(1)) : zzfye.zzf(zzdxrVar.zza(zzbunVar), ExecutionException.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxi
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                ExecutionException cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return zzfye.zzg(cause2);
            }
        }, this.zza)), zzfxlVar, this.zza), zzdxh.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxq
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzdxrVar2, zzbunVar, zzfxlVar, (zzdxh) obj);
            }
        }, this.zza);
    }

    public final ListenableFuture zza(final zzbun zzbunVar) {
        zzfxl zzfxlVar = new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxn
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                zzbun zzbunVar2 = zzbunVar;
                zzbunVar2.zzj = new String(zzfwg.zza((InputStream) obj), zzfqu.zzc);
                return zzfye.zzh(zzbunVar2);
            }
        };
        final zzdwy zzdwyVar = this.zzb;
        return zzh(zzbunVar, new zzdxr() { // from class: com.google.android.gms.internal.ads.zzdxo
            @Override // com.google.android.gms.internal.ads.zzdxr
            public final ListenableFuture zza(zzbun zzbunVar2) {
                return zzdwyVar.zzb(zzbunVar2);
            }
        }, new zzdxr() { // from class: com.google.android.gms.internal.ads.zzdxp
            @Override // com.google.android.gms.internal.ads.zzdxr
            public final ListenableFuture zza(zzbun zzbunVar2) {
                return this.zza.zzd(zzbunVar2);
            }
        }, zzfxlVar);
    }

    public final ListenableFuture zzb(JSONObject jSONObject) {
        return zzfye.zzn(zzfxv.zzu(zzfye.zzh(jSONObject)), com.google.android.gms.ads.internal.zzt.zzf().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbnf.zza, new zzbna() { // from class: com.google.android.gms.internal.ads.zzdxm
            @Override // com.google.android.gms.internal.ads.zzbna
            public final Object zza(JSONObject jSONObject2) {
                return new zzbuq(jSONObject2);
            }
        }), this.zza);
    }

    final /* synthetic */ ListenableFuture zzc(zzdxr zzdxrVar, zzbun zzbunVar, zzfxl zzfxlVar, zzdxh zzdxhVar) throws Exception {
        return zzfye.zzn(zzdxrVar.zza(zzbunVar), zzfxlVar, this.zza);
    }

    final /* synthetic */ ListenableFuture zzd(zzbun zzbunVar) {
        return ((zzdzo) this.zzc.zzb()).zzb(zzbunVar, Binder.getCallingUid());
    }

    final /* synthetic */ ListenableFuture zze(zzbun zzbunVar) {
        return this.zzb.zzc(zzbunVar.zzh);
    }

    final /* synthetic */ ListenableFuture zzf(zzbun zzbunVar) {
        return ((zzdzo) this.zzc.zzb()).zzi(zzbunVar.zzh);
    }

    public final ListenableFuture zzg(zzbun zzbunVar) {
        return zzh(zzbunVar, new zzdxr() { // from class: com.google.android.gms.internal.ads.zzdxk
            @Override // com.google.android.gms.internal.ads.zzdxr
            public final ListenableFuture zza(zzbun zzbunVar2) {
                return this.zza.zze(zzbunVar2);
            }
        }, new zzdxr() { // from class: com.google.android.gms.internal.ads.zzdxl
            @Override // com.google.android.gms.internal.ads.zzdxr
            public final ListenableFuture zza(zzbun zzbunVar2) {
                return this.zza.zzf(zzbunVar2);
            }
        }, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxj
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzfye.zzh(null);
            }
        });
    }
}
