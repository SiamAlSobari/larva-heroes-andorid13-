package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgak {

    @Nullable
    private final Object zza;

    @Nullable
    private final Object zzb;
    private final byte[] zzc;
    private final zzgnw zzd;
    private final int zze;
    private final String zzf;
    private final zzfzp zzg;
    private final int zzh;

    zzgak(@Nullable Object obj, @Nullable Object obj2, byte[] bArr, int i, zzgnw zzgnwVar, int i2, String str, zzfzp zzfzpVar) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = Arrays.copyOf(bArr, bArr.length);
        this.zzh = i;
        this.zzd = zzgnwVar;
        this.zze = i2;
        this.zzf = str;
        this.zzg = zzfzpVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzfzp zzb() {
        return this.zzg;
    }

    public final zzgnw zzc() {
        return this.zzd;
    }

    @Nullable
    public final Object zzd() {
        return this.zza;
    }

    @Nullable
    public final Object zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzf;
    }

    @Nullable
    public final byte[] zzg() {
        byte[] bArr = this.zzc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzh() {
        return this.zzh;
    }
}
