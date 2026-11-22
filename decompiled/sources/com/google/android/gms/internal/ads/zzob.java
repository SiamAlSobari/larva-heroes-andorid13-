package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzob implements zzof {
    public static final zzfry zza = new zzfry() { // from class: com.google.android.gms.internal.ads.zznz
        @Override // com.google.android.gms.internal.ads.zzfry
        public final Object zza() {
            return zzob.zzn();
        }
    };
    private static final Random zzb = new Random();
    private final zzcv zzc;
    private final zzct zzd;
    private final HashMap zze;
    private final zzfry zzf;
    private zzoe zzg;
    private zzcw zzh;
    private String zzi;
    private long zzj;

    public zzob() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzl() {
        zzoa zzoaVar = (zzoa) this.zze.get(this.zzi);
        return (zzoaVar == null || zzoaVar.zzd == -1) ? this.zzj + 1 : zzoaVar.zzd;
    }

    private final zzoa zzm(int i, zzts zztsVar) {
        long j = Long.MAX_VALUE;
        zzoa zzoaVar = null;
        for (zzoa zzoaVar2 : this.zze.values()) {
            zzoaVar2.zzg(i, zztsVar);
            if (zzoaVar2.zzj(i, zztsVar)) {
                long j2 = zzoaVar2.zzd;
                if (j2 == -1 || j2 < j) {
                    zzoaVar = zzoaVar2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = zzfk.zza;
                    if (zzoaVar.zze != null && zzoaVar2.zze != null) {
                        zzoaVar = zzoaVar2;
                    }
                }
            }
        }
        if (zzoaVar != null) {
            return zzoaVar;
        }
        String strZzn = zzn();
        zzoa zzoaVar3 = new zzoa(this, strZzn, i, zztsVar);
        this.zze.put(strZzn, zzoaVar3);
        return zzoaVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzoa zzoaVar) {
        if (zzoaVar.zzd != -1) {
            this.zzj = zzoaVar.zzd;
        }
        this.zzi = null;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzp(zzly zzlyVar) {
        if (zzlyVar.zzb.zzo()) {
            String str = this.zzi;
            if (str != null) {
                zzoa zzoaVar = (zzoa) this.zze.get(str);
                zzoaVar.getClass();
                zzo(zzoaVar);
                return;
            }
            return;
        }
        zzoa zzoaVar2 = (zzoa) this.zze.get(this.zzi);
        zzoa zzoaVarZzm = zzm(zzlyVar.zzc, zzlyVar.zzd);
        this.zzi = zzoaVarZzm.zzb;
        zzi(zzlyVar);
        zzts zztsVar = zzlyVar.zzd;
        if (zztsVar == null || !zztsVar.zzb()) {
            return;
        }
        if (zzoaVar2 != null && zzoaVar2.zzd == zzlyVar.zzd.zzd && zzoaVar2.zze != null && zzoaVar2.zze.zzb == zzlyVar.zzd.zzb && zzoaVar2.zze.zzc == zzlyVar.zzd.zzc) {
            return;
        }
        zzts zztsVar2 = zzlyVar.zzd;
        String unused = zzm(zzlyVar.zzc, new zzts(zztsVar2.zza, zztsVar2.zzd)).zzb;
        String unused2 = zzoaVarZzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final synchronized String zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final synchronized String zzf(zzcw zzcwVar, zzts zztsVar) {
        return zzm(zzcwVar.zzn(zztsVar.zza, this.zzd).zzd, zztsVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final synchronized void zzg(zzly zzlyVar) {
        zzoe zzoeVar;
        String str = this.zzi;
        if (str != null) {
            zzoa zzoaVar = (zzoa) this.zze.get(str);
            zzoaVar.getClass();
            zzo(zzoaVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoa zzoaVar2 = (zzoa) it.next();
            it.remove();
            if (zzoaVar2.zzf && (zzoeVar = this.zzg) != null) {
                zzoeVar.zzd(zzlyVar, zzoaVar2.zzb, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final void zzh(zzoe zzoeVar) {
        this.zzg = zzoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final synchronized void zzi(zzly zzlyVar) {
        this.zzg.getClass();
        if (zzlyVar.zzb.zzo()) {
            return;
        }
        zzts zztsVar = zzlyVar.zzd;
        if (zztsVar != null) {
            if (zztsVar.zzd < zzl()) {
                return;
            }
            zzoa zzoaVar = (zzoa) this.zze.get(this.zzi);
            if (zzoaVar != null && zzoaVar.zzd == -1 && zzoaVar.zzc != zzlyVar.zzc) {
                return;
            }
        }
        zzoa zzoaVarZzm = zzm(zzlyVar.zzc, zzlyVar.zzd);
        if (this.zzi == null) {
            this.zzi = zzoaVarZzm.zzb;
        }
        zzts zztsVar2 = zzlyVar.zzd;
        if (zztsVar2 != null && zztsVar2.zzb()) {
            zzoa zzoaVarZzm2 = zzm(zzlyVar.zzc, new zzts(zztsVar2.zza, zztsVar2.zzd, zztsVar2.zzb));
            if (!zzoaVarZzm2.zzf) {
                zzoaVarZzm2.zzf = true;
                zzlyVar.zzb.zzn(zzlyVar.zzd.zza, this.zzd);
                this.zzd.zzi(zzlyVar.zzd.zzb);
                Math.max(0L, zzfk.zzr(0L) + zzfk.zzr(0L));
                String unused = zzoaVarZzm2.zzb;
            }
        }
        if (!zzoaVarZzm.zzf) {
            zzoaVarZzm.zzf = true;
            String unused2 = zzoaVarZzm.zzb;
        }
        if (!zzoaVarZzm.zzb.equals(this.zzi) || zzoaVarZzm.zzg) {
            return;
        }
        zzoaVarZzm.zzg = true;
        this.zzg.zzc(zzlyVar, zzoaVarZzm.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final synchronized void zzj(zzly zzlyVar, int i) {
        this.zzg.getClass();
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoa zzoaVar = (zzoa) it.next();
            if (zzoaVar.zzk(zzlyVar)) {
                it.remove();
                if (zzoaVar.zzf) {
                    boolean zEquals = zzoaVar.zzb.equals(this.zzi);
                    boolean z = false;
                    if (i == 0 && zEquals && zzoaVar.zzg) {
                        z = true;
                    }
                    if (zEquals) {
                        zzo(zzoaVar);
                    }
                    this.zzg.zzd(zzlyVar, zzoaVar.zzb, z);
                }
            }
        }
        zzp(zzlyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final synchronized void zzk(zzly zzlyVar) {
        this.zzg.getClass();
        zzcw zzcwVar = this.zzh;
        this.zzh = zzlyVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoa zzoaVar = (zzoa) it.next();
            if (!zzoaVar.zzl(zzcwVar, this.zzh) || zzoaVar.zzk(zzlyVar)) {
                it.remove();
                if (zzoaVar.zzf) {
                    if (zzoaVar.zzb.equals(this.zzi)) {
                        zzo(zzoaVar);
                    }
                    this.zzg.zzd(zzlyVar, zzoaVar.zzb, false);
                }
            }
        }
        zzp(zzlyVar);
    }

    public zzob(zzfry zzfryVar) {
        this.zzf = zzfryVar;
        this.zzc = new zzcv();
        this.zzd = new zzct();
        this.zze = new HashMap();
        this.zzh = zzcw.zza;
        this.zzj = -1L;
    }
}
