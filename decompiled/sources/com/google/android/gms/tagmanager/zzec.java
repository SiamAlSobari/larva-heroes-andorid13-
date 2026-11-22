package com.google.android.gms.tagmanager;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzec extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.REGEX_GROUP.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ARG0.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.ARG1.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.IGNORE_CASE.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.GROUP.toString();

    public zzec() {
        super(zza, zzb, zzc);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        if (zzamVar == null || zzamVar == zzfu.zza() || zzamVar2 == null || zzamVar2 == zzfu.zza()) {
            return zzfu.zza();
        }
        int iIntValue = 1;
        int i = true != zzfu.zzf(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(zzd))).booleanValue() ? 64 : 66;
        com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zze);
        if (zzamVar3 != null) {
            Long lZzj = zzfu.zzj(zzfu.zzk(zzamVar3));
            if (lZzj == zzfu.zzi()) {
                return zzfu.zza();
            }
            iIntValue = lZzj.intValue();
            if (iIntValue < 0) {
                return zzfu.zza();
            }
        }
        try {
            Matcher matcher = Pattern.compile(zzfu.zzm(zzfu.zzk(zzamVar2)), i).matcher(zzfu.zzm(zzfu.zzk(zzamVar)));
            String strGroup = null;
            if (matcher.find() && matcher.groupCount() >= iIntValue) {
                strGroup = matcher.group(iIntValue);
            }
            return strGroup == null ? zzfu.zza() : zzfu.zzb(strGroup);
        } catch (PatternSyntaxException unused) {
            return zzfu.zza();
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
