package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzemw implements zzesj {
    private final zzfyo zza;
    private final zzdpc zzb;
    private final zzdtj zzc;
    private final zzemy zzd;

    public zzemw(zzfyo zzfyoVar, zzdpc zzdpcVar, zzdtj zzdtjVar, zzemy zzemyVar) {
        this.zza = zzfyoVar;
        this.zzb = zzdpcVar;
        this.zzc = zzdtjVar;
        this.zzd = zzemyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzku)).booleanValue() && this.zzd.zza() != null) {
            zzemx zzemxVarZza = this.zzd.zza();
            zzemxVarZza.getClass();
            return zzfye.zzh(zzemxVarZza);
        }
        if (!zzfrx.zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbo))) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzku)).booleanValue() || (!this.zzd.zzd() && this.zzc.zzt())) {
                this.zzd.zzc(true);
                return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemv
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzc();
                    }
                });
            }
        }
        return zzfye.zzh(new zzemx(new Bundle()));
    }

    final /* synthetic */ zzemx zzc() throws Exception {
        List<String> listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbo)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfcw zzfcwVarZzc = this.zzb.zzc(str, new JSONObject());
                zzfcwVarZzc.zzC();
                boolean zZzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzku)).booleanValue() || zZzt) {
                    try {
                        zzbqq zzbqqVarZzf = zzfcwVarZzc.zzf();
                        if (zzbqqVarZzf != null) {
                            bundle2.putString("sdk_version", zzbqqVarZzf.toString());
                        }
                    } catch (zzfcf unused) {
                    }
                }
                try {
                    zzbqq zzbqqVarZze = zzfcwVarZzc.zze();
                    if (zzbqqVarZze != null) {
                        bundle2.putString("adapter_version", zzbqqVarZze.toString());
                    }
                } catch (zzfcf unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfcf unused3) {
            }
        }
        zzemx zzemxVar = new zzemx(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzku)).booleanValue()) {
            this.zzd.zzb(zzemxVar);
        }
        return zzemxVar;
    }
}
