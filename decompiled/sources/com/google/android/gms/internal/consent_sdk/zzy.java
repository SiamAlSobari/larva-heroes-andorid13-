package com.google.android.gms.internal.consent_sdk;

import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzy {
    private final zzz zza;
    private final zzbw zzb;
    private int zzc = 0;

    zzy(zzz zzzVar, zzbw zzbwVar) {
        this.zza = zzzVar;
        this.zzb = zzbwVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    final zzaa zza() throws zzj {
        String str;
        zzbw zzbwVar = this.zzb;
        int i = zzbwVar.zzf;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.zzc = 3;
                break;
            case 4:
                this.zzc = 2;
                break;
            case 5:
                this.zzc = 1;
                break;
            case 6:
                String strValueOf = String.valueOf(zzbwVar.zzc);
                throw new zzj(1, strValueOf.length() != 0 ? "Invalid response from server: ".concat(strValueOf) : new String("Invalid response from server: "));
            case 7:
                String strValueOf2 = String.valueOf(zzbwVar.zzc);
                throw new zzj(3, strValueOf2.length() != 0 ? "Publisher misconfiguration: ".concat(strValueOf2) : new String("Publisher misconfiguration: "));
            default:
                throw new zzj(1, "Invalid response from server.");
        }
        String str2 = zzbwVar.zza;
        zzbc zzbcVar = str2 == null ? null : new zzbc(zzbwVar.zzb, str2);
        this.zza.zzc.zzg(new HashSet(this.zzb.zzd));
        for (zzbv zzbvVar : this.zzb.zze) {
            int i3 = zzbvVar.zzb;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                str = null;
            } else if (i4 == 1) {
                str = "write";
            } else if (i4 != 2) {
                str = null;
            } else {
                str = "clear";
            }
            if (str != null) {
                this.zza.zza.zzb(str, zzbvVar.zza, this.zza.zzb);
            }
        }
        return new zzaa(this.zzc, zzbcVar, null);
    }
}
