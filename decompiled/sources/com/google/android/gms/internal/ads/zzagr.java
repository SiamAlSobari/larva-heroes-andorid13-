package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.core.internal.view.SupportMenu;
import androidx.work.WorkRequest;
import com.google.android.gms.drive.DriveFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzagr {
    private static final byte[] zza;

    static {
        int i = zzfk.zza;
        zza = "OpusHead".getBytes(zzfqu.zzc);
    }

    public static zzbz zza(zzagh zzaghVar) {
        zzfo zzfoVar;
        zzagi zzagiVarZzb = zzaghVar.zzb(1751411826);
        zzagi zzagiVarZzb2 = zzaghVar.zzb(1801812339);
        zzagi zzagiVarZzb3 = zzaghVar.zzb(1768715124);
        if (zzagiVarZzb == null || zzagiVarZzb2 == null || zzagiVarZzb3 == null || zzh(zzagiVarZzb.zza) != 1835299937) {
            return null;
        }
        zzfb zzfbVar = zzagiVarZzb2.zza;
        zzfbVar.zzG(12);
        int iZzf = zzfbVar.zzf();
        String[] strArr = new String[iZzf];
        for (int i = 0; i < iZzf; i++) {
            int iZzf2 = zzfbVar.zzf();
            zzfbVar.zzH(4);
            strArr[i] = zzfbVar.zzy(iZzf2 - 8, zzfqu.zzc);
        }
        zzfb zzfbVar2 = zzagiVarZzb3.zza;
        zzfbVar2.zzG(8);
        ArrayList arrayList = new ArrayList();
        while (zzfbVar2.zza() > 8) {
            int iZzc = zzfbVar2.zzc();
            int iZzf3 = zzfbVar2.zzf();
            int iZzf4 = zzfbVar2.zzf() - 1;
            if (iZzf4 < 0 || iZzf4 >= iZzf) {
                zzes.zzf("AtomParsers", "Skipped metadata with unknown key index: " + iZzf4);
            } else {
                String str = strArr[iZzf4];
                int i2 = iZzc + iZzf3;
                int i3 = zzagy.zzb;
                while (true) {
                    int iZzc2 = zzfbVar2.zzc();
                    if (iZzc2 >= i2) {
                        zzfoVar = null;
                        break;
                    }
                    int iZzf5 = zzfbVar2.zzf();
                    if (zzfbVar2.zzf() == 1684108385) {
                        int iZzf6 = zzfbVar2.zzf();
                        int iZzf7 = zzfbVar2.zzf();
                        int i4 = iZzf5 - 16;
                        byte[] bArr = new byte[i4];
                        zzfbVar2.zzC(bArr, 0, i4);
                        zzfoVar = new zzfo(str, bArr, iZzf7, iZzf6);
                        break;
                    }
                    zzfbVar2.zzG(iZzc2 + iZzf5);
                }
                if (zzfoVar != null) {
                    arrayList.add(zzfoVar);
                }
            }
            zzfbVar2.zzG(iZzc + iZzf3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbz(arrayList);
    }

    public static zzbz zzb(zzagi zzagiVar) {
        zzfb zzfbVar = zzagiVar.zza;
        zzfbVar.zzG(8);
        zzbz zzbzVar = new zzbz(-9223372036854775807L, new zzby[0]);
        while (zzfbVar.zza() >= 8) {
            int iZzc = zzfbVar.zzc();
            int iZzf = zzfbVar.zzf();
            int iZzf2 = zzfbVar.zzf();
            zzbz zzbzVar2 = null;
            if (iZzf2 == 1835365473) {
                zzfbVar.zzG(iZzc);
                int i = iZzc + iZzf;
                zzfbVar.zzH(8);
                zze(zzfbVar);
                while (zzfbVar.zzc() < i) {
                    int iZzc2 = zzfbVar.zzc();
                    int iZzf3 = zzfbVar.zzf();
                    if (zzfbVar.zzf() == 1768715124) {
                        zzfbVar.zzG(iZzc2);
                        int i2 = iZzc2 + iZzf3;
                        zzfbVar.zzH(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzfbVar.zzc() < i2) {
                            zzby zzbyVarZza = zzagy.zza(zzfbVar);
                            if (zzbyVarZza != null) {
                                arrayList.add(zzbyVarZza);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbzVar2 = new zzbz(arrayList);
                            break;
                        }
                        break;
                    }
                    zzfbVar.zzG(iZzc2 + iZzf3);
                }
                zzbzVar = zzbzVar.zzd(zzbzVar2);
            } else if (iZzf2 == 1936553057) {
                zzfbVar.zzG(iZzc);
                int i3 = iZzc + iZzf;
                zzfbVar.zzH(12);
                while (zzfbVar.zzc() < i3) {
                    int iZzc3 = zzfbVar.zzc();
                    int iZzf4 = zzfbVar.zzf();
                    if (zzfbVar.zzf() == 1935766900) {
                        if (iZzf4 < 14) {
                            break;
                        }
                        zzfbVar.zzH(5);
                        int iZzl = zzfbVar.zzl();
                        float f = 120.0f;
                        if (iZzl != 12) {
                            if (iZzl != 13) {
                                break;
                            }
                            break;
                        }
                        if (iZzl == 12) {
                            f = 240.0f;
                        }
                        zzfbVar.zzH(1);
                        zzbzVar2 = new zzbz(-9223372036854775807L, new zzafi(f, zzfbVar.zzl()));
                        break;
                    }
                    zzfbVar.zzG(iZzc3 + iZzf4);
                }
                zzbzVar = zzbzVar.zzd(zzbzVar2);
            } else if (iZzf2 == -1451722374) {
                zzbzVar = zzbzVar.zzd(zzl(zzfbVar));
            }
            zzfbVar.zzG(iZzc + iZzf);
        }
        return zzbzVar;
    }

    public static zzfu zzc(zzfb zzfbVar) {
        long jZzs;
        long jZzs2;
        zzfbVar.zzG(8);
        if (zzagj.zze(zzfbVar.zzf()) == 0) {
            jZzs = zzfbVar.zzt();
            jZzs2 = zzfbVar.zzt();
        } else {
            jZzs = zzfbVar.zzs();
            jZzs2 = zzfbVar.zzs();
        }
        return new zzfu(jZzs, jZzs2, zzfbVar.zzt());
    }

    /* JADX WARN: Code duplicated, block: B:371:0x0806  */
    /* JADX WARN: Code duplicated, block: B:386:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:388:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:389:0x08df  */
    /* JADX WARN: Code duplicated, block: B:391:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:394:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:396:0x0909  */
    /* JADX WARN: Code duplicated, block: B:398:0x0912  */
    /* JADX WARN: Code duplicated, block: B:399:0x091f  */
    /* JADX WARN: Code duplicated, block: B:402:0x0944  */
    /* JADX WARN: Code duplicated, block: B:403:0x0947  */
    /* JADX WARN: Code duplicated, block: B:406:0x0951  */
    /* JADX WARN: Code duplicated, block: B:407:0x0954  */
    /* JADX WARN: Code duplicated, block: B:410:0x096e  */
    /* JADX WARN: Code duplicated, block: B:411:0x0976  */
    /* JADX WARN: Code duplicated, block: B:413:0x0979  */
    /* JADX WARN: Code duplicated, block: B:415:0x0982  */
    /* JADX WARN: Code duplicated, block: B:416:0x0988  */
    /* JADX WARN: Code duplicated, block: B:417:0x098a  */
    /* JADX WARN: Code duplicated, block: B:421:0x0999  */
    /* JADX WARN: Code duplicated, block: B:445:0x0a3c A[PHI: r8
  0x0a3c: PHI (r8v33 int) = (r8v32 int), (r8v32 int), (r8v63 int), (r8v32 int) binds: [B:420:0x0997, B:427:0x09b1, B:444:0x0a3b, B:426:0x09af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:447:0x0a5b  */
    /* JADX WARN: Code duplicated, block: B:449:0x0a61  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a67 A[LOOP:11: B:448:0x0a5f->B:451:0x0a67, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:456:0x0aa6  */
    /* JADX WARN: Code duplicated, block: B:459:0x0aab A[ADDED_TO_REGION, LOOP:12: B:459:0x0aab->B:461:0x0aaf, LOOP_START, PHI: r14 r19 r21
  0x0aab: PHI (r14v36 int) = (r14v33 int), (r14v37 int) binds: [B:457:0x0aa8, B:461:0x0aaf] A[DONT_GENERATE, DONT_INLINE]
  0x0aab: PHI (r19v11 int) = (r19v9 int), (r19v15 int) binds: [B:457:0x0aa8, B:461:0x0aaf] A[DONT_GENERATE, DONT_INLINE]
  0x0aab: PHI (r21v15 int) = (r21v11 int), (r21v16 int) binds: [B:457:0x0aa8, B:461:0x0aaf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:460:0x0aad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:461:0x0aaf A[LOOP:12: B:459:0x0aab->B:461:0x0aaf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:467:0x0acb  */
    /* JADX WARN: Code duplicated, block: B:468:0x0acf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:471:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:472:0x0adb  */
    /* JADX WARN: Code duplicated, block: B:475:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:477:0x0ae9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:480:0x0afc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:481:0x0afe  */
    /* JADX WARN: Code duplicated, block: B:482:0x0b0e  */
    /* JADX WARN: Code duplicated, block: B:483:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:488:0x0b3d A[DONT_INVERT, LOOP:13: B:488:0x0b3d->B:492:0x0b47, LOOP_START, PHI: r21
  0x0b3d: PHI (r21v12 int) = (r21v11 int), (r21v13 int) binds: [B:487:0x0b3b, B:492:0x0b47] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:489:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0102  */
    /* JADX WARN: Code duplicated, block: B:492:0x0b47 A[LOOP:13: B:488:0x0b3d->B:492:0x0b47, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:493:0x0b4d A[EDGE_INSN: B:493:0x0b4d->B:494:0x0b4e BREAK  A[LOOP:13: B:488:0x0b3d->B:492:0x0b47]] */
    /* JADX WARN: Code duplicated, block: B:495:0x0b50 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:496:0x0b52 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:497:0x0b54 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:498:0x0b56 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:499:0x0b58 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:500:0x0b5a  */
    /* JADX WARN: Code duplicated, block: B:501:0x0b65  */
    /* JADX WARN: Code duplicated, block: B:502:0x0b6f  */
    /* JADX WARN: Code duplicated, block: B:503:0x0b7b  */
    /* JADX WARN: Code duplicated, block: B:504:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:505:0x0b96  */
    /* JADX WARN: Code duplicated, block: B:506:0x0ba3  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:510:0x0bed  */
    /* JADX WARN: Code duplicated, block: B:511:0x0bf0  */
    /* JADX WARN: Code duplicated, block: B:516:0x0c13  */
    /* JADX WARN: Code duplicated, block: B:517:0x0c2b  */
    /* JADX WARN: Code duplicated, block: B:519:0x0c2f  */
    /* JADX WARN: Code duplicated, block: B:51:0x010b  */
    /* JADX WARN: Code duplicated, block: B:536:0x0cc7  */
    /* JADX WARN: Code duplicated, block: B:538:0x0ccd  */
    /* JADX WARN: Code duplicated, block: B:540:0x0cd6  */
    /* JADX WARN: Code duplicated, block: B:543:0x0ce1 A[LOOP:5: B:541:0x0cde->B:543:0x0ce1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:545:0x0d12  */
    /* JADX WARN: Code duplicated, block: B:546:0x0d13 A[PHI: r7
  0x0d13: PHI (r7v72 int A[IMMUTABLE_TYPE]) = (r7v71 int), (r7v89 int) binds: [B:537:0x0ccb, B:545:0x0d12] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:548:0x0d18  */
    /* JADX WARN: Code duplicated, block: B:549:0x0d1a  */
    /* JADX WARN: Code duplicated, block: B:553:0x0d2f  */
    /* JADX WARN: Code duplicated, block: B:555:0x0d3a  */
    /* JADX WARN: Code duplicated, block: B:558:0x0d64  */
    /* JADX WARN: Code duplicated, block: B:563:0x0d76  */
    /* JADX WARN: Code duplicated, block: B:564:0x0d78  */
    /* JADX WARN: Code duplicated, block: B:566:0x0d7d  */
    /* JADX WARN: Code duplicated, block: B:570:0x0d9a  */
    /* JADX WARN: Code duplicated, block: B:571:0x0d9c  */
    /* JADX WARN: Code duplicated, block: B:574:0x0da1  */
    /* JADX WARN: Code duplicated, block: B:575:0x0da5  */
    /* JADX WARN: Code duplicated, block: B:577:0x0da9  */
    /* JADX WARN: Code duplicated, block: B:578:0x0dac  */
    /* JADX WARN: Code duplicated, block: B:57:0x011a  */
    /* JADX WARN: Code duplicated, block: B:581:0x0db1  */
    /* JADX WARN: Code duplicated, block: B:583:0x0db5  */
    /* JADX WARN: Code duplicated, block: B:584:0x0db9  */
    /* JADX WARN: Code duplicated, block: B:588:0x0dc6  */
    /* JADX WARN: Code duplicated, block: B:590:0x0dd0  */
    /* JADX WARN: Code duplicated, block: B:591:0x0de6  */
    /* JADX WARN: Code duplicated, block: B:594:0x0df2  */
    /* JADX WARN: Code duplicated, block: B:596:0x0e26  */
    /* JADX WARN: Code duplicated, block: B:599:0x0e2f  */
    /* JADX WARN: Code duplicated, block: B:601:0x0e35  */
    /* JADX WARN: Code duplicated, block: B:602:0x0e39  */
    /* JADX WARN: Code duplicated, block: B:610:0x0ea3  */
    /* JADX WARN: Code duplicated, block: B:618:0x0e9b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x0d90 A[EDGE_INSN: B:627:0x0d90->B:568:0x0d90 BREAK  A[LOOP:6: B:551:0x0d28->B:567:0x0d85], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x0d6f A[ADDED_TO_REGION, EDGE_INSN: B:630:0x0d6f->B:561:0x0d6f BREAK  A[LOOP:7: B:556:0x0d5e->B:560:0x0d69], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x0a8e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x0b32 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x0a84 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x0a7c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x0aba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x0b4d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0b45 A[SYNTHETIC] */
    public static List zzd(zzagh zzaghVar, zzabq zzabqVar, long j, zzad zzadVar, boolean z, boolean z2, zzfqw zzfqwVar) throws zzcd {
        int i;
        long j2;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        String str;
        int i5;
        zzagh zzaghVar2;
        long[] jArr;
        long[] jArr2;
        zzahg zzahgVar;
        Pair pairZzi;
        long j3;
        zzad zzadVarZzb;
        int i6;
        String str2;
        byte[] bArrZzs;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zzagn zzagnVar;
        boolean z3;
        String str3;
        long j4;
        zzfud zzfudVarZzm;
        long j5;
        zzahg zzahgVar2;
        ArrayList arrayList2;
        zzagh zzaghVarZza;
        zzagi zzagiVarZzb;
        zzagi zzagiVarZzb2;
        zzagm zzagpVar;
        int iZzb;
        zzagi zzagiVarZzb3;
        zzagi zzagiVar;
        boolean z4;
        zzfb zzfbVar;
        zzagi zzagiVarZzb4;
        zzfb zzfbVar2;
        zzagi zzagiVarZzb5;
        zzfb zzfbVar3;
        zzagk zzagkVar;
        int iZzo;
        int iZzo2;
        int iZzo3;
        int iZzo4;
        int iZzo5;
        int iZza;
        int iZzo6;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int i12;
        int[] iArrCopyOf2;
        zzahg zzahgVar3;
        int iZzf;
        int i13;
        int i14;
        int i15;
        int i16;
        int iZzo7;
        int i17;
        long j6;
        long j7;
        int i18;
        int i19;
        boolean z5;
        int i20;
        long j8;
        int[] iArr;
        long[] jArr3;
        long[] jArr4;
        int[] iArr2;
        String str4;
        long j9;
        boolean zZza;
        int i21;
        int iZzf2;
        int iZzc;
        int i22;
        int i23;
        int iZzo8;
        int i24;
        long jZzq;
        long[] jArr5;
        long[] jArr6;
        int length;
        boolean z6;
        int[] iArr3;
        int[] iArr4;
        long[] jArr7;
        int i25;
        int i26;
        boolean z7;
        int i27;
        long[] jArr8;
        int i28;
        long[] jArr9;
        int[] iArr5;
        int[] iArr6;
        boolean z8;
        boolean z9;
        long[] jArr10;
        int[] iArr7;
        int[] iArr8;
        long[] jArr11;
        int i29;
        int i30;
        long j10;
        zzahj zzahjVar;
        long j11;
        int i31;
        int i32;
        int[] iArr9;
        int[] iArr10;
        int i33;
        int i34;
        long jZzq2;
        int i35;
        long j12;
        int[] iArr11;
        int i36;
        int i37;
        int i38;
        int i39;
        boolean z10;
        long j13;
        int i40;
        long j14;
        ArrayList arrayList3 = new ArrayList();
        int i41 = 0;
        while (i41 < zzaghVar.zzc.size()) {
            zzagh zzaghVar3 = (zzagh) zzaghVar.zzc.get(i41);
            if (zzaghVar3.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i = i41;
            } else {
                zzagi zzagiVarZzb6 = zzaghVar.zzb(1836476516);
                zzagiVarZzb6.getClass();
                zzagh zzaghVarZza2 = zzaghVar3.zza(1835297121);
                zzaghVarZza2.getClass();
                zzagi zzagiVarZzb7 = zzaghVarZza2.zzb(1751411826);
                zzagiVarZzb7.getClass();
                int iZzf3 = zzf(zzh(zzagiVarZzb7.zza));
                String str5 = "AtomParsers";
                i = i41;
                if (iZzf3 == -1) {
                    str = "AtomParsers";
                    zzaghVar2 = zzaghVar3;
                    arrayList = arrayList3;
                    i5 = -1;
                } else {
                    zzagi zzagiVarZzb8 = zzaghVar3.zzb(1953196132);
                    zzagiVarZzb8.getClass();
                    zzfb zzfbVar4 = zzagiVarZzb8.zza;
                    zzfbVar4.zzG(8);
                    int iZze = zzagj.zze(zzfbVar4.zzf());
                    zzfbVar4.zzH(iZze != 0 ? 16 : 8);
                    int iZzf4 = zzfbVar4.zzf();
                    zzfbVar4.zzH(4);
                    int iZzc2 = zzfbVar4.zzc();
                    int i42 = 0;
                    while (true) {
                        int i43 = iZze == 0 ? 4 : 8;
                        if (i42 >= i43) {
                            zzfbVar4.zzH(i43);
                        } else {
                            if (zzfbVar4.zzI()[iZzc2 + i42] != -1) {
                                long jZzt = iZze == 0 ? zzfbVar4.zzt() : zzfbVar4.zzu();
                                if (jZzt != 0) {
                                    j2 = jZzt;
                                    break;
                                }
                                break;
                            }
                            i42++;
                        }
                        j2 = -9223372036854775807L;
                        break;
                    }
                    zzfbVar4.zzH(16);
                    int iZzf5 = zzfbVar4.zzf();
                    int iZzf6 = zzfbVar4.zzf();
                    zzfbVar4.zzH(4);
                    int iZzf7 = zzfbVar4.zzf();
                    int iZzf8 = zzfbVar4.zzf();
                    int i44 = 65536;
                    if (iZzf5 != 0) {
                        if (iZzf5 == 0) {
                            i44 = iZzf7;
                            i2 = iZzf6;
                            i3 = iZzf5;
                        } else if (iZzf6 == -65536) {
                            if (iZzf7 == 65536) {
                                i44 = iZzf7;
                            } else if (iZzf8 == 0) {
                                i4 = 270;
                            }
                            i3 = 0;
                            i2 = SupportMenu.CATEGORY_MASK;
                        } else {
                            i44 = iZzf7;
                            i2 = iZzf6;
                            i3 = 0;
                        }
                        if (i3 != -65536 && i2 == 0 && i44 == 0 && iZzf8 == -65536) {
                            i4 = 180;
                        } else {
                            i4 = 0;
                        }
                    } else {
                        if (iZzf6 == 65536) {
                            if (iZzf7 != -65536) {
                                iZzf6 = 65536;
                            } else if (iZzf8 == 0) {
                                i4 = 90;
                            } else {
                                iZzf6 = 65536;
                                iZzf7 = SupportMenu.CATEGORY_MASK;
                            }
                        }
                        iZzf5 = 0;
                        if (iZzf5 == 0) {
                            i44 = iZzf7;
                            i2 = iZzf6;
                            i3 = iZzf5;
                        } else if (iZzf6 == -65536) {
                            if (iZzf7 == 65536) {
                                i44 = iZzf7;
                            } else if (iZzf8 == 0) {
                                i4 = 270;
                            }
                            i3 = 0;
                            i2 = SupportMenu.CATEGORY_MASK;
                        } else {
                            i44 = iZzf7;
                            i2 = iZzf6;
                            i3 = 0;
                        }
                        if (i3 != -65536) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                    }
                    zzagq zzagqVar = new zzagq(iZzf4, j2, i4);
                    long j15 = j == -9223372036854775807L ? zzagqVar.zzb : j;
                    long j16 = zzc(zzagiVarZzb6.zza).zzc;
                    long jZzq3 = j15 != -9223372036854775807L ? zzfk.zzq(j15, 1000000L, j16) : -9223372036854775807L;
                    zzagh zzaghVarZza3 = zzaghVarZza2.zza(1835626086);
                    zzaghVarZza3.getClass();
                    zzagh zzaghVarZza4 = zzaghVarZza3.zza(1937007212);
                    zzaghVarZza4.getClass();
                    zzagi zzagiVarZzb9 = zzaghVarZza2.zzb(1835296868);
                    zzagiVarZzb9.getClass();
                    Pair pairZzj = zzj(zzagiVarZzb9.zza);
                    zzagi zzagiVarZzb10 = zzaghVarZza4.zzb(1937011556);
                    if (zzagiVarZzb10 == null) {
                        throw zzcd.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    zzfb zzfbVar5 = zzagiVarZzb10.zza;
                    int i45 = zzagqVar.zza;
                    int i46 = zzagqVar.zzc;
                    String str6 = (String) pairZzj.second;
                    zzfbVar5.zzG(12);
                    int iZzf9 = zzfbVar5.zzf();
                    zzagn zzagnVar2 = new zzagn(iZzf9);
                    arrayList = arrayList3;
                    int i47 = 0;
                    while (i47 < iZzf9) {
                        int i48 = iZzf9;
                        int iZzc3 = zzfbVar5.zzc();
                        int iZzf10 = zzfbVar5.zzf();
                        zzabf.zzb(iZzf10 > 0, "childAtomSize must be positive");
                        int iZzf11 = zzfbVar5.zzf();
                        Pair pair = pairZzj;
                        if (iZzf11 == 1635148593 || iZzf11 == 1635148595 || iZzf11 == 1701733238 || iZzf11 == 1831958048 || iZzf11 == 1836070006 || iZzf11 == 1752589105 || iZzf11 == 1751479857 || iZzf11 == 1932670515 || iZzf11 == 1211250227 || iZzf11 == 1987063864 || iZzf11 == 1987063865 || iZzf11 == 1635135537 || iZzf11 == 1685479798 || iZzf11 == 1685479729 || iZzf11 == 1685481573 || iZzf11 == 1685481521) {
                            str6 = str6;
                            int i49 = i45;
                            j3 = j16;
                            iZzf3 = iZzf3;
                            zzaghVar3 = zzaghVar3;
                            zzagqVar = zzagqVar;
                            int i50 = i46;
                            String str7 = str5;
                            pair = pair;
                            zzfbVar5 = zzfbVar5;
                            zzfbVar5.zzG(iZzc3 + 16);
                            zzfbVar5.zzH(16);
                            int iZzp = zzfbVar5.zzp();
                            int iZzp2 = zzfbVar5.zzp();
                            zzfbVar5.zzH(50);
                            int iZzc4 = zzfbVar5.zzc();
                            if (iZzf11 == 1701733238) {
                                Pair pairZzk = zzk(zzfbVar5, iZzc3, iZzf10);
                                if (pairZzk != null) {
                                    int iIntValue = ((Integer) pairZzk.first).intValue();
                                    zzadVarZzb = zzadVar == null ? null : zzadVar.zzb(((zzahh) pairZzk.second).zzb);
                                    zzagnVar2.zza[i47] = (zzahh) pairZzk.second;
                                    iZzf11 = iIntValue;
                                } else {
                                    zzadVarZzb = zzadVar;
                                    iZzf11 = 1701733238;
                                }
                                zzfbVar5.zzG(iZzc4);
                            } else {
                                zzadVarZzb = zzadVar;
                            }
                            if (iZzf11 == 1831958048) {
                                i6 = iZzf11;
                                str2 = "video/mpeg";
                            } else {
                                i6 = 1211250227;
                                if (iZzf11 == 1211250227) {
                                    str2 = "video/3gpp";
                                } else {
                                    i6 = iZzf11;
                                    str2 = null;
                                }
                            }
                            int i51 = iZzc4;
                            zzad zzadVar2 = zzadVarZzb;
                            i47 = i47;
                            int iZzb2 = -1;
                            byte[] bArr = null;
                            String str8 = null;
                            float fZzo = 1.0f;
                            int i52 = -1;
                            ByteBuffer byteBufferZzn = null;
                            zzagl zzaglVar = null;
                            List listZzm = null;
                            int i53 = -1;
                            int i54 = -1;
                            String str9 = str2;
                            boolean z11 = false;
                            while (true) {
                                if (i51 - iZzc3 >= iZzf10) {
                                    bArrZzs = bArr;
                                    break;
                                }
                                zzfbVar5.zzG(i51);
                                int iZzc5 = zzfbVar5.zzc();
                                int iZzf12 = zzfbVar5.zzf();
                                if (iZzf12 == 0) {
                                    bArrZzs = bArr;
                                    if (zzfbVar5.zzc() - iZzc3 == iZzf10) {
                                        break;
                                    }
                                    i8 = 0;
                                } else {
                                    bArrZzs = bArr;
                                    i8 = iZzf12;
                                }
                                zzabf.zzb(i8 > 0, "childAtomSize must be positive");
                                int iZzf13 = zzfbVar5.zzf();
                                if (iZzf13 == 1635148611) {
                                    zzabf.zzb(str9 == null, null);
                                    zzfbVar5.zzG(iZzc5 + 8);
                                    zzaag zzaagVarZza = zzaag.zza(zzfbVar5);
                                    List list = zzaagVarZza.zza;
                                    zzagnVar2.zzc = zzaagVarZza.zzb;
                                    if (!z11) {
                                        fZzo = zzaagVarZza.zzh;
                                    }
                                    String str10 = zzaagVarZza.zzi;
                                    int i55 = zzaagVarZza.zze;
                                    i9 = iZzp;
                                    i10 = iZzp2;
                                    listZzm = list;
                                    i11 = i6;
                                    i54 = zzaagVarZza.zzf;
                                    str9 = "video/avc";
                                    zzagnVar = zzagnVar2;
                                    i52 = i55;
                                    str8 = str10;
                                    iZzb2 = zzaagVarZza.zzg;
                                } else if (iZzf13 == 1752589123) {
                                    zzabf.zzb(str9 == null, null);
                                    zzfbVar5.zzG(iZzc5 + 8);
                                    zzabr zzabrVarZza = zzabr.zza(zzfbVar5);
                                    List list2 = zzabrVarZza.zza;
                                    zzagnVar2.zzc = zzabrVarZza.zzb;
                                    if (!z11) {
                                        fZzo = zzabrVarZza.zzf;
                                    }
                                    String str11 = zzabrVarZza.zzg;
                                    listZzm = list2;
                                    i9 = iZzp;
                                    i10 = iZzp2;
                                    i11 = i6;
                                    i52 = zzabrVarZza.zzc;
                                    i54 = zzabrVarZza.zzd;
                                    zzagnVar = zzagnVar2;
                                    iZzb2 = zzabrVarZza.zze;
                                    str8 = str11;
                                    str9 = "video/hevc";
                                } else {
                                    if (iZzf13 == 1685480259 || iZzf13 == 1685485123) {
                                        i9 = iZzp;
                                        z11 = z11;
                                        i10 = iZzp2;
                                        i11 = i6;
                                        str8 = str8;
                                        fZzo = fZzo;
                                        zzagnVar = zzagnVar2;
                                        str7 = str7;
                                        zzaax zzaaxVarZza = zzaax.zza(zzfbVar5);
                                        if (zzaaxVarZza != null) {
                                            str8 = zzaaxVarZza.zza;
                                            str9 = "video/dolby-vision";
                                            z11 = z11;
                                            fZzo = fZzo;
                                        } else {
                                            z11 = z11;
                                            fZzo = fZzo;
                                            str8 = str8;
                                        }
                                    } else if (iZzf13 == 1987076931) {
                                        zzabf.zzb(str9 == null, null);
                                        zzfbVar5.zzG(iZzc5 + 12);
                                        zzfbVar5.zzH(2);
                                        int iZzl = zzfbVar5.zzl() & 1;
                                        int iZzl2 = zzfbVar5.zzl();
                                        int iZzl3 = zzfbVar5.zzl();
                                        int iZza2 = zzs.zza(iZzl2);
                                        int i56 = 1 != iZzl ? 2 : 1;
                                        int iZzb3 = zzs.zzb(iZzl3);
                                        i54 = i56;
                                        i9 = iZzp;
                                        i10 = iZzp2;
                                        i11 = i6;
                                        str9 = i6 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                        zzagnVar = zzagnVar2;
                                        str7 = str7;
                                        i52 = iZza2;
                                        iZzb2 = iZzb3;
                                    } else {
                                        if (iZzf13 == 1635135811) {
                                            zzabf.zzb(str9 == null, null);
                                            str9 = "video/av01";
                                        } else if (iZzf13 == 1668050025) {
                                            if (byteBufferZzn == null) {
                                                byteBufferZzn = zzn();
                                            }
                                            ByteBuffer byteBuffer = byteBufferZzn;
                                            byteBuffer.position(21);
                                            byteBuffer.putShort(zzfbVar5.zzz());
                                            byteBuffer.putShort(zzfbVar5.zzz());
                                            byteBufferZzn = byteBuffer;
                                        } else {
                                            if (iZzf13 == 1835295606) {
                                                if (byteBufferZzn == null) {
                                                    byteBufferZzn = zzn();
                                                }
                                                ByteBuffer byteBuffer2 = byteBufferZzn;
                                                short sZzz = zzfbVar5.zzz();
                                                short sZzz2 = zzfbVar5.zzz();
                                                z11 = z11;
                                                short sZzz3 = zzfbVar5.zzz();
                                                i11 = i6;
                                                short sZzz4 = zzfbVar5.zzz();
                                                zzagnVar = zzagnVar2;
                                                short sZzz5 = zzfbVar5.zzz();
                                                fZzo = fZzo;
                                                short sZzz6 = zzfbVar5.zzz();
                                                i10 = iZzp2;
                                                short sZzz7 = zzfbVar5.zzz();
                                                i9 = iZzp;
                                                short sZzz8 = zzfbVar5.zzz();
                                                long jZzt2 = zzfbVar5.zzt();
                                                long jZzt3 = zzfbVar5.zzt();
                                                str8 = str8;
                                                byteBuffer2.position(1);
                                                byteBuffer2.putShort(sZzz5);
                                                byteBuffer2.putShort(sZzz6);
                                                byteBuffer2.putShort(sZzz);
                                                byteBuffer2.putShort(sZzz2);
                                                byteBuffer2.putShort(sZzz3);
                                                byteBuffer2.putShort(sZzz4);
                                                byteBuffer2.putShort(sZzz7);
                                                byteBuffer2.putShort(sZzz8);
                                                byteBuffer2.putShort((short) (jZzt2 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                byteBuffer2.putShort((short) (jZzt3 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                byteBufferZzn = byteBuffer2;
                                            } else {
                                                i9 = iZzp;
                                                z11 = z11;
                                                i10 = iZzp2;
                                                i11 = i6;
                                                str8 = str8;
                                                fZzo = fZzo;
                                                zzagnVar = zzagnVar2;
                                                if (iZzf13 == 1681012275) {
                                                    zzabf.zzb(str9 == null, null);
                                                    str9 = "video/3gpp";
                                                } else if (iZzf13 == 1702061171) {
                                                    zzabf.zzb(str9 == null, null);
                                                    zzagl zzaglVarZzm = zzm(zzfbVar5, iZzc5);
                                                    String str12 = zzaglVarZzm.zza;
                                                    byte[] bArr2 = zzaglVarZzm.zzb;
                                                    if (bArr2 != null) {
                                                        zzaglVar = zzaglVarZzm;
                                                        str9 = str12;
                                                        listZzm = zzfud.zzm(bArr2);
                                                    } else {
                                                        zzaglVar = zzaglVarZzm;
                                                        str9 = str12;
                                                    }
                                                } else if (iZzf13 == 1885434736) {
                                                    zzfbVar5.zzG(iZzc5 + 8);
                                                    fZzo = zzfbVar5.zzo() / zzfbVar5.zzo();
                                                    str7 = str7;
                                                    str8 = str8;
                                                    z11 = true;
                                                } else if (iZzf13 == 1937126244) {
                                                    bArrZzs = zzs(zzfbVar5, iZzc5, i8);
                                                } else if (iZzf13 == 1936995172) {
                                                    int iZzl4 = zzfbVar5.zzl();
                                                    zzfbVar5.zzH(3);
                                                    if (iZzl4 == 0) {
                                                        int iZzl5 = zzfbVar5.zzl();
                                                        if (iZzl5 == 0) {
                                                            z11 = z11;
                                                            str7 = str7;
                                                            fZzo = fZzo;
                                                            str8 = str8;
                                                            i53 = 0;
                                                        } else if (iZzl5 == 1) {
                                                            z11 = z11;
                                                            str7 = str7;
                                                            fZzo = fZzo;
                                                            str8 = str8;
                                                            i53 = 1;
                                                        } else if (iZzl5 == 2) {
                                                            z11 = z11;
                                                            str7 = str7;
                                                            fZzo = fZzo;
                                                            str8 = str8;
                                                            i53 = 2;
                                                        } else if (iZzl5 == 3) {
                                                            z11 = z11;
                                                            str7 = str7;
                                                            fZzo = fZzo;
                                                            str8 = str8;
                                                            i53 = 3;
                                                        }
                                                    }
                                                    str7 = str7;
                                                    z11 = z11;
                                                    fZzo = fZzo;
                                                    str8 = str8;
                                                } else {
                                                    if (iZzf13 == 1668246642 && i52 == -1) {
                                                        if (iZzb2 == -1) {
                                                            int iZzf14 = zzfbVar5.zzf();
                                                            if (iZzf14 == 1852009592 || iZzf14 == 1852009571) {
                                                                str7 = str7;
                                                                int iZzp3 = zzfbVar5.zzp();
                                                                int iZzp4 = zzfbVar5.zzp();
                                                                zzfbVar5.zzH(2);
                                                                if (i8 == 19) {
                                                                    z3 = (zzfbVar5.zzl() & 128) != 0;
                                                                    i8 = 19;
                                                                } else {
                                                                    z3 = false;
                                                                }
                                                                int iZza3 = zzs.zza(iZzp3);
                                                                int i57 = true != z3 ? 2 : 1;
                                                                i52 = iZza3;
                                                                iZzb2 = zzs.zzb(iZzp4);
                                                                i54 = i57;
                                                            } else {
                                                                str7 = str7;
                                                                zzes.zzf(str7, "Unsupported color type: ".concat(zzagj.zzf(iZzf14)));
                                                                iZzb2 = -1;
                                                            }
                                                        } else {
                                                            str7 = str7;
                                                        }
                                                        i52 = -1;
                                                    } else {
                                                        str7 = str7;
                                                    }
                                                    z11 = z11;
                                                    fZzo = fZzo;
                                                    str8 = str8;
                                                }
                                            }
                                            z11 = z11;
                                            fZzo = fZzo;
                                            str8 = str8;
                                        }
                                        i9 = iZzp;
                                        i10 = iZzp2;
                                        i11 = i6;
                                        zzagnVar = zzagnVar2;
                                    }
                                    i51 += i8;
                                    str7 = str7;
                                    iZzc3 = iZzc3;
                                    bArr = bArrZzs;
                                    iZzf10 = iZzf10;
                                    i6 = i11;
                                    zzagnVar2 = zzagnVar;
                                    iZzp2 = i10;
                                    iZzp = i9;
                                }
                                i51 += i8;
                                str7 = str7;
                                iZzc3 = iZzc3;
                                bArr = bArrZzs;
                                iZzf10 = iZzf10;
                                i6 = i11;
                                zzagnVar2 = zzagnVar;
                                iZzp2 = i10;
                                iZzp = i9;
                            }
                            String str13 = str8;
                            float f = fZzo;
                            zzagn zzagnVar3 = zzagnVar2;
                            str5 = str7;
                            if (str9 == null) {
                                i45 = i49;
                                i46 = i50;
                                zzagnVar2 = zzagnVar3;
                            } else {
                                zzak zzakVar = new zzak();
                                i45 = i49;
                                zzakVar.zzG(i45);
                                zzakVar.zzS(str9);
                                zzakVar.zzx(str13);
                                zzakVar.zzX(iZzp);
                                zzakVar.zzF(iZzp2);
                                zzakVar.zzP(f);
                                i46 = i50;
                                zzakVar.zzR(i46);
                                zzakVar.zzQ(bArrZzs);
                                zzakVar.zzV(i53);
                                zzakVar.zzI(listZzm);
                                zzakVar.zzB(zzadVar2);
                                int i58 = i54;
                                if (i52 == -1) {
                                    if (i58 == -1) {
                                        if (iZzb2 == -1) {
                                            if (byteBufferZzn != null) {
                                                i58 = -1;
                                                iZzb2 = -1;
                                            }
                                            if (zzaglVar != null) {
                                                zzakVar.zzv(zzfwl.zzc(zzaglVar.zzc));
                                                zzakVar.zzO(zzfwl.zzc(zzaglVar.zzd));
                                            }
                                            zzagnVar2 = zzagnVar3;
                                            zzagnVar2.zzb = zzakVar.zzY();
                                        } else {
                                            i58 = -1;
                                        }
                                    }
                                    i7 = -1;
                                } else {
                                    i7 = i52;
                                }
                                zzakVar.zzy(new zzs(i7, i58, iZzb2, byteBufferZzn != null ? byteBufferZzn.array() : null));
                                if (zzaglVar != null) {
                                    zzakVar.zzv(zzfwl.zzc(zzaglVar.zzc));
                                    zzakVar.zzO(zzfwl.zzc(zzaglVar.zzd));
                                }
                                zzagnVar2 = zzagnVar3;
                                zzagnVar2.zzb = zzakVar.zzY();
                            }
                        } else if (iZzf11 == 1836069985 || iZzf11 == 1701733217 || iZzf11 == 1633889587 || iZzf11 == 1700998451 || iZzf11 == 1633889588 || iZzf11 == 1835823201 || iZzf11 == 1685353315 || iZzf11 == 1685353317 || iZzf11 == 1685353320 || iZzf11 == 1685353324 || iZzf11 == 1685353336 || iZzf11 == 1935764850 || iZzf11 == 1935767394 || iZzf11 == 1819304813 || iZzf11 == 1936684916 || iZzf11 == 1953984371 || iZzf11 == 778924082 || iZzf11 == 778924083 || iZzf11 == 1835557169 || iZzf11 == 1835560241 || iZzf11 == 1634492771 || iZzf11 == 1634492791 || iZzf11 == 1970037111 || iZzf11 == 1332770163 || iZzf11 == 1716281667) {
                            int i59 = i46;
                            int i60 = i45;
                            zzagqVar = zzagqVar;
                            pair = pair;
                            j3 = j16;
                            iZzf3 = iZzf3;
                            zzaghVar3 = zzaghVar3;
                            zzo(zzfbVar5, iZzf11, iZzc3, iZzf10, i60, str6, z2, zzadVar, zzagnVar2, i47);
                            iZzc3 = iZzc3;
                            iZzf10 = iZzf10;
                            i47 = i47;
                            str5 = str5;
                            i45 = i60;
                            i46 = i59;
                        } else if (iZzf11 == 1414810956 || iZzf11 == 1954034535 || iZzf11 == 2004251764 || iZzf11 == 1937010800 || iZzf11 == 1664495672) {
                            zzfbVar5.zzG(iZzc3 + 16);
                            if (iZzf11 == 1414810956) {
                                str3 = "application/ttml+xml";
                            } else {
                                if (iZzf11 == 1954034535) {
                                    int i61 = iZzf10 - 16;
                                    byte[] bArr3 = new byte[i61];
                                    zzfbVar5.zzC(bArr3, 0, i61);
                                    zzfudVarZzm = zzfud.zzm(bArr3);
                                    str3 = "application/x-quicktime-tx3g";
                                    j5 = Long.MAX_VALUE;
                                    j4 = j16;
                                } else if (iZzf11 == 2004251764) {
                                    str3 = "application/x-mp4-vtt";
                                } else if (iZzf11 == 1937010800) {
                                    str3 = "application/ttml+xml";
                                    j4 = j16;
                                    zzfudVarZzm = null;
                                    j5 = 0;
                                } else {
                                    zzagnVar2.zzd = 1;
                                    str3 = "application/x-mp4-cea-608";
                                }
                                zzak zzakVar2 = new zzak();
                                zzakVar2.zzG(i45);
                                zzakVar2.zzS(str3);
                                zzakVar2.zzK(str6);
                                zzakVar2.zzW(j5);
                                zzakVar2.zzI(zzfudVarZzm);
                                zzagnVar2.zzb = zzakVar2.zzY();
                                j3 = j4;
                            }
                            zzfudVarZzm = null;
                            j5 = Long.MAX_VALUE;
                            j4 = j16;
                            zzak zzakVar3 = new zzak();
                            zzakVar3.zzG(i45);
                            zzakVar3.zzS(str3);
                            zzakVar3.zzK(str6);
                            zzakVar3.zzW(j5);
                            zzakVar3.zzI(zzfudVarZzm);
                            zzagnVar2.zzb = zzakVar3.zzY();
                            j3 = j4;
                        } else {
                            if (iZzf11 == 1835365492) {
                                zzp(zzfbVar5, 1835365492, iZzc3, i45, zzagnVar2);
                            } else if (iZzf11 == 1667329389) {
                                zzak zzakVar4 = new zzak();
                                zzakVar4.zzG(i45);
                                zzakVar4.zzS("application/x-camera-motion");
                                zzagnVar2.zzb = zzakVar4.zzY();
                            }
                            j3 = j16;
                        }
                        zzfbVar5.zzG(iZzc3 + iZzf10);
                        i47++;
                        str5 = str5;
                        zzagnVar2 = zzagnVar2;
                        zzfbVar5 = zzfbVar5;
                        zzagqVar = zzagqVar;
                        iZzf3 = iZzf3;
                        j16 = j3;
                        iZzf9 = i48;
                        str6 = str6;
                        pairZzj = pair;
                        zzaghVar3 = zzaghVar3;
                        int i62 = i46;
                        i45 = i45;
                        i46 = i62;
                    }
                    str = str5;
                    Pair pair2 = pairZzj;
                    long j17 = j16;
                    int i63 = iZzf3;
                    zzagq zzagqVar2 = zzagqVar;
                    zzagn zzagnVar4 = zzagnVar2;
                    i5 = -1;
                    zzaghVar2 = zzaghVar3;
                    zzagh zzaghVarZza5 = zzaghVar2.zza(1701082227);
                    if (zzaghVarZza5 == null || (pairZzi = zzi(zzaghVarZza5)) == null) {
                        jArr = null;
                        jArr2 = null;
                    } else {
                        jArr = (long[]) pairZzi.first;
                        jArr2 = (long[]) pairZzi.second;
                    }
                    if (zzagnVar4.zzb != null) {
                        zzahgVar = new zzahg(zzagqVar2.zza, i63, ((Long) pair2.first).longValue(), j17, jZzq3, zzagnVar4.zzb, zzagnVar4.zzd, zzagnVar4.zza, zzagnVar4.zzc, jArr, jArr2);
                        zzfqwVar = zzfqwVar;
                    }
                    zzahgVar2 = (zzahg) zzfqwVar.apply(zzahgVar);
                    if (zzahgVar2 != null) {
                        zzagh zzaghVarZza6 = zzaghVar2.zza(1835297121);
                        zzaghVarZza6.getClass();
                        zzagh zzaghVarZza7 = zzaghVarZza6.zza(1835626086);
                        zzaghVarZza7.getClass();
                        zzaghVarZza = zzaghVarZza7.zza(1937007212);
                        zzaghVarZza.getClass();
                        zzagiVarZzb = zzaghVarZza.zzb(1937011578);
                        if (zzagiVarZzb != null) {
                            zzagpVar = new zzago(zzagiVarZzb, zzahgVar2.zzf);
                        } else {
                            zzagiVarZzb2 = zzaghVarZza.zzb(1937013298);
                            if (zzagiVarZzb2 != null) {
                                throw zzcd.zza("Track has no sample table size information", null);
                            }
                            zzagpVar = new zzagp(zzagiVarZzb2);
                        }
                        iZzb = zzagpVar.zzb();
                        if (iZzb == 0) {
                            zzahjVar = new zzahj(zzahgVar2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        } else {
                            zzagiVarZzb3 = zzaghVarZza.zzb(1937007471);
                            if (zzagiVarZzb3 == null) {
                                zzagi zzagiVarZzb11 = zzaghVarZza.zzb(1668232756);
                                zzagiVarZzb11.getClass();
                                zzagiVar = zzagiVarZzb11;
                                z4 = true;
                            } else {
                                zzagiVar = zzagiVarZzb3;
                                z4 = false;
                            }
                            zzfb zzfbVar6 = zzagiVar.zza;
                            zzagi zzagiVarZzb12 = zzaghVarZza.zzb(1937011555);
                            zzagiVarZzb12.getClass();
                            zzfb zzfbVar7 = zzagiVarZzb12.zza;
                            zzagi zzagiVarZzb13 = zzaghVarZza.zzb(1937011827);
                            zzagiVarZzb13.getClass();
                            zzfbVar = zzagiVarZzb13.zza;
                            zzagiVarZzb4 = zzaghVarZza.zzb(1937011571);
                            if (zzagiVarZzb4 != null) {
                                zzfbVar2 = zzagiVarZzb4.zza;
                            } else {
                                zzfbVar2 = null;
                            }
                            zzagiVarZzb5 = zzaghVarZza.zzb(1668576371);
                            if (zzagiVarZzb5 != null) {
                                zzfbVar3 = zzagiVarZzb5.zza;
                            } else {
                                zzfbVar3 = null;
                            }
                            zzagkVar = new zzagk(zzfbVar7, zzfbVar6, z4);
                            zzfbVar.zzG(12);
                            iZzo = zzfbVar.zzo() + i5;
                            int iZzo9 = zzfbVar.zzo();
                            iZzo2 = zzfbVar.zzo();
                            if (zzfbVar3 != null) {
                                zzfbVar3.zzG(12);
                                iZzo3 = zzfbVar3.zzo();
                            } else {
                                iZzo3 = 0;
                            }
                            if (zzfbVar2 != null) {
                                zzfbVar2.zzG(12);
                                iZzo4 = zzfbVar2.zzo();
                                if (iZzo4 > 0) {
                                    iZzo5 = zzfbVar2.zzo() + i5;
                                } else {
                                    zzfbVar2 = null;
                                }
                                iZza = zzagpVar.zza();
                                String str14 = zzahgVar2.zzf.zzm;
                                iZzo6 = iZzo9;
                                if (iZza != -1 || ((!"audio/raw".equals(str14) && !"audio/g711-mlaw".equals(str14) && !"audio/g711-alaw".equals(str14)) || iZzo != 0)) {
                                    jArrCopyOf = new long[iZzb];
                                    iArrCopyOf = new int[iZzb];
                                    jArrCopyOf2 = new long[iZzb];
                                    i12 = iZzo4;
                                    iArrCopyOf2 = new int[iZzb];
                                    zzahgVar3 = zzahgVar2;
                                    iZzf = iZzo2;
                                    i13 = iZzo3;
                                    i14 = iZzo5;
                                    i15 = 0;
                                    i16 = 0;
                                    iZzo7 = 0;
                                    i17 = 0;
                                    j6 = 0;
                                    j7 = 0;
                                    i18 = iZzo;
                                    i19 = 0;
                                    while (true) {
                                        if (i19 < iZzb) {
                                            i18 = i18;
                                            break;
                                        }
                                        j9 = j6;
                                        zZza = true;
                                        while (true) {
                                            if (i16 != 0) {
                                                i21 = i16;
                                                break;
                                            }
                                            zZza = zzagkVar.zza();
                                            if (zZza) {
                                                i21 = 0;
                                                break;
                                            }
                                            int i64 = i14;
                                            long j18 = zzagkVar.zzd;
                                            i16 = zzagkVar.zzc;
                                            j9 = j18;
                                            i18 = i18;
                                            i14 = i64;
                                            iZzb = iZzb;
                                        }
                                        if (!zZza) {
                                            zzes.zzf(str, "Unexpected end of chunk data");
                                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i19);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i19);
                                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i19);
                                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i19);
                                            iZzb = i19;
                                            break;
                                        }
                                        iZzf2 = i17;
                                        if (zzfbVar3 != null) {
                                            while (iZzo7 == 0) {
                                                if (i13 > 0) {
                                                    iZzo7 = 0;
                                                    break;
                                                }
                                                i13--;
                                                iZzo7 = zzfbVar3.zzo();
                                                iZzf2 = zzfbVar3.zzf();
                                            }
                                            iZzo7--;
                                        }
                                        jArrCopyOf[i19] = j9;
                                        iZzc = zzagpVar.zzc();
                                        iArrCopyOf[i19] = iZzc;
                                        if (iZzc > i15) {
                                            i22 = iZzc;
                                        } else {
                                            i22 = i15;
                                        }
                                        jArrCopyOf2[i19] = j7 + ((long) iZzf2);
                                        if (zzfbVar2 == null) {
                                            i23 = 1;
                                        } else {
                                            i23 = 0;
                                        }
                                        iArrCopyOf2[i19] = i23;
                                        iZzo8 = i14;
                                        if (i19 == iZzo8) {
                                            iArrCopyOf2[i19] = 1;
                                            i12--;
                                            if (i12 > 0) {
                                                zzfbVar2.getClass();
                                                iZzo8 = zzfbVar2.zzo() - 1;
                                            }
                                        }
                                        zzfb zzfbVar8 = zzfbVar2;
                                        int i65 = iZzo8;
                                        j7 += (long) iZzf;
                                        i24 = iZzo6 - 1;
                                        if (i24 == 0) {
                                            iZzo6 = i24;
                                        } else if (i18 > 0) {
                                            iZzo6 = zzfbVar.zzo();
                                            iZzf = zzfbVar.zzf();
                                            i18--;
                                        } else {
                                            iZzo6 = 0;
                                        }
                                        long j19 = j9 + ((long) iArrCopyOf[i19]);
                                        i19++;
                                        i17 = iZzf2;
                                        i14 = i65;
                                        i15 = i22;
                                        i16 = i21 - 1;
                                        iZzb = iZzb;
                                        zzagkVar = zzagkVar;
                                        zzfbVar2 = zzfbVar8;
                                        i18 = i18;
                                        j6 = j19;
                                    }
                                    long j20 = j7 + ((long) i17);
                                    if (zzfbVar3 != null) {
                                        z5 = true;
                                        break;
                                    }
                                    while (true) {
                                        if (i13 > 0) {
                                            z5 = true;
                                            break;
                                        }
                                        if (zzfbVar3.zzo() != 0) {
                                            z5 = false;
                                            break;
                                        }
                                        zzfbVar3.zzf();
                                        i13--;
                                    }
                                    if (i12 == 0) {
                                        if (iZzo6 == 0) {
                                            if (i16 == 0) {
                                                z5 = z5;
                                                i16 = i16;
                                                iZzo7 = iZzo7;
                                                zzahgVar3 = zzahgVar3;
                                                i18 = i18;
                                                i20 = 0;
                                                iZzo6 = 0;
                                            } else if (i18 == 0) {
                                                z5 = z5;
                                                iZzo7 = iZzo7;
                                                zzahgVar3 = zzahgVar3;
                                                i18 = i18;
                                                i20 = 0;
                                                iZzo6 = 0;
                                                i16 = 0;
                                            } else if (iZzo7 == 0) {
                                                z5 = z5;
                                                iZzo7 = iZzo7;
                                                zzahgVar3 = zzahgVar3;
                                                i20 = 0;
                                                iZzo6 = 0;
                                                i16 = 0;
                                                i18 = 0;
                                            } else if (z5) {
                                                jArrCopyOf = jArrCopyOf;
                                                zzahgVar3 = zzahgVar3;
                                            } else {
                                                zzahgVar3 = zzahgVar3;
                                                i20 = 0;
                                                iZzo6 = 0;
                                                i16 = 0;
                                                i18 = 0;
                                                iZzo7 = 0;
                                                z5 = false;
                                            }
                                            int i66 = zzahgVar3.zza;
                                            StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                            sb.append(i66);
                                            sb.append(": remainingSynchronizationSamples ");
                                            sb.append(i20);
                                            sb.append(", remainingSamplesAtTimestampDelta ");
                                            sb.append(iZzo6);
                                            sb.append(", remainingSamplesInChunk ");
                                            sb.append(i16);
                                            sb.append(", remainingTimestampDeltaChanges ");
                                            sb.append(i18);
                                            sb.append(", remainingSamplesAtTimestampOffset ");
                                            sb.append(iZzo7);
                                            if (true != z5) {
                                                str4 = ", ctts invalid";
                                            } else {
                                                str4 = "";
                                            }
                                            sb.append(str4);
                                            zzes.zzf(str, sb.toString());
                                        } else {
                                            i20 = 0;
                                        }
                                        j8 = j20;
                                        iArr = iArrCopyOf2;
                                        jArr3 = jArrCopyOf2;
                                        jArr4 = jArrCopyOf;
                                        iArr2 = iArrCopyOf;
                                        iZzb = iZzb;
                                    } else {
                                        i20 = i12;
                                    }
                                    int i67 = zzahgVar3.zza;
                                    StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                    sb2.append(i67);
                                    sb2.append(": remainingSynchronizationSamples ");
                                    sb2.append(i20);
                                    sb2.append(", remainingSamplesAtTimestampDelta ");
                                    sb2.append(iZzo6);
                                    sb2.append(", remainingSamplesInChunk ");
                                    sb2.append(i16);
                                    sb2.append(", remainingTimestampDeltaChanges ");
                                    sb2.append(i18);
                                    sb2.append(", remainingSamplesAtTimestampOffset ");
                                    sb2.append(iZzo7);
                                    if (true != z5) {
                                        str4 = ", ctts invalid";
                                    } else {
                                        str4 = "";
                                    }
                                    sb2.append(str4);
                                    zzes.zzf(str, sb2.toString());
                                    j8 = j20;
                                    iArr = iArrCopyOf2;
                                    jArr3 = jArrCopyOf2;
                                    jArr4 = jArrCopyOf;
                                    iArr2 = iArrCopyOf;
                                    iZzb = iZzb;
                                } else if (iZzo3 == 0 && iZzo4 == 0) {
                                    int i68 = zzagkVar.zza;
                                    long[] jArr12 = new long[i68];
                                    int[] iArr12 = new int[i68];
                                    while (zzagkVar.zza()) {
                                        int i69 = zzagkVar.zzb;
                                        jArr12[i69] = zzagkVar.zzd;
                                        iArr12[i69] = zzagkVar.zzc;
                                    }
                                    long j21 = iZzo2;
                                    int i70 = 8192 / iZza;
                                    int i71 = 0;
                                    for (int i72 = 0; i72 < i68; i72++) {
                                        int i73 = iArr12[i72];
                                        int i74 = zzfk.zza;
                                        i71 += ((i73 + i70) - 1) / i70;
                                    }
                                    long[] jArr13 = new long[i71];
                                    int[] iArr13 = new int[i71];
                                    jArr3 = new long[i71];
                                    int[] iArr14 = new int[i71];
                                    int i75 = 0;
                                    int i76 = 0;
                                    int iMax = 0;
                                    int i77 = 0;
                                    while (i75 < i68) {
                                        int i78 = iArr12[i75];
                                        long j22 = jArr12[i75];
                                        int i79 = i68;
                                        int i80 = i78;
                                        while (i80 > 0) {
                                            int iMin = Math.min(i70, i80);
                                            jArr13[i77] = j22;
                                            long[] jArr14 = jArr12;
                                            int i81 = iZza * iMin;
                                            iArr13[i77] = i81;
                                            iMax = Math.max(iMax, i81);
                                            jArr3[i77] = ((long) i76) * j21;
                                            iArr14[i77] = 1;
                                            j22 += (long) iArr13[i77];
                                            i76 += iMin;
                                            i80 -= iMin;
                                            i77++;
                                            jArr12 = jArr14;
                                            iArr12 = iArr12;
                                        }
                                        i75++;
                                        i68 = i79;
                                    }
                                    j8 = j21 * ((long) i76);
                                    jArr4 = jArr13;
                                    iArr = iArr14;
                                    iArr2 = iArr13;
                                    i15 = iMax;
                                    zzahgVar3 = zzahgVar2;
                                } else {
                                    iZzo = 0;
                                    jArrCopyOf = new long[iZzb];
                                    iArrCopyOf = new int[iZzb];
                                    jArrCopyOf2 = new long[iZzb];
                                    i12 = iZzo4;
                                    iArrCopyOf2 = new int[iZzb];
                                    zzahgVar3 = zzahgVar2;
                                    iZzf = iZzo2;
                                    i13 = iZzo3;
                                    i14 = iZzo5;
                                    i15 = 0;
                                    i16 = 0;
                                    iZzo7 = 0;
                                    i17 = 0;
                                    j6 = 0;
                                    j7 = 0;
                                    i18 = iZzo;
                                    i19 = 0;
                                    while (true) {
                                        if (i19 < iZzb) {
                                            i18 = i18;
                                            break;
                                        }
                                        j9 = j6;
                                        zZza = true;
                                        while (true) {
                                            if (i16 != 0) {
                                                i21 = i16;
                                                break;
                                            }
                                            zZza = zzagkVar.zza();
                                            if (zZza) {
                                                i21 = 0;
                                                break;
                                            }
                                            int i610 = i14;
                                            long j110 = zzagkVar.zzd;
                                            i16 = zzagkVar.zzc;
                                            j9 = j110;
                                            i18 = i18;
                                            i14 = i610;
                                            iZzb = iZzb;
                                        }
                                        if (!zZza) {
                                            zzes.zzf(str, "Unexpected end of chunk data");
                                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i19);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i19);
                                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i19);
                                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i19);
                                            iZzb = i19;
                                            break;
                                        }
                                        iZzf2 = i17;
                                        if (zzfbVar3 != null) {
                                            while (iZzo7 == 0) {
                                                if (i13 > 0) {
                                                    iZzo7 = 0;
                                                    break;
                                                }
                                                i13--;
                                                iZzo7 = zzfbVar3.zzo();
                                                iZzf2 = zzfbVar3.zzf();
                                            }
                                            iZzo7--;
                                        }
                                        jArrCopyOf[i19] = j9;
                                        iZzc = zzagpVar.zzc();
                                        iArrCopyOf[i19] = iZzc;
                                        if (iZzc > i15) {
                                            i22 = iZzc;
                                        } else {
                                            i22 = i15;
                                        }
                                        jArrCopyOf2[i19] = j7 + ((long) iZzf2);
                                        if (zzfbVar2 == null) {
                                            i23 = 1;
                                        } else {
                                            i23 = 0;
                                        }
                                        iArrCopyOf2[i19] = i23;
                                        iZzo8 = i14;
                                        if (i19 == iZzo8) {
                                            iArrCopyOf2[i19] = 1;
                                            i12--;
                                            if (i12 > 0) {
                                                zzfbVar2.getClass();
                                                iZzo8 = zzfbVar2.zzo() - 1;
                                            }
                                        }
                                        zzfb zzfbVar9 = zzfbVar2;
                                        int i611 = iZzo8;
                                        j7 += (long) iZzf;
                                        i24 = iZzo6 - 1;
                                        if (i24 == 0) {
                                            iZzo6 = i24;
                                        } else if (i18 > 0) {
                                            iZzo6 = zzfbVar.zzo();
                                            iZzf = zzfbVar.zzf();
                                            i18--;
                                        } else {
                                            iZzo6 = 0;
                                        }
                                        long j111 = j9 + ((long) iArrCopyOf[i19]);
                                        i19++;
                                        i17 = iZzf2;
                                        i14 = i611;
                                        i15 = i22;
                                        i16 = i21 - 1;
                                        iZzb = iZzb;
                                        zzagkVar = zzagkVar;
                                        zzfbVar2 = zzfbVar9;
                                        i18 = i18;
                                        j6 = j111;
                                    }
                                    long j23 = j7 + ((long) i17);
                                    if (zzfbVar3 != null) {
                                        z5 = true;
                                        break;
                                    }
                                    while (true) {
                                        if (i13 > 0) {
                                            z5 = true;
                                            break;
                                        }
                                        if (zzfbVar3.zzo() != 0) {
                                            z5 = false;
                                            break;
                                        }
                                        zzfbVar3.zzf();
                                        i13--;
                                    }
                                    if (i12 == 0) {
                                        if (iZzo6 == 0) {
                                            if (i16 == 0) {
                                                z5 = z5;
                                                i16 = i16;
                                                iZzo7 = iZzo7;
                                                zzahgVar3 = zzahgVar3;
                                                i18 = i18;
                                                i20 = 0;
                                                iZzo6 = 0;
                                            } else if (i18 == 0) {
                                                z5 = z5;
                                                iZzo7 = iZzo7;
                                                zzahgVar3 = zzahgVar3;
                                                i18 = i18;
                                                i20 = 0;
                                                iZzo6 = 0;
                                                i16 = 0;
                                            } else if (iZzo7 == 0) {
                                                z5 = z5;
                                                iZzo7 = iZzo7;
                                                zzahgVar3 = zzahgVar3;
                                                i20 = 0;
                                                iZzo6 = 0;
                                                i16 = 0;
                                                i18 = 0;
                                            } else if (z5) {
                                                zzahgVar3 = zzahgVar3;
                                                i20 = 0;
                                                iZzo6 = 0;
                                                i16 = 0;
                                                i18 = 0;
                                                iZzo7 = 0;
                                                z5 = false;
                                            } else {
                                                jArrCopyOf = jArrCopyOf;
                                                zzahgVar3 = zzahgVar3;
                                            }
                                            int i612 = zzahgVar3.zza;
                                            StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                            sb3.append(i612);
                                            sb3.append(": remainingSynchronizationSamples ");
                                            sb3.append(i20);
                                            sb3.append(", remainingSamplesAtTimestampDelta ");
                                            sb3.append(iZzo6);
                                            sb3.append(", remainingSamplesInChunk ");
                                            sb3.append(i16);
                                            sb3.append(", remainingTimestampDeltaChanges ");
                                            sb3.append(i18);
                                            sb3.append(", remainingSamplesAtTimestampOffset ");
                                            sb3.append(iZzo7);
                                            if (true != z5) {
                                                str4 = ", ctts invalid";
                                            } else {
                                                str4 = "";
                                            }
                                            sb3.append(str4);
                                            zzes.zzf(str, sb3.toString());
                                        } else {
                                            i20 = 0;
                                        }
                                        j8 = j23;
                                        iArr = iArrCopyOf2;
                                        jArr3 = jArrCopyOf2;
                                        jArr4 = jArrCopyOf;
                                        iArr2 = iArrCopyOf;
                                        iZzb = iZzb;
                                    } else {
                                        i20 = i12;
                                    }
                                    int i613 = zzahgVar3.zza;
                                    StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                                    sb4.append(i613);
                                    sb4.append(": remainingSynchronizationSamples ");
                                    sb4.append(i20);
                                    sb4.append(", remainingSamplesAtTimestampDelta ");
                                    sb4.append(iZzo6);
                                    sb4.append(", remainingSamplesInChunk ");
                                    sb4.append(i16);
                                    sb4.append(", remainingTimestampDeltaChanges ");
                                    sb4.append(i18);
                                    sb4.append(", remainingSamplesAtTimestampOffset ");
                                    sb4.append(iZzo7);
                                    if (true != z5) {
                                        str4 = ", ctts invalid";
                                    } else {
                                        str4 = "";
                                    }
                                    sb4.append(str4);
                                    zzes.zzf(str, sb4.toString());
                                    j8 = j23;
                                    iArr = iArrCopyOf2;
                                    jArr3 = jArrCopyOf2;
                                    jArr4 = jArrCopyOf;
                                    iArr2 = iArrCopyOf;
                                    iZzb = iZzb;
                                }
                                jZzq = zzfk.zzq(j8, 1000000L, zzahgVar3.zzc);
                                jArr5 = zzahgVar3.zzh;
                                if (jArr5 == null) {
                                    zzfk.zzC(jArr3, 1000000L, zzahgVar3.zzc);
                                    zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, jZzq);
                                } else if (jArr5.length == 1 || zzahgVar3.zzb != 1 || jArr3.length < 2) {
                                    jArr6 = zzahgVar3.zzh;
                                    length = jArr6.length;
                                    if (length != 1) {
                                        if (zzahgVar3.zzb == 1) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        iArr3 = new int[length];
                                        iArr4 = new int[length];
                                        jArr7 = zzahgVar3.zzi;
                                        jArr7.getClass();
                                        i25 = 0;
                                        i26 = 0;
                                        z7 = false;
                                        i27 = 0;
                                        while (true) {
                                            jArr8 = zzahgVar3.zzh;
                                            i28 = i15;
                                            if (i25 < jArr8.length) {
                                                break;
                                            }
                                            long[] jArr15 = jArr4;
                                            int[] iArr15 = iArr2;
                                            j12 = jArr7[i25];
                                            if (j12 != -1) {
                                                long j24 = jArr8[i25];
                                                boolean z12 = z7;
                                                i36 = i27;
                                                iArr11 = iArr;
                                                long jZzq4 = zzfk.zzq(j24, zzahgVar3.zzc, zzahgVar3.zzd);
                                                i37 = 1;
                                                iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                                iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq4, z6, false);
                                                while (true) {
                                                    i38 = iArr3[i25];
                                                    i39 = iArr4[i25];
                                                    if (i38 >= i39 || (iArr11[i38] & i37) != 0) {
                                                        break;
                                                    }
                                                    iArr3[i25] = i38 + 1;
                                                    i37 = 1;
                                                }
                                                i26 += i39 - i38;
                                                if (i36 != i38) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                z7 = z10 | z12;
                                                i27 = i39;
                                            } else {
                                                iArr11 = iArr;
                                                z7 = z7;
                                            }
                                            i25++;
                                            i15 = i28;
                                            iArr2 = iArr15;
                                            iArr = iArr11;
                                            jArr4 = jArr15;
                                        }
                                        jArr9 = jArr4;
                                        iArr5 = iArr2;
                                        boolean z13 = z7;
                                        iArr6 = iArr;
                                        if (i26 != iZzb) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        z9 = z13 | z8;
                                        if (z9) {
                                            jArr10 = new long[i26];
                                        } else {
                                            jArr10 = jArr9;
                                        }
                                        if (z9) {
                                            iArr7 = new int[i26];
                                        } else {
                                            iArr7 = iArr5;
                                        }
                                        if (true == z9) {
                                            i28 = 0;
                                        }
                                        if (z9) {
                                            iArr8 = new int[i26];
                                        } else {
                                            iArr8 = iArr6;
                                        }
                                        jArr11 = new long[i26];
                                        i29 = 0;
                                        i30 = 0;
                                        j10 = 0;
                                        while (i29 < zzahgVar3.zzh.length) {
                                            j11 = zzahgVar3.zzi[i29];
                                            i31 = iArr3[i29];
                                            i32 = iArr4[i29];
                                            if (z9) {
                                                int i82 = i32 - i31;
                                                System.arraycopy(jArr9, i31, jArr10, i30, i82);
                                                iArr9 = iArr5;
                                                System.arraycopy(iArr9, i31, iArr7, i30, i82);
                                                iArr10 = iArr6;
                                                System.arraycopy(iArr10, i31, iArr8, i30, i82);
                                            } else {
                                                iArr9 = iArr5;
                                                iArr10 = iArr6;
                                            }
                                            i33 = i28;
                                            while (i31 < i32) {
                                                int i83 = i32;
                                                i34 = i33;
                                                long jZzq5 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                                int[] iArr16 = iArr8;
                                                long[] jArr16 = jArr3;
                                                jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                                int[] iArr17 = iArr10;
                                                long[] jArr17 = jArr10;
                                                long j25 = j10;
                                                if (zzr(zzahgVar3.zzb)) {
                                                    jZzq2 = Math.max(0L, jZzq2);
                                                }
                                                jArr11[i30] = jZzq5 + jZzq2;
                                                if (z9) {
                                                    i35 = i34;
                                                    if (iArr7[i30] > i35) {
                                                        i33 = iArr9[i31];
                                                    }
                                                    i30++;
                                                    i31++;
                                                    i32 = i83;
                                                    jArr3 = jArr16;
                                                    iArr10 = iArr17;
                                                    j10 = j25;
                                                    iArr8 = iArr16;
                                                    jArr10 = jArr17;
                                                } else {
                                                    i35 = i34;
                                                }
                                                i33 = i35;
                                                i30++;
                                                i31++;
                                                i32 = i83;
                                                jArr3 = jArr16;
                                                iArr10 = iArr17;
                                                j10 = j25;
                                                iArr8 = iArr16;
                                                jArr10 = jArr17;
                                            }
                                            int[] iArr18 = iArr10;
                                            long j26 = j10 + zzahgVar3.zzh[i29];
                                            i29++;
                                            i28 = i33;
                                            jArr3 = jArr3;
                                            iArr6 = iArr18;
                                            iArr8 = iArr8;
                                            jArr10 = jArr10;
                                            j10 = j26;
                                            iArr4 = iArr4;
                                            iArr5 = iArr9;
                                            iArr3 = iArr3;
                                        }
                                        zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                    } else if (jArr6[0] == 0) {
                                        long[] jArr18 = zzahgVar3.zzi;
                                        jArr18.getClass();
                                        j13 = jArr18[0];
                                        for (i40 = 0; i40 < jArr3.length; i40++) {
                                            jArr3[i40] = zzfk.zzq(jArr3[i40] - j13, 1000000L, zzahgVar3.zzc);
                                        }
                                        zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, zzfk.zzq(j8 - j13, 1000000L, zzahgVar3.zzc));
                                    } else {
                                        length = 1;
                                        if (zzahgVar3.zzb == 1) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        iArr3 = new int[length];
                                        iArr4 = new int[length];
                                        jArr7 = zzahgVar3.zzi;
                                        jArr7.getClass();
                                        i25 = 0;
                                        i26 = 0;
                                        z7 = false;
                                        i27 = 0;
                                        while (true) {
                                            jArr8 = zzahgVar3.zzh;
                                            i28 = i15;
                                            if (i25 < jArr8.length) {
                                                break;
                                                break;
                                            }
                                            long[] jArr19 = jArr4;
                                            int[] iArr19 = iArr2;
                                            j12 = jArr7[i25];
                                            if (j12 != -1) {
                                                long j27 = jArr8[i25];
                                                boolean z14 = z7;
                                                i36 = i27;
                                                iArr11 = iArr;
                                                long jZzq6 = zzfk.zzq(j27, zzahgVar3.zzc, zzahgVar3.zzd);
                                                i37 = 1;
                                                iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                                iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq6, z6, false);
                                                while (true) {
                                                    i38 = iArr3[i25];
                                                    i39 = iArr4[i25];
                                                    if (i38 >= i39) {
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr3[i25] = i38 + 1;
                                                    i37 = 1;
                                                }
                                                i26 += i39 - i38;
                                                if (i36 != i38) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                z7 = z10 | z14;
                                                i27 = i39;
                                            } else {
                                                iArr11 = iArr;
                                                z7 = z7;
                                            }
                                            i25++;
                                            i15 = i28;
                                            iArr2 = iArr19;
                                            iArr = iArr11;
                                            jArr4 = jArr19;
                                        }
                                        jArr9 = jArr4;
                                        iArr5 = iArr2;
                                        boolean z15 = z7;
                                        iArr6 = iArr;
                                        if (i26 != iZzb) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        z9 = z15 | z8;
                                        if (z9) {
                                            jArr10 = new long[i26];
                                        } else {
                                            jArr10 = jArr9;
                                        }
                                        if (z9) {
                                            iArr7 = new int[i26];
                                        } else {
                                            iArr7 = iArr5;
                                        }
                                        if (true == z9) {
                                            i28 = 0;
                                        }
                                        if (z9) {
                                            iArr8 = new int[i26];
                                        } else {
                                            iArr8 = iArr6;
                                        }
                                        jArr11 = new long[i26];
                                        i29 = 0;
                                        i30 = 0;
                                        j10 = 0;
                                        while (i29 < zzahgVar3.zzh.length) {
                                            j11 = zzahgVar3.zzi[i29];
                                            i31 = iArr3[i29];
                                            i32 = iArr4[i29];
                                            if (z9) {
                                                int i84 = i32 - i31;
                                                System.arraycopy(jArr9, i31, jArr10, i30, i84);
                                                iArr9 = iArr5;
                                                System.arraycopy(iArr9, i31, iArr7, i30, i84);
                                                iArr10 = iArr6;
                                                System.arraycopy(iArr10, i31, iArr8, i30, i84);
                                            } else {
                                                iArr9 = iArr5;
                                                iArr10 = iArr6;
                                            }
                                            i33 = i28;
                                            while (i31 < i32) {
                                                int i85 = i32;
                                                i34 = i33;
                                                long jZzq7 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                                int[] iArr110 = iArr8;
                                                long[] jArr110 = jArr3;
                                                jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                                int[] iArr111 = iArr10;
                                                long[] jArr111 = jArr10;
                                                long j28 = j10;
                                                if (zzr(zzahgVar3.zzb)) {
                                                    jZzq2 = Math.max(0L, jZzq2);
                                                }
                                                jArr11[i30] = jZzq7 + jZzq2;
                                                if (z9) {
                                                    i35 = i34;
                                                    if (iArr7[i30] > i35) {
                                                        i33 = iArr9[i31];
                                                    }
                                                    i30++;
                                                    i31++;
                                                    i32 = i85;
                                                    jArr3 = jArr110;
                                                    iArr10 = iArr111;
                                                    j10 = j28;
                                                    iArr8 = iArr110;
                                                    jArr10 = jArr111;
                                                } else {
                                                    i35 = i34;
                                                }
                                                i33 = i35;
                                                i30++;
                                                i31++;
                                                i32 = i85;
                                                jArr3 = jArr110;
                                                iArr10 = iArr111;
                                                j10 = j28;
                                                iArr8 = iArr110;
                                                jArr10 = jArr111;
                                            }
                                            int[] iArr112 = iArr10;
                                            long j29 = j10 + zzahgVar3.zzh[i29];
                                            i29++;
                                            i28 = i33;
                                            jArr3 = jArr3;
                                            iArr6 = iArr112;
                                            iArr8 = iArr8;
                                            jArr10 = jArr10;
                                            j10 = j29;
                                            iArr4 = iArr4;
                                            iArr5 = iArr9;
                                            iArr3 = iArr3;
                                        }
                                        zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                    }
                                } else {
                                    long[] jArr20 = zzahgVar3.zzi;
                                    jArr20.getClass();
                                    long j30 = jArr20[0];
                                    long jZzq8 = j30 + zzfk.zzq(jArr5[0], zzahgVar3.zzc, zzahgVar3.zzd);
                                    if (zzq(jArr3, j8, j30, jZzq8)) {
                                        long jZzq9 = zzfk.zzq(j30 - jArr3[0], zzahgVar3.zzf.zzA, zzahgVar3.zzc);
                                        long jZzq10 = zzfk.zzq(j8 - jZzq8, zzahgVar3.zzf.zzA, zzahgVar3.zzc);
                                        if (jZzq9 != 0) {
                                            j14 = jZzq9;
                                        } else if (jZzq10 != 0) {
                                            j14 = 0;
                                        } else {
                                            jArr6 = zzahgVar3.zzh;
                                            length = jArr6.length;
                                            if (length != 1) {
                                                if (zzahgVar3.zzb == 1) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                iArr3 = new int[length];
                                                iArr4 = new int[length];
                                                jArr7 = zzahgVar3.zzi;
                                                jArr7.getClass();
                                                i25 = 0;
                                                i26 = 0;
                                                z7 = false;
                                                i27 = 0;
                                                while (true) {
                                                    jArr8 = zzahgVar3.zzh;
                                                    i28 = i15;
                                                    if (i25 < jArr8.length) {
                                                        break;
                                                        break;
                                                    }
                                                    long[] jArr112 = jArr4;
                                                    int[] iArr113 = iArr2;
                                                    j12 = jArr7[i25];
                                                    if (j12 != -1) {
                                                        long j210 = jArr8[i25];
                                                        boolean z16 = z7;
                                                        i36 = i27;
                                                        iArr11 = iArr;
                                                        long jZzq11 = zzfk.zzq(j210, zzahgVar3.zzc, zzahgVar3.zzd);
                                                        i37 = 1;
                                                        iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                                        iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq11, z6, false);
                                                        while (true) {
                                                            i38 = iArr3[i25];
                                                            i39 = iArr4[i25];
                                                            if (i38 >= i39) {
                                                                break;
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                            iArr3[i25] = i38 + 1;
                                                            i37 = 1;
                                                        }
                                                        i26 += i39 - i38;
                                                        if (i36 != i38) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        z7 = z10 | z16;
                                                        i27 = i39;
                                                    } else {
                                                        iArr11 = iArr;
                                                        z7 = z7;
                                                    }
                                                    i25++;
                                                    i15 = i28;
                                                    iArr2 = iArr113;
                                                    iArr = iArr11;
                                                    jArr4 = jArr112;
                                                }
                                                jArr9 = jArr4;
                                                iArr5 = iArr2;
                                                boolean z17 = z7;
                                                iArr6 = iArr;
                                                if (i26 != iZzb) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                z9 = z17 | z8;
                                                if (z9) {
                                                    jArr10 = new long[i26];
                                                } else {
                                                    jArr10 = jArr9;
                                                }
                                                if (z9) {
                                                    iArr7 = new int[i26];
                                                } else {
                                                    iArr7 = iArr5;
                                                }
                                                if (true == z9) {
                                                    i28 = 0;
                                                }
                                                if (z9) {
                                                    iArr8 = new int[i26];
                                                } else {
                                                    iArr8 = iArr6;
                                                }
                                                jArr11 = new long[i26];
                                                i29 = 0;
                                                i30 = 0;
                                                j10 = 0;
                                                while (i29 < zzahgVar3.zzh.length) {
                                                    j11 = zzahgVar3.zzi[i29];
                                                    i31 = iArr3[i29];
                                                    i32 = iArr4[i29];
                                                    if (z9) {
                                                        int i86 = i32 - i31;
                                                        System.arraycopy(jArr9, i31, jArr10, i30, i86);
                                                        iArr9 = iArr5;
                                                        System.arraycopy(iArr9, i31, iArr7, i30, i86);
                                                        iArr10 = iArr6;
                                                        System.arraycopy(iArr10, i31, iArr8, i30, i86);
                                                    } else {
                                                        iArr9 = iArr5;
                                                        iArr10 = iArr6;
                                                    }
                                                    i33 = i28;
                                                    while (i31 < i32) {
                                                        int i87 = i32;
                                                        i34 = i33;
                                                        long jZzq12 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                                        int[] iArr114 = iArr8;
                                                        long[] jArr113 = jArr3;
                                                        jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                                        int[] iArr115 = iArr10;
                                                        long[] jArr114 = jArr10;
                                                        long j211 = j10;
                                                        if (zzr(zzahgVar3.zzb)) {
                                                            jZzq2 = Math.max(0L, jZzq2);
                                                        }
                                                        jArr11[i30] = jZzq12 + jZzq2;
                                                        if (z9) {
                                                            i35 = i34;
                                                            if (iArr7[i30] > i35) {
                                                                i33 = iArr9[i31];
                                                            }
                                                            i30++;
                                                            i31++;
                                                            i32 = i87;
                                                            jArr3 = jArr113;
                                                            iArr10 = iArr115;
                                                            j10 = j211;
                                                            iArr8 = iArr114;
                                                            jArr10 = jArr114;
                                                        } else {
                                                            i35 = i34;
                                                        }
                                                        i33 = i35;
                                                        i30++;
                                                        i31++;
                                                        i32 = i87;
                                                        jArr3 = jArr113;
                                                        iArr10 = iArr115;
                                                        j10 = j211;
                                                        iArr8 = iArr114;
                                                        jArr10 = jArr114;
                                                    }
                                                    int[] iArr116 = iArr10;
                                                    long j212 = j10 + zzahgVar3.zzh[i29];
                                                    i29++;
                                                    i28 = i33;
                                                    jArr3 = jArr3;
                                                    iArr6 = iArr116;
                                                    iArr8 = iArr8;
                                                    jArr10 = jArr10;
                                                    j10 = j212;
                                                    iArr4 = iArr4;
                                                    iArr5 = iArr9;
                                                    iArr3 = iArr3;
                                                }
                                                zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                            } else if (jArr6[0] == 0) {
                                                long[] jArr115 = zzahgVar3.zzi;
                                                jArr115.getClass();
                                                j13 = jArr115[0];
                                                while (i40 < jArr3.length) {
                                                    jArr3[i40] = zzfk.zzq(jArr3[i40] - j13, 1000000L, zzahgVar3.zzc);
                                                }
                                                zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, zzfk.zzq(j8 - j13, 1000000L, zzahgVar3.zzc));
                                            } else {
                                                length = 1;
                                                if (zzahgVar3.zzb == 1) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                iArr3 = new int[length];
                                                iArr4 = new int[length];
                                                jArr7 = zzahgVar3.zzi;
                                                jArr7.getClass();
                                                i25 = 0;
                                                i26 = 0;
                                                z7 = false;
                                                i27 = 0;
                                                while (true) {
                                                    jArr8 = zzahgVar3.zzh;
                                                    i28 = i15;
                                                    if (i25 < jArr8.length) {
                                                        break;
                                                        break;
                                                    }
                                                    long[] jArr116 = jArr4;
                                                    int[] iArr117 = iArr2;
                                                    j12 = jArr7[i25];
                                                    if (j12 != -1) {
                                                        long j213 = jArr8[i25];
                                                        boolean z18 = z7;
                                                        i36 = i27;
                                                        iArr11 = iArr;
                                                        long jZzq13 = zzfk.zzq(j213, zzahgVar3.zzc, zzahgVar3.zzd);
                                                        i37 = 1;
                                                        iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                                        iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq13, z6, false);
                                                        while (true) {
                                                            i38 = iArr3[i25];
                                                            i39 = iArr4[i25];
                                                            if (i38 >= i39) {
                                                                break;
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                            iArr3[i25] = i38 + 1;
                                                            i37 = 1;
                                                        }
                                                        i26 += i39 - i38;
                                                        if (i36 != i38) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        z7 = z10 | z18;
                                                        i27 = i39;
                                                    } else {
                                                        iArr11 = iArr;
                                                        z7 = z7;
                                                    }
                                                    i25++;
                                                    i15 = i28;
                                                    iArr2 = iArr117;
                                                    iArr = iArr11;
                                                    jArr4 = jArr116;
                                                }
                                                jArr9 = jArr4;
                                                iArr5 = iArr2;
                                                boolean z19 = z7;
                                                iArr6 = iArr;
                                                if (i26 != iZzb) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                z9 = z19 | z8;
                                                if (z9) {
                                                    jArr10 = new long[i26];
                                                } else {
                                                    jArr10 = jArr9;
                                                }
                                                if (z9) {
                                                    iArr7 = new int[i26];
                                                } else {
                                                    iArr7 = iArr5;
                                                }
                                                if (true == z9) {
                                                    i28 = 0;
                                                }
                                                if (z9) {
                                                    iArr8 = new int[i26];
                                                } else {
                                                    iArr8 = iArr6;
                                                }
                                                jArr11 = new long[i26];
                                                i29 = 0;
                                                i30 = 0;
                                                j10 = 0;
                                                while (i29 < zzahgVar3.zzh.length) {
                                                    j11 = zzahgVar3.zzi[i29];
                                                    i31 = iArr3[i29];
                                                    i32 = iArr4[i29];
                                                    if (z9) {
                                                        int i88 = i32 - i31;
                                                        System.arraycopy(jArr9, i31, jArr10, i30, i88);
                                                        iArr9 = iArr5;
                                                        System.arraycopy(iArr9, i31, iArr7, i30, i88);
                                                        iArr10 = iArr6;
                                                        System.arraycopy(iArr10, i31, iArr8, i30, i88);
                                                    } else {
                                                        iArr9 = iArr5;
                                                        iArr10 = iArr6;
                                                    }
                                                    i33 = i28;
                                                    while (i31 < i32) {
                                                        int i89 = i32;
                                                        i34 = i33;
                                                        long jZzq14 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                                        int[] iArr118 = iArr8;
                                                        long[] jArr117 = jArr3;
                                                        jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                                        int[] iArr119 = iArr10;
                                                        long[] jArr118 = jArr10;
                                                        long j214 = j10;
                                                        if (zzr(zzahgVar3.zzb)) {
                                                            jZzq2 = Math.max(0L, jZzq2);
                                                        }
                                                        jArr11[i30] = jZzq14 + jZzq2;
                                                        if (z9) {
                                                            i35 = i34;
                                                            if (iArr7[i30] > i35) {
                                                                i33 = iArr9[i31];
                                                            }
                                                            i30++;
                                                            i31++;
                                                            i32 = i89;
                                                            jArr3 = jArr117;
                                                            iArr10 = iArr119;
                                                            j10 = j214;
                                                            iArr8 = iArr118;
                                                            jArr10 = jArr118;
                                                        } else {
                                                            i35 = i34;
                                                        }
                                                        i33 = i35;
                                                        i30++;
                                                        i31++;
                                                        i32 = i89;
                                                        jArr3 = jArr117;
                                                        iArr10 = iArr119;
                                                        j10 = j214;
                                                        iArr8 = iArr118;
                                                        jArr10 = jArr118;
                                                    }
                                                    int[] iArr1110 = iArr10;
                                                    long j215 = j10 + zzahgVar3.zzh[i29];
                                                    i29++;
                                                    i28 = i33;
                                                    jArr3 = jArr3;
                                                    iArr6 = iArr1110;
                                                    iArr8 = iArr8;
                                                    jArr10 = jArr10;
                                                    j10 = j215;
                                                    iArr4 = iArr4;
                                                    iArr5 = iArr9;
                                                    iArr3 = iArr3;
                                                }
                                                zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                            }
                                        }
                                        if (j14 > 2147483647L || jZzq10 > 2147483647L) {
                                            jArr6 = zzahgVar3.zzh;
                                            length = jArr6.length;
                                            if (length != 1) {
                                                if (zzahgVar3.zzb == 1) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                iArr3 = new int[length];
                                                iArr4 = new int[length];
                                                jArr7 = zzahgVar3.zzi;
                                                jArr7.getClass();
                                                i25 = 0;
                                                i26 = 0;
                                                z7 = false;
                                                i27 = 0;
                                                while (true) {
                                                    jArr8 = zzahgVar3.zzh;
                                                    i28 = i15;
                                                    if (i25 < jArr8.length) {
                                                        break;
                                                        break;
                                                    }
                                                    long[] jArr119 = jArr4;
                                                    int[] iArr1111 = iArr2;
                                                    j12 = jArr7[i25];
                                                    if (j12 != -1) {
                                                        long j216 = jArr8[i25];
                                                        boolean z110 = z7;
                                                        i36 = i27;
                                                        iArr11 = iArr;
                                                        long jZzq15 = zzfk.zzq(j216, zzahgVar3.zzc, zzahgVar3.zzd);
                                                        i37 = 1;
                                                        iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                                        iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq15, z6, false);
                                                        while (true) {
                                                            i38 = iArr3[i25];
                                                            i39 = iArr4[i25];
                                                            if (i38 >= i39) {
                                                                break;
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                            iArr3[i25] = i38 + 1;
                                                            i37 = 1;
                                                        }
                                                        i26 += i39 - i38;
                                                        if (i36 != i38) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        z7 = z10 | z110;
                                                        i27 = i39;
                                                    } else {
                                                        iArr11 = iArr;
                                                        z7 = z7;
                                                    }
                                                    i25++;
                                                    i15 = i28;
                                                    iArr2 = iArr1111;
                                                    iArr = iArr11;
                                                    jArr4 = jArr119;
                                                }
                                                jArr9 = jArr4;
                                                iArr5 = iArr2;
                                                boolean z111 = z7;
                                                iArr6 = iArr;
                                                if (i26 != iZzb) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                z9 = z111 | z8;
                                                if (z9) {
                                                    jArr10 = new long[i26];
                                                } else {
                                                    jArr10 = jArr9;
                                                }
                                                if (z9) {
                                                    iArr7 = new int[i26];
                                                } else {
                                                    iArr7 = iArr5;
                                                }
                                                if (true == z9) {
                                                    i28 = 0;
                                                }
                                                if (z9) {
                                                    iArr8 = new int[i26];
                                                } else {
                                                    iArr8 = iArr6;
                                                }
                                                jArr11 = new long[i26];
                                                i29 = 0;
                                                i30 = 0;
                                                j10 = 0;
                                                while (i29 < zzahgVar3.zzh.length) {
                                                    j11 = zzahgVar3.zzi[i29];
                                                    i31 = iArr3[i29];
                                                    i32 = iArr4[i29];
                                                    if (z9) {
                                                        int i810 = i32 - i31;
                                                        System.arraycopy(jArr9, i31, jArr10, i30, i810);
                                                        iArr9 = iArr5;
                                                        System.arraycopy(iArr9, i31, iArr7, i30, i810);
                                                        iArr10 = iArr6;
                                                        System.arraycopy(iArr10, i31, iArr8, i30, i810);
                                                    } else {
                                                        iArr9 = iArr5;
                                                        iArr10 = iArr6;
                                                    }
                                                    i33 = i28;
                                                    while (i31 < i32) {
                                                        int i811 = i32;
                                                        i34 = i33;
                                                        long jZzq16 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                                        int[] iArr1112 = iArr8;
                                                        long[] jArr1110 = jArr3;
                                                        jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                                        int[] iArr1113 = iArr10;
                                                        long[] jArr1111 = jArr10;
                                                        long j217 = j10;
                                                        if (zzr(zzahgVar3.zzb)) {
                                                            jZzq2 = Math.max(0L, jZzq2);
                                                        }
                                                        jArr11[i30] = jZzq16 + jZzq2;
                                                        if (z9) {
                                                            i35 = i34;
                                                            if (iArr7[i30] > i35) {
                                                                i33 = iArr9[i31];
                                                            }
                                                            i30++;
                                                            i31++;
                                                            i32 = i811;
                                                            jArr3 = jArr1110;
                                                            iArr10 = iArr1113;
                                                            j10 = j217;
                                                            iArr8 = iArr1112;
                                                            jArr10 = jArr1111;
                                                        } else {
                                                            i35 = i34;
                                                        }
                                                        i33 = i35;
                                                        i30++;
                                                        i31++;
                                                        i32 = i811;
                                                        jArr3 = jArr1110;
                                                        iArr10 = iArr1113;
                                                        j10 = j217;
                                                        iArr8 = iArr1112;
                                                        jArr10 = jArr1111;
                                                    }
                                                    int[] iArr1114 = iArr10;
                                                    long j218 = j10 + zzahgVar3.zzh[i29];
                                                    i29++;
                                                    i28 = i33;
                                                    jArr3 = jArr3;
                                                    iArr6 = iArr1114;
                                                    iArr8 = iArr8;
                                                    jArr10 = jArr10;
                                                    j10 = j218;
                                                    iArr4 = iArr4;
                                                    iArr5 = iArr9;
                                                    iArr3 = iArr3;
                                                }
                                                zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                            } else if (jArr6[0] == 0) {
                                                long[] jArr1112 = zzahgVar3.zzi;
                                                jArr1112.getClass();
                                                j13 = jArr1112[0];
                                                while (i40 < jArr3.length) {
                                                    jArr3[i40] = zzfk.zzq(jArr3[i40] - j13, 1000000L, zzahgVar3.zzc);
                                                }
                                                zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, zzfk.zzq(j8 - j13, 1000000L, zzahgVar3.zzc));
                                            } else {
                                                length = 1;
                                                if (zzahgVar3.zzb == 1) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                iArr3 = new int[length];
                                                iArr4 = new int[length];
                                                jArr7 = zzahgVar3.zzi;
                                                jArr7.getClass();
                                                i25 = 0;
                                                i26 = 0;
                                                z7 = false;
                                                i27 = 0;
                                                while (true) {
                                                    jArr8 = zzahgVar3.zzh;
                                                    i28 = i15;
                                                    if (i25 < jArr8.length) {
                                                        break;
                                                        break;
                                                    }
                                                    long[] jArr1113 = jArr4;
                                                    int[] iArr1115 = iArr2;
                                                    j12 = jArr7[i25];
                                                    if (j12 != -1) {
                                                        long j219 = jArr8[i25];
                                                        boolean z112 = z7;
                                                        i36 = i27;
                                                        iArr11 = iArr;
                                                        long jZzq17 = zzfk.zzq(j219, zzahgVar3.zzc, zzahgVar3.zzd);
                                                        i37 = 1;
                                                        iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                                        iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq17, z6, false);
                                                        while (true) {
                                                            i38 = iArr3[i25];
                                                            i39 = iArr4[i25];
                                                            if (i38 >= i39) {
                                                                break;
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                            iArr3[i25] = i38 + 1;
                                                            i37 = 1;
                                                        }
                                                        i26 += i39 - i38;
                                                        if (i36 != i38) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        z7 = z10 | z112;
                                                        i27 = i39;
                                                    } else {
                                                        iArr11 = iArr;
                                                        z7 = z7;
                                                    }
                                                    i25++;
                                                    i15 = i28;
                                                    iArr2 = iArr1115;
                                                    iArr = iArr11;
                                                    jArr4 = jArr1113;
                                                }
                                                jArr9 = jArr4;
                                                iArr5 = iArr2;
                                                boolean z113 = z7;
                                                iArr6 = iArr;
                                                if (i26 != iZzb) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                z9 = z113 | z8;
                                                if (z9) {
                                                    jArr10 = new long[i26];
                                                } else {
                                                    jArr10 = jArr9;
                                                }
                                                if (z9) {
                                                    iArr7 = new int[i26];
                                                } else {
                                                    iArr7 = iArr5;
                                                }
                                                if (true == z9) {
                                                    i28 = 0;
                                                }
                                                if (z9) {
                                                    iArr8 = new int[i26];
                                                } else {
                                                    iArr8 = iArr6;
                                                }
                                                jArr11 = new long[i26];
                                                i29 = 0;
                                                i30 = 0;
                                                j10 = 0;
                                                while (i29 < zzahgVar3.zzh.length) {
                                                    j11 = zzahgVar3.zzi[i29];
                                                    i31 = iArr3[i29];
                                                    i32 = iArr4[i29];
                                                    if (z9) {
                                                        int i812 = i32 - i31;
                                                        System.arraycopy(jArr9, i31, jArr10, i30, i812);
                                                        iArr9 = iArr5;
                                                        System.arraycopy(iArr9, i31, iArr7, i30, i812);
                                                        iArr10 = iArr6;
                                                        System.arraycopy(iArr10, i31, iArr8, i30, i812);
                                                    } else {
                                                        iArr9 = iArr5;
                                                        iArr10 = iArr6;
                                                    }
                                                    i33 = i28;
                                                    while (i31 < i32) {
                                                        int i813 = i32;
                                                        i34 = i33;
                                                        long jZzq18 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                                        int[] iArr1116 = iArr8;
                                                        long[] jArr1114 = jArr3;
                                                        jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                                        int[] iArr1117 = iArr10;
                                                        long[] jArr1115 = jArr10;
                                                        long j2110 = j10;
                                                        if (zzr(zzahgVar3.zzb)) {
                                                            jZzq2 = Math.max(0L, jZzq2);
                                                        }
                                                        jArr11[i30] = jZzq18 + jZzq2;
                                                        if (z9) {
                                                            i35 = i34;
                                                            if (iArr7[i30] > i35) {
                                                                i33 = iArr9[i31];
                                                            }
                                                            i30++;
                                                            i31++;
                                                            i32 = i813;
                                                            jArr3 = jArr1114;
                                                            iArr10 = iArr1117;
                                                            j10 = j2110;
                                                            iArr8 = iArr1116;
                                                            jArr10 = jArr1115;
                                                        } else {
                                                            i35 = i34;
                                                        }
                                                        i33 = i35;
                                                        i30++;
                                                        i31++;
                                                        i32 = i813;
                                                        jArr3 = jArr1114;
                                                        iArr10 = iArr1117;
                                                        j10 = j2110;
                                                        iArr8 = iArr1116;
                                                        jArr10 = jArr1115;
                                                    }
                                                    int[] iArr1118 = iArr10;
                                                    long j2111 = j10 + zzahgVar3.zzh[i29];
                                                    i29++;
                                                    i28 = i33;
                                                    jArr3 = jArr3;
                                                    iArr6 = iArr1118;
                                                    iArr8 = iArr8;
                                                    jArr10 = jArr10;
                                                    j10 = j2111;
                                                    iArr4 = iArr4;
                                                    iArr5 = iArr9;
                                                    iArr3 = iArr3;
                                                }
                                                zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                            }
                                        } else {
                                            zzabqVar.zza = (int) j14;
                                            zzabqVar.zzb = (int) jZzq10;
                                            zzfk.zzC(jArr3, 1000000L, zzahgVar3.zzc);
                                            zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, zzfk.zzq(zzahgVar3.zzh[0], 1000000L, zzahgVar3.zzd));
                                        }
                                    } else {
                                        jArr6 = zzahgVar3.zzh;
                                        length = jArr6.length;
                                        if (length != 1) {
                                            if (zzahgVar3.zzb == 1) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            iArr3 = new int[length];
                                            iArr4 = new int[length];
                                            jArr7 = zzahgVar3.zzi;
                                            jArr7.getClass();
                                            i25 = 0;
                                            i26 = 0;
                                            z7 = false;
                                            i27 = 0;
                                            while (true) {
                                                jArr8 = zzahgVar3.zzh;
                                                i28 = i15;
                                                if (i25 < jArr8.length) {
                                                    break;
                                                    break;
                                                }
                                                long[] jArr1116 = jArr4;
                                                int[] iArr1119 = iArr2;
                                                j12 = jArr7[i25];
                                                if (j12 != -1) {
                                                    long j2112 = jArr8[i25];
                                                    boolean z114 = z7;
                                                    i36 = i27;
                                                    iArr11 = iArr;
                                                    long jZzq19 = zzfk.zzq(j2112, zzahgVar3.zzc, zzahgVar3.zzd);
                                                    i37 = 1;
                                                    iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                                    iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq19, z6, false);
                                                    while (true) {
                                                        i38 = iArr3[i25];
                                                        i39 = iArr4[i25];
                                                        if (i38 >= i39) {
                                                            break;
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                        iArr3[i25] = i38 + 1;
                                                        i37 = 1;
                                                    }
                                                    i26 += i39 - i38;
                                                    if (i36 != i38) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    z7 = z10 | z114;
                                                    i27 = i39;
                                                } else {
                                                    iArr11 = iArr;
                                                    z7 = z7;
                                                }
                                                i25++;
                                                i15 = i28;
                                                iArr2 = iArr1119;
                                                iArr = iArr11;
                                                jArr4 = jArr1116;
                                            }
                                            jArr9 = jArr4;
                                            iArr5 = iArr2;
                                            boolean z115 = z7;
                                            iArr6 = iArr;
                                            if (i26 != iZzb) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            z9 = z115 | z8;
                                            if (z9) {
                                                jArr10 = new long[i26];
                                            } else {
                                                jArr10 = jArr9;
                                            }
                                            if (z9) {
                                                iArr7 = new int[i26];
                                            } else {
                                                iArr7 = iArr5;
                                            }
                                            if (true == z9) {
                                                i28 = 0;
                                            }
                                            if (z9) {
                                                iArr8 = new int[i26];
                                            } else {
                                                iArr8 = iArr6;
                                            }
                                            jArr11 = new long[i26];
                                            i29 = 0;
                                            i30 = 0;
                                            j10 = 0;
                                            while (i29 < zzahgVar3.zzh.length) {
                                                j11 = zzahgVar3.zzi[i29];
                                                i31 = iArr3[i29];
                                                i32 = iArr4[i29];
                                                if (z9) {
                                                    int i814 = i32 - i31;
                                                    System.arraycopy(jArr9, i31, jArr10, i30, i814);
                                                    iArr9 = iArr5;
                                                    System.arraycopy(iArr9, i31, iArr7, i30, i814);
                                                    iArr10 = iArr6;
                                                    System.arraycopy(iArr10, i31, iArr8, i30, i814);
                                                } else {
                                                    iArr9 = iArr5;
                                                    iArr10 = iArr6;
                                                }
                                                i33 = i28;
                                                while (i31 < i32) {
                                                    int i815 = i32;
                                                    i34 = i33;
                                                    long jZzq110 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                                    int[] iArr11110 = iArr8;
                                                    long[] jArr1117 = jArr3;
                                                    jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                                    int[] iArr11111 = iArr10;
                                                    long[] jArr1118 = jArr10;
                                                    long j2113 = j10;
                                                    if (zzr(zzahgVar3.zzb)) {
                                                        jZzq2 = Math.max(0L, jZzq2);
                                                    }
                                                    jArr11[i30] = jZzq110 + jZzq2;
                                                    if (z9) {
                                                        i35 = i34;
                                                        if (iArr7[i30] > i35) {
                                                            i33 = iArr9[i31];
                                                        }
                                                        i30++;
                                                        i31++;
                                                        i32 = i815;
                                                        jArr3 = jArr1117;
                                                        iArr10 = iArr11111;
                                                        j10 = j2113;
                                                        iArr8 = iArr11110;
                                                        jArr10 = jArr1118;
                                                    } else {
                                                        i35 = i34;
                                                    }
                                                    i33 = i35;
                                                    i30++;
                                                    i31++;
                                                    i32 = i815;
                                                    jArr3 = jArr1117;
                                                    iArr10 = iArr11111;
                                                    j10 = j2113;
                                                    iArr8 = iArr11110;
                                                    jArr10 = jArr1118;
                                                }
                                                int[] iArr11112 = iArr10;
                                                long j2114 = j10 + zzahgVar3.zzh[i29];
                                                i29++;
                                                i28 = i33;
                                                jArr3 = jArr3;
                                                iArr6 = iArr11112;
                                                iArr8 = iArr8;
                                                jArr10 = jArr10;
                                                j10 = j2114;
                                                iArr4 = iArr4;
                                                iArr5 = iArr9;
                                                iArr3 = iArr3;
                                            }
                                            zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                        } else if (jArr6[0] == 0) {
                                            long[] jArr1119 = zzahgVar3.zzi;
                                            jArr1119.getClass();
                                            j13 = jArr1119[0];
                                            while (i40 < jArr3.length) {
                                                jArr3[i40] = zzfk.zzq(jArr3[i40] - j13, 1000000L, zzahgVar3.zzc);
                                            }
                                            zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, zzfk.zzq(j8 - j13, 1000000L, zzahgVar3.zzc));
                                        } else {
                                            length = 1;
                                            if (zzahgVar3.zzb == 1) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            iArr3 = new int[length];
                                            iArr4 = new int[length];
                                            jArr7 = zzahgVar3.zzi;
                                            jArr7.getClass();
                                            i25 = 0;
                                            i26 = 0;
                                            z7 = false;
                                            i27 = 0;
                                            while (true) {
                                                jArr8 = zzahgVar3.zzh;
                                                i28 = i15;
                                                if (i25 < jArr8.length) {
                                                    break;
                                                    break;
                                                }
                                                long[] jArr11110 = jArr4;
                                                int[] iArr11113 = iArr2;
                                                j12 = jArr7[i25];
                                                if (j12 != -1) {
                                                    long j2115 = jArr8[i25];
                                                    boolean z116 = z7;
                                                    i36 = i27;
                                                    iArr11 = iArr;
                                                    long jZzq111 = zzfk.zzq(j2115, zzahgVar3.zzc, zzahgVar3.zzd);
                                                    i37 = 1;
                                                    iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                                    iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq111, z6, false);
                                                    while (true) {
                                                        i38 = iArr3[i25];
                                                        i39 = iArr4[i25];
                                                        if (i38 >= i39) {
                                                            break;
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                        iArr3[i25] = i38 + 1;
                                                        i37 = 1;
                                                    }
                                                    i26 += i39 - i38;
                                                    if (i36 != i38) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    z7 = z10 | z116;
                                                    i27 = i39;
                                                } else {
                                                    iArr11 = iArr;
                                                    z7 = z7;
                                                }
                                                i25++;
                                                i15 = i28;
                                                iArr2 = iArr11113;
                                                iArr = iArr11;
                                                jArr4 = jArr11110;
                                            }
                                            jArr9 = jArr4;
                                            iArr5 = iArr2;
                                            boolean z117 = z7;
                                            iArr6 = iArr;
                                            if (i26 != iZzb) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            z9 = z117 | z8;
                                            if (z9) {
                                                jArr10 = new long[i26];
                                            } else {
                                                jArr10 = jArr9;
                                            }
                                            if (z9) {
                                                iArr7 = new int[i26];
                                            } else {
                                                iArr7 = iArr5;
                                            }
                                            if (true == z9) {
                                                i28 = 0;
                                            }
                                            if (z9) {
                                                iArr8 = new int[i26];
                                            } else {
                                                iArr8 = iArr6;
                                            }
                                            jArr11 = new long[i26];
                                            i29 = 0;
                                            i30 = 0;
                                            j10 = 0;
                                            while (i29 < zzahgVar3.zzh.length) {
                                                j11 = zzahgVar3.zzi[i29];
                                                i31 = iArr3[i29];
                                                i32 = iArr4[i29];
                                                if (z9) {
                                                    int i816 = i32 - i31;
                                                    System.arraycopy(jArr9, i31, jArr10, i30, i816);
                                                    iArr9 = iArr5;
                                                    System.arraycopy(iArr9, i31, iArr7, i30, i816);
                                                    iArr10 = iArr6;
                                                    System.arraycopy(iArr10, i31, iArr8, i30, i816);
                                                } else {
                                                    iArr9 = iArr5;
                                                    iArr10 = iArr6;
                                                }
                                                i33 = i28;
                                                while (i31 < i32) {
                                                    int i817 = i32;
                                                    i34 = i33;
                                                    long jZzq112 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                                    int[] iArr11114 = iArr8;
                                                    long[] jArr11111 = jArr3;
                                                    jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                                    int[] iArr11115 = iArr10;
                                                    long[] jArr11112 = jArr10;
                                                    long j2116 = j10;
                                                    if (zzr(zzahgVar3.zzb)) {
                                                        jZzq2 = Math.max(0L, jZzq2);
                                                    }
                                                    jArr11[i30] = jZzq112 + jZzq2;
                                                    if (z9) {
                                                        i35 = i34;
                                                        if (iArr7[i30] > i35) {
                                                            i33 = iArr9[i31];
                                                        }
                                                        i30++;
                                                        i31++;
                                                        i32 = i817;
                                                        jArr3 = jArr11111;
                                                        iArr10 = iArr11115;
                                                        j10 = j2116;
                                                        iArr8 = iArr11114;
                                                        jArr10 = jArr11112;
                                                    } else {
                                                        i35 = i34;
                                                    }
                                                    i33 = i35;
                                                    i30++;
                                                    i31++;
                                                    i32 = i817;
                                                    jArr3 = jArr11111;
                                                    iArr10 = iArr11115;
                                                    j10 = j2116;
                                                    iArr8 = iArr11114;
                                                    jArr10 = jArr11112;
                                                }
                                                int[] iArr11116 = iArr10;
                                                long j2117 = j10 + zzahgVar3.zzh[i29];
                                                i29++;
                                                i28 = i33;
                                                jArr3 = jArr3;
                                                iArr6 = iArr11116;
                                                iArr8 = iArr8;
                                                jArr10 = jArr10;
                                                j10 = j2117;
                                                iArr4 = iArr4;
                                                iArr5 = iArr9;
                                                iArr3 = iArr3;
                                            }
                                            zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                        }
                                    }
                                }
                            } else {
                                iZzo4 = 0;
                            }
                            iZzo5 = -1;
                            iZza = zzagpVar.zza();
                            String str15 = zzahgVar2.zzf.zzm;
                            iZzo6 = iZzo9;
                            if (iZza != -1) {
                                jArrCopyOf = new long[iZzb];
                                iArrCopyOf = new int[iZzb];
                                jArrCopyOf2 = new long[iZzb];
                                i12 = iZzo4;
                                iArrCopyOf2 = new int[iZzb];
                                zzahgVar3 = zzahgVar2;
                                iZzf = iZzo2;
                                i13 = iZzo3;
                                i14 = iZzo5;
                                i15 = 0;
                                i16 = 0;
                                iZzo7 = 0;
                                i17 = 0;
                                j6 = 0;
                                j7 = 0;
                                i18 = iZzo;
                                i19 = 0;
                                while (true) {
                                    if (i19 < iZzb) {
                                        i18 = i18;
                                        break;
                                    }
                                    j9 = j6;
                                    zZza = true;
                                    while (true) {
                                        if (i16 != 0) {
                                            i21 = i16;
                                            break;
                                        }
                                        zZza = zzagkVar.zza();
                                        if (zZza) {
                                            i21 = 0;
                                            break;
                                        }
                                        int i614 = i14;
                                        long j112 = zzagkVar.zzd;
                                        i16 = zzagkVar.zzc;
                                        j9 = j112;
                                        i18 = i18;
                                        i14 = i614;
                                        iZzb = iZzb;
                                    }
                                    if (!zZza) {
                                        zzes.zzf(str, "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i19);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i19);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i19);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i19);
                                        iZzb = i19;
                                        break;
                                    }
                                    iZzf2 = i17;
                                    if (zzfbVar3 != null) {
                                        while (iZzo7 == 0) {
                                            if (i13 > 0) {
                                                iZzo7 = 0;
                                                break;
                                            }
                                            i13--;
                                            iZzo7 = zzfbVar3.zzo();
                                            iZzf2 = zzfbVar3.zzf();
                                        }
                                        iZzo7--;
                                    }
                                    jArrCopyOf[i19] = j9;
                                    iZzc = zzagpVar.zzc();
                                    iArrCopyOf[i19] = iZzc;
                                    if (iZzc > i15) {
                                        i22 = iZzc;
                                    } else {
                                        i22 = i15;
                                    }
                                    jArrCopyOf2[i19] = j7 + ((long) iZzf2);
                                    if (zzfbVar2 == null) {
                                        i23 = 1;
                                    } else {
                                        i23 = 0;
                                    }
                                    iArrCopyOf2[i19] = i23;
                                    iZzo8 = i14;
                                    if (i19 == iZzo8) {
                                        iArrCopyOf2[i19] = 1;
                                        i12--;
                                        if (i12 > 0) {
                                            zzfbVar2.getClass();
                                            iZzo8 = zzfbVar2.zzo() - 1;
                                        }
                                    }
                                    zzfb zzfbVar10 = zzfbVar2;
                                    int i615 = iZzo8;
                                    j7 += (long) iZzf;
                                    i24 = iZzo6 - 1;
                                    if (i24 == 0) {
                                        iZzo6 = i24;
                                    } else if (i18 > 0) {
                                        iZzo6 = zzfbVar.zzo();
                                        iZzf = zzfbVar.zzf();
                                        i18--;
                                    } else {
                                        iZzo6 = 0;
                                    }
                                    long j113 = j9 + ((long) iArrCopyOf[i19]);
                                    i19++;
                                    i17 = iZzf2;
                                    i14 = i615;
                                    i15 = i22;
                                    i16 = i21 - 1;
                                    iZzb = iZzb;
                                    zzagkVar = zzagkVar;
                                    zzfbVar2 = zzfbVar10;
                                    i18 = i18;
                                    j6 = j113;
                                }
                                long j220 = j7 + ((long) i17);
                                if (zzfbVar3 != null) {
                                    z5 = true;
                                    break;
                                }
                                while (true) {
                                    if (i13 > 0) {
                                        z5 = true;
                                        break;
                                    }
                                    if (zzfbVar3.zzo() != 0) {
                                        z5 = false;
                                        break;
                                    }
                                    zzfbVar3.zzf();
                                    i13--;
                                }
                                if (i12 == 0) {
                                    if (iZzo6 == 0) {
                                        if (i16 == 0) {
                                            z5 = z5;
                                            i16 = i16;
                                            iZzo7 = iZzo7;
                                            zzahgVar3 = zzahgVar3;
                                            i18 = i18;
                                            i20 = 0;
                                            iZzo6 = 0;
                                        } else if (i18 == 0) {
                                            z5 = z5;
                                            iZzo7 = iZzo7;
                                            zzahgVar3 = zzahgVar3;
                                            i18 = i18;
                                            i20 = 0;
                                            iZzo6 = 0;
                                            i16 = 0;
                                        } else if (iZzo7 == 0) {
                                            z5 = z5;
                                            iZzo7 = iZzo7;
                                            zzahgVar3 = zzahgVar3;
                                            i20 = 0;
                                            iZzo6 = 0;
                                            i16 = 0;
                                            i18 = 0;
                                        } else if (z5) {
                                            zzahgVar3 = zzahgVar3;
                                            i20 = 0;
                                            iZzo6 = 0;
                                            i16 = 0;
                                            i18 = 0;
                                            iZzo7 = 0;
                                            z5 = false;
                                        } else {
                                            jArrCopyOf = jArrCopyOf;
                                            zzahgVar3 = zzahgVar3;
                                        }
                                        int i616 = zzahgVar3.zza;
                                        StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                                        sb5.append(i616);
                                        sb5.append(": remainingSynchronizationSamples ");
                                        sb5.append(i20);
                                        sb5.append(", remainingSamplesAtTimestampDelta ");
                                        sb5.append(iZzo6);
                                        sb5.append(", remainingSamplesInChunk ");
                                        sb5.append(i16);
                                        sb5.append(", remainingTimestampDeltaChanges ");
                                        sb5.append(i18);
                                        sb5.append(", remainingSamplesAtTimestampOffset ");
                                        sb5.append(iZzo7);
                                        if (true != z5) {
                                            str4 = ", ctts invalid";
                                        } else {
                                            str4 = "";
                                        }
                                        sb5.append(str4);
                                        zzes.zzf(str, sb5.toString());
                                    } else {
                                        i20 = 0;
                                    }
                                    j8 = j220;
                                    iArr = iArrCopyOf2;
                                    jArr3 = jArrCopyOf2;
                                    jArr4 = jArrCopyOf;
                                    iArr2 = iArrCopyOf;
                                    iZzb = iZzb;
                                } else {
                                    i20 = i12;
                                }
                                int i617 = zzahgVar3.zza;
                                StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
                                sb6.append(i617);
                                sb6.append(": remainingSynchronizationSamples ");
                                sb6.append(i20);
                                sb6.append(", remainingSamplesAtTimestampDelta ");
                                sb6.append(iZzo6);
                                sb6.append(", remainingSamplesInChunk ");
                                sb6.append(i16);
                                sb6.append(", remainingTimestampDeltaChanges ");
                                sb6.append(i18);
                                sb6.append(", remainingSamplesAtTimestampOffset ");
                                sb6.append(iZzo7);
                                if (true != z5) {
                                    str4 = ", ctts invalid";
                                } else {
                                    str4 = "";
                                }
                                sb6.append(str4);
                                zzes.zzf(str, sb6.toString());
                                j8 = j220;
                                iArr = iArrCopyOf2;
                                jArr3 = jArrCopyOf2;
                                jArr4 = jArrCopyOf;
                                iArr2 = iArrCopyOf;
                                iZzb = iZzb;
                            } else {
                                jArrCopyOf = new long[iZzb];
                                iArrCopyOf = new int[iZzb];
                                jArrCopyOf2 = new long[iZzb];
                                i12 = iZzo4;
                                iArrCopyOf2 = new int[iZzb];
                                zzahgVar3 = zzahgVar2;
                                iZzf = iZzo2;
                                i13 = iZzo3;
                                i14 = iZzo5;
                                i15 = 0;
                                i16 = 0;
                                iZzo7 = 0;
                                i17 = 0;
                                j6 = 0;
                                j7 = 0;
                                i18 = iZzo;
                                i19 = 0;
                                while (true) {
                                    if (i19 < iZzb) {
                                        i18 = i18;
                                        break;
                                    }
                                    j9 = j6;
                                    zZza = true;
                                    while (true) {
                                        if (i16 != 0) {
                                            i21 = i16;
                                            break;
                                        }
                                        zZza = zzagkVar.zza();
                                        if (zZza) {
                                            i21 = 0;
                                            break;
                                        }
                                        int i618 = i14;
                                        long j114 = zzagkVar.zzd;
                                        i16 = zzagkVar.zzc;
                                        j9 = j114;
                                        i18 = i18;
                                        i14 = i618;
                                        iZzb = iZzb;
                                    }
                                    if (!zZza) {
                                        zzes.zzf(str, "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i19);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i19);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i19);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i19);
                                        iZzb = i19;
                                        break;
                                    }
                                    iZzf2 = i17;
                                    if (zzfbVar3 != null) {
                                        while (iZzo7 == 0) {
                                            if (i13 > 0) {
                                                iZzo7 = 0;
                                                break;
                                            }
                                            i13--;
                                            iZzo7 = zzfbVar3.zzo();
                                            iZzf2 = zzfbVar3.zzf();
                                        }
                                        iZzo7--;
                                    }
                                    jArrCopyOf[i19] = j9;
                                    iZzc = zzagpVar.zzc();
                                    iArrCopyOf[i19] = iZzc;
                                    if (iZzc > i15) {
                                        i22 = iZzc;
                                    } else {
                                        i22 = i15;
                                    }
                                    jArrCopyOf2[i19] = j7 + ((long) iZzf2);
                                    if (zzfbVar2 == null) {
                                        i23 = 1;
                                    } else {
                                        i23 = 0;
                                    }
                                    iArrCopyOf2[i19] = i23;
                                    iZzo8 = i14;
                                    if (i19 == iZzo8) {
                                        iArrCopyOf2[i19] = 1;
                                        i12--;
                                        if (i12 > 0) {
                                            zzfbVar2.getClass();
                                            iZzo8 = zzfbVar2.zzo() - 1;
                                        }
                                    }
                                    zzfb zzfbVar11 = zzfbVar2;
                                    int i619 = iZzo8;
                                    j7 += (long) iZzf;
                                    i24 = iZzo6 - 1;
                                    if (i24 == 0) {
                                        iZzo6 = i24;
                                    } else if (i18 > 0) {
                                        iZzo6 = zzfbVar.zzo();
                                        iZzf = zzfbVar.zzf();
                                        i18--;
                                    } else {
                                        iZzo6 = 0;
                                    }
                                    long j115 = j9 + ((long) iArrCopyOf[i19]);
                                    i19++;
                                    i17 = iZzf2;
                                    i14 = i619;
                                    i15 = i22;
                                    i16 = i21 - 1;
                                    iZzb = iZzb;
                                    zzagkVar = zzagkVar;
                                    zzfbVar2 = zzfbVar11;
                                    i18 = i18;
                                    j6 = j115;
                                }
                                long j221 = j7 + ((long) i17);
                                if (zzfbVar3 != null) {
                                    z5 = true;
                                    break;
                                }
                                while (true) {
                                    if (i13 > 0) {
                                        z5 = true;
                                        break;
                                    }
                                    if (zzfbVar3.zzo() != 0) {
                                        z5 = false;
                                        break;
                                    }
                                    zzfbVar3.zzf();
                                    i13--;
                                }
                                if (i12 == 0) {
                                    if (iZzo6 == 0) {
                                        if (i16 == 0) {
                                            z5 = z5;
                                            i16 = i16;
                                            iZzo7 = iZzo7;
                                            zzahgVar3 = zzahgVar3;
                                            i18 = i18;
                                            i20 = 0;
                                            iZzo6 = 0;
                                        } else if (i18 == 0) {
                                            z5 = z5;
                                            iZzo7 = iZzo7;
                                            zzahgVar3 = zzahgVar3;
                                            i18 = i18;
                                            i20 = 0;
                                            iZzo6 = 0;
                                            i16 = 0;
                                        } else if (iZzo7 == 0) {
                                            z5 = z5;
                                            iZzo7 = iZzo7;
                                            zzahgVar3 = zzahgVar3;
                                            i20 = 0;
                                            iZzo6 = 0;
                                            i16 = 0;
                                            i18 = 0;
                                        } else if (z5) {
                                            zzahgVar3 = zzahgVar3;
                                            i20 = 0;
                                            iZzo6 = 0;
                                            i16 = 0;
                                            i18 = 0;
                                            iZzo7 = 0;
                                            z5 = false;
                                        } else {
                                            jArrCopyOf = jArrCopyOf;
                                            zzahgVar3 = zzahgVar3;
                                        }
                                        int i6110 = zzahgVar3.zza;
                                        StringBuilder sb7 = new StringBuilder("Inconsistent stbl box for track ");
                                        sb7.append(i6110);
                                        sb7.append(": remainingSynchronizationSamples ");
                                        sb7.append(i20);
                                        sb7.append(", remainingSamplesAtTimestampDelta ");
                                        sb7.append(iZzo6);
                                        sb7.append(", remainingSamplesInChunk ");
                                        sb7.append(i16);
                                        sb7.append(", remainingTimestampDeltaChanges ");
                                        sb7.append(i18);
                                        sb7.append(", remainingSamplesAtTimestampOffset ");
                                        sb7.append(iZzo7);
                                        if (true != z5) {
                                            str4 = ", ctts invalid";
                                        } else {
                                            str4 = "";
                                        }
                                        sb7.append(str4);
                                        zzes.zzf(str, sb7.toString());
                                    } else {
                                        i20 = 0;
                                    }
                                    j8 = j221;
                                    iArr = iArrCopyOf2;
                                    jArr3 = jArrCopyOf2;
                                    jArr4 = jArrCopyOf;
                                    iArr2 = iArrCopyOf;
                                    iZzb = iZzb;
                                } else {
                                    i20 = i12;
                                }
                                int i6111 = zzahgVar3.zza;
                                StringBuilder sb8 = new StringBuilder("Inconsistent stbl box for track ");
                                sb8.append(i6111);
                                sb8.append(": remainingSynchronizationSamples ");
                                sb8.append(i20);
                                sb8.append(", remainingSamplesAtTimestampDelta ");
                                sb8.append(iZzo6);
                                sb8.append(", remainingSamplesInChunk ");
                                sb8.append(i16);
                                sb8.append(", remainingTimestampDeltaChanges ");
                                sb8.append(i18);
                                sb8.append(", remainingSamplesAtTimestampOffset ");
                                sb8.append(iZzo7);
                                if (true != z5) {
                                    str4 = ", ctts invalid";
                                } else {
                                    str4 = "";
                                }
                                sb8.append(str4);
                                zzes.zzf(str, sb8.toString());
                                j8 = j221;
                                iArr = iArrCopyOf2;
                                jArr3 = jArrCopyOf2;
                                jArr4 = jArrCopyOf;
                                iArr2 = iArrCopyOf;
                                iZzb = iZzb;
                            }
                            jZzq = zzfk.zzq(j8, 1000000L, zzahgVar3.zzc);
                            jArr5 = zzahgVar3.zzh;
                            if (jArr5 == null) {
                                zzfk.zzC(jArr3, 1000000L, zzahgVar3.zzc);
                                zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, jZzq);
                            } else if (jArr5.length == 1) {
                                jArr6 = zzahgVar3.zzh;
                                length = jArr6.length;
                                if (length != 1) {
                                    if (zzahgVar3.zzb == 1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    iArr3 = new int[length];
                                    iArr4 = new int[length];
                                    jArr7 = zzahgVar3.zzi;
                                    jArr7.getClass();
                                    i25 = 0;
                                    i26 = 0;
                                    z7 = false;
                                    i27 = 0;
                                    while (true) {
                                        jArr8 = zzahgVar3.zzh;
                                        i28 = i15;
                                        if (i25 < jArr8.length) {
                                            break;
                                            break;
                                        }
                                        long[] jArr11113 = jArr4;
                                        int[] iArr11117 = iArr2;
                                        j12 = jArr7[i25];
                                        if (j12 != -1) {
                                            long j2118 = jArr8[i25];
                                            boolean z118 = z7;
                                            i36 = i27;
                                            iArr11 = iArr;
                                            long jZzq113 = zzfk.zzq(j2118, zzahgVar3.zzc, zzahgVar3.zzd);
                                            i37 = 1;
                                            iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                            iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq113, z6, false);
                                            while (true) {
                                                i38 = iArr3[i25];
                                                i39 = iArr4[i25];
                                                if (i38 >= i39) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i25] = i38 + 1;
                                                i37 = 1;
                                            }
                                            i26 += i39 - i38;
                                            if (i36 != i38) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            z7 = z10 | z118;
                                            i27 = i39;
                                        } else {
                                            iArr11 = iArr;
                                            z7 = z7;
                                        }
                                        i25++;
                                        i15 = i28;
                                        iArr2 = iArr11117;
                                        iArr = iArr11;
                                        jArr4 = jArr11113;
                                    }
                                    jArr9 = jArr4;
                                    iArr5 = iArr2;
                                    boolean z119 = z7;
                                    iArr6 = iArr;
                                    if (i26 != iZzb) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    z9 = z119 | z8;
                                    if (z9) {
                                        jArr10 = new long[i26];
                                    } else {
                                        jArr10 = jArr9;
                                    }
                                    if (z9) {
                                        iArr7 = new int[i26];
                                    } else {
                                        iArr7 = iArr5;
                                    }
                                    if (true == z9) {
                                        i28 = 0;
                                    }
                                    if (z9) {
                                        iArr8 = new int[i26];
                                    } else {
                                        iArr8 = iArr6;
                                    }
                                    jArr11 = new long[i26];
                                    i29 = 0;
                                    i30 = 0;
                                    j10 = 0;
                                    while (i29 < zzahgVar3.zzh.length) {
                                        j11 = zzahgVar3.zzi[i29];
                                        i31 = iArr3[i29];
                                        i32 = iArr4[i29];
                                        if (z9) {
                                            int i818 = i32 - i31;
                                            System.arraycopy(jArr9, i31, jArr10, i30, i818);
                                            iArr9 = iArr5;
                                            System.arraycopy(iArr9, i31, iArr7, i30, i818);
                                            iArr10 = iArr6;
                                            System.arraycopy(iArr10, i31, iArr8, i30, i818);
                                        } else {
                                            iArr9 = iArr5;
                                            iArr10 = iArr6;
                                        }
                                        i33 = i28;
                                        while (i31 < i32) {
                                            int i819 = i32;
                                            i34 = i33;
                                            long jZzq114 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                            int[] iArr11118 = iArr8;
                                            long[] jArr11114 = jArr3;
                                            jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                            int[] iArr11119 = iArr10;
                                            long[] jArr11115 = jArr10;
                                            long j2119 = j10;
                                            if (zzr(zzahgVar3.zzb)) {
                                                jZzq2 = Math.max(0L, jZzq2);
                                            }
                                            jArr11[i30] = jZzq114 + jZzq2;
                                            if (z9) {
                                                i35 = i34;
                                                if (iArr7[i30] > i35) {
                                                    i33 = iArr9[i31];
                                                }
                                                i30++;
                                                i31++;
                                                i32 = i819;
                                                jArr3 = jArr11114;
                                                iArr10 = iArr11119;
                                                j10 = j2119;
                                                iArr8 = iArr11118;
                                                jArr10 = jArr11115;
                                            } else {
                                                i35 = i34;
                                            }
                                            i33 = i35;
                                            i30++;
                                            i31++;
                                            i32 = i819;
                                            jArr3 = jArr11114;
                                            iArr10 = iArr11119;
                                            j10 = j2119;
                                            iArr8 = iArr11118;
                                            jArr10 = jArr11115;
                                        }
                                        int[] iArr111110 = iArr10;
                                        long j21110 = j10 + zzahgVar3.zzh[i29];
                                        i29++;
                                        i28 = i33;
                                        jArr3 = jArr3;
                                        iArr6 = iArr111110;
                                        iArr8 = iArr8;
                                        jArr10 = jArr10;
                                        j10 = j21110;
                                        iArr4 = iArr4;
                                        iArr5 = iArr9;
                                        iArr3 = iArr3;
                                    }
                                    zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                } else if (jArr6[0] == 0) {
                                    long[] jArr11116 = zzahgVar3.zzi;
                                    jArr11116.getClass();
                                    j13 = jArr11116[0];
                                    while (i40 < jArr3.length) {
                                        jArr3[i40] = zzfk.zzq(jArr3[i40] - j13, 1000000L, zzahgVar3.zzc);
                                    }
                                    zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, zzfk.zzq(j8 - j13, 1000000L, zzahgVar3.zzc));
                                } else {
                                    length = 1;
                                    if (zzahgVar3.zzb == 1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    iArr3 = new int[length];
                                    iArr4 = new int[length];
                                    jArr7 = zzahgVar3.zzi;
                                    jArr7.getClass();
                                    i25 = 0;
                                    i26 = 0;
                                    z7 = false;
                                    i27 = 0;
                                    while (true) {
                                        jArr8 = zzahgVar3.zzh;
                                        i28 = i15;
                                        if (i25 < jArr8.length) {
                                            break;
                                            break;
                                        }
                                        long[] jArr11117 = jArr4;
                                        int[] iArr111111 = iArr2;
                                        j12 = jArr7[i25];
                                        if (j12 != -1) {
                                            long j21111 = jArr8[i25];
                                            boolean z1110 = z7;
                                            i36 = i27;
                                            iArr11 = iArr;
                                            long jZzq115 = zzfk.zzq(j21111, zzahgVar3.zzc, zzahgVar3.zzd);
                                            i37 = 1;
                                            iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                            iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq115, z6, false);
                                            while (true) {
                                                i38 = iArr3[i25];
                                                i39 = iArr4[i25];
                                                if (i38 >= i39) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i25] = i38 + 1;
                                                i37 = 1;
                                            }
                                            i26 += i39 - i38;
                                            if (i36 != i38) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            z7 = z10 | z1110;
                                            i27 = i39;
                                        } else {
                                            iArr11 = iArr;
                                            z7 = z7;
                                        }
                                        i25++;
                                        i15 = i28;
                                        iArr2 = iArr111111;
                                        iArr = iArr11;
                                        jArr4 = jArr11117;
                                    }
                                    jArr9 = jArr4;
                                    iArr5 = iArr2;
                                    boolean z1111 = z7;
                                    iArr6 = iArr;
                                    if (i26 != iZzb) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    z9 = z1111 | z8;
                                    if (z9) {
                                        jArr10 = new long[i26];
                                    } else {
                                        jArr10 = jArr9;
                                    }
                                    if (z9) {
                                        iArr7 = new int[i26];
                                    } else {
                                        iArr7 = iArr5;
                                    }
                                    if (true == z9) {
                                        i28 = 0;
                                    }
                                    if (z9) {
                                        iArr8 = new int[i26];
                                    } else {
                                        iArr8 = iArr6;
                                    }
                                    jArr11 = new long[i26];
                                    i29 = 0;
                                    i30 = 0;
                                    j10 = 0;
                                    while (i29 < zzahgVar3.zzh.length) {
                                        j11 = zzahgVar3.zzi[i29];
                                        i31 = iArr3[i29];
                                        i32 = iArr4[i29];
                                        if (z9) {
                                            int i8110 = i32 - i31;
                                            System.arraycopy(jArr9, i31, jArr10, i30, i8110);
                                            iArr9 = iArr5;
                                            System.arraycopy(iArr9, i31, iArr7, i30, i8110);
                                            iArr10 = iArr6;
                                            System.arraycopy(iArr10, i31, iArr8, i30, i8110);
                                        } else {
                                            iArr9 = iArr5;
                                            iArr10 = iArr6;
                                        }
                                        i33 = i28;
                                        while (i31 < i32) {
                                            int i8111 = i32;
                                            i34 = i33;
                                            long jZzq116 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                            int[] iArr111112 = iArr8;
                                            long[] jArr11118 = jArr3;
                                            jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                            int[] iArr111113 = iArr10;
                                            long[] jArr11119 = jArr10;
                                            long j21112 = j10;
                                            if (zzr(zzahgVar3.zzb)) {
                                                jZzq2 = Math.max(0L, jZzq2);
                                            }
                                            jArr11[i30] = jZzq116 + jZzq2;
                                            if (z9) {
                                                i35 = i34;
                                                if (iArr7[i30] > i35) {
                                                    i33 = iArr9[i31];
                                                }
                                                i30++;
                                                i31++;
                                                i32 = i8111;
                                                jArr3 = jArr11118;
                                                iArr10 = iArr111113;
                                                j10 = j21112;
                                                iArr8 = iArr111112;
                                                jArr10 = jArr11119;
                                            } else {
                                                i35 = i34;
                                            }
                                            i33 = i35;
                                            i30++;
                                            i31++;
                                            i32 = i8111;
                                            jArr3 = jArr11118;
                                            iArr10 = iArr111113;
                                            j10 = j21112;
                                            iArr8 = iArr111112;
                                            jArr10 = jArr11119;
                                        }
                                        int[] iArr111114 = iArr10;
                                        long j21113 = j10 + zzahgVar3.zzh[i29];
                                        i29++;
                                        i28 = i33;
                                        jArr3 = jArr3;
                                        iArr6 = iArr111114;
                                        iArr8 = iArr8;
                                        jArr10 = jArr10;
                                        j10 = j21113;
                                        iArr4 = iArr4;
                                        iArr5 = iArr9;
                                        iArr3 = iArr3;
                                    }
                                    zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                }
                            } else {
                                jArr6 = zzahgVar3.zzh;
                                length = jArr6.length;
                                if (length != 1) {
                                    if (zzahgVar3.zzb == 1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    iArr3 = new int[length];
                                    iArr4 = new int[length];
                                    jArr7 = zzahgVar3.zzi;
                                    jArr7.getClass();
                                    i25 = 0;
                                    i26 = 0;
                                    z7 = false;
                                    i27 = 0;
                                    while (true) {
                                        jArr8 = zzahgVar3.zzh;
                                        i28 = i15;
                                        if (i25 < jArr8.length) {
                                            break;
                                            break;
                                        }
                                        long[] jArr111110 = jArr4;
                                        int[] iArr111115 = iArr2;
                                        j12 = jArr7[i25];
                                        if (j12 != -1) {
                                            long j21114 = jArr8[i25];
                                            boolean z1112 = z7;
                                            i36 = i27;
                                            iArr11 = iArr;
                                            long jZzq117 = zzfk.zzq(j21114, zzahgVar3.zzc, zzahgVar3.zzd);
                                            i37 = 1;
                                            iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                            iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq117, z6, false);
                                            while (true) {
                                                i38 = iArr3[i25];
                                                i39 = iArr4[i25];
                                                if (i38 >= i39) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i25] = i38 + 1;
                                                i37 = 1;
                                            }
                                            i26 += i39 - i38;
                                            if (i36 != i38) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            z7 = z10 | z1112;
                                            i27 = i39;
                                        } else {
                                            iArr11 = iArr;
                                            z7 = z7;
                                        }
                                        i25++;
                                        i15 = i28;
                                        iArr2 = iArr111115;
                                        iArr = iArr11;
                                        jArr4 = jArr111110;
                                    }
                                    jArr9 = jArr4;
                                    iArr5 = iArr2;
                                    boolean z1113 = z7;
                                    iArr6 = iArr;
                                    if (i26 != iZzb) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    z9 = z1113 | z8;
                                    if (z9) {
                                        jArr10 = new long[i26];
                                    } else {
                                        jArr10 = jArr9;
                                    }
                                    if (z9) {
                                        iArr7 = new int[i26];
                                    } else {
                                        iArr7 = iArr5;
                                    }
                                    if (true == z9) {
                                        i28 = 0;
                                    }
                                    if (z9) {
                                        iArr8 = new int[i26];
                                    } else {
                                        iArr8 = iArr6;
                                    }
                                    jArr11 = new long[i26];
                                    i29 = 0;
                                    i30 = 0;
                                    j10 = 0;
                                    while (i29 < zzahgVar3.zzh.length) {
                                        j11 = zzahgVar3.zzi[i29];
                                        i31 = iArr3[i29];
                                        i32 = iArr4[i29];
                                        if (z9) {
                                            int i8112 = i32 - i31;
                                            System.arraycopy(jArr9, i31, jArr10, i30, i8112);
                                            iArr9 = iArr5;
                                            System.arraycopy(iArr9, i31, iArr7, i30, i8112);
                                            iArr10 = iArr6;
                                            System.arraycopy(iArr10, i31, iArr8, i30, i8112);
                                        } else {
                                            iArr9 = iArr5;
                                            iArr10 = iArr6;
                                        }
                                        i33 = i28;
                                        while (i31 < i32) {
                                            int i8113 = i32;
                                            i34 = i33;
                                            long jZzq118 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                            int[] iArr111116 = iArr8;
                                            long[] jArr111111 = jArr3;
                                            jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                            int[] iArr111117 = iArr10;
                                            long[] jArr111112 = jArr10;
                                            long j21115 = j10;
                                            if (zzr(zzahgVar3.zzb)) {
                                                jZzq2 = Math.max(0L, jZzq2);
                                            }
                                            jArr11[i30] = jZzq118 + jZzq2;
                                            if (z9) {
                                                i35 = i34;
                                                if (iArr7[i30] > i35) {
                                                    i33 = iArr9[i31];
                                                }
                                                i30++;
                                                i31++;
                                                i32 = i8113;
                                                jArr3 = jArr111111;
                                                iArr10 = iArr111117;
                                                j10 = j21115;
                                                iArr8 = iArr111116;
                                                jArr10 = jArr111112;
                                            } else {
                                                i35 = i34;
                                            }
                                            i33 = i35;
                                            i30++;
                                            i31++;
                                            i32 = i8113;
                                            jArr3 = jArr111111;
                                            iArr10 = iArr111117;
                                            j10 = j21115;
                                            iArr8 = iArr111116;
                                            jArr10 = jArr111112;
                                        }
                                        int[] iArr111118 = iArr10;
                                        long j21116 = j10 + zzahgVar3.zzh[i29];
                                        i29++;
                                        i28 = i33;
                                        jArr3 = jArr3;
                                        iArr6 = iArr111118;
                                        iArr8 = iArr8;
                                        jArr10 = jArr10;
                                        j10 = j21116;
                                        iArr4 = iArr4;
                                        iArr5 = iArr9;
                                        iArr3 = iArr3;
                                    }
                                    zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                } else if (jArr6[0] == 0) {
                                    long[] jArr111113 = zzahgVar3.zzi;
                                    jArr111113.getClass();
                                    j13 = jArr111113[0];
                                    while (i40 < jArr3.length) {
                                        jArr3[i40] = zzfk.zzq(jArr3[i40] - j13, 1000000L, zzahgVar3.zzc);
                                    }
                                    zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, zzfk.zzq(j8 - j13, 1000000L, zzahgVar3.zzc));
                                } else {
                                    length = 1;
                                    if (zzahgVar3.zzb == 1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    iArr3 = new int[length];
                                    iArr4 = new int[length];
                                    jArr7 = zzahgVar3.zzi;
                                    jArr7.getClass();
                                    i25 = 0;
                                    i26 = 0;
                                    z7 = false;
                                    i27 = 0;
                                    while (true) {
                                        jArr8 = zzahgVar3.zzh;
                                        i28 = i15;
                                        if (i25 < jArr8.length) {
                                            break;
                                            break;
                                        }
                                        long[] jArr111114 = jArr4;
                                        int[] iArr111119 = iArr2;
                                        j12 = jArr7[i25];
                                        if (j12 != -1) {
                                            long j21117 = jArr8[i25];
                                            boolean z1114 = z7;
                                            i36 = i27;
                                            iArr11 = iArr;
                                            long jZzq119 = zzfk.zzq(j21117, zzahgVar3.zzc, zzahgVar3.zzd);
                                            i37 = 1;
                                            iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                            iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq119, z6, false);
                                            while (true) {
                                                i38 = iArr3[i25];
                                                i39 = iArr4[i25];
                                                if (i38 >= i39) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i25] = i38 + 1;
                                                i37 = 1;
                                            }
                                            i26 += i39 - i38;
                                            if (i36 != i38) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            z7 = z10 | z1114;
                                            i27 = i39;
                                        } else {
                                            iArr11 = iArr;
                                            z7 = z7;
                                        }
                                        i25++;
                                        i15 = i28;
                                        iArr2 = iArr111119;
                                        iArr = iArr11;
                                        jArr4 = jArr111114;
                                    }
                                    jArr9 = jArr4;
                                    iArr5 = iArr2;
                                    boolean z1115 = z7;
                                    iArr6 = iArr;
                                    if (i26 != iZzb) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    z9 = z1115 | z8;
                                    if (z9) {
                                        jArr10 = new long[i26];
                                    } else {
                                        jArr10 = jArr9;
                                    }
                                    if (z9) {
                                        iArr7 = new int[i26];
                                    } else {
                                        iArr7 = iArr5;
                                    }
                                    if (true == z9) {
                                        i28 = 0;
                                    }
                                    if (z9) {
                                        iArr8 = new int[i26];
                                    } else {
                                        iArr8 = iArr6;
                                    }
                                    jArr11 = new long[i26];
                                    i29 = 0;
                                    i30 = 0;
                                    j10 = 0;
                                    while (i29 < zzahgVar3.zzh.length) {
                                        j11 = zzahgVar3.zzi[i29];
                                        i31 = iArr3[i29];
                                        i32 = iArr4[i29];
                                        if (z9) {
                                            int i8114 = i32 - i31;
                                            System.arraycopy(jArr9, i31, jArr10, i30, i8114);
                                            iArr9 = iArr5;
                                            System.arraycopy(iArr9, i31, iArr7, i30, i8114);
                                            iArr10 = iArr6;
                                            System.arraycopy(iArr10, i31, iArr8, i30, i8114);
                                        } else {
                                            iArr9 = iArr5;
                                            iArr10 = iArr6;
                                        }
                                        i33 = i28;
                                        while (i31 < i32) {
                                            int i8115 = i32;
                                            i34 = i33;
                                            long jZzq1110 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                            int[] iArr1111110 = iArr8;
                                            long[] jArr111115 = jArr3;
                                            jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                            int[] iArr1111111 = iArr10;
                                            long[] jArr111116 = jArr10;
                                            long j21118 = j10;
                                            if (zzr(zzahgVar3.zzb)) {
                                                jZzq2 = Math.max(0L, jZzq2);
                                            }
                                            jArr11[i30] = jZzq1110 + jZzq2;
                                            if (z9) {
                                                i35 = i34;
                                                if (iArr7[i30] > i35) {
                                                    i33 = iArr9[i31];
                                                }
                                                i30++;
                                                i31++;
                                                i32 = i8115;
                                                jArr3 = jArr111115;
                                                iArr10 = iArr1111111;
                                                j10 = j21118;
                                                iArr8 = iArr1111110;
                                                jArr10 = jArr111116;
                                            } else {
                                                i35 = i34;
                                            }
                                            i33 = i35;
                                            i30++;
                                            i31++;
                                            i32 = i8115;
                                            jArr3 = jArr111115;
                                            iArr10 = iArr1111111;
                                            j10 = j21118;
                                            iArr8 = iArr1111110;
                                            jArr10 = jArr111116;
                                        }
                                        int[] iArr1111112 = iArr10;
                                        long j21119 = j10 + zzahgVar3.zzh[i29];
                                        i29++;
                                        i28 = i33;
                                        jArr3 = jArr3;
                                        iArr6 = iArr1111112;
                                        iArr8 = iArr8;
                                        jArr10 = jArr10;
                                        j10 = j21119;
                                        iArr4 = iArr4;
                                        iArr5 = iArr9;
                                        iArr3 = iArr3;
                                    }
                                    zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                }
                            }
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(zzahjVar);
                    } else {
                        arrayList2 = arrayList;
                    }
                }
                zzahgVar = null;
                zzahgVar2 = (zzahg) zzfqwVar.apply(zzahgVar);
                if (zzahgVar2 != null) {
                    zzagh zzaghVarZza8 = zzaghVar2.zza(1835297121);
                    zzaghVarZza8.getClass();
                    zzagh zzaghVarZza9 = zzaghVarZza8.zza(1835626086);
                    zzaghVarZza9.getClass();
                    zzaghVarZza = zzaghVarZza9.zza(1937007212);
                    zzaghVarZza.getClass();
                    zzagiVarZzb = zzaghVarZza.zzb(1937011578);
                    if (zzagiVarZzb != null) {
                        zzagpVar = new zzago(zzagiVarZzb, zzahgVar2.zzf);
                    } else {
                        zzagiVarZzb2 = zzaghVarZza.zzb(1937013298);
                        if (zzagiVarZzb2 != null) {
                            throw zzcd.zza("Track has no sample table size information", null);
                        }
                        zzagpVar = new zzagp(zzagiVarZzb2);
                    }
                    iZzb = zzagpVar.zzb();
                    if (iZzb == 0) {
                        zzahjVar = new zzahj(zzahgVar2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                    } else {
                        zzagiVarZzb3 = zzaghVarZza.zzb(1937007471);
                        if (zzagiVarZzb3 == null) {
                            zzagi zzagiVarZzb14 = zzaghVarZza.zzb(1668232756);
                            zzagiVarZzb14.getClass();
                            zzagiVar = zzagiVarZzb14;
                            z4 = true;
                        } else {
                            zzagiVar = zzagiVarZzb3;
                            z4 = false;
                        }
                        zzfb zzfbVar12 = zzagiVar.zza;
                        zzagi zzagiVarZzb15 = zzaghVarZza.zzb(1937011555);
                        zzagiVarZzb15.getClass();
                        zzfb zzfbVar13 = zzagiVarZzb15.zza;
                        zzagi zzagiVarZzb16 = zzaghVarZza.zzb(1937011827);
                        zzagiVarZzb16.getClass();
                        zzfbVar = zzagiVarZzb16.zza;
                        zzagiVarZzb4 = zzaghVarZza.zzb(1937011571);
                        if (zzagiVarZzb4 != null) {
                            zzfbVar2 = zzagiVarZzb4.zza;
                        } else {
                            zzfbVar2 = null;
                        }
                        zzagiVarZzb5 = zzaghVarZza.zzb(1668576371);
                        if (zzagiVarZzb5 != null) {
                            zzfbVar3 = zzagiVarZzb5.zza;
                        } else {
                            zzfbVar3 = null;
                        }
                        zzagkVar = new zzagk(zzfbVar13, zzfbVar12, z4);
                        zzfbVar.zzG(12);
                        iZzo = zzfbVar.zzo() + i5;
                        int iZzo10 = zzfbVar.zzo();
                        iZzo2 = zzfbVar.zzo();
                        if (zzfbVar3 != null) {
                            zzfbVar3.zzG(12);
                            iZzo3 = zzfbVar3.zzo();
                        } else {
                            iZzo3 = 0;
                        }
                        if (zzfbVar2 != null) {
                            zzfbVar2.zzG(12);
                            iZzo4 = zzfbVar2.zzo();
                            if (iZzo4 > 0) {
                                iZzo5 = zzfbVar2.zzo() + i5;
                            } else {
                                zzfbVar2 = null;
                            }
                            iZza = zzagpVar.zza();
                            String str16 = zzahgVar2.zzf.zzm;
                            iZzo6 = iZzo10;
                            if (iZza != -1) {
                                jArrCopyOf = new long[iZzb];
                                iArrCopyOf = new int[iZzb];
                                jArrCopyOf2 = new long[iZzb];
                                i12 = iZzo4;
                                iArrCopyOf2 = new int[iZzb];
                                zzahgVar3 = zzahgVar2;
                                iZzf = iZzo2;
                                i13 = iZzo3;
                                i14 = iZzo5;
                                i15 = 0;
                                i16 = 0;
                                iZzo7 = 0;
                                i17 = 0;
                                j6 = 0;
                                j7 = 0;
                                i18 = iZzo;
                                i19 = 0;
                                while (true) {
                                    if (i19 < iZzb) {
                                        i18 = i18;
                                        break;
                                    }
                                    j9 = j6;
                                    zZza = true;
                                    while (true) {
                                        if (i16 != 0) {
                                            i21 = i16;
                                            break;
                                        }
                                        zZza = zzagkVar.zza();
                                        if (zZza) {
                                            i21 = 0;
                                            break;
                                        }
                                        int i6112 = i14;
                                        long j116 = zzagkVar.zzd;
                                        i16 = zzagkVar.zzc;
                                        j9 = j116;
                                        i18 = i18;
                                        i14 = i6112;
                                        iZzb = iZzb;
                                    }
                                    if (!zZza) {
                                        zzes.zzf(str, "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i19);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i19);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i19);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i19);
                                        iZzb = i19;
                                        break;
                                    }
                                    iZzf2 = i17;
                                    if (zzfbVar3 != null) {
                                        while (iZzo7 == 0) {
                                            if (i13 > 0) {
                                                iZzo7 = 0;
                                                break;
                                            }
                                            i13--;
                                            iZzo7 = zzfbVar3.zzo();
                                            iZzf2 = zzfbVar3.zzf();
                                        }
                                        iZzo7--;
                                    }
                                    jArrCopyOf[i19] = j9;
                                    iZzc = zzagpVar.zzc();
                                    iArrCopyOf[i19] = iZzc;
                                    if (iZzc > i15) {
                                        i22 = iZzc;
                                    } else {
                                        i22 = i15;
                                    }
                                    jArrCopyOf2[i19] = j7 + ((long) iZzf2);
                                    if (zzfbVar2 == null) {
                                        i23 = 1;
                                    } else {
                                        i23 = 0;
                                    }
                                    iArrCopyOf2[i19] = i23;
                                    iZzo8 = i14;
                                    if (i19 == iZzo8) {
                                        iArrCopyOf2[i19] = 1;
                                        i12--;
                                        if (i12 > 0) {
                                            zzfbVar2.getClass();
                                            iZzo8 = zzfbVar2.zzo() - 1;
                                        }
                                    }
                                    zzfb zzfbVar14 = zzfbVar2;
                                    int i6113 = iZzo8;
                                    j7 += (long) iZzf;
                                    i24 = iZzo6 - 1;
                                    if (i24 == 0) {
                                        iZzo6 = i24;
                                    } else if (i18 > 0) {
                                        iZzo6 = zzfbVar.zzo();
                                        iZzf = zzfbVar.zzf();
                                        i18--;
                                    } else {
                                        iZzo6 = 0;
                                    }
                                    long j117 = j9 + ((long) iArrCopyOf[i19]);
                                    i19++;
                                    i17 = iZzf2;
                                    i14 = i6113;
                                    i15 = i22;
                                    i16 = i21 - 1;
                                    iZzb = iZzb;
                                    zzagkVar = zzagkVar;
                                    zzfbVar2 = zzfbVar14;
                                    i18 = i18;
                                    j6 = j117;
                                }
                                long j222 = j7 + ((long) i17);
                                if (zzfbVar3 != null) {
                                    z5 = true;
                                    break;
                                }
                                while (true) {
                                    if (i13 > 0) {
                                        z5 = true;
                                        break;
                                    }
                                    if (zzfbVar3.zzo() != 0) {
                                        z5 = false;
                                        break;
                                    }
                                    zzfbVar3.zzf();
                                    i13--;
                                }
                                if (i12 == 0) {
                                    if (iZzo6 == 0) {
                                        if (i16 == 0) {
                                            z5 = z5;
                                            i16 = i16;
                                            iZzo7 = iZzo7;
                                            zzahgVar3 = zzahgVar3;
                                            i18 = i18;
                                            i20 = 0;
                                            iZzo6 = 0;
                                        } else if (i18 == 0) {
                                            z5 = z5;
                                            iZzo7 = iZzo7;
                                            zzahgVar3 = zzahgVar3;
                                            i18 = i18;
                                            i20 = 0;
                                            iZzo6 = 0;
                                            i16 = 0;
                                        } else if (iZzo7 == 0) {
                                            z5 = z5;
                                            iZzo7 = iZzo7;
                                            zzahgVar3 = zzahgVar3;
                                            i20 = 0;
                                            iZzo6 = 0;
                                            i16 = 0;
                                            i18 = 0;
                                        } else if (z5) {
                                            zzahgVar3 = zzahgVar3;
                                            i20 = 0;
                                            iZzo6 = 0;
                                            i16 = 0;
                                            i18 = 0;
                                            iZzo7 = 0;
                                            z5 = false;
                                        } else {
                                            jArrCopyOf = jArrCopyOf;
                                            zzahgVar3 = zzahgVar3;
                                        }
                                        int i6114 = zzahgVar3.zza;
                                        StringBuilder sb9 = new StringBuilder("Inconsistent stbl box for track ");
                                        sb9.append(i6114);
                                        sb9.append(": remainingSynchronizationSamples ");
                                        sb9.append(i20);
                                        sb9.append(", remainingSamplesAtTimestampDelta ");
                                        sb9.append(iZzo6);
                                        sb9.append(", remainingSamplesInChunk ");
                                        sb9.append(i16);
                                        sb9.append(", remainingTimestampDeltaChanges ");
                                        sb9.append(i18);
                                        sb9.append(", remainingSamplesAtTimestampOffset ");
                                        sb9.append(iZzo7);
                                        if (true != z5) {
                                            str4 = ", ctts invalid";
                                        } else {
                                            str4 = "";
                                        }
                                        sb9.append(str4);
                                        zzes.zzf(str, sb9.toString());
                                    } else {
                                        i20 = 0;
                                    }
                                    j8 = j222;
                                    iArr = iArrCopyOf2;
                                    jArr3 = jArrCopyOf2;
                                    jArr4 = jArrCopyOf;
                                    iArr2 = iArrCopyOf;
                                    iZzb = iZzb;
                                } else {
                                    i20 = i12;
                                }
                                int i6115 = zzahgVar3.zza;
                                StringBuilder sb10 = new StringBuilder("Inconsistent stbl box for track ");
                                sb10.append(i6115);
                                sb10.append(": remainingSynchronizationSamples ");
                                sb10.append(i20);
                                sb10.append(", remainingSamplesAtTimestampDelta ");
                                sb10.append(iZzo6);
                                sb10.append(", remainingSamplesInChunk ");
                                sb10.append(i16);
                                sb10.append(", remainingTimestampDeltaChanges ");
                                sb10.append(i18);
                                sb10.append(", remainingSamplesAtTimestampOffset ");
                                sb10.append(iZzo7);
                                if (true != z5) {
                                    str4 = ", ctts invalid";
                                } else {
                                    str4 = "";
                                }
                                sb10.append(str4);
                                zzes.zzf(str, sb10.toString());
                                j8 = j222;
                                iArr = iArrCopyOf2;
                                jArr3 = jArrCopyOf2;
                                jArr4 = jArrCopyOf;
                                iArr2 = iArrCopyOf;
                                iZzb = iZzb;
                            } else {
                                jArrCopyOf = new long[iZzb];
                                iArrCopyOf = new int[iZzb];
                                jArrCopyOf2 = new long[iZzb];
                                i12 = iZzo4;
                                iArrCopyOf2 = new int[iZzb];
                                zzahgVar3 = zzahgVar2;
                                iZzf = iZzo2;
                                i13 = iZzo3;
                                i14 = iZzo5;
                                i15 = 0;
                                i16 = 0;
                                iZzo7 = 0;
                                i17 = 0;
                                j6 = 0;
                                j7 = 0;
                                i18 = iZzo;
                                i19 = 0;
                                while (true) {
                                    if (i19 < iZzb) {
                                        i18 = i18;
                                        break;
                                    }
                                    j9 = j6;
                                    zZza = true;
                                    while (true) {
                                        if (i16 != 0) {
                                            i21 = i16;
                                            break;
                                        }
                                        zZza = zzagkVar.zza();
                                        if (zZza) {
                                            i21 = 0;
                                            break;
                                        }
                                        int i6116 = i14;
                                        long j118 = zzagkVar.zzd;
                                        i16 = zzagkVar.zzc;
                                        j9 = j118;
                                        i18 = i18;
                                        i14 = i6116;
                                        iZzb = iZzb;
                                    }
                                    if (!zZza) {
                                        zzes.zzf(str, "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i19);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i19);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i19);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i19);
                                        iZzb = i19;
                                        break;
                                    }
                                    iZzf2 = i17;
                                    if (zzfbVar3 != null) {
                                        while (iZzo7 == 0) {
                                            if (i13 > 0) {
                                                iZzo7 = 0;
                                                break;
                                            }
                                            i13--;
                                            iZzo7 = zzfbVar3.zzo();
                                            iZzf2 = zzfbVar3.zzf();
                                        }
                                        iZzo7--;
                                    }
                                    jArrCopyOf[i19] = j9;
                                    iZzc = zzagpVar.zzc();
                                    iArrCopyOf[i19] = iZzc;
                                    if (iZzc > i15) {
                                        i22 = iZzc;
                                    } else {
                                        i22 = i15;
                                    }
                                    jArrCopyOf2[i19] = j7 + ((long) iZzf2);
                                    if (zzfbVar2 == null) {
                                        i23 = 1;
                                    } else {
                                        i23 = 0;
                                    }
                                    iArrCopyOf2[i19] = i23;
                                    iZzo8 = i14;
                                    if (i19 == iZzo8) {
                                        iArrCopyOf2[i19] = 1;
                                        i12--;
                                        if (i12 > 0) {
                                            zzfbVar2.getClass();
                                            iZzo8 = zzfbVar2.zzo() - 1;
                                        }
                                    }
                                    zzfb zzfbVar15 = zzfbVar2;
                                    int i6117 = iZzo8;
                                    j7 += (long) iZzf;
                                    i24 = iZzo6 - 1;
                                    if (i24 == 0) {
                                        iZzo6 = i24;
                                    } else if (i18 > 0) {
                                        iZzo6 = zzfbVar.zzo();
                                        iZzf = zzfbVar.zzf();
                                        i18--;
                                    } else {
                                        iZzo6 = 0;
                                    }
                                    long j119 = j9 + ((long) iArrCopyOf[i19]);
                                    i19++;
                                    i17 = iZzf2;
                                    i14 = i6117;
                                    i15 = i22;
                                    i16 = i21 - 1;
                                    iZzb = iZzb;
                                    zzagkVar = zzagkVar;
                                    zzfbVar2 = zzfbVar15;
                                    i18 = i18;
                                    j6 = j119;
                                }
                                long j223 = j7 + ((long) i17);
                                if (zzfbVar3 != null) {
                                    z5 = true;
                                    break;
                                }
                                while (true) {
                                    if (i13 > 0) {
                                        z5 = true;
                                        break;
                                    }
                                    if (zzfbVar3.zzo() != 0) {
                                        z5 = false;
                                        break;
                                    }
                                    zzfbVar3.zzf();
                                    i13--;
                                }
                                if (i12 == 0) {
                                    if (iZzo6 == 0) {
                                        if (i16 == 0) {
                                            z5 = z5;
                                            i16 = i16;
                                            iZzo7 = iZzo7;
                                            zzahgVar3 = zzahgVar3;
                                            i18 = i18;
                                            i20 = 0;
                                            iZzo6 = 0;
                                        } else if (i18 == 0) {
                                            z5 = z5;
                                            iZzo7 = iZzo7;
                                            zzahgVar3 = zzahgVar3;
                                            i18 = i18;
                                            i20 = 0;
                                            iZzo6 = 0;
                                            i16 = 0;
                                        } else if (iZzo7 == 0) {
                                            z5 = z5;
                                            iZzo7 = iZzo7;
                                            zzahgVar3 = zzahgVar3;
                                            i20 = 0;
                                            iZzo6 = 0;
                                            i16 = 0;
                                            i18 = 0;
                                        } else if (z5) {
                                            zzahgVar3 = zzahgVar3;
                                            i20 = 0;
                                            iZzo6 = 0;
                                            i16 = 0;
                                            i18 = 0;
                                            iZzo7 = 0;
                                            z5 = false;
                                        } else {
                                            jArrCopyOf = jArrCopyOf;
                                            zzahgVar3 = zzahgVar3;
                                        }
                                        int i6118 = zzahgVar3.zza;
                                        StringBuilder sb11 = new StringBuilder("Inconsistent stbl box for track ");
                                        sb11.append(i6118);
                                        sb11.append(": remainingSynchronizationSamples ");
                                        sb11.append(i20);
                                        sb11.append(", remainingSamplesAtTimestampDelta ");
                                        sb11.append(iZzo6);
                                        sb11.append(", remainingSamplesInChunk ");
                                        sb11.append(i16);
                                        sb11.append(", remainingTimestampDeltaChanges ");
                                        sb11.append(i18);
                                        sb11.append(", remainingSamplesAtTimestampOffset ");
                                        sb11.append(iZzo7);
                                        if (true != z5) {
                                            str4 = ", ctts invalid";
                                        } else {
                                            str4 = "";
                                        }
                                        sb11.append(str4);
                                        zzes.zzf(str, sb11.toString());
                                    } else {
                                        i20 = 0;
                                    }
                                    j8 = j223;
                                    iArr = iArrCopyOf2;
                                    jArr3 = jArrCopyOf2;
                                    jArr4 = jArrCopyOf;
                                    iArr2 = iArrCopyOf;
                                    iZzb = iZzb;
                                } else {
                                    i20 = i12;
                                }
                                int i6119 = zzahgVar3.zza;
                                StringBuilder sb12 = new StringBuilder("Inconsistent stbl box for track ");
                                sb12.append(i6119);
                                sb12.append(": remainingSynchronizationSamples ");
                                sb12.append(i20);
                                sb12.append(", remainingSamplesAtTimestampDelta ");
                                sb12.append(iZzo6);
                                sb12.append(", remainingSamplesInChunk ");
                                sb12.append(i16);
                                sb12.append(", remainingTimestampDeltaChanges ");
                                sb12.append(i18);
                                sb12.append(", remainingSamplesAtTimestampOffset ");
                                sb12.append(iZzo7);
                                if (true != z5) {
                                    str4 = ", ctts invalid";
                                } else {
                                    str4 = "";
                                }
                                sb12.append(str4);
                                zzes.zzf(str, sb12.toString());
                                j8 = j223;
                                iArr = iArrCopyOf2;
                                jArr3 = jArrCopyOf2;
                                jArr4 = jArrCopyOf;
                                iArr2 = iArrCopyOf;
                                iZzb = iZzb;
                            }
                            jZzq = zzfk.zzq(j8, 1000000L, zzahgVar3.zzc);
                            jArr5 = zzahgVar3.zzh;
                            if (jArr5 == null) {
                                zzfk.zzC(jArr3, 1000000L, zzahgVar3.zzc);
                                zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, jZzq);
                            } else if (jArr5.length == 1) {
                                jArr6 = zzahgVar3.zzh;
                                length = jArr6.length;
                                if (length != 1) {
                                    if (zzahgVar3.zzb == 1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    iArr3 = new int[length];
                                    iArr4 = new int[length];
                                    jArr7 = zzahgVar3.zzi;
                                    jArr7.getClass();
                                    i25 = 0;
                                    i26 = 0;
                                    z7 = false;
                                    i27 = 0;
                                    while (true) {
                                        jArr8 = zzahgVar3.zzh;
                                        i28 = i15;
                                        if (i25 < jArr8.length) {
                                            break;
                                            break;
                                        }
                                        long[] jArr111117 = jArr4;
                                        int[] iArr1111113 = iArr2;
                                        j12 = jArr7[i25];
                                        if (j12 != -1) {
                                            long j211110 = jArr8[i25];
                                            boolean z1116 = z7;
                                            i36 = i27;
                                            iArr11 = iArr;
                                            long jZzq1111 = zzfk.zzq(j211110, zzahgVar3.zzc, zzahgVar3.zzd);
                                            i37 = 1;
                                            iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                            iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq1111, z6, false);
                                            while (true) {
                                                i38 = iArr3[i25];
                                                i39 = iArr4[i25];
                                                if (i38 >= i39) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i25] = i38 + 1;
                                                i37 = 1;
                                            }
                                            i26 += i39 - i38;
                                            if (i36 != i38) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            z7 = z10 | z1116;
                                            i27 = i39;
                                        } else {
                                            iArr11 = iArr;
                                            z7 = z7;
                                        }
                                        i25++;
                                        i15 = i28;
                                        iArr2 = iArr1111113;
                                        iArr = iArr11;
                                        jArr4 = jArr111117;
                                    }
                                    jArr9 = jArr4;
                                    iArr5 = iArr2;
                                    boolean z1117 = z7;
                                    iArr6 = iArr;
                                    if (i26 != iZzb) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    z9 = z1117 | z8;
                                    if (z9) {
                                        jArr10 = new long[i26];
                                    } else {
                                        jArr10 = jArr9;
                                    }
                                    if (z9) {
                                        iArr7 = new int[i26];
                                    } else {
                                        iArr7 = iArr5;
                                    }
                                    if (true == z9) {
                                        i28 = 0;
                                    }
                                    if (z9) {
                                        iArr8 = new int[i26];
                                    } else {
                                        iArr8 = iArr6;
                                    }
                                    jArr11 = new long[i26];
                                    i29 = 0;
                                    i30 = 0;
                                    j10 = 0;
                                    while (i29 < zzahgVar3.zzh.length) {
                                        j11 = zzahgVar3.zzi[i29];
                                        i31 = iArr3[i29];
                                        i32 = iArr4[i29];
                                        if (z9) {
                                            int i8116 = i32 - i31;
                                            System.arraycopy(jArr9, i31, jArr10, i30, i8116);
                                            iArr9 = iArr5;
                                            System.arraycopy(iArr9, i31, iArr7, i30, i8116);
                                            iArr10 = iArr6;
                                            System.arraycopy(iArr10, i31, iArr8, i30, i8116);
                                        } else {
                                            iArr9 = iArr5;
                                            iArr10 = iArr6;
                                        }
                                        i33 = i28;
                                        while (i31 < i32) {
                                            int i8117 = i32;
                                            i34 = i33;
                                            long jZzq1112 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                            int[] iArr1111114 = iArr8;
                                            long[] jArr111118 = jArr3;
                                            jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                            int[] iArr1111115 = iArr10;
                                            long[] jArr111119 = jArr10;
                                            long j211111 = j10;
                                            if (zzr(zzahgVar3.zzb)) {
                                                jZzq2 = Math.max(0L, jZzq2);
                                            }
                                            jArr11[i30] = jZzq1112 + jZzq2;
                                            if (z9) {
                                                i35 = i34;
                                                if (iArr7[i30] > i35) {
                                                    i33 = iArr9[i31];
                                                }
                                                i30++;
                                                i31++;
                                                i32 = i8117;
                                                jArr3 = jArr111118;
                                                iArr10 = iArr1111115;
                                                j10 = j211111;
                                                iArr8 = iArr1111114;
                                                jArr10 = jArr111119;
                                            } else {
                                                i35 = i34;
                                            }
                                            i33 = i35;
                                            i30++;
                                            i31++;
                                            i32 = i8117;
                                            jArr3 = jArr111118;
                                            iArr10 = iArr1111115;
                                            j10 = j211111;
                                            iArr8 = iArr1111114;
                                            jArr10 = jArr111119;
                                        }
                                        int[] iArr1111116 = iArr10;
                                        long j211112 = j10 + zzahgVar3.zzh[i29];
                                        i29++;
                                        i28 = i33;
                                        jArr3 = jArr3;
                                        iArr6 = iArr1111116;
                                        iArr8 = iArr8;
                                        jArr10 = jArr10;
                                        j10 = j211112;
                                        iArr4 = iArr4;
                                        iArr5 = iArr9;
                                        iArr3 = iArr3;
                                    }
                                    zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                } else if (jArr6[0] == 0) {
                                    long[] jArr1111110 = zzahgVar3.zzi;
                                    jArr1111110.getClass();
                                    j13 = jArr1111110[0];
                                    while (i40 < jArr3.length) {
                                        jArr3[i40] = zzfk.zzq(jArr3[i40] - j13, 1000000L, zzahgVar3.zzc);
                                    }
                                    zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, zzfk.zzq(j8 - j13, 1000000L, zzahgVar3.zzc));
                                } else {
                                    length = 1;
                                    if (zzahgVar3.zzb == 1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    iArr3 = new int[length];
                                    iArr4 = new int[length];
                                    jArr7 = zzahgVar3.zzi;
                                    jArr7.getClass();
                                    i25 = 0;
                                    i26 = 0;
                                    z7 = false;
                                    i27 = 0;
                                    while (true) {
                                        jArr8 = zzahgVar3.zzh;
                                        i28 = i15;
                                        if (i25 < jArr8.length) {
                                            break;
                                            break;
                                        }
                                        long[] jArr1111111 = jArr4;
                                        int[] iArr1111117 = iArr2;
                                        j12 = jArr7[i25];
                                        if (j12 != -1) {
                                            long j211113 = jArr8[i25];
                                            boolean z1118 = z7;
                                            i36 = i27;
                                            iArr11 = iArr;
                                            long jZzq1113 = zzfk.zzq(j211113, zzahgVar3.zzc, zzahgVar3.zzd);
                                            i37 = 1;
                                            iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                            iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq1113, z6, false);
                                            while (true) {
                                                i38 = iArr3[i25];
                                                i39 = iArr4[i25];
                                                if (i38 >= i39) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i25] = i38 + 1;
                                                i37 = 1;
                                            }
                                            i26 += i39 - i38;
                                            if (i36 != i38) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            z7 = z10 | z1118;
                                            i27 = i39;
                                        } else {
                                            iArr11 = iArr;
                                            z7 = z7;
                                        }
                                        i25++;
                                        i15 = i28;
                                        iArr2 = iArr1111117;
                                        iArr = iArr11;
                                        jArr4 = jArr1111111;
                                    }
                                    jArr9 = jArr4;
                                    iArr5 = iArr2;
                                    boolean z1119 = z7;
                                    iArr6 = iArr;
                                    if (i26 != iZzb) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    z9 = z1119 | z8;
                                    if (z9) {
                                        jArr10 = new long[i26];
                                    } else {
                                        jArr10 = jArr9;
                                    }
                                    if (z9) {
                                        iArr7 = new int[i26];
                                    } else {
                                        iArr7 = iArr5;
                                    }
                                    if (true == z9) {
                                        i28 = 0;
                                    }
                                    if (z9) {
                                        iArr8 = new int[i26];
                                    } else {
                                        iArr8 = iArr6;
                                    }
                                    jArr11 = new long[i26];
                                    i29 = 0;
                                    i30 = 0;
                                    j10 = 0;
                                    while (i29 < zzahgVar3.zzh.length) {
                                        j11 = zzahgVar3.zzi[i29];
                                        i31 = iArr3[i29];
                                        i32 = iArr4[i29];
                                        if (z9) {
                                            int i8118 = i32 - i31;
                                            System.arraycopy(jArr9, i31, jArr10, i30, i8118);
                                            iArr9 = iArr5;
                                            System.arraycopy(iArr9, i31, iArr7, i30, i8118);
                                            iArr10 = iArr6;
                                            System.arraycopy(iArr10, i31, iArr8, i30, i8118);
                                        } else {
                                            iArr9 = iArr5;
                                            iArr10 = iArr6;
                                        }
                                        i33 = i28;
                                        while (i31 < i32) {
                                            int i8119 = i32;
                                            i34 = i33;
                                            long jZzq1114 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                            int[] iArr1111118 = iArr8;
                                            long[] jArr1111112 = jArr3;
                                            jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                            int[] iArr1111119 = iArr10;
                                            long[] jArr1111113 = jArr10;
                                            long j211114 = j10;
                                            if (zzr(zzahgVar3.zzb)) {
                                                jZzq2 = Math.max(0L, jZzq2);
                                            }
                                            jArr11[i30] = jZzq1114 + jZzq2;
                                            if (z9) {
                                                i35 = i34;
                                                if (iArr7[i30] > i35) {
                                                    i33 = iArr9[i31];
                                                }
                                                i30++;
                                                i31++;
                                                i32 = i8119;
                                                jArr3 = jArr1111112;
                                                iArr10 = iArr1111119;
                                                j10 = j211114;
                                                iArr8 = iArr1111118;
                                                jArr10 = jArr1111113;
                                            } else {
                                                i35 = i34;
                                            }
                                            i33 = i35;
                                            i30++;
                                            i31++;
                                            i32 = i8119;
                                            jArr3 = jArr1111112;
                                            iArr10 = iArr1111119;
                                            j10 = j211114;
                                            iArr8 = iArr1111118;
                                            jArr10 = jArr1111113;
                                        }
                                        int[] iArr11111110 = iArr10;
                                        long j211115 = j10 + zzahgVar3.zzh[i29];
                                        i29++;
                                        i28 = i33;
                                        jArr3 = jArr3;
                                        iArr6 = iArr11111110;
                                        iArr8 = iArr8;
                                        jArr10 = jArr10;
                                        j10 = j211115;
                                        iArr4 = iArr4;
                                        iArr5 = iArr9;
                                        iArr3 = iArr3;
                                    }
                                    zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                }
                            } else {
                                jArr6 = zzahgVar3.zzh;
                                length = jArr6.length;
                                if (length != 1) {
                                    if (zzahgVar3.zzb == 1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    iArr3 = new int[length];
                                    iArr4 = new int[length];
                                    jArr7 = zzahgVar3.zzi;
                                    jArr7.getClass();
                                    i25 = 0;
                                    i26 = 0;
                                    z7 = false;
                                    i27 = 0;
                                    while (true) {
                                        jArr8 = zzahgVar3.zzh;
                                        i28 = i15;
                                        if (i25 < jArr8.length) {
                                            break;
                                            break;
                                        }
                                        long[] jArr1111114 = jArr4;
                                        int[] iArr11111111 = iArr2;
                                        j12 = jArr7[i25];
                                        if (j12 != -1) {
                                            long j211116 = jArr8[i25];
                                            boolean z11110 = z7;
                                            i36 = i27;
                                            iArr11 = iArr;
                                            long jZzq1115 = zzfk.zzq(j211116, zzahgVar3.zzc, zzahgVar3.zzd);
                                            i37 = 1;
                                            iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                            iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq1115, z6, false);
                                            while (true) {
                                                i38 = iArr3[i25];
                                                i39 = iArr4[i25];
                                                if (i38 >= i39) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i25] = i38 + 1;
                                                i37 = 1;
                                            }
                                            i26 += i39 - i38;
                                            if (i36 != i38) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            z7 = z10 | z11110;
                                            i27 = i39;
                                        } else {
                                            iArr11 = iArr;
                                            z7 = z7;
                                        }
                                        i25++;
                                        i15 = i28;
                                        iArr2 = iArr11111111;
                                        iArr = iArr11;
                                        jArr4 = jArr1111114;
                                    }
                                    jArr9 = jArr4;
                                    iArr5 = iArr2;
                                    boolean z11111 = z7;
                                    iArr6 = iArr;
                                    if (i26 != iZzb) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    z9 = z11111 | z8;
                                    if (z9) {
                                        jArr10 = new long[i26];
                                    } else {
                                        jArr10 = jArr9;
                                    }
                                    if (z9) {
                                        iArr7 = new int[i26];
                                    } else {
                                        iArr7 = iArr5;
                                    }
                                    if (true == z9) {
                                        i28 = 0;
                                    }
                                    if (z9) {
                                        iArr8 = new int[i26];
                                    } else {
                                        iArr8 = iArr6;
                                    }
                                    jArr11 = new long[i26];
                                    i29 = 0;
                                    i30 = 0;
                                    j10 = 0;
                                    while (i29 < zzahgVar3.zzh.length) {
                                        j11 = zzahgVar3.zzi[i29];
                                        i31 = iArr3[i29];
                                        i32 = iArr4[i29];
                                        if (z9) {
                                            int i81110 = i32 - i31;
                                            System.arraycopy(jArr9, i31, jArr10, i30, i81110);
                                            iArr9 = iArr5;
                                            System.arraycopy(iArr9, i31, iArr7, i30, i81110);
                                            iArr10 = iArr6;
                                            System.arraycopy(iArr10, i31, iArr8, i30, i81110);
                                        } else {
                                            iArr9 = iArr5;
                                            iArr10 = iArr6;
                                        }
                                        i33 = i28;
                                        while (i31 < i32) {
                                            int i81111 = i32;
                                            i34 = i33;
                                            long jZzq1116 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                            int[] iArr11111112 = iArr8;
                                            long[] jArr1111115 = jArr3;
                                            jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                            int[] iArr11111113 = iArr10;
                                            long[] jArr1111116 = jArr10;
                                            long j211117 = j10;
                                            if (zzr(zzahgVar3.zzb)) {
                                                jZzq2 = Math.max(0L, jZzq2);
                                            }
                                            jArr11[i30] = jZzq1116 + jZzq2;
                                            if (z9) {
                                                i35 = i34;
                                                if (iArr7[i30] > i35) {
                                                    i33 = iArr9[i31];
                                                }
                                                i30++;
                                                i31++;
                                                i32 = i81111;
                                                jArr3 = jArr1111115;
                                                iArr10 = iArr11111113;
                                                j10 = j211117;
                                                iArr8 = iArr11111112;
                                                jArr10 = jArr1111116;
                                            } else {
                                                i35 = i34;
                                            }
                                            i33 = i35;
                                            i30++;
                                            i31++;
                                            i32 = i81111;
                                            jArr3 = jArr1111115;
                                            iArr10 = iArr11111113;
                                            j10 = j211117;
                                            iArr8 = iArr11111112;
                                            jArr10 = jArr1111116;
                                        }
                                        int[] iArr11111114 = iArr10;
                                        long j211118 = j10 + zzahgVar3.zzh[i29];
                                        i29++;
                                        i28 = i33;
                                        jArr3 = jArr3;
                                        iArr6 = iArr11111114;
                                        iArr8 = iArr8;
                                        jArr10 = jArr10;
                                        j10 = j211118;
                                        iArr4 = iArr4;
                                        iArr5 = iArr9;
                                        iArr3 = iArr3;
                                    }
                                    zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                } else if (jArr6[0] == 0) {
                                    long[] jArr1111117 = zzahgVar3.zzi;
                                    jArr1111117.getClass();
                                    j13 = jArr1111117[0];
                                    while (i40 < jArr3.length) {
                                        jArr3[i40] = zzfk.zzq(jArr3[i40] - j13, 1000000L, zzahgVar3.zzc);
                                    }
                                    zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, zzfk.zzq(j8 - j13, 1000000L, zzahgVar3.zzc));
                                } else {
                                    length = 1;
                                    if (zzahgVar3.zzb == 1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    iArr3 = new int[length];
                                    iArr4 = new int[length];
                                    jArr7 = zzahgVar3.zzi;
                                    jArr7.getClass();
                                    i25 = 0;
                                    i26 = 0;
                                    z7 = false;
                                    i27 = 0;
                                    while (true) {
                                        jArr8 = zzahgVar3.zzh;
                                        i28 = i15;
                                        if (i25 < jArr8.length) {
                                            break;
                                            break;
                                        }
                                        long[] jArr1111118 = jArr4;
                                        int[] iArr11111115 = iArr2;
                                        j12 = jArr7[i25];
                                        if (j12 != -1) {
                                            long j211119 = jArr8[i25];
                                            boolean z11112 = z7;
                                            i36 = i27;
                                            iArr11 = iArr;
                                            long jZzq1117 = zzfk.zzq(j211119, zzahgVar3.zzc, zzahgVar3.zzd);
                                            i37 = 1;
                                            iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                            iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq1117, z6, false);
                                            while (true) {
                                                i38 = iArr3[i25];
                                                i39 = iArr4[i25];
                                                if (i38 >= i39) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i25] = i38 + 1;
                                                i37 = 1;
                                            }
                                            i26 += i39 - i38;
                                            if (i36 != i38) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            z7 = z10 | z11112;
                                            i27 = i39;
                                        } else {
                                            iArr11 = iArr;
                                            z7 = z7;
                                        }
                                        i25++;
                                        i15 = i28;
                                        iArr2 = iArr11111115;
                                        iArr = iArr11;
                                        jArr4 = jArr1111118;
                                    }
                                    jArr9 = jArr4;
                                    iArr5 = iArr2;
                                    boolean z11113 = z7;
                                    iArr6 = iArr;
                                    if (i26 != iZzb) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    z9 = z11113 | z8;
                                    if (z9) {
                                        jArr10 = new long[i26];
                                    } else {
                                        jArr10 = jArr9;
                                    }
                                    if (z9) {
                                        iArr7 = new int[i26];
                                    } else {
                                        iArr7 = iArr5;
                                    }
                                    if (true == z9) {
                                        i28 = 0;
                                    }
                                    if (z9) {
                                        iArr8 = new int[i26];
                                    } else {
                                        iArr8 = iArr6;
                                    }
                                    jArr11 = new long[i26];
                                    i29 = 0;
                                    i30 = 0;
                                    j10 = 0;
                                    while (i29 < zzahgVar3.zzh.length) {
                                        j11 = zzahgVar3.zzi[i29];
                                        i31 = iArr3[i29];
                                        i32 = iArr4[i29];
                                        if (z9) {
                                            int i81112 = i32 - i31;
                                            System.arraycopy(jArr9, i31, jArr10, i30, i81112);
                                            iArr9 = iArr5;
                                            System.arraycopy(iArr9, i31, iArr7, i30, i81112);
                                            iArr10 = iArr6;
                                            System.arraycopy(iArr10, i31, iArr8, i30, i81112);
                                        } else {
                                            iArr9 = iArr5;
                                            iArr10 = iArr6;
                                        }
                                        i33 = i28;
                                        while (i31 < i32) {
                                            int i81113 = i32;
                                            i34 = i33;
                                            long jZzq1118 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                            int[] iArr11111116 = iArr8;
                                            long[] jArr1111119 = jArr3;
                                            jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                            int[] iArr11111117 = iArr10;
                                            long[] jArr11111110 = jArr10;
                                            long j2111110 = j10;
                                            if (zzr(zzahgVar3.zzb)) {
                                                jZzq2 = Math.max(0L, jZzq2);
                                            }
                                            jArr11[i30] = jZzq1118 + jZzq2;
                                            if (z9) {
                                                i35 = i34;
                                                if (iArr7[i30] > i35) {
                                                    i33 = iArr9[i31];
                                                }
                                                i30++;
                                                i31++;
                                                i32 = i81113;
                                                jArr3 = jArr1111119;
                                                iArr10 = iArr11111117;
                                                j10 = j2111110;
                                                iArr8 = iArr11111116;
                                                jArr10 = jArr11111110;
                                            } else {
                                                i35 = i34;
                                            }
                                            i33 = i35;
                                            i30++;
                                            i31++;
                                            i32 = i81113;
                                            jArr3 = jArr1111119;
                                            iArr10 = iArr11111117;
                                            j10 = j2111110;
                                            iArr8 = iArr11111116;
                                            jArr10 = jArr11111110;
                                        }
                                        int[] iArr11111118 = iArr10;
                                        long j2111111 = j10 + zzahgVar3.zzh[i29];
                                        i29++;
                                        i28 = i33;
                                        jArr3 = jArr3;
                                        iArr6 = iArr11111118;
                                        iArr8 = iArr8;
                                        jArr10 = jArr10;
                                        j10 = j2111111;
                                        iArr4 = iArr4;
                                        iArr5 = iArr9;
                                        iArr3 = iArr3;
                                    }
                                    zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                                }
                            }
                        } else {
                            iZzo4 = 0;
                        }
                        iZzo5 = -1;
                        iZza = zzagpVar.zza();
                        String str17 = zzahgVar2.zzf.zzm;
                        iZzo6 = iZzo10;
                        if (iZza != -1) {
                            jArrCopyOf = new long[iZzb];
                            iArrCopyOf = new int[iZzb];
                            jArrCopyOf2 = new long[iZzb];
                            i12 = iZzo4;
                            iArrCopyOf2 = new int[iZzb];
                            zzahgVar3 = zzahgVar2;
                            iZzf = iZzo2;
                            i13 = iZzo3;
                            i14 = iZzo5;
                            i15 = 0;
                            i16 = 0;
                            iZzo7 = 0;
                            i17 = 0;
                            j6 = 0;
                            j7 = 0;
                            i18 = iZzo;
                            i19 = 0;
                            while (true) {
                                if (i19 < iZzb) {
                                    i18 = i18;
                                    break;
                                }
                                j9 = j6;
                                zZza = true;
                                while (true) {
                                    if (i16 != 0) {
                                        i21 = i16;
                                        break;
                                    }
                                    zZza = zzagkVar.zza();
                                    if (zZza) {
                                        i21 = 0;
                                        break;
                                    }
                                    int i61110 = i14;
                                    long j1110 = zzagkVar.zzd;
                                    i16 = zzagkVar.zzc;
                                    j9 = j1110;
                                    i18 = i18;
                                    i14 = i61110;
                                    iZzb = iZzb;
                                }
                                if (!zZza) {
                                    zzes.zzf(str, "Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i19);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i19);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i19);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i19);
                                    iZzb = i19;
                                    break;
                                }
                                iZzf2 = i17;
                                if (zzfbVar3 != null) {
                                    while (iZzo7 == 0) {
                                        if (i13 > 0) {
                                            iZzo7 = 0;
                                            break;
                                        }
                                        i13--;
                                        iZzo7 = zzfbVar3.zzo();
                                        iZzf2 = zzfbVar3.zzf();
                                    }
                                    iZzo7--;
                                }
                                jArrCopyOf[i19] = j9;
                                iZzc = zzagpVar.zzc();
                                iArrCopyOf[i19] = iZzc;
                                if (iZzc > i15) {
                                    i22 = iZzc;
                                } else {
                                    i22 = i15;
                                }
                                jArrCopyOf2[i19] = j7 + ((long) iZzf2);
                                if (zzfbVar2 == null) {
                                    i23 = 1;
                                } else {
                                    i23 = 0;
                                }
                                iArrCopyOf2[i19] = i23;
                                iZzo8 = i14;
                                if (i19 == iZzo8) {
                                    iArrCopyOf2[i19] = 1;
                                    i12--;
                                    if (i12 > 0) {
                                        zzfbVar2.getClass();
                                        iZzo8 = zzfbVar2.zzo() - 1;
                                    }
                                }
                                zzfb zzfbVar16 = zzfbVar2;
                                int i61111 = iZzo8;
                                j7 += (long) iZzf;
                                i24 = iZzo6 - 1;
                                if (i24 == 0) {
                                    iZzo6 = i24;
                                } else if (i18 > 0) {
                                    iZzo6 = zzfbVar.zzo();
                                    iZzf = zzfbVar.zzf();
                                    i18--;
                                } else {
                                    iZzo6 = 0;
                                }
                                long j1111 = j9 + ((long) iArrCopyOf[i19]);
                                i19++;
                                i17 = iZzf2;
                                i14 = i61111;
                                i15 = i22;
                                i16 = i21 - 1;
                                iZzb = iZzb;
                                zzagkVar = zzagkVar;
                                zzfbVar2 = zzfbVar16;
                                i18 = i18;
                                j6 = j1111;
                            }
                            long j224 = j7 + ((long) i17);
                            if (zzfbVar3 != null) {
                                z5 = true;
                                break;
                            }
                            while (true) {
                                if (i13 > 0) {
                                    z5 = true;
                                    break;
                                }
                                if (zzfbVar3.zzo() != 0) {
                                    z5 = false;
                                    break;
                                }
                                zzfbVar3.zzf();
                                i13--;
                            }
                            if (i12 == 0) {
                                if (iZzo6 == 0) {
                                    if (i16 == 0) {
                                        z5 = z5;
                                        i16 = i16;
                                        iZzo7 = iZzo7;
                                        zzahgVar3 = zzahgVar3;
                                        i18 = i18;
                                        i20 = 0;
                                        iZzo6 = 0;
                                    } else if (i18 == 0) {
                                        z5 = z5;
                                        iZzo7 = iZzo7;
                                        zzahgVar3 = zzahgVar3;
                                        i18 = i18;
                                        i20 = 0;
                                        iZzo6 = 0;
                                        i16 = 0;
                                    } else if (iZzo7 == 0) {
                                        z5 = z5;
                                        iZzo7 = iZzo7;
                                        zzahgVar3 = zzahgVar3;
                                        i20 = 0;
                                        iZzo6 = 0;
                                        i16 = 0;
                                        i18 = 0;
                                    } else if (z5) {
                                        zzahgVar3 = zzahgVar3;
                                        i20 = 0;
                                        iZzo6 = 0;
                                        i16 = 0;
                                        i18 = 0;
                                        iZzo7 = 0;
                                        z5 = false;
                                    } else {
                                        jArrCopyOf = jArrCopyOf;
                                        zzahgVar3 = zzahgVar3;
                                    }
                                    int i61112 = zzahgVar3.zza;
                                    StringBuilder sb13 = new StringBuilder("Inconsistent stbl box for track ");
                                    sb13.append(i61112);
                                    sb13.append(": remainingSynchronizationSamples ");
                                    sb13.append(i20);
                                    sb13.append(", remainingSamplesAtTimestampDelta ");
                                    sb13.append(iZzo6);
                                    sb13.append(", remainingSamplesInChunk ");
                                    sb13.append(i16);
                                    sb13.append(", remainingTimestampDeltaChanges ");
                                    sb13.append(i18);
                                    sb13.append(", remainingSamplesAtTimestampOffset ");
                                    sb13.append(iZzo7);
                                    if (true != z5) {
                                        str4 = ", ctts invalid";
                                    } else {
                                        str4 = "";
                                    }
                                    sb13.append(str4);
                                    zzes.zzf(str, sb13.toString());
                                } else {
                                    i20 = 0;
                                }
                                j8 = j224;
                                iArr = iArrCopyOf2;
                                jArr3 = jArrCopyOf2;
                                jArr4 = jArrCopyOf;
                                iArr2 = iArrCopyOf;
                                iZzb = iZzb;
                            } else {
                                i20 = i12;
                            }
                            int i61113 = zzahgVar3.zza;
                            StringBuilder sb14 = new StringBuilder("Inconsistent stbl box for track ");
                            sb14.append(i61113);
                            sb14.append(": remainingSynchronizationSamples ");
                            sb14.append(i20);
                            sb14.append(", remainingSamplesAtTimestampDelta ");
                            sb14.append(iZzo6);
                            sb14.append(", remainingSamplesInChunk ");
                            sb14.append(i16);
                            sb14.append(", remainingTimestampDeltaChanges ");
                            sb14.append(i18);
                            sb14.append(", remainingSamplesAtTimestampOffset ");
                            sb14.append(iZzo7);
                            if (true != z5) {
                                str4 = ", ctts invalid";
                            } else {
                                str4 = "";
                            }
                            sb14.append(str4);
                            zzes.zzf(str, sb14.toString());
                            j8 = j224;
                            iArr = iArrCopyOf2;
                            jArr3 = jArrCopyOf2;
                            jArr4 = jArrCopyOf;
                            iArr2 = iArrCopyOf;
                            iZzb = iZzb;
                        } else {
                            jArrCopyOf = new long[iZzb];
                            iArrCopyOf = new int[iZzb];
                            jArrCopyOf2 = new long[iZzb];
                            i12 = iZzo4;
                            iArrCopyOf2 = new int[iZzb];
                            zzahgVar3 = zzahgVar2;
                            iZzf = iZzo2;
                            i13 = iZzo3;
                            i14 = iZzo5;
                            i15 = 0;
                            i16 = 0;
                            iZzo7 = 0;
                            i17 = 0;
                            j6 = 0;
                            j7 = 0;
                            i18 = iZzo;
                            i19 = 0;
                            while (true) {
                                if (i19 < iZzb) {
                                    i18 = i18;
                                    break;
                                }
                                j9 = j6;
                                zZza = true;
                                while (true) {
                                    if (i16 != 0) {
                                        i21 = i16;
                                        break;
                                    }
                                    zZza = zzagkVar.zza();
                                    if (zZza) {
                                        i21 = 0;
                                        break;
                                    }
                                    int i61114 = i14;
                                    long j1112 = zzagkVar.zzd;
                                    i16 = zzagkVar.zzc;
                                    j9 = j1112;
                                    i18 = i18;
                                    i14 = i61114;
                                    iZzb = iZzb;
                                }
                                if (!zZza) {
                                    zzes.zzf(str, "Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i19);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i19);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i19);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i19);
                                    iZzb = i19;
                                    break;
                                }
                                iZzf2 = i17;
                                if (zzfbVar3 != null) {
                                    while (iZzo7 == 0) {
                                        if (i13 > 0) {
                                            iZzo7 = 0;
                                            break;
                                        }
                                        i13--;
                                        iZzo7 = zzfbVar3.zzo();
                                        iZzf2 = zzfbVar3.zzf();
                                    }
                                    iZzo7--;
                                }
                                jArrCopyOf[i19] = j9;
                                iZzc = zzagpVar.zzc();
                                iArrCopyOf[i19] = iZzc;
                                if (iZzc > i15) {
                                    i22 = iZzc;
                                } else {
                                    i22 = i15;
                                }
                                jArrCopyOf2[i19] = j7 + ((long) iZzf2);
                                if (zzfbVar2 == null) {
                                    i23 = 1;
                                } else {
                                    i23 = 0;
                                }
                                iArrCopyOf2[i19] = i23;
                                iZzo8 = i14;
                                if (i19 == iZzo8) {
                                    iArrCopyOf2[i19] = 1;
                                    i12--;
                                    if (i12 > 0) {
                                        zzfbVar2.getClass();
                                        iZzo8 = zzfbVar2.zzo() - 1;
                                    }
                                }
                                zzfb zzfbVar17 = zzfbVar2;
                                int i61115 = iZzo8;
                                j7 += (long) iZzf;
                                i24 = iZzo6 - 1;
                                if (i24 == 0) {
                                    iZzo6 = i24;
                                } else if (i18 > 0) {
                                    iZzo6 = zzfbVar.zzo();
                                    iZzf = zzfbVar.zzf();
                                    i18--;
                                } else {
                                    iZzo6 = 0;
                                }
                                long j1113 = j9 + ((long) iArrCopyOf[i19]);
                                i19++;
                                i17 = iZzf2;
                                i14 = i61115;
                                i15 = i22;
                                i16 = i21 - 1;
                                iZzb = iZzb;
                                zzagkVar = zzagkVar;
                                zzfbVar2 = zzfbVar17;
                                i18 = i18;
                                j6 = j1113;
                            }
                            long j225 = j7 + ((long) i17);
                            if (zzfbVar3 != null) {
                                z5 = true;
                                break;
                            }
                            while (true) {
                                if (i13 > 0) {
                                    z5 = true;
                                    break;
                                }
                                if (zzfbVar3.zzo() != 0) {
                                    z5 = false;
                                    break;
                                }
                                zzfbVar3.zzf();
                                i13--;
                            }
                            if (i12 == 0) {
                                if (iZzo6 == 0) {
                                    if (i16 == 0) {
                                        z5 = z5;
                                        i16 = i16;
                                        iZzo7 = iZzo7;
                                        zzahgVar3 = zzahgVar3;
                                        i18 = i18;
                                        i20 = 0;
                                        iZzo6 = 0;
                                    } else if (i18 == 0) {
                                        z5 = z5;
                                        iZzo7 = iZzo7;
                                        zzahgVar3 = zzahgVar3;
                                        i18 = i18;
                                        i20 = 0;
                                        iZzo6 = 0;
                                        i16 = 0;
                                    } else if (iZzo7 == 0) {
                                        z5 = z5;
                                        iZzo7 = iZzo7;
                                        zzahgVar3 = zzahgVar3;
                                        i20 = 0;
                                        iZzo6 = 0;
                                        i16 = 0;
                                        i18 = 0;
                                    } else if (z5) {
                                        zzahgVar3 = zzahgVar3;
                                        i20 = 0;
                                        iZzo6 = 0;
                                        i16 = 0;
                                        i18 = 0;
                                        iZzo7 = 0;
                                        z5 = false;
                                    } else {
                                        jArrCopyOf = jArrCopyOf;
                                        zzahgVar3 = zzahgVar3;
                                    }
                                    int i61116 = zzahgVar3.zza;
                                    StringBuilder sb15 = new StringBuilder("Inconsistent stbl box for track ");
                                    sb15.append(i61116);
                                    sb15.append(": remainingSynchronizationSamples ");
                                    sb15.append(i20);
                                    sb15.append(", remainingSamplesAtTimestampDelta ");
                                    sb15.append(iZzo6);
                                    sb15.append(", remainingSamplesInChunk ");
                                    sb15.append(i16);
                                    sb15.append(", remainingTimestampDeltaChanges ");
                                    sb15.append(i18);
                                    sb15.append(", remainingSamplesAtTimestampOffset ");
                                    sb15.append(iZzo7);
                                    if (true != z5) {
                                        str4 = ", ctts invalid";
                                    } else {
                                        str4 = "";
                                    }
                                    sb15.append(str4);
                                    zzes.zzf(str, sb15.toString());
                                } else {
                                    i20 = 0;
                                }
                                j8 = j225;
                                iArr = iArrCopyOf2;
                                jArr3 = jArrCopyOf2;
                                jArr4 = jArrCopyOf;
                                iArr2 = iArrCopyOf;
                                iZzb = iZzb;
                            } else {
                                i20 = i12;
                            }
                            int i61117 = zzahgVar3.zza;
                            StringBuilder sb16 = new StringBuilder("Inconsistent stbl box for track ");
                            sb16.append(i61117);
                            sb16.append(": remainingSynchronizationSamples ");
                            sb16.append(i20);
                            sb16.append(", remainingSamplesAtTimestampDelta ");
                            sb16.append(iZzo6);
                            sb16.append(", remainingSamplesInChunk ");
                            sb16.append(i16);
                            sb16.append(", remainingTimestampDeltaChanges ");
                            sb16.append(i18);
                            sb16.append(", remainingSamplesAtTimestampOffset ");
                            sb16.append(iZzo7);
                            if (true != z5) {
                                str4 = ", ctts invalid";
                            } else {
                                str4 = "";
                            }
                            sb16.append(str4);
                            zzes.zzf(str, sb16.toString());
                            j8 = j225;
                            iArr = iArrCopyOf2;
                            jArr3 = jArrCopyOf2;
                            jArr4 = jArrCopyOf;
                            iArr2 = iArrCopyOf;
                            iZzb = iZzb;
                        }
                        jZzq = zzfk.zzq(j8, 1000000L, zzahgVar3.zzc);
                        jArr5 = zzahgVar3.zzh;
                        if (jArr5 == null) {
                            zzfk.zzC(jArr3, 1000000L, zzahgVar3.zzc);
                            zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, jZzq);
                        } else if (jArr5.length == 1) {
                            jArr6 = zzahgVar3.zzh;
                            length = jArr6.length;
                            if (length != 1) {
                                if (zzahgVar3.zzb == 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                iArr3 = new int[length];
                                iArr4 = new int[length];
                                jArr7 = zzahgVar3.zzi;
                                jArr7.getClass();
                                i25 = 0;
                                i26 = 0;
                                z7 = false;
                                i27 = 0;
                                while (true) {
                                    jArr8 = zzahgVar3.zzh;
                                    i28 = i15;
                                    if (i25 < jArr8.length) {
                                        break;
                                        break;
                                    }
                                    long[] jArr11111111 = jArr4;
                                    int[] iArr11111119 = iArr2;
                                    j12 = jArr7[i25];
                                    if (j12 != -1) {
                                        long j2111112 = jArr8[i25];
                                        boolean z11114 = z7;
                                        i36 = i27;
                                        iArr11 = iArr;
                                        long jZzq1119 = zzfk.zzq(j2111112, zzahgVar3.zzc, zzahgVar3.zzd);
                                        i37 = 1;
                                        iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                        iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq1119, z6, false);
                                        while (true) {
                                            i38 = iArr3[i25];
                                            i39 = iArr4[i25];
                                            if (i38 >= i39) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i25] = i38 + 1;
                                            i37 = 1;
                                        }
                                        i26 += i39 - i38;
                                        if (i36 != i38) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        z7 = z10 | z11114;
                                        i27 = i39;
                                    } else {
                                        iArr11 = iArr;
                                        z7 = z7;
                                    }
                                    i25++;
                                    i15 = i28;
                                    iArr2 = iArr11111119;
                                    iArr = iArr11;
                                    jArr4 = jArr11111111;
                                }
                                jArr9 = jArr4;
                                iArr5 = iArr2;
                                boolean z11115 = z7;
                                iArr6 = iArr;
                                if (i26 != iZzb) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                z9 = z11115 | z8;
                                if (z9) {
                                    jArr10 = new long[i26];
                                } else {
                                    jArr10 = jArr9;
                                }
                                if (z9) {
                                    iArr7 = new int[i26];
                                } else {
                                    iArr7 = iArr5;
                                }
                                if (true == z9) {
                                    i28 = 0;
                                }
                                if (z9) {
                                    iArr8 = new int[i26];
                                } else {
                                    iArr8 = iArr6;
                                }
                                jArr11 = new long[i26];
                                i29 = 0;
                                i30 = 0;
                                j10 = 0;
                                while (i29 < zzahgVar3.zzh.length) {
                                    j11 = zzahgVar3.zzi[i29];
                                    i31 = iArr3[i29];
                                    i32 = iArr4[i29];
                                    if (z9) {
                                        int i81114 = i32 - i31;
                                        System.arraycopy(jArr9, i31, jArr10, i30, i81114);
                                        iArr9 = iArr5;
                                        System.arraycopy(iArr9, i31, iArr7, i30, i81114);
                                        iArr10 = iArr6;
                                        System.arraycopy(iArr10, i31, iArr8, i30, i81114);
                                    } else {
                                        iArr9 = iArr5;
                                        iArr10 = iArr6;
                                    }
                                    i33 = i28;
                                    while (i31 < i32) {
                                        int i81115 = i32;
                                        i34 = i33;
                                        long jZzq11110 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                        int[] iArr111111110 = iArr8;
                                        long[] jArr11111112 = jArr3;
                                        jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                        int[] iArr111111111 = iArr10;
                                        long[] jArr11111113 = jArr10;
                                        long j2111113 = j10;
                                        if (zzr(zzahgVar3.zzb)) {
                                            jZzq2 = Math.max(0L, jZzq2);
                                        }
                                        jArr11[i30] = jZzq11110 + jZzq2;
                                        if (z9) {
                                            i35 = i34;
                                            if (iArr7[i30] > i35) {
                                                i33 = iArr9[i31];
                                            }
                                            i30++;
                                            i31++;
                                            i32 = i81115;
                                            jArr3 = jArr11111112;
                                            iArr10 = iArr111111111;
                                            j10 = j2111113;
                                            iArr8 = iArr111111110;
                                            jArr10 = jArr11111113;
                                        } else {
                                            i35 = i34;
                                        }
                                        i33 = i35;
                                        i30++;
                                        i31++;
                                        i32 = i81115;
                                        jArr3 = jArr11111112;
                                        iArr10 = iArr111111111;
                                        j10 = j2111113;
                                        iArr8 = iArr111111110;
                                        jArr10 = jArr11111113;
                                    }
                                    int[] iArr111111112 = iArr10;
                                    long j2111114 = j10 + zzahgVar3.zzh[i29];
                                    i29++;
                                    i28 = i33;
                                    jArr3 = jArr3;
                                    iArr6 = iArr111111112;
                                    iArr8 = iArr8;
                                    jArr10 = jArr10;
                                    j10 = j2111114;
                                    iArr4 = iArr4;
                                    iArr5 = iArr9;
                                    iArr3 = iArr3;
                                }
                                zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                            } else if (jArr6[0] == 0) {
                                long[] jArr11111114 = zzahgVar3.zzi;
                                jArr11111114.getClass();
                                j13 = jArr11111114[0];
                                while (i40 < jArr3.length) {
                                    jArr3[i40] = zzfk.zzq(jArr3[i40] - j13, 1000000L, zzahgVar3.zzc);
                                }
                                zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, zzfk.zzq(j8 - j13, 1000000L, zzahgVar3.zzc));
                            } else {
                                length = 1;
                                if (zzahgVar3.zzb == 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                iArr3 = new int[length];
                                iArr4 = new int[length];
                                jArr7 = zzahgVar3.zzi;
                                jArr7.getClass();
                                i25 = 0;
                                i26 = 0;
                                z7 = false;
                                i27 = 0;
                                while (true) {
                                    jArr8 = zzahgVar3.zzh;
                                    i28 = i15;
                                    if (i25 < jArr8.length) {
                                        break;
                                        break;
                                    }
                                    long[] jArr11111115 = jArr4;
                                    int[] iArr111111113 = iArr2;
                                    j12 = jArr7[i25];
                                    if (j12 != -1) {
                                        long j2111115 = jArr8[i25];
                                        boolean z11116 = z7;
                                        i36 = i27;
                                        iArr11 = iArr;
                                        long jZzq11111 = zzfk.zzq(j2111115, zzahgVar3.zzc, zzahgVar3.zzd);
                                        i37 = 1;
                                        iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                        iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq11111, z6, false);
                                        while (true) {
                                            i38 = iArr3[i25];
                                            i39 = iArr4[i25];
                                            if (i38 >= i39) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i25] = i38 + 1;
                                            i37 = 1;
                                        }
                                        i26 += i39 - i38;
                                        if (i36 != i38) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        z7 = z10 | z11116;
                                        i27 = i39;
                                    } else {
                                        iArr11 = iArr;
                                        z7 = z7;
                                    }
                                    i25++;
                                    i15 = i28;
                                    iArr2 = iArr111111113;
                                    iArr = iArr11;
                                    jArr4 = jArr11111115;
                                }
                                jArr9 = jArr4;
                                iArr5 = iArr2;
                                boolean z11117 = z7;
                                iArr6 = iArr;
                                if (i26 != iZzb) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                z9 = z11117 | z8;
                                if (z9) {
                                    jArr10 = new long[i26];
                                } else {
                                    jArr10 = jArr9;
                                }
                                if (z9) {
                                    iArr7 = new int[i26];
                                } else {
                                    iArr7 = iArr5;
                                }
                                if (true == z9) {
                                    i28 = 0;
                                }
                                if (z9) {
                                    iArr8 = new int[i26];
                                } else {
                                    iArr8 = iArr6;
                                }
                                jArr11 = new long[i26];
                                i29 = 0;
                                i30 = 0;
                                j10 = 0;
                                while (i29 < zzahgVar3.zzh.length) {
                                    j11 = zzahgVar3.zzi[i29];
                                    i31 = iArr3[i29];
                                    i32 = iArr4[i29];
                                    if (z9) {
                                        int i81116 = i32 - i31;
                                        System.arraycopy(jArr9, i31, jArr10, i30, i81116);
                                        iArr9 = iArr5;
                                        System.arraycopy(iArr9, i31, iArr7, i30, i81116);
                                        iArr10 = iArr6;
                                        System.arraycopy(iArr10, i31, iArr8, i30, i81116);
                                    } else {
                                        iArr9 = iArr5;
                                        iArr10 = iArr6;
                                    }
                                    i33 = i28;
                                    while (i31 < i32) {
                                        int i81117 = i32;
                                        i34 = i33;
                                        long jZzq11112 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                        int[] iArr111111114 = iArr8;
                                        long[] jArr11111116 = jArr3;
                                        jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                        int[] iArr111111115 = iArr10;
                                        long[] jArr11111117 = jArr10;
                                        long j2111116 = j10;
                                        if (zzr(zzahgVar3.zzb)) {
                                            jZzq2 = Math.max(0L, jZzq2);
                                        }
                                        jArr11[i30] = jZzq11112 + jZzq2;
                                        if (z9) {
                                            i35 = i34;
                                            if (iArr7[i30] > i35) {
                                                i33 = iArr9[i31];
                                            }
                                            i30++;
                                            i31++;
                                            i32 = i81117;
                                            jArr3 = jArr11111116;
                                            iArr10 = iArr111111115;
                                            j10 = j2111116;
                                            iArr8 = iArr111111114;
                                            jArr10 = jArr11111117;
                                        } else {
                                            i35 = i34;
                                        }
                                        i33 = i35;
                                        i30++;
                                        i31++;
                                        i32 = i81117;
                                        jArr3 = jArr11111116;
                                        iArr10 = iArr111111115;
                                        j10 = j2111116;
                                        iArr8 = iArr111111114;
                                        jArr10 = jArr11111117;
                                    }
                                    int[] iArr111111116 = iArr10;
                                    long j2111117 = j10 + zzahgVar3.zzh[i29];
                                    i29++;
                                    i28 = i33;
                                    jArr3 = jArr3;
                                    iArr6 = iArr111111116;
                                    iArr8 = iArr8;
                                    jArr10 = jArr10;
                                    j10 = j2111117;
                                    iArr4 = iArr4;
                                    iArr5 = iArr9;
                                    iArr3 = iArr3;
                                }
                                zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                            }
                        } else {
                            jArr6 = zzahgVar3.zzh;
                            length = jArr6.length;
                            if (length != 1) {
                                if (zzahgVar3.zzb == 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                iArr3 = new int[length];
                                iArr4 = new int[length];
                                jArr7 = zzahgVar3.zzi;
                                jArr7.getClass();
                                i25 = 0;
                                i26 = 0;
                                z7 = false;
                                i27 = 0;
                                while (true) {
                                    jArr8 = zzahgVar3.zzh;
                                    i28 = i15;
                                    if (i25 < jArr8.length) {
                                        break;
                                        break;
                                    }
                                    long[] jArr11111118 = jArr4;
                                    int[] iArr111111117 = iArr2;
                                    j12 = jArr7[i25];
                                    if (j12 != -1) {
                                        long j2111118 = jArr8[i25];
                                        boolean z11118 = z7;
                                        i36 = i27;
                                        iArr11 = iArr;
                                        long jZzq11113 = zzfk.zzq(j2111118, zzahgVar3.zzc, zzahgVar3.zzd);
                                        i37 = 1;
                                        iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                        iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq11113, z6, false);
                                        while (true) {
                                            i38 = iArr3[i25];
                                            i39 = iArr4[i25];
                                            if (i38 >= i39) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i25] = i38 + 1;
                                            i37 = 1;
                                        }
                                        i26 += i39 - i38;
                                        if (i36 != i38) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        z7 = z10 | z11118;
                                        i27 = i39;
                                    } else {
                                        iArr11 = iArr;
                                        z7 = z7;
                                    }
                                    i25++;
                                    i15 = i28;
                                    iArr2 = iArr111111117;
                                    iArr = iArr11;
                                    jArr4 = jArr11111118;
                                }
                                jArr9 = jArr4;
                                iArr5 = iArr2;
                                boolean z11119 = z7;
                                iArr6 = iArr;
                                if (i26 != iZzb) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                z9 = z11119 | z8;
                                if (z9) {
                                    jArr10 = new long[i26];
                                } else {
                                    jArr10 = jArr9;
                                }
                                if (z9) {
                                    iArr7 = new int[i26];
                                } else {
                                    iArr7 = iArr5;
                                }
                                if (true == z9) {
                                    i28 = 0;
                                }
                                if (z9) {
                                    iArr8 = new int[i26];
                                } else {
                                    iArr8 = iArr6;
                                }
                                jArr11 = new long[i26];
                                i29 = 0;
                                i30 = 0;
                                j10 = 0;
                                while (i29 < zzahgVar3.zzh.length) {
                                    j11 = zzahgVar3.zzi[i29];
                                    i31 = iArr3[i29];
                                    i32 = iArr4[i29];
                                    if (z9) {
                                        int i81118 = i32 - i31;
                                        System.arraycopy(jArr9, i31, jArr10, i30, i81118);
                                        iArr9 = iArr5;
                                        System.arraycopy(iArr9, i31, iArr7, i30, i81118);
                                        iArr10 = iArr6;
                                        System.arraycopy(iArr10, i31, iArr8, i30, i81118);
                                    } else {
                                        iArr9 = iArr5;
                                        iArr10 = iArr6;
                                    }
                                    i33 = i28;
                                    while (i31 < i32) {
                                        int i81119 = i32;
                                        i34 = i33;
                                        long jZzq11114 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                        int[] iArr111111118 = iArr8;
                                        long[] jArr11111119 = jArr3;
                                        jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                        int[] iArr111111119 = iArr10;
                                        long[] jArr111111110 = jArr10;
                                        long j2111119 = j10;
                                        if (zzr(zzahgVar3.zzb)) {
                                            jZzq2 = Math.max(0L, jZzq2);
                                        }
                                        jArr11[i30] = jZzq11114 + jZzq2;
                                        if (z9) {
                                            i35 = i34;
                                            if (iArr7[i30] > i35) {
                                                i33 = iArr9[i31];
                                            }
                                            i30++;
                                            i31++;
                                            i32 = i81119;
                                            jArr3 = jArr11111119;
                                            iArr10 = iArr111111119;
                                            j10 = j2111119;
                                            iArr8 = iArr111111118;
                                            jArr10 = jArr111111110;
                                        } else {
                                            i35 = i34;
                                        }
                                        i33 = i35;
                                        i30++;
                                        i31++;
                                        i32 = i81119;
                                        jArr3 = jArr11111119;
                                        iArr10 = iArr111111119;
                                        j10 = j2111119;
                                        iArr8 = iArr111111118;
                                        jArr10 = jArr111111110;
                                    }
                                    int[] iArr1111111110 = iArr10;
                                    long j21111110 = j10 + zzahgVar3.zzh[i29];
                                    i29++;
                                    i28 = i33;
                                    jArr3 = jArr3;
                                    iArr6 = iArr1111111110;
                                    iArr8 = iArr8;
                                    jArr10 = jArr10;
                                    j10 = j21111110;
                                    iArr4 = iArr4;
                                    iArr5 = iArr9;
                                    iArr3 = iArr3;
                                }
                                zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                            } else if (jArr6[0] == 0) {
                                long[] jArr111111111 = zzahgVar3.zzi;
                                jArr111111111.getClass();
                                j13 = jArr111111111[0];
                                while (i40 < jArr3.length) {
                                    jArr3[i40] = zzfk.zzq(jArr3[i40] - j13, 1000000L, zzahgVar3.zzc);
                                }
                                zzahjVar = new zzahj(zzahgVar3, jArr4, iArr2, i15, jArr3, iArr, zzfk.zzq(j8 - j13, 1000000L, zzahgVar3.zzc));
                            } else {
                                length = 1;
                                if (zzahgVar3.zzb == 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                iArr3 = new int[length];
                                iArr4 = new int[length];
                                jArr7 = zzahgVar3.zzi;
                                jArr7.getClass();
                                i25 = 0;
                                i26 = 0;
                                z7 = false;
                                i27 = 0;
                                while (true) {
                                    jArr8 = zzahgVar3.zzh;
                                    i28 = i15;
                                    if (i25 < jArr8.length) {
                                        break;
                                        break;
                                    }
                                    long[] jArr111111112 = jArr4;
                                    int[] iArr1111111111 = iArr2;
                                    j12 = jArr7[i25];
                                    if (j12 != -1) {
                                        long j21111111 = jArr8[i25];
                                        boolean z111110 = z7;
                                        i36 = i27;
                                        iArr11 = iArr;
                                        long jZzq11115 = zzfk.zzq(j21111111, zzahgVar3.zzc, zzahgVar3.zzd);
                                        i37 = 1;
                                        iArr3[i25] = zzfk.zzc(jArr3, j12, true, true);
                                        iArr4[i25] = zzfk.zza(jArr3, j12 + jZzq11115, z6, false);
                                        while (true) {
                                            i38 = iArr3[i25];
                                            i39 = iArr4[i25];
                                            if (i38 >= i39) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i25] = i38 + 1;
                                            i37 = 1;
                                        }
                                        i26 += i39 - i38;
                                        if (i36 != i38) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        z7 = z10 | z111110;
                                        i27 = i39;
                                    } else {
                                        iArr11 = iArr;
                                        z7 = z7;
                                    }
                                    i25++;
                                    i15 = i28;
                                    iArr2 = iArr1111111111;
                                    iArr = iArr11;
                                    jArr4 = jArr111111112;
                                }
                                jArr9 = jArr4;
                                iArr5 = iArr2;
                                boolean z111111 = z7;
                                iArr6 = iArr;
                                if (i26 != iZzb) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                z9 = z111111 | z8;
                                if (z9) {
                                    jArr10 = new long[i26];
                                } else {
                                    jArr10 = jArr9;
                                }
                                if (z9) {
                                    iArr7 = new int[i26];
                                } else {
                                    iArr7 = iArr5;
                                }
                                if (true == z9) {
                                    i28 = 0;
                                }
                                if (z9) {
                                    iArr8 = new int[i26];
                                } else {
                                    iArr8 = iArr6;
                                }
                                jArr11 = new long[i26];
                                i29 = 0;
                                i30 = 0;
                                j10 = 0;
                                while (i29 < zzahgVar3.zzh.length) {
                                    j11 = zzahgVar3.zzi[i29];
                                    i31 = iArr3[i29];
                                    i32 = iArr4[i29];
                                    if (z9) {
                                        int i811110 = i32 - i31;
                                        System.arraycopy(jArr9, i31, jArr10, i30, i811110);
                                        iArr9 = iArr5;
                                        System.arraycopy(iArr9, i31, iArr7, i30, i811110);
                                        iArr10 = iArr6;
                                        System.arraycopy(iArr10, i31, iArr8, i30, i811110);
                                    } else {
                                        iArr9 = iArr5;
                                        iArr10 = iArr6;
                                    }
                                    i33 = i28;
                                    while (i31 < i32) {
                                        int i811111 = i32;
                                        i34 = i33;
                                        long jZzq11116 = zzfk.zzq(j10, 1000000L, zzahgVar3.zzd);
                                        int[] iArr1111111112 = iArr8;
                                        long[] jArr111111113 = jArr3;
                                        jZzq2 = zzfk.zzq(jArr3[i31] - j11, 1000000L, zzahgVar3.zzc);
                                        int[] iArr1111111113 = iArr10;
                                        long[] jArr111111114 = jArr10;
                                        long j21111112 = j10;
                                        if (zzr(zzahgVar3.zzb)) {
                                            jZzq2 = Math.max(0L, jZzq2);
                                        }
                                        jArr11[i30] = jZzq11116 + jZzq2;
                                        if (z9) {
                                            i35 = i34;
                                            if (iArr7[i30] > i35) {
                                                i33 = iArr9[i31];
                                            }
                                            i30++;
                                            i31++;
                                            i32 = i811111;
                                            jArr3 = jArr111111113;
                                            iArr10 = iArr1111111113;
                                            j10 = j21111112;
                                            iArr8 = iArr1111111112;
                                            jArr10 = jArr111111114;
                                        } else {
                                            i35 = i34;
                                        }
                                        i33 = i35;
                                        i30++;
                                        i31++;
                                        i32 = i811111;
                                        jArr3 = jArr111111113;
                                        iArr10 = iArr1111111113;
                                        j10 = j21111112;
                                        iArr8 = iArr1111111112;
                                        jArr10 = jArr111111114;
                                    }
                                    int[] iArr1111111114 = iArr10;
                                    long j21111113 = j10 + zzahgVar3.zzh[i29];
                                    i29++;
                                    i28 = i33;
                                    jArr3 = jArr3;
                                    iArr6 = iArr1111111114;
                                    iArr8 = iArr8;
                                    jArr10 = jArr10;
                                    j10 = j21111113;
                                    iArr4 = iArr4;
                                    iArr5 = iArr9;
                                    iArr3 = iArr3;
                                }
                                zzahjVar = new zzahj(zzahgVar3, jArr10, iArr7, i28, jArr11, iArr8, zzfk.zzq(j10, 1000000L, zzahgVar3.zzd));
                            }
                        }
                    }
                    arrayList2 = arrayList;
                    arrayList2.add(zzahjVar);
                } else {
                    arrayList2 = arrayList;
                }
            }
            i41 = i + 1;
            arrayList3 = arrayList2;
        }
        return arrayList3;
    }

    public static void zze(zzfb zzfbVar) {
        int iZzc = zzfbVar.zzc();
        zzfbVar.zzH(4);
        if (zzfbVar.zzf() != 1751411826) {
            iZzc += 4;
        }
        zzfbVar.zzG(iZzc);
    }

    private static int zzf(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static int zzg(zzfb zzfbVar) {
        int iZzl = zzfbVar.zzl();
        int i = iZzl & WorkQueueKt.MASK;
        while ((iZzl & 128) == 128) {
            iZzl = zzfbVar.zzl();
            i = (i << 7) | (iZzl & WorkQueueKt.MASK);
        }
        return i;
    }

    private static int zzh(zzfb zzfbVar) {
        zzfbVar.zzG(16);
        return zzfbVar.zzf();
    }

    private static Pair zzi(zzagh zzaghVar) {
        zzagi zzagiVarZzb = zzaghVar.zzb(1701606260);
        if (zzagiVarZzb == null) {
            return null;
        }
        zzfb zzfbVar = zzagiVarZzb.zza;
        zzfbVar.zzG(8);
        int iZze = zzagj.zze(zzfbVar.zzf());
        int iZzo = zzfbVar.zzo();
        long[] jArr = new long[iZzo];
        long[] jArr2 = new long[iZzo];
        for (int i = 0; i < iZzo; i++) {
            jArr[i] = iZze == 1 ? zzfbVar.zzu() : zzfbVar.zzt();
            jArr2[i] = iZze == 1 ? zzfbVar.zzs() : zzfbVar.zzf();
            if (zzfbVar.zzz() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzfbVar.zzH(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzj(zzfb zzfbVar) {
        zzfbVar.zzG(8);
        int iZze = zzagj.zze(zzfbVar.zzf());
        zzfbVar.zzH(iZze == 0 ? 8 : 16);
        long jZzt = zzfbVar.zzt();
        zzfbVar.zzH(iZze == 0 ? 4 : 8);
        int iZzp = zzfbVar.zzp();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((iZzp >> 10) & 31) + 96));
        sb.append((char) (((iZzp >> 5) & 31) + 96));
        sb.append((char) ((iZzp & 31) + 96));
        return Pair.create(Long.valueOf(jZzt), sb.toString());
    }

    private static Pair zzk(zzfb zzfbVar, int i, int i2) throws zzcd {
        zzahh zzahhVar;
        Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int iZzc = zzfbVar.zzc();
        while (iZzc - i < i2) {
            zzfbVar.zzG(iZzc);
            int iZzf = zzfbVar.zzf();
            zzabf.zzb(iZzf > 0, "childAtomSize must be positive");
            if (zzfbVar.zzf() == 1936289382) {
                int i5 = iZzc + 8;
                int i6 = -1;
                int i7 = 0;
                String strZzy = null;
                Integer numValueOf = null;
                while (i5 - iZzc < iZzf) {
                    zzfbVar.zzG(i5);
                    int iZzf2 = zzfbVar.zzf();
                    int iZzf3 = zzfbVar.zzf();
                    if (iZzf3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzfbVar.zzf());
                    } else if (iZzf3 == 1935894637) {
                        zzfbVar.zzH(4);
                        strZzy = zzfbVar.zzy(4, zzfqu.zzc);
                    } else if (iZzf3 == 1935894633) {
                        i6 = i5;
                        i7 = iZzf2;
                    }
                    i5 += iZzf2;
                }
                if ("cenc".equals(strZzy) || "cbc1".equals(strZzy) || "cens".equals(strZzy) || "cbcs".equals(strZzy)) {
                    zzabf.zzb(numValueOf != null, "frma atom is mandatory");
                    zzabf.zzb(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            zzahhVar = null;
                            break;
                        }
                        zzfbVar.zzG(i8);
                        int iZzf4 = zzfbVar.zzf();
                        if (zzfbVar.zzf() == 1952804451) {
                            int iZze = zzagj.zze(zzfbVar.zzf());
                            zzfbVar.zzH(1);
                            if (iZze == 0) {
                                zzfbVar.zzH(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iZzl = zzfbVar.zzl();
                                int i9 = iZzl & 240;
                                i3 = iZzl & 15;
                                i4 = i9 >> 4;
                            }
                            boolean z = zzfbVar.zzl() == 1;
                            int iZzl2 = zzfbVar.zzl();
                            byte[] bArr2 = new byte[16];
                            zzfbVar.zzC(bArr2, 0, 16);
                            if (z && iZzl2 == 0) {
                                int iZzl3 = zzfbVar.zzl();
                                byte[] bArr3 = new byte[iZzl3];
                                zzfbVar.zzC(bArr3, 0, iZzl3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            zzahhVar = new zzahh(z, strZzy, iZzl2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i8 += iZzf4;
                    }
                    zzabf.zzb(zzahhVar != null, "tenc atom is mandatory");
                    int i10 = zzfk.zza;
                    pairCreate = Pair.create(numValueOf, zzahhVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzc += iZzf;
        }
        return null;
    }

    private static zzbz zzl(zzfb zzfbVar) {
        short sZzz = zzfbVar.zzz();
        zzfbVar.zzH(2);
        String strZzy = zzfbVar.zzy(sZzz, zzfqu.zzc);
        int iMax = Math.max(strZzy.lastIndexOf(43), strZzy.lastIndexOf(45));
        try {
            return new zzbz(-9223372036854775807L, new zzfr(Float.parseFloat(strZzy.substring(0, iMax)), Float.parseFloat(strZzy.substring(iMax, strZzy.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzagl zzm(zzfb zzfbVar, int i) {
        zzfbVar.zzG(i + 12);
        zzfbVar.zzH(1);
        zzg(zzfbVar);
        zzfbVar.zzH(2);
        int iZzl = zzfbVar.zzl();
        if ((iZzl & 128) != 0) {
            zzfbVar.zzH(2);
        }
        if ((iZzl & 64) != 0) {
            zzfbVar.zzH(zzfbVar.zzl());
        }
        if ((iZzl & 32) != 0) {
            zzfbVar.zzH(2);
        }
        zzfbVar.zzH(1);
        zzg(zzfbVar);
        String strZzd = zzcc.zzd(zzfbVar.zzl());
        if ("audio/mpeg".equals(strZzd) || "audio/vnd.dts".equals(strZzd) || "audio/vnd.dts.hd".equals(strZzd)) {
            return new zzagl(strZzd, null, -1L, -1L);
        }
        zzfbVar.zzH(4);
        long jZzt = zzfbVar.zzt();
        long jZzt2 = zzfbVar.zzt();
        zzfbVar.zzH(1);
        int iZzg = zzg(zzfbVar);
        byte[] bArr = new byte[iZzg];
        zzfbVar.zzC(bArr, 0, iZzg);
        return new zzagl(strZzd, bArr, jZzt2 <= 0 ? -1L : jZzt2, jZzt > 0 ? jZzt : -1L);
    }

    private static ByteBuffer zzn() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:158:0x024a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0260  */
    /* JADX WARN: Code duplicated, block: B:162:0x0265  */
    /* JADX WARN: Code duplicated, block: B:163:0x0275  */
    /* JADX WARN: Code duplicated, block: B:165:0x027a  */
    /* JADX WARN: Code duplicated, block: B:167:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:168:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:172:0x02bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:191:0x0392  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:194:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:196:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:198:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:211:0x0432  */
    /* JADX WARN: Code duplicated, block: B:213:0x043d  */
    /* JADX WARN: Code duplicated, block: B:214:0x0448  */
    /* JADX WARN: Code duplicated, block: B:216:0x0450  */
    /* JADX WARN: Code duplicated, block: B:218:0x0455 A[PHI: r23
  0x0455: PHI (r23v2 java.lang.String) = (r23v4 java.lang.String), (r23v5 java.lang.String), (r23v5 java.lang.String) binds: [B:193:0x03bd, B:191:0x0392, B:189:0x0347] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:229:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:83:0x013b  */
    private static void zzo(zzfb zzfbVar, int i, int i2, int i3, int i4, String str, boolean z, zzad zzadVar, zzagn zzagnVar, int i5) throws zzcd {
        int iZzp;
        int iZzm;
        int iZzf;
        int iZzo;
        int i6;
        zzad zzadVarZzb;
        String str2;
        int i7;
        String str3;
        zzagl zzaglVarZzm;
        List listZzm;
        int iZzf2;
        boolean z2;
        int iZzf3;
        int i8;
        int i9;
        int i10;
        String str4;
        byte[] bArr;
        zzfb zzfbVar2;
        int i11;
        int i12;
        int iZzl;
        int i13;
        String str5;
        boolean z3;
        zzfb zzfbVar3 = zzfbVar;
        int i14 = i2;
        int i15 = i3;
        zzfbVar3.zzG(i14 + 16);
        if (z) {
            iZzp = zzfbVar.zzp();
            zzfbVar3.zzH(6);
        } else {
            zzfbVar3.zzH(8);
            iZzp = 0;
        }
        if (iZzp == 0 || iZzp == 1) {
            int iZzp2 = zzfbVar.zzp();
            zzfbVar3.zzH(6);
            iZzm = zzfbVar.zzm();
            zzfbVar3.zzG(zzfbVar.zzc() - 4);
            iZzf = zzfbVar.zzf();
            if (iZzp == 1) {
                zzfbVar3.zzH(16);
            }
            iZzo = iZzp2;
            i6 = -1;
        } else {
            if (iZzp != 2) {
                return;
            }
            zzfbVar3.zzH(16);
            iZzm = (int) Math.round(Double.longBitsToDouble(zzfbVar.zzs()));
            iZzo = zzfbVar.zzo();
            zzfbVar3.zzH(4);
            int iZzo2 = zzfbVar.zzo();
            int iZzo3 = zzfbVar.zzo();
            int i16 = iZzo3 & 1;
            int i17 = iZzo3 & 2;
            if (i16 == 0) {
                if (iZzo2 == 8) {
                    i6 = 3;
                } else if (iZzo2 == 16) {
                    i6 = i17 != 0 ? DriveFile.MODE_READ_ONLY : 2;
                } else if (iZzo2 == 24) {
                    i6 = i17 != 0 ? 1342177280 : DriveFile.MODE_WRITE_ONLY;
                } else if (iZzo2 == 32) {
                    i6 = i17 != 0 ? 1610612736 : DriveFile.MODE_READ_WRITE;
                } else {
                    i6 = -1;
                }
            } else if (iZzo2 == 32) {
                i6 = 4;
            } else {
                i6 = -1;
            }
            zzfbVar3.zzH(8);
            iZzf = 0;
        }
        int iZzc = zzfbVar.zzc();
        int iIntValue = 1701733217;
        int i18 = i;
        if (i18 == 1701733217) {
            Pair pairZzk = zzk(zzfbVar3, i14, i15);
            if (pairZzk != null) {
                iIntValue = ((Integer) pairZzk.first).intValue();
                zzadVarZzb = zzadVar == null ? null : zzadVar.zzb(((zzahh) pairZzk.second).zzb);
                zzagnVar.zza[i5] = (zzahh) pairZzk.second;
            } else {
                zzadVarZzb = zzadVar;
            }
            zzfbVar3.zzG(iZzc);
            i18 = iIntValue;
        } else {
            zzadVarZzb = zzadVar;
        }
        if (i18 == 1633889587) {
            str2 = "audio/ac3";
        } else {
            if (i18 != 1700998451) {
                if (i18 == 1633889588) {
                    i7 = i6;
                    str2 = "audio/ac4";
                } else if (i18 == 1685353315) {
                    str2 = "audio/vnd.dts";
                } else if (i18 == 1685353320 || i18 == 1685353324) {
                    str2 = "audio/vnd.dts.hd";
                } else if (i18 == 1685353317) {
                    str2 = "audio/vnd.dts.hd;profile=lbr";
                } else if (i18 == 1685353336) {
                    str2 = "audio/vnd.dts.uhd;profile=p2";
                } else if (i18 == 1935764850) {
                    str2 = "audio/3gpp";
                } else if (i18 == 1935767394) {
                    str2 = "audio/amr-wb";
                } else if (i18 == 1936684916) {
                    str2 = "audio/raw";
                    i7 = 2;
                } else if (i18 == 1953984371) {
                    str2 = "audio/raw";
                    i7 = DriveFile.MODE_READ_ONLY;
                } else if (i18 == 1819304813) {
                    if (i6 == -1) {
                        str2 = "audio/raw";
                        i7 = 2;
                    } else {
                        i7 = i6;
                        str2 = "audio/raw";
                    }
                } else if (i18 == 778924082 || i18 == 778924083) {
                    str2 = "audio/mpeg";
                } else if (i18 == 1835557169) {
                    str2 = "audio/mha1";
                } else if (i18 == 1835560241) {
                    str2 = "audio/mhm1";
                } else if (i18 == 1634492771) {
                    str2 = "audio/alac";
                } else if (i18 == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (i18 == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (i18 == 1332770163) {
                    str2 = "audio/opus";
                } else if (i18 == 1716281667) {
                    str2 = "audio/flac";
                } else if (i18 == 1835823201) {
                    str2 = "audio/true-hd";
                } else {
                    i7 = i6;
                    str2 = null;
                }
                str3 = null;
                zzaglVarZzm = null;
                listZzm = null;
                while (iZzc - i14 < i15) {
                    zzfbVar3.zzG(iZzc);
                    iZzf2 = zzfbVar.zzf();
                    if (iZzf2 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String str6 = "childAtomSize must be positive";
                    zzabf.zzb(z2, "childAtomSize must be positive");
                    iZzf3 = zzfbVar.zzf();
                    int i19 = i7;
                    if (iZzf3 == 1835557187) {
                        int i20 = iZzf2 - 13;
                        byte[] bArr2 = new byte[i20];
                        zzfbVar3.zzG(iZzc + 13);
                        zzfbVar3.zzC(bArr2, 0, i20);
                        listZzm = zzfud.zzm(bArr2);
                        i10 = iZzf;
                    } else {
                        if (iZzf3 != 1702061171) {
                            if (z || iZzf3 != 2002876005) {
                                str3 = str3;
                                if (iZzf3 == 1684103987) {
                                    zzfbVar3.zzG(iZzc + 8);
                                    zzagnVar.zzb = zzaac.zzc(zzfbVar3, Integer.toString(i4), str, zzadVarZzb);
                                } else if (iZzf3 == 1684366131) {
                                    zzfbVar3.zzG(iZzc + 8);
                                    zzagnVar.zzb = zzaac.zzd(zzfbVar3, Integer.toString(i4), str, zzadVarZzb);
                                } else if (iZzf3 == 1684103988) {
                                    zzfbVar3.zzG(iZzc + 8);
                                    String string = Integer.toString(i4);
                                    int i21 = zzaaf.zza;
                                    zzfbVar3.zzH(1);
                                    iZzl = zzfbVar.zzl() & 32;
                                    zzak zzakVar = new zzak();
                                    zzakVar.zzH(string);
                                    zzakVar.zzS("audio/ac4");
                                    zzakVar.zzw(2);
                                    if (1 != (iZzl >> 5)) {
                                        i13 = 44100;
                                    } else {
                                        i13 = 48000;
                                    }
                                    zzakVar.zzT(i13);
                                    zzakVar.zzB(zzadVarZzb);
                                    zzakVar.zzK(str);
                                    zzagnVar.zzb = zzakVar.zzY();
                                } else if (iZzf3 != 1684892784) {
                                    if (iZzf3 != 1684305011 || iZzf3 == 1969517683) {
                                        zzak zzakVar2 = new zzak();
                                        zzakVar2.zzG(i4);
                                        zzakVar2.zzS(str2);
                                        zzakVar2.zzw(iZzo);
                                        zzakVar2.zzT(iZzm);
                                        zzakVar2.zzB(zzadVarZzb);
                                        zzakVar2.zzK(str);
                                        zzagnVar.zzb = zzakVar2.zzY();
                                    } else if (iZzf3 == 1682927731) {
                                        int i22 = iZzf2 - 8;
                                        byte[] bArr3 = zza;
                                        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i22);
                                        zzfbVar3.zzG(iZzc + 8);
                                        zzfbVar3.zzC(bArrCopyOf, bArr3.length, i22);
                                        listZzm = zzabw.zzd(bArrCopyOf);
                                        i10 = iZzf;
                                        str3 = str3;
                                    } else {
                                        if (iZzf3 == 1684425825) {
                                            int i23 = iZzf2 - 12;
                                            byte[] bArr4 = new byte[i23 + 4];
                                            bArr4[0] = 102;
                                            bArr4[1] = 76;
                                            bArr4[2] = 97;
                                            bArr4[3] = 67;
                                            zzfbVar3.zzG(iZzc + 12);
                                            zzfbVar3.zzC(bArr4, 4, i23);
                                            listZzm = zzfud.zzm(bArr4);
                                        } else if (iZzf3 == 1634492771) {
                                            int i24 = iZzf2 - 12;
                                            byte[] bArr5 = new byte[i24];
                                            zzfbVar3.zzG(iZzc + 12);
                                            zzfbVar3.zzC(bArr5, 0, i24);
                                            int i25 = zzea.zza;
                                            zzfb zzfbVar4 = new zzfb(bArr5);
                                            zzfbVar4.zzG(9);
                                            int iZzl2 = zzfbVar4.zzl();
                                            zzfbVar4.zzG(20);
                                            Pair pairCreate = Pair.create(Integer.valueOf(zzfbVar4.zzo()), Integer.valueOf(iZzl2));
                                            int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                            int iIntValue3 = ((Integer) pairCreate.second).intValue();
                                            listZzm = zzfud.zzm(bArr5);
                                            iZzo = iIntValue3;
                                            iZzm = iIntValue2;
                                        }
                                        i10 = iZzf;
                                        str3 = str3;
                                    }
                                    i10 = iZzf;
                                    str3 = str3;
                                } else {
                                    if (iZzf > 0) {
                                        throw zzcd.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + iZzf, null);
                                    }
                                    iZzm = iZzf;
                                    i10 = iZzm;
                                    str3 = str3;
                                    iZzo = 2;
                                }
                                i10 = iZzf;
                                str3 = str3;
                            } else {
                                int iZzc2 = zzfbVar.zzc();
                                if (iZzc2 >= iZzc) {
                                    str5 = null;
                                    z3 = true;
                                } else {
                                    str5 = null;
                                    z3 = false;
                                }
                                zzabf.zzb(z3, str5);
                                i8 = iZzc2;
                                while (true) {
                                    if (i8 - iZzc >= iZzf2) {
                                        str3 = str3;
                                        i8 = -1;
                                        break;
                                    }
                                    zzfbVar3.zzG(i8);
                                    int iZzf4 = zzfbVar.zzf();
                                    zzabf.zzb(iZzf4 > 0, str6);
                                    String str7 = str6;
                                    if (zzfbVar.zzf() == 1702061171) {
                                        break;
                                    }
                                    i8 += iZzf4;
                                    str3 = str3;
                                    str6 = str7;
                                }
                                i9 = -1;
                            }
                            iZzc += iZzf2;
                            zzfbVar3 = zzfbVar;
                            i14 = i2;
                            i15 = i3;
                            i7 = i19;
                            iZzf = i10;
                        } else {
                            str3 = str3;
                            i8 = iZzc;
                            i9 = -1;
                        }
                        if (i8 != i9) {
                            zzaglVarZzm = zzm(zzfbVar3, i8);
                            str4 = zzaglVarZzm.zza;
                            bArr = zzaglVarZzm.zzb;
                            if (bArr != null) {
                                if ("audio/vorbis".equals(str4)) {
                                    zzfbVar2 = new zzfb(bArr);
                                    zzfbVar2.zzH(1);
                                    i11 = 0;
                                    while (zzfbVar2.zza() > 0 && zzfbVar2.zze() == 255) {
                                        zzfbVar2.zzH(1);
                                        i11 += 255;
                                    }
                                    int iZzl3 = i11 + zzfbVar2.zzl();
                                    i12 = 0;
                                    while (true) {
                                        i10 = iZzf;
                                        if (zzfbVar2.zza() <= 0 || zzfbVar2.zze() != 255) {
                                            break;
                                        }
                                        zzfbVar2.zzH(1);
                                        i12 += 255;
                                        iZzf = i10;
                                    }
                                    int iZzl4 = i12 + zzfbVar2.zzl();
                                    byte[] bArr6 = new byte[iZzl3];
                                    int iZzc3 = zzfbVar2.zzc();
                                    System.arraycopy(bArr, iZzc3, bArr6, 0, iZzl3);
                                    int i26 = iZzc3 + iZzl3 + iZzl4;
                                    int length = bArr.length - i26;
                                    byte[] bArr7 = new byte[length];
                                    System.arraycopy(bArr, i26, bArr7, 0, length);
                                    listZzm = zzfud.zzn(bArr6, bArr7);
                                } else {
                                    i10 = iZzf;
                                    if ("audio/mp4a-latm".equals(str4)) {
                                        zzzy zzzyVarZza = zzzz.zza(bArr);
                                        iZzm = zzzyVarZza.zza;
                                        iZzo = zzzyVarZza.zzb;
                                        str3 = zzzyVarZza.zzc;
                                    } else {
                                        str3 = str3;
                                    }
                                    listZzm = zzfud.zzm(bArr);
                                    str2 = str4;
                                }
                                iZzc += iZzf2;
                                zzfbVar3 = zzfbVar;
                                i14 = i2;
                                i15 = i3;
                                i7 = i19;
                                iZzf = i10;
                            } else {
                                i10 = iZzf;
                            }
                            str2 = str4;
                        } else {
                            i10 = iZzf;
                        }
                        str3 = str3;
                        iZzc += iZzf2;
                        zzfbVar3 = zzfbVar;
                        i14 = i2;
                        i15 = i3;
                        i7 = i19;
                        iZzf = i10;
                    }
                    iZzc += iZzf2;
                    zzfbVar3 = zzfbVar;
                    i14 = i2;
                    i15 = i3;
                    i7 = i19;
                    iZzf = i10;
                }
                String str8 = str3;
                int i27 = i7;
                if (zzagnVar.zzb == null || str2 == null) {
                }
                zzak zzakVar3 = new zzak();
                zzakVar3.zzG(i4);
                zzakVar3.zzS(str2);
                zzakVar3.zzx(str8);
                zzakVar3.zzw(iZzo);
                zzakVar3.zzT(iZzm);
                zzakVar3.zzN(i27);
                zzakVar3.zzI(listZzm);
                zzakVar3.zzB(zzadVarZzb);
                zzakVar3.zzK(str);
                if (zzaglVarZzm != null) {
                    zzakVar3.zzv(zzfwl.zzc(zzaglVarZzm.zzc));
                    zzakVar3.zzO(zzfwl.zzc(zzaglVarZzm.zzd));
                }
                zzagnVar.zzb = zzakVar3.zzY();
                return;
            }
            str2 = "audio/eac3";
        }
        i7 = i6;
        str3 = null;
        zzaglVarZzm = null;
        listZzm = null;
        while (iZzc - i14 < i15) {
            zzfbVar3.zzG(iZzc);
            iZzf2 = zzfbVar.zzf();
            if (iZzf2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str9 = "childAtomSize must be positive";
            zzabf.zzb(z2, "childAtomSize must be positive");
            iZzf3 = zzfbVar.zzf();
            int i110 = i7;
            if (iZzf3 == 1835557187) {
                int i28 = iZzf2 - 13;
                byte[] bArr8 = new byte[i28];
                zzfbVar3.zzG(iZzc + 13);
                zzfbVar3.zzC(bArr8, 0, i28);
                listZzm = zzfud.zzm(bArr8);
                i10 = iZzf;
            } else {
                if (iZzf3 != 1702061171) {
                    if (z) {
                    }
                    str3 = str3;
                    if (iZzf3 == 1684103987) {
                        zzfbVar3.zzG(iZzc + 8);
                        zzagnVar.zzb = zzaac.zzc(zzfbVar3, Integer.toString(i4), str, zzadVarZzb);
                    } else if (iZzf3 == 1684366131) {
                        zzfbVar3.zzG(iZzc + 8);
                        zzagnVar.zzb = zzaac.zzd(zzfbVar3, Integer.toString(i4), str, zzadVarZzb);
                    } else {
                        if (iZzf3 == 1684103988) {
                            zzfbVar3.zzG(iZzc + 8);
                            String string2 = Integer.toString(i4);
                            int i29 = zzaaf.zza;
                            zzfbVar3.zzH(1);
                            iZzl = zzfbVar.zzl() & 32;
                            zzak zzakVar4 = new zzak();
                            zzakVar4.zzH(string2);
                            zzakVar4.zzS("audio/ac4");
                            zzakVar4.zzw(2);
                            if (1 != (iZzl >> 5)) {
                                i13 = 44100;
                            } else {
                                i13 = 48000;
                            }
                            zzakVar4.zzT(i13);
                            zzakVar4.zzB(zzadVarZzb);
                            zzakVar4.zzK(str);
                            zzagnVar.zzb = zzakVar4.zzY();
                        } else if (iZzf3 != 1684892784) {
                            if (iZzf > 0) {
                                throw zzcd.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + iZzf, null);
                            }
                            iZzm = iZzf;
                            i10 = iZzm;
                            str3 = str3;
                            iZzo = 2;
                        } else if (iZzf3 != 1684305011) {
                            zzak zzakVar5 = new zzak();
                            zzakVar5.zzG(i4);
                            zzakVar5.zzS(str2);
                            zzakVar5.zzw(iZzo);
                            zzakVar5.zzT(iZzm);
                            zzakVar5.zzB(zzadVarZzb);
                            zzakVar5.zzK(str);
                            zzagnVar.zzb = zzakVar5.zzY();
                            i10 = iZzf;
                            str3 = str3;
                        } else {
                            zzak zzakVar6 = new zzak();
                            zzakVar6.zzG(i4);
                            zzakVar6.zzS(str2);
                            zzakVar6.zzw(iZzo);
                            zzakVar6.zzT(iZzm);
                            zzakVar6.zzB(zzadVarZzb);
                            zzakVar6.zzK(str);
                            zzagnVar.zzb = zzakVar6.zzY();
                            i10 = iZzf;
                            str3 = str3;
                        }
                        iZzc += iZzf2;
                        zzfbVar3 = zzfbVar;
                        i14 = i2;
                        i15 = i3;
                        i7 = i110;
                        iZzf = i10;
                    }
                    i10 = iZzf;
                    str3 = str3;
                    iZzc += iZzf2;
                    zzfbVar3 = zzfbVar;
                    i14 = i2;
                    i15 = i3;
                    i7 = i110;
                    iZzf = i10;
                } else {
                    str3 = str3;
                    i8 = iZzc;
                    i9 = -1;
                }
                if (i8 != i9) {
                    zzaglVarZzm = zzm(zzfbVar3, i8);
                    str4 = zzaglVarZzm.zza;
                    bArr = zzaglVarZzm.zzb;
                    if (bArr != null) {
                        if ("audio/vorbis".equals(str4)) {
                            zzfbVar2 = new zzfb(bArr);
                            zzfbVar2.zzH(1);
                            i11 = 0;
                            while (zzfbVar2.zza() > 0) {
                                zzfbVar2.zzH(1);
                                i11 += 255;
                            }
                            int iZzl5 = i11 + zzfbVar2.zzl();
                            i12 = 0;
                            while (true) {
                                i10 = iZzf;
                                if (zzfbVar2.zza() <= 0) {
                                    break;
                                }
                                break;
                                break;
                                zzfbVar2.zzH(1);
                                i12 += 255;
                                iZzf = i10;
                            }
                            int iZzl6 = i12 + zzfbVar2.zzl();
                            byte[] bArr9 = new byte[iZzl5];
                            int iZzc4 = zzfbVar2.zzc();
                            System.arraycopy(bArr, iZzc4, bArr9, 0, iZzl5);
                            int i210 = iZzc4 + iZzl5 + iZzl6;
                            int length2 = bArr.length - i210;
                            byte[] bArr10 = new byte[length2];
                            System.arraycopy(bArr, i210, bArr10, 0, length2);
                            listZzm = zzfud.zzn(bArr9, bArr10);
                        } else {
                            i10 = iZzf;
                            if ("audio/mp4a-latm".equals(str4)) {
                                zzzy zzzyVarZza2 = zzzz.zza(bArr);
                                iZzm = zzzyVarZza2.zza;
                                iZzo = zzzyVarZza2.zzb;
                                str3 = zzzyVarZza2.zzc;
                            } else {
                                str3 = str3;
                            }
                            listZzm = zzfud.zzm(bArr);
                            str2 = str4;
                        }
                        iZzc += iZzf2;
                        zzfbVar3 = zzfbVar;
                        i14 = i2;
                        i15 = i3;
                        i7 = i110;
                        iZzf = i10;
                    } else {
                        i10 = iZzf;
                    }
                    str2 = str4;
                } else {
                    i10 = iZzf;
                }
                str3 = str3;
                iZzc += iZzf2;
                zzfbVar3 = zzfbVar;
                i14 = i2;
                i15 = i3;
                i7 = i110;
                iZzf = i10;
            }
            iZzc += iZzf2;
            zzfbVar3 = zzfbVar;
            i14 = i2;
            i15 = i3;
            i7 = i110;
            iZzf = i10;
        }
        String str10 = str3;
        int i211 = i7;
        if (zzagnVar.zzb == null) {
        }
    }

    private static void zzp(zzfb zzfbVar, int i, int i2, int i3, zzagn zzagnVar) {
        zzfbVar.zzG(i2 + 16);
        zzfbVar.zzw((char) 0);
        String strZzw = zzfbVar.zzw((char) 0);
        if (strZzw != null) {
            zzak zzakVar = new zzak();
            zzakVar.zzG(i3);
            zzakVar.zzS(strZzw);
            zzagnVar.zzb = zzakVar.zzY();
        }
    }

    private static boolean zzq(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        return jArr[0] <= j2 && j2 < jArr[Math.max(0, Math.min(4, i))] && jArr[Math.max(0, Math.min(length + (-4), i))] < j3 && j3 <= j;
    }

    private static boolean zzr(int i) {
        return i != 1;
    }

    private static byte[] zzs(zzfb zzfbVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            zzfbVar.zzG(i3);
            int iZzf = zzfbVar.zzf();
            if (zzfbVar.zzf() == 1886547818) {
                return Arrays.copyOfRange(zzfbVar.zzI(), i3, iZzf + i3);
            }
            i3 += iZzf;
        }
        return null;
    }
}
