package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajp {
    private final List zza;
    private final zzace[] zzb;

    public zzajp(List list) {
        this.zza = list;
        this.zzb = new zzace[list.size()];
    }

    public final void zza(long j, zzfb zzfbVar) {
        zzaao.zza(j, zzfbVar, this.zzb);
    }

    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzakaVar.zzc();
            zzace zzaceVarZzv = zzabeVar.zzv(zzakaVar.zza(), 3);
            zzam zzamVar = (zzam) this.zza.get(i);
            String str = zzamVar.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzdy.zze(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String strZzb = zzamVar.zzb;
            if (strZzb == null) {
                strZzb = zzakaVar.zzb();
            }
            zzak zzakVar = new zzak();
            zzakVar.zzH(strZzb);
            zzakVar.zzS(str);
            zzakVar.zzU(zzamVar.zze);
            zzakVar.zzK(zzamVar.zzd);
            zzakVar.zzu(zzamVar.zzE);
            zzakVar.zzI(zzamVar.zzo);
            zzaceVarZzv.zzk(zzakVar.zzY());
            this.zzb[i] = zzaceVarZzv;
        }
    }
}
