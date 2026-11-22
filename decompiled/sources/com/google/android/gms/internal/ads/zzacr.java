package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacr implements zzabb {
    private int zzc;
    private zzacs zze;
    private long zzh;
    private zzacu zzi;
    private int zzm;
    private boolean zzn;
    private final zzfb zza = new zzfb(12);
    private final zzacq zzb = new zzacq(null);
    private zzabe zzd = new zzaaz();
    private zzacu[] zzg = new zzacu[0];
    private long zzk = -1;
    private long zzl = -1;
    private int zzj = -1;
    private long zzf = -9223372036854775807L;

    private final zzacu zzf(int i) {
        for (zzacu zzacuVar : this.zzg) {
            if (zzacuVar.zzg(i)) {
                return zzacuVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzc = 0;
        this.zzd = zzabeVar;
        this.zzh = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        int i;
        this.zzh = -1L;
        this.zzi = null;
        for (zzacu zzacuVar : this.zzg) {
            zzacuVar.zzf(j);
        }
        if (j != 0) {
            i = 6;
        } else {
            if (this.zzg.length == 0) {
                this.zzc = 0;
                return;
            }
            i = 3;
        }
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        ((zzaar) zzabcVar).zzm(this.zza.zzI(), 0, 12, false);
        this.zza.zzG(0);
        if (this.zza.zzh() != 1179011410) {
            return false;
        }
        this.zza.zzH(4);
        return this.zza.zzh() == 541677121;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x030f  */
    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        boolean z;
        int i;
        int i2;
        int i3;
        long j;
        long j2 = this.zzh;
        int i4 = 0;
        if (j2 != -1) {
            long jZzf = zzabcVar.zzf();
            if (j2 < jZzf || j2 > 262144 + jZzf) {
                zzabxVar.zza = j2;
                z = true;
            } else {
                ((zzaar) zzabcVar).zzo((int) (j2 - jZzf), false);
                z = false;
            }
        } else {
            z = false;
        }
        this.zzh = -1L;
        if (z) {
            return 1;
        }
        int i5 = this.zzc;
        zzacu zzacuVar = null;
        if (i5 == 0) {
            if (!zzd(zzabcVar)) {
                throw zzcd.zza("AVI Header List not found", null);
            }
            ((zzaar) zzabcVar).zzo(12, false);
            this.zzc = 1;
            return 0;
        }
        if (i5 == 1) {
            ((zzaar) zzabcVar).zzn(this.zza.zzI(), 0, 12, false);
            this.zza.zzG(0);
            zzacq zzacqVar = this.zzb;
            zzfb zzfbVar = this.zza;
            zzacqVar.zza(zzfbVar);
            int i6 = zzacqVar.zza;
            if (i6 != 1414744396) {
                throw zzcd.zza("LIST expected, found: " + i6, null);
            }
            zzacqVar.zzc = zzfbVar.zzh();
            zzacq zzacqVar2 = this.zzb;
            int i7 = zzacqVar2.zzc;
            if (i7 == 1819436136) {
                this.zzj = zzacqVar2.zzb;
                this.zzc = 2;
                return 0;
            }
            throw zzcd.zza("hdrl expected, found: " + i7, null);
        }
        if (i5 == 2) {
            int i8 = this.zzj - 4;
            zzfb zzfbVar2 = new zzfb(i8);
            ((zzaar) zzabcVar).zzn(zzfbVar2.zzI(), 0, i8, false);
            zzacv zzacvVarZzc = zzacv.zzc(1819436136, zzfbVar2);
            if (zzacvVarZzc.zza() != 1819436136) {
                throw zzcd.zza("Unexpected header list type " + zzacvVarZzc.zza(), null);
            }
            zzacs zzacsVar = (zzacs) zzacvVarZzc.zzb(zzacs.class);
            if (zzacsVar == null) {
                throw zzcd.zza("AviHeader not found", null);
            }
            this.zze = zzacsVar;
            this.zzf = ((long) zzacsVar.zzc) * ((long) zzacsVar.zza);
            ArrayList arrayList = new ArrayList();
            zzfud zzfudVar = zzacvVarZzc.zza;
            int size = zzfudVar.size();
            int i9 = 0;
            int i10 = 0;
            while (i9 < size) {
                zzacn zzacnVar = (zzacn) zzfudVar.get(i9);
                if (zzacnVar.zza() == 1819440243) {
                    zzacv zzacvVar = (zzacv) zzacnVar;
                    int i11 = i10 + 1;
                    zzact zzactVar = (zzact) zzacvVar.zzb(zzact.class);
                    zzacw zzacwVar = (zzacw) zzacvVar.zzb(zzacw.class);
                    if (zzactVar == null) {
                        zzes.zzf("AviExtractor", "Missing Stream Header");
                    } else {
                        if (zzacwVar == null) {
                            zzes.zzf("AviExtractor", "Missing Stream Format");
                        } else {
                            i2 = i11;
                            i = i9;
                            long jZzq = zzfk.zzq(zzactVar.zzd, ((long) zzactVar.zzb) * 1000000, zzactVar.zzc);
                            zzam zzamVar = zzacwVar.zza;
                            zzak zzakVarZzb = zzamVar.zzb();
                            zzakVarZzb.zzG(i10);
                            int i12 = zzactVar.zze;
                            if (i12 != 0) {
                                zzakVarZzb.zzL(i12);
                            }
                            zzacx zzacxVar = (zzacx) zzacvVar.zzb(zzacx.class);
                            if (zzacxVar != null) {
                                zzakVarZzb.zzJ(zzacxVar.zza);
                            }
                            int iZzb = zzcc.zzb(zzamVar.zzm);
                            if (iZzb == 1) {
                                i3 = iZzb;
                            } else if (iZzb == 2) {
                                i3 = 2;
                            } else {
                                zzacuVar = null;
                            }
                            zzace zzaceVarZzv = this.zzd.zzv(i10, i3);
                            zzaceVarZzv.zzk(zzakVarZzb.zzY());
                            zzacuVar = new zzacu(i10, i3, jZzq, zzactVar.zzd, zzaceVarZzv);
                            this.zzf = jZzq;
                        }
                        if (zzacuVar != null) {
                            arrayList.add(zzacuVar);
                        }
                        i10 = i2;
                    }
                    i = i9;
                    i2 = i11;
                    if (zzacuVar != null) {
                        arrayList.add(zzacuVar);
                    }
                    i10 = i2;
                } else {
                    i = i9;
                }
                i9 = i + 1;
                i4 = 0;
                zzacuVar = null;
            }
            this.zzg = (zzacu[]) arrayList.toArray(new zzacu[i4]);
            this.zzd.zzC();
            this.zzc = 3;
            return i4;
        }
        if (i5 == 3) {
            long j3 = this.zzk;
            if (j3 != -1 && zzabcVar.zzf() != j3) {
                this.zzh = j3;
                return 0;
            }
            zzaar zzaarVar = (zzaar) zzabcVar;
            zzaarVar.zzm(this.zza.zzI(), 0, 12, false);
            zzabcVar.zzj();
            this.zza.zzG(0);
            this.zzb.zza(this.zza);
            int iZzh = this.zza.zzh();
            zzacq zzacqVar3 = this.zzb;
            int i13 = zzacqVar3.zza;
            if (i13 == 1179011410) {
                zzaarVar.zzo(12, false);
                return 0;
            }
            if (i13 != 1414744396 || iZzh != 1769369453) {
                this.zzh = zzabcVar.zzf() + ((long) zzacqVar3.zzb) + 8;
                return 0;
            }
            long jZzf2 = zzabcVar.zzf();
            this.zzk = jZzf2;
            long j4 = jZzf2 + ((long) zzacqVar3.zzb) + 8;
            this.zzl = j4;
            if (!this.zzn) {
                zzacs zzacsVar2 = this.zze;
                zzacsVar2.getClass();
                if ((zzacsVar2.zzb & 16) == 16) {
                    this.zzc = 4;
                    this.zzh = j4;
                    return 0;
                }
                this.zzd.zzN(new zzabz(this.zzf, 0L));
                this.zzn = true;
            }
            this.zzh = zzabcVar.zzf() + 12;
            this.zzc = 6;
            return 0;
        }
        if (i5 == 4) {
            ((zzaar) zzabcVar).zzn(this.zza.zzI(), 0, 8, false);
            this.zza.zzG(0);
            int iZzh2 = this.zza.zzh();
            int iZzh3 = this.zza.zzh();
            if (iZzh2 == 829973609) {
                this.zzc = 5;
                this.zzm = iZzh3;
            } else {
                this.zzh = zzabcVar.zzf() + ((long) iZzh3);
            }
            return 0;
        }
        if (i5 == 5) {
            zzfb zzfbVar3 = new zzfb(this.zzm);
            ((zzaar) zzabcVar).zzn(zzfbVar3.zzI(), 0, this.zzm, false);
            if (zzfbVar3.zza() < 16) {
                j = 0;
            } else {
                int iZzc = zzfbVar3.zzc();
                zzfbVar3.zzH(8);
                long jZzh = zzfbVar3.zzh();
                long j5 = this.zzk;
                j = jZzh > j5 ? 0L : j5 + 8;
                zzfbVar3.zzG(iZzc);
            }
            while (zzfbVar3.zza() >= 16) {
                int iZzh4 = zzfbVar3.zzh();
                int iZzh5 = zzfbVar3.zzh();
                long jZzh2 = ((long) zzfbVar3.zzh()) + j;
                zzfbVar3.zzh();
                zzacu zzacuVarZzf = zzf(iZzh4);
                if (zzacuVarZzf != null) {
                    if ((iZzh5 & 16) == 16) {
                        zzacuVarZzf.zzb(jZzh2);
                    }
                    zzacuVarZzf.zzd();
                }
            }
            for (zzacu zzacuVar2 : this.zzg) {
                zzacuVar2.zzc();
            }
            this.zzn = true;
            this.zzd.zzN(new zzaco(this, this.zzf));
            this.zzc = 6;
            this.zzh = this.zzk;
            return 0;
        }
        if (zzabcVar.zzf() >= this.zzl) {
            return -1;
        }
        zzacu zzacuVar3 = this.zzi;
        if (zzacuVar3 != null) {
            if (!zzacuVar3.zzh(zzabcVar)) {
                return 0;
            }
            this.zzi = null;
            return 0;
        }
        if ((zzabcVar.zzf() & 1) == 1) {
            ((zzaar) zzabcVar).zzo(1, false);
        }
        zzaar zzaarVar2 = (zzaar) zzabcVar;
        zzaarVar2.zzm(this.zza.zzI(), 0, 12, false);
        this.zza.zzG(0);
        int iZzh6 = this.zza.zzh();
        if (iZzh6 == 1414744396) {
            this.zza.zzG(8);
            zzaarVar2.zzo(this.zza.zzh() != 1769369453 ? 8 : 12, false);
            zzabcVar.zzj();
            return 0;
        }
        int iZzh7 = this.zza.zzh();
        if (iZzh6 == 1263424842) {
            this.zzh = zzabcVar.zzf() + ((long) iZzh7) + 8;
            return 0;
        }
        zzaarVar2.zzo(8, false);
        zzabcVar.zzj();
        zzacu zzacuVarZzf2 = zzf(iZzh6);
        if (zzacuVarZzf2 == null) {
            this.zzh = zzabcVar.zzf() + ((long) iZzh7);
            return 0;
        }
        zzacuVarZzf2.zze(iZzh7);
        this.zzi = zzacuVarZzf2;
        return 0;
    }
}
