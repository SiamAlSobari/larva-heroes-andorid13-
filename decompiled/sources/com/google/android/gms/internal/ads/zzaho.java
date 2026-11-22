package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaho extends zzahy {
    private zzabo zza;
    private zzahn zzb;

    zzaho() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    protected final long zza(zzfb zzfbVar) {
        if (!zzd(zzfbVar.zzI())) {
            return -1L;
        }
        int i = (zzfbVar.zzI()[2] & 255) >> 4;
        if (i == 6) {
            zzfbVar.zzH(4);
            zzfbVar.zzv();
        } else if (i == 7) {
            i = 7;
            zzfbVar.zzH(4);
            zzfbVar.zzv();
        }
        int iZza = zzabk.zza(zzfbVar, i);
        zzfbVar.zzG(0);
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfb zzfbVar, long j, zzahv zzahvVar) {
        byte[] bArrZzI = zzfbVar.zzI();
        zzabo zzaboVar = this.zza;
        if (zzaboVar == null) {
            zzabo zzaboVar2 = new zzabo(bArrZzI, 17);
            this.zza = zzaboVar2;
            zzahvVar.zza = zzaboVar2.zzc(Arrays.copyOfRange(bArrZzI, 9, zzfbVar.zzd()), null);
            return true;
        }
        if ((bArrZzI[0] & 127) == 3) {
            zzabn zzabnVarZzb = zzabl.zzb(zzfbVar);
            zzabo zzaboVarZzf = zzaboVar.zzf(zzabnVarZzb);
            this.zza = zzaboVarZzf;
            this.zzb = new zzahn(zzaboVarZzf, zzabnVarZzb);
            return true;
        }
        if (!zzd(bArrZzI)) {
            return true;
        }
        zzahn zzahnVar = this.zzb;
        if (zzahnVar != null) {
            zzahnVar.zza(j);
            zzahvVar.zzb = this.zzb;
        }
        zzahvVar.zza.getClass();
        return false;
    }
}
