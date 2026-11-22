package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeis implements zzedn {
    private final zzedp zza;
    private final zzedt zzb;
    private final zzfge zzc;
    private final zzfyo zzd;

    public zzeis(zzfge zzfgeVar, zzfyo zzfyoVar, zzedp zzedpVar, zzedt zzedtVar) {
        this.zzc = zzfgeVar;
        this.zzd = zzfyoVar;
        this.zzb = zzedtVar;
        this.zza = zzedpVar;
    }

    static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final ListenableFuture zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        final zzedq zzedqVarZza;
        Iterator it = zzfbeVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzedqVarZza = null;
                break;
            }
            try {
                zzedqVarZza = this.zza.zza((String) it.next(), zzfbeVar.zzw);
                break;
            } catch (zzfcf unused) {
            }
        }
        if (zzedqVarZza == null) {
            return zzfye.zzg(new zzegp("Unable to instantiate mediation adapter class."));
        }
        zzcas zzcasVar = new zzcas();
        zzedqVarZza.zzc.zza(new zzeir(this, zzedqVarZza, zzcasVar));
        if (zzfbeVar.zzN) {
            Bundle bundle = zzfbrVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfge zzfgeVar = this.zzc;
        return zzffo.zzd(new zzffi() { // from class: com.google.android.gms.internal.ads.zzeip
            @Override // com.google.android.gms.internal.ads.zzffi
            public final void zza() throws Exception {
                this.zza.zzd(zzfbrVar, zzfbeVar, zzedqVarZza);
            }
        }, this.zzd, zzffy.ADAPTER_LOAD_AD_SYN, zzfgeVar).zzb(zzffy.ADAPTER_LOAD_AD_ACK).zzd(zzcasVar).zzb(zzffy.ADAPTER_WRAP_ADAPTER).zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzeiq
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                return this.zza.zzc(zzfbrVar, zzfbeVar, zzedqVarZza, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        return !zzfbeVar.zzu.isEmpty();
    }

    final /* synthetic */ Object zzc(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar, Void r4) throws Exception {
        return this.zzb.zza(zzfbrVar, zzfbeVar, zzedqVar);
    }

    final /* synthetic */ void zzd(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws Exception {
        this.zzb.zzb(zzfbrVar, zzfbeVar, zzedqVar);
    }
}
