package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzfhf {
    public static zzfhg zza(Context context, int i) {
        boolean zBooleanValue;
        if (zzfhu.zza()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbdd.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbdd.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbdd.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) zzbdd.zze.zze()).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfhi(context, i);
            }
        }
        return new zzfid();
    }

    public static zzfhg zzb(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfhg zzfhgVarZza = zza(context, i);
        if (!(zzfhgVarZza instanceof zzfhi)) {
            return zzfhgVarZza;
        }
        zzfhgVarZza.zzh();
        zzfhgVarZza.zzm(i2);
        if (zzfhq.zze(zzlVar.zzp)) {
            zzfhgVarZza.zze(zzlVar.zzp);
        }
        return zzfhgVarZza;
    }
}
