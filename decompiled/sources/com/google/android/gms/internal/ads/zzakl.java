package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzakl {
    public static Pair zza(zzabc zzabcVar) throws IOException {
        zzabcVar.zzj();
        zzakk zzakkVarZzd = zzd(1684108385, zzabcVar, new zzfb(8));
        ((zzaar) zzabcVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzabcVar.zzf()), Long.valueOf(zzakkVarZzd.zzb));
    }

    public static zzakj zzb(zzabc zzabcVar) throws IOException {
        byte[] bArr;
        zzfb zzfbVar = new zzfb(16);
        zzakk zzakkVarZzd = zzd(1718449184, zzabcVar, zzfbVar);
        zzdy.zzf(zzakkVarZzd.zzb >= 16);
        zzaar zzaarVar = (zzaar) zzabcVar;
        zzaarVar.zzm(zzfbVar.zzI(), 0, 16, false);
        zzfbVar.zzG(0);
        int iZzj = zzfbVar.zzj();
        int iZzj2 = zzfbVar.zzj();
        int iZzi = zzfbVar.zzi();
        int iZzi2 = zzfbVar.zzi();
        int iZzj3 = zzfbVar.zzj();
        int iZzj4 = zzfbVar.zzj();
        int i = ((int) zzakkVarZzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzaarVar.zzm(bArr, 0, i, false);
        } else {
            bArr = zzfk.zzf;
        }
        byte[] bArr2 = bArr;
        zzaarVar.zzo((int) (zzabcVar.zze() - zzabcVar.zzf()), false);
        return new zzakj(iZzj, iZzj2, iZzi, iZzi2, iZzj3, iZzj4, bArr2);
    }

    public static boolean zzc(zzabc zzabcVar) throws IOException {
        zzfb zzfbVar = new zzfb(8);
        int i = zzakk.zza(zzabcVar, zzfbVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzaar) zzabcVar).zzm(zzfbVar.zzI(), 0, 4, false);
        zzfbVar.zzG(0);
        int iZzf = zzfbVar.zzf();
        if (iZzf == 1463899717) {
            return true;
        }
        zzes.zzc("WavHeaderReader", "Unsupported form type: " + iZzf);
        return false;
    }

    private static zzakk zzd(int i, zzabc zzabcVar, zzfb zzfbVar) throws IOException {
        zzakk zzakkVarZza = zzakk.zza(zzabcVar, zzfbVar);
        while (true) {
            int i2 = zzakkVarZza.zza;
            if (i2 == i) {
                return zzakkVarZza;
            }
            zzes.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zzakkVarZza.zzb + 8;
            if (j > 2147483647L) {
                throw zzcd.zzc("Chunk is too large (~2GB+) to skip; id: " + zzakkVarZza.zza);
            }
            ((zzaar) zzabcVar).zzo((int) j, false);
            zzakkVarZza = zzakk.zza(zzabcVar, zzfbVar);
        }
    }
}
