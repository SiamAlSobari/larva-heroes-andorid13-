package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabr {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;
    public final String zzg;

    private zzabr(List list, int i, int i2, int i3, int i4, int i5, int i6, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = f;
        this.zzg = str;
    }

    public static zzabr zza(zzfb zzfbVar) throws zzcd {
        try {
            zzfbVar.zzH(21);
            int iZzl = zzfbVar.zzl() & 3;
            int iZzl2 = zzfbVar.zzl();
            int iZzc = zzfbVar.zzc();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < iZzl2; i3++) {
                zzfbVar.zzH(1);
                int iZzp = zzfbVar.zzp();
                for (int i4 = 0; i4 < iZzp; i4++) {
                    int iZzp2 = zzfbVar.zzp();
                    i2 += iZzp2 + 4;
                    zzfbVar.zzH(iZzp2);
                }
            }
            zzfbVar.zzG(iZzc);
            byte[] bArr = new byte[i2];
            String strZzb = null;
            int i5 = 0;
            int i6 = 0;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            float f = 1.0f;
            while (i5 < iZzl2) {
                int iZzl3 = zzfbVar.zzl() & 63;
                int iZzp3 = zzfbVar.zzp();
                int i12 = 0;
                while (i12 < iZzp3) {
                    int iZzp4 = zzfbVar.zzp();
                    int i13 = iZzl2;
                    System.arraycopy(zzfy.zza, i, bArr, i6, 4);
                    int i14 = i6 + 4;
                    System.arraycopy(zzfbVar.zzI(), zzfbVar.zzc(), bArr, i14, iZzp4);
                    if (iZzl3 == 33 && i12 == 0) {
                        zzfv zzfvVarZzc = zzfy.zzc(bArr, i14 + 2, i14 + iZzp4);
                        i7 = zzfvVarZzc.zzg;
                        i8 = zzfvVarZzc.zzh;
                        i9 = zzfvVarZzc.zzj;
                        int i15 = zzfvVarZzc.zzk;
                        int i16 = zzfvVarZzc.zzl;
                        float f2 = zzfvVarZzc.zzi;
                        strZzb = zzea.zzb(zzfvVarZzc.zza, zzfvVarZzc.zzb, zzfvVarZzc.zzc, zzfvVarZzc.zzd, zzfvVarZzc.zze, zzfvVarZzc.zzf);
                        i12 = 0;
                        f = f2;
                        i10 = i15;
                        i11 = i16;
                    }
                    i6 = i14 + iZzp4;
                    zzfbVar.zzH(iZzp4);
                    i12++;
                    iZzl2 = i13;
                    iZzl3 = iZzl3;
                    iZzp3 = iZzp3;
                    i = 0;
                }
                i5++;
                i = 0;
            }
            return new zzabr(i2 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iZzl + 1, i7, i8, i9, i10, i11, f, strZzb);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcd.zza("Error parsing HEVC config", e);
        }
    }
}
