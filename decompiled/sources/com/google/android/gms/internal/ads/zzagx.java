package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.mrgames.larvaheroesfree.R;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzagx implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzagt
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzagx.zza;
            return new zzabb[]{new zzagx(0, null)};
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzam zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzabe zzD;
    private zzace[] zzE;
    private zzace[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzfb zzf;
    private final zzfb zzg;
    private final zzfb zzh;
    private final byte[] zzi;
    private final zzfb zzj;
    private final zzadv zzk;
    private final zzfb zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzfb zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzagw zzy;
    private int zzz;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zzS("application/x-emsg");
        zzc = zzakVar.zzY();
    }

    public zzagx() {
        this(0, null);
    }

    private static int zze(int i) throws zzcd {
        if (i >= 0) {
            return i;
        }
        throw zzcd.zza("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    private static zzad zzf(List list) {
        zzahd zzahdVar;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzagi zzagiVar = (zzagi) list.get(i);
            if (zzagiVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrZzI = zzagiVar.zza.zzI();
                zzfb zzfbVar = new zzfb(bArrZzI);
                if (zzfbVar.zzd() < 32) {
                    zzahdVar = null;
                } else {
                    zzfbVar.zzG(0);
                    if (zzfbVar.zzf() == zzfbVar.zza() + 4 && zzfbVar.zzf() == 1886614376) {
                        int iZze = zzagj.zze(zzfbVar.zzf());
                        if (iZze > 1) {
                            zzes.zzf("PsshAtomUtil", "Unsupported pssh version: " + iZze);
                        } else {
                            UUID uuid = new UUID(zzfbVar.zzs(), zzfbVar.zzs());
                            if (iZze == 1) {
                                zzfbVar.zzH(zzfbVar.zzo() * 16);
                            }
                            int iZzo = zzfbVar.zzo();
                            if (iZzo == zzfbVar.zza()) {
                                byte[] bArr = new byte[iZzo];
                                zzfbVar.zzC(bArr, 0, iZzo);
                                zzahdVar = new zzahd(uuid, iZze, bArr);
                            }
                        }
                        zzahdVar = null;
                    } else {
                        zzahdVar = null;
                    }
                }
                UUID uuid2 = zzahdVar == null ? null : zzahdVar.zza;
                if (uuid2 == null) {
                    zzes.zzf("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzac(uuid2, null, "video/mp4", bArrZzI));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzad(arrayList);
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzfb zzfbVar, int i, zzahi zzahiVar) throws zzcd {
        zzfbVar.zzG(i + 8);
        int iZzf = zzfbVar.zzf() & ViewCompat.MEASURED_SIZE_MASK;
        if ((iZzf & 1) != 0) {
            throw zzcd.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iZzf & 2) != 0;
        int iZzo = zzfbVar.zzo();
        if (iZzo == 0) {
            Arrays.fill(zzahiVar.zzl, 0, zzahiVar.zze, false);
            return;
        }
        int i2 = zzahiVar.zze;
        if (iZzo != i2) {
            throw zzcd.zza("Senc sample count " + iZzo + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(zzahiVar.zzl, 0, iZzo, z);
        zzahiVar.zza(zzfbVar.zza());
        zzfb zzfbVar2 = zzahiVar.zzn;
        zzfbVar.zzC(zzfbVar2.zzI(), 0, zzfbVar2.zzd());
        zzahiVar.zzn.zzG(0);
        zzahiVar.zzo = false;
    }

    /* JADX WARN: Code duplicated, block: B:254:0x0631  */
    private final void zzi(long j) throws zzcd {
        zzagx zzagxVar;
        SparseArray sparseArray;
        zzagh zzaghVar;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        boolean z;
        zzahi zzahiVar;
        int i5;
        zzagh zzaghVar2;
        zzagw zzagwVar;
        int i6;
        boolean z2;
        int i7;
        int iZzf;
        long[] jArr;
        final zzagx zzagxVar2 = this;
        while (!zzagxVar2.zzm.isEmpty() && ((zzagh) zzagxVar2.zzm.peek()).zza == j) {
            zzagh zzaghVar3 = (zzagh) zzagxVar2.zzm.pop();
            int i8 = zzaghVar3.zzd;
            int i9 = 12;
            int i10 = 8;
            if (i8 == 1836019574) {
                zzad zzadVarZzf = zzf(zzaghVar3.zzb);
                zzagh zzaghVarZza = zzaghVar3.zza(1836475768);
                zzaghVarZza.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = zzaghVarZza.zzb.size();
                long jZzt = -9223372036854775807L;
                int i11 = 0;
                while (i11 < size) {
                    zzagi zzagiVar = (zzagi) zzaghVarZza.zzb.get(i11);
                    int i12 = zzagiVar.zzd;
                    if (i12 == 1953654136) {
                        zzfb zzfbVar = zzagiVar.zza;
                        zzfbVar.zzG(i9);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzfbVar.zzf()), new zzags(zzfbVar.zzf() - 1, zzfbVar.zzf(), zzfbVar.zzf(), zzfbVar.zzf()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (zzags) pairCreate.second);
                    } else if (i12 == 1835362404) {
                        zzfb zzfbVar2 = zzagiVar.zza;
                        zzfbVar2.zzG(8);
                        jZzt = zzagj.zze(zzfbVar2.zzf()) == 0 ? zzfbVar2.zzt() : zzfbVar2.zzu();
                    }
                    i11++;
                    i9 = 12;
                }
                List listZzd = zzagr.zzd(zzaghVar3, new zzabq(), jZzt, zzadVarZzf, false, false, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzagu
                    @Override // com.google.android.gms.internal.ads.zzfqw
                    public final Object apply(Object obj) {
                        return (zzahg) obj;
                    }
                });
                int size2 = listZzd.size();
                if (zzagxVar2.zze.size() == 0) {
                    for (int i13 = 0; i13 < size2; i13++) {
                        zzahj zzahjVar = (zzahj) listZzd.get(i13);
                        zzahg zzahgVar = zzahjVar.zza;
                        zzagxVar2.zze.put(zzahgVar.zza, new zzagw(zzagxVar2.zzD.zzv(i13, zzahgVar.zzb), zzahjVar, zzj(sparseArray2, zzahgVar.zza)));
                        zzagxVar2.zzw = Math.max(zzagxVar2.zzw, zzahgVar.zze);
                    }
                    zzagxVar2.zzD.zzC();
                } else {
                    zzdy.zzf(zzagxVar2.zze.size() == size2);
                    for (int i14 = 0; i14 < size2; i14++) {
                        zzahj zzahjVar2 = (zzahj) listZzd.get(i14);
                        zzahg zzahgVar2 = zzahjVar2.zza;
                        ((zzagw) zzagxVar2.zze.get(zzahgVar2.zza)).zzh(zzahjVar2, zzj(sparseArray2, zzahgVar2.zza));
                    }
                }
            } else {
                if (i8 == 1836019558) {
                    SparseArray sparseArray3 = zzagxVar2.zze;
                    byte[] bArr4 = zzagxVar2.zzi;
                    int size3 = zzaghVar3.zzc.size();
                    int i15 = 0;
                    while (i15 < size3) {
                        zzagh zzaghVar4 = (zzagh) zzaghVar3.zzc.get(i15);
                        if (zzaghVar4.zzd == 1953653094) {
                            zzagi zzagiVarZzb = zzaghVar4.zzb(1952868452);
                            zzagiVarZzb.getClass();
                            zzfb zzfbVar3 = zzagiVarZzb.zza;
                            zzfbVar3.zzG(i10);
                            int iZzf2 = zzfbVar3.zzf() & ViewCompat.MEASURED_SIZE_MASK;
                            zzagw zzagwVar2 = (zzagw) sparseArray3.get(zzfbVar3.zzf());
                            if (zzagwVar2 == null) {
                                zzagwVar2 = null;
                            } else {
                                if ((iZzf2 & 1) != 0) {
                                    long jZzu = zzfbVar3.zzu();
                                    zzahi zzahiVar2 = zzagwVar2.zzb;
                                    zzahiVar2.zzb = jZzu;
                                    zzahiVar2.zzc = jZzu;
                                }
                                zzags zzagsVar = zzagwVar2.zze;
                                zzagwVar2.zzb.zza = new zzags((iZzf2 & 2) != 0 ? zzfbVar3.zzf() - 1 : zzagsVar.zza, (iZzf2 & 8) != 0 ? zzfbVar3.zzf() : zzagsVar.zzb, (iZzf2 & 16) != 0 ? zzfbVar3.zzf() : zzagsVar.zzc, (iZzf2 & 32) != 0 ? zzfbVar3.zzf() : zzagsVar.zzd);
                            }
                            if (zzagwVar2 == null) {
                                sparseArray = sparseArray3;
                                zzaghVar = zzaghVar3;
                                i = size3;
                                i2 = i15;
                                bArr = bArr4;
                            } else {
                                zzahi zzahiVar3 = zzagwVar2.zzb;
                                long j2 = zzahiVar3.zzp;
                                boolean z3 = zzahiVar3.zzq;
                                zzagwVar2.zzi();
                                zzagwVar2.zzl = true;
                                zzagi zzagiVarZzb2 = zzaghVar4.zzb(1952867444);
                                if (zzagiVarZzb2 != null) {
                                    zzfb zzfbVar4 = zzagiVarZzb2.zza;
                                    zzfbVar4.zzG(i10);
                                    zzahiVar3.zzp = zzagj.zze(zzfbVar4.zzf()) == 1 ? zzfbVar4.zzu() : zzfbVar4.zzt();
                                    zzahiVar3.zzq = true;
                                } else {
                                    zzahiVar3.zzp = j2;
                                    zzahiVar3.zzq = z3;
                                }
                                List list = zzaghVar4.zzb;
                                int size4 = list.size();
                                int i16 = 0;
                                int i17 = 0;
                                int i18 = 0;
                                while (true) {
                                    i3 = 1953658222;
                                    if (i16 >= size4) {
                                        break;
                                    }
                                    zzagi zzagiVar2 = (zzagi) list.get(i16);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzagiVar2.zzd == 1953658222) {
                                        zzfb zzfbVar5 = zzagiVar2.zza;
                                        zzfbVar5.zzG(12);
                                        int iZzo = zzfbVar5.zzo();
                                        if (iZzo > 0) {
                                            i18 += iZzo;
                                            i17++;
                                        }
                                    }
                                    i16++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzagwVar2.zzh = 0;
                                zzagwVar2.zzg = 0;
                                zzagwVar2.zzf = 0;
                                zzahi zzahiVar4 = zzagwVar2.zzb;
                                zzahiVar4.zzd = i17;
                                zzahiVar4.zze = i18;
                                if (zzahiVar4.zzg.length < i17) {
                                    zzahiVar4.zzf = new long[i17];
                                    zzahiVar4.zzg = new int[i17];
                                }
                                if (zzahiVar4.zzh.length < i18) {
                                    int i19 = (i18 * R.styleable.AppCompatTheme_windowMinWidthMinor) / 100;
                                    zzahiVar4.zzh = new int[i19];
                                    zzahiVar4.zzi = new long[i19];
                                    zzahiVar4.zzj = new boolean[i19];
                                    zzahiVar4.zzl = new boolean[i19];
                                }
                                int i20 = 0;
                                int i21 = 0;
                                int i22 = 0;
                                while (true) {
                                    long j3 = 0;
                                    if (i20 >= size4) {
                                        break;
                                    }
                                    zzagi zzagiVar3 = (zzagi) list.get(i20);
                                    if (zzagiVar3.zzd == i3) {
                                        int i23 = i21 + 1;
                                        zzfb zzfbVar6 = zzagiVar3.zza;
                                        zzfbVar6.zzG(8);
                                        int iZzf3 = zzfbVar6.zzf() & ViewCompat.MEASURED_SIZE_MASK;
                                        zzahg zzahgVar3 = zzagwVar2.zzd.zza;
                                        zzahi zzahiVar5 = zzagwVar2.zzb;
                                        zzags zzagsVar2 = zzahiVar5.zza;
                                        int i24 = zzfk.zza;
                                        zzahiVar5.zzg[i21] = zzfbVar6.zzo();
                                        long[] jArr2 = zzahiVar5.zzf;
                                        long j4 = zzahiVar5.zzb;
                                        jArr2[i21] = j4;
                                        if ((iZzf3 & 1) != 0) {
                                            jArr2[i21] = j4 + ((long) zzfbVar6.zzf());
                                        }
                                        boolean z4 = (iZzf3 & 4) != 0;
                                        int iZzf4 = zzagsVar2.zzd;
                                        if (z4) {
                                            iZzf4 = zzfbVar6.zzf();
                                        }
                                        int i25 = iZzf3 & 256;
                                        int i26 = iZzf3 & 512;
                                        int i27 = iZzf3 & 1024;
                                        int i28 = iZzf3 & 2048;
                                        int i29 = iZzf4;
                                        long[] jArr3 = zzahgVar3.zzh;
                                        if (jArr3 != null) {
                                            i5 = i15;
                                            zzaghVar2 = zzaghVar4;
                                            if (jArr3.length != 1 || (jArr = zzahgVar3.zzi) == null) {
                                                z2 = z4;
                                                i6 = i28;
                                                zzagwVar = zzagwVar2;
                                            } else {
                                                long j5 = jArr3[0];
                                                if (j5 == 0) {
                                                    z2 = z4;
                                                    i6 = i28;
                                                    zzagwVar = zzagwVar2;
                                                } else {
                                                    long j6 = j5 + jArr[0];
                                                    i6 = i28;
                                                    z2 = z4;
                                                    zzagwVar = zzagwVar2;
                                                    if (zzfk.zzq(j6, 1000000L, zzahgVar3.zzd) >= zzahgVar3.zze) {
                                                    }
                                                }
                                                j3 = zzahgVar3.zzi[0];
                                            }
                                        } else {
                                            i5 = i15;
                                            zzaghVar2 = zzaghVar4;
                                            i6 = i28;
                                            zzagwVar = zzagwVar2;
                                            z2 = z4;
                                        }
                                        int[] iArr = zzahiVar5.zzh;
                                        long[] jArr4 = zzahiVar5.zzi;
                                        boolean[] zArr = zzahiVar5.zzj;
                                        int i30 = zzahiVar5.zzg[i21] + i22;
                                        zzahi zzahiVar6 = zzahiVar3;
                                        long j7 = zzahgVar3.zzc;
                                        zzahiVar = zzahiVar6;
                                        long j8 = zzahiVar5.zzp;
                                        while (i22 < i30) {
                                            int iZzf5 = i25 != 0 ? zzfbVar6.zzf() : zzagsVar2.zzb;
                                            zze(iZzf5);
                                            int iZzf6 = i26 != 0 ? zzfbVar6.zzf() : zzagsVar2.zzc;
                                            zze(iZzf6);
                                            if (i27 != 0) {
                                                i7 = i30;
                                                iZzf = zzfbVar6.zzf();
                                            } else {
                                                i7 = i30;
                                                if (i22 != 0) {
                                                    iZzf = zzagsVar2.zzd;
                                                } else if (z2) {
                                                    iZzf = i29;
                                                    i22 = 0;
                                                } else {
                                                    i22 = 0;
                                                    iZzf = zzagsVar2.zzd;
                                                }
                                            }
                                            long jZzq = zzfk.zzq((((long) (i6 != 0 ? zzfbVar6.zzf() : 0)) + j8) - j3, 1000000L, j7);
                                            jArr4[i22] = jZzq;
                                            long j9 = j7;
                                            if (!zzahiVar5.zzq) {
                                                jArr4[i22] = jZzq + zzagwVar.zzd.zzh;
                                            }
                                            iArr[i22] = iZzf6;
                                            zArr[i22] = 1 == (((iZzf >> 16) & 1) ^ 1);
                                            j8 += (long) iZzf5;
                                            i22++;
                                            j7 = j9;
                                            i25 = i25;
                                            i26 = i26;
                                            i30 = i7;
                                            i6 = i6;
                                            zzagsVar2 = zzagsVar2;
                                        }
                                        int i31 = i30;
                                        zzahiVar5.zzp = j8;
                                        i21 = i23;
                                        i22 = i31;
                                    } else {
                                        i20 = i20;
                                        zzahiVar = zzahiVar3;
                                        i5 = i15;
                                        zzaghVar2 = zzaghVar4;
                                        zzagwVar = zzagwVar2;
                                    }
                                    i20++;
                                    list = list;
                                    size3 = size3;
                                    size4 = size4;
                                    zzaghVar3 = zzaghVar3;
                                    bArr4 = bArr4;
                                    i15 = i5;
                                    zzaghVar4 = zzaghVar2;
                                    zzagwVar2 = zzagwVar;
                                    zzahiVar3 = zzahiVar;
                                    i3 = 1953658222;
                                }
                                zzaghVar = zzaghVar3;
                                byte[] bArr5 = bArr4;
                                zzahi zzahiVar7 = zzahiVar3;
                                i = size3;
                                i2 = i15;
                                zzagh zzaghVar5 = zzaghVar4;
                                zzahg zzahgVar4 = zzagwVar2.zzd.zza;
                                zzags zzagsVar3 = zzahiVar7.zza;
                                zzagsVar3.getClass();
                                zzahh zzahhVarZza = zzahgVar4.zza(zzagsVar3.zza);
                                zzagi zzagiVarZzb3 = zzaghVar5.zzb(1935763834);
                                if (zzagiVarZzb3 != null) {
                                    zzahhVarZza.getClass();
                                    zzfb zzfbVar7 = zzagiVarZzb3.zza;
                                    int i32 = zzahhVarZza.zzd;
                                    zzfbVar7.zzG(8);
                                    if ((zzfbVar7.zzf() & 1) == 1) {
                                        zzfbVar7.zzH(8);
                                    }
                                    int iZzl = zzfbVar7.zzl();
                                    int iZzo2 = zzfbVar7.zzo();
                                    int i33 = zzahiVar7.zze;
                                    if (iZzo2 > i33) {
                                        throw zzcd.zza("Saiz sample count " + iZzo2 + " is greater than fragment sample count" + i33, null);
                                    }
                                    if (iZzl == 0) {
                                        boolean[] zArr2 = zzahiVar7.zzl;
                                        i4 = 0;
                                        for (int i34 = 0; i34 < iZzo2; i34++) {
                                            int iZzl2 = zzfbVar7.zzl();
                                            i4 += iZzl2;
                                            zArr2[i34] = iZzl2 > i32;
                                        }
                                        z = false;
                                    } else {
                                        boolean z5 = iZzl > i32;
                                        i4 = iZzl * iZzo2;
                                        z = false;
                                        Arrays.fill(zzahiVar7.zzl, 0, iZzo2, z5);
                                    }
                                    Arrays.fill(zzahiVar7.zzl, iZzo2, zzahiVar7.zze, z);
                                    if (i4 > 0) {
                                        zzahiVar7.zza(i4);
                                    }
                                }
                                zzagi zzagiVarZzb4 = zzaghVar5.zzb(1935763823);
                                if (zzagiVarZzb4 != null) {
                                    zzfb zzfbVar8 = zzagiVarZzb4.zza;
                                    zzfbVar8.zzG(8);
                                    int iZzf7 = zzfbVar8.zzf();
                                    if ((iZzf7 & 1) == 1) {
                                        zzfbVar8.zzH(8);
                                    }
                                    int iZzo3 = zzfbVar8.zzo();
                                    if (iZzo3 != 1) {
                                        throw zzcd.zza("Unexpected saio entry count: " + iZzo3, null);
                                    }
                                    zzahiVar7.zzc += zzagj.zze(iZzf7) == 0 ? zzfbVar8.zzt() : zzfbVar8.zzu();
                                }
                                zzagi zzagiVarZzb5 = zzaghVar5.zzb(1936027235);
                                if (zzagiVarZzb5 != null) {
                                    zzh(zzagiVarZzb5.zza, 0, zzahiVar7);
                                }
                                String str = zzahhVarZza != null ? zzahhVarZza.zzb : null;
                                zzfb zzfbVar9 = null;
                                zzfb zzfbVar10 = null;
                                for (int i35 = 0; i35 < zzaghVar5.zzb.size(); i35++) {
                                    zzagi zzagiVar4 = (zzagi) zzaghVar5.zzb.get(i35);
                                    zzfb zzfbVar11 = zzagiVar4.zza;
                                    int i36 = zzagiVar4.zzd;
                                    if (i36 == 1935828848) {
                                        zzfbVar11.zzG(12);
                                        if (zzfbVar11.zzf() == 1936025959) {
                                            zzfbVar9 = zzfbVar11;
                                        }
                                    } else if (i36 == 1936158820) {
                                        zzfbVar11.zzG(12);
                                        if (zzfbVar11.zzf() == 1936025959) {
                                            zzfbVar10 = zzfbVar11;
                                        }
                                    }
                                }
                                if (zzfbVar9 != null && zzfbVar10 != null) {
                                    zzfbVar9.zzG(8);
                                    int iZze = zzagj.zze(zzfbVar9.zzf());
                                    zzfbVar9.zzH(4);
                                    if (iZze == 1) {
                                        zzfbVar9.zzH(4);
                                    }
                                    if (zzfbVar9.zzf() != 1) {
                                        throw zzcd.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzfbVar10.zzG(8);
                                    int iZze2 = zzagj.zze(zzfbVar10.zzf());
                                    zzfbVar10.zzH(4);
                                    if (iZze2 == 1) {
                                        if (zzfbVar10.zzt() == 0) {
                                            throw zzcd.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iZze2 >= 2) {
                                        zzfbVar10.zzH(4);
                                    }
                                    if (zzfbVar10.zzt() != 1) {
                                        throw zzcd.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzfbVar10.zzH(1);
                                    int iZzl3 = zzfbVar10.zzl();
                                    int i37 = (iZzl3 & 240) >> 4;
                                    int i38 = iZzl3 & 15;
                                    if (zzfbVar10.zzl() == 1) {
                                        int iZzl4 = zzfbVar10.zzl();
                                        byte[] bArr6 = new byte[16];
                                        zzfbVar10.zzC(bArr6, 0, 16);
                                        if (iZzl4 == 0) {
                                            int iZzl5 = zzfbVar10.zzl();
                                            byte[] bArr7 = new byte[iZzl5];
                                            zzfbVar10.zzC(bArr7, 0, iZzl5);
                                            bArr3 = bArr7;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzahiVar7.zzk = true;
                                        zzahiVar7.zzm = new zzahh(true, str, iZzl4, bArr6, i37, i38, bArr3);
                                    }
                                }
                                int size5 = zzaghVar5.zzb.size();
                                int i39 = 0;
                                while (i39 < size5) {
                                    zzagi zzagiVar5 = (zzagi) zzaghVar5.zzb.get(i39);
                                    if (zzagiVar5.zzd == 1970628964) {
                                        zzfb zzfbVar12 = zzagiVar5.zza;
                                        zzfbVar12.zzG(8);
                                        bArr2 = bArr5;
                                        zzfbVar12.zzC(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzfbVar12, 16, zzahiVar7);
                                        }
                                    } else {
                                        bArr2 = bArr5;
                                    }
                                    i39++;
                                    bArr5 = bArr2;
                                }
                                bArr = bArr5;
                            }
                        } else {
                            sparseArray = sparseArray3;
                            zzaghVar = zzaghVar3;
                            i = size3;
                            i2 = i15;
                            bArr = bArr4;
                        }
                        bArr4 = bArr;
                        size3 = i;
                        zzaghVar3 = zzaghVar;
                        i10 = 8;
                        i15 = i2 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzad zzadVarZzf2 = zzf(zzaghVar3.zzb);
                    zzagxVar = this;
                    if (zzadVarZzf2 != null) {
                        int size6 = zzagxVar.zze.size();
                        for (int i40 = 0; i40 < size6; i40++) {
                            zzagw zzagwVar3 = (zzagw) zzagxVar.zze.valueAt(i40);
                            zzahg zzahgVar5 = zzagwVar3.zzd.zza;
                            zzags zzagsVar4 = zzagwVar3.zzb.zza;
                            int i41 = zzfk.zza;
                            zzahh zzahhVarZza2 = zzahgVar5.zza(zzagsVar4.zza);
                            zzad zzadVarZzb = zzadVarZzf2.zzb(zzahhVarZza2 != null ? zzahhVarZza2.zzb : null);
                            zzak zzakVarZzb = zzagwVar3.zzd.zza.zzf.zzb();
                            zzakVarZzb.zzB(zzadVarZzb);
                            zzagwVar3.zza.zzk(zzakVarZzb.zzY());
                        }
                    }
                    if (zzagxVar.zzv != -9223372036854775807L) {
                        int size7 = zzagxVar.zze.size();
                        for (int i42 = 0; i42 < size7; i42++) {
                            zzagw zzagwVar4 = (zzagw) zzagxVar.zze.valueAt(i42);
                            long j10 = zzagxVar.zzv;
                            int i43 = zzagwVar4.zzf;
                            while (true) {
                                zzahi zzahiVar8 = zzagwVar4.zzb;
                                if (i43 >= zzahiVar8.zze || zzahiVar8.zzi[i43] > j10) {
                                    break;
                                }
                                if (zzahiVar8.zzj[i43]) {
                                    zzagwVar4.zzi = i43;
                                }
                                i43++;
                            }
                        }
                        zzagxVar.zzv = -9223372036854775807L;
                    }
                } else {
                    zzagxVar = zzagxVar2;
                    if (!zzagxVar.zzm.isEmpty()) {
                        ((zzagh) zzagxVar.zzm.peek()).zzc(zzaghVar3);
                    }
                }
                zzagxVar2 = zzagxVar;
            }
        }
        zzg();
    }

    private static final zzags zzj(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzags) sparseArray.valueAt(0);
        }
        zzags zzagsVar = (zzags) sparseArray.get(i);
        zzagsVar.getClass();
        return zzagsVar;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01c2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        int i;
        ?? r9;
        zzagw zzagwVar;
        int iZze;
        boolean z;
        int iZzc;
        long jZzq;
        long jZzt;
        String str;
        String str2;
        long j;
        long j2;
        long jZzu;
        long jZzu2;
        zzabc zzabcVar2 = zzabcVar;
        while (true) {
            int i2 = this.zzo;
            i = 1;
            r9 = 0;
            if (i2 == 0) {
                if (this.zzr == 0) {
                    if (!zzabcVar2.zzn(this.zzl.zzI(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzr = 8;
                    this.zzl.zzG(0);
                    this.zzq = this.zzl.zzt();
                    this.zzp = this.zzl.zzf();
                }
                long j3 = this.zzq;
                if (j3 == 1) {
                    ((zzaar) zzabcVar2).zzn(this.zzl.zzI(), 8, 8, false);
                    this.zzr += 8;
                    this.zzq = this.zzl.zzu();
                } else if (j3 == 0) {
                    long jZzd = zzabcVar.zzd();
                    if (jZzd == -1) {
                        jZzd = !this.zzm.isEmpty() ? ((zzagh) this.zzm.peek()).zza : -1L;
                    }
                    if (jZzd != -1) {
                        this.zzq = (jZzd - zzabcVar.zzf()) + ((long) this.zzr);
                    }
                }
                long j4 = this.zzq;
                long j5 = this.zzr;
                if (j4 < j5) {
                    throw zzcd.zzc("Atom size less than header length (unsupported).");
                }
                long jZzf = zzabcVar.zzf() - j5;
                int i3 = this.zzp;
                if ((i3 == 1836019558 || i3 == 1835295092) && !this.zzG) {
                    this.zzD.zzN(new zzabz(this.zzw, jZzf));
                    this.zzG = true;
                }
                if (this.zzp == 1836019558) {
                    int size = this.zze.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        zzahi zzahiVar = ((zzagw) this.zze.valueAt(i4)).zzb;
                        zzahiVar.zzc = jZzf;
                        zzahiVar.zzb = jZzf;
                    }
                }
                int i5 = this.zzp;
                if (i5 == 1835295092) {
                    this.zzy = null;
                    this.zzt = jZzf + this.zzq;
                    this.zzo = 2;
                } else if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1836019558 || i5 == 1953653094 || i5 == 1836475768 || i5 == 1701082227) {
                    long jZzf2 = (zzabcVar.zzf() + this.zzq) - 8;
                    this.zzm.push(new zzagh(i5, jZzf2));
                    if (this.zzq == this.zzr) {
                        zzi(jZzf2);
                    } else {
                        zzg();
                    }
                } else if (i5 == 1751411826 || i5 == 1835296868 || i5 == 1836476516 || i5 == 1936286840 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1668576371 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1937011571 || i5 == 1952867444 || i5 == 1952868452 || i5 == 1953196132 || i5 == 1953654136 || i5 == 1953658222 || i5 == 1886614376 || i5 == 1935763834 || i5 == 1935763823 || i5 == 1936027235 || i5 == 1970628964 || i5 == 1935828848 || i5 == 1936158820 || i5 == 1701606260 || i5 == 1835362404 || i5 == 1701671783) {
                    if (this.zzr != 8) {
                        throw zzcd.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.zzq > 2147483647L) {
                        throw zzcd.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzfb zzfbVar = new zzfb((int) this.zzq);
                    System.arraycopy(this.zzl.zzI(), 0, zzfbVar.zzI(), 0, 8);
                    this.zzs = zzfbVar;
                    this.zzo = 1;
                } else {
                    if (this.zzq > 2147483647L) {
                        throw zzcd.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.zzs = null;
                    this.zzo = 1;
                }
            } else if (i2 != 1) {
                long j6 = Long.MAX_VALUE;
                if (i2 != 2) {
                    zzagwVar = this.zzy;
                    if (zzagwVar != null) {
                        break;
                    }
                    SparseArray sparseArray = this.zze;
                    int size2 = sparseArray.size();
                    long j7 = Long.MAX_VALUE;
                    zzagw zzagwVar2 = null;
                    for (int i6 = 0; i6 < size2; i6++) {
                        zzagw zzagwVar3 = (zzagw) sparseArray.valueAt(i6);
                        if ((zzagwVar3.zzl || zzagwVar3.zzf != zzagwVar3.zzd.zzb) && (!zzagwVar3.zzl || zzagwVar3.zzh != zzagwVar3.zzb.zzd)) {
                            long jZzd2 = zzagwVar3.zzd();
                            if (jZzd2 < j7) {
                                zzagwVar2 = zzagwVar3;
                                j7 = jZzd2;
                            }
                        }
                    }
                    if (zzagwVar2 != null) {
                        int iZzd = (int) (zzagwVar2.zzd() - zzabcVar.zzf());
                        if (iZzd < 0) {
                            zzes.zzf("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZzd = 0;
                        }
                        ((zzaar) zzabcVar2).zzo(iZzd, false);
                        this.zzy = zzagwVar2;
                        zzagwVar = zzagwVar2;
                        break;
                    }
                    int iZzf = (int) (this.zzt - zzabcVar.zzf());
                    if (iZzf < 0) {
                        throw zzcd.zza("Offset to end of mdat was negative.", null);
                    }
                    ((zzaar) zzabcVar2).zzo(iZzf, false);
                    zzg();
                } else {
                    int size3 = this.zze.size();
                    zzagw zzagwVar4 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzahi zzahiVar2 = ((zzagw) this.zze.valueAt(i7)).zzb;
                        if (zzahiVar2.zzo) {
                            long j8 = zzahiVar2.zzc;
                            if (j8 < j6) {
                                zzagwVar4 = (zzagw) this.zze.valueAt(i7);
                                j6 = j8;
                            }
                        }
                    }
                    if (zzagwVar4 == null) {
                        this.zzo = 3;
                    } else {
                        int iZzf2 = (int) (j6 - zzabcVar.zzf());
                        if (iZzf2 < 0) {
                            throw zzcd.zza("Offset to encryption data was negative.", null);
                        }
                        zzaar zzaarVar = (zzaar) zzabcVar2;
                        zzaarVar.zzo(iZzf2, false);
                        zzahi zzahiVar3 = zzagwVar4.zzb;
                        zzfb zzfbVar2 = zzahiVar3.zzn;
                        zzaarVar.zzn(zzfbVar2.zzI(), 0, zzfbVar2.zzd(), false);
                        zzahiVar3.zzn.zzG(0);
                        zzahiVar3.zzo = false;
                    }
                }
            } else {
                int i8 = ((int) this.zzq) - this.zzr;
                zzfb zzfbVar3 = this.zzs;
                if (zzfbVar3 != null) {
                    ((zzaar) zzabcVar2).zzn(zzfbVar3.zzI(), 8, i8, false);
                    zzagi zzagiVar = new zzagi(this.zzp, zzfbVar3);
                    long jZzf3 = zzabcVar.zzf();
                    if (this.zzm.isEmpty()) {
                        int i9 = zzagiVar.zzd;
                        if (i9 == 1936286840) {
                            zzfb zzfbVar4 = zzagiVar.zza;
                            zzfbVar4.zzG(8);
                            int iZze2 = zzagj.zze(zzfbVar4.zzf());
                            zzfbVar4.zzH(4);
                            long jZzt2 = zzfbVar4.zzt();
                            if (iZze2 == 0) {
                                jZzu = zzfbVar4.zzt();
                                jZzu2 = zzfbVar4.zzt();
                            } else {
                                jZzu = zzfbVar4.zzu();
                                jZzu2 = zzfbVar4.zzu();
                            }
                            long j9 = jZzf3 + jZzu2;
                            long jZzq2 = zzfk.zzq(jZzu, 1000000L, jZzt2);
                            zzfbVar4.zzH(2);
                            int iZzp = zzfbVar4.zzp();
                            int[] iArr = new int[iZzp];
                            long[] jArr = new long[iZzp];
                            long[] jArr2 = new long[iZzp];
                            long[] jArr3 = new long[iZzp];
                            long jZzq3 = jZzq2;
                            int i10 = 0;
                            while (i10 < iZzp) {
                                int iZzf3 = zzfbVar4.zzf();
                                if ((iZzf3 & Integer.MIN_VALUE) != 0) {
                                    throw zzcd.zza("Unhandled indirect reference", null);
                                }
                                long jZzt3 = zzfbVar4.zzt();
                                iArr[i10] = iZzf3 & Integer.MAX_VALUE;
                                jArr[i10] = j9;
                                jArr3[i10] = jZzq3;
                                long j10 = jZzu + jZzt3;
                                long[] jArr4 = jArr3;
                                int i11 = i10;
                                long[] jArr5 = jArr2;
                                int[] iArr2 = iArr;
                                jZzq3 = zzfk.zzq(j10, 1000000L, jZzt2);
                                jArr5[i11] = jZzq3 - jArr4[i11];
                                zzfbVar4.zzH(4);
                                j9 += (long) iArr2[i11];
                                i10 = i11 + 1;
                                iArr = iArr2;
                                jArr = jArr;
                                jArr2 = jArr5;
                                jArr3 = jArr4;
                                iZzp = iZzp;
                                jZzu = j10;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jZzq2), new zzaap(iArr, jArr, jArr2, jArr3));
                            this.zzx = ((Long) pairCreate.first).longValue();
                            this.zzD.zzN((zzaca) pairCreate.second);
                            this.zzG = true;
                        } else if (i9 == 1701671783) {
                            zzfb zzfbVar5 = zzagiVar.zza;
                            if (this.zzE.length != 0) {
                                zzfbVar5.zzG(8);
                                int iZze3 = zzagj.zze(zzfbVar5.zzf());
                                if (iZze3 == 0) {
                                    String strZzw = zzfbVar5.zzw((char) 0);
                                    strZzw.getClass();
                                    String strZzw2 = zzfbVar5.zzw((char) 0);
                                    strZzw2.getClass();
                                    long jZzt4 = zzfbVar5.zzt();
                                    long jZzq4 = zzfk.zzq(zzfbVar5.zzt(), 1000000L, jZzt4);
                                    long j11 = this.zzx;
                                    long j12 = j11 != -9223372036854775807L ? j11 + jZzq4 : -9223372036854775807L;
                                    jZzq = zzfk.zzq(zzfbVar5.zzt(), 1000L, jZzt4);
                                    jZzt = zzfbVar5.zzt();
                                    str = strZzw;
                                    str2 = strZzw2;
                                    j = jZzq4;
                                    j2 = j12;
                                } else if (iZze3 != 1) {
                                    zzes.zzf("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iZze3);
                                } else {
                                    long jZzt5 = zzfbVar5.zzt();
                                    long jZzq5 = zzfk.zzq(zzfbVar5.zzu(), 1000000L, jZzt5);
                                    long jZzq6 = zzfk.zzq(zzfbVar5.zzt(), 1000L, jZzt5);
                                    long jZzt6 = zzfbVar5.zzt();
                                    String strZzw3 = zzfbVar5.zzw((char) 0);
                                    strZzw3.getClass();
                                    String strZzw4 = zzfbVar5.zzw((char) 0);
                                    strZzw4.getClass();
                                    jZzq = jZzq6;
                                    jZzt = jZzt6;
                                    str = strZzw3;
                                    str2 = strZzw4;
                                    j = -9223372036854775807L;
                                    j2 = jZzq5;
                                }
                                byte[] bArr = new byte[zzfbVar5.zza()];
                                zzfbVar5.zzC(bArr, 0, zzfbVar5.zza());
                                zzfb zzfbVar6 = new zzfb(this.zzk.zza(new zzadu(str, str2, jZzq, jZzt, bArr)));
                                int iZza = zzfbVar6.zza();
                                for (zzace zzaceVar : this.zzE) {
                                    zzfbVar6.zzG(0);
                                    zzaceVar.zzq(zzfbVar6, iZza);
                                }
                                if (j2 == -9223372036854775807L) {
                                    this.zzn.addLast(new zzagv(j, true, iZza));
                                    this.zzu += iZza;
                                } else if (this.zzn.isEmpty()) {
                                    for (zzace zzaceVar2 : this.zzE) {
                                        zzaceVar2.zzs(j2, 1, iZza, 0, null);
                                    }
                                } else {
                                    this.zzn.addLast(new zzagv(j2, false, iZza));
                                    this.zzu += iZza;
                                }
                            }
                        }
                        zzabcVar2 = zzabcVar;
                    } else {
                        ((zzagh) this.zzm.peek()).zzd(zzagiVar);
                    }
                } else {
                    ((zzaar) zzabcVar2).zzo(i8, false);
                }
                zzi(zzabcVar.zzf());
            }
        }
        char c = 6;
        if (this.zzo == 3) {
            int iZzb = zzagwVar.zzb();
            this.zzz = iZzb;
            if (zzagwVar.zzf < zzagwVar.zzi) {
                ((zzaar) zzabcVar2).zzo(iZzb, false);
                zzahh zzahhVarZzf = zzagwVar.zzf();
                if (zzahhVarZzf != null) {
                    zzfb zzfbVar7 = zzagwVar.zzb.zzn;
                    int i12 = zzahhVarZzf.zzd;
                    if (i12 != 0) {
                        zzfbVar7.zzH(i12);
                    }
                    if (zzagwVar.zzb.zzb(zzagwVar.zzf)) {
                        zzfbVar7.zzH(zzfbVar7.zzp() * 6);
                    }
                }
                if (!zzagwVar.zzk()) {
                    this.zzy = null;
                }
                this.zzo = 3;
                return 0;
            }
            if (zzagwVar.zzd.zza.zzg == 1) {
                this.zzz = iZzb - 8;
                ((zzaar) zzabcVar2).zzo(8, false);
            }
            if ("audio/ac4".equals(zzagwVar.zzd.zza.zzf.zzm)) {
                this.zzA = zzagwVar.zzc(this.zzz, 7);
                zzaaf.zzb(this.zzz, this.zzj);
                zzagwVar.zza.zzq(this.zzj, 7);
                iZzc = this.zzA + 7;
                this.zzA = iZzc;
            } else {
                iZzc = zzagwVar.zzc(this.zzz, 0);
                this.zzA = iZzc;
            }
            this.zzz += iZzc;
            this.zzo = 4;
            this.zzB = 0;
        }
        zzahg zzahgVar = zzagwVar.zzd.zza;
        zzace zzaceVar3 = zzagwVar.zza;
        long jZze = zzagwVar.zze();
        int i13 = zzahgVar.zzj;
        if (i13 == 0) {
            while (true) {
                int i14 = this.zzA;
                int i15 = this.zzz;
                if (i14 >= i15) {
                    break;
                }
                this.zzA += zzaceVar3.zze(zzabcVar2, i15 - i14, false);
            }
        } else {
            byte[] bArrZzI = this.zzg.zzI();
            bArrZzI[0] = 0;
            bArrZzI[1] = 0;
            bArrZzI[2] = 0;
            int i16 = i13 + 1;
            int i17 = 4 - i13;
            while (this.zzA < this.zzz) {
                int i18 = this.zzB;
                if (i18 == 0) {
                    ((zzaar) zzabcVar2).zzn(bArrZzI, i17, i16, r9);
                    this.zzg.zzG(r9);
                    int iZzf4 = this.zzg.zzf();
                    if (iZzf4 <= 0) {
                        throw zzcd.zza("Invalid NAL length", null);
                    }
                    this.zzB = iZzf4 - 1;
                    this.zzf.zzG(r9);
                    zzaceVar3.zzq(this.zzf, 4);
                    zzaceVar3.zzq(this.zzg, i);
                    if (this.zzF.length > 0) {
                        String str3 = zzahgVar.zzf.zzm;
                        byte b = bArrZzI[4];
                        byte[] bArr2 = zzfy.zza;
                        if (("video/avc".equals(str3) && (b & Ascii.US) == c) || ("video/hevc".equals(str3) && ((b & 126) >> i) == 39)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    this.zzC = z;
                    this.zzA += 5;
                    this.zzz += i17;
                } else {
                    if (this.zzC) {
                        this.zzh.zzD(i18);
                        ((zzaar) zzabcVar2).zzn(this.zzh.zzI(), 0, this.zzB, false);
                        zzaceVar3.zzq(this.zzh, this.zzB);
                        iZze = this.zzB;
                        zzfb zzfbVar8 = this.zzh;
                        int iZzb2 = zzfy.zzb(zzfbVar8.zzI(), zzfbVar8.zzd());
                        this.zzh.zzG("video/hevc".equals(zzahgVar.zzf.zzm) ? 1 : 0);
                        this.zzh.zzF(iZzb2);
                        zzaao.zza(jZze, this.zzh, this.zzF);
                    } else {
                        iZze = zzaceVar3.zze(zzabcVar2, i18, false);
                    }
                    this.zzA += iZze;
                    this.zzB -= iZze;
                    c = 6;
                    i = 1;
                }
                r9 = 0;
            }
        }
        int iZza2 = zzagwVar.zza();
        zzahh zzahhVarZzf2 = zzagwVar.zzf();
        zzaceVar3.zzs(jZze, iZza2, this.zzz, 0, zzahhVarZzf2 != null ? zzahhVarZzf2.zzc : null);
        while (!this.zzn.isEmpty()) {
            zzagv zzagvVar = (zzagv) this.zzn.removeFirst();
            this.zzu -= zzagvVar.zzc;
            long j13 = zzagvVar.zza;
            if (zzagvVar.zzb) {
                j13 += jZze;
            }
            for (zzace zzaceVar4 : this.zzE) {
                zzaceVar4.zzs(j13, 1, zzagvVar.zzc, this.zzu, null);
            }
        }
        if (!zzagwVar.zzk()) {
            this.zzy = null;
        }
        this.zzo = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzD = zzabeVar;
        zzg();
        zzace[] zzaceVarArr = new zzace[2];
        this.zzE = zzaceVarArr;
        int i = 0;
        zzace[] zzaceVarArr2 = (zzace[]) zzfk.zzH(zzaceVarArr, 0);
        this.zzE = zzaceVarArr2;
        for (zzace zzaceVar : zzaceVarArr2) {
            zzaceVar.zzk(zzc);
        }
        this.zzF = new zzace[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzace zzaceVarZzv = this.zzD.zzv(i2, 3);
            zzaceVarZzv.zzk((zzam) this.zzd.get(i));
            this.zzF[i] = zzaceVarZzv;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            ((zzagw) this.zze.valueAt(i)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        return zzahf.zza(zzabcVar);
    }

    public zzagx(int i, zzfi zzfiVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzadv();
        this.zzl = new zzfb(16);
        this.zzf = new zzfb(zzfy.zza);
        this.zzg = new zzfb(5);
        this.zzh = new zzfb();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzfb(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzabe.zza;
        this.zzE = new zzace[0];
        this.zzF = new zzace[0];
    }
}
