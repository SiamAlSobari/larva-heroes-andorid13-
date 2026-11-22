package com.google.android.gms.tagmanager;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcx extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.JOINER.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ARG0.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.ITEM_SEPARATOR.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.KEY_VALUE_SEPARATOR.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.ESCAPE.toString();

    public zzcx() {
        super(zza, zzb);
    }

    private static final void zzc(Set set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    private static final String zzd(String str, int i, Set set) {
        int i2 = i - 1;
        if (i2 == 1) {
            try {
                return zzfx.zza(str);
            } catch (UnsupportedEncodingException e) {
                Log.e("GoogleTagManager", "Joiner: unsupported encoding", e);
                return str;
            }
        }
        if (i2 != 2) {
            return str;
        }
        String strReplace = str.replace("\\", "\\\\");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String string = ((Character) it.next()).toString();
            strReplace = strReplace.replace(string, "\\".concat(String.valueOf(string)));
        }
        return strReplace;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        int i;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        if (zzamVar == null) {
            return zzfu.zza();
        }
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        String strZzm = zzamVar2 != null ? zzfu.zzm(zzfu.zzk(zzamVar2)) : "";
        com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zzd);
        String strZzm2 = zzamVar3 != null ? zzfu.zzm(zzfu.zzk(zzamVar3)) : "=";
        com.google.android.gms.internal.gtm.zzam zzamVar4 = (com.google.android.gms.internal.gtm.zzam) map.get(zze);
        HashSet hashSet = null;
        boolean z = true;
        if (zzamVar4 != null) {
            String strZzm3 = zzfu.zzm(zzfu.zzk(zzamVar4));
            if ("url".equals(strZzm3)) {
                i = 2;
            } else {
                if (!"backslash".equals(strZzm3)) {
                    Log.e("GoogleTagManager", "Joiner: unsupported escape type: ".concat(String.valueOf(strZzm3)));
                    return zzfu.zza();
                }
                hashSet = new HashSet();
                zzc(hashSet, strZzm);
                zzc(hashSet, strZzm2);
                hashSet.remove('\\');
                i = 3;
            }
        } else {
            i = 1;
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.internal.gtm.zzat zzatVar = com.google.android.gms.internal.gtm.zzat.STRING;
        int iOrdinal = zzamVar.zzh().ordinal();
        if (iOrdinal == 1) {
            for (com.google.android.gms.internal.gtm.zzam zzamVar5 : zzamVar.zzs()) {
                if (!z) {
                    sb.append(strZzm);
                }
                sb.append(zzd(zzfu.zzm(zzfu.zzk(zzamVar5)), i, hashSet));
                z = false;
            }
        } else if (iOrdinal != 2) {
            sb.append(zzd(zzfu.zzm(zzfu.zzk(zzamVar)), i, hashSet));
        } else {
            for (int i2 = 0; i2 < zzamVar.zzc(); i2++) {
                if (i2 > 0) {
                    sb.append(strZzm);
                }
                String strZzm4 = zzfu.zzm(zzfu.zzk(zzamVar.zzl(i2)));
                String strZzm5 = zzfu.zzm(zzfu.zzk(zzamVar.zzm(i2)));
                sb.append(zzd(strZzm4, i, hashSet));
                sb.append(strZzm2);
                sb.append(zzd(strZzm5, i, hashSet));
            }
        }
        return zzfu.zzb(sb.toString());
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
