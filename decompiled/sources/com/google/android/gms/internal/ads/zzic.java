package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzic implements zzln, zzlp {
    private final int zzb;
    private zzlq zzd;
    private int zze;
    private zzoh zzf;
    private zzdz zzg;
    private int zzh;
    private zzvj zzi;
    private zzam[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzlo zzp;
    private final Object zza = new Object();
    private final zzkn zzc = new zzkn();
    private long zzm = Long.MIN_VALUE;

    public zzic(int i) {
        this.zzb = i;
    }

    private final void zzV(long j, boolean z) throws zzil {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        zzy(j, z);
    }

    protected void zzA() throws zzil {
    }

    protected void zzB() {
    }

    protected void zzC(zzam[] zzamVarArr, long j, long j2) throws zzil {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzD() {
        zzdy.zzf(this.zzh == 0);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzE(zzam[] zzamVarArr, zzvj zzvjVar, long j, long j2) throws zzil {
        zzdy.zzf(!this.zzn);
        this.zzi = zzvjVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzamVarArr;
        this.zzk = j2;
        zzC(zzamVarArr, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzF() {
        zzdy.zzf(this.zzh == 0);
        zzkn zzknVar = this.zzc;
        zzknVar.zzb = null;
        zzknVar.zza = null;
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzG(long j) throws zzil {
        zzV(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzH() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzI(zzlo zzloVar) {
        synchronized (this.zza) {
            this.zzp = zzloVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public /* synthetic */ void zzJ(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzK() throws zzil {
        zzdy.zzf(this.zzh == 1);
        this.zzh = 2;
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzL() {
        zzdy.zzf(this.zzh == 2);
        this.zzh = 1;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final boolean zzM() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final boolean zzN() {
        return this.zzn;
    }

    protected final zzam[] zzP() {
        zzam[] zzamVarArr = this.zzj;
        zzamVarArr.getClass();
        return zzamVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlp
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final int zzbc() {
        return this.zzh;
    }

    protected final int zzbd(zzkn zzknVar, zzht zzhtVar, int i) {
        zzvj zzvjVar = this.zzi;
        zzvjVar.getClass();
        int iZza = zzvjVar.zza(zzknVar, zzhtVar, i);
        if (iZza == -4) {
            if (zzhtVar.zzg()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzhtVar.zzd + this.zzk;
            zzhtVar.zzd = j;
            this.zzm = Math.max(this.zzm, j);
        } else if (iZza == -5) {
            zzam zzamVar = zzknVar.zza;
            zzamVar.getClass();
            long j2 = zzamVar.zzq;
            if (j2 != Long.MAX_VALUE) {
                zzak zzakVarZzb = zzamVar.zzb();
                zzakVarZzb.zzW(j2 + this.zzk);
                zzknVar.zza = zzakVarZzb.zzY();
                return -5;
            }
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final long zzbe() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public int zze() throws zzil {
        return 0;
    }

    protected final long zzf() {
        return this.zzl;
    }

    protected final zzdz zzh() {
        zzdz zzdzVar = this.zzg;
        zzdzVar.getClass();
        return zzdzVar;
    }

    protected final zzil zzi(Throwable th, zzam zzamVar, boolean z, int i) {
        int i2;
        if (zzamVar == null || this.zzo) {
            i2 = 4;
        } else {
            this.zzo = true;
            try {
                int iZzU = zzU(zzamVar) & 7;
                this.zzo = false;
                i2 = iZzU;
            } catch (zzil unused) {
                this.zzo = false;
                i2 = 4;
            } catch (Throwable th2) {
                this.zzo = false;
                throw th2;
            }
        }
        return zzil.zzb(th, zzQ(), this.zze, zzamVar, i2, z, i);
    }

    protected final zzkn zzj() {
        zzkn zzknVar = this.zzc;
        zzknVar.zzb = null;
        zzknVar.zza = null;
        return zzknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public zzkp zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final zzlp zzl() {
        return this;
    }

    protected final zzlq zzm() {
        zzlq zzlqVar = this.zzd;
        zzlqVar.getClass();
        return zzlqVar;
    }

    protected final zzoh zzn() {
        zzoh zzohVar = this.zzf;
        zzohVar.getClass();
        return zzohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final zzvj zzo() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzp() {
        synchronized (this.zza) {
            this.zzp = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzq() {
        zzdy.zzf(this.zzh == 1);
        zzkn zzknVar = this.zzc;
        zzknVar.zzb = null;
        zzknVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzr(zzlq zzlqVar, zzam[] zzamVarArr, zzvj zzvjVar, long j, boolean z, boolean z2, long j2, long j3) throws zzil {
        zzdy.zzf(this.zzh == 0);
        this.zzd = zzlqVar;
        this.zzh = 1;
        zzx(z, z2);
        zzE(zzamVarArr, zzvjVar, j2, j3);
        zzV(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public /* synthetic */ void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public void zzt(int i, Object obj) throws zzil {
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzu(int i, zzoh zzohVar, zzdz zzdzVar) {
        this.zze = i;
        this.zzf = zzohVar;
        this.zzg = zzdzVar;
    }

    protected void zzw() {
        throw null;
    }

    protected void zzx(boolean z, boolean z2) throws zzil {
    }

    protected void zzy(long j, boolean z) throws zzil {
        throw null;
    }

    protected void zzz() {
    }

    protected final boolean zzO() {
        if (zzM()) {
            return this.zzn;
        }
        zzvj zzvjVar = this.zzi;
        zzvjVar.getClass();
        return zzvjVar.zze();
    }

    protected final int zzd(long j) {
        zzvj zzvjVar = this.zzi;
        zzvjVar.getClass();
        return zzvjVar.zzb(j - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzv() throws IOException {
        zzvj zzvjVar = this.zzi;
        zzvjVar.getClass();
        zzvjVar.zzd();
    }
}
