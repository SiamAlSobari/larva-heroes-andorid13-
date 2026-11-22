package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzebm extends zzebn {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcvm zzd;
    private final TelephonyManager zze;
    private final zzebe zzf;
    private int zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzazr.CONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzazr.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzazr.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzazr.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzazr.DISCONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzazr.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzazr.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzazr.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzazr.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzazr.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzazr.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzazr.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzazr.CONNECTING);
    }

    zzebm(Context context, zzcvm zzcvmVar, zzebe zzebeVar, zzeba zzebaVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzebaVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcvmVar;
        this.zzf = zzebeVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ zzazi zza(zzebm zzebmVar, Bundle bundle) {
        zzazb zzazbVarZza = zzazi.zza();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            zzebmVar.zzg = 2;
        } else {
            zzebmVar.zzg = 1;
            if (i == 0) {
                zzazbVarZza.zzb(2);
            } else if (i != 1) {
                zzazbVarZza.zzb(1);
            } else {
                zzazbVarZza.zzb(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            zzazbVarZza.zza(i3);
        }
        return (zzazi) zzazbVarZza.zzal();
    }

    static /* bridge */ /* synthetic */ zzazr zzb(zzebm zzebmVar, Bundle bundle) {
        return (zzazr) zzb.get(zzfcm.zza(zzfcm.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzazr.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] zze(zzebm zzebmVar, boolean z, ArrayList arrayList, zzazi zzaziVar, zzazr zzazrVar) {
        zzazm zzazmVarZzg = zzazn.zzg();
        zzazmVarZzg.zza(arrayList);
        zzazmVarZzg.zzi(zzg(Settings.Global.getInt(zzebmVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzazmVarZzg.zzj(com.google.android.gms.ads.internal.zzt.zzq().zzj(zzebmVar.zzc, zzebmVar.zze));
        zzazmVarZzg.zzf(zzebmVar.zzf.zze());
        zzazmVarZzg.zze(zzebmVar.zzf.zzb());
        zzazmVarZzg.zzb(zzebmVar.zzf.zza());
        zzazmVarZzg.zzc(zzazrVar);
        zzazmVarZzg.zzd(zzaziVar);
        zzazmVarZzg.zzk(zzebmVar.zzg);
        zzazmVarZzg.zzl(zzg(z));
        zzazmVarZzg.zzh(zzebmVar.zzf.zzd());
        zzazmVarZzg.zzg(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
        zzazmVarZzg.zzm(zzg(Settings.Global.getInt(zzebmVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return ((zzazn) zzazmVarZzg.zzal()).zzax();
    }

    private static final int zzg(boolean z) {
        return z ? 2 : 1;
    }

    public final void zzd(boolean z) {
        zzfye.zzr(this.zzd.zzb(), new zzebl(this, z), zzcan.zzf);
    }
}
