package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzfdu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfdu> CREATOR = new zzfdv();

    @Nullable
    public final Context zza;
    public final zzfdr zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfdr[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfdu(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfdr[] zzfdrVarArrValues = zzfdr.values();
        this.zzh = zzfdrVarArrValues;
        int[] iArrZza = zzfds.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfdt.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = zzfdrVarArrValues[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = iArrZza[i5];
        this.zzk = i6;
        int i7 = iArrZza2[i6];
    }

    @Nullable
    public static zzfdu zza(zzfdr zzfdrVar, Context context) {
        if (zzfdrVar == zzfdr.Rewarded) {
            return new zzfdu(context, zzfdrVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgl)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgr)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgt)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgv), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgn), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgp));
        }
        if (zzfdrVar == zzfdr.Interstitial) {
            return new zzfdu(context, zzfdrVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgm)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgs)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgu)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgw), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgo), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgq));
        }
        if (zzfdrVar != zzfdr.AppOpen) {
            return null;
        }
        return new zzfdu(context, zzfdrVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgz)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgB)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgC)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgx), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgy), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgA));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzfdu(@Nullable Context context, zzfdr zzfdrVar, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.zzh = zzfdr.values();
        this.zzl = zzfds.zza();
        this.zzm = zzfdt.zza();
        this.zza = context;
        this.zzi = zzfdrVar.ordinal();
        this.zzb = zzfdrVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else {
            i4 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
