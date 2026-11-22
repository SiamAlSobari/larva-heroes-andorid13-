package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzuk extends zztb {
    private static final zzbp zza;
    private final zztu[] zzb;
    private final zzcw[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfuz zzf;
    private int zzg;
    private long[][] zzh;
    private zzuj zzi;
    private final zztd zzj;

    static {
        zzar zzarVar = new zzar();
        zzarVar.zza("MergingMediaSource");
        zza = zzarVar.zzc();
    }

    public zzuk(boolean z, boolean z2, zztu... zztuVarArr) {
        zztd zztdVar = new zztd();
        this.zzb = zztuVarArr;
        this.zzj = zztdVar;
        this.zzd = new ArrayList(Arrays.asList(zztuVarArr));
        this.zzg = -1;
        this.zzc = new zzcw[zztuVarArr.length];
        this.zzh = new long[0][];
        this.zze = new HashMap();
        this.zzf = zzfvh.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zztb
    protected final /* bridge */ /* synthetic */ void zzA(Object obj, zztu zztuVar, zzcw zzcwVar) {
        int iZzb;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            iZzb = zzcwVar.zzb();
            this.zzg = iZzb;
        } else {
            int iZzb2 = zzcwVar.zzb();
            int i = this.zzg;
            if (iZzb2 != i) {
                this.zzi = new zzuj(0);
                return;
            }
            iZzb = i;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzb, this.zzc.length);
        }
        this.zzd.remove(zztuVar);
        this.zzc[((Integer) obj).intValue()] = zzcwVar;
        if (this.zzd.isEmpty()) {
            zzo(this.zzc[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzG(zztq zztqVar) {
        zzui zzuiVar = (zzui) zztqVar;
        int i = 0;
        while (true) {
            zztu[] zztuVarArr = this.zzb;
            if (i >= zztuVarArr.length) {
                return;
            }
            zztuVarArr[i].zzG(zzuiVar.zzn(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final zztq zzI(zzts zztsVar, zzxu zzxuVar, long j) {
        int length = this.zzb.length;
        zztq[] zztqVarArr = new zztq[length];
        int iZza = this.zzc[0].zza(zztsVar.zza);
        for (int i = 0; i < length; i++) {
            zztqVarArr[i] = this.zzb[i].zzI(zztsVar.zzc(this.zzc[i].zzf(iZza)), zzxuVar, j - this.zzh[iZza][i]);
        }
        return new zzui(this.zzj, this.zzh[iZza], zztqVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final zzbp zzJ() {
        zztu[] zztuVarArr = this.zzb;
        return zztuVarArr.length > 0 ? zztuVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zztb, com.google.android.gms.internal.ads.zzst
    protected final void zzn(zzhk zzhkVar) {
        super.zzn(zzhkVar);
        for (int i = 0; i < this.zzb.length; i++) {
            zzB(Integer.valueOf(i), this.zzb[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb, com.google.android.gms.internal.ads.zzst
    protected final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzst, com.google.android.gms.internal.ads.zztu
    public final void zzt(zzbp zzbpVar) {
        this.zzb[0].zzt(zzbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    protected final /* bridge */ /* synthetic */ zzts zzy(Object obj, zzts zztsVar) {
        if (((Integer) obj).intValue() == 0) {
            return zztsVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zztb, com.google.android.gms.internal.ads.zztu
    public final void zzz() throws IOException {
        zzuj zzujVar = this.zzi;
        if (zzujVar != null) {
            throw zzujVar;
        }
        super.zzz();
    }
}
