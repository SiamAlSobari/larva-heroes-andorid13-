package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import com.mrgames.larvaheroesfree.network.GpTouchConstants;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzny implements zzlx {
    private final zzdz zza;
    private final zzct zzb;
    private final zzcv zzc;
    private final zznx zzd;
    private final SparseArray zze;
    private zzep zzf;
    private zzcp zzg;
    private zzej zzh;
    private boolean zzi;

    public static /* synthetic */ void zzT(zzny zznyVar) {
        final zzly zzlyVarZzR = zznyVar.zzR();
        zznyVar.zzW(zzlyVarZzR, GpTouchConstants.GPTOUCH_IAP_TIMEOUT_EVENT, new zzem() { // from class: com.google.android.gms.internal.ads.zzmt
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
        zznyVar.zzf.zze();
    }

    private final zzly zzY(int i, zzts zztsVar) {
        zzcp zzcpVar = this.zzg;
        zzcpVar.getClass();
        if (zztsVar != null) {
            return this.zzd.zza(zztsVar) != null ? zzX(zztsVar) : zzS(zzcw.zza, i, zztsVar);
        }
        zzcw zzcwVarZzn = zzcpVar.zzn();
        if (i >= zzcwVarZzn.zzc()) {
            zzcwVarZzn = zzcw.zza;
        }
        return zzS(zzcwVarZzn, i, null);
    }

    private final zzly zzZ() {
        return zzX(this.zzd.zzd());
    }

    private final zzly zzaa() {
        return zzX(this.zzd.zze());
    }

    private final zzly zzab(zzcf zzcfVar) {
        zzbw zzbwVar;
        return (!(zzcfVar instanceof zzil) || (zzbwVar = ((zzil) zzcfVar).zzj) == null) ? zzR() : zzX(new zzts(zzbwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzA(final zzam zzamVar, final zzie zzieVar) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, PointerIconCompat.TYPE_VERTICAL_TEXT, new zzem() { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                ((zzma) obj).zze(zzlyVarZzaa, zzamVar, zzieVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzB(final long j) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, PointerIconCompat.TYPE_ALIAS, new zzem(j) { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzC(final Exception exc) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, new zzem() { // from class: com.google.android.gms.internal.ads.zzml
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzD(final int i, final long j, final long j2) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, PointerIconCompat.TYPE_COPY, new zzem(i, j, j2) { // from class: com.google.android.gms.internal.ads.zzme
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzE(final int i, final long j) {
        final zzly zzlyVarZzZ = zzZ();
        zzW(zzlyVarZzZ, PointerIconCompat.TYPE_ZOOM_IN, new zzem() { // from class: com.google.android.gms.internal.ads.zzmw
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                ((zzma) obj).zzh(zzlyVarZzZ, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzF(final Object obj, final long j) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, 26, new zzem() { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj2) {
                ((zzma) obj2).zzn(zzlyVarZzaa, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzG(final Exception exc) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, 1030, new zzem() { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzH(final String str, final long j, final long j2) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, new zzem(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzms
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzI(final String str) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, PointerIconCompat.TYPE_ZOOM_OUT, new zzem() { // from class: com.google.android.gms.internal.ads.zzmd
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzJ(final zzid zzidVar) {
        final zzly zzlyVarZzZ = zzZ();
        zzW(zzlyVarZzZ, PointerIconCompat.TYPE_GRAB, new zzem() { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                ((zzma) obj).zzo(zzlyVarZzZ, zzidVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzK(final zzid zzidVar) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, new zzem() { // from class: com.google.android.gms.internal.ads.zzmx
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzL(final long j, final int i) {
        final zzly zzlyVarZzZ = zzZ();
        zzW(zzlyVarZzZ, PointerIconCompat.TYPE_GRABBING, new zzem(j, i) { // from class: com.google.android.gms.internal.ads.zzmn
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzM(final zzam zzamVar, final zzie zzieVar) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new zzem() { // from class: com.google.android.gms.internal.ads.zzmc
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                ((zzma) obj).zzp(zzlyVarZzaa, zzamVar, zzieVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzN() {
        zzej zzejVar = this.zzh;
        zzdy.zzb(zzejVar);
        zzejVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zznn
            @Override // java.lang.Runnable
            public final void run() {
                zzny.zzT(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzO(zzma zzmaVar) {
        this.zzf.zzf(zzmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzP(final zzcp zzcpVar, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzb.isEmpty()) {
            z = false;
        }
        zzdy.zzf(z);
        zzcpVar.getClass();
        this.zzg = zzcpVar;
        this.zzh = this.zza.zzb(looper, null);
        this.zzf = this.zzf.zza(looper, new zzen() { // from class: com.google.android.gms.internal.ads.zzmr
            @Override // com.google.android.gms.internal.ads.zzen
            public final void zza(Object obj, zzah zzahVar) {
                this.zza.zzU(zzcpVar, (zzma) obj, zzahVar);
            }
        });
    }

    protected final zzly zzR() {
        return zzX(this.zzd.zzb());
    }

    @RequiresNonNull({"player"})
    protected final zzly zzS(zzcw zzcwVar, int i, zzts zztsVar) {
        zzts zztsVar2 = true == zzcwVar.zzo() ? null : zztsVar;
        long jZza = this.zza.zza();
        boolean z = zzcwVar.equals(this.zzg.zzn()) && i == this.zzg.zzd();
        long jZzr = 0;
        if (zztsVar2 == null || !zztsVar2.zzb()) {
            if (z) {
                jZzr = this.zzg.zzj();
            } else if (!zzcwVar.zzo()) {
                long j = zzcwVar.zze(i, this.zzc, 0L).zzn;
                jZzr = zzfk.zzr(0L);
            }
        } else if (z && this.zzg.zzb() == zztsVar2.zzb && this.zzg.zzc() == zztsVar2.zzc) {
            jZzr = this.zzg.zzk();
        }
        return new zzly(jZza, zzcwVar, i, zztsVar2, jZzr, this.zzg.zzn(), this.zzg.zzd(), this.zzd.zzb(), this.zzg.zzk(), this.zzg.zzm());
    }

    final /* synthetic */ void zzU(zzcp zzcpVar, zzma zzmaVar, zzah zzahVar) {
        zzmaVar.zzi(zzcpVar, new zzlz(zzahVar, this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzxs
    public final void zzV(final int i, final long j, final long j2) {
        final zzly zzlyVarZzX = zzX(this.zzd.zzc());
        zzW(zzlyVarZzX, PointerIconCompat.TYPE_CELL, new zzem() { // from class: com.google.android.gms.internal.ads.zzmk
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                ((zzma) obj).zzf(zzlyVarZzX, i, j, j2);
            }
        });
    }

    protected final void zzW(zzly zzlyVar, int i, zzem zzemVar) {
        this.zze.put(i, zzlyVar);
        zzep zzepVar = this.zzf;
        zzepVar.zzd(i, zzemVar);
        zzepVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zza(final zzcl zzclVar) {
        final zzly zzlyVarZzR = zzR();
        zzW(zzlyVarZzR, 13, new zzem() { // from class: com.google.android.gms.internal.ads.zzmo
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzac(int i, zzts zztsVar, final zzto zztoVar) {
        final zzly zzlyVarZzY = zzY(i, zztsVar);
        zzW(zzlyVarZzY, PointerIconCompat.TYPE_WAIT, new zzem() { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                ((zzma) obj).zzg(zzlyVarZzY, zztoVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzad(int i, zzts zztsVar, final zztj zztjVar, final zzto zztoVar) {
        final zzly zzlyVarZzY = zzY(i, zztsVar);
        zzW(zzlyVarZzY, 1002, new zzem() { // from class: com.google.android.gms.internal.ads.zzmy
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzae(int i, zzts zztsVar, final zztj zztjVar, final zzto zztoVar) {
        final zzly zzlyVarZzY = zzY(i, zztsVar);
        zzW(zzlyVarZzY, 1001, new zzem() { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzaf(int i, zzts zztsVar, final zztj zztjVar, final zzto zztoVar, final IOException iOException, final boolean z) {
        final zzly zzlyVarZzY = zzY(i, zztsVar);
        zzW(zzlyVarZzY, PointerIconCompat.TYPE_HELP, new zzem() { // from class: com.google.android.gms.internal.ads.zzmu
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                ((zzma) obj).zzj(zzlyVarZzY, zztjVar, zztoVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzag(int i, zzts zztsVar, final zztj zztjVar, final zzto zztoVar) {
        final zzly zzlyVarZzY = zzY(i, zztsVar);
        zzW(zzlyVarZzY, 1000, new zzem() { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzb(final boolean z) {
        final zzly zzlyVarZzR = zzR();
        zzW(zzlyVarZzR, 3, new zzem(z) { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzc(final boolean z) {
        final zzly zzlyVarZzR = zzR();
        zzW(zzlyVarZzR, 7, new zzem(z) { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzd(final zzbp zzbpVar, final int i) {
        final zzly zzlyVarZzR = zzR();
        zzW(zzlyVarZzR, 1, new zzem(zzbpVar, i) { // from class: com.google.android.gms.internal.ads.zznh
            public final /* synthetic */ zzbp zzb;

            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zze(final zzbv zzbvVar) {
        final zzly zzlyVarZzR = zzR();
        zzW(zzlyVarZzR, 14, new zzem() { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzf(final boolean z, final int i) {
        final zzly zzlyVarZzR = zzR();
        zzW(zzlyVarZzR, 5, new zzem(z, i) { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzg(final zzch zzchVar) {
        final zzly zzlyVarZzR = zzR();
        zzW(zzlyVarZzR, 12, new zzem() { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzh(final int i) {
        final zzly zzlyVarZzR = zzR();
        zzW(zzlyVarZzR, 4, new zzem() { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                ((zzma) obj).zzk(zzlyVarZzR, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzi(final int i) {
        final zzly zzlyVarZzR = zzR();
        zzW(zzlyVarZzR, 6, new zzem(i) { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzj(final zzcf zzcfVar) {
        final zzly zzlyVarZzab = zzab(zzcfVar);
        zzW(zzlyVarZzab, 10, new zzem() { // from class: com.google.android.gms.internal.ads.zzmz
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                ((zzma) obj).zzl(zzlyVarZzab, zzcfVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzk(final zzcf zzcfVar) {
        final zzly zzlyVarZzab = zzab(zzcfVar);
        zzW(zzlyVarZzab, 10, new zzem() { // from class: com.google.android.gms.internal.ads.zznj
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzl(final boolean z, final int i) {
        final zzly zzlyVarZzR = zzR();
        zzW(zzlyVarZzR, -1, new zzem(z, i) { // from class: com.google.android.gms.internal.ads.zzmb
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzn(final boolean z) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, 23, new zzem(z) { // from class: com.google.android.gms.internal.ads.zznf
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzo(final int i, final int i2) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, 24, new zzem(i, i2) { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzq(final zzdh zzdhVar) {
        final zzly zzlyVarZzR = zzR();
        zzW(zzlyVarZzR, 2, new zzem() { // from class: com.google.android.gms.internal.ads.zzmp
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzr(final zzdn zzdnVar) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, 25, new zzem() { // from class: com.google.android.gms.internal.ads.zznq
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                zzly zzlyVar = zzlyVarZzaa;
                zzdn zzdnVar2 = zzdnVar;
                ((zzma) obj).zzq(zzlyVar, zzdnVar2);
                int i = zzdnVar2.zzc;
                int i2 = zzdnVar2.zzd;
                int i3 = zzdnVar2.zze;
                float f = zzdnVar2.zzf;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzs(final float f) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, 22, new zzem(f) { // from class: com.google.android.gms.internal.ads.zzmf
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzt(zzma zzmaVar) {
        this.zzf.zzb(zzmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzu() {
        if (this.zzi) {
            return;
        }
        final zzly zzlyVarZzR = zzR();
        this.zzi = true;
        zzW(zzlyVarZzR, -1, new zzem() { // from class: com.google.android.gms.internal.ads.zznp
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzv(final Exception exc) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, 1029, new zzem() { // from class: com.google.android.gms.internal.ads.zzmq
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzw(final String str, final long j, final long j2) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, PointerIconCompat.TYPE_TEXT, new zzem(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzna
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzx(final String str) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, PointerIconCompat.TYPE_NO_DROP, new zzem() { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzy(final zzid zzidVar) {
        final zzly zzlyVarZzZ = zzZ();
        zzW(zzlyVarZzZ, PointerIconCompat.TYPE_ALL_SCROLL, new zzem() { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzz(final zzid zzidVar) {
        final zzly zzlyVarZzaa = zzaa();
        zzW(zzlyVarZzaa, PointerIconCompat.TYPE_CROSSHAIR, new zzem() { // from class: com.google.android.gms.internal.ads.zznb
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    private final zzly zzX(zzts zztsVar) {
        this.zzg.getClass();
        zzcw zzcwVarZza = zztsVar == null ? null : this.zzd.zza(zztsVar);
        if (zztsVar != null && zzcwVarZza != null) {
            return zzS(zzcwVarZza, zzcwVarZza.zzn(zztsVar.zza, this.zzb).zzd, zztsVar);
        }
        int iZzd = this.zzg.zzd();
        zzcw zzcwVarZzn = this.zzg.zzn();
        if (iZzd >= zzcwVarZzn.zzc()) {
            zzcwVarZzn = zzcw.zza;
        }
        return zzS(zzcwVarZzn, iZzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void zzQ(List list, zzts zztsVar) {
        zznx zznxVar = this.zzd;
        zzcp zzcpVar = this.zzg;
        zzcpVar.getClass();
        zznxVar.zzh(list, zztsVar, zzcpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzm(final zzco zzcoVar, final zzco zzcoVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zznx zznxVar = this.zzd;
        zzcp zzcpVar = this.zzg;
        zzcpVar.getClass();
        zznxVar.zzg(zzcpVar);
        final zzly zzlyVarZzR = zzR();
        zzW(zzlyVarZzR, 11, new zzem() { // from class: com.google.android.gms.internal.ads.zzmm
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                zzma zzmaVar = (zzma) obj;
                zzmaVar.zzm(zzlyVarZzR, zzcoVar, zzcoVar2, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzp(zzcw zzcwVar, final int i) {
        zznx zznxVar = this.zzd;
        zzcp zzcpVar = this.zzg;
        zzcpVar.getClass();
        zznxVar.zzi(zzcpVar);
        final zzly zzlyVarZzR = zzR();
        zzW(zzlyVarZzR, 0, new zzem(i) { // from class: com.google.android.gms.internal.ads.zzmv
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
            }
        });
    }

    public zzny(zzdz zzdzVar) {
        zzdzVar.getClass();
        this.zza = zzdzVar;
        this.zzf = new zzep(zzfk.zzv(), zzdzVar, new zzen() { // from class: com.google.android.gms.internal.ads.zzmh
            @Override // com.google.android.gms.internal.ads.zzen
            public final void zza(Object obj, zzah zzahVar) {
            }
        });
        zzct zzctVar = new zzct();
        this.zzb = zzctVar;
        this.zzc = new zzcv();
        this.zzd = new zznx(zzctVar);
        this.zze = new SparseArray();
    }
}
