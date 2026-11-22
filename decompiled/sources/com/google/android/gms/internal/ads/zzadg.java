package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzadg implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzadf
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzadg.zza;
            return new zzabb[]{new zzadg()};
        }
    };
    private zzabe zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzade zzp;
    private zzadk zzq;
    private final zzfb zzb = new zzfb(4);
    private final zzfb zzc = new zzfb(9);
    private final zzfb zzd = new zzfb(11);
    private final zzfb zze = new zzfb();
    private final zzadh zzf = new zzadh();
    private int zzh = 1;

    private final zzfb zze(zzabc zzabcVar) throws IOException {
        if (this.zzm > this.zze.zzb()) {
            zzfb zzfbVar = this.zze;
            int iZzb = zzfbVar.zzb();
            zzfbVar.zzE(new byte[Math.max(iZzb + iZzb, this.zzm)], 0);
        } else {
            this.zze.zzG(0);
        }
        this.zze.zzF(this.zzm);
        ((zzaar) zzabcVar).zzn(this.zze.zzI(), 0, this.zzm, false);
        return this.zze;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzf() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzN(new zzabz(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        long j;
        boolean zZzf;
        boolean z;
        long j2;
        zzdy.zzb(this.zzg);
        while (true) {
            int i = this.zzh;
            int i2 = 8;
            if (i != 1) {
                if (i == 2) {
                    ((zzaar) zzabcVar).zzo(this.zzk, false);
                    this.zzk = 0;
                    this.zzh = 3;
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (this.zzi) {
                        j = this.zzj + this.zzn;
                    } else {
                        j = this.zzf.zzc() == -9223372036854775807L ? 0L : this.zzn;
                    }
                    int i3 = this.zzl;
                    if (i3 == 8) {
                        if (this.zzp != null) {
                            zzf();
                            zZzf = this.zzp.zzf(zze(zzabcVar), j);
                        }
                        z = true;
                        if (!this.zzi && zZzf) {
                            this.zzi = true;
                            if (this.zzf.zzc() == -9223372036854775807L) {
                                j2 = -this.zzn;
                            } else {
                                j2 = 0;
                            }
                            this.zzj = j2;
                        }
                        this.zzk = 4;
                        this.zzh = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        i2 = i3;
                    }
                    if (i2 == 9) {
                        if (this.zzq != null) {
                            zzf();
                            zZzf = this.zzq.zzf(zze(zzabcVar), j);
                            z = true;
                        } else {
                            ((zzaar) zzabcVar).zzo(this.zzm, false);
                            zZzf = false;
                            z = false;
                        }
                    } else if (i2 != 18 || this.zzo) {
                        ((zzaar) zzabcVar).zzo(this.zzm, false);
                        zZzf = false;
                        z = false;
                    } else {
                        zZzf = this.zzf.zzf(zze(zzabcVar), j);
                        zzadh zzadhVar = this.zzf;
                        long jZzc = zzadhVar.zzc();
                        if (jZzc != -9223372036854775807L) {
                            this.zzg.zzN(new zzabt(zzadhVar.zzd(), zzadhVar.zze(), jZzc));
                            this.zzo = true;
                        }
                        z = true;
                    }
                    if (!this.zzi) {
                        this.zzi = true;
                        if (this.zzf.zzc() == -9223372036854775807L) {
                            j2 = -this.zzn;
                        } else {
                            j2 = 0;
                        }
                        this.zzj = j2;
                    }
                    this.zzk = 4;
                    this.zzh = 2;
                    if (z) {
                        return 0;
                    }
                } else {
                    if (!zzabcVar.zzn(this.zzd.zzI(), 0, 11, true)) {
                        return -1;
                    }
                    this.zzd.zzG(0);
                    this.zzl = this.zzd.zzl();
                    this.zzm = this.zzd.zzn();
                    this.zzn = this.zzd.zzn();
                    this.zzn = (this.zzn | ((long) (this.zzd.zzl() << 24))) * 1000;
                    this.zzd.zzH(3);
                    this.zzh = 4;
                }
            } else {
                if (!zzabcVar.zzn(this.zzc.zzI(), 0, 9, true)) {
                    return -1;
                }
                this.zzc.zzG(0);
                this.zzc.zzH(4);
                int iZzl = this.zzc.zzl();
                int i4 = iZzl & 4;
                int i5 = iZzl & 1;
                if (i4 != 0 && this.zzp == null) {
                    this.zzp = new zzade(this.zzg.zzv(8, 1));
                }
                if (i5 != 0 && this.zzq == null) {
                    this.zzq = new zzadk(this.zzg.zzv(9, 2));
                }
                this.zzg.zzC();
                this.zzk = this.zzc.zzf() - 5;
                this.zzh = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzg = zzabeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        zzaar zzaarVar = (zzaar) zzabcVar;
        zzaarVar.zzm(this.zzb.zzI(), 0, 3, false);
        this.zzb.zzG(0);
        if (this.zzb.zzn() != 4607062) {
            return false;
        }
        zzaarVar.zzm(this.zzb.zzI(), 0, 2, false);
        this.zzb.zzG(0);
        if ((this.zzb.zzp() & 250) != 0) {
            return false;
        }
        zzaarVar.zzm(this.zzb.zzI(), 0, 4, false);
        this.zzb.zzG(0);
        int iZzf = this.zzb.zzf();
        zzabcVar.zzj();
        zzaarVar.zzl(iZzf, false);
        zzaarVar.zzm(this.zzb.zzI(), 0, 4, false);
        this.zzb.zzG(0);
        return this.zzb.zzf() == 0;
    }
}
