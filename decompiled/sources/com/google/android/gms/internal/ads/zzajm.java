package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajm implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzajk
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzajm.zza;
            return new zzabb[]{new zzajm()};
        }
    };
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zzaji zzj;
    private zzabe zzk;
    private boolean zzl;
    private final zzfi zzb = new zzfi(0);
    private final zzfb zzd = new zzfb(4096);
    private final SparseArray zzc = new SparseArray();
    private final zzajj zze = new zzajj();

    /* JADX WARN: Code duplicated, block: B:64:0x0147  */
    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        zzaio zzaiqVar;
        zzdy.zzb(this.zzk);
        long jZzd = zzabcVar.zzd();
        if (jZzd != -1) {
            zzajj zzajjVar = this.zze;
            if (!zzajjVar.zze()) {
                return zzajjVar.zza(zzabcVar, zzabxVar);
            }
        }
        if (!this.zzl) {
            this.zzl = true;
            zzajj zzajjVar2 = this.zze;
            if (zzajjVar2.zzb() != -9223372036854775807L) {
                zzaji zzajiVar = new zzaji(zzajjVar2.zzd(), zzajjVar2.zzb(), jZzd);
                this.zzj = zzajiVar;
                this.zzk.zzN(zzajiVar.zzb());
            } else {
                this.zzk.zzN(new zzabz(zzajjVar2.zzb(), 0L));
            }
        }
        zzaji zzajiVar2 = this.zzj;
        if (zzajiVar2 != null && zzajiVar2.zze()) {
            return zzajiVar2.zza(zzabcVar, zzabxVar);
        }
        zzabcVar.zzj();
        long jZze = jZzd != -1 ? jZzd - zzabcVar.zze() : -1L;
        if ((jZze != -1 && jZze < 4) || !zzabcVar.zzm(this.zzd.zzI(), 0, 4, true)) {
            return -1;
        }
        this.zzd.zzG(0);
        int iZzf = this.zzd.zzf();
        if (iZzf == 441) {
            return -1;
        }
        if (iZzf == 442) {
            zzaar zzaarVar = (zzaar) zzabcVar;
            zzaarVar.zzm(this.zzd.zzI(), 0, 10, false);
            this.zzd.zzG(9);
            zzaarVar.zzo((this.zzd.zzl() & 7) + 14, false);
            return 0;
        }
        if (iZzf == 443) {
            zzaar zzaarVar2 = (zzaar) zzabcVar;
            zzaarVar2.zzm(this.zzd.zzI(), 0, 2, false);
            this.zzd.zzG(0);
            zzaarVar2.zzo(this.zzd.zzp() + 6, false);
            return 0;
        }
        if ((iZzf >> 8) != 1) {
            ((zzaar) zzabcVar).zzo(1, false);
            return 0;
        }
        int i = iZzf & 255;
        zzajl zzajlVar = (zzajl) this.zzc.get(i);
        if (!this.zzf) {
            if (zzajlVar == null) {
                zzaio zzaioVar = null;
                if (i == 189) {
                    zzaiqVar = new zzaie(null);
                    this.zzg = true;
                    this.zzi = zzabcVar.zzf();
                } else if ((i & 224) == 192) {
                    zzaiqVar = new zzajc(null);
                    this.zzg = true;
                    this.zzi = zzabcVar.zzf();
                } else if ((i & 240) == 224) {
                    zzaiqVar = new zzaiq(null);
                    this.zzh = true;
                    this.zzi = zzabcVar.zzf();
                } else if (zzaioVar != null) {
                    zzaioVar.zzb(this.zzk, new zzaka(Integer.MIN_VALUE, i, 256));
                    zzajlVar = new zzajl(zzaioVar, this.zzb);
                    this.zzc.put(i, zzajlVar);
                }
                zzaioVar = zzaiqVar;
                if (zzaioVar != null) {
                    zzaioVar.zzb(this.zzk, new zzaka(Integer.MIN_VALUE, i, 256));
                    zzajlVar = new zzajl(zzaioVar, this.zzb);
                    this.zzc.put(i, zzajlVar);
                }
            }
            long j = 1048576;
            if (this.zzg && this.zzh) {
                j = this.zzi + 8192;
            }
            if (zzabcVar.zzf() > j) {
                this.zzf = true;
                this.zzk.zzC();
            }
        }
        zzaar zzaarVar3 = (zzaar) zzabcVar;
        zzaarVar3.zzm(this.zzd.zzI(), 0, 2, false);
        this.zzd.zzG(0);
        int iZzp = this.zzd.zzp() + 6;
        if (zzajlVar == null) {
            zzaarVar3.zzo(iZzp, false);
        } else {
            this.zzd.zzD(iZzp);
            zzaarVar3.zzn(this.zzd.zzI(), 0, iZzp, false);
            this.zzd.zzG(6);
            zzajlVar.zza(this.zzd);
            zzfb zzfbVar = this.zzd;
            zzfbVar.zzF(zzfbVar.zzb());
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzk = zzabeVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        zzfi zzfiVar = this.zzb;
        if (zzfiVar.zze() != -9223372036854775807L) {
            long jZzc = zzfiVar.zzc();
            if (jZzc != -9223372036854775807L && jZzc != 0 && jZzc != j2) {
                zzfiVar.zzf(j2);
            }
        } else {
            zzfiVar.zzf(j2);
        }
        zzaji zzajiVar = this.zzj;
        if (zzajiVar != null) {
            zzajiVar.zzd(j2);
        }
        for (int i = 0; i < this.zzc.size(); i++) {
            ((zzajl) this.zzc.valueAt(i)).zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        byte[] bArr = new byte[14];
        zzaar zzaarVar = (zzaar) zzabcVar;
        zzaarVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzaarVar.zzl(bArr[13] & 7, false);
        zzaarVar.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
