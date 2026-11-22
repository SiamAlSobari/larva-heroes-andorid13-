package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzain implements zzaio {
    private final List zza;
    private final zzace[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzain(List list) {
        this.zza = list;
        this.zzb = new zzace[list.size()];
    }

    private final boolean zzf(zzfb zzfbVar, int i) {
        if (zzfbVar.zza() == 0) {
            return false;
        }
        if (zzfbVar.zzl() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfbVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzfbVar, 32)) {
                if (this.zzd != 1 || zzf(zzfbVar, 0)) {
                    int iZzc = zzfbVar.zzc();
                    int iZza = zzfbVar.zza();
                    for (zzace zzaceVar : this.zzb) {
                        zzfbVar.zzG(iZzc);
                        zzaceVar.zzq(zzfbVar, iZza);
                    }
                    this.zze += iZza;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzajx zzajxVar = (zzajx) this.zza.get(i);
            zzakaVar.zzc();
            zzace zzaceVarZzv = zzabeVar.zzv(zzakaVar.zza(), 3);
            zzak zzakVar = new zzak();
            zzakVar.zzH(zzakaVar.zzb());
            zzakVar.zzS("application/dvbsubs");
            zzakVar.zzI(Collections.singletonList(zzajxVar.zzb));
            zzakVar.zzK(zzajxVar.zza);
            zzaceVarZzv.zzk(zzakVar.zzY());
            this.zzb[i] = zzaceVarZzv;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzace zzaceVar : this.zzb) {
                    zzaceVar.zzs(this.zzf, 1, this.zze, 0, null);
                }
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j != -9223372036854775807L) {
            this.zzf = j;
        }
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
