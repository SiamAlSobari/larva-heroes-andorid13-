package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzadl implements zzabb {
    private zzabe zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzaff zzg;
    private zzabc zzh;
    private zzado zzi;
    private zzahc zzj;
    private final zzfb zza = new zzfb(6);
    private long zzf = -1;

    private final int zze(zzabc zzabcVar) throws IOException {
        this.zza.zzD(2);
        ((zzaar) zzabcVar).zzm(this.zza.zzI(), 0, 2, false);
        return this.zza.zzp();
    }

    private final void zzf() {
        zzg(new zzby[0]);
        zzabe zzabeVar = this.zzb;
        zzabeVar.getClass();
        zzabeVar.zzC();
        this.zzb.zzN(new zzabz(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        int i;
        String strZzw;
        zzadn zzadnVarZza;
        zzaff zzaffVar;
        long j;
        int i2 = this.zzc;
        if (i2 == 0) {
            this.zza.zzD(2);
            ((zzaar) zzabcVar).zzn(this.zza.zzI(), 0, 2, false);
            int iZzp = this.zza.zzp();
            this.zzd = iZzp;
            if (iZzp == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzf();
                return 0;
            }
            if ((iZzp >= 65488 && iZzp <= 65497) || iZzp == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i2 == 1) {
            this.zza.zzD(2);
            ((zzaar) zzabcVar).zzn(this.zza.zzI(), 0, 2, false);
            this.zze = this.zza.zzp() - 2;
            this.zzc = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzabcVar != this.zzh) {
                    this.zzh = zzabcVar;
                    this.zzi = new zzado(zzabcVar, this.zzf);
                }
                zzahc zzahcVar = this.zzj;
                zzahcVar.getClass();
                int iZza = zzahcVar.zza(this.zzi, zzabxVar);
                if (iZza == 1) {
                    zzabxVar.zza += this.zzf;
                }
                return iZza;
            }
            long jZzf = zzabcVar.zzf();
            long j2 = this.zzf;
            if (jZzf != j2) {
                zzabxVar.zza = j2;
                return 1;
            }
            if (zzabcVar.zzm(this.zza.zzI(), 0, 1, true)) {
                zzabcVar.zzj();
                if (this.zzj == null) {
                    this.zzj = new zzahc(0);
                }
                zzado zzadoVar = new zzado(zzabcVar, this.zzf);
                this.zzi = zzadoVar;
                if (this.zzj.zzd(zzadoVar)) {
                    zzahc zzahcVar2 = this.zzj;
                    long j3 = this.zzf;
                    zzabe zzabeVar = this.zzb;
                    zzabeVar.getClass();
                    zzahcVar2.zzb(new zzadq(j3, zzabeVar));
                    zzaff zzaffVar2 = this.zzg;
                    zzaffVar2.getClass();
                    zzg(zzaffVar2);
                    this.zzc = 5;
                } else {
                    zzf();
                }
            } else {
                zzf();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzfb zzfbVar = new zzfb(this.zze);
            ((zzaar) zzabcVar).zzn(zzfbVar.zzI(), 0, this.zze, false);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzfbVar.zzw((char) 0)) && (strZzw = zzfbVar.zzw((char) 0)) != null) {
                long jZzd = zzabcVar.zzd();
                if (jZzd == -1 || (zzadnVarZza = zzadr.zza(strZzw)) == null || zzadnVarZza.zzb.size() < 2) {
                    zzaffVar = null;
                } else {
                    int size = zzadnVarZza.zzb.size() - 1;
                    long j4 = -1;
                    long j5 = -1;
                    long j6 = -1;
                    long j7 = -1;
                    boolean z = false;
                    while (size >= 0) {
                        zzadm zzadmVar = (zzadm) zzadnVarZza.zzb.get(size);
                        boolean zEquals = "video/mp4".equals(zzadmVar.zza) | z;
                        if (size == 0) {
                            jZzd -= zzadmVar.zzd;
                            j = 0;
                        } else {
                            j = jZzd - zzadmVar.zzc;
                        }
                        long j8 = jZzd;
                        jZzd = j;
                        if (zEquals && jZzd != j8) {
                            j7 = j8 - jZzd;
                            j6 = jZzd;
                            zEquals = false;
                        }
                        if (size == 0) {
                            j5 = j8;
                        }
                        if (size == 0) {
                            j4 = jZzd;
                        }
                        size--;
                        z = zEquals;
                    }
                    if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
                        zzaffVar = null;
                    } else {
                        zzaffVar = new zzaff(j4, j5, zzadnVarZza.zza, j6, j7);
                    }
                }
                this.zzg = zzaffVar;
                if (zzaffVar != null) {
                    this.zzf = zzaffVar.zzd;
                }
            }
            i = 0;
        } else {
            i = 0;
            ((zzaar) zzabcVar).zzo(this.zze, false);
        }
        this.zzc = i;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzb = zzabeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        if (zze(zzabcVar) != 65496) {
            return false;
        }
        int iZze = zze(zzabcVar);
        this.zzd = iZze;
        if (iZze == 65504) {
            this.zza.zzD(2);
            zzaar zzaarVar = (zzaar) zzabcVar;
            zzaarVar.zzm(this.zza.zzI(), 0, 2, false);
            zzaarVar.zzl(this.zza.zzp() - 2, false);
            iZze = zze(zzabcVar);
            this.zzd = iZze;
        }
        if (iZze == 65505) {
            zzaar zzaarVar2 = (zzaar) zzabcVar;
            zzaarVar2.zzl(2, false);
            this.zza.zzD(6);
            zzaarVar2.zzm(this.zza.zzI(), 0, 6, false);
            if (this.zza.zzt() == 1165519206 && this.zza.zzp() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzahc zzahcVar = this.zzj;
            zzahcVar.getClass();
            zzahcVar.zzc(j, j2);
        }
    }

    private final void zzg(zzby... zzbyVarArr) {
        zzabe zzabeVar = this.zzb;
        zzabeVar.getClass();
        zzace zzaceVarZzv = zzabeVar.zzv(1024, 4);
        zzak zzakVar = new zzak();
        zzakVar.zzz("image/jpeg");
        zzakVar.zzM(new zzbz(-9223372036854775807L, zzbyVarArr));
        zzaceVarZzv.zzk(zzakVar.zzY());
    }
}
