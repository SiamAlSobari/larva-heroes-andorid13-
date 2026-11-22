package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfuh extends zzftw {

    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfuh() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzftw, com.google.android.gms.internal.ads.zzftx
    public final /* bridge */ /* synthetic */ zzftx zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfuh zzg(Iterable iterable) {
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    zzfuh(int i) {
        super(i);
        this.zzd = new Object[zzfui.zzh(i)];
    }

    public final zzfui zzh() {
        zzfui zzfuiVarZzs;
        int i = this.zzb;
        if (i == 0) {
            return zzfvt.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            obj.getClass();
            return new zzfwa(obj);
        }
        if (this.zzd == null || zzfui.zzh(i) != this.zzd.length) {
            zzfuiVarZzs = zzfui.zzs(this.zzb, this.zza);
            this.zzb = zzfuiVarZzs.size();
        } else {
            int i2 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzfui.zzt(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.zze;
            Object[] objArr = this.zzd;
            zzfuiVarZzs = new zzfvt(objArrCopyOf, i3, objArr, objArr.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzfuiVarZzs;
    }

    public final zzfuh zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzh = zzfui.zzh(this.zzb);
            Object[] objArr = this.zzd;
            int length = objArr.length;
            if (iZzh <= length) {
                objArr.getClass();
                int iHashCode = obj.hashCode();
                int iZza = zzftv.zza(iHashCode);
                while (true) {
                    Object[] objArr2 = this.zzd;
                    int i = iZza & (length - 1);
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iZza = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zze += iHashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
