package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzade extends zzadj {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzade(zzace zzaceVar) {
        super(zzaceVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    protected final boolean zza(zzfb zzfbVar) throws zzadi {
        if (this.zzc) {
            zzfbVar.zzH(1);
        } else {
            int iZzl = zzfbVar.zzl();
            int i = iZzl >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(iZzl >> 2) & 3];
                zzak zzakVar = new zzak();
                zzakVar.zzS("audio/mpeg");
                zzakVar.zzw(1);
                zzakVar.zzT(i2);
                this.zza.zzk(zzakVar.zzY());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzak zzakVar2 = new zzak();
                zzakVar2.zzS(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzakVar2.zzw(1);
                zzakVar2.zzT(GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY);
                this.zza.zzk(zzakVar2.zzY());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzadi("Audio format not supported: " + i);
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    protected final boolean zzb(zzfb zzfbVar, long j) throws zzcd {
        if (this.zze == 2) {
            int iZza = zzfbVar.zza();
            this.zza.zzq(zzfbVar, iZza);
            this.zza.zzs(j, 1, iZza, 0, null);
            return true;
        }
        int iZzl = zzfbVar.zzl();
        if (iZzl != 0 || this.zzd) {
            if (this.zze == 10 && iZzl != 1) {
                return false;
            }
            int iZza2 = zzfbVar.zza();
            this.zza.zzq(zzfbVar, iZza2);
            this.zza.zzs(j, 1, iZza2, 0, null);
            return true;
        }
        int iZza3 = zzfbVar.zza();
        byte[] bArr = new byte[iZza3];
        zzfbVar.zzC(bArr, 0, iZza3);
        zzzy zzzyVarZza = zzzz.zza(bArr);
        zzak zzakVar = new zzak();
        zzakVar.zzS("audio/mp4a-latm");
        zzakVar.zzx(zzzyVarZza.zzc);
        zzakVar.zzw(zzzyVarZza.zzb);
        zzakVar.zzT(zzzyVarZza.zza);
        zzakVar.zzI(Collections.singletonList(bArr));
        this.zza.zzk(zzakVar.zzY());
        this.zzd = true;
        return false;
    }
}
