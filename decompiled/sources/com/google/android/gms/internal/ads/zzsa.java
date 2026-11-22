package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzsa extends zzic {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private zzrw zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private long zzL;
    private int zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzid zza;
    private boolean zzaa;
    private long zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzrz zzag;
    private long zzah;
    private boolean zzai;
    private zzra zzaj;
    private zzra zzak;
    private final zzrs zzc;
    private final zzsc zzd;
    private final float zze;
    private final zzht zzf;
    private final zzht zzg;
    private final zzht zzh;
    private final zzro zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzql zzl;
    private zzam zzm;
    private zzam zzn;
    private MediaCrypto zzo;
    private boolean zzp;
    private long zzq;
    private float zzr;
    private float zzs;
    private zzrt zzt;
    private zzam zzu;
    private MediaFormat zzv;
    private boolean zzw;
    private float zzx;
    private ArrayDeque zzy;
    private zzry zzz;

    public zzsa(int i, zzrs zzrsVar, zzsc zzscVar, boolean z, float f) {
        super(i);
        this.zzc = zzrsVar;
        zzscVar.getClass();
        this.zzd = zzscVar;
        this.zze = f;
        this.zzf = new zzht(0, 0);
        this.zzg = new zzht(0, 0);
        this.zzh = new zzht(2, 0);
        zzro zzroVar = new zzro();
        this.zzi = zzroVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzr = 1.0f;
        this.zzs = 1.0f;
        this.zzq = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        zzaJ(zzrz.zza);
        zzroVar.zzj(0);
        zzroVar.zzb.order(ByteOrder.nativeOrder());
        this.zzl = new zzql();
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzV = 0;
        this.zzM = -1;
        this.zzN = -1;
        this.zzL = -9223372036854775807L;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
    }

    private final void zzZ() {
        this.zzT = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzS = false;
        this.zzR = false;
        this.zzl.zzb();
    }

    protected static boolean zzaE(zzam zzamVar) {
        return zzamVar.zzF == 0;
    }

    private final void zzaF(zzrw zzrwVar, MediaCrypto mediaCrypto) throws Exception {
        zzrt zzsrVar;
        long j;
        zzrr zzrrVar;
        int i;
        String string;
        String str = zzrwVar.zza;
        float fZzV = zzfk.zza < 23 ? -1.0f : zzV(this.zzs, this.zzm, zzP());
        if (fZzV <= this.zze) {
            fZzV = -1.0f;
        }
        zzav(this.zzm);
        zzh();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec = null;
        zzrr zzrrVarZzab = zzab(zzrwVar, this.zzm, null, fZzV);
        if (zzfk.zza >= 31) {
            zzrx.zza(zzrrVarZzab, zzn());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            if (zzfk.zza < 23 || zzfk.zza < 31) {
                try {
                    zzrw zzrwVar2 = zzrrVarZzab.zza;
                    zzrwVar2.getClass();
                    String str2 = zzrwVar2.zza;
                    Trace.beginSection("createCodec:".concat(str2));
                    MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str2);
                    Trace.endSection();
                    try {
                        Trace.beginSection("configureCodec");
                        mediaCodecCreateByCodecName.configure(zzrrVarZzab.zzb, zzrrVarZzab.zzd, (MediaCrypto) null, 0);
                        Trace.endSection();
                        Trace.beginSection("startCodec");
                        mediaCodecCreateByCodecName.start();
                        Trace.endSection();
                        zzsrVar = new zzsr(mediaCodecCreateByCodecName, null);
                    } catch (IOException | RuntimeException e) {
                        e = e;
                        mediaCodec = mediaCodecCreateByCodecName;
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (RuntimeException e3) {
                    e = e3;
                }
            } else {
                int iZzb = zzcc.zzb(zzrrVarZzab.zzc.zzm);
                zzes.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfk.zzz(iZzb)));
                zzsrVar = new zzrf(iZzb, false).zzc(zzrrVarZzab);
            }
            this.zzt = zzsrVar;
            Trace.endSection();
            zzh();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (zzrwVar.zze(this.zzm)) {
                j = jElapsedRealtime;
                zzrrVar = zzrrVarZzab;
            } else {
                Object[] objArr = new Object[2];
                zzam zzamVar = this.zzm;
                zzn zznVar = zzam.zza;
                if (zzamVar == null) {
                    string = "null";
                    j = jElapsedRealtime;
                    zzrrVar = zzrrVarZzab;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("id=");
                    sb.append(zzamVar.zzb);
                    sb.append(", mimeType=");
                    sb.append(zzamVar.zzm);
                    if (zzamVar.zzi != -1) {
                        sb.append(", bitrate=");
                        sb.append(zzamVar.zzi);
                    }
                    if (zzamVar.zzj != null) {
                        sb.append(", codecs=");
                        sb.append(zzamVar.zzj);
                    }
                    if (zzamVar.zzp != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int i2 = 0;
                        while (true) {
                            zzad zzadVar = zzamVar.zzp;
                            zzrrVar = zzrrVarZzab;
                            if (i2 >= zzadVar.zzb) {
                                break;
                            }
                            UUID uuid = zzadVar.zza(i2).zza;
                            if (uuid.equals(zzo.zzb)) {
                                linkedHashSet.add("cenc");
                            } else if (uuid.equals(zzo.zzc)) {
                                linkedHashSet.add("clearkey");
                            } else if (uuid.equals(zzo.zze)) {
                                linkedHashSet.add("playready");
                            } else if (uuid.equals(zzo.zzd)) {
                                linkedHashSet.add("widevine");
                            } else {
                                if (uuid.equals(zzo.zza)) {
                                    linkedHashSet.add("universal");
                                } else {
                                    linkedHashSet.add("unknown (" + uuid.toString() + ")");
                                }
                                i2++;
                                zzrrVarZzab = zzrrVar;
                                jElapsedRealtime = jElapsedRealtime;
                            }
                            i2++;
                            zzrrVarZzab = zzrrVar;
                            jElapsedRealtime = jElapsedRealtime;
                        }
                        j = jElapsedRealtime;
                        sb.append(", drm=[");
                        zzfqx.zzb(sb, linkedHashSet, ",");
                        sb.append(']');
                    } else {
                        j = jElapsedRealtime;
                        zzrrVar = zzrrVarZzab;
                    }
                    if (zzamVar.zzr != -1 && zzamVar.zzs != -1) {
                        sb.append(", res=");
                        sb.append(zzamVar.zzr);
                        sb.append("x");
                        sb.append(zzamVar.zzs);
                    }
                    zzs zzsVar = zzamVar.zzy;
                    if (zzsVar != null && zzsVar.zze()) {
                        sb.append(", color=");
                        sb.append(zzamVar.zzy.zzd());
                    }
                    if (zzamVar.zzt != -1.0f) {
                        sb.append(", fps=");
                        sb.append(zzamVar.zzt);
                    }
                    if (zzamVar.zzz != -1) {
                        sb.append(", channels=");
                        sb.append(zzamVar.zzz);
                    }
                    if (zzamVar.zzA != -1) {
                        sb.append(", sample_rate=");
                        sb.append(zzamVar.zzA);
                    }
                    if (zzamVar.zzd != null) {
                        sb.append(", language=");
                        sb.append(zzamVar.zzd);
                    }
                    if (zzamVar.zzc != null) {
                        sb.append(", label=");
                        sb.append(zzamVar.zzc);
                    }
                    if (zzamVar.zze != 0) {
                        ArrayList arrayList = new ArrayList();
                        if ((zzamVar.zze & 1) != 0) {
                            arrayList.add("default");
                        }
                        if ((zzamVar.zze & 2) != 0) {
                            arrayList.add("forced");
                        }
                        sb.append(", selectionFlags=[");
                        zzfqx.zzb(sb, arrayList, ",");
                        sb.append("]");
                    }
                    string = sb.toString();
                }
                objArr[0] = string;
                objArr[1] = str;
                zzes.zzf("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
            }
            this.zzA = zzrwVar;
            this.zzx = fZzV;
            this.zzu = this.zzm;
            if (zzfk.zza <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (zzfk.zzd.startsWith("SM-T585") || zzfk.zzd.startsWith("SM-A510") || zzfk.zzd.startsWith("SM-A520") || zzfk.zzd.startsWith("SM-J700"))) {
                i = 2;
            } else {
                i = (zzfk.zza >= 24 || !(("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzfk.zzb) || "flounder_lte".equals(zzfk.zzb) || "grouper".equals(zzfk.zzb) || "tilapia".equals(zzfk.zzb)))) ? 0 : 1;
            }
            this.zzB = i;
            this.zzC = zzfk.zza < 21 && this.zzu.zzo.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.zzD = zzfk.zza == 19 && zzfk.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str));
            this.zzE = zzfk.zza == 29 && "c2.android.aac.decoder".equals(str);
            this.zzF = (zzfk.zza <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (zzfk.zza <= 19 && (("hb2000".equals(zzfk.zzb) || "stvm8".equals(zzfk.zzb)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
            this.zzG = zzfk.zza == 21 && "OMX.google.aac.decoder".equals(str);
            this.zzH = zzfk.zza < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(zzfk.zzc) && (zzfk.zzb.startsWith("baffin") || zzfk.zzb.startsWith("grand") || zzfk.zzb.startsWith("fortuna") || zzfk.zzb.startsWith("gprimelte") || zzfk.zzb.startsWith("j2y18lte") || zzfk.zzb.startsWith("ms01"));
            String str3 = zzrwVar.zza;
            this.zzK = (zzfk.zza <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || (zzfk.zza <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(zzfk.zzc) && "AFTS".equals(zzfk.zzd) && zzrwVar.zzf);
            this.zzt.zzr();
            if (zzbc() == 2) {
                zzh();
                this.zzL = SystemClock.elapsedRealtime() + 1000;
            }
            this.zza.zza++;
            zzae(str, zzrrVar, jElapsedRealtime2, jElapsedRealtime2 - j);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    private final void zzaH() {
        this.zzM = -1;
        this.zzg.zzb = null;
    }

    private final void zzaI() {
        this.zzN = -1;
        this.zzO = null;
    }

    private final void zzaJ(zzrz zzrzVar) {
        this.zzag = zzrzVar;
        if (zzrzVar.zzc != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final void zzaK() throws zzil {
        this.zzaj = this.zzak;
        this.zzW = 0;
        this.zzX = 0;
    }

    private final boolean zzaL() throws zzil {
        if (this.zzY) {
            this.zzW = 1;
            if (this.zzD || this.zzF) {
                this.zzX = 3;
                return false;
            }
            this.zzX = 2;
        } else {
            zzaK();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzaM() throws zzil {
        zzrt zzrtVar = this.zzt;
        boolean z = 0;
        if (zzrtVar == null || this.zzW == 2 || this.zzad) {
            return false;
        }
        if (this.zzM < 0) {
            int iZza = zzrtVar.zza();
            this.zzM = iZza;
            if (iZza < 0) {
                return false;
            }
            this.zzg.zzb = this.zzt.zzf(iZza);
            this.zzg.zzb();
        }
        if (this.zzW == 1) {
            if (!this.zzK) {
                this.zzZ = true;
                this.zzt.zzj(this.zzM, 0, 0, 0L, 4);
                zzaH();
            }
            this.zzW = 2;
            return false;
        }
        if (this.zzI) {
            this.zzI = false;
            this.zzg.zzb.put(zzb);
            this.zzt.zzj(this.zzM, 0, 38, 0L, 0);
            zzaH();
            this.zzY = true;
            return true;
        }
        if (this.zzV == 1) {
            for (int i = 0; i < this.zzu.zzo.size(); i++) {
                this.zzg.zzb.put((byte[]) this.zzu.zzo.get(i));
            }
            this.zzV = 2;
        }
        int iPosition = this.zzg.zzb.position();
        zzkn zzknVarZzj = zzj();
        try {
            int iZzbd = zzbd(zzknVarZzj, this.zzg, 0);
            if (zzM() || this.zzg.zzi()) {
                this.zzac = this.zzab;
            }
            if (iZzbd == -3) {
                return false;
            }
            if (iZzbd == -5) {
                if (this.zzV == 2) {
                    this.zzg.zzb();
                    this.zzV = 1;
                }
                zzY(zzknVarZzj);
                return true;
            }
            zzht zzhtVar = this.zzg;
            if (zzhtVar.zzg()) {
                if (this.zzV == 2) {
                    zzhtVar.zzb();
                    this.zzV = 1;
                }
                this.zzad = true;
                if (!this.zzY) {
                    zzaG();
                    return false;
                }
                try {
                    if (!this.zzK) {
                        this.zzZ = true;
                        this.zzt.zzj(this.zzM, 0, 0, 0L, 4);
                        zzaH();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw zzi(e, this.zzm, false, zzfk.zzi(e.getErrorCode()));
                }
            }
            if (!this.zzY && !zzhtVar.zzh()) {
                zzhtVar.zzb();
                if (this.zzV == 2) {
                    this.zzV = 1;
                }
                return true;
            }
            boolean zZzl = zzhtVar.zzl();
            if (zZzl) {
                zzhtVar.zza.zzb(iPosition);
            }
            if (this.zzC && !zZzl) {
                ByteBuffer byteBuffer = this.zzg.zzb;
                byte[] bArr = zzfy.zza;
                int iPosition2 = byteBuffer.position();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i2 + 1;
                    if (i4 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i5 = byteBuffer.get(i2) & 255;
                    if (i3 == 3) {
                        if (i5 == 1) {
                            if ((byteBuffer.get(i4) & Ascii.US) == 7) {
                                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                                byteBufferDuplicate.position(i2 - 3);
                                byteBufferDuplicate.limit(iPosition2);
                                byteBuffer.position(0);
                                byteBuffer.put(byteBufferDuplicate);
                                break;
                            }
                            i5 = 1;
                        }
                    } else if (i5 == 0) {
                        i3++;
                    }
                    if (i5 != 0) {
                        i3 = 0;
                    }
                    i2 = i4;
                }
                if (this.zzg.zzb.position() == 0) {
                    return true;
                }
                this.zzC = false;
            }
            long j = this.zzg.zzd;
            if (this.zzaf) {
                if (this.zzk.isEmpty()) {
                    this.zzag.zzd.zzd(j, this.zzm);
                } else {
                    ((zzrz) this.zzk.peekLast()).zzd.zzd(j, this.zzm);
                }
                this.zzaf = false;
            }
            this.zzab = Math.max(this.zzab, j);
            this.zzg.zzk();
            zzht zzhtVar2 = this.zzg;
            if (zzhtVar2.zze()) {
                zzat(zzhtVar2);
            }
            zzak(this.zzg);
            try {
                if (zZzl) {
                    this.zzt.zzk(this.zzM, 0, this.zzg.zza, j, 0);
                } else {
                    this.zzt.zzj(this.zzM, 0, this.zzg.zzb.limit(), j, 0);
                }
                zzaH();
                this.zzY = true;
                this.zzV = 0;
                zzid zzidVar = this.zza;
                z = zzidVar.zzc + 1;
                zzidVar.zzc = z;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw zzi(e2, this.zzm, z, zzfk.zzi(e2.getErrorCode()));
            }
        } catch (zzhs e3) {
            zzad(e3);
            zzaO(0);
            zzah();
            return true;
        }
    }

    private final boolean zzaN() {
        return this.zzN >= 0;
    }

    private final boolean zzaO(int i) throws zzil {
        zzkn zzknVarZzj = zzj();
        this.zzf.zzb();
        int iZzbd = zzbd(zzknVarZzj, this.zzf, i | 4);
        if (iZzbd == -5) {
            zzY(zzknVarZzj);
            return true;
        }
        if (iZzbd != -4 || !this.zzf.zzg()) {
            return false;
        }
        this.zzad = true;
        zzaG();
        return false;
    }

    private final boolean zzaP(long j) {
        if (this.zzq == -9223372036854775807L) {
            return true;
        }
        zzh();
        return SystemClock.elapsedRealtime() - j < this.zzq;
    }

    private final boolean zzaQ(zzam zzamVar) throws zzil {
        if (zzfk.zza >= 23 && this.zzt != null && this.zzX != 3 && zzbc() != 0) {
            float fZzV = zzV(this.zzs, zzamVar, zzP());
            float f = this.zzx;
            if (f == fZzV) {
                return true;
            }
            if (fZzV == -1.0f) {
                zzaa();
                return false;
            }
            if (f == -1.0f && fZzV <= this.zze) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fZzV);
            this.zzt.zzp(bundle);
            this.zzx = fZzV;
        }
        return true;
    }

    private final void zzaa() throws zzil {
        if (this.zzY) {
            this.zzW = 1;
            this.zzX = 3;
        } else {
            zzaw();
            zzau();
        }
    }

    private final void zzah() {
        try {
            this.zzt.zzi();
        } finally {
            zzax();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzC(zzam[] zzamVarArr, long j, long j2) throws zzil {
        if (this.zzag.zzc == -9223372036854775807L) {
            zzaJ(new zzrz(-9223372036854775807L, j, j2));
            return;
        }
        if (this.zzk.isEmpty()) {
            long j3 = this.zzab;
            if (j3 != -9223372036854775807L) {
                long j4 = this.zzah;
                if (j4 != -9223372036854775807L) {
                }
            }
            zzaJ(new zzrz(-9223372036854775807L, j, j2));
            if (this.zzag.zzc != -9223372036854775807L) {
                zzaj();
                return;
            }
            return;
        }
        this.zzk.add(new zzrz(this.zzab, j, j2));
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzln
    public void zzJ(float f, float f2) throws zzil {
        this.zzr = f;
        this.zzs = f2;
        zzaQ(this.zzu);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9771. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzR(long r24, long r26) throws com.google.android.gms.internal.ads.zzil {
        /*
            Method dump skipped, instruction units count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.zzR(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public boolean zzS() {
        return this.zzae;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public boolean zzT() {
        if (this.zzm == null) {
            return false;
        }
        if (zzO() || zzaN()) {
            return true;
        }
        if (this.zzL == -9223372036854775807L) {
            return false;
        }
        zzh();
        return SystemClock.elapsedRealtime() < this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final int zzU(zzam zzamVar) throws zzil {
        try {
            return zzW(this.zzd, zzamVar);
        } catch (zzsj e) {
            throw zzi(e, zzamVar, false, GamesStatusCodes.STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE);
        }
    }

    protected float zzV(float f, zzam zzamVar, zzam[] zzamVarArr) {
        throw null;
    }

    protected abstract int zzW(zzsc zzscVar, zzam zzamVar) throws zzsj;

    protected zzie zzX(zzrw zzrwVar, zzam zzamVar, zzam zzamVar2) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    protected zzie zzY(zzkn zzknVar) throws zzil {
        int i;
        boolean z = true;
        this.zzaf = true;
        zzam zzamVar = zzknVar.zza;
        zzamVar.getClass();
        if (zzamVar.zzm == null) {
            throw zzi(new IllegalArgumentException(), zzamVar, false, GamesStatusCodes.STATUS_SNAPSHOT_FOLDER_UNAVAILABLE);
        }
        zzra zzraVar = zzknVar.zzb;
        this.zzak = zzraVar;
        this.zzm = zzamVar;
        if (this.zzR) {
            this.zzT = true;
            return null;
        }
        zzrt zzrtVar = this.zzt;
        if (zzrtVar == null) {
            this.zzy = null;
            zzau();
            return null;
        }
        zzrw zzrwVar = this.zzA;
        zzam zzamVar2 = this.zzu;
        zzra zzraVar2 = this.zzaj;
        if (zzraVar2 != zzraVar) {
            zzaa();
            return new zzie(zzrwVar.zza, zzamVar2, zzamVar, 0, 128);
        }
        boolean z2 = zzraVar != zzraVar2;
        zzdy.zzf(!z2 || zzfk.zza >= 23);
        zzie zzieVarZzX = zzX(zzrwVar, zzamVar2, zzamVar);
        int i2 = zzieVarZzX.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (zzaQ(zzamVar)) {
                        this.zzu = zzamVar;
                        if (!z2 || zzaL()) {
                        }
                    } else {
                        i = 16;
                    }
                } else if (zzaQ(zzamVar)) {
                    this.zzU = true;
                    this.zzV = 1;
                    int i3 = this.zzB;
                    if (i3 != 2 && (i3 != 1 || zzamVar.zzr != zzamVar2.zzr || zzamVar.zzs != zzamVar2.zzs)) {
                        z = false;
                    }
                    this.zzI = z;
                    this.zzu = zzamVar;
                    if (!z2 || zzaL()) {
                    }
                } else {
                    i = 16;
                }
            } else if (zzaQ(zzamVar)) {
                this.zzu = zzamVar;
                if (z2) {
                    if (zzaL()) {
                    }
                } else if (this.zzY) {
                    this.zzW = 1;
                    if (this.zzD || this.zzF) {
                        this.zzX = 3;
                    } else {
                        this.zzX = 1;
                    }
                }
            } else {
                i = 16;
            }
            return (zzieVarZzX.zzd != 0 || (this.zzt == zzrtVar && this.zzX != 3)) ? zzieVarZzX : new zzie(zzrwVar.zza, zzamVar2, zzamVar, 0, i);
        }
        zzaa();
        i = 0;
        if (zzieVarZzX.zzd != 0) {
        }
    }

    protected final boolean zzaA() {
        if (this.zzt == null) {
            return false;
        }
        int i = this.zzX;
        if (i == 3 || this.zzD || ((this.zzE && !this.zzaa) || (this.zzF && this.zzZ))) {
            zzaw();
            return true;
        }
        if (i == 2) {
            zzdy.zzf(zzfk.zza >= 23);
            if (zzfk.zza >= 23) {
                try {
                    zzaK();
                } catch (zzil e) {
                    zzes.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    zzaw();
                    return true;
                }
            }
        }
        zzah();
        return false;
    }

    protected final boolean zzaB() {
        return this.zzR;
    }

    protected final boolean zzaC(zzam zzamVar) {
        return this.zzak == null && zzan(zzamVar);
    }

    protected boolean zzaD(zzrw zzrwVar) {
        return true;
    }

    protected abstract zzrr zzab(zzrw zzrwVar, zzam zzamVar, MediaCrypto mediaCrypto, float f);

    protected abstract List zzac(zzsc zzscVar, zzam zzamVar, boolean z) throws zzsj;

    protected void zzad(Exception exc) {
        throw null;
    }

    protected void zzae(String str, zzrr zzrrVar, long j, long j2) {
        throw null;
    }

    protected void zzaf(String str) {
        throw null;
    }

    protected void zzag(zzam zzamVar, MediaFormat mediaFormat) throws zzil {
        throw null;
    }

    protected void zzai(long j) {
        this.zzah = j;
        while (!this.zzk.isEmpty() && j >= ((zzrz) this.zzk.peek()).zzb) {
            zzaJ((zzrz) this.zzk.poll());
            zzaj();
        }
    }

    protected void zzaj() {
    }

    protected void zzak(zzht zzhtVar) throws zzil {
        throw null;
    }

    protected void zzal() throws zzil {
    }

    protected abstract boolean zzam(long j, long j2, zzrt zzrtVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zzil;

    protected boolean zzan(zzam zzamVar) {
        return false;
    }

    protected final float zzao() {
        return this.zzr;
    }

    protected final long zzap() {
        return this.zzag.zzc;
    }

    protected final zzrt zzaq() {
        return this.zzt;
    }

    protected zzru zzar(Throwable th, zzrw zzrwVar) {
        return new zzru(th, zzrwVar);
    }

    protected final zzrw zzas() {
        return this.zzA;
    }

    protected void zzat(zzht zzhtVar) throws zzil {
    }

    protected final void zzau() throws zzil {
        zzam zzamVar;
        if (this.zzt != null || this.zzR || (zzamVar = this.zzm) == null) {
            return;
        }
        if (zzaC(zzamVar)) {
            zzam zzamVar2 = this.zzm;
            zzZ();
            String str = zzamVar2.zzm;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzo(32);
            } else {
                this.zzi.zzo(1);
            }
            this.zzR = true;
            return;
        }
        this.zzaj = this.zzak;
        String str2 = this.zzm.zzm;
        if (this.zzaj != null) {
            boolean z = zzrb.zza;
        }
        try {
            if (this.zzy == null) {
                try {
                    List listZzac = zzac(this.zzd, this.zzm, false);
                    listZzac.isEmpty();
                    this.zzy = new ArrayDeque();
                    if (!listZzac.isEmpty()) {
                        this.zzy.add((zzrw) listZzac.get(0));
                    }
                    this.zzz = null;
                } catch (zzsj e) {
                    throw new zzry(this.zzm, (Throwable) e, false, -49998);
                }
            }
            if (this.zzy.isEmpty()) {
                throw new zzry(this.zzm, (Throwable) null, false, -49999);
            }
            zzrw zzrwVar = (zzrw) this.zzy.peekFirst();
            while (this.zzt == null) {
                zzrw zzrwVar2 = (zzrw) this.zzy.peekFirst();
                if (!zzaD(zzrwVar2)) {
                    return;
                }
                try {
                    zzaF(zzrwVar2, null);
                } catch (Exception e2) {
                    if (zzrwVar2 != zzrwVar) {
                        throw e2;
                    }
                    try {
                        zzes.zzf("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        zzaF(zzrwVar2, null);
                    } catch (Exception e3) {
                        zzes.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(String.valueOf(zzrwVar2))), e3);
                        this.zzy.removeFirst();
                        zzry zzryVar = new zzry(this.zzm, (Throwable) e3, false, zzrwVar2);
                        zzad(zzryVar);
                        zzry zzryVar2 = this.zzz;
                        if (zzryVar2 == null) {
                            this.zzz = zzryVar;
                        } else {
                            this.zzz = zzry.zza(zzryVar2, zzryVar);
                        }
                        if (this.zzy.isEmpty()) {
                            throw this.zzz;
                        }
                    }
                }
            }
            this.zzy = null;
        } catch (zzry e4) {
            throw zzi(e4, this.zzm, false, GamesStatusCodes.STATUS_SNAPSHOT_CREATION_FAILED);
        }
    }

    protected void zzav(zzam zzamVar) throws zzil {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzaw() {
        try {
            zzrt zzrtVar = this.zzt;
            if (zzrtVar != null) {
                zzrtVar.zzl();
                this.zza.zzb++;
                zzaf(this.zzA.zza);
            }
        } finally {
            this.zzt = null;
            this.zzo = null;
            this.zzaj = null;
            zzay();
        }
    }

    protected void zzax() {
        zzaH();
        zzaI();
        this.zzL = -9223372036854775807L;
        this.zzZ = false;
        this.zzY = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
        this.zzV = this.zzU ? 1 : 0;
    }

    protected final void zzay() {
        zzax();
        this.zzy = null;
        this.zzA = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzaa = false;
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzC = false;
        this.zzD = false;
        this.zzE = false;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzK = false;
        this.zzU = false;
        this.zzV = 0;
        this.zzp = false;
    }

    protected final boolean zzaz() throws zzil {
        boolean zZzaA = zzaA();
        if (zZzaA) {
            zzau();
        }
        return zZzaA;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlp
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected void zzw() {
        this.zzm = null;
        zzaJ(zzrz.zza);
        this.zzk.clear();
        zzaA();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected void zzx(boolean z, boolean z2) throws zzil {
        this.zza = new zzid();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected void zzy(long j, boolean z) throws zzil {
        this.zzad = false;
        this.zzae = false;
        if (this.zzR) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzS = false;
            this.zzl.zzb();
        } else {
            zzaz();
        }
        zzfh zzfhVar = this.zzag.zzd;
        if (zzfhVar.zza() > 0) {
            this.zzaf = true;
        }
        zzfhVar.zze();
        this.zzk.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected void zzz() {
        try {
            zzZ();
            zzaw();
        } finally {
            this.zzak = null;
        }
    }

    private final void zzaG() throws zzil {
        int i = this.zzX;
        if (i == 1) {
            zzah();
            return;
        }
        if (i == 2) {
            zzah();
            zzaK();
        } else if (i != 3) {
            this.zzae = true;
            zzal();
        } else {
            zzaw();
            zzau();
        }
    }
}
