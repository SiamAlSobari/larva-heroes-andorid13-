package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzagc implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzaga
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzagc.zza;
            return new zzabb[]{new zzagc(0)};
        }
    };
    private static final zzaep zzb = new zzaep() { // from class: com.google.android.gms.internal.ads.zzagb
    };
    private final zzfb zzc;
    private final zzabu zzd;
    private final zzabq zze;
    private final zzabs zzf;
    private final zzace zzg;
    private zzabe zzh;
    private zzace zzi;
    private zzace zzj;
    private int zzk;
    private zzbz zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzage zzq;
    private boolean zzr;

    public zzagc() {
        this(0);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0245  */
    /* JADX WARN: Code duplicated, block: B:112:0x024e  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Multi-variable type inference failed */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private final int zzf(zzabc zzabcVar) throws Throwable {
        int iZze;
        int i;
        int i2;
        int i3;
        zzage zzageVarZzh;
        zzafz zzafzVarZza;
        long jZzp;
        if (this.zzk == 0) {
            try {
                zzk(zzabcVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzq == null) {
            zzfb zzfbVar = new zzfb(this.zzd.zzc);
            zzaar zzaarVar = (zzaar) zzabcVar;
            zzaarVar.zzm(zzfbVar.zzI(), 0, this.zzd.zzc, false);
            zzabu zzabuVar = this.zzd;
            if ((zzabuVar.zza & 1) != 0) {
                if (zzabuVar.zze != 1) {
                    i2 = 36;
                } else {
                    i2 = 21;
                }
            } else if (zzabuVar.zze != 1) {
                i2 = 21;
            } else {
                i2 = 13;
            }
            if (zzfbVar.zzd() >= i2 + 4) {
                zzfbVar.zzG(i2);
                int iZzf = zzfbVar.zzf();
                if (iZzf == 1483304551) {
                    i3 = iZzf;
                } else if (iZzf == 1231971951) {
                    i3 = 1231971951;
                } else if (zzfbVar.zzd() >= 40) {
                    zzfbVar.zzG(36);
                    if (zzfbVar.zzf() == 1447187017) {
                        i3 = 1447187017;
                    } else {
                        i3 = 0;
                    }
                } else {
                    i3 = 0;
                }
            } else if (zzfbVar.zzd() >= 40) {
                zzfbVar.zzG(36);
                if (zzfbVar.zzf() == 1447187017) {
                    i3 = 1447187017;
                } else {
                    i3 = 0;
                }
            } else {
                i3 = 0;
            }
            if (i3 == 1483304551 || i3 == 1231971951) {
                int i4 = i3;
                zzagg zzaggVarZza = zzagg.zza(zzabcVar.zzd(), zzabcVar.zzf(), this.zzd, zzfbVar);
                if (zzaggVarZza != null && !this.zze.zza()) {
                    zzabcVar.zzj();
                    zzaarVar.zzl(i2 + 141, false);
                    zzaarVar.zzm(this.zzc.zzI(), 0, 3, false);
                    this.zzc.zzG(0);
                    zzabq zzabqVar = this.zze;
                    int iZzn = this.zzc.zzn();
                    int i5 = iZzn >> 12;
                    int i6 = iZzn & 4095;
                    if (i5 > 0 || i6 > 0) {
                        zzabqVar.zza = i5;
                        zzabqVar.zzb = i6;
                    }
                }
                zzaarVar.zzo(this.zzd.zzc, false);
                zzageVarZzh = (zzaggVarZza == null || zzaggVarZza.zzh() || i4 != 1231971951) ? zzaggVarZza : zzh(zzabcVar, false);
            } else if (i3 == 1447187017) {
                zzageVarZzh = zzagf.zza(zzabcVar.zzd(), zzabcVar.zzf(), this.zzd, zzfbVar);
                zzaarVar.zzo(this.zzd.zzc, false);
            } else {
                zzabcVar.zzj();
                zzageVarZzh = null;
            }
            zzbz zzbzVar = this.zzl;
            long jZzf = zzabcVar.zzf();
            if (zzbzVar == null) {
                zzafzVarZza = null;
                break;
            }
            int iZza = zzbzVar.zza();
            int i7 = 0;
            while (true) {
                if (i7 >= iZza) {
                    zzafzVarZza = null;
                    break;
                }
                zzby zzbyVarZzb = zzbzVar.zzb(i7);
                if (zzbyVarZzb instanceof zzaew) {
                    zzaew zzaewVar = (zzaew) zzbyVarZzb;
                    int iZza2 = zzbzVar.zza();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= iZza2) {
                            jZzp = -9223372036854775807L;
                            break;
                        }
                        zzby zzbyVarZzb2 = zzbzVar.zzb(i8);
                        if (zzbyVarZzb2 instanceof zzafa) {
                            zzafa zzafaVar = (zzafa) zzbyVarZzb2;
                            if (zzafaVar.zzf.equals("TLEN")) {
                                jZzp = zzfk.zzp(Long.parseLong((String) zzafaVar.zzc.get(0)));
                                break;
                            }
                        }
                        i8++;
                    }
                    zzafzVarZza = zzafz.zza(jZzf, zzaewVar, jZzp);
                    break;
                }
                i7++;
            }
            if (this.zzr) {
                zzageVarZzh = new zzagd();
            } else {
                if (zzafzVarZza != null) {
                    zzageVarZzh = zzafzVarZza;
                } else if (zzageVarZzh == null) {
                    zzageVarZzh = null;
                }
                if (zzageVarZzh != null) {
                    zzageVarZzh.zzh();
                } else {
                    zzageVarZzh = zzh(zzabcVar, false);
                }
            }
            this.zzq = zzageVarZzh;
            this.zzh.zzN(zzageVarZzh);
            zzace zzaceVar = this.zzj;
            zzak zzakVar = new zzak();
            zzakVar.zzS(this.zzd.zzb);
            zzakVar.zzL(4096);
            zzakVar.zzw(this.zzd.zze);
            zzakVar.zzT(this.zzd.zzd);
            zzakVar.zzC(this.zze.zza);
            zzakVar.zzD(this.zze.zzb);
            zzakVar.zzM(this.zzl);
            zzaceVar.zzk(zzakVar.zzY());
            this.zzo = zzabcVar.zzf();
        } else {
            long j = this.zzo;
            if (j != 0) {
                long jZzf2 = zzabcVar.zzf();
                if (jZzf2 < j) {
                    ((zzaar) zzabcVar).zzo((int) (j - jZzf2), false);
                }
            }
        }
        int i9 = this.zzp;
        if (i9 == 0) {
            zzabcVar.zzj();
            if (zzj(zzabcVar)) {
                return -1;
            }
            this.zzc.zzG(0);
            int iZzf2 = this.zzc.zzf();
            if (!zzi(iZzf2, this.zzk) || zzabv.zzb(iZzf2) == -1) {
                ((zzaar) zzabcVar).zzo(1, false);
                this.zzk = 0;
            } else {
                this.zzd.zza(iZzf2);
                if (this.zzm == -9223372036854775807L) {
                    this.zzm = this.zzq.zzc(zzabcVar.zzf());
                }
                zzabu zzabuVar2 = this.zzd;
                int i10 = zzabuVar2.zzc;
                this.zzp = i10;
                zzage zzageVar = this.zzq;
                if (zzageVar instanceof zzafy) {
                    zzg(this.zzn + ((long) zzabuVar2.zzg));
                    throw null;
                }
                i9 = i10;
                iZze = this.zzj.zze(zzabcVar, i9, true);
                if (iZze == -1) {
                    return -1;
                }
                i = this.zzp - iZze;
                this.zzp = i;
                if (i <= 0) {
                    this.zzj.zzs(zzg(this.zzn), 1, this.zzd.zzc, 0, null);
                    this.zzn += (long) this.zzd.zzg;
                    this.zzp = 0;
                    return 0;
                }
            }
        } else {
            iZze = this.zzj.zze(zzabcVar, i9, true);
            if (iZze == -1) {
                return -1;
            }
            i = this.zzp - iZze;
            this.zzp = i;
            if (i <= 0) {
                this.zzj.zzs(zzg(this.zzn), 1, this.zzd.zzc, 0, null);
                this.zzn += (long) this.zzd.zzg;
                this.zzp = 0;
                return 0;
            }
        }
        return 0;
    }

    private final long zzg(long j) {
        return this.zzm + ((j * 1000000) / ((long) this.zzd.zzd));
    }

    private final zzage zzh(zzabc zzabcVar, boolean z) throws IOException {
        ((zzaar) zzabcVar).zzm(this.zzc.zzI(), 0, 4, false);
        this.zzc.zzG(0);
        this.zzd.zza(this.zzc.zzf());
        return new zzafx(zzabcVar.zzd(), zzabcVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzj(zzabc zzabcVar) throws IOException {
        zzage zzageVar = this.zzq;
        if (zzageVar != null) {
            long jZzb = zzageVar.zzb();
            if (jZzb != -1 && zzabcVar.zze() > jZzb - 4) {
                return true;
            }
        }
        try {
            return !zzabcVar.zzm(this.zzc.zzI(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzabc zzabcVar, boolean z) throws Throwable {
        int i;
        int iZze;
        int iZzb;
        zzabcVar.zzj();
        if (zzabcVar.zzf() == 0) {
            zzbz zzbzVarZza = this.zzf.zza(zzabcVar, null);
            this.zzl = zzbzVarZza;
            if (zzbzVarZza != null) {
                this.zze.zzb(zzbzVarZza);
            }
            iZze = (int) zzabcVar.zze();
            if (!z) {
                ((zzaar) zzabcVar).zzo(iZze, false);
            }
            i = 0;
        } else {
            i = 0;
            iZze = 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (zzj(zzabcVar)) {
                if (i2 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.zzc.zzG(0);
            int iZzf = this.zzc.zzf();
            if ((i == 0 || zzi(iZzf, i)) && (iZzb = zzabv.zzb(iZzf)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.zzd.zza(iZzf);
                    i = iZzf;
                }
                ((zzaar) zzabcVar).zzl(iZzb - 4, false);
            } else {
                int i4 = i3 + 1;
                if (i3 == (true != z ? 131072 : 32768)) {
                    if (z) {
                        return false;
                    }
                    throw zzcd.zza("Searched too many bytes.", null);
                }
                if (z) {
                    zzabcVar.zzj();
                    ((zzaar) zzabcVar).zzl(iZze + i4, false);
                } else {
                    ((zzaar) zzabcVar).zzo(1, false);
                }
                i3 = i4;
                i = 0;
                i2 = 0;
            }
        }
        if (z) {
            ((zzaar) zzabcVar).zzo(iZze + i3, false);
        } else {
            zzabcVar.zzj();
        }
        this.zzk = i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws Throwable {
        zzdy.zzb(this.zzi);
        int i = zzfk.zza;
        int iZzf = zzf(zzabcVar);
        if (iZzf == -1 && (this.zzq instanceof zzafy)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                throw null;
            }
        }
        return iZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzh = zzabeVar;
        zzace zzaceVarZzv = zzabeVar.zzv(0, 1);
        this.zzi = zzaceVarZzv;
        this.zzj = zzaceVarZzv;
        this.zzh.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzage zzageVar = this.zzq;
        if (zzageVar instanceof zzafy) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        return zzk(zzabcVar, true);
    }

    public final void zze() {
        this.zzr = true;
    }

    public zzagc(int i) {
        this.zzc = new zzfb(10);
        this.zzd = new zzabu();
        this.zze = new zzabq();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzabs();
        zzaba zzabaVar = new zzaba();
        this.zzg = zzabaVar;
        this.zzj = zzabaVar;
    }
}
