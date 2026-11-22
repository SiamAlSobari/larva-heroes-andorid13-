package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.work.impl.Scheduler;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaft {
    public byte[] zzM;
    public zzacf zzS;
    public boolean zzT;
    public zzace zzV;
    public int zzW;
    private int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzacd zzi;
    public byte[] zzj;
    public zzad zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = 1000;
    public int zzB = Scheduler.MAX_GREEDY_SCHEDULER_LIMIT;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    private String zzY = "eng";

    protected zzaft() {
    }

    private static Pair zzf(zzfb zzfbVar) throws zzcd {
        try {
            zzfbVar.zzH(16);
            long jZzr = zzfbVar.zzr();
            if (jZzr == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzr == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzr != 826496599) {
                zzes.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzc = zzfbVar.zzc() + 20;
            byte[] bArrZzI = zzfbVar.zzI();
            while (true) {
                int length = bArrZzI.length;
                if (iZzc >= length - 4) {
                    throw zzcd.zza("Failed to find FourCC VC1 initialization data", null);
                }
                if (bArrZzI[iZzc] == 0 && bArrZzI[iZzc + 1] == 0 && bArrZzI[iZzc + 2] == 1 && bArrZzI[iZzc + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzI, iZzc, length)));
                }
                iZzc++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcd.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzcd {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzcd.zza("Error parsing vorbis codec private", null);
            }
            int i3 = 1;
            int i4 = 0;
            while (true) {
                i = bArr[i3] & 255;
                if (i != 255) {
                    break;
                }
                i3++;
                i4 += 255;
            }
            int i5 = i4 + i;
            int i6 = i3 + 1;
            int i7 = 0;
            while (true) {
                i2 = bArr[i6] & 255;
                if (i2 != 255) {
                    break;
                }
                i6++;
                i7 += 255;
            }
            int i8 = i6 + 1;
            int i9 = i7 + i2;
            if (bArr[i8] != 1) {
                throw zzcd.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i8, bArr2, 0, i5);
            int i10 = i8 + i5;
            if (bArr[i10] != 3) {
                throw zzcd.zza("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzcd.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcd.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzfb zzfbVar) throws zzcd {
        try {
            int iZzj = zzfbVar.zzj();
            if (iZzj == 1) {
                return true;
            }
            if (iZzj == 65534) {
                zzfbVar.zzG(24);
                if (zzfbVar.zzs() == zzafu.zzf.getMostSignificantBits() && zzfbVar.zzs() == zzafu.zzf.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcd.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzcd {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzcd.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x0195  */
    /* JADX WARN: Code duplicated, block: B:132:0x0253 A[PHI: r10
  0x0253: PHI (r10v8 int) = (r10v2 int), (r10v3 int), (r10v4 int), (r10v5 int), (r10v6 int), (r10v0 int) binds: [B:136:0x026f, B:130:0x023a, B:127:0x021c, B:125:0x0217, B:123:0x0212, B:116:0x01ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:174:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:179:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:180:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:184:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:190:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:193:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:197:0x0404  */
    /* JADX WARN: Code duplicated, block: B:200:0x0414  */
    /* JADX WARN: Code duplicated, block: B:203:0x041a  */
    /* JADX WARN: Code duplicated, block: B:205:0x0420  */
    /* JADX WARN: Code duplicated, block: B:225:0x04db  */
    /* JADX WARN: Code duplicated, block: B:227:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:230:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:235:0x050d  */
    /* JADX WARN: Code duplicated, block: B:254:0x0559  */
    /* JADX WARN: Code duplicated, block: B:256:0x0579  */
    /* JADX WARN: Code duplicated, block: B:258:0x057f  */
    /* JADX WARN: Code duplicated, block: B:274:0x05b3  */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    public final void zze(zzabe zzabeVar, int i) throws zzcd {
        byte b;
        List listSingletonList;
        List listZzg;
        String str;
        String str2;
        int i2;
        String str3;
        int i3;
        zzak zzakVar;
        int i4;
        float f;
        zzs zzsVar;
        byte[] bArr;
        int i5;
        int i6;
        int i7;
        zzaax zzaaxVarZza;
        String str4 = this.zzb;
        int i8 = 1;
        int iZzk = 4;
        int i9 = 0;
        int iIntValue = -1;
        switch (str4) {
            case "V_MPEG4/ISO/AP":
                b = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b = 4;
                break;
            case "A_MS/ACM":
                b = Ascii.ETB;
                break;
            case "A_TRUEHD":
                b = Ascii.DC2;
                break;
            case "A_VORBIS":
                b = Ascii.VT;
                break;
            case "A_MPEG/L2":
                b = Ascii.SO;
                break;
            case "A_MPEG/L3":
                b = Ascii.SI;
                break;
            case "V_MS/VFW/FOURCC":
                b = 9;
                break;
            case "S_DVBSUB":
                b = 32;
                break;
            case "V_MPEG4/ISO/ASP":
                b = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b = 7;
                break;
            case "S_VOBSUB":
                b = Ascii.RS;
                break;
            case "A_DTS/LOSSLESS":
                b = Ascii.NAK;
                break;
            case "A_AAC":
                b = Ascii.CR;
                break;
            case "A_AC3":
                b = Ascii.DLE;
                break;
            case "A_DTS":
                b = 19;
                break;
            case "V_AV1":
                b = 2;
                break;
            case "V_VP8":
                b = 0;
                break;
            case "V_VP9":
                b = 1;
                break;
            case "S_HDMV/PGS":
                b = Ascii.US;
                break;
            case "V_THEORA":
                b = 10;
                break;
            case "A_DTS/EXPRESS":
                b = Ascii.DC4;
                break;
            case "A_PCM/FLOAT/IEEE":
                b = Ascii.SUB;
                break;
            case "A_PCM/INT/BIG":
                b = Ascii.EM;
                break;
            case "A_PCM/INT/LIT":
                b = Ascii.CAN;
                break;
            case "S_TEXT/ASS":
                b = Ascii.FS;
                break;
            case "V_MPEGH/ISO/HEVC":
                b = 8;
                break;
            case "S_TEXT/WEBVTT":
                b = Ascii.GS;
                break;
            case "S_TEXT/UTF8":
                b = Ascii.ESC;
                break;
            case "V_MPEG2":
                b = 3;
                break;
            case "A_EAC3":
                b = 17;
                break;
            case "A_FLAC":
                b = Ascii.SYN;
                break;
            case "A_OPUS":
                b = Ascii.FF;
                break;
            default:
                b = -1;
                break;
        }
        String str5 = "audio/raw";
        switch (b) {
            case 0:
                str5 = "video/x-vnd.on2.vp8";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null && (zzaaxVarZza = zzaax.zza(new zzfb(this.zzM))) != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i10 = (z ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                } else if (zzcc.zzg(str3)) {
                    if (this.zzp == 0) {
                        i6 = this.zzn;
                        if (i6 == -1) {
                            i6 = this.zzl;
                        }
                        this.zzn = i6;
                        i7 = this.zzo;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzo = i7;
                    }
                    i4 = this.zzn;
                    if (i4 != -1 || (i5 = this.zzo) == -1) {
                        f = -1.0f;
                    } else {
                        f = (this.zzm * i4) / (this.zzl * i5);
                    }
                    if (this.zzw) {
                        if (this.zzC != -1.0f || this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzK + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzL + 0.5f));
                            byteBufferOrder.putShort((short) this.zzA);
                            byteBufferOrder.putShort((short) this.zzB);
                        }
                        zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                    } else {
                        zzsVar = null;
                    }
                    if (this.zza != null && zzafu.zzg.containsKey(this.zza)) {
                        iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                    }
                    if (this.zzq == 0 || Float.compare(this.zzr, 0.0f) != 0 || Float.compare(this.zzs, 0.0f) != 0) {
                        i9 = iIntValue;
                    } else if (Float.compare(this.zzt, 0.0f) != 0) {
                        if (Float.compare(this.zzt, 90.0f) == 0) {
                            i9 = 90;
                        } else if (Float.compare(this.zzt, -180.0f) == 0 || Float.compare(this.zzt, 180.0f) == 0) {
                            i9 = 180;
                        } else if (Float.compare(this.zzt, -90.0f) == 0) {
                            i9 = 270;
                        } else {
                            i9 = iIntValue;
                        }
                    }
                    zzakVar.zzX(this.zzl);
                    zzakVar.zzF(this.zzm);
                    zzakVar.zzP(f);
                    zzakVar.zzR(i9);
                    zzakVar.zzQ(this.zzu);
                    zzakVar.zzV(this.zzv);
                    zzakVar.zzy(zzsVar);
                    i8 = 2;
                } else {
                    if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzcd.zza("Unexpected MIME type.", null);
                    }
                    i8 = 3;
                }
                if (this.zza != null && !zzafu.zzg.containsKey(this.zza)) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i10);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY = zzakVar.zzY();
                zzace zzaceVarZzv = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv;
                zzaceVarZzv.zzk(zzamVarZzY);
                return;
            case 1:
                str5 = "video/x-vnd.on2.vp9";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z2 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i11 = (z2 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i11);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY2 = zzakVar.zzY();
                zzace zzaceVarZzv2 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv2;
                zzaceVarZzv2.zzk(zzamVarZzY2);
                return;
            case 2:
                str5 = "video/av01";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z3 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i12 = (z3 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i12);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY3 = zzakVar.zzY();
                zzace zzaceVarZzv3 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv3;
                zzaceVarZzv3.zzk(zzamVarZzY3);
                return;
            case 3:
                str5 = "video/mpeg2";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z4 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i13 = (z4 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i13);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY4 = zzakVar.zzY();
                zzace zzaceVarZzv4 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv4;
                zzaceVarZzv4.zzk(zzamVarZzY4);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr2 = this.zzj;
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str5 = "video/mp4v-es";
                listZzg = listSingletonList;
                i2 = -1;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z5 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i14 = (z5 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i14);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY5 = zzakVar.zzY();
                zzace zzaceVarZzv5 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv5;
                zzaceVarZzv5.zzk(zzamVarZzY5);
                return;
            case 7:
                zzaag zzaagVarZza = zzaag.zza(new zzfb(zzi(this.zzb)));
                listZzg = zzaagVarZza.zza;
                this.zzW = zzaagVarZza.zzb;
                str = zzaagVarZza.zzi;
                str5 = "video/avc";
                str2 = str;
                i2 = -1;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z6 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i15 = (z6 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i15);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY6 = zzakVar.zzY();
                zzace zzaceVarZzv6 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv6;
                zzaceVarZzv6.zzk(zzamVarZzY6);
                return;
            case 8:
                zzabr zzabrVarZza = zzabr.zza(new zzfb(zzi(this.zzb)));
                listZzg = zzabrVarZza.zza;
                this.zzW = zzabrVarZza.zzb;
                str = zzabrVarZza.zzg;
                str5 = "video/hevc";
                str2 = str;
                i2 = -1;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z7 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i16 = (z7 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i16);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY7 = zzakVar.zzY();
                zzace zzaceVarZzv7 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv7;
                zzaceVarZzv7.zzk(zzamVarZzY7);
                return;
            case 9:
                Pair pairZzf = zzf(new zzfb(zzi(this.zzb)));
                str5 = (String) pairZzf.first;
                listSingletonList = (List) pairZzf.second;
                listZzg = listSingletonList;
                i2 = -1;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z8 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i17 = (z8 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i17);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY8 = zzakVar.zzY();
                zzace zzaceVarZzv8 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv8;
                zzaceVarZzv8.zzk(zzamVarZzY8);
                return;
            case 10:
                str5 = "video/x-unknown";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z9 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i18 = (z9 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i18);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY9 = zzakVar.zzY();
                zzace zzaceVarZzv9 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv9;
                zzaceVarZzv9.zzk(zzamVarZzY9);
                return;
            case 11:
                str5 = "audio/vorbis";
                listZzg = zzg(zzi(str4));
                i2 = 8192;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z10 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i19 = (z10 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i19);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY10 = zzakVar.zzY();
                zzace zzaceVarZzv10 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv10;
                zzaceVarZzv10.zzk(zzamVarZzY10);
                return;
            case 12:
                ArrayList arrayList = new ArrayList(3);
                arrayList.add(zzi(this.zzb));
                arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzQ).array());
                arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzR).array());
                str5 = "audio/opus";
                listZzg = arrayList;
                i2 = 5760;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z11 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i110 = (z11 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i110);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY11 = zzakVar.zzY();
                zzace zzaceVarZzv11 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv11;
                zzaceVarZzv11.zzk(zzamVarZzY11);
                return;
            case 13:
                List listSingletonList2 = Collections.singletonList(zzi(str4));
                zzzy zzzyVarZza = zzzz.zza(this.zzj);
                this.zzP = zzzyVarZza.zza;
                this.zzN = zzzyVarZza.zzb;
                str5 = "audio/mp4a-latm";
                str2 = zzzyVarZza.zzc;
                iZzk = -1;
                listZzg = listSingletonList2;
                i2 = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z12 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i111 = (z12 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i111);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY12 = zzakVar.zzY();
                zzace zzaceVarZzv12 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv12;
                zzaceVarZzv12.zzk(zzamVarZzY12);
                return;
            case 14:
                str5 = "audio/mpeg-L2";
                i2 = 4096;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z13 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i112 = (z13 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i112);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY13 = zzakVar.zzY();
                zzace zzaceVarZzv13 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv13;
                zzaceVarZzv13.zzk(zzamVarZzY13);
                return;
            case 15:
                str5 = "audio/mpeg";
                i2 = 4096;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z14 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i113 = (z14 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i113);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY14 = zzakVar.zzY();
                zzace zzaceVarZzv14 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv14;
                zzaceVarZzv14.zzk(zzamVarZzY14);
                return;
            case 16:
                str5 = "audio/ac3";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z15 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i114 = (z15 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i114);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY15 = zzakVar.zzY();
                zzace zzaceVarZzv15 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv15;
                zzaceVarZzv15.zzk(zzamVarZzY15);
                return;
            case 17:
                str5 = "audio/eac3";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z16 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i115 = (z16 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i115);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY16 = zzakVar.zzY();
                zzace zzaceVarZzv16 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv16;
                zzaceVarZzv16.zzk(zzamVarZzY16);
                return;
            case 18:
                this.zzS = new zzacf();
                str5 = "audio/true-hd";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z17 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i116 = (z17 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i116);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY17 = zzakVar.zzY();
                zzace zzaceVarZzv17 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv17;
                zzaceVarZzv17.zzk(zzamVarZzY17);
                return;
            case 19:
            case 20:
                str5 = "audio/vnd.dts";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z18 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i117 = (z18 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i117);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY18 = zzakVar.zzY();
                zzace zzaceVarZzv18 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv18;
                zzaceVarZzv18.zzk(zzamVarZzY18);
                return;
            case 21:
                str5 = "audio/vnd.dts.hd";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z19 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i118 = (z19 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i118);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY19 = zzakVar.zzY();
                zzace zzaceVarZzv19 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv19;
                zzaceVarZzv19.zzk(zzamVarZzY19);
                return;
            case 22:
                listSingletonList = Collections.singletonList(zzi(str4));
                str5 = "audio/flac";
                listZzg = listSingletonList;
                i2 = -1;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z110 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i119 = (z110 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i119);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY110 = zzakVar.zzY();
                zzace zzaceVarZzv110 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv110;
                zzaceVarZzv110.zzk(zzamVarZzY110);
                return;
            case 23:
                if (zzh(new zzfb(zzi(this.zzb)))) {
                    iZzk = zzfk.zzk(this.zzO);
                    if (iZzk == 0) {
                        zzes.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    } else {
                        i2 = -1;
                        listZzg = null;
                        str2 = null;
                    }
                    if (this.zzM != null) {
                        str2 = zzaaxVarZza.zza;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z111 = this.zzU;
                    if (true != this.zzT) {
                        i3 = 0;
                    } else {
                        i3 = 2;
                    }
                    int i1110 = (z111 ? 1 : 0) | i3;
                    zzakVar = new zzak();
                    if (zzcc.zzf(str3)) {
                        if (zzcc.zzg(str3)) {
                            if (this.zzp == 0) {
                                i6 = this.zzn;
                                if (i6 == -1) {
                                    i6 = this.zzl;
                                }
                                this.zzn = i6;
                                i7 = this.zzo;
                                if (i7 == -1) {
                                    i7 = this.zzm;
                                }
                                this.zzo = i7;
                            }
                            i4 = this.zzn;
                            if (i4 != -1) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.zzw) {
                                if (this.zzC != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                            } else {
                                zzsVar = null;
                            }
                            if (this.zza != null) {
                                iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                            }
                            if (this.zzq == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            zzakVar.zzX(this.zzl);
                            zzakVar.zzF(this.zzm);
                            zzakVar.zzP(f);
                            zzakVar.zzR(i9);
                            zzakVar.zzQ(this.zzu);
                            zzakVar.zzV(this.zzv);
                            zzakVar.zzy(zzsVar);
                            i8 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i8 = 3;
                        }
                        break;
                    } else {
                        zzakVar.zzw(this.zzN);
                        zzakVar.zzT(this.zzP);
                        zzakVar.zzN(iZzk);
                    }
                    if (this.zza != null) {
                        zzakVar.zzJ(this.zza);
                    }
                    zzakVar.zzG(i);
                    zzakVar.zzS(str3);
                    zzakVar.zzL(i2);
                    zzakVar.zzK(this.zzY);
                    zzakVar.zzU(i1110);
                    zzakVar.zzI(listZzg);
                    zzakVar.zzx(str2);
                    zzakVar.zzB(this.zzk);
                    zzam zzamVarZzY111 = zzakVar.zzY();
                    zzace zzaceVarZzv111 = zzabeVar.zzv(this.zzc, i8);
                    this.zzV = zzaceVarZzv111;
                    zzaceVarZzv111.zzk(zzamVarZzY111);
                    return;
                }
                zzes.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                str5 = "audio/x-unknown";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z112 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1111 = (z112 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i1111);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY112 = zzakVar.zzY();
                zzace zzaceVarZzv112 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv112;
                zzaceVarZzv112.zzk(zzamVarZzY112);
                return;
            case 24:
                iZzk = zzfk.zzk(this.zzO);
                if (iZzk == 0) {
                    zzes.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    str5 = "audio/x-unknown";
                    i2 = -1;
                    listZzg = null;
                    str2 = null;
                    iZzk = -1;
                } else {
                    i2 = -1;
                    listZzg = null;
                    str2 = null;
                }
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z113 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1112 = (z113 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i1112);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY113 = zzakVar.zzY();
                zzace zzaceVarZzv113 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv113;
                zzaceVarZzv113.zzk(zzamVarZzY113);
                return;
            case 25:
                int i20 = this.zzO;
                if (i20 == 8) {
                    i2 = -1;
                    listZzg = null;
                    str2 = null;
                    iZzk = 3;
                } else {
                    if (i20 == 16) {
                        iZzk = DriveFile.MODE_READ_ONLY;
                    } else if (i20 == 24) {
                        iZzk = 1342177280;
                    } else if (i20 == 32) {
                        iZzk = 1610612736;
                    } else {
                        zzes.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i20 + ". Setting mimeType to audio/x-unknown");
                        str5 = "audio/x-unknown";
                        i2 = -1;
                        listZzg = null;
                        str2 = null;
                        iZzk = -1;
                    }
                    i2 = -1;
                    listZzg = null;
                    str2 = null;
                }
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z114 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1113 = (z114 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i1113);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY114 = zzakVar.zzY();
                zzace zzaceVarZzv114 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv114;
                zzaceVarZzv114.zzk(zzamVarZzY114);
                return;
            case 26:
                int i21 = this.zzO;
                if (i21 == 32) {
                    i2 = -1;
                    listZzg = null;
                    str2 = null;
                } else {
                    zzes.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i21 + ". Setting mimeType to audio/x-unknown");
                    str5 = "audio/x-unknown";
                    i2 = -1;
                    listZzg = null;
                    str2 = null;
                    iZzk = -1;
                }
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z115 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1114 = (z115 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i1114);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY115 = zzakVar.zzY();
                zzace zzaceVarZzv115 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv115;
                zzaceVarZzv115.zzk(zzamVarZzY115);
                return;
            case 27:
                str5 = "application/x-subrip";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z116 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1115 = (z116 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i1115);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY116 = zzakVar.zzY();
                zzace zzaceVarZzv116 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv116;
                zzaceVarZzv116.zzk(zzamVarZzY116);
                return;
            case 28:
                listZzg = zzfud.zzn(zzafu.zzc, zzi(this.zzb));
                str5 = "text/x-ssa";
                i2 = -1;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z117 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1116 = (z117 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i1116);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY117 = zzakVar.zzY();
                zzace zzaceVarZzv117 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv117;
                zzaceVarZzv117.zzk(zzamVarZzY117);
                return;
            case 29:
                str5 = "text/vtt";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z118 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1117 = (z118 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i1117);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY118 = zzakVar.zzY();
                zzace zzaceVarZzv118 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv118;
                zzaceVarZzv118.zzk(zzamVarZzY118);
                return;
            case 30:
                listSingletonList = zzfud.zzm(zzi(str4));
                str5 = "application/vobsub";
                listZzg = listSingletonList;
                i2 = -1;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z119 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1118 = (z119 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i1118);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY119 = zzakVar.zzY();
                zzace zzaceVarZzv119 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv119;
                zzaceVarZzv119.zzk(zzamVarZzY119);
                return;
            case 31:
                str5 = "application/pgs";
                i2 = -1;
                listZzg = null;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1110 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1119 = (z1110 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i1119);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY1110 = zzakVar.zzY();
                zzace zzaceVarZzv1110 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv1110;
                zzaceVarZzv1110.zzk(zzamVarZzY1110);
                return;
            case 32:
                byte[] bArr3 = new byte[4];
                System.arraycopy(zzi(str4), 0, bArr3, 0, 4);
                listSingletonList = zzfud.zzm(bArr3);
                str5 = "application/dvbsubs";
                listZzg = listSingletonList;
                i2 = -1;
                str2 = null;
                iZzk = -1;
                if (this.zzM != null) {
                    str2 = zzaaxVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1111 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i11110 = (z1111 ? 1 : 0) | i3;
                zzakVar = new zzak();
                if (zzcc.zzf(str3)) {
                    if (zzcc.zzg(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        }
                        i4 = this.zzn;
                        if (i4 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr);
                        } else {
                            zzsVar = null;
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzafu.zzg.get(this.zza)).intValue();
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzakVar.zzX(this.zzl);
                        zzakVar.zzF(this.zzm);
                        zzakVar.zzP(f);
                        zzakVar.zzR(i9);
                        zzakVar.zzQ(this.zzu);
                        zzakVar.zzV(this.zzv);
                        zzakVar.zzy(zzsVar);
                        i8 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzakVar.zzw(this.zzN);
                    zzakVar.zzT(this.zzP);
                    zzakVar.zzN(iZzk);
                }
                if (this.zza != null) {
                    zzakVar.zzJ(this.zza);
                }
                zzakVar.zzG(i);
                zzakVar.zzS(str3);
                zzakVar.zzL(i2);
                zzakVar.zzK(this.zzY);
                zzakVar.zzU(i11110);
                zzakVar.zzI(listZzg);
                zzakVar.zzx(str2);
                zzakVar.zzB(this.zzk);
                zzam zzamVarZzY1111 = zzakVar.zzY();
                zzace zzaceVarZzv1111 = zzabeVar.zzv(this.zzc, i8);
                this.zzV = zzaceVarZzv1111;
                zzaceVarZzv1111.zzk(zzamVarZzY1111);
                return;
            default:
                throw zzcd.zza("Unrecognized codec identifier.", null);
        }
    }
}
