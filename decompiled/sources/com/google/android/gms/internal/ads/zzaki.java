package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaki implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzake
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzaki.zza;
            return new zzabb[]{new zzaki()};
        }
    };
    private zzabe zzb;
    private zzace zzc;
    private zzakg zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        int iZzk;
        zzdy.zzb(this.zzc);
        int i = zzfk.zza;
        int i2 = this.zzd;
        if (i2 == 0) {
            zzdy.zzf(zzabcVar.zzf() == 0);
            int i3 = this.zzg;
            if (i3 != -1) {
                ((zzaar) zzabcVar).zzo(i3, false);
                this.zzd = 4;
            } else {
                if (!zzakl.zzc(zzabcVar)) {
                    throw zzcd.zza("Unsupported or unrecognized wav file type.", null);
                }
                ((zzaar) zzabcVar).zzo((int) (zzabcVar.zze() - zzabcVar.zzf()), false);
                this.zzd = 1;
            }
            return 0;
        }
        long jZzq = -1;
        if (i2 == 1) {
            zzfb zzfbVar = new zzfb(8);
            zzakk zzakkVarZza = zzakk.zza(zzabcVar, zzfbVar);
            if (zzakkVarZza.zza != 1685272116) {
                zzabcVar.zzj();
            } else {
                zzaar zzaarVar = (zzaar) zzabcVar;
                zzaarVar.zzl(8, false);
                zzfbVar.zzG(0);
                zzaarVar.zzm(zzfbVar.zzI(), 0, 8, false);
                jZzq = zzfbVar.zzq();
                zzaarVar.zzo(((int) zzakkVarZza.zzb) + 8, false);
            }
            this.zze = jZzq;
            this.zzd = 2;
            return 0;
        }
        if (i2 == 2) {
            zzakj zzakjVarZzb = zzakl.zzb(zzabcVar);
            int i4 = zzakjVarZzb.zza;
            if (i4 == 17) {
                this.zzf = new zzakf(this.zzb, this.zzc, zzakjVarZzb);
            } else if (i4 == 6) {
                this.zzf = new zzakh(this.zzb, this.zzc, zzakjVarZzb, "audio/g711-alaw", -1);
            } else if (i4 == 7) {
                this.zzf = new zzakh(this.zzb, this.zzc, zzakjVarZzb, "audio/g711-mlaw", -1);
            } else {
                int i5 = zzakjVarZzb.zze;
                if (i4 == 1) {
                    iZzk = zzfk.zzk(i5);
                } else {
                    if (i4 != 3) {
                        if (i4 == 65534) {
                            iZzk = zzfk.zzk(i5);
                        }
                    } else if (i5 == 32) {
                        iZzk = 4;
                    }
                    iZzk = 0;
                }
                if (iZzk == 0) {
                    throw zzcd.zzc("Unsupported WAV format type: " + i4);
                }
                this.zzf = new zzakh(this.zzb, this.zzc, zzakjVarZzb, "audio/raw", iZzk);
            }
            this.zzd = 3;
            return 0;
        }
        if (i2 != 3) {
            zzdy.zzf(this.zzh != -1);
            long jZzf = this.zzh - zzabcVar.zzf();
            zzakg zzakgVar = this.zzf;
            zzakgVar.getClass();
            return zzakgVar.zzc(zzabcVar, jZzf) ? -1 : 0;
        }
        Pair pairZza = zzakl.zza(zzabcVar);
        this.zzg = ((Long) pairZza.first).intValue();
        long jLongValue = ((Long) pairZza.second).longValue();
        long j = this.zze;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        long j2 = ((long) this.zzg) + jLongValue;
        this.zzh = j2;
        long jZzd = zzabcVar.zzd();
        if (jZzd != -1 && j2 > jZzd) {
            zzes.zzf("WavExtractor", "Data exceeds input length: " + j2 + ", " + jZzd);
            this.zzh = jZzd;
            j2 = jZzd;
        }
        zzakg zzakgVar2 = this.zzf;
        zzakgVar2.getClass();
        zzakgVar2.zza(this.zzg, j2);
        this.zzd = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzb = zzabeVar;
        this.zzc = zzabeVar.zzv(0, 1);
        zzabeVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        this.zzd = j == 0 ? 0 : 4;
        zzakg zzakgVar = this.zzf;
        if (zzakgVar != null) {
            zzakgVar.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        return zzakl.zzc(zzabcVar);
    }
}
