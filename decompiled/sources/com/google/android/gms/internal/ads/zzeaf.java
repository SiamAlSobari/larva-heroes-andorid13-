package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeaf implements zzffh {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfhg zzc;
    private final zzfhr zzd;

    public zzeaf(String str, zzfhr zzfhrVar, zzfhg zzfhgVar) {
        this.zzb = str;
        this.zzd = zzfhrVar;
        this.zzc = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffh
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdve zzdveVar;
        String strConcat;
        zzeae zzeaeVar = (zzeae) obj;
        int iOptInt = zzeaeVar.zza.optInt("http_timeout_millis", 60000);
        zzbuq zzbuqVar = zzeaeVar.zzb;
        String strJoin = "";
        if (zzbuqVar.zza() != -2) {
            if (zzbuqVar.zza() == 1) {
                if (zzbuqVar.zzf() != null) {
                    strJoin = TextUtils.join(", ", zzbuqVar.zzf());
                    zzcaa.zzg(strJoin);
                }
                zzdveVar = new zzdve(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdveVar = new zzdve(1);
            }
            zzfhr zzfhrVar = this.zzd;
            zzfhg zzfhgVar = this.zzc;
            zzfhgVar.zzg(zzdveVar);
            zzfhgVar.zzf(false);
            zzfhrVar.zza(zzfhgVar);
            throw zzdveVar;
        }
        HashMap map = new HashMap();
        if (zzeaeVar.zzb.zzh() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaM)).booleanValue()) {
                String str = this.zzb;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = zza.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null && (strGroup.toLowerCase(Locale.ROOT).startsWith("id=") || strGroup.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                            if (!TextUtils.isEmpty(strConcat)) {
                                strConcat = strConcat.concat("; ");
                            }
                            strConcat = strConcat.concat(strGroup);
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put(HttpHeaders.COOKIE, strConcat);
                }
            } else {
                map.put(HttpHeaders.COOKIE, this.zzb);
            }
        }
        if (zzeaeVar.zzb.zzi()) {
            zzeag.zza(map, zzeaeVar.zza);
        }
        if (zzeaeVar.zzb != null && !TextUtils.isEmpty(zzeaeVar.zzb.zzd())) {
            strJoin = zzeaeVar.zzb.zzd();
        }
        zzfhr zzfhrVar2 = this.zzd;
        zzfhg zzfhgVar2 = this.zzc;
        zzfhgVar2.zzf(true);
        zzfhrVar2.zza(zzfhgVar2);
        return new zzeaa(zzeaeVar.zzb.zze(), iOptInt, map, strJoin.getBytes(zzfqu.zzc), "", zzeaeVar.zzb.zzi());
    }
}
