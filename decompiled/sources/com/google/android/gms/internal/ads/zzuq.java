package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzuq implements zzyd, zzth {
    final /* synthetic */ zzuv zza;
    private final Uri zzc;
    private final zzhj zzd;
    private final zzul zze;
    private final zzabe zzf;
    private final zzeb zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzace zzm;
    private boolean zzn;
    private final zzabx zzh = new zzabx();
    private boolean zzj = true;
    private final long zzb = zztj.zza();
    private zzgn zzl = zzi(0);

    public zzuq(zzuv zzuvVar, Uri uri, zzgi zzgiVar, zzul zzulVar, zzabe zzabeVar, zzeb zzebVar) {
        this.zza = zzuvVar;
        this.zzc = uri;
        this.zzd = new zzhj(zzgiVar);
        this.zze = zzulVar;
        this.zzf = zzabeVar;
        this.zzg = zzebVar;
    }

    static /* bridge */ /* synthetic */ void zzf(zzuq zzuqVar, long j, long j2) {
        zzuqVar.zzh.zza = j;
        zzuqVar.zzk = j2;
        zzuqVar.zzj = true;
        zzuqVar.zzn = false;
    }

    private final zzgn zzi(long j) {
        zzgl zzglVar = new zzgl();
        zzglVar.zzd(this.zzc);
        zzglVar.zzc(j);
        zzglVar.zza(6);
        zzglVar.zzb(zzuv.zzb);
        return zzglVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fd  */
    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzh() throws Throwable {
        int i;
        int i2;
        zzul zzulVar;
        boolean z;
        int i3;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i4;
        zzt zztVar;
        int i5;
        int i6;
        int i7;
        int i8;
        while (!this.zzi) {
            try {
                long j = this.zzh.zza;
                zzgn zzgnVarZzi = zzi(j);
                this.zzl = zzgnVarZzi;
                long jZzb = this.zzd.zzb(zzgnVarZzi);
                if (jZzb != -1) {
                    jZzb += j;
                    zzuv.zzB(this.zza);
                }
                long j2 = jZzb;
                zzuv zzuvVar = this.zza;
                Map mapZze = this.zzd.zze();
                List list = (List) mapZze.get("icy-br");
                if (list != null) {
                    String str4 = (String) list.get(0);
                    try {
                        i8 = Integer.parseInt(str4) * 1000;
                        if (i8 > 0) {
                            i3 = i8;
                            z = true;
                        } else {
                            try {
                                zzes.zzf("IcyHeaders", "Invalid bitrate: " + str4);
                                z = false;
                                i3 = -1;
                            } catch (NumberFormatException unused) {
                                zzes.zzf("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                                i3 = i8;
                                z = false;
                            }
                        }
                    } catch (NumberFormatException unused2) {
                        i8 = -1;
                    }
                } else {
                    z = false;
                    i3 = -1;
                }
                List list2 = (List) mapZze.get("icy-genre");
                if (list2 != null) {
                    str = (String) list2.get(0);
                    z = true;
                } else {
                    str = null;
                }
                List list3 = (List) mapZze.get("icy-name");
                if (list3 != null) {
                    str2 = (String) list3.get(0);
                    z = true;
                } else {
                    str2 = null;
                }
                List list4 = (List) mapZze.get("icy-url");
                if (list4 != null) {
                    str3 = (String) list4.get(0);
                    z = true;
                } else {
                    str3 = null;
                }
                List list5 = (List) mapZze.get("icy-pub");
                if (list5 != null) {
                    zEquals = ((String) list5.get(0)).equals("1");
                    z = true;
                } else {
                    zEquals = false;
                }
                List list6 = (List) mapZze.get("icy-metaint");
                if (list6 != null) {
                    String str5 = (String) list6.get(0);
                    try {
                        i7 = Integer.parseInt(str5);
                        if (i7 > 0) {
                            i4 = i7;
                            z = true;
                        } else {
                            try {
                                zzes.zzf("IcyHeaders", "Invalid metadata interval: " + str5);
                                i4 = -1;
                            } catch (NumberFormatException unused3) {
                                zzes.zzf("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                i4 = i7;
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        i7 = -1;
                    }
                } else {
                    i4 = -1;
                }
                zzuvVar.zzr = z ? new zzaeb(i3, str, str2, str3, zEquals, i4) : null;
                zzhj zzhjVar = this.zzd;
                zzuv zzuvVar2 = this.zza;
                if (zzuvVar2.zzr == null || zzuvVar2.zzr.zzf == -1) {
                    zztVar = zzhjVar;
                } else {
                    zzti zztiVar = new zzti(zzhjVar, zzuvVar2.zzr.zzf, this);
                    zzace zzaceVarZzu = this.zza.zzu();
                    this.zzm = zzaceVarZzu;
                    zzaceVarZzu.zzk(zzuv.zzc);
                    zztVar = zztiVar;
                }
                this.zze.zzd(zztVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                if (this.zza.zzr != null) {
                    this.zze.zzc();
                }
                if (this.zzj) {
                    this.zze.zzf(j, this.zzk);
                    try {
                        this.zzj = false;
                    } catch (Throwable th) {
                        th = th;
                        i = 1;
                        i2 = 0;
                        if (i2 != i) {
                            zzulVar = this.zze;
                            if (zzulVar.zzb() != -1) {
                                this.zzh.zza = zzulVar.zzb();
                            }
                        }
                        zzgk.zza(this.zzd);
                        throw th;
                    }
                }
                long j3 = j;
                int iZza = 0;
                while (true) {
                    if (iZza != 0) {
                        i5 = 1;
                        break;
                    }
                    try {
                        if (this.zzi) {
                            i5 = 1;
                            iZza = 0;
                            break;
                        }
                        try {
                            this.zzg.zza();
                            iZza = this.zze.zza(this.zzh);
                            long jZzb2 = this.zze.zzb();
                            if (jZzb2 > this.zza.zzj + j3) {
                                this.zzg.zzc();
                                zzuv zzuvVar3 = this.zza;
                                zzuvVar3.zzp.post(zzuvVar3.zzo);
                                j3 = jZzb2;
                            }
                        } catch (InterruptedException unused5) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i2 = iZza;
                        i = 1;
                        if (i2 != i) {
                            zzulVar = this.zze;
                            if (zzulVar.zzb() != -1) {
                                this.zzh.zza = zzulVar.zzb();
                            }
                        }
                        zzgk.zza(this.zzd);
                        throw th;
                    }
                }
                if (iZza == i5) {
                    i6 = 0;
                } else {
                    zzul zzulVar2 = this.zze;
                    if (zzulVar2.zzb() != -1) {
                        this.zzh.zza = zzulVar2.zzb();
                    }
                    i6 = iZza;
                }
                zzgk.zza(this.zzd);
                if (i6 != 0) {
                    return;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzth
    public final void zza(zzfb zzfbVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(zzuv.zzq(this.zza, true), this.zzk);
        int iZza = zzfbVar.zza();
        zzace zzaceVar = this.zzm;
        zzaceVar.getClass();
        zzacc.zzb(zzaceVar, zzfbVar, iZza);
        zzaceVar.zzs(jMax, 1, iZza, 0, null);
        this.zzn = true;
    }
}
