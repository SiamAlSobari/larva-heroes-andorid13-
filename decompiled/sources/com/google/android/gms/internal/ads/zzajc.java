package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajc implements zzaio {
    private final zzfb zza;
    private final zzabu zzb;
    private final String zzc;
    private zzace zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzajc() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfbVar) {
        zzdy.zzb(this.zzd);
        while (zzfbVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                byte[] bArrZzI = zzfbVar.zzI();
                int iZzc = zzfbVar.zzc();
                int iZzd = zzfbVar.zzd();
                while (true) {
                    if (iZzc >= iZzd) {
                        zzfbVar.zzG(iZzd);
                        break;
                    }
                    byte b = bArrZzI[iZzc];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.zzi && (b & 224) == 224;
                    this.zzi = z;
                    if (z2) {
                        zzfbVar.zzG(iZzc + 1);
                        this.zzi = false;
                        this.zza.zzI()[1] = bArrZzI[iZzc];
                        this.zzg = 2;
                        this.zzf = 1;
                        break;
                    }
                    iZzc++;
                }
            } else if (i != 1) {
                int iMin = Math.min(zzfbVar.zza(), this.zzk - this.zzg);
                this.zzd.zzq(zzfbVar, iMin);
                int i2 = this.zzg + iMin;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 >= i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zzd.zzs(j, 1, i3, 0, null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int iMin2 = Math.min(zzfbVar.zza(), 4 - this.zzg);
                zzfbVar.zzC(this.zza.zzI(), this.zzg, iMin2);
                int i4 = this.zzg + iMin2;
                this.zzg = i4;
                if (i4 >= 4) {
                    this.zza.zzG(0);
                    if (this.zzb.zza(this.zza.zzf())) {
                        zzabu zzabuVar = this.zzb;
                        this.zzk = zzabuVar.zzc;
                        if (!this.zzh) {
                            this.zzj = (((long) zzabuVar.zzg) * 1000000) / ((long) zzabuVar.zzd);
                            zzak zzakVar = new zzak();
                            zzakVar.zzH(this.zze);
                            zzakVar.zzS(this.zzb.zzb);
                            zzakVar.zzL(4096);
                            zzakVar.zzw(this.zzb.zze);
                            zzakVar.zzT(this.zzb.zzd);
                            zzakVar.zzK(this.zzc);
                            this.zzd.zzk(zzakVar.zzY());
                            this.zzh = true;
                        }
                        this.zza.zzG(0);
                        this.zzd.zzq(this.zza, 4);
                        this.zzf = 2;
                    } else {
                        this.zzg = 0;
                        this.zzf = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zze = zzakaVar.zzb();
        this.zzd = zzabeVar.zzv(zzakaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }

    public zzajc(String str) {
        this.zzf = 0;
        zzfb zzfbVar = new zzfb(4);
        this.zza = zzfbVar;
        zzfbVar.zzI()[0] = -1;
        this.zzb = new zzabu();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
