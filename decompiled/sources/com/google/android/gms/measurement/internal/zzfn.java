package com.google.android.gms.measurement.internal;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfn implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfp zza;

    zzfn(zzfp zzfpVar) {
        this.zza = zzfpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z, boolean z2) {
        zzem zzemVarZzc;
        int i2 = i - 1;
        if (i2 == 0) {
            zzemVarZzc = this.zza.zzs.zzay().zzc();
        } else if (i2 != 1) {
            if (i2 == 3) {
                zzemVarZzc = this.zza.zzs.zzay().zzj();
            } else if (i2 != 4) {
                zzemVarZzc = this.zza.zzs.zzay().zzi();
            } else if (z) {
                zzemVarZzc = this.zza.zzs.zzay().zzm();
            } else {
                zzemVarZzc = !z2 ? this.zza.zzs.zzay().zzl() : this.zza.zzs.zzay().zzk();
            }
        } else if (z) {
            zzemVarZzc = this.zza.zzs.zzay().zzh();
        } else {
            zzemVarZzc = !z2 ? this.zza.zzs.zzay().zze() : this.zza.zzs.zzay().zzd();
        }
        int size = list.size();
        if (size == 1) {
            zzemVarZzc.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzemVarZzc.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzemVarZzc.zza(str);
        } else {
            zzemVarZzc.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
