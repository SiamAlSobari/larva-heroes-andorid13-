package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbz implements Parcelable {
    public static final Parcelable.Creator<zzbz> CREATOR = new zzbx();
    public final long zza;
    private final zzby[] zzb;

    public zzbz(long j, zzby... zzbyVarArr) {
        this.zza = j;
        this.zzb = zzbyVarArr;
    }

    zzbz(Parcel parcel) {
        this.zzb = new zzby[parcel.readInt()];
        int i = 0;
        while (true) {
            zzby[] zzbyVarArr = this.zzb;
            if (i >= zzbyVarArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                zzbyVarArr[i] = (zzby) parcel.readParcelable(zzby.class.getClassLoader());
                i++;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzbz zzbzVar = (zzbz) obj;
            if (Arrays.equals(this.zzb, zzbzVar.zzb) && this.zza == zzbzVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.zzb) * 31;
        long j = this.zza;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        String string = Arrays.toString(this.zzb);
        long j = this.zza;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (zzby zzbyVar : this.zzb) {
            parcel.writeParcelable(zzbyVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzby zzb(int i) {
        return this.zzb[i];
    }

    public final zzbz zzc(zzby... zzbyVarArr) {
        int length = zzbyVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.zza;
        zzby[] zzbyVarArr2 = this.zzb;
        int i = zzfk.zza;
        int length2 = zzbyVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzbyVarArr2, length2 + length);
        System.arraycopy(zzbyVarArr, 0, objArrCopyOf, length2, length);
        return new zzbz(j, (zzby[]) objArrCopyOf);
    }

    public final zzbz zzd(zzbz zzbzVar) {
        return zzbzVar == null ? this : zzc(zzbzVar.zzb);
    }

    public zzbz(List list) {
        this(-9223372036854775807L, (zzby[]) list.toArray(new zzby[0]));
    }
}
