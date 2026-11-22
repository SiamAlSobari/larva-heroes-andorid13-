package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzk {
    private final zzyo zza = new zzyo();
    private final zzzg zzb;
    private final zzzj zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzzk(Context context) {
        zzzg zzzgVarZzc;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = zzfk.zza;
            zzzgVarZzc = zzzi.zzc(applicationContext);
            if (zzzgVarZzc == null) {
                zzzgVarZzc = zzzh.zzc(applicationContext);
            }
        } else {
            zzzgVarZzc = null;
        }
        this.zzb = zzzgVarZzc;
        this.zzc = zzzgVarZzc != null ? zzzj.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzzk zzzkVar, Display display) {
        if (display == null) {
            zzes.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzzkVar.zzk = -9223372036854775807L;
            zzzkVar.zzl = -9223372036854775807L;
        } else {
            double refreshRate = display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            zzzkVar.zzk = j;
            zzzkVar.zzl = (j * 80) / 100;
        }
    }

    private final void zzk() {
        Surface surface;
        if (zzfk.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzzf.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[RETURN] */
    private final void zzm() {
        if (zzfk.zza < 30 || this.zze == null) {
            return;
        }
        float fZza = this.zza.zzg() ? this.zza.zza() : this.zzf;
        float f = this.zzg;
        if (fZza == f) {
            return;
        }
        boolean z = true;
        if (fZza != -1.0f && f != -1.0f) {
            float f2 = 1.0f;
            if (this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                f2 = 0.02f;
            }
            if (Math.abs(fZza - this.zzg) < f2) {
                z = false;
            }
            if (!z) {
                return;
            }
        } else if (fZza == -1.0f) {
            if (this.zza.zzb() < 30) {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        this.zzg = fZza;
        zzn(false);
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (zzfk.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzzf.zza(surface, f);
        }
    }

    public final long zza(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzg()) {
            long jZzc = this.zzq + ((long) ((this.zza.zzc() * (this.zzm - this.zzp)) / this.zzi));
            if (Math.abs(j - jZzc) > 20000000) {
                zzl();
            } else {
                j = jZzc;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzzj zzzjVar = this.zzc;
        if (zzzjVar == null || this.zzk == -9223372036854775807L) {
            return j;
        }
        long j3 = zzzjVar.zza;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.zzk;
        long j5 = j3 + (((j - j3) / j4) * j4);
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            j5 = j4 + j5;
            j2 = j5;
        }
        long j6 = this.zzl;
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - j6;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzzj zzzjVar = this.zzc;
            zzzjVar.getClass();
            zzzjVar.zzb();
            this.zzb.zzb(new zzze(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzzg zzzgVar = this.zzb;
        if (zzzgVar != null) {
            zzzgVar.zza();
            zzzj zzzjVar = this.zzc;
            zzzjVar.getClass();
            zzzjVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (true == (surface instanceof zzzc)) {
            surface = null;
        }
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }
}
