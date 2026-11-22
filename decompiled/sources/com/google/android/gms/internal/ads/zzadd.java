package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzadd implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzadc
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzadd.zza;
            return new zzabb[]{new zzadd(0)};
        }
    };
    private final byte[] zzb;
    private final zzfb zzc;
    private final zzabj zzd;
    private zzabe zze;
    private zzace zzf;
    private int zzg;
    private zzbz zzh;
    private zzabo zzi;
    private int zzj;
    private int zzk;
    private zzadb zzl;
    private int zzm;
    private long zzn;

    public zzadd() {
        this(0);
    }

    private final long zze(zzfb zzfbVar, boolean z) {
        boolean zZzc;
        this.zzi.getClass();
        int iZzc = zzfbVar.zzc();
        while (iZzc <= zzfbVar.zzd() - 16) {
            zzfbVar.zzG(iZzc);
            if (zzabk.zzc(zzfbVar, this.zzi, this.zzk, this.zzd)) {
                zzfbVar.zzG(iZzc);
                return this.zzd.zza;
            }
            iZzc++;
        }
        if (!z) {
            zzfbVar.zzG(iZzc);
            return -1L;
        }
        while (iZzc <= zzfbVar.zzd() - this.zzj) {
            zzfbVar.zzG(iZzc);
            try {
                zZzc = zzabk.zzc(zzfbVar, this.zzi, this.zzk, this.zzd);
            } catch (IndexOutOfBoundsException unused) {
                zZzc = false;
            }
            if (zzfbVar.zzc() <= zzfbVar.zzd() && zZzc) {
                zzfbVar.zzG(iZzc);
                return this.zzd.zza;
            }
            iZzc++;
        }
        zzfbVar.zzG(zzfbVar.zzd());
        return -1L;
    }

    private final void zzf() {
        long j = this.zzn * 1000000;
        zzabo zzaboVar = this.zzi;
        int i = zzfk.zza;
        this.zzf.zzs(j / ((long) zzaboVar.zze), 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zze = zzabeVar;
        this.zzf = zzabeVar.zzv(0, 1);
        zzabeVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws Throwable {
        zzabl.zza(zzabcVar, false);
        zzfb zzfbVar = new zzfb(4);
        ((zzaar) zzabcVar).zzm(zzfbVar.zzI(), 0, 4, false);
        return zzfbVar.zzt() == 1716281667;
    }

    public zzadd(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzfb(new byte[32768], 0);
        this.zzd = new zzabj();
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzadb zzadbVar = this.zzl;
            if (zzadbVar != null) {
                zzadbVar.zzd(j2);
            }
        }
        this.zzn = j2 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzD(0);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws Throwable {
        boolean zZzn;
        zzaca zzabzVar;
        boolean z;
        int i = this.zzg;
        if (i == 0) {
            zzabcVar.zzj();
            long jZze = zzabcVar.zze();
            zzbz zzbzVarZza = zzabl.zza(zzabcVar, true);
            ((zzaar) zzabcVar).zzo((int) (zzabcVar.zze() - jZze), false);
            this.zzh = zzbzVarZza;
            this.zzg = 1;
            return 0;
        }
        if (i == 1) {
            ((zzaar) zzabcVar).zzm(this.zzb, 0, 42, false);
            zzabcVar.zzj();
            this.zzg = 2;
            return 0;
        }
        if (i == 2) {
            zzfb zzfbVar = new zzfb(4);
            ((zzaar) zzabcVar).zzn(zzfbVar.zzI(), 0, 4, false);
            if (zzfbVar.zzt() != 1716281667) {
                throw zzcd.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzg = 3;
            return 0;
        }
        if (i == 3) {
            zzabo zzaboVarZze = this.zzi;
            do {
                zzabcVar.zzj();
                zzfa zzfaVar = new zzfa(new byte[4], 4);
                zzaar zzaarVar = (zzaar) zzabcVar;
                zzaarVar.zzm(zzfaVar.zza, 0, 4, false);
                zZzn = zzfaVar.zzn();
                int iZzd = zzfaVar.zzd(7);
                int iZzd2 = zzfaVar.zzd(24) + 4;
                if (iZzd == 0) {
                    byte[] bArr = new byte[38];
                    zzaarVar.zzn(bArr, 0, 38, false);
                    zzaboVarZze = new zzabo(bArr, 4);
                } else {
                    if (zzaboVarZze == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iZzd == 3) {
                        zzfb zzfbVar2 = new zzfb(iZzd2);
                        zzaarVar.zzn(zzfbVar2.zzI(), 0, iZzd2, false);
                        zzaboVarZze = zzaboVarZze.zzf(zzabl.zzb(zzfbVar2));
                    } else if (iZzd == 4) {
                        zzfb zzfbVar3 = new zzfb(iZzd2);
                        zzaarVar.zzn(zzfbVar3.zzI(), 0, iZzd2, false);
                        zzfbVar3.zzH(4);
                        zzaboVarZze = zzaboVarZze.zzg(Arrays.asList(zzack.zzc(zzfbVar3, false, false).zzb));
                    } else if (iZzd == 6) {
                        zzfb zzfbVar4 = new zzfb(iZzd2);
                        zzaarVar.zzn(zzfbVar4.zzI(), 0, iZzd2, false);
                        zzfbVar4.zzH(4);
                        zzaboVarZze = zzaboVarZze.zze(zzfud.zzm(zzadx.zzb(zzfbVar4)));
                    } else {
                        zzaarVar.zzo(iZzd2, false);
                    }
                }
                int i2 = zzfk.zza;
                this.zzi = zzaboVarZze;
            } while (!zZzn);
            zzaboVarZze.getClass();
            this.zzj = Math.max(zzaboVarZze.zzc, 6);
            this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        }
        if (i == 4) {
            zzabcVar.zzj();
            zzfb zzfbVar5 = new zzfb(2);
            ((zzaar) zzabcVar).zzm(zzfbVar5.zzI(), 0, 2, false);
            int iZzp = zzfbVar5.zzp();
            if ((iZzp >> 2) != 16382) {
                zzabcVar.zzj();
                throw zzcd.zza("First frame does not start with sync code.", null);
            }
            zzabcVar.zzj();
            this.zzk = iZzp;
            zzabe zzabeVar = this.zze;
            int i3 = zzfk.zza;
            long jZzf = zzabcVar.zzf();
            long jZzd = zzabcVar.zzd();
            zzabo zzaboVar = this.zzi;
            zzaboVar.getClass();
            if (zzaboVar.zzk != null) {
                zzabzVar = new zzabm(zzaboVar, jZzf);
            } else if (jZzd == -1 || zzaboVar.zzj <= 0) {
                zzabzVar = new zzabz(zzaboVar.zza(), 0L);
            } else {
                zzadb zzadbVar = new zzadb(zzaboVar, this.zzk, jZzf, jZzd);
                this.zzl = zzadbVar;
                zzabzVar = zzadbVar.zzb();
            }
            zzabeVar.zzN(zzabzVar);
            this.zzg = 5;
            return 0;
        }
        this.zzf.getClass();
        zzabo zzaboVar2 = this.zzi;
        zzaboVar2.getClass();
        zzadb zzadbVar2 = this.zzl;
        if (zzadbVar2 != null && zzadbVar2.zze()) {
            return zzadbVar2.zza(zzabcVar, zzabxVar);
        }
        if (this.zzn == -1) {
            this.zzn = zzabk.zzb(zzabcVar, zzaboVar2);
            return 0;
        }
        zzfb zzfbVar6 = this.zzc;
        int iZzd3 = zzfbVar6.zzd();
        if (iZzd3 < 32768) {
            int iZza = zzabcVar.zza(zzfbVar6.zzI(), iZzd3, 32768 - iZzd3);
            z = iZza == -1;
            if (!z) {
                this.zzc.zzF(iZzd3 + iZza);
            } else if (this.zzc.zza() == 0) {
                zzf();
                return -1;
            }
        } else {
            z = false;
        }
        zzfb zzfbVar7 = this.zzc;
        int iZzc = zzfbVar7.zzc();
        int i4 = this.zzm;
        int i5 = this.zzj;
        if (i4 < i5) {
            zzfbVar7.zzH(Math.min(i5 - i4, zzfbVar7.zza()));
        }
        long jZze2 = zze(this.zzc, z);
        zzfb zzfbVar8 = this.zzc;
        int iZzc2 = zzfbVar8.zzc() - iZzc;
        zzfbVar8.zzG(iZzc);
        zzacc.zzb(this.zzf, this.zzc, iZzc2);
        this.zzm += iZzc2;
        if (jZze2 != -1) {
            zzf();
            this.zzm = 0;
            this.zzn = jZze2;
        }
        zzfb zzfbVar9 = this.zzc;
        if (zzfbVar9.zza() >= 16) {
            return 0;
        }
        int iZza2 = zzfbVar9.zza();
        System.arraycopy(zzfbVar9.zzI(), zzfbVar9.zzc(), zzfbVar9.zzI(), 0, iZza2);
        this.zzc.zzG(0);
        this.zzc.zzF(iZza2);
        return 0;
    }
}
