package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaij implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzaii
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzaij.zza;
            return new zzabb[]{new zzaij(0)};
        }
    };
    private final zzaik zzb;
    private final zzfb zzc;
    private final zzfb zzd;
    private final zzfa zze;
    private zzabe zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzaij() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        zzdy.zzb(this.zzf);
        int iZza = zzabcVar.zza(this.zzc.zzI(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzN(new zzabz(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (iZza == -1) {
            return -1;
        }
        this.zzc.zzG(0);
        this.zzc.zzF(iZza);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzf = zzabeVar;
        this.zzb.zzb(zzabeVar, new zzaka(Integer.MIN_VALUE, 0, 1));
        zzabeVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        zzaar zzaarVar;
        int i = 0;
        while (true) {
            zzaarVar = (zzaar) zzabcVar;
            zzaarVar.zzm(this.zzd.zzI(), 0, 10, false);
            this.zzd.zzG(0);
            if (this.zzd.zzn() != 4801587) {
                break;
            }
            this.zzd.zzH(3);
            int iZzk = this.zzd.zzk();
            i += iZzk + 10;
            zzaarVar.zzl(iZzk, false);
        }
        zzabcVar.zzj();
        zzaarVar.zzl(i, false);
        if (this.zzh == -1) {
            this.zzh = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            zzaarVar.zzm(this.zzd.zzI(), 0, 2, false);
            this.zzd.zzG(0);
            if (zzaik.zzf(this.zzd.zzp())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzaarVar.zzm(this.zzd.zzI(), 0, 4, false);
                this.zze.zzj(14);
                int iZzd = this.zze.zzd(13);
                if (iZzd <= 6) {
                    i2++;
                    zzabcVar.zzj();
                    zzaarVar.zzl(i2, false);
                } else {
                    zzaarVar.zzl(iZzd - 6, false);
                    i4 += iZzd;
                }
            } else {
                i2++;
                zzabcVar.zzj();
                zzaarVar.zzl(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    public zzaij(int i) {
        this.zzb = new zzaik(true, null);
        this.zzc = new zzfb(2048);
        this.zzh = -1L;
        zzfb zzfbVar = new zzfb(10);
        this.zzd = zzfbVar;
        byte[] bArrZzI = zzfbVar.zzI();
        this.zze = new zzfa(bArrZzI, bArrZzI.length);
    }
}
