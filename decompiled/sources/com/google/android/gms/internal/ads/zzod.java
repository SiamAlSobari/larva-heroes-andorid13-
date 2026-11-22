package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.OsConstants;
import android.util.Pair;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.games.GamesStatusCodes;
import com.mrgames.larvaheroesfree.network.GpTouchConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzod implements zzma, zzoe {
    private final Context zza;
    private final zzof zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzcf zzn;
    private zzoc zzo;
    private zzoc zzp;
    private zzoc zzq;
    private zzam zzr;
    private zzam zzs;
    private zzam zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzcv zze = new zzcv();
    private final zzct zzf = new zzct();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzod(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzob zzobVar = new zzob(zzob.zza);
        this.zzb = zzobVar;
        zzobVar.zzh(this);
    }

    public static zzod zzb(Context context) {
        MediaMetricsManager mediaMetricsManagerM258m = zzg$$ExternalSyntheticApiModelOutline0.m258m(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerM258m == null) {
            return null;
        }
        return new zzod(context, mediaMetricsManagerM258m.createPlaybackSession());
    }

    private static int zzr(int i) {
        switch (zzfk.zzi(i)) {
            case GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE /* 6002 */:
                return 24;
            case 6003:
                return 28;
            case GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_INVALID_OPERATION /* 6004 */:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, zzam zzamVar, int i) {
        if (zzfk.zzD(this.zzs, zzamVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzamVar;
        zzx(0, j, zzamVar, i2);
    }

    private final void zzu(long j, zzam zzamVar, int i) {
        if (zzfk.zzD(this.zzt, zzamVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzamVar;
        zzx(2, j, zzamVar, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzcw zzcwVar, zzts zztsVar) {
        int iZza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zztsVar == null || (iZza = zzcwVar.zza(zztsVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzcwVar.zzd(iZza, this.zzf, false);
        zzcwVar.zze(this.zzf.zzd, this.zze, 0L);
        zzbi zzbiVar = this.zze.zze.zzd;
        if (zzbiVar != null) {
            int iZzm = zzfk.zzm(zzbiVar.zzb);
            if (iZzm == 0) {
                i = 3;
            } else if (iZzm != 1) {
                i = iZzm != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        zzcv zzcvVar = this.zze;
        if (zzcvVar.zzo != -9223372036854775807L && !zzcvVar.zzm && !zzcvVar.zzj && !zzcvVar.zzb()) {
            builder.setMediaDurationMillis(zzfk.zzr(this.zze.zzo));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j, zzam zzamVar, int i) {
        if (zzfk.zzD(this.zzr, zzamVar)) {
            return;
        }
        int i2 = this.zzr == null ? 1 : 0;
        this.zzr = zzamVar;
        zzx(1, j, zzamVar, i2);
    }

    private final void zzx(int i, long j, zzam zzamVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzamVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzamVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzamVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzamVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzamVar.zzi;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzamVar.zzr;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzamVar.zzs;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzamVar.zzz;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzamVar.zzA;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzamVar.zzd;
            if (str4 != null) {
                int i8 = zzfk.zza;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                if (pairCreate.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) pairCreate.second);
                }
            }
            float f = zzamVar.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(zzoc zzocVar) {
        return zzocVar != null && zzocVar.zzc.equals(this.zzb.zze());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final void zzc(zzly zzlyVar, String str) {
        zzts zztsVar = zzlyVar.zzd;
        if (zztsVar == null || !zztsVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.1.0");
            zzv(zzlyVar.zzb, zzlyVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final void zzd(zzly zzlyVar, String str, boolean z) {
        zzts zztsVar = zzlyVar.zzd;
        if ((zztsVar == null || !zztsVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zze(zzly zzlyVar, zzam zzamVar, zzie zzieVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzf(zzly zzlyVar, int i, long j, long j2) {
        zzts zztsVar = zzlyVar.zzd;
        if (zztsVar != null) {
            String strZzf = this.zzb.zzf(zzlyVar.zzb, zztsVar);
            Long l = (Long) this.zzh.get(strZzf);
            Long l2 = (Long) this.zzg.get(strZzf);
            this.zzh.put(strZzf, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.zzg.put(strZzf, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzg(zzly zzlyVar, zzto zztoVar) {
        zzts zztsVar = zzlyVar.zzd;
        if (zztsVar == null) {
            return;
        }
        zzam zzamVar = zztoVar.zzb;
        zzamVar.getClass();
        zzoc zzocVar = new zzoc(zzamVar, 0, this.zzb.zzf(zzlyVar.zzb, zztsVar));
        int i = zztoVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zzocVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zzocVar;
                return;
            }
        }
        this.zzo = zzocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzh(zzly zzlyVar, int i, long j) {
    }

    /* JADX WARN: Code duplicated, block: B:142:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:145:0x0203 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x0207  */
    /* JADX WARN: Code duplicated, block: B:150:0x020f  */
    /* JADX WARN: Code duplicated, block: B:151:0x021b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0221  */
    /* JADX WARN: Code duplicated, block: B:154:0x022d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0231  */
    /* JADX WARN: Code duplicated, block: B:157:0x0235  */
    /* JADX WARN: Code duplicated, block: B:159:0x0239  */
    /* JADX WARN: Code duplicated, block: B:160:0x0243  */
    /* JADX WARN: Code duplicated, block: B:162:0x0247  */
    /* JADX WARN: Code duplicated, block: B:163:0x0251  */
    /* JADX WARN: Code duplicated, block: B:165:0x0257  */
    /* JADX WARN: Code duplicated, block: B:167:0x0267  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:179:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ba  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzi(zzcp zzcpVar, zzlz zzlzVar) {
        int i;
        int i2;
        int i3;
        int errorCode;
        int iZzr;
        int iZzj;
        zzad zzadVar;
        int i4;
        int i5;
        if (zzlzVar.zzb() != 0) {
            for (int i6 = 0; i6 < zzlzVar.zzb(); i6++) {
                int iZza = zzlzVar.zza(i6);
                zzly zzlyVarZzc = zzlzVar.zzc(iZza);
                if (iZza == 0) {
                    this.zzb.zzk(zzlyVarZzc);
                } else if (iZza == 11) {
                    this.zzb.zzj(zzlyVarZzc, this.zzk);
                } else {
                    this.zzb.zzi(zzlyVarZzc);
                }
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (zzlzVar.zzd(0)) {
                zzly zzlyVarZzc2 = zzlzVar.zzc(0);
                if (this.zzj != null) {
                    zzv(zzlyVarZzc2.zzb, zzlyVarZzc2.zzd);
                }
            }
            if (zzlzVar.zzd(2) && this.zzj != null) {
                zzfud zzfudVarZza = zzcpVar.zzo().zza();
                int size = zzfudVarZza.size();
                int i7 = 0;
                loop1: while (true) {
                    if (i7 >= size) {
                        zzadVar = null;
                        break;
                    }
                    zzdg zzdgVar = (zzdg) zzfudVarZza.get(i7);
                    int i8 = 0;
                    while (true) {
                        int i9 = zzdgVar.zzb;
                        i5 = i7 + 1;
                        if (i8 <= 0) {
                            if (zzdgVar.zzd(i8) && (zzadVar = zzdgVar.zzb(i8).zzp) != null) {
                                break loop1;
                            } else {
                                i8++;
                            }
                        }
                    }
                    i7 = i5;
                }
                if (zzadVar != null) {
                    PlaybackMetrics.Builder builder = this.zzj;
                    int i10 = zzfk.zza;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= zzadVar.zzb) {
                            i4 = 1;
                            break;
                        }
                        UUID uuid = zzadVar.zza(i11).zza;
                        if (uuid.equals(zzo.zzd)) {
                            i4 = 3;
                            break;
                        } else if (uuid.equals(zzo.zze)) {
                            i4 = 2;
                            break;
                        } else {
                            if (uuid.equals(zzo.zzc)) {
                                i4 = 6;
                                break;
                            }
                            i11++;
                        }
                    }
                    builder.setDrmType(i4);
                }
            }
            if (zzlzVar.zzd(PointerIconCompat.TYPE_COPY)) {
                this.zzy++;
            }
            zzcf zzcfVar = this.zzn;
            if (zzcfVar != null) {
                Context context = this.zza;
                if (zzcfVar.zzb == 1001) {
                    i3 = 20;
                } else {
                    zzil zzilVar = (zzil) zzcfVar;
                    boolean z = zzilVar.zze == 1;
                    int i12 = zzilVar.zzi;
                    Throwable cause = zzcfVar.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        if (cause instanceof zzhd) {
                            iZzj = ((zzhd) cause).zzd;
                            i3 = 5;
                        } else if ((cause instanceof zzhc) || (cause instanceof zzcd)) {
                            i3 = 11;
                        } else {
                            boolean z2 = cause instanceof zzhb;
                            if (z2 || (cause instanceof zzhl)) {
                                if (zzez.zzb(context).zza() == 1) {
                                    i3 = 3;
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        i3 = 6;
                                    } else if (cause2 instanceof SocketTimeoutException) {
                                        i3 = 7;
                                    } else {
                                        i3 = (z2 && ((zzhb) cause).zzc == 1) ? 4 : 8;
                                    }
                                }
                            } else if (zzcfVar.zzb == 1002) {
                                i3 = 21;
                            } else if (cause instanceof zzqr) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (zzfk.zza >= 21 && zzg$$ExternalSyntheticApiModelOutline0.m$1(cause3)) {
                                    errorCode = zzfk.zzj(zzg$$ExternalSyntheticApiModelOutline0.m256m((Object) cause3).getDiagnosticInfo());
                                    iZzr = zzr(errorCode);
                                    int i13 = iZzr;
                                    iZzj = errorCode;
                                    i3 = i13;
                                } else if (zzfk.zza >= 23 && zzg$$ExternalSyntheticApiModelOutline0.m$2(cause3)) {
                                    i3 = 27;
                                } else if (cause3 instanceof NotProvisionedException) {
                                    i3 = 24;
                                } else if (cause3 instanceof DeniedByServerException) {
                                    i3 = 29;
                                } else if (cause3 instanceof zzrc) {
                                    i3 = 23;
                                } else {
                                    i3 = cause3 instanceof zzqp ? 28 : 30;
                                }
                            } else if ((cause instanceof zzgx) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                i3 = (zzfk.zza >= 21 && zzg$$ExternalSyntheticApiModelOutline0.m262m((Object) cause5) && zzg$$ExternalSyntheticApiModelOutline0.m259m((Object) cause5).errno == OsConstants.EACCES) ? 32 : 31;
                            } else {
                                i3 = 9;
                            }
                        }
                    } else if (z) {
                        i3 = 35;
                        if (i12 != 0 && i12 != 1) {
                            if (!z && i12 == 3) {
                                i3 = 15;
                            } else if (!z && i12 == 2) {
                                i3 = 23;
                            } else if (cause instanceof zzry) {
                                iZzj = zzfk.zzj(((zzry) cause).zzd);
                                i3 = 13;
                            } else if (cause instanceof zzru) {
                                iZzj = zzfk.zzj(((zzru) cause).zzb);
                                i3 = 14;
                            } else if (cause instanceof OutOfMemoryError) {
                                i3 = 14;
                            } else if (cause instanceof zzpa) {
                                iZzj = ((zzpa) cause).zza;
                                i3 = 17;
                            } else if (cause instanceof zzpd) {
                                iZzj = ((zzpd) cause).zza;
                                i3 = 18;
                            } else {
                                int i14 = zzfk.zza;
                                if (cause instanceof MediaCodec.CryptoException) {
                                    errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    iZzr = zzr(errorCode);
                                    int i15 = iZzr;
                                    iZzj = errorCode;
                                    i3 = i15;
                                } else {
                                    i3 = 22;
                                }
                            }
                        }
                    } else if (!z) {
                        if (!z) {
                        }
                        if (cause instanceof zzry) {
                            iZzj = zzfk.zzj(((zzry) cause).zzd);
                            i3 = 13;
                        } else if (cause instanceof zzru) {
                            iZzj = zzfk.zzj(((zzru) cause).zzb);
                            i3 = 14;
                        } else if (cause instanceof OutOfMemoryError) {
                            i3 = 14;
                        } else if (cause instanceof zzpa) {
                            iZzj = ((zzpa) cause).zza;
                            i3 = 17;
                        } else if (cause instanceof zzpd) {
                            iZzj = ((zzpd) cause).zza;
                            i3 = 18;
                        } else {
                            int i16 = zzfk.zza;
                            if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                iZzr = zzr(errorCode);
                                int i17 = iZzr;
                                iZzj = errorCode;
                                i3 = i17;
                            } else {
                                i3 = 22;
                            }
                        }
                    } else {
                        if (!z) {
                        }
                        if (cause instanceof zzry) {
                            iZzj = zzfk.zzj(((zzry) cause).zzd);
                            i3 = 13;
                        } else if (cause instanceof zzru) {
                            iZzj = zzfk.zzj(((zzru) cause).zzb);
                            i3 = 14;
                        } else if (cause instanceof OutOfMemoryError) {
                            i3 = 14;
                        } else if (cause instanceof zzpa) {
                            iZzj = ((zzpa) cause).zza;
                            i3 = 17;
                        } else if (cause instanceof zzpd) {
                            iZzj = ((zzpd) cause).zza;
                            i3 = 18;
                        } else {
                            int i18 = zzfk.zza;
                            if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                iZzr = zzr(errorCode);
                                int i19 = iZzr;
                                iZzj = errorCode;
                                i3 = i19;
                            } else {
                                i3 = 22;
                            }
                        }
                    }
                    this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).setErrorCode(i3).setSubErrorCode(iZzj).setException(zzcfVar).build());
                    this.zzz = true;
                    this.zzn = null;
                }
                iZzj = 0;
                this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).setErrorCode(i3).setSubErrorCode(iZzj).setException(zzcfVar).build());
                this.zzz = true;
                this.zzn = null;
            }
            if (zzlzVar.zzd(2)) {
                zzdh zzdhVarZzo = zzcpVar.zzo();
                boolean zZzb = zzdhVarZzo.zzb(2);
                boolean zZzb2 = zzdhVarZzo.zzb(1);
                boolean zZzb3 = zzdhVarZzo.zzb(3);
                if (zZzb || zZzb2) {
                    if (!zZzb) {
                        zzw(jElapsedRealtime, null, 0);
                    }
                    if (!zZzb2) {
                        zzt(jElapsedRealtime, null, 0);
                    }
                    if (!zZzb3) {
                        zzu(jElapsedRealtime, null, 0);
                    }
                } else if (zZzb3) {
                    zZzb3 = true;
                    if (!zZzb) {
                        zzw(jElapsedRealtime, null, 0);
                    }
                    if (!zZzb2) {
                        zzt(jElapsedRealtime, null, 0);
                    }
                    if (!zZzb3) {
                        zzu(jElapsedRealtime, null, 0);
                    }
                }
            }
            if (zzy(this.zzo)) {
                zzoc zzocVar = this.zzo;
                zzam zzamVar = zzocVar.zza;
                if (zzamVar.zzs != -1) {
                    int i20 = zzocVar.zzb;
                    zzw(jElapsedRealtime, zzamVar, 0);
                    this.zzo = null;
                }
            }
            if (zzy(this.zzp)) {
                zzoc zzocVar2 = this.zzp;
                zzam zzamVar2 = zzocVar2.zza;
                int i21 = zzocVar2.zzb;
                zzt(jElapsedRealtime, zzamVar2, 0);
                this.zzp = null;
            }
            if (zzy(this.zzq)) {
                zzoc zzocVar3 = this.zzq;
                zzam zzamVar3 = zzocVar3.zza;
                int i22 = zzocVar3.zzb;
                zzu(jElapsedRealtime, zzamVar3, 0);
                this.zzq = null;
            }
            switch (zzez.zzb(this.zza).zza()) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 9;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                case 8:
                default:
                    i = 1;
                    break;
                case 7:
                    i = 3;
                    break;
                case 9:
                    i = 8;
                    break;
                case 10:
                    i = 7;
                    break;
            }
            if (i != this.zzm) {
                this.zzm = i;
                this.zzc.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i).setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).build());
            }
            if (zzcpVar.zzf() != 2) {
                this.zzu = false;
            }
            if (((zzlt) zzcpVar).zzC() == null) {
                this.zzv = false;
            } else if (zzlzVar.zzd(10)) {
                this.zzv = true;
            }
            int iZzf = zzcpVar.zzf();
            if (this.zzu) {
                i2 = 5;
            } else if (this.zzv) {
                i2 = 13;
            } else {
                i2 = 4;
                if (iZzf == 4) {
                    i2 = 11;
                } else if (iZzf == 2) {
                    int i23 = this.zzl;
                    if (i23 == 0 || i23 == 2) {
                        i2 = 2;
                    } else if (zzcpVar.zzv()) {
                        i2 = zzcpVar.zzg() != 0 ? 10 : 6;
                    } else {
                        i2 = 7;
                    }
                } else if (iZzf != 3) {
                    i2 = (iZzf != 1 || this.zzl == 0) ? this.zzl : 12;
                } else if (zzcpVar.zzv()) {
                    i2 = zzcpVar.zzg() != 0 ? 9 : 3;
                }
            }
            if (this.zzl != i2) {
                this.zzl = i2;
                this.zzz = true;
                this.zzc.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.zzl).setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).build());
            }
            if (zzlzVar.zzd(GpTouchConstants.GPTOUCH_IAP_TIMEOUT_EVENT)) {
                this.zzb.zzg(zzlzVar.zzc(GpTouchConstants.GPTOUCH_IAP_TIMEOUT_EVENT));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzj(zzly zzlyVar, zztj zztjVar, zzto zztoVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzk(zzly zzlyVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzl(zzly zzlyVar, zzcf zzcfVar) {
        this.zzn = zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzm(zzly zzlyVar, zzco zzcoVar, zzco zzcoVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzn(zzly zzlyVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzo(zzly zzlyVar, zzid zzidVar) {
        this.zzw += zzidVar.zzg;
        this.zzx += zzidVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzp(zzly zzlyVar, zzam zzamVar, zzie zzieVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzq(zzly zzlyVar, zzdn zzdnVar) {
        zzoc zzocVar = this.zzo;
        if (zzocVar != null) {
            zzam zzamVar = zzocVar.zza;
            if (zzamVar.zzs == -1) {
                zzak zzakVarZzb = zzamVar.zzb();
                zzakVarZzb.zzX(zzdnVar.zzc);
                zzakVarZzb.zzF(zzdnVar.zzd);
                this.zzo = new zzoc(zzakVarZzb.zzY(), 0, zzocVar.zzc);
            }
        }
    }
}
