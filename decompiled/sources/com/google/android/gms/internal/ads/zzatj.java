package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzatj extends zzatm {
    private final View zzi;

    public zzatj(zzary zzaryVar, String str, String str2, zzanv zzanvVar, int i, int i2, View view) {
        super(zzaryVar, "0+zdyC6VPJhTjPaEoqOWHTMOFQN+wcQzU7Oc0uK1pdETw1P+GgKsW//19LiWUDiB", "beFEMZ/YBSUug4MSXb2BKymKiM6ZxOOlxExWa37jMlM=", zzanvVar, i, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdg);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjR);
            zzasc zzascVar = new zzasc((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzaoq zzaoqVarZza = zzaor.zza();
            zzaoqVarZza.zzb(zzascVar.zza.longValue());
            zzaoqVarZza.zzd(zzascVar.zzb.longValue());
            zzaoqVarZza.zze(zzascVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzaoqVarZza.zzc(zzascVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzaoqVarZza.zza(zzascVar.zzd.longValue());
            }
            this.zze.zzY((zzaor) zzaoqVarZza.zzal());
        }
    }
}
