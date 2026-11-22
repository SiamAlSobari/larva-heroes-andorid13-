package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfig {
    private final zzehc zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfbs zzf;
    private final zzfbt zzg;
    private final Clock zzh;
    private final zzaqx zzi;

    public zzfig(zzehc zzehcVar, zzcag zzcagVar, String str, String str2, Context context, zzfbs zzfbsVar, zzfbt zzfbtVar, Clock clock, zzaqx zzaqxVar) {
        this.zza = zzehcVar;
        this.zzb = zzcagVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfbsVar;
        this.zzg = zzfbtVar;
        this.zzh = clock;
        this.zzi = zzaqxVar;
    }

    public static final List zzf(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzh(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return zzbzz.zzk() ? "fakeForAdDebugLog" : str;
    }

    private static String zzi(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfbr zzfbrVar, zzfbe zzfbeVar, List list) {
        return zzd(zzfbrVar, zzfbeVar, false, "", "", list);
    }

    public final List zzd(zzfbr zzfbrVar, zzfbe zzfbeVar, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String strZzi = zzi(zzi(zzi((String) it.next(), "@gw_adlocid@", zzfbrVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfbeVar != null) {
                strZzi = zzbyh.zzc(zzi(zzi(zzi(strZzi, "@gw_qdata@", zzfbeVar.zzz), "@gw_adnetid@", zzfbeVar.zzy), "@gw_allocid@", zzfbeVar.zzx), this.zze, zzfbeVar.zzX);
            }
            String strZzi2 = zzi(zzi(zzi(strZzi, "@gw_adnetstatus@", this.zza.zzf()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdl)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean z4 = !TextUtils.isEmpty(str2);
            if (z3) {
                z2 = z4;
            } else {
                if (z4) {
                }
                arrayList.add(strZzi2);
            }
            if (this.zzi.zzf(Uri.parse(strZzi2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strZzi2).buildUpon();
                if (z3) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzi2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzi2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:13:0x0059->B:15:0x005f, LOOP_END] */
    public final List zze(zzfbe zzfbeVar, List list, zzbvd zzbvdVar) {
        zzfbs zzfbsVar;
        zzfre zzfreVarZzd;
        String str;
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String strZzc = zzbvdVar.zzc();
            String string = Integer.toString(zzbvdVar.zzb());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdm)).booleanValue()) {
                zzfbt zzfbtVar = this.zzg;
                if (zzfbtVar == null) {
                    zzfreVarZzd = zzfre.zzc();
                } else {
                    zzfbsVar = zzfbtVar.zza;
                }
                str = (String) zzfreVarZzd.zza(new zzfqw() { // from class: com.google.android.gms.internal.ads.zzfie
                    @Override // com.google.android.gms.internal.ads.zzfqw
                    public final Object apply(Object obj) {
                        return zzfig.zzh(((zzfbs) obj).zza);
                    }
                }).zzb("");
                str2 = (String) zzfreVarZzd.zza(new zzfqw() { // from class: com.google.android.gms.internal.ads.zzfif
                    @Override // com.google.android.gms.internal.ads.zzfqw
                    public final Object apply(Object obj) {
                        return zzfig.zzh(((zzfbs) obj).zzb);
                    }
                }).zzb("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zzbyh.zzc(zzi(zzi(zzi(zzi(zzi(zzi((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfbeVar.zzX));
                }
                return arrayList;
            }
            zzfbsVar = this.zzf;
            zzfreVarZzd = zzfre.zzd(zzfbsVar);
            str = (String) zzfreVarZzd.zza(new zzfqw() { // from class: com.google.android.gms.internal.ads.zzfie
                @Override // com.google.android.gms.internal.ads.zzfqw
                public final Object apply(Object obj) {
                    return zzfig.zzh(((zzfbs) obj).zza);
                }
            }).zzb("");
            str2 = (String) zzfreVarZzd.zza(new zzfqw() { // from class: com.google.android.gms.internal.ads.zzfif
                @Override // com.google.android.gms.internal.ads.zzfqw
                public final Object apply(Object obj) {
                    return zzfig.zzh(((zzfbs) obj).zzb);
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzbyh.zzc(zzi(zzi(zzi(zzi(zzi(zzi((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfbeVar.zzX));
            }
            return arrayList;
        } catch (RemoteException e) {
            zzcaa.zzh("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
