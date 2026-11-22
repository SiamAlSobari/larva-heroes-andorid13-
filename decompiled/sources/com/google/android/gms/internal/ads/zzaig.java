package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaig implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzaif
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzaig.zza;
            return new zzabb[]{new zzaig()};
        }
    };
    private final zzaih zzb = new zzaih(null);
    private final zzfb zzc = new zzfb(16384);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        int iZza = zzabcVar.zza(this.zzc.zzI(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        this.zzc.zzG(0);
        this.zzc.zzF(iZza);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzb.zzb(zzabeVar, new zzaka(Integer.MIN_VALUE, 0, 1));
        zzabeVar.zzC();
        zzabeVar.zzN(new zzabz(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        this.zzd = false;
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        zzaar zzaarVar;
        int i;
        zzfb zzfbVar = new zzfb(10);
        int i2 = 0;
        while (true) {
            zzaarVar = (zzaar) zzabcVar;
            zzaarVar.zzm(zzfbVar.zzI(), 0, 10, false);
            zzfbVar.zzG(0);
            if (zzfbVar.zzn() != 4801587) {
                break;
            }
            zzfbVar.zzH(3);
            int iZzk = zzfbVar.zzk();
            i2 += iZzk + 10;
            zzaarVar.zzl(iZzk, false);
        }
        zzabcVar.zzj();
        zzaarVar.zzl(i2, false);
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                zzaarVar.zzm(zzfbVar.zzI(), 0, 7, false);
                zzfbVar.zzG(0);
                int iZzp = zzfbVar.zzp();
                if (iZzp == 44096 || iZzp == 44097) {
                    i4++;
                    if (i4 >= 4) {
                        return true;
                    }
                    byte[] bArrZzI = zzfbVar.zzI();
                    int i6 = zzaaf.zza;
                    if (bArrZzI.length < 7) {
                        i = -1;
                    } else {
                        int i7 = ((bArrZzI[2] & 255) << 8) | (bArrZzI[3] & 255);
                        if (i7 == 65535) {
                            i7 = ((bArrZzI[4] & 255) << 16) | ((bArrZzI[5] & 255) << 8) | (bArrZzI[6] & 255);
                        } else {
                            i5 = 4;
                        }
                        if (iZzp == 44097) {
                            i5 += 2;
                        }
                        i = i7 + i5;
                    }
                    if (i == -1) {
                        return false;
                    }
                    zzaarVar.zzl(i - 7, false);
                }
            }
            zzabcVar.zzj();
            i3++;
            if (i3 - i2 >= 8192) {
                return false;
            }
            zzaarVar.zzl(i3, false);
        }
    }
}
