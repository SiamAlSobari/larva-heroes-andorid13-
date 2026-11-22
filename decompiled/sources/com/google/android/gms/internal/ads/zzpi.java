package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpi {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private long zzG;
    private boolean zzH;
    private long zzI;
    private zzdz zzJ;
    private final zzph zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzpg zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzpi(zzph zzphVar) {
        this.zza = zzphVar;
        int i = zzfk.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzJ = zzdz.zza;
    }

    private final long zzm(long j) {
        return (j * ((long) this.zzg)) / 1000000;
    }

    private final long zzn(long j) {
        return (j * 1000000) / ((long) this.zzg);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    private final long zzo() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzy != -9223372036854775807L) {
            return Math.min(this.zzB, this.zzA + zzm(zzfk.zzn(zzfk.zzp(jElapsedRealtime) - this.zzy, this.zzj)));
        }
        if (jElapsedRealtime - this.zzs >= 5) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                long j = 0;
                if (this.zzh) {
                    if (playState == 2) {
                        if (playbackHeadPosition == 0) {
                            this.zzv = this.zzt;
                        }
                        playState = 2;
                    }
                    playbackHeadPosition += this.zzv;
                }
                if (zzfk.zza > 29) {
                    if (this.zzt > playbackHeadPosition) {
                        this.zzu++;
                    }
                    this.zzt = playbackHeadPosition;
                } else {
                    if (playbackHeadPosition != 0) {
                        j = playbackHeadPosition;
                    } else if (this.zzt > 0 && playState == 3) {
                        if (this.zzz == -9223372036854775807L) {
                            this.zzz = jElapsedRealtime;
                        }
                    }
                    this.zzz = -9223372036854775807L;
                    playbackHeadPosition = j;
                    if (this.zzt > playbackHeadPosition) {
                        this.zzu++;
                    }
                    this.zzt = playbackHeadPosition;
                }
            }
            this.zzs = jElapsedRealtime;
        }
        return this.zzt + this.zzI + (this.zzu << 32);
    }

    private final void zzp() {
        this.zzl = 0L;
        this.zzx = 0;
        this.zzw = 0;
        this.zzm = 0L;
        this.zzD = 0L;
        this.zzG = 0L;
        this.zzk = false;
    }

    public final int zza(long j) {
        return this.zze - ((int) (j - (zzo() * ((long) this.zzd))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:25:0x00df  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:28:0x0134  */
    /* JADX WARN: Code duplicated, block: B:41:0x017b A[Catch: Exception -> 0x0194, TRY_LEAVE, TryCatch #0 {Exception -> 0x0194, blocks: (B:35:0x014b, B:37:0x0151, B:39:0x016a, B:41:0x017b), top: B:69:0x014b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0098, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00f1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x017b, please report this as an issue */
    public final long zzb(boolean z) {
        long jZzn;
        zzpg zzpgVar;
        Method method;
        long jMax;
        long jZzb;
        long jZza;
        long jZzn2;
        zzpi zzpiVar = this;
        AudioTrack audioTrack = zzpiVar.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - zzpiVar.zzm >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long jZzn3 = zzpiVar.zzn(zzo());
                if (jZzn3 != 0) {
                    zzpiVar.zzb[zzpiVar.zzw] = zzfk.zzo(jZzn3, zzpiVar.zzj) - jNanoTime;
                    zzpiVar.zzw = (zzpiVar.zzw + 1) % 10;
                    int i = zzpiVar.zzx;
                    if (i < 10) {
                        zzpiVar.zzx = i + 1;
                    }
                    zzpiVar.zzm = jNanoTime;
                    zzpiVar.zzl = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = zzpiVar.zzx;
                        if (i2 >= i3) {
                            break;
                        }
                        zzpiVar.zzl += zzpiVar.zzb[i2] / ((long) i3);
                        i2++;
                    }
                    if (!zzpiVar.zzh) {
                        zzpgVar = zzpiVar.zzf;
                        zzpgVar.getClass();
                        if (zzpgVar.zzg(jNanoTime)) {
                            jZzb = zzpgVar.zzb();
                            jZza = zzpgVar.zza();
                            jZzn2 = zzpiVar.zzn(zzo());
                            if (Math.abs(jZzb - jNanoTime) > 5000000) {
                                zzpz zzpzVar = (zzpz) zzpiVar.zza;
                                zzes.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + jZza + ", " + jZzb + ", " + jNanoTime + ", " + jZzn2 + ", " + zzpzVar.zza.zzG() + ", " + zzpzVar.zza.zzH());
                                zzpgVar.zzd();
                            } else if (Math.abs(zzpiVar.zzn(jZza) - jZzn2) > 5000000) {
                                zzpz zzpzVar2 = (zzpz) zzpiVar.zza;
                                zzes.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + jZza + ", " + jZzb + ", " + jNanoTime + ", " + jZzn2 + ", " + zzpzVar2.zza.zzG() + ", " + zzpzVar2.zza.zzH());
                                zzpgVar.zzd();
                            } else {
                                zzpgVar.zzc();
                            }
                            zzpiVar = this;
                        }
                        if (zzpiVar.zzq && (method = zzpiVar.zzn) != null && jNanoTime - zzpiVar.zzr >= 500000) {
                            try {
                                AudioTrack audioTrack2 = zzpiVar.zzc;
                                audioTrack2.getClass();
                                Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                                int i4 = zzfk.zza;
                                long jIntValue = num.intValue();
                                long j = zzpiVar.zzi;
                                Long.signum(jIntValue);
                                long j2 = (jIntValue * 1000) - j;
                                zzpiVar.zzo = j2;
                                jMax = Math.max(j2, 0L);
                                zzpiVar.zzo = jMax;
                                if (jMax > 5000000) {
                                    zzes.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                    zzpiVar.zzo = 0L;
                                }
                            } catch (Exception unused) {
                                zzpiVar.zzn = null;
                            }
                            zzpiVar.zzr = jNanoTime;
                        }
                    }
                }
            } else if (!zzpiVar.zzh) {
                zzpgVar = zzpiVar.zzf;
                zzpgVar.getClass();
                if (zzpgVar.zzg(jNanoTime)) {
                    jZzb = zzpgVar.zzb();
                    jZza = zzpgVar.zza();
                    jZzn2 = zzpiVar.zzn(zzo());
                    if (Math.abs(jZzb - jNanoTime) > 5000000) {
                        zzpz zzpzVar3 = (zzpz) zzpiVar.zza;
                        zzes.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + jZza + ", " + jZzb + ", " + jNanoTime + ", " + jZzn2 + ", " + zzpzVar3.zza.zzG() + ", " + zzpzVar3.zza.zzH());
                        zzpgVar.zzd();
                    } else if (Math.abs(zzpiVar.zzn(jZza) - jZzn2) > 5000000) {
                        zzpz zzpzVar4 = (zzpz) zzpiVar.zza;
                        zzes.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + jZza + ", " + jZzb + ", " + jNanoTime + ", " + jZzn2 + ", " + zzpzVar4.zza.zzG() + ", " + zzpzVar4.zza.zzH());
                        zzpgVar.zzd();
                    } else {
                        zzpgVar.zzc();
                    }
                    zzpiVar = this;
                }
                if (zzpiVar.zzq) {
                    AudioTrack audioTrack3 = zzpiVar.zzc;
                    audioTrack3.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack3, new Object[0]);
                    int i5 = zzfk.zza;
                    long jIntValue2 = num2.intValue();
                    long j3 = zzpiVar.zzi;
                    Long.signum(jIntValue2);
                    long j4 = (jIntValue2 * 1000) - j3;
                    zzpiVar.zzo = j4;
                    jMax = Math.max(j4, 0L);
                    zzpiVar.zzo = jMax;
                    if (jMax > 5000000) {
                        zzes.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                        zzpiVar.zzo = 0L;
                    }
                    zzpiVar.zzr = jNanoTime;
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        zzpg zzpgVar2 = zzpiVar.zzf;
        zzpgVar2.getClass();
        boolean zZzf = zzpgVar2.zzf();
        if (zZzf) {
            jZzn = zzpiVar.zzn(zzpgVar2.zza()) + zzfk.zzn(jNanoTime2 - zzpgVar2.zzb(), zzpiVar.zzj);
        } else {
            jZzn = zzpiVar.zzx == 0 ? zzpiVar.zzn(zzo()) : zzfk.zzn(zzpiVar.zzl + jNanoTime2, zzpiVar.zzj);
            if (!z) {
                jZzn = Math.max(0L, jZzn - zzpiVar.zzo);
            }
        }
        if (zzpiVar.zzE != zZzf) {
            zzpiVar.zzG = zzpiVar.zzD;
            zzpiVar.zzF = zzpiVar.zzC;
        }
        long j5 = jNanoTime2 - zzpiVar.zzG;
        if (j5 < 1000000) {
            long jZzn4 = zzpiVar.zzF + zzfk.zzn(j5, zzpiVar.zzj);
            long j6 = (j5 * 1000) / 1000000;
            jZzn = ((jZzn * j6) + ((1000 - j6) * jZzn4)) / 1000;
        }
        if (!zzpiVar.zzk) {
            long j7 = zzpiVar.zzC;
            if (jZzn > j7) {
                zzpiVar.zzk = true;
                int i6 = zzfk.zza;
                long jCurrentTimeMillis = System.currentTimeMillis() - zzfk.zzr(zzfk.zzo(zzfk.zzr(jZzn - j7), zzpiVar.zzj));
                zzqe zzqeVar = ((zzpz) zzpiVar.zza).zza;
                if (zzqeVar.zzp != null) {
                    ((zzqj) zzqeVar.zzp).zza.zzc.zzr(jCurrentTimeMillis);
                }
            }
        }
        zzpiVar.zzD = jNanoTime2;
        zzpiVar.zzC = jZzn;
        zzpiVar.zzE = zZzf;
        return jZzn;
    }

    public final void zzc(long j) {
        this.zzA = zzo();
        this.zzy = zzfk.zzp(SystemClock.elapsedRealtime());
        this.zzB = j;
    }

    public final void zzd() {
        zzp();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public final void zze(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.zzc = audioTrack;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = new zzpg(audioTrack);
        this.zzg = audioTrack.getSampleRate();
        if (!z || zzfk.zza >= 23) {
            z2 = false;
        } else {
            z2 = true;
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                } else {
                    z2 = false;
                }
            }
        }
        this.zzh = z2;
        boolean zZzE = zzfk.zzE(i);
        this.zzq = zZzE;
        this.zzi = zZzE ? zzn(i3 / i2) : -9223372036854775807L;
        this.zzt = 0L;
        this.zzu = 0L;
        this.zzH = false;
        this.zzI = 0L;
        this.zzv = 0L;
        this.zzp = false;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzr = 0L;
        this.zzo = 0L;
        this.zzj = 1.0f;
    }

    public final void zzf(zzdz zzdzVar) {
        this.zzJ = zzdzVar;
    }

    public final boolean zzh(long j) {
        if (j > zzm(zzb(false))) {
            return true;
        }
        if (this.zzh) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && zzo() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzi() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzj(long j) {
        return this.zzz != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzz >= 200;
    }

    public final boolean zzk(long j) {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            }
            if (playState == 1) {
                if (zzo() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zZzh = zzh(j);
        this.zzp = zZzh;
        if (z && !zZzh && playState != 1) {
            zzph zzphVar = this.zza;
            int i = this.zze;
            long jZzr = zzfk.zzr(this.zzi);
            zzpz zzpzVar = (zzpz) zzphVar;
            if (zzpzVar.zza.zzp != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                zzqe zzqeVar = zzpzVar.zza;
                ((zzqj) zzqeVar.zzp).zza.zzc.zzt(i, jZzr, jElapsedRealtime - zzqeVar.zzV);
            }
        }
        return true;
    }

    public final boolean zzl() {
        zzp();
        if (this.zzy != -9223372036854775807L) {
            return false;
        }
        zzpg zzpgVar = this.zzf;
        zzpgVar.getClass();
        zzpgVar.zze();
        return true;
    }

    public final void zzg() {
        zzpg zzpgVar = this.zzf;
        zzpgVar.getClass();
        zzpgVar.zze();
    }
}
