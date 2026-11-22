package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaef extends zzaes {
    public static final Parcelable.Creator<zzaef> CREATOR = new zzaee();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    zzaef(Parcel parcel) {
        String string = parcel.readString();
        int i = zzfk.zza;
        super(string);
        this.zza = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaef zzaefVar = (zzaef) obj;
            if (this.zzf.equals(zzaefVar.zzf) && Arrays.equals(this.zza, zzaefVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzaef(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
