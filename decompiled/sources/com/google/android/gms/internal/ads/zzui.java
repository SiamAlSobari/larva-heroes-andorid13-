package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzui implements zztq, zztp {
    private final zztq[] zza;
    private zztp zze;
    private zzvs zzf;
    private final zztd zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzvl zzh = new zztc(new zzvl[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zztq[] zzg = new zztq[0];

    public zzui(zztd zztdVar, long[] jArr, zztq... zztqVarArr) {
        this.zzi = zztdVar;
        this.zza = zztqVarArr;
        for (int i = 0; i < zztqVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzug(zztqVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zza(long j, zzlr zzlrVar) {
        zztq[] zztqVarArr = this.zzg;
        return (zztqVarArr.length > 0 ? zztqVarArr[0] : this.zza[0]).zza(j, zzlrVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        long j = -9223372036854775807L;
        for (zztq zztqVar : this.zzg) {
            long jZzd = zztqVar.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j != -9223372036854775807L && zztqVar.zze(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (zztq zztqVar2 : this.zzg) {
                    if (zztqVar2 == zztqVar) {
                        break;
                    }
                    if (zztqVar2.zze(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzd;
            } else if (jZzd != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zze(long j) {
        long jZze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zztq[] zztqVarArr = this.zzg;
            if (i >= zztqVarArr.length) {
                return jZze;
            }
            if (zztqVarArr[i].zze(jZze) != jZze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzf(zzxf[] zzxfVarArr, boolean[] zArr, zzvj[] zzvjVarArr, boolean[] zArr2, long j) {
        int length;
        Integer num;
        int length2 = zzxfVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzxfVarArr.length;
            num = null;
            if (i >= length) {
                break;
            }
            zzvj zzvjVar = zzvjVarArr[i];
            num = zzvjVar != null ? (Integer) this.zzb.get(zzvjVar) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            zzxf zzxfVar = zzxfVarArr[i];
            if (zzxfVar != null) {
                String str = zzxfVar.zze().zzc;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        this.zzb.clear();
        zzvj[] zzvjVarArr2 = new zzvj[length];
        Object[] objArr = new zzxf[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i2 = 0;
        Object[] objArr2 = new zzvj[length];
        while (i2 < this.zza.length) {
            for (int i3 = 0; i3 < zzxfVarArr.length; i3++) {
                objArr2[i3] = iArr[i3] == i2 ? zzvjVarArr[i3] : num;
                if (iArr2[i3] == i2) {
                    zzxf zzxfVar2 = zzxfVarArr[i3];
                    zzxfVar2.getClass();
                    zzcy zzcyVar = (zzcy) this.zzd.get(zzxfVar2.zze());
                    zzcyVar.getClass();
                    objArr[i3] = new zzuf(zzxfVar2, zzcyVar);
                } else {
                    objArr[i3] = num;
                }
            }
            int i4 = i2;
            ArrayList arrayList2 = arrayList;
            Object[] objArr3 = objArr2;
            Object[] objArr4 = objArr;
            long jZzf = this.zza[i2].zzf(objArr, zArr, objArr2, zArr2, j2);
            if (i4 == 0) {
                j2 = jZzf;
            } else if (jZzf != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < zzxfVarArr.length; i5++) {
                if (iArr2[i5] == i4) {
                    Object obj = objArr3[i5];
                    obj.getClass();
                    zzvjVarArr2[i5] = obj;
                    this.zzb.put(obj, Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i5] == i4) {
                    zzdy.zzf(objArr3[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i4]);
            }
            i2 = i4 + 1;
            arrayList = arrayList2;
            objArr2 = objArr3;
            objArr = objArr4;
            num = null;
        }
        System.arraycopy(zzvjVarArr2, 0, zzvjVarArr, 0, length);
        zztq[] zztqVarArr = (zztq[]) arrayList.toArray(new zztq[0]);
        this.zzg = zztqVarArr;
        this.zzh = new zztc(zztqVarArr);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final /* bridge */ /* synthetic */ void zzg(zzvl zzvlVar) {
        zztp zztpVar = this.zze;
        zztpVar.getClass();
        zztpVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final zzvs zzh() {
        zzvs zzvsVar = this.zzf;
        zzvsVar.getClass();
        return zzvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzi(zztq zztqVar) {
        this.zzc.remove(zztqVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zztq zztqVar2 : this.zza) {
            i += zztqVar2.zzh().zzc;
        }
        zzcy[] zzcyVarArr = new zzcy[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zztq[] zztqVarArr = this.zza;
            if (i2 >= zztqVarArr.length) {
                this.zzf = new zzvs(zzcyVarArr);
                zztp zztpVar = this.zze;
                zztpVar.getClass();
                zztpVar.zzi(this);
                return;
            }
            zzvs zzvsVarZzh = zztqVarArr[i2].zzh();
            int i4 = zzvsVarZzh.zzc;
            int i5 = 0;
            while (i5 < i4) {
                zzcy zzcyVarZzb = zzvsVarZzh.zzb(i5);
                zzcy zzcyVarZzc = zzcyVarZzb.zzc(i2 + ":" + zzcyVarZzb.zzc);
                this.zzd.put(zzcyVarZzc, zzcyVarZzb);
                zzcyVarArr[i3] = zzcyVarZzc;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzj(long j, boolean z) {
        for (zztq zztqVar : this.zzg) {
            zztqVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzk() throws IOException {
        for (zztq zztqVar : this.zza) {
            zztqVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztpVar, long j) {
        this.zze = zztpVar;
        Collections.addAll(this.zzc, this.zza);
        for (zztq zztqVar : this.zza) {
            zztqVar.zzl(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zztq zzn(int i) {
        zztq zztqVar = this.zza[i];
        return zztqVar instanceof zzug ? ((zzug) zztqVar).zza : zztqVar;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzo(long j) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(j);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zztq) this.zzc.get(i)).zzo(j);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
