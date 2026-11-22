package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzegs implements zzedn {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final ListenableFuture zza(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        String strOptString = zzfbeVar.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfca zzfcaVar = zzfbrVar.zza.zza;
        zzfby zzfbyVar = new zzfby();
        zzfbyVar.zzp(zzfcaVar);
        zzfbyVar.zzs(strOptString);
        Bundle bundleZzd = zzd(zzfcaVar.zzd.zzm);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = zzfbeVar.zzw.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = zzfbeVar.zzw.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = zzfbeVar.zzE.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = zzfbeVar.zzE.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfcaVar.zzd;
        zzfbyVar.zzE(new com.google.android.gms.ads.internal.client.zzl(zzlVar.zza, zzlVar.zzb, bundleZzd2, zzlVar.zzd, zzlVar.zze, zzlVar.zzf, zzlVar.zzg, zzlVar.zzh, zzlVar.zzi, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, bundleZzd, zzlVar.zzn, zzlVar.zzo, zzlVar.zzp, zzlVar.zzq, zzlVar.zzr, zzlVar.zzs, zzlVar.zzt, zzlVar.zzu, zzlVar.zzv, zzlVar.zzw, zzlVar.zzx));
        zzfca zzfcaVarZzG = zzfbyVar.zzG();
        Bundle bundle = new Bundle();
        zzfbi zzfbiVar = zzfbrVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfbiVar.zza));
        bundle2.putInt("refresh_interval", zzfbiVar.zzc);
        bundle2.putString("gws_query_id", zzfbiVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfbrVar.zza.zza.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzfbeVar.zzx);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfbeVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfbeVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfbeVar.zzq));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfbeVar.zzn));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfbeVar.zzh));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfbeVar.zzi));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfbeVar.zzj));
        bundle3.putString(FirebaseAnalytics.Param.TRANSACTION_ID, zzfbeVar.zzk);
        bundle3.putString("valid_from_timestamp", zzfbeVar.zzl);
        bundle3.putBoolean("is_closable_area_disabled", zzfbeVar.zzQ);
        bundle3.putString("recursive_server_response_data", zzfbeVar.zzap);
        if (zzfbeVar.zzm != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzfbeVar.zzm.zzb);
            bundle4.putString("rb_type", zzfbeVar.zzm.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzfcaVarZzG, bundle, zzfbeVar, zzfbrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        return !TextUtils.isEmpty(zzfbeVar.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    protected abstract ListenableFuture zzc(zzfca zzfcaVar, Bundle bundle, zzfbe zzfbeVar, zzfbr zzfbrVar);
}
