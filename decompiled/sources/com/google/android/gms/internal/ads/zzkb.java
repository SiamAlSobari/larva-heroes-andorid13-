package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.games.GamesStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzkb extends zzm implements zziw {
    public static final /* synthetic */ int zzd = 0;
    private final zzlw zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzlr zzG;
    private zzcl zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private zzam zzK;
    private zzam zzL;
    private AudioTrack zzM;
    private Object zzN;
    private Surface zzO;
    private int zzP;
    private zzfc zzQ;
    private zzid zzR;
    private zzid zzS;
    private int zzT;
    private zzk zzU;
    private float zzV;
    private boolean zzW;
    private zzdx zzX;
    private boolean zzY;
    private boolean zzZ;
    private zzz zzaa;
    private zzdn zzab;
    private zzbv zzac;
    private zzlg zzad;
    private int zzae;
    private long zzaf;
    private final zzjg zzag;
    private zzvm zzah;
    final zzxm zzb;
    final zzcl zzc;
    private final zzeb zze;
    private final Context zzf;
    private final zzcp zzg;
    private final zzln[] zzh;
    private final zzxl zzi;
    private final zzej zzj;
    private final zzkl zzk;
    private final zzep zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzct zzn;
    private final List zzo;
    private final boolean zzp;
    private final zztr zzq;
    private final zzlx zzr;
    private final Looper zzs;
    private final zzxt zzt;
    private final zzdz zzu;
    private final zzjx zzv;
    private final zzjz zzw;
    private final zzhx zzx;
    private final zzib zzy;
    private final zzlv zzz;

    static {
        zzbq.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.zzlx, com.google.android.gms.internal.ads.zzxs, java.lang.Object] */
    public zzkb(zziv zzivVar, zzcp zzcpVar) {
        Object obj;
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zze = zzebVar;
        try {
            zzes.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.1.0] [" + zzfk.zze + "]");
            Context applicationContext = zzivVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? Apply = zzivVar.zzh.apply(zzivVar.zzb);
            this.zzr = Apply;
            this.zzU = zzivVar.zzj;
            this.zzP = zzivVar.zzk;
            this.zzW = false;
            this.zzB = zzivVar.zzo;
            zzjx zzjxVar = new zzjx(this, null);
            this.zzv = zzjxVar;
            zzjz zzjzVar = new zzjz(null);
            this.zzw = zzjzVar;
            Handler handler = new Handler(zzivVar.zzi);
            zzln[] zzlnVarArrZza = ((zzip) zzivVar.zzc).zza.zza(handler, zzjxVar, zzjxVar, zzjxVar, zzjxVar);
            this.zzh = zzlnVarArrZza;
            int length = zzlnVarArrZza.length;
            zzxl zzxlVar = (zzxl) zzivVar.zze.zza();
            this.zzi = zzxlVar;
            this.zzq = zziv.zza(((zziq) zzivVar.zzd).zza);
            zzxx zzxxVarZzg = zzxx.zzg(((zzit) zzivVar.zzg).zza);
            this.zzt = zzxxVarZzg;
            this.zzp = zzivVar.zzl;
            this.zzG = zzivVar.zzm;
            Looper looper = zzivVar.zzi;
            this.zzs = looper;
            zzdz zzdzVar = zzivVar.zzb;
            this.zzu = zzdzVar;
            this.zzg = zzcpVar;
            zzep zzepVar = new zzep(looper, zzdzVar, new zzen() { // from class: com.google.android.gms.internal.ads.zzjf
                @Override // com.google.android.gms.internal.ads.zzen
                public final void zza(Object obj2, zzah zzahVar) {
                }
            });
            this.zzl = zzepVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzah = new zzvm(0);
            int length2 = zzlnVarArrZza.length;
            zzxm zzxmVar = new zzxm(new zzlq[2], new zzxf[2], zzdh.zza, null);
            this.zzb = zzxmVar;
            this.zzn = new zzct();
            zzcj zzcjVar = new zzcj();
            zzcjVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32);
            zzxlVar.zzm();
            zzcjVar.zzd(29, true);
            zzcjVar.zzd(23, false);
            zzcjVar.zzd(25, false);
            zzcjVar.zzd(33, false);
            zzcjVar.zzd(26, false);
            zzcjVar.zzd(34, false);
            zzcl zzclVarZze = zzcjVar.zze();
            this.zzc = zzclVarZze;
            zzcj zzcjVar2 = new zzcj();
            zzcjVar2.zzb(zzclVarZze);
            zzcjVar2.zza(4);
            zzcjVar2.zza(10);
            this.zzH = zzcjVar2.zze();
            this.zzj = zzdzVar.zzb(looper, null);
            zzjg zzjgVar = new zzjg(this);
            this.zzag = zzjgVar;
            this.zzad = zzlg.zzi(zzxmVar);
            Apply.zzP(zzcpVar, looper);
            this.zzk = new zzkl(zzlnVarArrZza, zzxlVar, zzxmVar, (zzko) zzivVar.zzf.zza(), zzxxVarZzg, 0, false, Apply, this.zzG, zzivVar.zzr, zzivVar.zzn, false, looper, zzdzVar, zzjgVar, zzfk.zza < 31 ? new zzoh() : zzjs.zza(applicationContext, this, zzivVar.zzp), null);
            this.zzV = 1.0f;
            this.zzI = zzbv.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzJ = zzbvVar;
            this.zzac = zzbvVar;
            int iGenerateAudioSessionId = -1;
            this.zzae = -1;
            if (zzfk.zza >= 21) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.zzT = iGenerateAudioSessionId;
                obj = null;
            } else {
                AudioTrack audioTrack = this.zzM;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.zzM.release();
                    obj = null;
                    this.zzM = null;
                }
                if (this.zzM == null) {
                    this.zzM = new AudioTrack(3, GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND, 4, 2, 2, 0, 0);
                }
                this.zzT = this.zzM.getAudioSessionId();
            }
            this.zzX = zzdx.zza;
            this.zzY = true;
            Apply.getClass();
            zzepVar.zzb(Apply);
            zzxxVarZzg.zze(new Handler(looper), Apply);
            copyOnWriteArraySet.add(zzjxVar);
            this.zzx = new zzhx(zzivVar.zza, handler, zzjxVar);
            this.zzy = new zzib(zzivVar.zza, handler, zzjxVar);
            zzfk.zzD(obj, obj);
            this.zzz = new zzlv(zzivVar.zza);
            this.zzA = new zzlw(zzivVar.zza);
            this.zzaa = new zzx(0).zza();
            this.zzab = zzdn.zza;
            this.zzQ = zzfc.zza;
            zzxlVar.zzj(this.zzU);
            zzah(1, 10, Integer.valueOf(this.zzT));
            zzah(2, 10, Integer.valueOf(this.zzT));
            zzah(1, 3, this.zzU);
            zzah(2, 4, Integer.valueOf(this.zzP));
            zzah(2, 5, 0);
            zzah(1, 9, Boolean.valueOf(this.zzW));
            zzah(2, 7, zzjzVar);
            zzah(6, 8, zzjzVar);
            zzebVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void zzP(zzkb zzkbVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkbVar.zzaj(surface);
        zzkbVar.zzO = surface;
    }

    private final int zzX(zzlg zzlgVar) {
        return zzlgVar.zza.zzo() ? this.zzae : zzlgVar.zza.zzn(zzlgVar.zzb.zza, this.zzn).zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzY(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzZ(zzlg zzlgVar) {
        if (!zzlgVar.zzb.zzb()) {
            return zzfk.zzr(zzaa(zzlgVar));
        }
        zzlgVar.zza.zzn(zzlgVar.zzb.zza, this.zzn);
        if (zzlgVar.zzc == -9223372036854775807L) {
            long j = zzlgVar.zza.zze(zzX(zzlgVar), this.zza, 0L).zzn;
            return zzfk.zzr(0L);
        }
        int i = zzfk.zza;
        return zzfk.zzr(zzlgVar.zzc) + zzfk.zzr(0L);
    }

    private final long zzaa(zzlg zzlgVar) {
        if (zzlgVar.zza.zzo()) {
            return zzfk.zzp(this.zzaf);
        }
        long jZza = zzlgVar.zzo ? zzlgVar.zza() : zzlgVar.zzr;
        if (zzlgVar.zzb.zzb()) {
            return jZza;
        }
        zzac(zzlgVar.zza, zzlgVar.zzb, jZza);
        return jZza;
    }

    private static long zzab(zzlg zzlgVar) {
        zzcv zzcvVar = new zzcv();
        zzct zzctVar = new zzct();
        zzlgVar.zza.zzn(zzlgVar.zzb.zza, zzctVar);
        long j = zzlgVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzlgVar.zza.zze(zzctVar.zzd, zzcvVar, 0L).zzn;
        return 0L;
    }

    private final long zzac(zzcw zzcwVar, zzts zztsVar, long j) {
        zzcwVar.zzn(zztsVar.zza, this.zzn);
        return j;
    }

    private final Pair zzad(zzcw zzcwVar, int i, long j) {
        if (zzcwVar.zzo()) {
            this.zzae = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzaf = j;
            return null;
        }
        if (i == -1 || i >= zzcwVar.zzc()) {
            i = zzcwVar.zzg(false);
            long j2 = zzcwVar.zze(i, this.zza, 0L).zzn;
            j = zzfk.zzr(0L);
        }
        return zzcwVar.zzl(this.zza, this.zzn, i, zzfk.zzp(j));
    }

    private final zzlg zzae(zzlg zzlgVar, zzcw zzcwVar, Pair pair) {
        zzdy.zzd(zzcwVar.zzo() || pair != null);
        zzcw zzcwVar2 = zzlgVar.zza;
        long jZzZ = zzZ(zzlgVar);
        zzlg zzlgVarZzh = zzlgVar.zzh(zzcwVar);
        if (zzcwVar.zzo()) {
            zzts zztsVarZzj = zzlg.zzj();
            long jZzp = zzfk.zzp(this.zzaf);
            zzlg zzlgVarZzc = zzlgVarZzh.zzd(zztsVarZzj, jZzp, jZzp, jZzp, 0L, zzvs.zza, this.zzb, zzfud.zzl()).zzc(zztsVarZzj);
            zzlgVarZzc.zzp = zzlgVarZzc.zzr;
            return zzlgVarZzc;
        }
        Object obj = zzlgVarZzh.zzb.zza;
        int i = zzfk.zza;
        boolean z = !obj.equals(pair.first);
        zzts zztsVar = z ? new zzts(pair.first) : zzlgVarZzh.zzb;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzp2 = zzfk.zzp(jZzZ);
        if (!zzcwVar2.zzo()) {
            zzcwVar2.zzn(obj, this.zzn);
        }
        if (z || jLongValue < jZzp2) {
            zzdy.zzf(!zztsVar.zzb());
            zzlg zzlgVarZzc2 = zzlgVarZzh.zzd(zztsVar, jLongValue, jLongValue, jLongValue, 0L, z ? zzvs.zza : zzlgVarZzh.zzh, z ? this.zzb : zzlgVarZzh.zzi, z ? zzfud.zzl() : zzlgVarZzh.zzj).zzc(zztsVar);
            zzlgVarZzc2.zzp = jLongValue;
            return zzlgVarZzc2;
        }
        if (jLongValue != jZzp2) {
            zzdy.zzf(!zztsVar.zzb());
            long jMax = Math.max(0L, zzlgVarZzh.zzq - (jLongValue - jZzp2));
            long j = zzlgVarZzh.zzp;
            if (zzlgVarZzh.zzk.equals(zzlgVarZzh.zzb)) {
                j = jLongValue + jMax;
            }
            zzlg zzlgVarZzd = zzlgVarZzh.zzd(zztsVar, jLongValue, jLongValue, jLongValue, jMax, zzlgVarZzh.zzh, zzlgVarZzh.zzi, zzlgVarZzh.zzj);
            zzlgVarZzd.zzp = j;
            return zzlgVarZzd;
        }
        int iZza = zzcwVar.zza(zzlgVarZzh.zzk.zza);
        if (iZza != -1 && zzcwVar.zzd(iZza, this.zzn, false).zzd == zzcwVar.zzn(zztsVar.zza, this.zzn).zzd) {
            return zzlgVarZzh;
        }
        zzcwVar.zzn(zztsVar.zza, this.zzn);
        long jZzh = zztsVar.zzb() ? this.zzn.zzh(zztsVar.zzb, zztsVar.zzc) : this.zzn.zze;
        zzlg zzlgVarZzc3 = zzlgVarZzh.zzd(zztsVar, zzlgVarZzh.zzr, zzlgVarZzh.zzr, zzlgVarZzh.zzd, jZzh - zzlgVarZzh.zzr, zzlgVarZzh.zzh, zzlgVarZzh.zzi, zzlgVarZzh.zzj).zzc(zztsVar);
        zzlgVarZzc3.zzp = jZzh;
        return zzlgVarZzc3;
    }

    private final zzlj zzaf(zzli zzliVar) {
        int iZzX = zzX(this.zzad);
        zzkl zzklVar = this.zzk;
        return new zzlj(zzklVar, zzliVar, this.zzad.zza, iZzX == -1 ? 0 : iZzX, this.zzu, zzklVar.zzb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzag(final int i, final int i2) {
        if (i == this.zzQ.zzb() && i2 == this.zzQ.zza()) {
            return;
        }
        this.zzQ = new zzfc(i, i2);
        zzep zzepVar = this.zzl;
        zzepVar.zzd(24, new zzem() { // from class: com.google.android.gms.internal.ads.zzjj
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                int i3 = i;
                int i4 = i2;
                int i5 = zzkb.zzd;
                ((zzcm) obj).zzo(i3, i4);
            }
        });
        zzepVar.zzc();
        zzah(2, 14, new zzfc(i, i2));
    }

    private final void zzah(int i, int i2, Object obj) {
        zzln[] zzlnVarArr = this.zzh;
        int length = zzlnVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzln zzlnVar = zzlnVarArr[i3];
            if (zzlnVar.zzb() == i) {
                zzlj zzljVarZzaf = zzaf(zzlnVar);
                zzljVarZzaf.zzf(i2);
                zzljVarZzaf.zze(obj);
                zzljVarZzaf.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzai() {
        zzah(1, 2, Float.valueOf(this.zzV * this.zzy.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaj(Object obj) {
        ArrayList arrayList = new ArrayList();
        zzln[] zzlnVarArr = this.zzh;
        int length = zzlnVarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            zzln zzlnVar = zzlnVarArr[i];
            if (zzlnVar.zzb() == 2) {
                zzlj zzljVarZzaf = zzaf(zzlnVar);
                zzljVarZzaf.zzf(1);
                zzljVarZzaf.zze(obj);
                zzljVarZzaf.zzd();
                arrayList.add(zzljVarZzaf);
            }
        }
        Object obj2 = this.zzN;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzlj) it.next()).zzi(this.zzB);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.zzN;
            Surface surface = this.zzO;
            if (obj3 == surface) {
                surface.release();
                this.zzO = null;
            }
        }
        this.zzN = obj;
        if (z) {
            zzak(zzil.zzd(new zzkm(3), PointerIconCompat.TYPE_HELP));
        }
    }

    private final void zzak(zzil zzilVar) {
        zzlg zzlgVar = this.zzad;
        zzlg zzlgVarZzc = zzlgVar.zzc(zzlgVar.zzb);
        zzlgVarZzc.zzp = zzlgVarZzc.zzr;
        zzlgVarZzc.zzq = 0L;
        zzlg zzlgVarZzg = zzlgVarZzc.zzg(1);
        if (zzilVar != null) {
            zzlgVarZzg = zzlgVarZzg.zzf(zzilVar);
        }
        this.zzC++;
        this.zzk.zzo();
        zzam(zzlgVarZzg, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzal(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzlg zzlgVarZzb = this.zzad;
        if (zzlgVarZzb.zzl == z2 && zzlgVarZzb.zzm == i3) {
            return;
        }
        this.zzC++;
        if (zzlgVarZzb.zzo) {
            zzlgVarZzb = zzlgVarZzb.zzb();
        }
        zzlg zzlgVarZze = zzlgVarZzb.zze(z2, i3);
        this.zzk.zzn(z2, i3);
        zzam(zzlgVarZze, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:146:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:147:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:149:0x0400  */
    /* JADX WARN: Code duplicated, block: B:152:0x040b  */
    /* JADX WARN: Code duplicated, block: B:154:0x041f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0421  */
    /* JADX WARN: Code duplicated, block: B:159:0x0430  */
    /* JADX WARN: Code duplicated, block: B:162:0x0440  */
    /* JADX WARN: Code duplicated, block: B:165:0x0458 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x045c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0463 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x0467  */
    /* JADX WARN: Code duplicated, block: B:175:0x046e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x0478  */
    /* JADX WARN: Code duplicated, block: B:183:0x047f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x0483  */
    /* JADX WARN: Code duplicated, block: B:188:0x048b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x0495  */
    /* JADX WARN: Code duplicated, block: B:196:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:201:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:206:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:209:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:212:0x04e9 A[LOOP:2: B:210:0x04e3->B:212:0x04e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x04f5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    private final void zzam(final zzlg zzlgVar, final int i, final int i2, boolean z, final int i3, long j, int i4, boolean z2) {
        Pair pair;
        Pair pair2;
        int i5;
        final zzbp zzbpVar;
        zzbv zzbvVarZzu;
        boolean z3;
        int i6;
        boolean z4;
        ?? r10;
        zzcw zzcwVarZzn;
        int iZzd;
        boolean z5;
        zzcw zzcwVarZzn2;
        zzcl zzclVar;
        long j2;
        zzcw zzcwVarZzn3;
        boolean z6;
        boolean zZzo;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        boolean z13;
        zzcl zzclVarZze;
        Iterator it;
        int i8;
        Object obj;
        zzbp zzbpVar2;
        Object obj2;
        int i9;
        long jZzab;
        long jZzab2;
        Object obj3;
        zzbp zzbpVar3;
        Object obj4;
        int iZza;
        zzlg zzlgVar2 = this.zzad;
        this.zzad = zzlgVar;
        boolean z14 = !zzlgVar2.zza.equals(zzlgVar.zza);
        zzcw zzcwVar = zzlgVar2.zza;
        zzcw zzcwVar2 = zzlgVar.zza;
        if (zzcwVar2.zzo() && zzcwVar.zzo()) {
            pair = new Pair(false, -1);
        } else {
            if (zzcwVar2.zzo() != zzcwVar.zzo()) {
                pair2 = new Pair(true, 3);
            } else if (!zzcwVar.zze(zzcwVar.zzn(zzlgVar2.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc.equals(zzcwVar2.zze(zzcwVar2.zzn(zzlgVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc)) {
                if (z && i3 == 0) {
                    i5 = 1;
                } else if (z && i3 == 1) {
                    i5 = 2;
                } else {
                    if (!z14) {
                        throw new IllegalStateException();
                    }
                    i5 = 3;
                }
                pair = new Pair(true, Integer.valueOf(i5));
            } else if (z && i3 == 0 && zzlgVar2.zzb.zzd < zzlgVar.zzb.zzd) {
                pair2 = new Pair(true, 0);
            } else {
                pair = new Pair(false, -1);
            }
            pair = pair2;
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            zzbpVar = zzlgVar.zza.zzo() ? null : zzlgVar.zza.zze(zzlgVar.zza.zzn(zzlgVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zze;
            this.zzac = zzbv.zza;
        } else {
            zzbpVar = null;
        }
        if (!zzlgVar2.zzj.equals(zzlgVar.zzj)) {
            zzbt zzbtVarZza = this.zzac.zza();
            List list = zzlgVar.zzj;
            for (int i10 = 0; i10 < list.size(); i10++) {
                zzbz zzbzVar = (zzbz) list.get(i10);
                for (int i11 = 0; i11 < zzbzVar.zza(); i11++) {
                    zzbzVar.zzb(i11).zza(zzbtVarZza);
                }
            }
            this.zzac = zzbtVarZza.zzu();
        }
        zzcw zzcwVarZzn4 = zzn();
        if (zzcwVarZzn4.zzo()) {
            zzbvVarZzu = this.zzac;
        } else {
            zzbp zzbpVar4 = zzcwVarZzn4.zze(zzd(), this.zza, 0L).zze;
            zzbt zzbtVarZza2 = this.zzac.zza();
            zzbtVarZza2.zzb(zzbpVar4.zzg);
            zzbvVarZzu = zzbtVarZza2.zzu();
        }
        boolean z15 = !zzbvVarZzu.equals(this.zzI);
        this.zzI = zzbvVarZzu;
        boolean z16 = zzlgVar2.zzl != zzlgVar.zzl;
        boolean z17 = zzlgVar2.zze != zzlgVar.zze;
        if (z17 || z16) {
            zzan();
        }
        boolean z18 = zzlgVar2.zzg != zzlgVar.zzg;
        if (z14) {
            this.zzl.zzd(0, new zzem() { // from class: com.google.android.gms.internal.ads.zzjl
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj5) {
                    zzlg zzlgVar3 = zzlgVar;
                    int i12 = i;
                    int i13 = zzkb.zzd;
                    ((zzcm) obj5).zzp(zzlgVar3.zza, i12);
                }
            });
        }
        if (z) {
            zzct zzctVar = new zzct();
            if (zzlgVar2.zza.zzo()) {
                i8 = i4;
                obj = null;
                zzbpVar2 = null;
                obj2 = null;
                i9 = -1;
            } else {
                Object obj5 = zzlgVar2.zzb.zza;
                zzlgVar2.zza.zzn(obj5, zzctVar);
                int i12 = zzctVar.zzd;
                int iZza2 = zzlgVar2.zza.zza(obj5);
                obj2 = obj5;
                i8 = i12;
                obj = zzlgVar2.zza.zze(i12, this.zza, 0L).zzc;
                zzbpVar2 = this.zza.zze;
                i9 = iZza2;
            }
            if (i3 == 0) {
                if (zzlgVar2.zzb.zzb()) {
                    zzts zztsVar = zzlgVar2.zzb;
                    jZzab = zzctVar.zzh(zztsVar.zzb, zztsVar.zzc);
                    jZzab2 = zzab(zzlgVar2);
                } else {
                    jZzab = zzlgVar2.zzb.zze != -1 ? zzab(this.zzad) : zzctVar.zze;
                    jZzab2 = jZzab;
                }
            } else if (zzlgVar2.zzb.zzb()) {
                jZzab = zzlgVar2.zzr;
                jZzab2 = zzab(zzlgVar2);
            } else {
                jZzab = zzlgVar2.zzr;
                jZzab2 = jZzab;
            }
            int i13 = zzfk.zza;
            zzts zztsVar2 = zzlgVar2.zzb;
            final zzco zzcoVar = new zzco(obj, i8, zzbpVar2, obj2, i9, zzfk.zzr(jZzab), zzfk.zzr(jZzab2), zztsVar2.zzb, zztsVar2.zzc);
            int iZzd2 = zzd();
            if (this.zzad.zza.zzo()) {
                obj3 = null;
                zzbpVar3 = null;
                obj4 = null;
                iZza = -1;
            } else {
                zzlg zzlgVar3 = this.zzad;
                Object obj6 = zzlgVar3.zzb.zza;
                zzlgVar3.zza.zzn(obj6, this.zzn);
                iZza = this.zzad.zza.zza(obj6);
                obj3 = this.zzad.zza.zze(iZzd2, this.zza, 0L).zzc;
                zzbpVar3 = this.zza.zze;
                obj4 = obj6;
            }
            long jZzr = zzfk.zzr(j);
            long jZzr2 = this.zzad.zzb.zzb() ? zzfk.zzr(zzab(this.zzad)) : jZzr;
            zzts zztsVar3 = this.zzad.zzb;
            final zzco zzcoVar2 = new zzco(obj3, iZzd2, zzbpVar3, obj4, iZza, jZzr, jZzr2, zztsVar3.zzb, zztsVar3.zzc);
            this.zzl.zzd(11, new zzem() { // from class: com.google.android.gms.internal.ads.zzjq
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj7) {
                    int i14 = i3;
                    zzco zzcoVar3 = zzcoVar;
                    zzco zzcoVar4 = zzcoVar2;
                    int i15 = zzkb.zzd;
                    ((zzcm) obj7).zzm(zzcoVar3, zzcoVar4, i14);
                }
            });
        } else {
            z17 = z17;
            z18 = z18;
        }
        if (zBooleanValue) {
            this.zzl.zzd(1, new zzem() { // from class: com.google.android.gms.internal.ads.zzjr
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj7) {
                    zzbp zzbpVar5 = zzbpVar;
                    int i14 = iIntValue;
                    int i15 = zzkb.zzd;
                    ((zzcm) obj7).zzd(zzbpVar5, i14);
                }
            });
        }
        if (zzlgVar2.zzf != zzlgVar.zzf) {
            this.zzl.zzd(10, new zzem() { // from class: com.google.android.gms.internal.ads.zzix
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj7) {
                    zzlg zzlgVar4 = zzlgVar;
                    int i14 = zzkb.zzd;
                    ((zzcm) obj7).zzk(zzlgVar4.zzf);
                }
            });
            if (zzlgVar.zzf != null) {
                this.zzl.zzd(10, new zzem() { // from class: com.google.android.gms.internal.ads.zziy
                    @Override // com.google.android.gms.internal.ads.zzem
                    public final void zza(Object obj7) {
                        zzlg zzlgVar4 = zzlgVar;
                        int i14 = zzkb.zzd;
                        ((zzcm) obj7).zzj(zzlgVar4.zzf);
                    }
                });
            }
        }
        zzxm zzxmVar = zzlgVar2.zzi;
        zzxm zzxmVar2 = zzlgVar.zzi;
        if (zzxmVar != zzxmVar2) {
            this.zzi.zzp(zzxmVar2.zze);
            this.zzl.zzd(2, new zzem() { // from class: com.google.android.gms.internal.ads.zziz
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj7) {
                    zzlg zzlgVar4 = zzlgVar;
                    int i14 = zzkb.zzd;
                    ((zzcm) obj7).zzq(zzlgVar4.zzi.zzd);
                }
            });
        }
        if (z15) {
            final zzbv zzbvVar = this.zzI;
            this.zzl.zzd(14, new zzem() { // from class: com.google.android.gms.internal.ads.zzja
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj7) {
                    zzbv zzbvVar2 = zzbvVar;
                    int i14 = zzkb.zzd;
                    ((zzcm) obj7).zze(zzbvVar2);
                }
            });
        }
        if (z18) {
            this.zzl.zzd(3, new zzem() { // from class: com.google.android.gms.internal.ads.zzjb
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj7) {
                    zzlg zzlgVar4 = zzlgVar;
                    int i14 = zzkb.zzd;
                    ((zzcm) obj7).zzb(zzlgVar4.zzg);
                }
            });
        }
        if (z17 || z16) {
            this.zzl.zzd(-1, new zzem() { // from class: com.google.android.gms.internal.ads.zzjc
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj7) {
                    zzlg zzlgVar4 = zzlgVar;
                    int i14 = zzkb.zzd;
                    ((zzcm) obj7).zzl(zzlgVar4.zzl, zzlgVar4.zze);
                }
            });
        }
        if (z17) {
            this.zzl.zzd(4, new zzem() { // from class: com.google.android.gms.internal.ads.zzjd
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj7) {
                    zzlg zzlgVar4 = zzlgVar;
                    int i14 = zzkb.zzd;
                    ((zzcm) obj7).zzh(zzlgVar4.zze);
                }
            });
        }
        if (z16) {
            this.zzl.zzd(5, new zzem() { // from class: com.google.android.gms.internal.ads.zzjm
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj7) {
                    zzlg zzlgVar4 = zzlgVar;
                    int i14 = i2;
                    int i15 = zzkb.zzd;
                    ((zzcm) obj7).zzf(zzlgVar4.zzl, i14);
                }
            });
        }
        if (zzlgVar2.zzm != zzlgVar.zzm) {
            this.zzl.zzd(6, new zzem() { // from class: com.google.android.gms.internal.ads.zzjn
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj7) {
                    zzlg zzlgVar4 = zzlgVar;
                    int i14 = zzkb.zzd;
                    ((zzcm) obj7).zzi(zzlgVar4.zzm);
                }
            });
        }
        if (zzlgVar2.zzk() != zzlgVar.zzk()) {
            this.zzl.zzd(7, new zzem() { // from class: com.google.android.gms.internal.ads.zzjo
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj7) {
                    zzlg zzlgVar4 = zzlgVar;
                    int i14 = zzkb.zzd;
                    ((zzcm) obj7).zzc(zzlgVar4.zzk());
                }
            });
        }
        if (!zzlgVar2.zzn.equals(zzlgVar.zzn)) {
            this.zzl.zzd(12, new zzem() { // from class: com.google.android.gms.internal.ads.zzjp
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj7) {
                    zzlg zzlgVar4 = zzlgVar;
                    int i14 = zzkb.zzd;
                    ((zzcm) obj7).zzg(zzlgVar4.zzn);
                }
            });
        }
        zzcl zzclVar2 = this.zzH;
        zzcp zzcpVar = this.zzg;
        zzcl zzclVar3 = this.zzc;
        int i14 = zzfk.zza;
        boolean zZzx = zzcpVar.zzx();
        zzm zzmVar = (zzm) zzcpVar;
        zzcw zzcwVarZzn5 = zzmVar.zzn();
        boolean z19 = !zzcwVarZzn5.zzo() && zzcwVarZzn5.zze(zzmVar.zzd(), zzmVar.zza, 0L).zzi;
        zzcw zzcwVarZzn6 = zzmVar.zzn();
        if (!zzcwVarZzn6.zzo()) {
            int iZzd3 = zzmVar.zzd();
            zzmVar.zzh();
            zzmVar.zzw();
            z3 = false;
            r10 = 0;
            int iZzk = zzcwVarZzn6.zzk(iZzd3, 0, false);
            i6 = -1;
            z4 = iZzk != -1;
            zzcwVarZzn = zzmVar.zzn();
            if (zzcwVarZzn.zzo()) {
                z5 = false;
            } else {
                iZzd = zzmVar.zzd();
                zzmVar.zzh();
                zzmVar.zzw();
                if (zzcwVarZzn.zzj(iZzd, r10, r10) != i6) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            zzcwVarZzn2 = zzmVar.zzn();
            if (!zzcwVarZzn2.zzo()) {
                zzclVar = zzclVar2;
                j2 = 0;
                boolean z20 = zzcwVarZzn2.zze(zzmVar.zzd(), zzmVar.zza, 0L).zzb();
                zzcwVarZzn3 = zzmVar.zzn();
                if (zzcwVarZzn3.zzo() && zzcwVarZzn3.zze(zzmVar.zzd(), zzmVar.zza, j2).zzj) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zZzo = zzcpVar.zzn().zzo();
                zzcj zzcjVar = new zzcj();
                zzcjVar.zzb(zzclVar3);
                boolean z21 = !zZzx;
                zzcjVar.zzd(4, z21);
                if (z19 || zZzx) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                zzcjVar.zzd(5, z7);
                if (z4 || zZzx) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                zzcjVar.zzd(6, z8);
                if (!zZzo || (!(z4 || !z20 || z19) || zZzx)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                zzcjVar.zzd(7, z9);
                if (z5 || zZzx) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zzcjVar.zzd(8, z10);
                if (!zZzo || (!(z5 || (z20 && z6)) || zZzx)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                zzcjVar.zzd(9, z11);
                zzcjVar.zzd(10, z21);
                if (z19 || zZzx) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                zzcjVar.zzd(11, z12);
                if (z19 || zZzx) {
                    i7 = 12;
                    z13 = false;
                } else {
                    i7 = 12;
                    z13 = true;
                }
                zzcjVar.zzd(i7, z13);
                zzclVarZze = zzcjVar.zze();
                this.zzH = zzclVarZze;
                if (!zzclVarZze.equals(zzclVar)) {
                    this.zzl.zzd(13, new zzem() { // from class: com.google.android.gms.internal.ads.zzje
                        @Override // com.google.android.gms.internal.ads.zzem
                        public final void zza(Object obj7) {
                            this.zza.zzV((zzcm) obj7);
                        }
                    });
                }
                this.zzl.zzc();
                if (zzlgVar2.zzo != zzlgVar.zzo) {
                    it = this.zzm.iterator();
                    while (it.hasNext()) {
                        ((zzim) it.next()).zza(zzlgVar.zzo);
                    }
                }
            }
            zzclVar = zzclVar2;
            j2 = 0;
            zzcwVarZzn3 = zzmVar.zzn();
            if (zzcwVarZzn3.zzo()) {
                z6 = false;
            } else {
                z6 = false;
            }
            zZzo = zzcpVar.zzn().zzo();
            zzcj zzcjVar2 = new zzcj();
            zzcjVar2.zzb(zzclVar3);
            boolean z22 = !zZzx;
            zzcjVar2.zzd(4, z22);
            if (z19) {
                z7 = false;
            } else {
                z7 = false;
            }
            zzcjVar2.zzd(5, z7);
            if (z4) {
                z8 = false;
            } else {
                z8 = false;
            }
            zzcjVar2.zzd(6, z8);
            if (zZzo) {
                z9 = false;
            } else {
                z9 = false;
            }
            zzcjVar2.zzd(7, z9);
            if (z5) {
                z10 = false;
            } else {
                z10 = false;
            }
            zzcjVar2.zzd(8, z10);
            if (zZzo) {
                z11 = false;
            } else {
                z11 = false;
            }
            zzcjVar2.zzd(9, z11);
            zzcjVar2.zzd(10, z22);
            if (z19) {
                z12 = false;
            } else {
                z12 = false;
            }
            zzcjVar2.zzd(11, z12);
            if (z19) {
                i7 = 12;
                z13 = false;
            } else {
                i7 = 12;
                z13 = false;
            }
            zzcjVar2.zzd(i7, z13);
            zzclVarZze = zzcjVar2.zze();
            this.zzH = zzclVarZze;
            if (!zzclVarZze.equals(zzclVar)) {
                this.zzl.zzd(13, new zzem() { // from class: com.google.android.gms.internal.ads.zzje
                    @Override // com.google.android.gms.internal.ads.zzem
                    public final void zza(Object obj7) {
                        this.zza.zzV((zzcm) obj7);
                    }
                });
            }
            this.zzl.zzc();
            if (zzlgVar2.zzo != zzlgVar.zzo) {
                it = this.zzm.iterator();
                while (it.hasNext()) {
                    ((zzim) it.next()).zza(zzlgVar.zzo);
                }
            }
        }
        i6 = -1;
        z3 = false;
        r10 = z3;
        zzcwVarZzn = zzmVar.zzn();
        if (zzcwVarZzn.zzo()) {
            z5 = false;
        } else {
            iZzd = zzmVar.zzd();
            zzmVar.zzh();
            zzmVar.zzw();
            if (zzcwVarZzn.zzj(iZzd, r10, r10) != i6) {
                z5 = true;
            } else {
                z5 = false;
            }
        }
        zzcwVarZzn2 = zzmVar.zzn();
        if (!zzcwVarZzn2.zzo()) {
            zzclVar = zzclVar2;
            j2 = 0;
            if (zzcwVarZzn2.zze(zzmVar.zzd(), zzmVar.zza, 0L).zzb()) {
            }
            zzcwVarZzn3 = zzmVar.zzn();
            if (zzcwVarZzn3.zzo()) {
                z6 = false;
            } else {
                z6 = false;
            }
            zZzo = zzcpVar.zzn().zzo();
            zzcj zzcjVar3 = new zzcj();
            zzcjVar3.zzb(zzclVar3);
            boolean z23 = !zZzx;
            zzcjVar3.zzd(4, z23);
            if (z19) {
                z7 = false;
            } else {
                z7 = false;
            }
            zzcjVar3.zzd(5, z7);
            if (z4) {
                z8 = false;
            } else {
                z8 = false;
            }
            zzcjVar3.zzd(6, z8);
            if (zZzo) {
                z9 = false;
            } else {
                z9 = false;
            }
            zzcjVar3.zzd(7, z9);
            if (z5) {
                z10 = false;
            } else {
                z10 = false;
            }
            zzcjVar3.zzd(8, z10);
            if (zZzo) {
                z11 = false;
            } else {
                z11 = false;
            }
            zzcjVar3.zzd(9, z11);
            zzcjVar3.zzd(10, z23);
            if (z19) {
                z12 = false;
            } else {
                z12 = false;
            }
            zzcjVar3.zzd(11, z12);
            if (z19) {
                i7 = 12;
                z13 = false;
            } else {
                i7 = 12;
                z13 = false;
            }
            zzcjVar3.zzd(i7, z13);
            zzclVarZze = zzcjVar3.zze();
            this.zzH = zzclVarZze;
            if (!zzclVarZze.equals(zzclVar)) {
                this.zzl.zzd(13, new zzem() { // from class: com.google.android.gms.internal.ads.zzje
                    @Override // com.google.android.gms.internal.ads.zzem
                    public final void zza(Object obj7) {
                        this.zza.zzV((zzcm) obj7);
                    }
                });
            }
            this.zzl.zzc();
            if (zzlgVar2.zzo != zzlgVar.zzo) {
                it = this.zzm.iterator();
                while (it.hasNext()) {
                    ((zzim) it.next()).zza(zzlgVar.zzo);
                }
            }
        }
        zzclVar = zzclVar2;
        j2 = 0;
        zzcwVarZzn3 = zzmVar.zzn();
        if (zzcwVarZzn3.zzo()) {
            z6 = false;
        } else {
            z6 = false;
        }
        zZzo = zzcpVar.zzn().zzo();
        zzcj zzcjVar4 = new zzcj();
        zzcjVar4.zzb(zzclVar3);
        boolean z24 = !zZzx;
        zzcjVar4.zzd(4, z24);
        if (z19) {
            z7 = false;
        } else {
            z7 = false;
        }
        zzcjVar4.zzd(5, z7);
        if (z4) {
            z8 = false;
        } else {
            z8 = false;
        }
        zzcjVar4.zzd(6, z8);
        if (zZzo) {
            z9 = false;
        } else {
            z9 = false;
        }
        zzcjVar4.zzd(7, z9);
        if (z5) {
            z10 = false;
        } else {
            z10 = false;
        }
        zzcjVar4.zzd(8, z10);
        if (zZzo) {
            z11 = false;
        } else {
            z11 = false;
        }
        zzcjVar4.zzd(9, z11);
        zzcjVar4.zzd(10, z24);
        if (z19) {
            z12 = false;
        } else {
            z12 = false;
        }
        zzcjVar4.zzd(11, z12);
        if (z19) {
            i7 = 12;
            z13 = false;
        } else {
            i7 = 12;
            z13 = false;
        }
        zzcjVar4.zzd(i7, z13);
        zzclVarZze = zzcjVar4.zze();
        this.zzH = zzclVarZze;
        if (!zzclVarZze.equals(zzclVar)) {
            this.zzl.zzd(13, new zzem() { // from class: com.google.android.gms.internal.ads.zzje
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj7) {
                    this.zza.zzV((zzcm) obj7);
                }
            });
        }
        this.zzl.zzc();
        if (zzlgVar2.zzo != zzlgVar.zzo) {
            it = this.zzm.iterator();
            while (it.hasNext()) {
                ((zzim) it.next()).zza(zzlgVar.zzo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzan() {
        int iZzf = zzf();
        if (iZzf == 2 || iZzf == 3) {
            zzao();
            boolean z = this.zzad.zzo;
            zzv();
            zzv();
        }
    }

    private final void zzao() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (this.zzY) {
                throw new IllegalStateException(str);
            }
            zzes.zzg("ExoPlayerImpl", str, this.zzZ ? null : new IllegalStateException());
            this.zzZ = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzA(zzma zzmaVar) {
        zzao();
        this.zzr.zzO(zzmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzB(zztu zztuVar) {
        zzao();
        List listSingletonList = Collections.singletonList(zztuVar);
        zzao();
        zzao();
        zzX(this.zzad);
        zzk();
        this.zzC++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzah = this.zzah.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            zzld zzldVar = new zzld((zztu) listSingletonList.get(i2), this.zzp);
            arrayList.add(zzldVar);
            this.zzo.add(i2, new zzka(zzldVar.zzb, zzldVar.zza));
        }
        this.zzah = this.zzah.zzg(0, arrayList.size());
        zzll zzllVar = new zzll(this.zzo, this.zzah);
        if (!zzllVar.zzo() && zzllVar.zzc() < 0) {
            throw new zzan(zzllVar, -1, -9223372036854775807L);
        }
        int iZzg = zzllVar.zzg(false);
        zzlg zzlgVarZzae = zzae(this.zzad, zzllVar, zzad(zzllVar, iZzg, -9223372036854775807L));
        int i3 = zzlgVarZzae.zze;
        if (iZzg != -1 && i3 != 1) {
            i3 = 4;
            if (!zzllVar.zzo() && iZzg < zzllVar.zzc()) {
                i3 = 2;
            }
        }
        zzlg zzlgVarZzg = zzlgVarZzae.zzg(i3);
        this.zzk.zzq(arrayList, iZzg, zzfk.zzp(-9223372036854775807L), this.zzah);
        zzam(zzlgVarZzg, 0, 1, (this.zzad.zzb.zza.equals(zzlgVarZzg.zzb.zza) || this.zzad.zza.zzo()) ? false : true, 4, zzaa(zzlgVarZzg), -1, false);
    }

    public final zzil zzE() {
        zzao();
        return this.zzad.zzf;
    }

    final /* synthetic */ void zzT(zzkj zzkjVar) {
        long j;
        boolean z;
        int i = this.zzC - zzkjVar.zzb;
        this.zzC = i;
        boolean z2 = true;
        if (zzkjVar.zzc) {
            this.zzD = zzkjVar.zzd;
            this.zzE = true;
        }
        if (zzkjVar.zze) {
            this.zzF = zzkjVar.zzf;
        }
        if (i == 0) {
            zzcw zzcwVar = zzkjVar.zza.zza;
            if (!this.zzad.zza.zzo() && zzcwVar.zzo()) {
                this.zzae = -1;
                this.zzaf = 0L;
            }
            if (!zzcwVar.zzo()) {
                List listZzw = ((zzll) zzcwVar).zzw();
                zzdy.zzf(listZzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < listZzw.size(); i2++) {
                    ((zzka) this.zzo.get(i2)).zzc((zzcw) listZzw.get(i2));
                }
            }
            if (this.zzE) {
                if (zzkjVar.zza.zzb.equals(this.zzad.zzb) && zzkjVar.zza.zzd == this.zzad.zzr) {
                    z2 = false;
                }
                if (!z2) {
                    j = -9223372036854775807L;
                } else if (zzcwVar.zzo() || zzkjVar.zza.zzb.zzb()) {
                    j = zzkjVar.zza.zzd;
                } else {
                    zzlg zzlgVar = zzkjVar.zza;
                    zzts zztsVar = zzlgVar.zzb;
                    j = zzlgVar.zzd;
                    zzac(zzcwVar, zztsVar, j);
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzE = false;
            zzam(zzkjVar.zza, 1, this.zzF, z, this.zzD, j, -1, false);
        }
    }

    final /* synthetic */ void zzU(final zzkj zzkjVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzT(zzkjVar);
            }
        });
    }

    final /* synthetic */ void zzV(zzcm zzcmVar) {
        zzcmVar.zza(this.zzH);
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i, long j, int i2, boolean z) {
        zzao();
        zzdy.zzd(i >= 0);
        this.zzr.zzu();
        zzcw zzcwVar = this.zzad.zza;
        if (zzcwVar.zzo() || i < zzcwVar.zzc()) {
            this.zzC++;
            if (zzx()) {
                zzes.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkj zzkjVar = new zzkj(this.zzad);
                zzkjVar.zza(1);
                this.zzag.zza.zzU(zzkjVar);
                return;
            }
            zzlg zzlgVarZzg = this.zzad;
            int i3 = zzlgVarZzg.zze;
            if (i3 == 3 || (i3 == 4 && !zzcwVar.zzo())) {
                zzlgVarZzg = this.zzad.zzg(2);
            }
            int iZzd = zzd();
            zzlg zzlgVarZzae = zzae(zzlgVarZzg, zzcwVar, zzad(zzcwVar, i, j));
            this.zzk.zzl(zzcwVar, i, zzfk.zzp(j));
            zzam(zzlgVarZzae, 0, 1, true, 1, zzaa(zzlgVarZzae), iZzd, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzb() {
        zzao();
        if (zzx()) {
            return this.zzad.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzc() {
        zzao();
        if (zzx()) {
            return this.zzad.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzd() {
        zzao();
        int iZzX = zzX(this.zzad);
        if (iZzX == -1) {
            return 0;
        }
        return iZzX;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zze() {
        zzao();
        if (this.zzad.zza.zzo()) {
            return 0;
        }
        zzlg zzlgVar = this.zzad;
        return zzlgVar.zza.zza(zzlgVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzf() {
        zzao();
        return this.zzad.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzg() {
        zzao();
        return this.zzad.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzh() {
        zzao();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzi() {
        zzao();
        if (zzx()) {
            zzlg zzlgVar = this.zzad;
            return zzlgVar.zzk.equals(zzlgVar.zzb) ? zzfk.zzr(this.zzad.zzp) : zzl();
        }
        zzao();
        if (this.zzad.zza.zzo()) {
            return this.zzaf;
        }
        zzlg zzlgVar2 = this.zzad;
        long j = 0;
        if (zzlgVar2.zzk.zzd != zzlgVar2.zzb.zzd) {
            return zzfk.zzr(zzlgVar2.zza.zze(zzd(), this.zza, 0L).zzo);
        }
        long j2 = zzlgVar2.zzp;
        if (this.zzad.zzk.zzb()) {
            zzlg zzlgVar3 = this.zzad;
            zzlgVar3.zza.zzn(zzlgVar3.zzk.zza, this.zzn).zzi(this.zzad.zzk.zzb);
        } else {
            j = j2;
        }
        zzlg zzlgVar4 = this.zzad;
        zzac(zzlgVar4.zza, zzlgVar4.zzk, j);
        return zzfk.zzr(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzj() {
        zzao();
        return zzZ(this.zzad);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzk() {
        zzao();
        return zzfk.zzr(zzaa(this.zzad));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzl() {
        zzao();
        if (zzx()) {
            zzlg zzlgVar = this.zzad;
            zzts zztsVar = zzlgVar.zzb;
            zzlgVar.zza.zzn(zztsVar.zza, this.zzn);
            return zzfk.zzr(this.zzn.zzh(zztsVar.zzb, zztsVar.zzc));
        }
        zzcw zzcwVarZzn = zzn();
        if (zzcwVarZzn.zzo()) {
            return -9223372036854775807L;
        }
        return zzfk.zzr(zzcwVarZzn.zze(zzd(), this.zza, 0L).zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzm() {
        zzao();
        return zzfk.zzr(this.zzad.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcw zzn() {
        zzao();
        return this.zzad.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzdh zzo() {
        zzao();
        return this.zzad.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        zzao();
        boolean zZzv = zzv();
        int iZzb = this.zzy.zzb(zZzv, 2);
        zzal(zZzv, iZzb, zzY(zZzv, iZzb));
        zzlg zzlgVar = this.zzad;
        if (zzlgVar.zze != 1) {
            return;
        }
        zzlg zzlgVarZzf = zzlgVar.zzf(null);
        zzlg zzlgVarZzg = zzlgVarZzf.zzg(true == zzlgVarZzf.zza.zzo() ? 4 : 2);
        this.zzC++;
        this.zzk.zzk();
        zzam(zzlgVarZzg, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzq() {
        AudioTrack audioTrack;
        zzes.zze("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.1.0] [" + zzfk.zze + "] [" + zzbq.zza() + "]");
        zzao();
        if (zzfk.zza < 21 && (audioTrack = this.zzM) != null) {
            audioTrack.release();
            this.zzM = null;
        }
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzep zzepVar = this.zzl;
            zzepVar.zzd(10, new zzem() { // from class: com.google.android.gms.internal.ads.zzji
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj) {
                    ((zzcm) obj).zzj(zzil.zzd(new zzkm(1), PointerIconCompat.TYPE_HELP));
                }
            });
            zzepVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        zzlg zzlgVar = this.zzad;
        if (zzlgVar.zzo) {
            this.zzad = zzlgVar.zzb();
        }
        zzlg zzlgVarZzg = this.zzad.zzg(1);
        this.zzad = zzlgVarZzg;
        zzlg zzlgVarZzc = zzlgVarZzg.zzc(zzlgVarZzg.zzb);
        this.zzad = zzlgVarZzc;
        zzlgVarZzc.zzp = zzlgVarZzc.zzr;
        this.zzad.zzq = 0L;
        this.zzr.zzN();
        this.zzi.zzi();
        Surface surface = this.zzO;
        if (surface != null) {
            surface.release();
            this.zzO = null;
        }
        this.zzX = zzdx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzr(boolean z) {
        zzao();
        int iZzb = this.zzy.zzb(z, zzf());
        zzal(z, iZzb, zzY(z, iZzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzs(Surface surface) {
        zzao();
        zzaj(surface);
        int i = surface == null ? 0 : -1;
        zzag(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzt(float f) {
        zzao();
        final float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzV == fMax) {
            return;
        }
        this.zzV = fMax;
        zzai();
        zzep zzepVar = this.zzl;
        zzepVar.zzd(22, new zzem() { // from class: com.google.android.gms.internal.ads.zzjk
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                float f2 = fMax;
                int i = zzkb.zzd;
                ((zzcm) obj).zzs(f2);
            }
        });
        zzepVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzu() {
        zzao();
        this.zzy.zzb(zzv(), 1);
        zzak(null);
        this.zzX = new zzdx(zzfud.zzl(), this.zzad.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzv() {
        zzao();
        return this.zzad.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzw() {
        zzao();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzx() {
        zzao();
        return this.zzad.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final int zzy() {
        zzao();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzz(zzma zzmaVar) {
        this.zzr.zzt(zzmaVar);
    }
}
