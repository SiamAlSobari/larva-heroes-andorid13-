package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import androidx.work.WorkRequest;
import com.google.android.gms.drive.DriveFile;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzafu implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzafq
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzafu.zza;
            return new zzabb[]{new zzafu(0)};
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private zzaft zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzet zzJ;
    private zzet zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzabe zzai;
    private final zzafp zzh;
    private final zzafw zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzfb zzl;
    private final zzfb zzm;
    private final zzfb zzn;
    private final zzfb zzo;
    private final zzfb zzp;
    private final zzfb zzq;
    private final zzfb zzr;
    private final zzfb zzs;
    private final zzfb zzt;
    private final zzfb zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzfk.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfqu.zzc);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(map);
    }

    public zzafu() {
        this(0);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzn(zzabc zzabcVar, zzaft zzaftVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzaftVar.zzb)) {
            zzv(zzabcVar, zzb, i);
            int i3 = this.zzaa;
            zzu();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zzaftVar.zzb)) {
            zzv(zzabcVar, zzd, i);
            int i4 = this.zzaa;
            zzu();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(zzaftVar.zzb)) {
            zzv(zzabcVar, zze, i);
            int i5 = this.zzaa;
            zzu();
            return i5;
        }
        zzace zzaceVar = zzaftVar.zzV;
        if (!this.zzac) {
            if (zzaftVar.zzg) {
                this.zzV &= -1073741825;
                if (!this.zzad) {
                    ((zzaar) zzabcVar).zzn(this.zzn.zzI(), 0, 1, false);
                    this.zzZ++;
                    if ((this.zzn.zzI()[0] & 128) == 128) {
                        throw zzcd.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzag = this.zzn.zzI()[0];
                    this.zzad = true;
                }
                byte b = this.zzag;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.zzV |= Ints.MAX_POWER_OF_TWO;
                    if (!this.zzah) {
                        ((zzaar) zzabcVar).zzn(this.zzs.zzI(), 0, 8, false);
                        this.zzZ += 8;
                        this.zzah = true;
                        this.zzn.zzI()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        this.zzn.zzG(0);
                        zzaceVar.zzr(this.zzn, 1, 1);
                        this.zzaa++;
                        this.zzs.zzG(0);
                        zzaceVar.zzr(this.zzs, 8, 1);
                        this.zzaa += 8;
                    }
                    if (i6 == 2) {
                        if (!this.zzae) {
                            ((zzaar) zzabcVar).zzn(this.zzn.zzI(), 0, 1, false);
                            this.zzZ++;
                            this.zzn.zzG(0);
                            this.zzaf = this.zzn.zzl();
                            this.zzae = true;
                        }
                        int i7 = this.zzaf * 4;
                        this.zzn.zzD(i7);
                        ((zzaar) zzabcVar).zzn(this.zzn.zzI(), 0, i7, false);
                        this.zzZ += i7;
                        int i8 = (this.zzaf >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzv;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.zzv = ByteBuffer.allocate(i9);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.zzaf;
                            if (i10 >= i2) {
                                break;
                            }
                            int iZzo = this.zzn.zzo();
                            if (i10 % 2 == 0) {
                                this.zzv.putShort((short) (iZzo - i11));
                            } else {
                                this.zzv.putInt(iZzo - i11);
                            }
                            i10++;
                            i11 = iZzo;
                        }
                        int i12 = (i - this.zzZ) - i11;
                        if ((i2 & 1) == 1) {
                            this.zzv.putInt(i12);
                        } else {
                            this.zzv.putShort((short) i12);
                            this.zzv.putInt(0);
                        }
                        this.zzt.zzE(this.zzv.array(), i9);
                        zzaceVar.zzr(this.zzt, i9, 1);
                        this.zzaa += i9;
                    }
                }
            } else {
                byte[] bArr = zzaftVar.zzh;
                if (bArr != null) {
                    this.zzq.zzE(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzaftVar.zzb) ? zzaftVar.zzf > 0 : z) {
                this.zzV |= DriveFile.MODE_READ_ONLY;
                this.zzu.zzD(0);
                int iZzd = (this.zzq.zzd() + i) - this.zzZ;
                this.zzn.zzD(4);
                this.zzn.zzI()[0] = (byte) ((iZzd >> 24) & 255);
                this.zzn.zzI()[1] = (byte) ((iZzd >> 16) & 255);
                this.zzn.zzI()[2] = (byte) ((iZzd >> 8) & 255);
                this.zzn.zzI()[3] = (byte) (iZzd & 255);
                zzaceVar.zzr(this.zzn, 4, 2);
                this.zzaa += 4;
            }
            this.zzac = true;
        }
        int iZzd2 = i + this.zzq.zzd();
        if (!"V_MPEG4/ISO/AVC".equals(zzaftVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzaftVar.zzb)) {
            if (zzaftVar.zzS != null) {
                zzdy.zzf(this.zzq.zzd() == 0);
                zzaftVar.zzS.zzd(zzabcVar);
            }
            while (true) {
                int i13 = this.zzZ;
                if (i13 >= iZzd2) {
                    break;
                }
                int iZzo2 = zzo(zzabcVar, zzaceVar, iZzd2 - i13);
                this.zzZ += iZzo2;
                this.zzaa += iZzo2;
            }
        } else {
            byte[] bArrZzI = this.zzm.zzI();
            bArrZzI[0] = 0;
            bArrZzI[1] = 0;
            bArrZzI[2] = 0;
            int i14 = zzaftVar.zzW;
            int i15 = 4 - i14;
            while (this.zzZ < iZzd2) {
                int i16 = this.zzab;
                if (i16 == 0) {
                    int iMin = Math.min(i14, this.zzq.zza());
                    ((zzaar) zzabcVar).zzn(bArrZzI, i15 + iMin, i14 - iMin, false);
                    if (iMin > 0) {
                        this.zzq.zzC(bArrZzI, i15, iMin);
                    }
                    this.zzZ += i14;
                    this.zzm.zzG(0);
                    this.zzab = this.zzm.zzo();
                    this.zzl.zzG(0);
                    zzacc.zzb(zzaceVar, this.zzl, 4);
                    this.zzaa += 4;
                } else {
                    int iZzo3 = zzo(zzabcVar, zzaceVar, i16);
                    this.zzZ += iZzo3;
                    this.zzaa += iZzo3;
                    this.zzab -= iZzo3;
                }
            }
        }
        if ("A_VORBIS".equals(zzaftVar.zzb)) {
            this.zzo.zzG(0);
            zzacc.zzb(zzaceVar, this.zzo, 4);
            this.zzaa += 4;
        }
        int i17 = this.zzaa;
        zzu();
        return i17;
    }

    private final int zzo(zzabc zzabcVar, zzace zzaceVar, int i) throws IOException {
        int iZza = this.zzq.zza();
        if (iZza <= 0) {
            return zzacc.zza(zzaceVar, zzabcVar, i, false);
        }
        int iMin = Math.min(i, iZza);
        zzacc.zzb(zzaceVar, this.zzq, iMin);
        return iMin;
    }

    private final long zzp(long j) throws zzcd {
        long j2 = this.zzy;
        if (j2 != -9223372036854775807L) {
            return zzfk.zzq(j, j2, 1000L);
        }
        throw zzcd.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzq(int i) throws zzcd {
        if (this.zzJ == null || this.zzK == null) {
            throw zzcd.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzr(int i) throws zzcd {
        if (this.zzB != null) {
            return;
        }
        throw zzcd.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    @RequiresNonNull({"#1.output"})
    private final void zzs(zzaft zzaftVar, long j, int i, int i2, int i3) {
        byte b;
        byte[] bArrZzw;
        int i4;
        int iZzd;
        zzacf zzacfVar = zzaftVar.zzS;
        if (zzacfVar != null) {
            zzacfVar.zzc(zzaftVar.zzV, j, i, i2, i3, zzaftVar.zzi);
        } else {
            if ("S_TEXT/UTF8".equals(zzaftVar.zzb) || "S_TEXT/ASS".equals(zzaftVar.zzb) || "S_TEXT/WEBVTT".equals(zzaftVar.zzb)) {
                if (this.zzR > 1) {
                    zzes.zzf("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.zzP;
                    if (j2 == -9223372036854775807L) {
                        zzes.zzf("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = zzaftVar.zzb;
                        byte[] bArrZzI = this.zzr.zzI();
                        int iHashCode = str.hashCode();
                        if (iHashCode != 738597099) {
                            if (iHashCode != 1045209816) {
                                if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                            } else if (str.equals("S_TEXT/WEBVTT")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (str.equals("S_TEXT/ASS")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        if (b == 0) {
                            bArrZzw = zzw(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                        } else if (b == 1) {
                            bArrZzw = zzw(j2, "%01d:%02d:%02d:%02d", WorkRequest.MIN_BACKOFF_MILLIS);
                            i4 = 21;
                        } else {
                            if (b != 2) {
                                throw new IllegalArgumentException();
                            }
                            bArrZzw = zzw(j2, "%02d:%02d:%02d.%03d", 1000L);
                            i4 = 25;
                        }
                        System.arraycopy(bArrZzw, 0, bArrZzI, i4, bArrZzw.length);
                        for (int iZzc = this.zzr.zzc(); iZzc < this.zzr.zzd(); iZzc++) {
                            if (this.zzr.zzI()[iZzc] == 0) {
                                this.zzr.zzF(iZzc);
                                break;
                            }
                        }
                        zzace zzaceVar = zzaftVar.zzV;
                        zzfb zzfbVar = this.zzr;
                        zzacc.zzb(zzaceVar, zzfbVar, zzfbVar.zzd());
                        iZzd = i2 + this.zzr.zzd();
                    }
                }
                iZzd = i2;
            } else {
                iZzd = i2;
            }
            if ((i & DriveFile.MODE_READ_ONLY) != 0) {
                if (this.zzR > 1) {
                    this.zzu.zzD(0);
                } else {
                    int iZzd2 = this.zzu.zzd();
                    zzaftVar.zzV.zzr(this.zzu, iZzd2, 2);
                    iZzd += iZzd2;
                }
            }
            zzaftVar.zzV.zzs(j, i, iZzd, i3, zzaftVar.zzi);
        }
        this.zzM = true;
    }

    private final void zzt(zzabc zzabcVar, int i) throws IOException {
        if (this.zzn.zzd() >= i) {
            return;
        }
        if (this.zzn.zzb() < i) {
            zzfb zzfbVar = this.zzn;
            int iZzb = zzfbVar.zzb();
            zzfbVar.zzA(Math.max(iZzb + iZzb, i));
        }
        ((zzaar) zzabcVar).zzn(this.zzn.zzI(), this.zzn.zzd(), i - this.zzn.zzd(), false);
        this.zzn.zzF(i);
    }

    private final void zzu() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzD(0);
    }

    private final void zzv(zzabc zzabcVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzr.zzb() < i2) {
            zzfb zzfbVar = this.zzr;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            zzfbVar.zzE(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzI(), 0, length);
        }
        ((zzaar) zzabcVar).zzn(this.zzr.zzI(), length, i, false);
        this.zzr.zzG(0);
        this.zzr.zzF(i2);
    }

    private static byte[] zzw(long j, String str, long j2) {
        zzdy.zzd(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        int i4 = zzfk.zza;
        return str2.getBytes(zzfqu.zzc);
    }

    private static int[] zzx(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzh.zzc(zzabcVar)) {
                for (int i = 0; i < this.zzj.size(); i++) {
                    zzaft zzaftVar = (zzaft) this.zzj.valueAt(i);
                    zzaftVar.zzV.getClass();
                    zzacf zzacfVar = zzaftVar.zzS;
                    if (zzacfVar != null) {
                        zzacfVar.zza(zzaftVar.zzV, zzaftVar.zzi);
                    }
                }
                return -1;
            }
            long jZzf = zzabcVar.zzf();
            if (this.zzF) {
                this.zzH = jZzf;
                zzabxVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            }
            if (this.zzC) {
                long j = this.zzH;
                if (j != -1) {
                    zzabxVar.zza = j;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzai = zzabeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzu();
        for (int i = 0; i < this.zzj.size(); i++) {
            zzacf zzacfVar = ((zzaft) this.zzj.valueAt(i)).zzS;
            if (zzacfVar != null) {
                zzacfVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        return new zzafv().zza(zzabcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:187:0x0311  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected final void zzh(int i) throws zzcd {
        int i2;
        int i3;
        zzaca zzabzVar;
        int i4;
        zzdy.zzb(this.zzai);
        byte b = 8;
        if (i == 160) {
            if (this.zzN != 2) {
                return;
            }
            zzaft zzaftVar = (zzaft) this.zzj.get(this.zzT);
            zzaftVar.zzV.getClass();
            if (this.zzY > 0 && "A_OPUS".equals(zzaftVar.zzb)) {
                zzfb zzfbVar = this.zzu;
                byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzY).array();
                zzfbVar.zzE(bArrArray, bArrArray.length);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.zzR; i6++) {
                i5 += this.zzS[i6];
            }
            int i7 = 0;
            while (i7 < this.zzR) {
                long j = ((long) ((zzaftVar.zze * i7) / 1000)) + this.zzO;
                int i8 = this.zzV;
                if (i7 == 0) {
                    if (!this.zzX) {
                        i8 |= 1;
                    }
                    i3 = i8;
                    i2 = 0;
                } else {
                    i2 = i7;
                    i3 = i8;
                }
                int i9 = this.zzS[i2];
                int i10 = i5 - i9;
                zzs(zzaftVar, j, i3, i9, i10);
                i7 = i2 + 1;
                i5 = i10;
            }
            this.zzN = 0;
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i11 = this.zzD;
                if (i11 != -1) {
                    long j2 = this.zzE;
                    if (j2 != -1) {
                        if (i11 == 475249515) {
                            this.zzG = j2;
                            return;
                        }
                        return;
                    }
                }
                throw zzcd.zza("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzr(i);
                zzaft zzaftVar2 = this.zzB;
                if (zzaftVar2.zzg) {
                    if (zzaftVar2.zzi == null) {
                        throw zzcd.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzaftVar2.zzk = new zzad(null, new zzac(zzo.zza, null, "video/webm", this.zzB.zzi.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzr(i);
                zzaft zzaftVar3 = this.zzB;
                if (zzaftVar3.zzg && zzaftVar3.zzh != null) {
                    throw zzcd.zza("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = 1000000L;
                }
                long j3 = this.zzz;
                if (j3 != -9223372036854775807L) {
                    this.zzA = zzp(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.zzj.size() == 0) {
                    throw zzcd.zza("No valid tracks were found", null);
                }
                this.zzai.zzC();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.zzC) {
                zzabe zzabeVar = this.zzai;
                zzet zzetVar = this.zzJ;
                zzet zzetVar2 = this.zzK;
                if (this.zzx == -1 || this.zzA == -9223372036854775807L || zzetVar == null || zzetVar.zza() == 0 || zzetVar2 == null || zzetVar2.zza() != zzetVar.zza()) {
                    zzabzVar = new zzabz(this.zzA, 0L);
                } else {
                    int iZza = zzetVar.zza();
                    int[] iArrCopyOf = new int[iZza];
                    long[] jArrCopyOf = new long[iZza];
                    long[] jArrCopyOf2 = new long[iZza];
                    long[] jArrCopyOf3 = new long[iZza];
                    for (int i12 = 0; i12 < iZza; i12++) {
                        jArrCopyOf3[i12] = zzetVar.zzb(i12);
                        jArrCopyOf[i12] = this.zzx + zzetVar2.zzb(i12);
                    }
                    int i13 = 0;
                    while (true) {
                        i4 = iZza - 1;
                        if (i13 >= i4) {
                            break;
                        }
                        int i14 = i13 + 1;
                        iArrCopyOf[i13] = (int) (jArrCopyOf[i14] - jArrCopyOf[i13]);
                        jArrCopyOf2[i13] = jArrCopyOf3[i14] - jArrCopyOf3[i13];
                        i13 = i14;
                    }
                    iArrCopyOf[i4] = (int) ((this.zzx + this.zzw) - jArrCopyOf[i4]);
                    long j4 = this.zzA - jArrCopyOf3[i4];
                    jArrCopyOf2[i4] = j4;
                    if (j4 <= 0) {
                        zzes.zzf("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i4);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i4);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i4);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i4);
                    }
                    zzabzVar = new zzaap(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                zzabeVar.zzN(zzabzVar);
                this.zzC = true;
            }
            this.zzJ = null;
            this.zzK = null;
            return;
        }
        zzaft zzaftVar4 = this.zzB;
        zzdy.zzb(zzaftVar4);
        String str = zzaftVar4.zzb;
        if (str == null) {
            throw zzcd.zza("CodecId is missing in TrackEntry element", null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    b = Ascii.ETB;
                } else {
                    b = -1;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    b = Ascii.DC2;
                } else {
                    b = -1;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    b = Ascii.FF;
                } else {
                    b = -1;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    b = Ascii.SO;
                } else {
                    b = -1;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    b = Ascii.SI;
                } else {
                    b = -1;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    b = 32;
                } else {
                    b = -1;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    b = Ascii.RS;
                } else {
                    b = -1;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    b = Ascii.NAK;
                } else {
                    b = -1;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    b = Ascii.CR;
                } else {
                    b = -1;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    b = Ascii.DLE;
                } else {
                    b = -1;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    b = Ascii.US;
                } else {
                    b = -1;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    b = Ascii.DC4;
                } else {
                    b = -1;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    b = Ascii.SUB;
                } else {
                    b = -1;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    b = Ascii.EM;
                } else {
                    b = -1;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    b = Ascii.CAN;
                } else {
                    b = -1;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    b = Ascii.FS;
                } else {
                    b = -1;
                }
                break;
            case 855502857:
                if (!str.equals("V_MPEGH/ISO/HEVC")) {
                    b = -1;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    b = Ascii.GS;
                } else {
                    b = -1;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    b = Ascii.ESC;
                } else {
                    b = -1;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    b = Ascii.SYN;
                } else {
                    b = -1;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    b = Ascii.VT;
                } else {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                zzaftVar4.zze(this.zzai, zzaftVar4.zzc);
                this.zzj.put(zzaftVar4.zzc, zzaftVar4);
                break;
        }
        this.zzB = null;
    }

    protected final void zzk(int i, long j, long j2) throws zzcd {
        zzdy.zzb(this.zzai);
        if (i == 160) {
            this.zzX = false;
            this.zzY = 0L;
            return;
        }
        if (i == 174) {
            this.zzB = new zzaft();
            return;
        }
        if (i == 187) {
            this.zzL = false;
            return;
        }
        if (i == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
            return;
        }
        if (i == 20533) {
            zzr(i);
            this.zzB.zzg = true;
            return;
        }
        if (i == 21968) {
            zzr(i);
            this.zzB.zzw = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzx;
            if (j3 != -1 && j3 != j) {
                throw zzcd.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j;
            this.zzw = j2;
            return;
        }
        if (i == 475249515) {
            this.zzJ = new zzet(32);
            this.zzK = new zzet(32);
        } else if (i == 524531317 && !this.zzC) {
            if (this.zzk && this.zzG != -1) {
                this.zzF = true;
            } else {
                this.zzai.zzN(new zzabz(this.zzA, 0L));
                this.zzC = true;
            }
        }
    }

    public zzafu(int i) {
        zzafn zzafnVar = new zzafn();
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzh = zzafnVar;
        zzafnVar.zza(new zzafs(this, null));
        this.zzk = true;
        this.zzi = new zzafw();
        this.zzj = new SparseArray();
        this.zzn = new zzfb(4);
        this.zzo = new zzfb(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzfb(4);
        this.zzl = new zzfb(zzfy.zza);
        this.zzm = new zzfb(4);
        this.zzq = new zzfb();
        this.zzr = new zzfb();
        this.zzs = new zzfb(8);
        this.zzt = new zzfb();
        this.zzu = new zzfb();
        this.zzS = new int[1];
    }

    protected final void zzl(int i, String str) throws zzcd {
        if (i == 134) {
            zzr(i);
            this.zzB.zzb = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzcd.zza("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            zzr(i);
            this.zzB.zza = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zzr(i);
            this.zzB.zzY = str;
        }
    }

    protected final void zzg(int i, int i2, zzabc zzabcVar) throws IOException {
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = 1;
        int i9 = 0;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (this.zzN != 2) {
                    return;
                }
                zzaft zzaftVar = (zzaft) this.zzj.get(this.zzT);
                if (this.zzW != 4 || !"V_VP9".equals(zzaftVar.zzb)) {
                    ((zzaar) zzabcVar).zzo(i2, false);
                    return;
                }
                this.zzu.zzD(i2);
                ((zzaar) zzabcVar).zzn(this.zzu.zzI(), 0, i2, false);
                return;
            }
            if (i7 == 16877) {
                zzr(i);
                zzaft zzaftVar2 = this.zzB;
                if (zzaftVar2.zzX != 1685485123 && zzaftVar2.zzX != 1685480259) {
                    ((zzaar) zzabcVar).zzo(i2, false);
                    return;
                }
                zzaftVar2.zzM = new byte[i2];
                ((zzaar) zzabcVar).zzn(zzaftVar2.zzM, 0, i2, false);
                return;
            }
            if (i7 == 16981) {
                zzr(i);
                zzaft zzaftVar3 = this.zzB;
                zzaftVar3.zzh = new byte[i2];
                ((zzaar) zzabcVar).zzn(zzaftVar3.zzh, 0, i2, false);
                return;
            }
            if (i7 == 18402) {
                byte[] bArr = new byte[i2];
                ((zzaar) zzabcVar).zzn(bArr, 0, i2, false);
                zzr(i);
                this.zzB.zzi = new zzacd(1, bArr, 0, 0);
                return;
            }
            if (i7 == 21419) {
                Arrays.fill(this.zzp.zzI(), (byte) 0);
                ((zzaar) zzabcVar).zzn(this.zzp.zzI(), 4 - i2, i2, false);
                this.zzp.zzG(0);
                this.zzD = (int) this.zzp.zzt();
                return;
            }
            if (i7 == 25506) {
                zzr(i);
                zzaft zzaftVar4 = this.zzB;
                zzaftVar4.zzj = new byte[i2];
                ((zzaar) zzabcVar).zzn(zzaftVar4.zzj, 0, i2, false);
                return;
            }
            if (i7 != 30322) {
                throw zzcd.zza("Unexpected id: " + i7, null);
            }
            zzr(i);
            zzaft zzaftVar5 = this.zzB;
            zzaftVar5.zzu = new byte[i2];
            ((zzaar) zzabcVar).zzn(zzaftVar5.zzu, 0, i2, false);
            return;
        }
        if (this.zzN == 0) {
            this.zzT = (int) this.zzi.zzd(zzabcVar, false, true, 8);
            this.zzU = this.zzi.zza();
            this.zzP = -9223372036854775807L;
            this.zzN = 1;
            this.zzn.zzD(0);
        }
        zzaft zzaftVar6 = (zzaft) this.zzj.get(this.zzT);
        if (zzaftVar6 == null) {
            ((zzaar) zzabcVar).zzo(i2 - this.zzU, false);
            this.zzN = 0;
            return;
        }
        zzaftVar6.zzV.getClass();
        if (this.zzN == 1) {
            zzt(zzabcVar, 3);
            int i10 = (this.zzn.zzI()[2] & 6) >> 1;
            if (i10 == 0) {
                this.zzR = 1;
                int[] iArrZzx = zzx(this.zzS, 1);
                this.zzS = iArrZzx;
                iArrZzx[0] = (i2 - this.zzU) - 3;
            } else {
                zzt(zzabcVar, 4);
                int i11 = (this.zzn.zzI()[3] & 255) + 1;
                this.zzR = i11;
                int[] iArrZzx2 = zzx(this.zzS, i11);
                this.zzS = iArrZzx2;
                if (i10 == 2) {
                    int i12 = (i2 - this.zzU) - 4;
                    int i13 = this.zzR;
                    Arrays.fill(iArrZzx2, 0, i13, i12 / i13);
                } else if (i10 == 1) {
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 4;
                    while (true) {
                        i3 = this.zzR - 1;
                        if (i14 >= i3) {
                            break;
                        }
                        this.zzS[i14] = 0;
                        do {
                            i16++;
                            zzt(zzabcVar, i16);
                            i4 = this.zzn.zzI()[i16 - 1] & 255;
                            int[] iArr = this.zzS;
                            i5 = iArr[i14] + i4;
                            iArr[i14] = i5;
                        } while (i4 == 255);
                        i15 += i5;
                        i14++;
                    }
                    this.zzS[i3] = ((i2 - this.zzU) - i16) - i15;
                } else {
                    if (i10 != 3) {
                        throw zzcd.zza("Unexpected lacing value: 2", null);
                    }
                    int i17 = 0;
                    int i18 = 4;
                    int i19 = 0;
                    while (true) {
                        int i20 = this.zzR - 1;
                        if (i17 >= i20) {
                            this.zzS[i20] = ((i2 - this.zzU) - i18) - i19;
                            break;
                        }
                        this.zzS[i17] = i9;
                        i18++;
                        zzt(zzabcVar, i18);
                        int i21 = i18 - 1;
                        if (this.zzn.zzI()[i21] == 0) {
                            throw zzcd.zza("No valid varint length mask found", null);
                        }
                        int i22 = 0;
                        while (true) {
                            if (i22 >= 8) {
                                j = 0;
                                break;
                            }
                            int i23 = i8 << (7 - i22);
                            if ((this.zzn.zzI()[i21] & i23) != 0) {
                                i18 += i22;
                                zzt(zzabcVar, i18);
                                j = this.zzn.zzI()[i21] & 255 & (i23 ^ (-1));
                                for (int i24 = i21 + 1; i24 < i18; i24++) {
                                    j = (j << 8) | ((long) (this.zzn.zzI()[i24] & 255));
                                }
                                if (i17 <= 0) {
                                    break;
                                }
                                j -= (1 << ((i22 * 7) + 6)) - 1;
                                break;
                            }
                            i22++;
                            i8 = 1;
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            throw zzcd.zza("EBML lacing sample size out of range.", null);
                        }
                        int[] iArr2 = this.zzS;
                        int i25 = (int) j;
                        if (i17 != 0) {
                            i25 += iArr2[i17 - 1];
                        }
                        iArr2[i17] = i25;
                        i19 += i25;
                        i17++;
                        i8 = 1;
                        i9 = 0;
                    }
                }
            }
            this.zzO = this.zzI + zzp((this.zzn.zzI()[0] << 8) | (this.zzn.zzI()[1] & 255));
            if (zzaftVar6.zzd == 2) {
                i6 = 1;
            } else {
                if (i7 == 163) {
                    if ((this.zzn.zzI()[2] & 128) == 128) {
                        i7 = 163;
                        i6 = 1;
                    } else {
                        i7 = 163;
                    }
                }
                i6 = 0;
            }
            this.zzV = i6;
            this.zzN = 2;
            this.zzQ = 0;
        }
        if (i7 == 163) {
            while (true) {
                int i26 = this.zzQ;
                if (i26 >= this.zzR) {
                    this.zzN = 0;
                    return;
                }
                zzs(zzaftVar6, ((long) ((this.zzQ * zzaftVar6.zze) / 1000)) + this.zzO, this.zzV, zzn(zzabcVar, zzaftVar6, this.zzS[i26], false), 0);
                this.zzQ++;
            }
        } else {
            while (true) {
                int i27 = this.zzQ;
                if (i27 >= this.zzR) {
                    return;
                }
                int[] iArr3 = this.zzS;
                iArr3[i27] = zzn(zzabcVar, zzaftVar6, iArr3[i27], true);
                this.zzQ++;
            }
        }
    }

    protected final void zzj(int i, long j) throws zzcd {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzcd.zza("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzcd.zza("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                zzr(i);
                this.zzB.zzd = (int) j;
                return;
            case 136:
                zzr(i);
                this.zzB.zzU = j == 1;
                return;
            case 155:
                this.zzP = zzp(j);
                return;
            case 159:
                zzr(i);
                this.zzB.zzN = (int) j;
                return;
            case 176:
                zzr(i);
                this.zzB.zzl = (int) j;
                return;
            case 179:
                zzq(i);
                this.zzJ.zzc(zzp(j));
                return;
            case 186:
                zzr(i);
                this.zzB.zzm = (int) j;
                return;
            case 215:
                zzr(i);
                this.zzB.zzc = (int) j;
                return;
            case 231:
                this.zzI = zzp(j);
                return;
            case 238:
                this.zzW = (int) j;
                return;
            case 241:
                if (this.zzL) {
                    return;
                }
                zzq(i);
                this.zzK.zzc(j);
                this.zzL = true;
                return;
            case 251:
                this.zzX = true;
                return;
            case 16871:
                zzr(i);
                this.zzB.zzX = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw zzcd.zza("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw zzcd.zza("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw zzcd.zza("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw zzcd.zza("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw zzcd.zza("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.zzE = j + this.zzx;
                return;
            case 21432:
                int i2 = (int) j;
                zzr(i);
                if (i2 == 0) {
                    this.zzB.zzv = 0;
                    return;
                }
                if (i2 == 1) {
                    this.zzB.zzv = 2;
                    return;
                } else if (i2 == 3) {
                    this.zzB.zzv = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.zzB.zzv = 3;
                    return;
                }
            case 21680:
                zzr(i);
                this.zzB.zzn = (int) j;
                return;
            case 21682:
                zzr(i);
                this.zzB.zzp = (int) j;
                return;
            case 21690:
                zzr(i);
                this.zzB.zzo = (int) j;
                return;
            case 21930:
                zzr(i);
                this.zzB.zzT = j == 1;
                return;
            case 21998:
                zzr(i);
                this.zzB.zzf = (int) j;
                return;
            case 22186:
                zzr(i);
                this.zzB.zzQ = j;
                return;
            case 22203:
                zzr(i);
                this.zzB.zzR = j;
                return;
            case 25188:
                zzr(i);
                this.zzB.zzO = (int) j;
                return;
            case 30114:
                this.zzY = j;
                return;
            case 30321:
                zzr(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.zzB.zzq = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzB.zzq = 1;
                    return;
                } else if (i3 == 2) {
                    this.zzB.zzq = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.zzB.zzq = 3;
                    return;
                }
            case 2352003:
                zzr(i);
                this.zzB.zze = (int) j;
                return;
            case 2807729:
                this.zzy = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        zzr(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.zzB.zzz = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.zzB.zzz = 1;
                            return;
                        }
                    case 21946:
                        zzr(i);
                        int iZzb = zzs.zzb((int) j);
                        if (iZzb != -1) {
                            this.zzB.zzy = iZzb;
                            return;
                        }
                        return;
                    case 21947:
                        zzr(i);
                        this.zzB.zzw = true;
                        int iZza = zzs.zza((int) j);
                        if (iZza != -1) {
                            this.zzB.zzx = iZza;
                            return;
                        }
                        return;
                    case 21948:
                        zzr(i);
                        this.zzB.zzA = (int) j;
                        return;
                    case 21949:
                        zzr(i);
                        this.zzB.zzB = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void zzi(int i, double d) throws zzcd {
        if (i == 181) {
            zzr(i);
            this.zzB.zzP = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzz = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzr(i);
                this.zzB.zzC = (float) d;
                break;
            case 21970:
                zzr(i);
                this.zzB.zzD = (float) d;
                break;
            case 21971:
                zzr(i);
                this.zzB.zzE = (float) d;
                break;
            case 21972:
                zzr(i);
                this.zzB.zzF = (float) d;
                break;
            case 21973:
                zzr(i);
                this.zzB.zzG = (float) d;
                break;
            case 21974:
                zzr(i);
                this.zzB.zzH = (float) d;
                break;
            case 21975:
                zzr(i);
                this.zzB.zzI = (float) d;
                break;
            case 21976:
                zzr(i);
                this.zzB.zzJ = (float) d;
                break;
            case 21977:
                zzr(i);
                this.zzB.zzK = (float) d;
                break;
            case 21978:
                zzr(i);
                this.zzB.zzL = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzr(i);
                        this.zzB.zzr = (float) d;
                        break;
                    case 30324:
                        zzr(i);
                        this.zzB.zzs = (float) d;
                        break;
                    case 30325:
                        zzr(i);
                        this.zzB.zzt = (float) d;
                        break;
                }
                break;
        }
    }
}
