package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.mrgames.larvaheroesfree.network.GpTouchConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzuv implements zztq, zzabe, zzxz, zzye, zzvh {
    private static final Map zzb;
    private static final zzam zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzxy zzM;
    private final zzxu zzN;
    private final Uri zzd;
    private final zzgi zze;
    private final zzqz zzf;
    private final zzub zzg;
    private final zzqt zzh;
    private final zzur zzi;
    private final long zzj;
    private final zzul zzl;
    private zztp zzq;
    private zzaeb zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zzuu zzx;
    private zzaca zzy;
    private final zzyh zzk = new zzyh("ProgressiveMediaPeriod");
    private final zzeb zzm = new zzeb(zzdz.zza);
    private final Runnable zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzum
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzT();
        }
    };
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzun
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzD();
        }
    };
    private final Handler zzp = zzfk.zzu(null);
    private zzut[] zzt = new zzut[0];
    private zzvi[] zzs = new zzvi[0];
    private long zzH = -9223372036854775807L;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzak zzakVar = new zzak();
        zzakVar.zzH("icy");
        zzakVar.zzS("application/x-icy");
        zzc = zzakVar.zzY();
    }

    public zzuv(Uri uri, zzgi zzgiVar, zzul zzulVar, zzqz zzqzVar, zzqt zzqtVar, zzxy zzxyVar, zzub zzubVar, zzur zzurVar, zzxu zzxuVar, String str, int i) {
        this.zzd = uri;
        this.zze = zzgiVar;
        this.zzf = zzqzVar;
        this.zzh = zzqtVar;
        this.zzM = zzxyVar;
        this.zzg = zzubVar;
        this.zzi = zzurVar;
        this.zzN = zzxuVar;
        this.zzj = i;
        this.zzl = zzulVar;
    }

    static /* bridge */ /* synthetic */ void zzB(final zzuv zzuvVar) {
        zzuvVar.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzuo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzE();
            }
        });
    }

    private final int zzP() {
        int iZzc = 0;
        for (zzvi zzviVar : this.zzs) {
            iZzc += zzviVar.zzc();
        }
        return iZzc;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final long zzQ(boolean z) {
        int i = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzvi[] zzviVarArr = this.zzs;
            if (i >= zzviVarArr.length) {
                return jMax;
            }
            if (z) {
                jMax = Math.max(jMax, zzviVarArr[i].zzg());
            } else {
                zzuu zzuuVar = this.zzx;
                zzuuVar.getClass();
                if (zzuuVar.zzc[i]) {
                    jMax = Math.max(jMax, zzviVarArr[i].zzg());
                }
            }
            i++;
        }
    }

    private final zzace zzR(zzut zzutVar) {
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            if (zzutVar.equals(this.zzt[i])) {
                return this.zzs[i];
            }
        }
        zzvi zzviVar = new zzvi(this.zzN, this.zzf, this.zzh);
        zzviVar.zzu(this);
        int i2 = length + 1;
        zzut[] zzutVarArr = (zzut[]) Arrays.copyOf(this.zzt, i2);
        zzutVarArr[length] = zzutVar;
        int i3 = zzfk.zza;
        this.zzt = zzutVarArr;
        zzvi[] zzviVarArr = (zzvi[]) Arrays.copyOf(this.zzs, i2);
        zzviVarArr[length] = zzviVar;
        this.zzs = zzviVarArr;
        return zzviVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzS() {
        zzdy.zzf(this.zzv);
        this.zzx.getClass();
        this.zzy.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        int i;
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zzvi zzviVar : this.zzs) {
            if (zzviVar.zzh() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzs.length;
        zzcy[] zzcyVarArr = new zzcy[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzam zzamVarZzh = this.zzs[i2].zzh();
            zzamVarZzh.getClass();
            String str = zzamVarZzh.zzm;
            boolean zZzf = zzcc.zzf(str);
            boolean z = zZzf || zzcc.zzg(str);
            zArr[i2] = z;
            this.zzw = z | this.zzw;
            zzaeb zzaebVar = this.zzr;
            if (zzaebVar != null) {
                if (zZzf || this.zzt[i2].zzb) {
                    zzbz zzbzVar = zzamVarZzh.zzk;
                    zzbz zzbzVar2 = zzbzVar == null ? new zzbz(-9223372036854775807L, zzaebVar) : zzbzVar.zzc(zzaebVar);
                    zzak zzakVarZzb = zzamVarZzh.zzb();
                    zzakVarZzb.zzM(zzbzVar2);
                    zzamVarZzh = zzakVarZzb.zzY();
                }
                if (zZzf && zzamVarZzh.zzg == -1 && zzamVarZzh.zzh == -1 && (i = zzaebVar.zza) != -1) {
                    zzak zzakVarZzb2 = zzamVarZzh.zzb();
                    zzakVarZzb2.zzv(i);
                    zzamVarZzh = zzakVarZzb2.zzY();
                }
            }
            zzcyVarArr[i2] = new zzcy(Integer.toString(i2), zzamVarZzh.zzc(this.zzf.zza(zzamVarZzh)));
        }
        this.zzx = new zzuu(new zzvs(zzcyVarArr), zArr);
        this.zzv = true;
        zztp zztpVar = this.zzq;
        zztpVar.getClass();
        zztpVar.zzi(this);
    }

    private final void zzU(int i) {
        zzS();
        zzuu zzuuVar = this.zzx;
        boolean[] zArr = zzuuVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzam zzamVarZzb = zzuuVar.zza.zzb(i).zzb(0);
        this.zzg.zzc(new zzto(1, zzcc.zzb(zzamVarZzb.zzm), zzamVarZzb, 0, null, zzfk.zzr(this.zzG), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzV(int i) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i] && !this.zzs[i].zzx(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zzvi zzviVar : this.zzs) {
                zzviVar.zzp(false);
            }
            zztp zztpVar = this.zzq;
            zztpVar.getClass();
            zztpVar.zzg(this);
        }
    }

    private final void zzW() {
        zzuq zzuqVar = new zzuq(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzdy.zzf(zzX());
            long j = this.zzz;
            if (j != -9223372036854775807L && this.zzH > j) {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
            zzaca zzacaVar = this.zzy;
            zzacaVar.getClass();
            zzuq.zzf(zzuqVar, zzacaVar.zzg(this.zzH).zza.zzc, this.zzH);
            for (zzvi zzviVar : this.zzs) {
                zzviVar.zzt(this.zzH);
            }
            this.zzH = -9223372036854775807L;
        }
        this.zzJ = zzP();
        long jZza = this.zzk.zza(zzuqVar, this, zzxy.zza(this.zzB));
        zzgn zzgnVar = zzuqVar.zzl;
        this.zzg.zzg(new zztj(zzuqVar.zzb, zzgnVar, zzgnVar.zza, Collections.emptyMap(), jZza, 0L, 0L), new zzto(1, -1, null, 0, null, zzfk.zzr(zzuqVar.zzk), zzfk.zzr(this.zzz)));
    }

    private final boolean zzX() {
        return this.zzH != -9223372036854775807L;
    }

    private final boolean zzY() {
        return this.zzD || zzX();
    }

    static /* bridge */ /* synthetic */ long zzq(zzuv zzuvVar, boolean z) {
        return zzuvVar.zzQ(true);
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final void zzC() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    final /* synthetic */ void zzE() {
        this.zzF = true;
    }

    final void zzG() throws IOException {
        this.zzk.zzi(zzxy.zza(this.zzB));
    }

    final void zzH(int i) throws IOException {
        this.zzs[i].zzm();
        zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final /* bridge */ /* synthetic */ void zzI(zzyd zzydVar, long j, long j2, boolean z) {
        zzuq zzuqVar = (zzuq) zzydVar;
        zzhj zzhjVar = zzuqVar.zzd;
        zztj zztjVar = new zztj(zzuqVar.zzb, zzuqVar.zzl, zzhjVar.zzh(), zzhjVar.zzi(), j, j2, zzhjVar.zzg());
        long unused = zzuqVar.zzb;
        this.zzg.zzd(zztjVar, new zzto(1, -1, null, 0, null, zzfk.zzr(zzuqVar.zzk), zzfk.zzr(this.zzz)));
        if (z) {
            return;
        }
        for (zzvi zzviVar : this.zzs) {
            zzviVar.zzp(false);
        }
        if (this.zzE > 0) {
            zztp zztpVar = this.zzq;
            zztpVar.getClass();
            zztpVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final /* bridge */ /* synthetic */ void zzJ(zzyd zzydVar, long j, long j2) {
        zzaca zzacaVar;
        if (this.zzz == -9223372036854775807L && (zzacaVar = this.zzy) != null) {
            boolean zZzh = zzacaVar.zzh();
            long jZzQ = zzQ(true);
            long j3 = jZzQ == Long.MIN_VALUE ? 0L : jZzQ + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzz = j3;
            this.zzi.zza(j3, zZzh, this.zzA);
        }
        zzuq zzuqVar = (zzuq) zzydVar;
        zzhj zzhjVar = zzuqVar.zzd;
        zztj zztjVar = new zztj(zzuqVar.zzb, zzuqVar.zzl, zzhjVar.zzh(), zzhjVar.zzi(), j, j2, zzhjVar.zzg());
        long unused = zzuqVar.zzb;
        this.zzg.zze(zztjVar, new zzto(1, -1, null, 0, null, zzfk.zzr(zzuqVar.zzk), zzfk.zzr(this.zzz)));
        this.zzK = true;
        zztp zztpVar = this.zzq;
        zztpVar.getClass();
        zztpVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzK() {
        for (zzvi zzviVar : this.zzs) {
            zzviVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final void zzL(zzam zzamVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzM() {
        if (this.zzv) {
            for (zzvi zzviVar : this.zzs) {
                zzviVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final void zzN(final zzaca zzacaVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzup
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzF(zzacaVar);
            }
        });
    }

    final boolean zzO(int i) {
        return !zzY() && this.zzs[i].zzx(this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zza(long j, zzlr zzlrVar) {
        zzS();
        if (!this.zzy.zzh()) {
            return 0L;
        }
        zzaby zzabyVarZzg = this.zzy.zzg(j);
        long j2 = zzabyVarZzg.zza.zzb;
        long j3 = zzabyVarZzg.zzb.zzb;
        long j4 = zzlrVar.zzf;
        if (j4 == 0) {
            if (zzlrVar.zzg == 0) {
                return j;
            }
            j4 = 0;
        }
        int i = zzfk.zza;
        long j5 = j - j4;
        long j6 = zzlrVar.zzg;
        long j7 = j + j6;
        long j8 = j ^ j7;
        long j9 = j6 ^ j7;
        if (((j4 ^ j) & (j ^ j5)) < 0) {
            j5 = Long.MIN_VALUE;
        }
        if ((j8 & j9) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = j5 <= j2 && j2 <= j7;
        boolean z2 = j5 <= j3 && j3 <= j7;
        if (z && z2) {
            if (Math.abs(j2 - j) > Math.abs(j3 - j)) {
                return j3;
            }
        } else if (!z) {
            return z2 ? j3 : j5;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        long jZzQ;
        zzS();
        if (this.zzK || this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        if (zzX()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            jZzQ = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzuu zzuuVar = this.zzx;
                if (zzuuVar.zzb[i] && zzuuVar.zzc[i] && !this.zzs[i].zzw()) {
                    jZzQ = Math.min(jZzQ, this.zzs[i].zzg());
                }
            }
        } else {
            jZzQ = Long.MAX_VALUE;
        }
        if (jZzQ == Long.MAX_VALUE) {
            jZzQ = zzQ(false);
        }
        return jZzQ == Long.MIN_VALUE ? this.zzG : jZzQ;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        if (!this.zzD) {
            return -9223372036854775807L;
        }
        if (!this.zzK && zzP() <= this.zzJ) {
            return -9223372036854775807L;
        }
        this.zzD = false;
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zze(long j) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j = 0;
        }
        this.zzD = false;
        this.zzG = j;
        if (zzX()) {
            this.zzH = j;
            return j;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            for (int i = 0; i < length; i++) {
                if (this.zzs[i].zzy(j, false) || (!zArr[i] && this.zzw)) {
                }
            }
            return j;
        }
        this.zzI = false;
        this.zzH = j;
        this.zzK = false;
        zzyh zzyhVar = this.zzk;
        if (zzyhVar.zzl()) {
            for (zzvi zzviVar : this.zzs) {
                zzviVar.zzj();
            }
            this.zzk.zzg();
        } else {
            zzyhVar.zzh();
            for (zzvi zzviVar2 : this.zzs) {
                zzviVar2.zzp(false);
            }
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzf(zzxf[] zzxfVarArr, boolean[] zArr, zzvj[] zzvjVarArr, boolean[] zArr2, long j) {
        boolean z;
        zzxf zzxfVar;
        zzS();
        zzuu zzuuVar = this.zzx;
        zzvs zzvsVar = zzuuVar.zza;
        boolean[] zArr3 = zzuuVar.zzc;
        int i = this.zzE;
        int i2 = 0;
        for (int i3 = 0; i3 < zzxfVarArr.length; i3++) {
            zzvj zzvjVar = zzvjVarArr[i3];
            if (zzvjVar != null && (zzxfVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((zzus) zzvjVar).zzb;
                zzdy.zzf(zArr3[i4]);
                this.zzE--;
                zArr3[i4] = false;
                zzvjVarArr[i3] = null;
            }
        }
        if (this.zzC) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
        } else if (j != 0) {
            z = true;
        } else {
            j = 0;
            z = false;
        }
        for (int i5 = 0; i5 < zzxfVarArr.length; i5++) {
            if (zzvjVarArr[i5] == null && (zzxfVar = zzxfVarArr[i5]) != null) {
                zzdy.zzf(zzxfVar.zzc() == 1);
                zzdy.zzf(zzxfVar.zza(0) == 0);
                int iZza = zzvsVar.zza(zzxfVar.zze());
                zzdy.zzf(!zArr3[iZza]);
                this.zzE++;
                zArr3[iZza] = true;
                zzvjVarArr[i5] = new zzus(this, iZza);
                zArr2[i5] = true;
                if (!z) {
                    zzvi zzviVar = this.zzs[iZza];
                    z = (zzviVar.zza() == 0 || zzviVar.zzy(j, true)) ? false : true;
                }
            }
        }
        if (this.zzE == 0) {
            this.zzI = false;
            this.zzD = false;
            if (this.zzk.zzl()) {
                zzvi[] zzviVarArr = this.zzs;
                int length = zzviVarArr.length;
                while (i2 < length) {
                    zzviVarArr[i2].zzj();
                    i2++;
                }
                this.zzk.zzg();
            } else {
                for (zzvi zzviVar2 : this.zzs) {
                    zzviVar2.zzp(false);
                }
            }
        } else if (z) {
            j = zze(j);
            while (i2 < zzvjVarArr.length) {
                if (zzvjVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzC = true;
        return j;
    }

    final int zzg(int i, zzkn zzknVar, zzht zzhtVar, int i2) {
        if (zzY()) {
            return -3;
        }
        zzU(i);
        int iZzd = this.zzs[i].zzd(zzknVar, zzhtVar, i2, this.zzK);
        if (iZzd == -3) {
            zzV(i);
        }
        return iZzd;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final zzvs zzh() {
        zzS();
        return this.zzx.zza;
    }

    final int zzi(int i, long j) {
        if (zzY()) {
            return 0;
        }
        zzU(i);
        zzvi zzviVar = this.zzs[i];
        int iZzb = zzviVar.zzb(j, this.zzK);
        zzviVar.zzv(iZzb);
        if (iZzb != 0) {
            return iZzb;
        }
        zzV(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzj(long j, boolean z) {
        zzS();
        if (zzX()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            this.zzs[i].zzi(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzk() throws IOException {
        zzG();
        if (this.zzK && !this.zzv) {
            throw zzcd.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztpVar, long j) {
        this.zzq = zztpVar;
        this.zzm.zze();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzo(long j) {
        if (this.zzK || this.zzk.zzk() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zZze = this.zzm.zze();
        if (this.zzk.zzl()) {
            return zZze;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final /* bridge */ /* synthetic */ zzyb zzt(zzyd zzydVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        zzyb zzybVarZzb;
        zzaca zzacaVar;
        zzuq zzuqVar = (zzuq) zzydVar;
        zzhj zzhjVar = zzuqVar.zzd;
        zztj zztjVar = new zztj(zzuqVar.zzb, zzuqVar.zzl, zzhjVar.zzh(), zzhjVar.zzi(), j, j2, zzhjVar.zzg());
        long unused = zzuqVar.zzk;
        int i2 = zzfk.zza;
        if ((iOException instanceof zzcd) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzha) || (iOException instanceof zzyg)) {
            jMin = -9223372036854775807L;
            break;
        }
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, GpTouchConstants.SYNC_INTERVAL);
                break;
            }
            if ((cause instanceof zzgj) && ((zzgj) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzybVarZzb = zzyh.zzd;
        } else {
            int iZzP = zzP();
            boolean z = iZzP > this.zzJ;
            if (this.zzF || !((zzacaVar = this.zzy) == null || zzacaVar.zze() == -9223372036854775807L)) {
                this.zzJ = iZzP;
            } else {
                boolean z2 = this.zzv;
                if (!z2 || zzY()) {
                    this.zzD = z2;
                    this.zzG = 0L;
                    this.zzJ = 0;
                    for (zzvi zzviVar : this.zzs) {
                        zzviVar.zzp(false);
                    }
                    zzuq.zzf(zzuqVar, 0L, 0L);
                } else {
                    this.zzI = true;
                    zzybVarZzb = zzyh.zzc;
                }
            }
            zzybVarZzb = zzyh.zzb(z, jMin);
        }
        boolean zZzc = true ^ zzybVarZzb.zzc();
        this.zzg.zzf(zztjVar, new zzto(1, -1, null, 0, null, zzfk.zzr(zzuqVar.zzk), zzfk.zzr(this.zzz)), iOException, zZzc);
        if (zZzc) {
            long unused2 = zzuqVar.zzb;
        }
        return zzybVarZzb;
    }

    final zzace zzu() {
        return zzR(new zzut(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final zzace zzv(int i, int i2) {
        return zzR(new zzut(i, false));
    }

    final /* synthetic */ void zzD() {
        if (this.zzL) {
            return;
        }
        zztp zztpVar = this.zzq;
        zztpVar.getClass();
        zztpVar.zzg(this);
    }

    final /* synthetic */ void zzF(zzaca zzacaVar) {
        this.zzy = this.zzr == null ? zzacaVar : new zzabz(-9223372036854775807L, 0L);
        this.zzz = zzacaVar.zze();
        boolean z = false;
        if (!this.zzF && zzacaVar.zze() == -9223372036854775807L) {
            z = true;
        }
        this.zzA = z;
        this.zzB = true == z ? 7 : 1;
        this.zzi.zza(this.zzz, zzacaVar.zzh(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzT();
    }
}
