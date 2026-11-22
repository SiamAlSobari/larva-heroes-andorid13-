package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaid implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzaic
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzaid.zza;
            return new zzabb[]{new zzaid()};
        }
    };
    private final zzaie zzb = new zzaie(null);
    private final zzfb zzc = new zzfb(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        int iZza = zzabcVar.zza(this.zzc.zzI(), 0, 2786);
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
        zzfb zzfbVar = new zzfb(10);
        int i = 0;
        while (true) {
            zzaarVar = (zzaar) zzabcVar;
            zzaarVar.zzm(zzfbVar.zzI(), 0, 10, false);
            zzfbVar.zzG(0);
            if (zzfbVar.zzn() != 4801587) {
                break;
            }
            zzfbVar.zzH(3);
            int iZzk = zzfbVar.zzk();
            i += iZzk + 10;
            zzaarVar.zzl(iZzk, false);
        }
        zzabcVar.zzj();
        zzaarVar.zzl(i, false);
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                zzaarVar.zzm(zzfbVar.zzI(), 0, 6, false);
                zzfbVar.zzG(0);
                if (zzfbVar.zzp() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int iZzb = zzaac.zzb(zzfbVar.zzI());
                if (iZzb == -1) {
                    return false;
                }
                zzaarVar.zzl(iZzb - 6, false);
            }
            zzabcVar.zzj();
            i2++;
            if (i2 - i >= 8192) {
                return false;
            }
            zzaarVar.zzl(i2, false);
        }
    }
}
