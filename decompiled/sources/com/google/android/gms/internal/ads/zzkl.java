package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzkl implements Handler.Callback, zztp, zzxk, zzle, zzii, zzlh {
    private boolean zzA;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private zzkk zzH;
    private long zzI;
    private int zzJ;
    private boolean zzK;
    private zzil zzL;
    private final zzjg zzN;
    private final zzig zzO;
    private final zzln[] zza;
    private final Set zzb;
    private final zzlp[] zzc;
    private final zzxl zzd;
    private final zzxm zze;
    private final zzko zzf;
    private final zzxt zzg;
    private final zzej zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzcv zzk;
    private final zzct zzl;
    private final long zzm;
    private final zzij zzn;
    private final ArrayList zzo;
    private final zzdz zzp;
    private final zzkt zzq;
    private final zzlf zzr;
    private final long zzs;
    private zzlr zzt;
    private zzlg zzu;
    private zzkj zzv;
    private boolean zzw;
    private boolean zzy;
    private boolean zzz;
    private int zzB = 0;
    private boolean zzC = false;
    private boolean zzx = false;
    private long zzM = -9223372036854775807L;

    public zzkl(zzln[] zzlnVarArr, zzxl zzxlVar, zzxm zzxmVar, zzko zzkoVar, zzxt zzxtVar, int i, boolean z, zzlx zzlxVar, zzlr zzlrVar, zzig zzigVar, long j, boolean z2, Looper looper, zzdz zzdzVar, zzjg zzjgVar, zzoh zzohVar, Looper looper2) {
        this.zzN = zzjgVar;
        this.zza = zzlnVarArr;
        this.zzd = zzxlVar;
        this.zze = zzxmVar;
        this.zzf = zzkoVar;
        this.zzg = zzxtVar;
        int i2 = 0;
        this.zzt = zzlrVar;
        this.zzO = zzigVar;
        this.zzs = j;
        this.zzp = zzdzVar;
        this.zzm = zzkoVar.zza();
        zzkoVar.zzf();
        zzlg zzlgVarZzi = zzlg.zzi(zzxmVar);
        this.zzu = zzlgVarZzi;
        this.zzv = new zzkj(zzlgVarZzi);
        int length = zzlnVarArr.length;
        this.zzc = new zzlp[2];
        zzlo zzloVarZzc = zzxlVar.zzc();
        while (true) {
            int length2 = zzlnVarArr.length;
            if (i2 >= 2) {
                this.zzn = new zzij(this, zzdzVar);
                this.zzo = new ArrayList();
                this.zzb = Collections.newSetFromMap(new IdentityHashMap());
                this.zzk = new zzcv();
                this.zzl = new zzct();
                zzxlVar.zzr(this, zzxtVar);
                this.zzK = true;
                zzej zzejVarZzb = zzdzVar.zzb(looper, null);
                this.zzq = new zzkt(zzlxVar, zzejVarZzb);
                this.zzr = new zzlf(this, zzlxVar, zzejVarZzb, zzohVar);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.zzi = handlerThread;
                handlerThread.start();
                Looper looper3 = handlerThread.getLooper();
                this.zzj = looper3;
                this.zzh = zzdzVar.zzb(looper3, this);
                return;
            }
            zzlnVarArr[i2].zzu(i2, zzohVar, zzdzVar);
            this.zzc[i2] = zzlnVarArr[i2].zzl();
            this.zzc[i2].zzI(zzloVarZzc);
            i2++;
        }
    }

    private final void zzA(zzln zzlnVar) throws zzil {
        if (zzae(zzlnVar)) {
            this.zzn.zzd(zzlnVar);
            zzal(zzlnVar);
            zzlnVar.zzq();
            this.zzG--;
        }
    }

    private final void zzB() throws zzil {
        int length = this.zza.length;
        zzC(new boolean[2]);
    }

    private final void zzC(boolean[] zArr) throws zzil {
        zzkq zzkqVarZze = this.zzq.zze();
        zzxm zzxmVarZzi = zzkqVarZze.zzi();
        int i = 0;
        while (true) {
            int length = this.zza.length;
            if (i >= 2) {
                break;
            }
            if (!zzxmVarZzi.zzb(i) && this.zzb.remove(this.zza[i])) {
                this.zza[i].zzF();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i2 >= 2) {
                zzkqVarZze.zzg = true;
                return;
            }
            if (zzxmVarZzi.zzb(i2)) {
                boolean z = zArr[i2];
                zzln zzlnVar = this.zza[i2];
                if (!zzae(zzlnVar)) {
                    zzkq zzkqVarZze2 = this.zzq.zze();
                    boolean z2 = zzkqVarZze2 == this.zzq.zzd();
                    zzxm zzxmVarZzi2 = zzkqVarZze2.zzi();
                    zzlq zzlqVar = zzxmVarZzi2.zzb[i2];
                    zzam[] zzamVarArrZzaj = zzaj(zzxmVarZzi2.zzc[i2]);
                    boolean z3 = zzah() && this.zzu.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzG++;
                    this.zzb.add(zzlnVar);
                    zzlnVar.zzr(zzlqVar, zzamVarArrZzaj, zzkqVarZze2.zzc[i2], this.zzI, z4, z2, zzkqVarZze2.zzf(), zzkqVarZze2.zze());
                    zzlnVar.zzt(11, new zzke(this));
                    this.zzn.zze(zzlnVar);
                    if (z3) {
                        zzlnVar.zzK();
                    }
                }
            }
            i2++;
        }
    }

    private final void zzD(IOException iOException, int i) {
        zzil zzilVarZzc = zzil.zzc(iOException, i);
        zzkq zzkqVarZzd = this.zzq.zzd();
        if (zzkqVarZzd != null) {
            zzilVarZzc = zzilVarZzc.zza(zzkqVarZzd.zzf.zza);
        }
        zzes.zzd("ExoPlayerImplInternal", "Playback error", zzilVarZzc);
        zzW(false, false);
        this.zzu = this.zzu.zzf(zzilVarZzc);
    }

    private final void zzE(boolean z) {
        zzkq zzkqVarZzc = this.zzq.zzc();
        zzts zztsVar = zzkqVarZzc == null ? this.zzu.zzb : zzkqVarZzc.zzf.zza;
        boolean z2 = !this.zzu.zzk.equals(zztsVar);
        if (z2) {
            this.zzu = this.zzu.zzc(zztsVar);
        }
        zzlg zzlgVar = this.zzu;
        zzlgVar.zzp = zzkqVarZzc == null ? zzlgVar.zzr : zzkqVarZzc.zzc();
        this.zzu.zzq = zzt();
        if ((z2 || z) && zzkqVarZzc != null && zzkqVarZzc.zzd) {
            zzZ(zzkqVarZzc.zzf.zza, zzkqVarZzc.zzh(), zzkqVarZzc.zzi());
        }
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0337  */
    /* JADX WARN: Code duplicated, block: B:186:0x034b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0353  */
    /* JADX WARN: Code duplicated, block: B:190:0x035d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x0370  */
    /* JADX WARN: Code duplicated, block: B:199:0x037d  */
    /* JADX WARN: Code duplicated, block: B:203:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x013d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0158  */
    /* JADX WARN: Code duplicated, block: B:54:0x0163  */
    /* JADX WARN: Code duplicated, block: B:59:0x016c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0175  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d4  */
    private final void zzF(zzcw zzcwVar, boolean z) throws Throwable {
        zzts zztsVar;
        zzkt zzktVar;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int iZzg;
        int iZzg2;
        boolean z5;
        long jLongValue;
        zzts zztsVarZzh;
        int i3;
        boolean z6;
        boolean z7;
        zzct zzctVarZzn;
        long j;
        long jZzv;
        boolean z8;
        boolean z9;
        boolean z10;
        zzts zztsVarZzj;
        int i4;
        boolean z11;
        int iZzg3;
        boolean z12;
        boolean z13;
        long jMax;
        zzkl zzklVar = this;
        zzlg zzlgVar = zzklVar.zzu;
        zzkk zzkkVar = zzklVar.zzH;
        zzkt zzktVar2 = zzklVar.zzq;
        int i5 = zzklVar.zzB;
        boolean z14 = zzklVar.zzC;
        zzcv zzcvVar = zzklVar.zzk;
        zzct zzctVar = zzklVar.zzl;
        boolean z15 = true;
        if (zzcwVar.zzo()) {
            zztsVarZzj = zzlg.zzj();
            j = -9223372036854775807L;
            z8 = false;
            z9 = false;
            jZzv = 0;
            z10 = true;
        } else {
            zzts zztsVar2 = zzlgVar.zzb;
            Object obj = zztsVar2.zza;
            boolean zZzag = zzag(zzlgVar, zzctVar);
            long jLongValue2 = (zzlgVar.zzb.zzb() || zZzag) ? zzlgVar.zzc : zzlgVar.zzr;
            if (zzkkVar != null) {
                zztsVar = zztsVar2;
                zzktVar = zzktVar2;
                i = -1;
                Pair pairZzy = zzy(zzcwVar, zzkkVar, true, i5, z14, zzcvVar, zzctVar);
                if (pairZzy == null) {
                    iZzg3 = zzcwVar.zzg(z14);
                    jLongValue2 = jLongValue2;
                    z5 = true;
                    z12 = false;
                    z13 = false;
                } else {
                    if (zzkkVar.zzc == -9223372036854775807L) {
                        iZzg3 = zzcwVar.zzn(pairZzy.first, zzctVar).zzd;
                        jLongValue2 = jLongValue2;
                        z11 = false;
                    } else {
                        obj = pairZzy.first;
                        jLongValue2 = ((Long) pairZzy.second).longValue();
                        z11 = true;
                        iZzg3 = -1;
                    }
                    z12 = zzlgVar.zze == 4;
                    z13 = z11;
                    z5 = false;
                }
                z2 = z12;
                i2 = iZzg3;
                z4 = z13;
            } else {
                zztsVar = zztsVar2;
                zzktVar = zzktVar2;
                i = -1;
                if (zzlgVar.zza.zzo()) {
                    iZzg = zzcwVar.zzg(z14);
                } else {
                    if (zzcwVar.zza(obj) == -1) {
                        Object objZze = zze(zzcvVar, zzctVar, i5, z14, obj, zzlgVar.zza, zzcwVar);
                        if (objZze == null) {
                            iZzg2 = zzcwVar.zzg(z14);
                            z5 = true;
                        } else {
                            iZzg2 = zzcwVar.zzn(objZze, zzctVar).zzd;
                            z5 = false;
                        }
                        i2 = iZzg2;
                        jLongValue2 = jLongValue2;
                        z2 = false;
                        z4 = false;
                    } else if (jLongValue2 == -9223372036854775807L) {
                        iZzg = zzcwVar.zzn(obj, zzctVar).zzd;
                    } else if (zZzag) {
                        zzlgVar.zza.zzn(zztsVar.zza, zzctVar);
                        if (zzlgVar.zza.zze(zzctVar.zzd, zzcvVar, 0L).zzp == zzlgVar.zza.zza(zztsVar.zza)) {
                            Pair pairZzl = zzcwVar.zzl(zzcvVar, zzctVar, zzcwVar.zzn(obj, zzctVar).zzd, jLongValue2);
                            obj = pairZzl.first;
                            jLongValue2 = ((Long) pairZzl.second).longValue();
                        } else {
                            jLongValue2 = jLongValue2;
                        }
                        obj = obj;
                        i2 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        i2 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                    if (i2 != i) {
                        Pair pairZzl2 = zzcwVar.zzl(zzcvVar, zzctVar, i2, -9223372036854775807L);
                        obj = pairZzl2.first;
                        jLongValue = ((Long) pairZzl2.second).longValue();
                        jLongValue2 = -9223372036854775807L;
                    } else {
                        jLongValue = jLongValue2;
                    }
                    zztsVarZzh = zzktVar.zzh(zzcwVar, obj, jLongValue);
                    i3 = zztsVarZzh.zze;
                    if (i3 != i || ((i4 = zztsVar.zze) != i && i3 >= i4)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (zztsVar.zza.equals(obj) || zztsVar.zzb() || zztsVarZzh.zzb() || !z6) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    zzctVarZzn = zzcwVar.zzn(obj, zzctVar);
                    if (!zZzag && jLongValue2 == jLongValue2 && zztsVar.zza.equals(zztsVarZzh.zza)) {
                        if (zztsVar.zzb()) {
                            zzctVarZzn.zzn(zztsVar.zzb);
                        }
                        if (zztsVarZzh.zzb()) {
                            zzctVarZzn.zzn(zztsVarZzh.zzb);
                        }
                    }
                    if (true == z7) {
                        zztsVarZzh = zztsVar;
                    }
                    if (zztsVarZzh.zzb()) {
                        if (zztsVarZzh.equals(zztsVar)) {
                            jLongValue = zzlgVar.zzr;
                        } else {
                            zzcwVar.zzn(zztsVarZzh.zza, zzctVar);
                            if (zztsVarZzh.zzc == zzctVar.zze(zztsVarZzh.zzb)) {
                                zzctVar.zzj();
                            }
                            jLongValue = 0;
                        }
                    }
                    zzklVar = this;
                    j = jLongValue2;
                    jZzv = jLongValue;
                    z8 = z2;
                    z15 = z3;
                    z9 = z4;
                    z10 = true;
                    zztsVarZzj = zztsVarZzh;
                }
                i2 = iZzg;
                z2 = false;
                z3 = false;
                z4 = false;
                if (i2 != i) {
                    Pair pairZzl3 = zzcwVar.zzl(zzcvVar, zzctVar, i2, -9223372036854775807L);
                    obj = pairZzl3.first;
                    jLongValue = ((Long) pairZzl3.second).longValue();
                    jLongValue2 = -9223372036854775807L;
                } else {
                    jLongValue = jLongValue2;
                }
                zztsVarZzh = zzktVar.zzh(zzcwVar, obj, jLongValue);
                i3 = zztsVarZzh.zze;
                if (i3 != i) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (zztsVar.zza.equals(obj)) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                zzctVarZzn = zzcwVar.zzn(obj, zzctVar);
                if (!zZzag) {
                    if (zztsVar.zzb()) {
                        zzctVarZzn.zzn(zztsVar.zzb);
                    }
                    if (zztsVarZzh.zzb()) {
                        zzctVarZzn.zzn(zztsVarZzh.zzb);
                    }
                }
                if (true == z7) {
                    zztsVarZzh = zztsVar;
                }
                if (zztsVarZzh.zzb()) {
                    if (zztsVarZzh.equals(zztsVar)) {
                        jLongValue = zzlgVar.zzr;
                    } else {
                        zzcwVar.zzn(zztsVarZzh.zza, zzctVar);
                        if (zztsVarZzh.zzc == zzctVar.zze(zztsVarZzh.zzb)) {
                            zzctVar.zzj();
                        }
                        jLongValue = 0;
                    }
                }
                zzklVar = this;
                j = jLongValue2;
                jZzv = jLongValue;
                z8 = z2;
                z15 = z3;
                z9 = z4;
                z10 = true;
                zztsVarZzj = zztsVarZzh;
            }
            Object obj2 = obj;
            z3 = z5;
            obj = obj2;
            if (i2 != i) {
                Pair pairZzl4 = zzcwVar.zzl(zzcvVar, zzctVar, i2, -9223372036854775807L);
                obj = pairZzl4.first;
                jLongValue = ((Long) pairZzl4.second).longValue();
                jLongValue2 = -9223372036854775807L;
            } else {
                jLongValue = jLongValue2;
            }
            zztsVarZzh = zzktVar.zzh(zzcwVar, obj, jLongValue);
            i3 = zztsVarZzh.zze;
            if (i3 != i) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (zztsVar.zza.equals(obj)) {
                z7 = false;
            } else {
                z7 = false;
            }
            zzctVarZzn = zzcwVar.zzn(obj, zzctVar);
            if (!zZzag) {
                if (zztsVar.zzb()) {
                    zzctVarZzn.zzn(zztsVar.zzb);
                }
                if (zztsVarZzh.zzb()) {
                    zzctVarZzn.zzn(zztsVarZzh.zzb);
                }
            }
            if (true == z7) {
                zztsVarZzh = zztsVar;
            }
            if (zztsVarZzh.zzb()) {
                if (zztsVarZzh.equals(zztsVar)) {
                    jLongValue = zzlgVar.zzr;
                } else {
                    zzcwVar.zzn(zztsVarZzh.zza, zzctVar);
                    if (zztsVarZzh.zzc == zzctVar.zze(zztsVarZzh.zzb)) {
                        zzctVar.zzj();
                    }
                    jLongValue = 0;
                }
            }
            zzklVar = this;
            j = jLongValue2;
            jZzv = jLongValue;
            z8 = z2;
            z15 = z3;
            z9 = z4;
            z10 = true;
            zztsVarZzj = zztsVarZzh;
        }
        boolean z16 = (zzklVar.zzu.zzb.equals(zztsVarZzj) && jZzv == zzklVar.zzu.zzr) ? false : true;
        if (z15) {
            try {
                if (zzklVar.zzu.zze != z10) {
                    try {
                        zzklVar.zzU(4);
                    } catch (Throwable th) {
                        th = th;
                        zzlg zzlgVar2 = zzklVar.zzu;
                        zzab(zzcwVar, zztsVarZzj, zzlgVar2.zza, zzlgVar2.zzb, true == z9 ? jZzv : -9223372036854775807L, false);
                        if (z16) {
                            zzlg zzlgVar3 = zzklVar.zzu;
                            Object obj3 = zzlgVar3.zzb.zza;
                            zzcw zzcwVar2 = zzlgVar3.zza;
                            zzklVar.zzu = zzz(zztsVarZzj, jZzv, j, zzklVar.zzu.zzd, (z16 || !z || zzcwVar2.zzo() || zzcwVar2.zzn(obj3, zzklVar.zzl).zzg) ? false : true, zzcwVar.zza(obj3) == -1 ? 4 : 3);
                        } else {
                            zzlg zzlgVar4 = zzklVar.zzu;
                            Object obj4 = zzlgVar4.zzb.zza;
                            zzcw zzcwVar3 = zzlgVar4.zza;
                            zzklVar.zzu = zzz(zztsVarZzj, jZzv, j, zzklVar.zzu.zzd, (z16 || !z || zzcwVar3.zzo() || zzcwVar3.zzn(obj4, zzklVar.zzl).zzg) ? false : true, zzcwVar.zza(obj4) == -1 ? 4 : 3);
                        }
                        zzN();
                        zzklVar.zzP(zzcwVar, zzklVar.zzu.zza);
                        zzklVar.zzu = zzklVar.zzu.zzh(zzcwVar);
                        if (!zzcwVar.zzo()) {
                            zzklVar.zzH = null;
                        }
                        zzklVar.zzE(false);
                        throw th;
                    }
                }
                zzklVar.zzM(false, false, false, z10);
            } catch (Throwable th2) {
                th = th2;
                zzlg zzlgVar5 = zzklVar.zzu;
                zzab(zzcwVar, zztsVarZzj, zzlgVar5.zza, zzlgVar5.zzb, true == z9 ? jZzv : -9223372036854775807L, false);
                if (z16 || j != zzklVar.zzu.zzc) {
                    zzlg zzlgVar6 = zzklVar.zzu;
                    Object obj5 = zzlgVar6.zzb.zza;
                    zzcw zzcwVar4 = zzlgVar6.zza;
                    zzklVar.zzu = zzz(zztsVarZzj, jZzv, j, zzklVar.zzu.zzd, (z16 || !z || zzcwVar4.zzo() || zzcwVar4.zzn(obj5, zzklVar.zzl).zzg) ? false : true, zzcwVar.zza(obj5) == -1 ? 4 : 3);
                }
                zzN();
                zzklVar.zzP(zzcwVar, zzklVar.zzu.zza);
                zzklVar.zzu = zzklVar.zzu.zzh(zzcwVar);
                if (!zzcwVar.zzo()) {
                    zzklVar.zzH = null;
                }
                zzklVar.zzE(false);
                throw th;
            }
        }
        try {
            if (!z16) {
                zzkt zzktVar3 = zzklVar.zzq;
                long j2 = zzklVar.zzI;
                zzkq zzkqVarZze = zzktVar3.zze();
                if (zzkqVarZze != null) {
                    long jZze = zzkqVarZze.zze();
                    if (!zzkqVarZze.zzd) {
                        jMax = jZze;
                        break;
                    }
                    jMax = jZze;
                    int i6 = 0;
                    while (true) {
                        zzln[] zzlnVarArr = zzklVar.zza;
                        int length = zzlnVarArr.length;
                        if (i6 >= 2) {
                            break;
                        }
                        if (zzae(zzlnVarArr[i6]) && zzklVar.zza[i6].zzo() == zzkqVarZze.zzc[i6]) {
                            long jZzbe = zzklVar.zza[i6].zzbe();
                            jZze = Long.MIN_VALUE;
                            if (jZzbe == Long.MIN_VALUE) {
                                jMax = jZze;
                                break;
                            }
                            jMax = Math.max(jZzbe, jMax);
                        }
                        i6++;
                    }
                } else {
                    jMax = 0;
                }
                if (!zzktVar3.zzo(zzcwVar, j2, jMax)) {
                    zzklVar.zzR(false);
                }
            } else if (!zzcwVar.zzo()) {
                for (zzkq zzkqVarZzd = zzklVar.zzq.zzd(); zzkqVarZzd != null; zzkqVarZzd = zzkqVarZzd.zzg()) {
                    if (zzkqVarZzd.zzf.zza.equals(zztsVarZzj)) {
                        zzkqVarZzd.zzf = zzklVar.zzq.zzg(zzcwVar, zzkqVarZzd.zzf);
                        zzkqVarZzd.zzq();
                    }
                }
                jZzv = zzklVar.zzv(zztsVarZzj, jZzv, z8);
            }
            zzlg zzlgVar7 = zzklVar.zzu;
            zzab(zzcwVar, zztsVarZzj, zzlgVar7.zza, zzlgVar7.zzb, z10 != z9 ? -9223372036854775807L : jZzv, false);
            if (z16 || j != zzklVar.zzu.zzc) {
                zzlg zzlgVar8 = zzklVar.zzu;
                Object obj6 = zzlgVar8.zzb.zza;
                zzcw zzcwVar5 = zzlgVar8.zza;
                zzklVar.zzu = zzz(zztsVarZzj, jZzv, j, zzklVar.zzu.zzd, z16 && z && !zzcwVar5.zzo() && !zzcwVar5.zzn(obj6, zzklVar.zzl).zzg, zzcwVar.zza(obj6) == -1 ? 4 : 3);
            }
            zzN();
            zzklVar.zzP(zzcwVar, zzklVar.zzu.zza);
            zzklVar.zzu = zzklVar.zzu.zzh(zzcwVar);
            if (!zzcwVar.zzo()) {
                zzklVar.zzH = null;
            }
            zzklVar.zzE(false);
        } catch (Throwable th3) {
            th = th3;
            zzlg zzlgVar9 = zzklVar.zzu;
            zzab(zzcwVar, zztsVarZzj, zzlgVar9.zza, zzlgVar9.zzb, true == z9 ? jZzv : -9223372036854775807L, false);
            if (z16) {
                zzlg zzlgVar10 = zzklVar.zzu;
                Object obj7 = zzlgVar10.zzb.zza;
                zzcw zzcwVar6 = zzlgVar10.zza;
                zzklVar.zzu = zzz(zztsVarZzj, jZzv, j, zzklVar.zzu.zzd, (z16 || !z || zzcwVar6.zzo() || zzcwVar6.zzn(obj7, zzklVar.zzl).zzg) ? false : true, zzcwVar.zza(obj7) == -1 ? 4 : 3);
            } else {
                zzlg zzlgVar11 = zzklVar.zzu;
                Object obj8 = zzlgVar11.zzb.zza;
                zzcw zzcwVar7 = zzlgVar11.zza;
                zzklVar.zzu = zzz(zztsVarZzj, jZzv, j, zzklVar.zzu.zzd, (z16 || !z || zzcwVar7.zzo() || zzcwVar7.zzn(obj8, zzklVar.zzl).zzg) ? false : true, zzcwVar.zza(obj8) == -1 ? 4 : 3);
            }
            zzN();
            zzklVar.zzP(zzcwVar, zzklVar.zzu.zza);
            zzklVar.zzu = zzklVar.zzu.zzh(zzcwVar);
            if (!zzcwVar.zzo()) {
                zzklVar.zzH = null;
            }
            zzklVar.zzE(false);
            throw th;
        }
    }

    private final void zzG(zzch zzchVar, boolean z) throws zzil {
        zzH(zzchVar, zzchVar.zzc, true, z);
    }

    private final void zzH(zzch zzchVar, float f, boolean z, boolean z2) throws zzil {
        int i;
        zzkl zzklVar = this;
        if (z) {
            if (z2) {
                zzklVar.zzv.zza(1);
            }
            zzlg zzlgVar = zzklVar.zzu;
            zzklVar = this;
            zzklVar.zzu = new zzlg(zzlgVar.zza, zzlgVar.zzb, zzlgVar.zzc, zzlgVar.zzd, zzlgVar.zze, zzlgVar.zzf, zzlgVar.zzg, zzlgVar.zzh, zzlgVar.zzi, zzlgVar.zzj, zzlgVar.zzk, zzlgVar.zzl, zzlgVar.zzm, zzchVar, zzlgVar.zzp, zzlgVar.zzq, zzlgVar.zzr, zzlgVar.zzs, zzlgVar.zzo);
        }
        float f2 = zzchVar.zzc;
        zzkq zzkqVarZzd = zzklVar.zzq.zzd();
        while (true) {
            i = 0;
            if (zzkqVarZzd == null) {
                break;
            }
            zzxf[] zzxfVarArr = zzkqVarZzd.zzi().zzc;
            int length = zzxfVarArr.length;
            while (i < length) {
                zzxf zzxfVar = zzxfVarArr[i];
                i++;
            }
            zzkqVarZzd = zzkqVarZzd.zzg();
        }
        zzln[] zzlnVarArr = zzklVar.zza;
        int length2 = zzlnVarArr.length;
        while (i < 2) {
            zzln zzlnVar = zzlnVarArr[i];
            if (zzlnVar != null) {
                zzlnVar.zzJ(f, zzchVar.zzc);
            }
            i++;
        }
    }

    private final void zzI() {
        long jZze;
        long jZze2;
        boolean zZzg = false;
        if (zzad()) {
            zzkq zzkqVarZzc = this.zzq.zzc();
            long jZzu = zzu(zzkqVarZzc.zzd());
            if (zzkqVarZzc == this.zzq.zzd()) {
                jZze = this.zzI;
                jZze2 = zzkqVarZzc.zze();
            } else {
                jZze = this.zzI - zzkqVarZzc.zze();
                jZze2 = zzkqVarZzc.zzf.zzb;
            }
            long j = jZze - jZze2;
            boolean zZzg2 = this.zzf.zzg(j, jZzu, this.zzn.zzc().zzc);
            if (zZzg2 || jZzu >= 500000 || this.zzm <= 0) {
                zZzg = zZzg2;
            } else {
                this.zzq.zzd().zza.zzj(this.zzu.zzr, false);
                zZzg = this.zzf.zzg(j, jZzu, this.zzn.zzc().zzc);
            }
        }
        this.zzA = zZzg;
        if (zZzg) {
            this.zzq.zzc().zzk(this.zzI);
        }
        zzY();
    }

    private final void zzJ() {
        this.zzv.zzc(this.zzu);
        if (this.zzv.zzg) {
            zzjg zzjgVar = this.zzN;
            zzjgVar.zza.zzU(this.zzv);
            this.zzv = new zzkj(this.zzu);
        }
    }

    private final void zzK() throws zzil {
        int i;
        float f = this.zzn.zzc().zzc;
        zzkq zzkqVarZze = this.zzq.zze();
        boolean z = true;
        for (zzkq zzkqVarZzd = this.zzq.zzd(); zzkqVarZzd != null && zzkqVarZzd.zzd; zzkqVarZzd = zzkqVarZzd.zzg()) {
            zzxm zzxmVarZzj = zzkqVarZzd.zzj(f, this.zzu.zza);
            zzxm zzxmVarZzi = zzkqVarZzd.zzi();
            boolean z2 = false;
            if (zzxmVarZzi != null && zzxmVarZzi.zzc.length == zzxmVarZzj.zzc.length) {
                int i2 = 0;
                while (true) {
                    if (i2 >= zzxmVarZzj.zzc.length) {
                        if (zzkqVarZzd != zzkqVarZze) {
                            z2 = true;
                        }
                        z &= z2;
                    } else if (zzxmVarZzj.zza(zzxmVarZzi, i2)) {
                        i2++;
                    }
                }
            }
            if (z) {
                zzkq zzkqVarZzd2 = this.zzq.zzd();
                boolean zZzm = this.zzq.zzm(zzkqVarZzd2);
                int length = this.zza.length;
                boolean[] zArr = new boolean[2];
                long jZzb = zzkqVarZzd2.zzb(zzxmVarZzj, this.zzu.zzr, zZzm, zArr);
                zzlg zzlgVar = this.zzu;
                boolean z3 = (zzlgVar.zze == 4 || jZzb == zzlgVar.zzr) ? false : true;
                zzlg zzlgVar2 = this.zzu;
                i = 2;
                this.zzu = zzz(zzlgVar2.zzb, jZzb, zzlgVar2.zzc, zzlgVar2.zzd, z3, 5);
                if (z3) {
                    zzO(jZzb);
                }
                int length2 = this.zza.length;
                boolean[] zArr2 = new boolean[2];
                int i3 = 0;
                while (true) {
                    zzln[] zzlnVarArr = this.zza;
                    int length3 = zzlnVarArr.length;
                    if (i3 >= 2) {
                        break;
                    }
                    zzln zzlnVar = zzlnVarArr[i3];
                    boolean zZzae = zzae(zzlnVar);
                    zArr2[i3] = zZzae;
                    zzvj zzvjVar = zzkqVarZzd2.zzc[i3];
                    if (zZzae) {
                        if (zzvjVar != zzlnVar.zzo()) {
                            zzA(zzlnVar);
                        } else if (zArr[i3]) {
                            zzlnVar.zzG(this.zzI);
                        }
                    }
                    i3++;
                }
                zzC(zArr2);
            } else {
                i = 2;
                this.zzq.zzm(zzkqVarZzd);
                if (zzkqVarZzd.zzd) {
                    zzkqVarZzd.zza(zzxmVarZzj, Math.max(zzkqVarZzd.zzf.zzb, this.zzI - zzkqVarZzd.zze()), false);
                }
            }
            zzE(true);
            if (this.zzu.zze != 4) {
                zzI();
                zzaa();
                this.zzh.zzi(i);
                return;
            }
            return;
        }
    }

    private final void zzL() throws zzil {
        zzK();
        zzR(true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a5 A[PHI: r2 r5 r7
  0x00a5: PHI (r2v2 com.google.android.gms.internal.ads.zzts) = (r2v1 com.google.android.gms.internal.ads.zzts), (r2v6 com.google.android.gms.internal.ads.zzts) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r5v3 long) = (r5v2 long), (r5v15 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0 A[PHI: r4
  0x00f0: PHI (r4v3 com.google.android.gms.internal.ads.zzcw) = 
  (r4v2 com.google.android.gms.internal.ads.zzcw)
  (r4v2 com.google.android.gms.internal.ads.zzcw)
  (r4v6 com.google.android.gms.internal.ads.zzcw)
  (r4v6 com.google.android.gms.internal.ads.zzcw)
 binds: [B:36:0x00b4, B:38:0x00b8, B:40:0x00c9, B:42:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzM(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        boolean z5;
        zzts zztsVar;
        zzcw zzcwVar;
        this.zzh.zzf(2);
        this.zzL = null;
        this.zzz = false;
        this.zzn.zzi();
        this.zzI = 1000000000000L;
        zzln[] zzlnVarArr = this.zza;
        int length = zzlnVarArr.length;
        for (int i = 0; i < 2; i++) {
            try {
                zzA(zzlnVarArr[i]);
            } catch (zzil | RuntimeException e) {
                zzes.zzd("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            zzln[] zzlnVarArr2 = this.zza;
            int length2 = zzlnVarArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                zzln zzlnVar = zzlnVarArr2[i2];
                if (this.zzb.remove(zzlnVar)) {
                    try {
                        zzlnVar.zzF();
                    } catch (RuntimeException e2) {
                        zzes.zzd("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.zzG = 0;
        zzlg zzlgVar = this.zzu;
        zzts zztsVar2 = zzlgVar.zzb;
        long jLongValue = zzlgVar.zzr;
        long j3 = (this.zzu.zzb.zzb() || zzag(this.zzu, this.zzl)) ? this.zzu.zzc : this.zzu.zzr;
        if (z2) {
            this.zzH = null;
            Pair pairZzx = zzx(this.zzu.zza);
            zztsVar2 = (zzts) pairZzx.first;
            jLongValue = ((Long) pairZzx.second).longValue();
            j3 = -9223372036854775807L;
            if (zztsVar2.equals(this.zzu.zzb)) {
                j = jLongValue;
                j2 = j3;
                z5 = false;
            } else {
                z5 = true;
                j = jLongValue;
                j2 = -9223372036854775807L;
            }
        } else {
            j = jLongValue;
            j2 = j3;
            z5 = false;
        }
        this.zzq.zzi();
        this.zzA = false;
        zzcw zzcwVarZzx = this.zzu.zza;
        if (z3 && (zzcwVarZzx instanceof zzll)) {
            zzcwVarZzx = ((zzll) zzcwVarZzx).zzx(this.zzr.zzq());
            if (zztsVar2.zzb != -1) {
                zzcwVarZzx.zzn(zztsVar2.zza, this.zzl);
                int i3 = this.zzl.zzd;
                zzcv zzcvVar = this.zzk;
                zzcwVarZzx.zze(i3, zzcvVar, 0L);
                if (zzcvVar.zzb()) {
                    zzcwVar = zzcwVarZzx;
                    zztsVar = new zzts(zztsVar2.zza, zztsVar2.zzd);
                } else {
                    zztsVar = zztsVar2;
                    zzcwVar = zzcwVarZzx;
                }
            } else {
                zztsVar = zztsVar2;
                zzcwVar = zzcwVarZzx;
            }
        } else {
            zztsVar = zztsVar2;
            zzcwVar = zzcwVarZzx;
        }
        zzlg zzlgVar2 = this.zzu;
        int i4 = zzlgVar2.zze;
        zzil zzilVar = z4 ? null : zzlgVar2.zzf;
        zzvs zzvsVar = z5 ? zzvs.zza : zzlgVar2.zzh;
        zzxm zzxmVar = z5 ? this.zze : this.zzu.zzi;
        List listZzl = z5 ? zzfud.zzl() : this.zzu.zzj;
        zzlg zzlgVar3 = this.zzu;
        this.zzu = new zzlg(zzcwVar, zztsVar, j2, j, i4, zzilVar, false, zzvsVar, zzxmVar, listZzl, zztsVar, zzlgVar3.zzl, zzlgVar3.zzm, zzlgVar3.zzn, j, 0L, j, 0L, false);
        if (z3) {
            this.zzr.zzh();
        }
    }

    private final void zzN() {
        zzkq zzkqVarZzd = this.zzq.zzd();
        boolean z = false;
        if (zzkqVarZzd != null && zzkqVarZzd.zzf.zzh && this.zzx) {
            z = true;
        }
        this.zzy = z;
    }

    private final void zzO(long j) throws zzil {
        zzkq zzkqVarZzd = this.zzq.zzd();
        long jZze = j + (zzkqVarZzd == null ? 1000000000000L : zzkqVarZzd.zze());
        this.zzI = jZze;
        this.zzn.zzf(jZze);
        zzln[] zzlnVarArr = this.zza;
        int length = zzlnVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzln zzlnVar = zzlnVarArr[i];
            if (zzae(zzlnVar)) {
                zzlnVar.zzG(this.zzI);
            }
        }
        for (zzkq zzkqVarZzd2 = this.zzq.zzd(); zzkqVarZzd2 != null; zzkqVarZzd2 = zzkqVarZzd2.zzg()) {
            for (zzxf zzxfVar : zzkqVarZzd2.zzi().zzc) {
            }
        }
    }

    private final void zzP(zzcw zzcwVar, zzcw zzcwVar2) {
        if (zzcwVar.zzo() && zzcwVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
            return;
        }
        zzki zzkiVar = (zzki) this.zzo.get(size);
        Object obj = zzkiVar.zzb;
        zzlj zzljVar = zzkiVar.zza;
        int i = zzfk.zza;
        zzlj zzljVar2 = zzkiVar.zza;
        throw null;
    }

    private final void zzQ(long j, long j2) {
        this.zzh.zzj(2, j + j2);
    }

    private final void zzR(boolean z) throws zzil {
        zzts zztsVar = this.zzq.zzd().zzf.zza;
        long jZzw = zzw(zztsVar, this.zzu.zzr, true, false);
        if (jZzw != this.zzu.zzr) {
            zzlg zzlgVar = this.zzu;
            this.zzu = zzz(zztsVar, jZzw, zzlgVar.zzc, zzlgVar.zzd, z, 5);
        }
    }

    private final void zzS(zzch zzchVar) {
        this.zzh.zzf(16);
        this.zzn.zzg(zzchVar);
    }

    private final void zzT(boolean z, int i, boolean z2, int i2) throws zzil {
        this.zzv.zza(z2 ? 1 : 0);
        this.zzv.zzb(i2);
        this.zzu = this.zzu.zze(z, i);
        this.zzz = false;
        for (zzkq zzkqVarZzd = this.zzq.zzd(); zzkqVarZzd != null; zzkqVarZzd = zzkqVarZzd.zzg()) {
            for (zzxf zzxfVar : zzkqVarZzd.zzi().zzc) {
            }
        }
        if (!zzah()) {
            zzX();
            zzaa();
            return;
        }
        int i3 = this.zzu.zze;
        if (i3 == 3) {
            zzV();
            this.zzh.zzi(2);
        } else if (i3 == 2) {
            this.zzh.zzi(2);
        }
    }

    private final void zzU(int i) {
        zzlg zzlgVar = this.zzu;
        if (zzlgVar.zze != i) {
            if (i != 2) {
                this.zzM = -9223372036854775807L;
            }
            this.zzu = zzlgVar.zzg(i);
        }
    }

    private final void zzV() throws zzil {
        this.zzz = false;
        this.zzn.zzh();
        zzln[] zzlnVarArr = this.zza;
        int length = zzlnVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzln zzlnVar = zzlnVarArr[i];
            if (zzae(zzlnVar)) {
                zzlnVar.zzK();
            }
        }
    }

    private final void zzW(boolean z, boolean z2) {
        zzM(z || !this.zzD, false, true, false);
        this.zzv.zza(z2 ? 1 : 0);
        this.zzf.zzd();
        zzU(1);
    }

    private final void zzX() throws zzil {
        this.zzn.zzi();
        zzln[] zzlnVarArr = this.zza;
        int length = zzlnVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzln zzlnVar = zzlnVarArr[i];
            if (zzae(zzlnVar)) {
                zzal(zzlnVar);
            }
        }
    }

    private final void zzY() {
        zzkq zzkqVarZzc = this.zzq.zzc();
        boolean z = this.zzA || (zzkqVarZzc != null && zzkqVarZzc.zza.zzp());
        zzlg zzlgVar = this.zzu;
        if (z != zzlgVar.zzg) {
            this.zzu = new zzlg(zzlgVar.zza, zzlgVar.zzb, zzlgVar.zzc, zzlgVar.zzd, zzlgVar.zze, zzlgVar.zzf, z, zzlgVar.zzh, zzlgVar.zzi, zzlgVar.zzj, zzlgVar.zzk, zzlgVar.zzl, zzlgVar.zzm, zzlgVar.zzn, zzlgVar.zzp, zzlgVar.zzq, zzlgVar.zzr, zzlgVar.zzs, zzlgVar.zzo);
        }
    }

    private final void zzZ(zzts zztsVar, zzvs zzvsVar, zzxm zzxmVar) {
        this.zzf.zze(this.zzu.zza, zztsVar, this.zza, zzvsVar, zzxmVar.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ab, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaa() throws zzil {
        zzkq zzkqVarZzd = this.zzq.zzd();
        if (zzkqVarZzd == null) {
            return;
        }
        long jZzd = zzkqVarZzd.zzd ? zzkqVarZzd.zza.zzd() : -9223372036854775807L;
        if (jZzd != -9223372036854775807L) {
            if (!zzkqVarZzd.zzr()) {
                this.zzq.zzm(zzkqVarZzd);
                zzE(false);
                zzI();
            }
            zzO(jZzd);
            if (jZzd != this.zzu.zzr) {
                zzlg zzlgVar = this.zzu;
                this.zzu = zzz(zzlgVar.zzb, jZzd, zzlgVar.zzc, jZzd, true, 5);
            }
        } else {
            long jZzb = this.zzn.zzb(zzkqVarZzd != this.zzq.zze());
            this.zzI = jZzb;
            long jZze = jZzb - zzkqVarZzd.zze();
            long j = this.zzu.zzr;
            if (!this.zzo.isEmpty() && !this.zzu.zzb.zzb()) {
                if (this.zzK) {
                    j--;
                    this.zzK = false;
                }
                zzlg zzlgVar2 = this.zzu;
                int iZza = zzlgVar2.zza.zza(zzlgVar2.zzb.zza);
                int iMin = Math.min(this.zzJ, this.zzo.size());
                if (iMin > 0) {
                    zzki zzkiVar = (zzki) this.zzo.get(iMin - 1);
                    while (zzkiVar != null && (iZza < 0 || (iZza == 0 && j < 0))) {
                        iMin--;
                        zzkiVar = iMin > 0 ? (zzki) this.zzo.get(iMin - 1) : null;
                    }
                    if (iMin < this.zzo.size()) {
                    }
                    this.zzJ = iMin;
                }
            }
            zzlg zzlgVar3 = this.zzu;
            zzlgVar3.zzr = jZze;
            zzlgVar3.zzs = SystemClock.elapsedRealtime();
        }
        this.zzu.zzp = this.zzq.zzc().zzc();
        this.zzu.zzq = zzt();
        zzlg zzlgVar4 = this.zzu;
        if (zzlgVar4.zzl && zzlgVar4.zze == 3 && zzai(zzlgVar4.zza, zzlgVar4.zzb)) {
            zzlg zzlgVar5 = this.zzu;
            if (zzlgVar5.zzn.zzc == 1.0f) {
                float fZza = this.zzO.zza(zzs(zzlgVar5.zza, zzlgVar5.zzb.zza, zzlgVar5.zzr), zzt());
                if (this.zzn.zzc().zzc != fZza) {
                    zzS(new zzch(fZza, this.zzu.zzn.zzd));
                    zzH(this.zzu.zzn, this.zzn.zzc().zzc, false, false);
                }
            }
        }
    }

    private final void zzab(zzcw zzcwVar, zzts zztsVar, zzcw zzcwVar2, zzts zztsVar2, long j, boolean z) throws zzil {
        if (!zzai(zzcwVar, zztsVar)) {
            zzch zzchVar = zztsVar.zzb() ? zzch.zza : this.zzu.zzn;
            if (this.zzn.zzc().equals(zzchVar)) {
                return;
            }
            zzS(zzchVar);
            zzH(this.zzu.zzn, zzchVar.zzc, false, false);
            return;
        }
        zzcwVar.zze(zzcwVar.zzn(zztsVar.zza, this.zzl).zzd, this.zzk, 0L);
        zzig zzigVar = this.zzO;
        zzbf zzbfVar = this.zzk.zzl;
        int i = zzfk.zza;
        zzigVar.zzd(zzbfVar);
        if (j != -9223372036854775807L) {
            this.zzO.zze(zzs(zzcwVar, zztsVar.zza, j));
            return;
        }
        if (!zzfk.zzD(!zzcwVar2.zzo() ? zzcwVar2.zze(zzcwVar2.zzn(zztsVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc : null, this.zzk.zzc) || z) {
            this.zzO.zze(-9223372036854775807L);
        }
    }

    private final synchronized void zzac(zzfry zzfryVar, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!Boolean.valueOf(((zzkc) zzfryVar).zza.zzw).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzad() {
        zzkq zzkqVarZzc = this.zzq.zzc();
        return (zzkqVarZzc == null || zzkqVarZzc.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzae(zzln zzlnVar) {
        return zzlnVar.zzbc() != 0;
    }

    private final boolean zzaf() {
        zzkq zzkqVarZzd = this.zzq.zzd();
        long j = zzkqVarZzd.zzf.zze;
        if (zzkqVarZzd.zzd) {
            return j == -9223372036854775807L || this.zzu.zzr < j || !zzah();
        }
        return false;
    }

    private static boolean zzag(zzlg zzlgVar, zzct zzctVar) {
        zzts zztsVar = zzlgVar.zzb;
        zzcw zzcwVar = zzlgVar.zza;
        return zzcwVar.zzo() || zzcwVar.zzn(zztsVar.zza, zzctVar).zzg;
    }

    private final boolean zzah() {
        zzlg zzlgVar = this.zzu;
        return zzlgVar.zzl && zzlgVar.zzm == 0;
    }

    private final boolean zzai(zzcw zzcwVar, zzts zztsVar) {
        if (!zztsVar.zzb() && !zzcwVar.zzo()) {
            zzcwVar.zze(zzcwVar.zzn(zztsVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzcv zzcvVar = this.zzk;
                if (zzcvVar.zzj && zzcvVar.zzg != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzam[] zzaj(zzxf zzxfVar) {
        int iZzc = zzxfVar != null ? zzxfVar.zzc() : 0;
        zzam[] zzamVarArr = new zzam[iZzc];
        for (int i = 0; i < iZzc; i++) {
            zzamVarArr[i] = zzxfVar.zzd(i);
        }
        return zzamVarArr;
    }

    private static final void zzak(zzlj zzljVar) throws zzil {
        zzljVar.zzj();
        try {
            zzljVar.zzc().zzt(zzljVar.zza(), zzljVar.zzg());
        } finally {
            zzljVar.zzh(true);
        }
    }

    private static final void zzal(zzln zzlnVar) {
        if (zzlnVar.zzbc() == 2) {
            zzlnVar.zzL();
        }
    }

    private static final void zzam(zzln zzlnVar, long j) {
        zzlnVar.zzH();
        if (zzlnVar instanceof zzvw) {
            throw null;
        }
    }

    static Object zze(zzcv zzcvVar, zzct zzctVar, int i, boolean z, Object obj, zzcw zzcwVar, zzcw zzcwVar2) {
        int iZza = zzcwVar.zza(obj);
        int iZzb = zzcwVar.zzb();
        int iZzi = iZza;
        int iZza2 = -1;
        for (int i2 = 0; i2 < iZzb && iZza2 == -1; i2++) {
            iZzi = zzcwVar.zzi(iZzi, zzctVar, zzcvVar, i, z);
            if (iZzi == -1) {
                iZza2 = -1;
                break;
            }
            iZza2 = zzcwVar2.zza(zzcwVar.zzf(iZzi));
        }
        if (iZza2 == -1) {
            return null;
        }
        return zzcwVar2.zzf(iZza2);
    }

    static final /* synthetic */ void zzr(zzlj zzljVar) {
        try {
            zzak(zzljVar);
        } catch (zzil e) {
            zzes.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzs(zzcw zzcwVar, Object obj, long j) {
        zzcwVar.zze(zzcwVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzcv zzcvVar = this.zzk;
        if (zzcvVar.zzg != -9223372036854775807L && zzcvVar.zzb()) {
            zzcv zzcvVar2 = this.zzk;
            if (zzcvVar2.zzj) {
                long j2 = zzcvVar2.zzh;
                return zzfk.zzp((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.zzk.zzg) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzt() {
        return zzu(this.zzu.zzp);
    }

    private final long zzu(long j) {
        zzkq zzkqVarZzc = this.zzq.zzc();
        if (zzkqVarZzc == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzI - zzkqVarZzc.zze()));
    }

    private final long zzv(zzts zztsVar, long j, boolean z) throws zzil {
        return zzw(zztsVar, j, this.zzq.zzd() != this.zzq.zze(), z);
    }

    private final long zzw(zzts zztsVar, long j, boolean z, boolean z2) throws zzil {
        zzX();
        this.zzz = false;
        if (z2 || this.zzu.zze == 3) {
            zzU(2);
        }
        zzkq zzkqVarZzd = this.zzq.zzd();
        zzkq zzkqVarZzg = zzkqVarZzd;
        while (zzkqVarZzg != null && !zztsVar.equals(zzkqVarZzg.zzf.zza)) {
            zzkqVarZzg = zzkqVarZzg.zzg();
        }
        if (z || zzkqVarZzd != zzkqVarZzg || (zzkqVarZzg != null && zzkqVarZzg.zze() + j < 0)) {
            zzln[] zzlnVarArr = this.zza;
            int length = zzlnVarArr.length;
            for (int i = 0; i < 2; i++) {
                zzA(zzlnVarArr[i]);
            }
            if (zzkqVarZzg != null) {
                while (this.zzq.zzd() != zzkqVarZzg) {
                    this.zzq.zza();
                }
                this.zzq.zzm(zzkqVarZzg);
                zzkqVarZzg.zzp(1000000000000L);
                zzB();
            }
        }
        if (zzkqVarZzg != null) {
            this.zzq.zzm(zzkqVarZzg);
            if (!zzkqVarZzg.zzd) {
                zzkqVarZzg.zzf = zzkqVarZzg.zzf.zzb(j);
            } else if (zzkqVarZzg.zze) {
                j = zzkqVarZzg.zza.zze(j);
                zzkqVarZzg.zza.zzj(j - this.zzm, false);
            }
            zzO(j);
            zzI();
        } else {
            this.zzq.zzi();
            zzO(j);
        }
        zzE(false);
        this.zzh.zzi(2);
        return j;
    }

    private final Pair zzx(zzcw zzcwVar) {
        long j = 0;
        if (zzcwVar.zzo()) {
            return Pair.create(zzlg.zzj(), 0L);
        }
        Pair pairZzl = zzcwVar.zzl(this.zzk, this.zzl, zzcwVar.zzg(this.zzC), -9223372036854775807L);
        zzts zztsVarZzh = this.zzq.zzh(zzcwVar, pairZzl.first, 0L);
        long jLongValue = ((Long) pairZzl.second).longValue();
        if (zztsVarZzh.zzb()) {
            zzcwVar.zzn(zztsVarZzh.zza, this.zzl);
            if (zztsVarZzh.zzc == this.zzl.zze(zztsVarZzh.zzb)) {
                this.zzl.zzj();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(zztsVarZzh, Long.valueOf(j));
    }

    private static Pair zzy(zzcw zzcwVar, zzkk zzkkVar, boolean z, int i, boolean z2, zzcv zzcvVar, zzct zzctVar) {
        zzcw zzcwVar2 = zzkkVar.zza;
        if (zzcwVar.zzo()) {
            return null;
        }
        zzcw zzcwVar3 = true == zzcwVar2.zzo() ? zzcwVar : zzcwVar2;
        try {
            Pair pairZzl = zzcwVar3.zzl(zzcvVar, zzctVar, zzkkVar.zzb, zzkkVar.zzc);
            if (zzcwVar.equals(zzcwVar3)) {
                return pairZzl;
            }
            if (zzcwVar.zza(pairZzl.first) != -1) {
                return (zzcwVar3.zzn(pairZzl.first, zzctVar).zzg && zzcwVar3.zze(zzctVar.zzd, zzcvVar, 0L).zzp == zzcwVar3.zza(pairZzl.first)) ? zzcwVar.zzl(zzcvVar, zzctVar, zzcwVar.zzn(pairZzl.first, zzctVar).zzd, zzkkVar.zzc) : pairZzl;
            }
            Object objZze = zze(zzcvVar, zzctVar, i, z2, pairZzl.first, zzcwVar3, zzcwVar);
            if (objZze != null) {
                return zzcwVar.zzl(zzcvVar, zzctVar, zzcwVar.zzn(objZze, zzctVar).zzd, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    private final zzlg zzz(zzts zztsVar, long j, long j2, long j3, boolean z, int i) {
        List listZzl;
        zzvs zzvsVar;
        zzxm zzxmVar;
        this.zzK = (!this.zzK && j == this.zzu.zzr && zztsVar.equals(this.zzu.zzb)) ? false : true;
        zzN();
        zzlg zzlgVar = this.zzu;
        zzvs zzvsVarZzh = zzlgVar.zzh;
        zzxm zzxmVarZzi = zzlgVar.zzi;
        List list = zzlgVar.zzj;
        if (!this.zzr.zzj()) {
            if (zztsVar.equals(this.zzu.zzb)) {
                listZzl = list;
            } else {
                zzvsVar = zzvs.zza;
                zzxmVar = this.zze;
                listZzl = zzfud.zzl();
            }
            if (z) {
                this.zzv.zzd(i);
            }
            return this.zzu.zzd(zztsVar, j, j2, j3, zzt(), zzvsVar, zzxmVar, listZzl);
        }
        zzkq zzkqVarZzd = this.zzq.zzd();
        zzvsVarZzh = zzkqVarZzd == null ? zzvs.zza : zzkqVarZzd.zzh();
        zzxmVarZzi = zzkqVarZzd == null ? this.zze : zzkqVarZzd.zzi();
        zzxf[] zzxfVarArr = zzxmVarZzi.zzc;
        zzfua zzfuaVar = new zzfua();
        boolean z2 = false;
        for (zzxf zzxfVar : zzxfVarArr) {
            if (zzxfVar != null) {
                zzbz zzbzVar = zzxfVar.zzd(0).zzk;
                if (zzbzVar == null) {
                    zzfuaVar.zzf(new zzbz(-9223372036854775807L, new zzby[0]));
                } else {
                    zzfuaVar.zzf(zzbzVar);
                    z2 = true;
                }
            }
        }
        zzfud zzfudVarZzi = z2 ? zzfuaVar.zzi() : zzfud.zzl();
        if (zzkqVarZzd != null) {
            zzkr zzkrVar = zzkqVarZzd.zzf;
            if (zzkrVar.zzc != j2) {
                zzkqVarZzd.zzf = zzkrVar.zza(j2);
            }
        }
        listZzl = zzfudVarZzi;
        zzvsVar = zzvsVarZzh;
        zzxmVar = zzxmVarZzi;
        if (z) {
            this.zzv.zzd(i);
        }
        return this.zzu.zzd(zztsVar, j, j2, j3, zzt(), zzvsVar, zzxmVar, listZzl);
    }

    /* JADX WARN: Code duplicated, block: B:217:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:340:0x0700 A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:342:0x0706 A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:407:0x07f6 A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:409:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:410:0x0800 A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:412:0x0804 A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:414:0x080a  */
    /* JADX WARN: Code duplicated, block: B:415:0x080d  */
    /* JADX WARN: Code duplicated, block: B:416:0x080f A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:418:0x0813 A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:420:0x0827 A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:421:0x0830  */
    /* JADX WARN: Code duplicated, block: B:427:0x0849  */
    /* JADX WARN: Code duplicated, block: B:433:0x085a  */
    /* JADX WARN: Code duplicated, block: B:441:0x0894 A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:444:0x089e A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:446:0x08a2 A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:448:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:449:0x08a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:450:0x08ab A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:452:0x08b9 A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:454:0x08c1 A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:456:0x08cb A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, LOOP:12: B:455:0x08c9->B:456:0x08cb, LOOP_END, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:485:0x0948 A[Catch: RuntimeException -> 0x0a3e, IOException -> 0x0a69, zzsu -> 0x0a71, zzgj -> 0x0a79, zzcd -> 0x0a81, zzqr -> 0x0a98, zzil -> 0x0aa2, TryCatch #9 {zzcd -> 0x0a81, zzgj -> 0x0a79, zzil -> 0x0aa2, zzqr -> 0x0a98, zzsu -> 0x0a71, IOException -> 0x0a69, RuntimeException -> 0x0a3e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:20:0x004d, B:21:0x0054, B:25:0x005b, B:27:0x0064, B:29:0x0072, B:30:0x007a, B:31:0x0085, B:32:0x0099, B:33:0x00b1, B:34:0x00cd, B:36:0x00dc, B:37:0x00e0, B:38:0x00f1, B:40:0x0100, B:41:0x011c, B:42:0x012f, B:43:0x0138, B:45:0x014a, B:46:0x0156, B:47:0x0166, B:49:0x0172, B:52:0x017d, B:53:0x0184, B:54:0x0191, B:58:0x0198, B:60:0x01a0, B:62:0x01a4, B:64:0x01aa, B:66:0x01b2, B:68:0x01ba, B:69:0x01bd, B:71:0x01c2, B:78:0x01cf, B:79:0x01d0, B:83:0x01d7, B:85:0x01e5, B:86:0x01e8, B:87:0x01ed, B:89:0x01fd, B:90:0x0200, B:91:0x0205, B:92:0x020a, B:94:0x0216, B:95:0x0222, B:97:0x022e, B:99:0x025a, B:100:0x027a, B:101:0x027f, B:102:0x0283, B:104:0x0288, B:105:0x0299, B:107:0x02a5, B:108:0x02a8, B:115:0x02b3, B:116:0x02b4, B:117:0x02b9, B:118:0x02c1, B:119:0x02d3, B:121:0x02fa, B:187:0x0411, B:171:0x03de, B:170:0x03da, B:196:0x0422, B:197:0x042f, B:122:0x031c, B:126:0x032f, B:128:0x033f, B:130:0x0356, B:132:0x0360, B:198:0x0430, B:200:0x0444, B:203:0x044e, B:205:0x045d, B:207:0x0469, B:209:0x0498, B:210:0x049d, B:211:0x04a1, B:213:0x04a5, B:215:0x04b2, B:284:0x05fa, B:286:0x0602, B:288:0x060a, B:291:0x060f, B:292:0x061b, B:294:0x0621, B:296:0x0629, B:299:0x0639, B:301:0x063f, B:302:0x0659, B:304:0x065f, B:306:0x0664, B:308:0x0669, B:310:0x066d, B:312:0x0673, B:314:0x0677, B:316:0x067f, B:318:0x0685, B:320:0x068f, B:323:0x0695, B:324:0x0698, B:326:0x06a1, B:328:0x06b3, B:330:0x06bc, B:332:0x06c4, B:337:0x06ce, B:338:0x06fa, B:340:0x0700, B:342:0x0706, B:343:0x070d, B:218:0x04c1, B:220:0x04c7, B:223:0x04cd, B:226:0x04d8, B:228:0x04dd, B:231:0x04eb, B:233:0x04f1, B:234:0x04f9, B:235:0x04fc, B:237:0x0504, B:239:0x0512, B:241:0x054e, B:243:0x0558, B:246:0x0563, B:248:0x056b, B:249:0x056e, B:251:0x0572, B:253:0x0578, B:255:0x0584, B:257:0x058e, B:259:0x059f, B:261:0x05a5, B:262:0x05b0, B:263:0x05b5, B:265:0x05c0, B:268:0x05c5, B:270:0x05cb, B:272:0x05d3, B:274:0x05d9, B:276:0x05df, B:280:0x05ed, B:282:0x05f4, B:283:0x05f7, B:214:0x04af, B:346:0x0719, B:350:0x0724, B:352:0x072e, B:353:0x0733, B:355:0x0741, B:356:0x0759, B:358:0x075f, B:360:0x0767, B:362:0x076e, B:366:0x0777, B:371:0x0786, B:377:0x0793, B:379:0x0799, B:389:0x07ac, B:391:0x07b1, B:393:0x07bd, B:395:0x07c3, B:399:0x07d0, B:401:0x07d8, B:403:0x07dc, B:404:0x07e7, B:406:0x07ed, B:460:0x08dd, B:463:0x08e5, B:465:0x08ea, B:467:0x08f2, B:469:0x0900, B:470:0x0907, B:471:0x090b, B:473:0x0911, B:475:0x091a, B:477:0x0920, B:479:0x092b, B:486:0x094f, B:488:0x0955, B:492:0x095e, B:494:0x0962, B:499:0x096b, B:501:0x0971, B:503:0x09d1, B:505:0x09d6, B:514:0x09e7, B:516:0x09eb, B:517:0x09f3, B:518:0x09fa, B:480:0x0932, B:483:0x0940, B:484:0x0947, B:485:0x0948, B:407:0x07f6, B:442:0x0898, B:444:0x089e, B:446:0x08a2, B:450:0x08ab, B:452:0x08b9, B:454:0x08c1, B:456:0x08cb, B:457:0x08d0, B:458:0x08d5, B:459:0x08da, B:410:0x0800, B:412:0x0804, B:439:0x0888, B:441:0x0894, B:416:0x080f, B:418:0x0813, B:420:0x0827, B:422:0x0835, B:424:0x0841, B:428:0x084a, B:430:0x0854, B:436:0x085f, B:392:0x07b6, B:519:0x09ff, B:523:0x0a06, B:524:0x0a0e, B:528:0x0a2c), top: B:598:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:618:0x070d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:454:0x08c1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v34, types: [com.google.android.gms.internal.ads.zzhk, com.google.android.gms.internal.ads.zzxt] */
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
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        boolean z;
        boolean z2;
        zzkq zzkqVarZze;
        boolean z3;
        boolean z4;
        zzlg zzlgVar;
        zzkq zzkqVarZzd;
        long jZzb;
        zzkq zzkqVarZzc;
        boolean z5;
        boolean z6;
        int i;
        zzkq zzkqVarZzd2;
        int i2;
        boolean z7;
        int i3;
        zzkq zzkqVarZzd3;
        zzkq zzkqVarZzg;
        boolean z8;
        zzxm zzxmVarZzi;
        int i4;
        zzkr zzkrVarZzf;
        long jLongValue;
        long j;
        boolean z9;
        zzts zztsVar;
        zzts zztsVar2;
        Throwable th;
        Throwable th2;
        long j2;
        long jZza;
        long j3;
        zzlg zzlgVar2;
        int i5;
        zzlg zzlgVarZzz;
        try {
            switch (message.what) {
                case 0:
                    this.zzv.zza(1);
                    zzM(false, false, false, true);
                    this.zzf.zzb();
                    zzU(true != this.zzu.zza.zzo() ? 2 : 4);
                    this.zzr.zzg(this.zzg);
                    this.zzh.zzi(2);
                    z = true;
                    zzJ();
                    return z;
                case 1:
                    zzT(message.arg1 != 0, message.arg2, true, 1);
                    z = true;
                    zzJ();
                    return z;
                case 2:
                    int i6 = 4;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    this.zzh.zzf(2);
                    if (!this.zzu.zza.zzo() && this.zzr.zzj()) {
                        this.zzq.zzk(this.zzI);
                        if (this.zzq.zzn() && (zzkrVarZzf = this.zzq.zzf(this.zzI, this.zzu)) != null) {
                            zzkq zzkqVarZzr = this.zzq.zzr(this.zzc, this.zzd, this.zzf.zzi(), this.zzr, zzkrVarZzf, this.zze);
                            zzkqVarZzr.zza.zzl(this, zzkrVarZzf.zzb);
                            if (this.zzq.zzd() == zzkqVarZzr) {
                                zzO(zzkrVarZzf.zzb);
                            }
                            zzE(false);
                        }
                        if (this.zzA) {
                            this.zzA = zzad();
                            zzY();
                        } else {
                            zzI();
                        }
                        zzkq zzkqVarZze2 = this.zzq.zze();
                        if (zzkqVarZze2 != null) {
                            if (zzkqVarZze2.zzg() != null && !this.zzy) {
                                zzkq zzkqVarZze3 = this.zzq.zze();
                                if (zzkqVarZze3.zzd) {
                                    int i7 = 0;
                                    while (true) {
                                        zzln[] zzlnVarArr = this.zza;
                                        int length = zzlnVarArr.length;
                                        if (i7 < 2) {
                                            zzln zzlnVar = zzlnVarArr[i7];
                                            zzvj zzvjVar = zzkqVarZze3.zzc[i7];
                                            if (zzlnVar.zzo() == zzvjVar) {
                                                if (zzvjVar == null || zzlnVar.zzM()) {
                                                    i7++;
                                                } else {
                                                    zzkqVarZze3.zzg();
                                                    boolean z10 = zzkqVarZze3.zzf.zzf;
                                                }
                                            }
                                        } else if (zzkqVarZze2.zzg().zzd || this.zzI >= zzkqVarZze2.zzg().zzf()) {
                                            zzxm zzxmVarZzi2 = zzkqVarZze2.zzi();
                                            zzkq zzkqVarZzb = this.zzq.zzb();
                                            zzxm zzxmVarZzi3 = zzkqVarZzb.zzi();
                                            zzcw zzcwVar = this.zzu.zza;
                                            zzxm zzxmVar = zzxmVarZzi3;
                                            zzab(zzcwVar, zzkqVarZzb.zzf.zza, zzcwVar, zzkqVarZze2.zzf.zza, -9223372036854775807L, false);
                                            if (!zzkqVarZzb.zzd || zzkqVarZzb.zza.zzd() == -9223372036854775807L) {
                                                int i8 = 0;
                                                while (true) {
                                                    int length2 = this.zza.length;
                                                    if (i8 < 2) {
                                                        boolean zZzb = zzxmVarZzi2.zzb(i8);
                                                        zzxm zzxmVar2 = zzxmVar;
                                                        boolean zZzb2 = zzxmVar2.zzb(i8);
                                                        if (zZzb && !this.zza[i8].zzN()) {
                                                            this.zzc[i8].zzb();
                                                            zzlq zzlqVar = zzxmVarZzi2.zzb[i8];
                                                            zzlq zzlqVar2 = zzxmVar2.zzb[i8];
                                                            if (!zZzb2 || !zzlqVar2.equals(zzlqVar)) {
                                                                zzam(this.zza[i8], zzkqVarZzb.zzf());
                                                            }
                                                        }
                                                        i8++;
                                                        zzxmVar = zzxmVar2;
                                                    }
                                                }
                                            } else {
                                                long jZzf = zzkqVarZzb.zzf();
                                                zzln[] zzlnVarArr2 = this.zza;
                                                int length3 = zzlnVarArr2.length;
                                                for (int i9 = 0; i9 < 2; i9++) {
                                                    zzln zzlnVar2 = zzlnVarArr2[i9];
                                                    if (zzlnVar2.zzo() != null) {
                                                        zzam(zzlnVar2, jZzf);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (zzkqVarZze2.zzf.zzi || this.zzy) {
                                int i10 = 0;
                                while (true) {
                                    zzln[] zzlnVarArr3 = this.zza;
                                    int length4 = zzlnVarArr3.length;
                                    if (i10 < 2) {
                                        zzln zzlnVar3 = zzlnVarArr3[i10];
                                        zzvj zzvjVar2 = zzkqVarZze2.zzc[i10];
                                        if (zzvjVar2 != null && zzlnVar3.zzo() == zzvjVar2 && zzlnVar3.zzM()) {
                                            long j4 = zzkqVarZze2.zzf.zze;
                                            zzam(zzlnVar3, (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? -9223372036854775807L : zzkqVarZze2.zze() + j4);
                                        }
                                        i10++;
                                    }
                                }
                            }
                        }
                        zzkq zzkqVarZze4 = this.zzq.zze();
                        if (zzkqVarZze4 != null && this.zzq.zzd() != zzkqVarZze4 && !zzkqVarZze4.zzg) {
                            zzkq zzkqVarZze5 = this.zzq.zze();
                            zzxm zzxmVarZzi4 = zzkqVarZze5.zzi();
                            int i11 = 0;
                            boolean z11 = false;
                            while (true) {
                                zzln[] zzlnVarArr4 = this.zza;
                                int length5 = zzlnVarArr4.length;
                                if (i11 < 2) {
                                    zzln zzlnVar4 = zzlnVarArr4[i11];
                                    if (zzae(zzlnVar4)) {
                                        zzvj zzvjVarZzo = zzlnVar4.zzo();
                                        zzvj zzvjVar3 = zzkqVarZze5.zzc[i11];
                                        if (!zzxmVarZzi4.zzb(i11) || zzvjVarZzo != zzvjVar3) {
                                            if (!zzlnVar4.zzN()) {
                                                zzlnVar4.zzE(zzaj(zzxmVarZzi4.zzc[i11]), zzkqVarZze5.zzc[i11], zzkqVarZze5.zzf(), zzkqVarZze5.zze());
                                            } else if (zzlnVar4.zzS()) {
                                                zzA(zzlnVar4);
                                            } else {
                                                z11 = true;
                                            }
                                        }
                                    }
                                    i11++;
                                } else if (!z11) {
                                    zzB();
                                }
                            }
                        }
                        boolean z12 = false;
                        while (zzah() && !this.zzy && (zzkqVarZzd3 = this.zzq.zzd()) != null && (zzkqVarZzg = zzkqVarZzd3.zzg()) != null && this.zzI >= zzkqVarZzg.zzf() && zzkqVarZzg.zzg) {
                            if (z12) {
                                zzJ();
                            }
                            zzkq zzkqVarZza = this.zzq.zza();
                            zzkqVarZza.getClass();
                            if (this.zzu.zzb.zza.equals(zzkqVarZza.zzf.zza.zza)) {
                                zzts zztsVar3 = this.zzu.zzb;
                                if (zztsVar3.zzb == -1) {
                                    zzts zztsVar4 = zzkqVarZza.zzf.zza;
                                    if (zztsVar4.zzb == -1 && zztsVar3.zze != zztsVar4.zze) {
                                        z8 = true;
                                    }
                                }
                                zzkr zzkrVar = zzkqVarZza.zzf;
                                zzts zztsVar5 = zzkrVar.zza;
                                long j5 = zzkrVar.zzb;
                                this.zzu = zzz(zztsVar5, j5, zzkrVar.zzc, j5, !z8, 0);
                                zzN();
                                zzaa();
                                zzxmVarZzi = this.zzq.zzd().zzi();
                                i4 = 0;
                                while (true) {
                                    int length6 = this.zza.length;
                                    if (i4 < 2) {
                                        if (zzxmVarZzi.zzb(i4)) {
                                            this.zza[i4].zzs();
                                        }
                                        i4++;
                                    }
                                }
                                z12 = true;
                            }
                            z8 = false;
                            zzkr zzkrVar2 = zzkqVarZza.zzf;
                            zzts zztsVar6 = zzkrVar2.zza;
                            long j6 = zzkrVar2.zzb;
                            this.zzu = zzz(zztsVar6, j6, zzkrVar2.zzc, j6, !z8, 0);
                            zzN();
                            zzaa();
                            zzxmVarZzi = this.zzq.zzd().zzi();
                            i4 = 0;
                            while (true) {
                                int length7 = this.zza.length;
                                if (i4 < 2) {
                                    if (zzxmVarZzi.zzb(i4)) {
                                        this.zza[i4].zzs();
                                    }
                                    i4++;
                                }
                            }
                            z12 = true;
                        }
                        i6 = 4;
                    }
                    int i12 = this.zzu.zze;
                    z = true;
                    if (i12 != 1) {
                        if (i12 != i6) {
                            zzkq zzkqVarZzd4 = this.zzq.zzd();
                            if (zzkqVarZzd4 == null) {
                                zzQ(jUptimeMillis, 10L);
                            } else {
                                int i13 = zzfk.zza;
                                Trace.beginSection("doSomeWork");
                                zzaa();
                                if (zzkqVarZzd4.zzd) {
                                    long jZzp = zzfk.zzp(SystemClock.elapsedRealtime());
                                    zzkqVarZzd4.zza.zzj(this.zzu.zzr - this.zzm, false);
                                    z3 = true;
                                    z4 = true;
                                    int i14 = 0;
                                    while (true) {
                                        zzln[] zzlnVarArr5 = this.zza;
                                        int length8 = zzlnVarArr5.length;
                                        if (i14 < 2) {
                                            zzln zzlnVar5 = zzlnVarArr5[i14];
                                            if (zzae(zzlnVar5)) {
                                                zzlnVar5.zzR(this.zzI, jZzp);
                                                boolean z13 = z3 && zzlnVar5.zzS();
                                                boolean z14 = zzkqVarZzd4.zzc[i14] != zzlnVar5.zzo();
                                                boolean z15 = z14 || (!z14 && zzlnVar5.zzM()) || zzlnVar5.zzT() || zzlnVar5.zzS();
                                                boolean z16 = z4 && z15;
                                                if (!z15) {
                                                    zzlnVar5.zzv();
                                                }
                                                z4 = z16;
                                                z3 = z13;
                                            }
                                            i14++;
                                        }
                                    }
                                } else {
                                    zzkqVarZzd4.zza.zzk();
                                    z3 = true;
                                    z4 = true;
                                }
                                long j7 = zzkqVarZzd4.zzf.zze;
                                if (z3 && zzkqVarZzd4.zzd && (j7 == -9223372036854775807L || j7 <= this.zzu.zzr)) {
                                    if (this.zzy) {
                                        this.zzy = false;
                                        zzT(false, this.zzu.zzm, false, 5);
                                    }
                                    if (zzkqVarZzd4.zzf.zzi) {
                                        zzU(i6);
                                        zzX();
                                        i = 3;
                                    } else {
                                        zzlgVar = this.zzu;
                                        if (zzlgVar.zze == 2) {
                                            i = 3;
                                            if (this.zzu.zze == 3) {
                                                if (this.zzG == 0) {
                                                    if (!zzaf()) {
                                                        this.zzz = zzah();
                                                        zzU(2);
                                                        if (this.zzz) {
                                                            for (zzkqVarZzd2 = this.zzq.zzd(); zzkqVarZzd2 != null; zzkqVarZzd2 = zzkqVarZzd2.zzg()) {
                                                                for (zzxf zzxfVar : zzkqVarZzd2.zzi().zzc) {
                                                                }
                                                            }
                                                            this.zzO.zzc();
                                                        }
                                                        zzX();
                                                    }
                                                } else if (!z4) {
                                                    this.zzz = zzah();
                                                    zzU(2);
                                                    if (this.zzz) {
                                                        while (zzkqVarZzd2 != null) {
                                                            while (i2 < r5) {
                                                            }
                                                        }
                                                        this.zzO.zzc();
                                                    }
                                                    zzX();
                                                }
                                            }
                                        } else if (this.zzG == 0) {
                                            if (z4) {
                                                if (zzlgVar.zzg) {
                                                    zzkqVarZzd = this.zzq.zzd();
                                                    if (zzai(this.zzu.zza, zzkqVarZzd.zzf.zza)) {
                                                        jZzb = this.zzO.zzb();
                                                    } else {
                                                        jZzb = -9223372036854775807L;
                                                    }
                                                    zzkqVarZzc = this.zzq.zzc();
                                                    if (zzkqVarZzc.zzr()) {
                                                        z5 = false;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (zzkqVarZzc.zzf.zza.zzb()) {
                                                        z6 = false;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (!z5) {
                                                    }
                                                }
                                                i = 3;
                                                zzU(3);
                                                this.zzL = null;
                                                if (zzah()) {
                                                    zzV();
                                                }
                                            }
                                            i = 3;
                                            if (this.zzu.zze == 3) {
                                                if (this.zzG == 0) {
                                                    if (!zzaf()) {
                                                        this.zzz = zzah();
                                                        zzU(2);
                                                        if (this.zzz) {
                                                            while (zzkqVarZzd2 != null) {
                                                                while (i2 < r5) {
                                                                }
                                                            }
                                                            this.zzO.zzc();
                                                        }
                                                        zzX();
                                                    }
                                                } else if (!z4) {
                                                    this.zzz = zzah();
                                                    zzU(2);
                                                    if (this.zzz) {
                                                        while (zzkqVarZzd2 != null) {
                                                            while (i2 < r5) {
                                                            }
                                                        }
                                                        this.zzO.zzc();
                                                    }
                                                    zzX();
                                                }
                                            }
                                        } else if (zzaf()) {
                                            i = 3;
                                            zzU(3);
                                            this.zzL = null;
                                            if (zzah()) {
                                                zzV();
                                            }
                                        } else {
                                            i = 3;
                                            if (this.zzu.zze == 3) {
                                                if (this.zzG == 0) {
                                                    if (!zzaf()) {
                                                        this.zzz = zzah();
                                                        zzU(2);
                                                        if (this.zzz) {
                                                            while (zzkqVarZzd2 != null) {
                                                                while (i2 < r5) {
                                                                }
                                                            }
                                                            this.zzO.zzc();
                                                        }
                                                        zzX();
                                                    }
                                                } else if (!z4) {
                                                    this.zzz = zzah();
                                                    zzU(2);
                                                    if (this.zzz) {
                                                        while (zzkqVarZzd2 != null) {
                                                            while (i2 < r5) {
                                                            }
                                                        }
                                                        this.zzO.zzc();
                                                    }
                                                    zzX();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zzlgVar = this.zzu;
                                    if (zzlgVar.zze == 2) {
                                        i = 3;
                                        if (this.zzu.zze == 3) {
                                            if (this.zzG == 0) {
                                                if (!zzaf()) {
                                                    this.zzz = zzah();
                                                    zzU(2);
                                                    if (this.zzz) {
                                                        while (zzkqVarZzd2 != null) {
                                                            while (i2 < r5) {
                                                            }
                                                        }
                                                        this.zzO.zzc();
                                                    }
                                                    zzX();
                                                }
                                            } else if (!z4) {
                                                this.zzz = zzah();
                                                zzU(2);
                                                if (this.zzz) {
                                                    while (zzkqVarZzd2 != null) {
                                                        while (i2 < r5) {
                                                        }
                                                    }
                                                    this.zzO.zzc();
                                                }
                                                zzX();
                                            }
                                        }
                                    } else if (this.zzG == 0) {
                                        if (z4) {
                                            if (zzlgVar.zzg) {
                                                zzkqVarZzd = this.zzq.zzd();
                                                if (zzai(this.zzu.zza, zzkqVarZzd.zzf.zza)) {
                                                    jZzb = this.zzO.zzb();
                                                } else {
                                                    jZzb = -9223372036854775807L;
                                                }
                                                zzkqVarZzc = this.zzq.zzc();
                                                if (zzkqVarZzc.zzr() || !zzkqVarZzc.zzf.zzi) {
                                                    z5 = false;
                                                } else {
                                                    z5 = true;
                                                }
                                                if (zzkqVarZzc.zzf.zza.zzb() || zzkqVarZzc.zzd) {
                                                    z6 = false;
                                                } else {
                                                    z6 = true;
                                                }
                                                if (!z5 || z6 || this.zzf.zzh(this.zzu.zza, zzkqVarZzd.zzf.zza, zzt(), this.zzn.zzc().zzc, this.zzz, jZzb)) {
                                                }
                                            }
                                            i = 3;
                                            zzU(3);
                                            this.zzL = null;
                                            if (zzah()) {
                                                zzV();
                                            }
                                        }
                                        i = 3;
                                        if (this.zzu.zze == 3) {
                                            if (this.zzG == 0) {
                                                if (!zzaf()) {
                                                    this.zzz = zzah();
                                                    zzU(2);
                                                    if (this.zzz) {
                                                        while (zzkqVarZzd2 != null) {
                                                            while (i2 < r5) {
                                                            }
                                                        }
                                                        this.zzO.zzc();
                                                    }
                                                    zzX();
                                                }
                                            } else if (!z4) {
                                                this.zzz = zzah();
                                                zzU(2);
                                                if (this.zzz) {
                                                    while (zzkqVarZzd2 != null) {
                                                        while (i2 < r5) {
                                                        }
                                                    }
                                                    this.zzO.zzc();
                                                }
                                                zzX();
                                            }
                                        }
                                    } else if (zzaf()) {
                                        i = 3;
                                        zzU(3);
                                        this.zzL = null;
                                        if (zzah()) {
                                            zzV();
                                        }
                                    } else {
                                        i = 3;
                                        if (this.zzu.zze == 3) {
                                            if (this.zzG == 0) {
                                                if (!zzaf()) {
                                                    this.zzz = zzah();
                                                    zzU(2);
                                                    if (this.zzz) {
                                                        while (zzkqVarZzd2 != null) {
                                                            while (i2 < r5) {
                                                            }
                                                        }
                                                        this.zzO.zzc();
                                                    }
                                                    zzX();
                                                }
                                            } else if (!z4) {
                                                this.zzz = zzah();
                                                zzU(2);
                                                if (this.zzz) {
                                                    while (zzkqVarZzd2 != null) {
                                                        while (i2 < r5) {
                                                        }
                                                    }
                                                    this.zzO.zzc();
                                                }
                                                zzX();
                                            }
                                        }
                                    }
                                }
                                int i15 = 2;
                                if (this.zzu.zze == 2) {
                                    int i16 = 0;
                                    while (true) {
                                        zzln[] zzlnVarArr6 = this.zza;
                                        int length9 = zzlnVarArr6.length;
                                        if (i16 < i15) {
                                            if (zzae(zzlnVarArr6[i16]) && this.zza[i16].zzo() == zzkqVarZzd4.zzc[i16]) {
                                                this.zza[i16].zzv();
                                            }
                                            i16++;
                                            i15 = 2;
                                        } else {
                                            zzlg zzlgVar3 = this.zzu;
                                            if (zzlgVar3.zzg || zzlgVar3.zzq >= 500000 || !zzad()) {
                                                this.zzM = -9223372036854775807L;
                                            } else if (this.zzM == -9223372036854775807L) {
                                                this.zzM = SystemClock.elapsedRealtime();
                                            } else if (SystemClock.elapsedRealtime() - this.zzM >= 4000) {
                                                throw new IllegalStateException("Playback stuck buffering and not loading");
                                            }
                                        }
                                    }
                                } else {
                                    this.zzM = -9223372036854775807L;
                                }
                                boolean z17 = zzah() && this.zzu.zze == i;
                                boolean z18 = this.zzF && this.zzE && z17;
                                zzlg zzlgVar4 = this.zzu;
                                if (zzlgVar4.zzo != z18) {
                                    z7 = z18;
                                    this.zzu = new zzlg(zzlgVar4.zza, zzlgVar4.zzb, zzlgVar4.zzc, zzlgVar4.zzd, zzlgVar4.zze, zzlgVar4.zzf, zzlgVar4.zzg, zzlgVar4.zzh, zzlgVar4.zzi, zzlgVar4.zzj, zzlgVar4.zzk, zzlgVar4.zzl, zzlgVar4.zzm, zzlgVar4.zzn, zzlgVar4.zzp, zzlgVar4.zzq, zzlgVar4.zzr, zzlgVar4.zzs, z7);
                                } else {
                                    z7 = z18;
                                }
                                this.zzE = false;
                                if (!z7 && (i3 = this.zzu.zze) != 4) {
                                    if (z17 || i3 == 2) {
                                        zzQ(jUptimeMillis, 10L);
                                    } else if (i3 == 3 && this.zzG != 0) {
                                        zzQ(jUptimeMillis, 1000L);
                                    }
                                }
                                Trace.endSection();
                            }
                        }
                        z = true;
                    }
                    zzJ();
                    return z;
                case 3:
                    zzkk zzkkVar = (zzkk) message.obj;
                    this.zzv.zza(1);
                    Pair pairZzy = zzy(this.zzu.zza, zzkkVar, true, this.zzB, this.zzC, this.zzk, this.zzl);
                    if (pairZzy == null) {
                        Pair pairZzx = zzx(this.zzu.zza);
                        zztsVar = (zzts) pairZzx.first;
                        long jLongValue2 = ((Long) pairZzx.second).longValue();
                        j = -9223372036854775807L;
                        z9 = !this.zzu.zza.zzo();
                        jLongValue = jLongValue2;
                    } else {
                        Object obj = pairZzy.first;
                        jLongValue = ((Long) pairZzy.second).longValue();
                        j = zzkkVar.zzc == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                        zzts zztsVarZzh = this.zzq.zzh(this.zzu.zza, obj, jLongValue);
                        if (zztsVarZzh.zzb()) {
                            this.zzu.zza.zzn(zztsVarZzh.zza, this.zzl);
                            if (this.zzl.zze(zztsVarZzh.zzb) == zztsVarZzh.zzc) {
                                this.zzl.zzj();
                            }
                            zztsVar = zztsVarZzh;
                            jLongValue = 0;
                            z9 = true;
                        } else {
                            z9 = zzkkVar.zzc == -9223372036854775807L;
                            zztsVar = zztsVarZzh;
                        }
                    }
                    try {
                        try {
                            if (!this.zzu.zza.zzo()) {
                                if (pairZzy == null) {
                                    if (this.zzu.zze != 1) {
                                        zzU(4);
                                    }
                                    zzM(false, true, false, true);
                                } else {
                                    if (zztsVar.equals(this.zzu.zzb)) {
                                        zzkq zzkqVarZzd5 = this.zzq.zzd();
                                        jZza = (zzkqVarZzd5 == null || !zzkqVarZzd5.zzd || jLongValue == 0) ? jLongValue : zzkqVarZzd5.zza.zza(jLongValue, this.zzt);
                                        zztsVar2 = zztsVar;
                                        try {
                                            if (zzfk.zzr(jZza) == zzfk.zzr(this.zzu.zzr) && ((i5 = (zzlgVar2 = this.zzu).zze) == 2 || i5 == 3)) {
                                                long j8 = zzlgVar2.zzr;
                                                zzlgVarZzz = zzz(zztsVar2, j8, j, j8, z9, 2);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            th = th;
                                            th2 = th;
                                            j2 = jLongValue;
                                            this.zzu = zzz(zztsVar2, j2, j, j2, z9, 2);
                                            throw th2;
                                        }
                                    } else {
                                        zztsVar2 = zztsVar;
                                        jZza = jLongValue;
                                    }
                                    long jZzv = zzv(zztsVar2, jZza, this.zzu.zze == 4);
                                    z9 |= jLongValue != jZzv;
                                    try {
                                        zzlg zzlgVar5 = this.zzu;
                                        zzcw zzcwVar2 = zzlgVar5.zza;
                                        zzab(zzcwVar2, zztsVar2, zzcwVar2, zzlgVar5.zzb, j, true);
                                        j3 = jZzv;
                                        zzlgVarZzz = zzz(zztsVar2, j3, j, j3, z9, 2);
                                    } catch (Throwable th4) {
                                        j2 = jZzv;
                                        th2 = th4;
                                        this.zzu = zzz(zztsVar2, j2, j, j2, z9, 2);
                                        throw th2;
                                    }
                                }
                                this.zzu = zzlgVarZzz;
                                z = true;
                                zzJ();
                                return z;
                            }
                            this.zzH = zzkkVar;
                            j3 = jLongValue;
                            zztsVar2 = zztsVar;
                            zzlgVarZzz = zzz(zztsVar2, j3, j, j3, z9, 2);
                            this.zzu = zzlgVarZzz;
                            z = true;
                            zzJ();
                            return z;
                        } catch (Throwable th5) {
                            th = th5;
                            zztsVar2 = zztsVar;
                            th2 = th;
                            j2 = jLongValue;
                            this.zzu = zzz(zztsVar2, j2, j, j2, z9, 2);
                            throw th2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        zztsVar2 = zztsVar;
                    }
                    break;
                case 4:
                    zzS((zzch) message.obj);
                    zzG(this.zzn.zzc(), true);
                    z = true;
                    zzJ();
                    return z;
                case 5:
                    this.zzt = (zzlr) message.obj;
                    z = true;
                    zzJ();
                    return z;
                case 6:
                    zzW(false, true);
                    z = true;
                    zzJ();
                    return z;
                case 7:
                    zzM(true, false, true, false);
                    int i17 = 0;
                    while (true) {
                        int length10 = this.zza.length;
                        if (i17 >= 2) {
                            this.zzf.zzc();
                            zzU(1);
                            HandlerThread handlerThread = this.zzi;
                            if (handlerThread != null) {
                                handlerThread.quit();
                            }
                            synchronized (this) {
                                this.zzw = true;
                                notifyAll();
                                break;
                            }
                            return true;
                        }
                        this.zzc[i17].zzp();
                        this.zza[i17].zzD();
                        i17++;
                    }
                    break;
                case 8:
                    if (this.zzq.zzl((zztq) message.obj)) {
                        zzkq zzkqVarZzc2 = this.zzq.zzc();
                        zzkqVarZzc2.zzl(this.zzn.zzc().zzc, this.zzu.zza);
                        zzZ(zzkqVarZzc2.zzf.zza, zzkqVarZzc2.zzh(), zzkqVarZzc2.zzi());
                        if (zzkqVarZzc2 == this.zzq.zzd()) {
                            zzO(zzkqVarZzc2.zzf.zzb);
                            zzB();
                            zzlg zzlgVar6 = this.zzu;
                            zzts zztsVar7 = zzlgVar6.zzb;
                            long j9 = zzkqVarZzc2.zzf.zzb;
                            this.zzu = zzz(zztsVar7, j9, zzlgVar6.zzc, j9, false, 5);
                        }
                        zzI();
                    }
                    z = true;
                    zzJ();
                    return z;
                case 9:
                    if (this.zzq.zzl((zztq) message.obj)) {
                        this.zzq.zzk(this.zzI);
                        zzI();
                    }
                    z = true;
                    zzJ();
                    return z;
                case 10:
                    zzK();
                    z = true;
                    zzJ();
                    return z;
                case 11:
                    int i18 = message.arg1;
                    this.zzB = i18;
                    if (!this.zzq.zzp(this.zzu.zza, i18)) {
                        zzR(true);
                    }
                    zzE(false);
                    z = true;
                    zzJ();
                    return z;
                case 12:
                    boolean z19 = message.arg1 != 0;
                    this.zzC = z19;
                    if (!this.zzq.zzq(this.zzu.zza, z19)) {
                        zzR(true);
                    }
                    zzE(false);
                    z = true;
                    zzJ();
                    return z;
                case 13:
                    boolean z20 = message.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                    if (this.zzD != z20) {
                        this.zzD = z20;
                        if (!z20) {
                            zzln[] zzlnVarArr7 = this.zza;
                            int length11 = zzlnVarArr7.length;
                            for (int i19 = 0; i19 < 2; i19++) {
                                zzln zzlnVar6 = zzlnVarArr7[i19];
                                if (!zzae(zzlnVar6) && this.zzb.remove(zzlnVar6)) {
                                    zzlnVar6.zzF();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            notifyAll();
                            break;
                        }
                    }
                    z = true;
                    zzJ();
                    return z;
                case 14:
                    zzlj zzljVar = (zzlj) message.obj;
                    if (zzljVar.zzb() == this.zzj) {
                        zzak(zzljVar);
                        int i20 = this.zzu.zze;
                        if (i20 == 3 || i20 == 2) {
                            this.zzh.zzi(2);
                        }
                    } else {
                        this.zzh.zzc(15, zzljVar).zza();
                    }
                    z = true;
                    zzJ();
                    return z;
                case 15:
                    final zzlj zzljVar2 = (zzlj) message.obj;
                    Looper looperZzb = zzljVar2.zzb();
                    if (looperZzb.getThread().isAlive()) {
                        this.zzp.zzb(looperZzb, null).zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkd
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzkl.zzr(zzljVar2);
                            }
                        });
                    } else {
                        zzes.zzf("TAG", "Trying to send message on a dead thread.");
                        zzljVar2.zzh(false);
                    }
                    z = true;
                    zzJ();
                    return z;
                case 16:
                    zzG((zzch) message.obj, false);
                    z = true;
                    zzJ();
                    return z;
                case 17:
                    zzkg zzkgVar = (zzkg) message.obj;
                    this.zzv.zza(1);
                    if (zzkgVar.zzb != -1) {
                        this.zzH = new zzkk(new zzll(zzkgVar.zza, zzkgVar.zzd), zzkgVar.zzb, zzkgVar.zzc);
                    }
                    zzF(this.zzr.zzn(zzkgVar.zza, zzkgVar.zzd), false);
                    z = true;
                    zzJ();
                    return z;
                case 18:
                    zzkg zzkgVar2 = (zzkg) message.obj;
                    int iZza = message.arg1;
                    this.zzv.zza(1);
                    zzlf zzlfVar = this.zzr;
                    if (iZza == -1) {
                        iZza = zzlfVar.zza();
                    }
                    zzF(zzlfVar.zzk(iZza, zzkgVar2.zza, zzkgVar2.zzd), false);
                    z = true;
                    zzJ();
                    return z;
                case 19:
                    zzkh zzkhVar = (zzkh) message.obj;
                    this.zzv.zza(1);
                    zzlf zzlfVar2 = this.zzr;
                    int i21 = zzkhVar.zza;
                    int i22 = zzkhVar.zzb;
                    int i23 = zzkhVar.zzc;
                    zzvm zzvmVar = zzkhVar.zzd;
                    zzF(zzlfVar2.zzl(0, 0, 0, null), false);
                    z = true;
                    zzJ();
                    return z;
                case 20:
                    int i24 = message.arg1;
                    int i25 = message.arg2;
                    zzvm zzvmVar2 = (zzvm) message.obj;
                    this.zzv.zza(1);
                    zzF(this.zzr.zzm(i24, i25, zzvmVar2), false);
                    z = true;
                    zzJ();
                    return z;
                case 21:
                    zzvm zzvmVar3 = (zzvm) message.obj;
                    this.zzv.zza(1);
                    zzF(this.zzr.zzo(zzvmVar3), false);
                    z = true;
                    zzJ();
                    return z;
                case 22:
                    zzF(this.zzr.zzb(), true);
                    z = true;
                    zzJ();
                    return z;
                case 23:
                    this.zzx = message.arg1 != 0;
                    zzN();
                    if (this.zzy && this.zzq.zze() != this.zzq.zzd()) {
                        zzR(true);
                        zzE(false);
                    }
                    z = true;
                    zzJ();
                    return z;
                case 24:
                    boolean z21 = message.arg1 == 1;
                    if (z21 != this.zzF) {
                        this.zzF = z21;
                        if (!z21 && this.zzu.zzo) {
                            this.zzh.zzi(2);
                        }
                    }
                    z = true;
                    zzJ();
                    return z;
                case 25:
                    zzL();
                    z = true;
                    zzJ();
                    return z;
                case 26:
                    zzL();
                    z = true;
                    zzJ();
                    return z;
                case 27:
                    int i26 = message.arg1;
                    int i27 = message.arg2;
                    List list = (List) message.obj;
                    this.zzv.zza(1);
                    zzF(this.zzr.zzc(i26, i27, list), false);
                    z = true;
                    zzJ();
                    return z;
                default:
                    return false;
            }
        } catch (zzcd e) {
            zzD(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : 1000);
        } catch (zzgj e2) {
            zzD(e2, e2.zza);
        } catch (zzil e3) {
            zzil zzilVarZza = e3;
            if (zzilVarZza.zze == 1 && (zzkqVarZze = this.zzq.zze()) != null) {
                zzilVarZza = zzilVarZza.zza(zzkqVarZze.zzf.zza);
            }
            if (zzilVarZza.zzk && this.zzL == null) {
                zzes.zzg("ExoPlayerImplInternal", "Recoverable renderer error", zzilVarZza);
                this.zzL = zzilVarZza;
                zzej zzejVar = this.zzh;
                zzejVar.zzk(zzejVar.zzc(25, zzilVarZza));
            } else {
                zzil zzilVar = this.zzL;
                if (zzilVar != null) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzilVar, zzilVarZza);
                    } catch (Exception unused) {
                    }
                    zzilVarZza = this.zzL;
                }
                zzil zzilVar2 = zzilVarZza;
                zzes.zzd("ExoPlayerImplInternal", "Playback error", zzilVar2);
                z = true;
                if (zzilVar2.zze == 1) {
                    if (this.zzq.zzd() != this.zzq.zze()) {
                        while (this.zzq.zzd() != this.zzq.zze()) {
                            this.zzq.zza();
                        }
                        zzkq zzkqVarZzd6 = this.zzq.zzd();
                        zzkqVarZzd6.getClass();
                        zzkr zzkrVar3 = zzkqVarZzd6.zzf;
                        zzts zztsVar8 = zzkrVar3.zza;
                        long j10 = zzkrVar3.zzb;
                        this.zzu = zzz(zztsVar8, j10, zzkrVar3.zzc, j10, true, 0);
                    }
                    z2 = false;
                    z = true;
                } else {
                    z2 = false;
                }
                zzW(z, z2);
                this.zzu = this.zzu.zzf(zzilVar2);
            }
        } catch (zzqr e4) {
            zzD(e4, e4.zza);
        } catch (zzsu e5) {
            zzD(e5, 1002);
        } catch (IOException e6) {
            zzD(e6, 2000);
        } catch (RuntimeException e7) {
            zzil zzilVarZzd = zzil.zzd(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? PointerIconCompat.TYPE_WAIT : 1000);
            zzes.zzd("ExoPlayerImplInternal", "Playback error", zzilVarZzd);
            zzW(true, false);
            this.zzu = this.zzu.zzf(zzilVarZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final void zza(zzch zzchVar) {
        this.zzh.zzc(16, zzchVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final /* bridge */ /* synthetic */ void zzg(zzvl zzvlVar) {
        this.zzh.zzc(9, (zztq) zzvlVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzh() {
        this.zzh.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzi(zztq zztqVar) {
        this.zzh.zzc(8, zztqVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zzj() {
        this.zzh.zzi(10);
    }

    public final void zzk() {
        this.zzh.zzb(0).zza();
    }

    public final void zzl(zzcw zzcwVar, int i, long j) {
        this.zzh.zzc(3, new zzkk(zzcwVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final synchronized void zzm(zzlj zzljVar) {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzc(14, zzljVar).zza();
            return;
        }
        zzes.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzljVar.zzh(false);
    }

    public final void zzn(boolean z, int i) {
        this.zzh.zzd(1, z ? 1 : 0, i).zza();
    }

    public final void zzo() {
        this.zzh.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzi(7);
            zzac(new zzkc(this), this.zzs);
            return this.zzw;
        }
        return true;
    }

    public final void zzq(List list, int i, long j, zzvm zzvmVar) {
        this.zzh.zzc(17, new zzkg(list, zzvmVar, i, j, null)).zza();
    }
}
