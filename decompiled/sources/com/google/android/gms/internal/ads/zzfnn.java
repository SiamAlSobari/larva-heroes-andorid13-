package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfnn implements Closeable {
    public static zzfnz zza() {
        return new zzfnz();
    }

    public static zzfnz zzb(final int i, zzfny zzfnyVar) {
        return new zzfnz(new zzfry() { // from class: com.google.android.gms.internal.ads.zzfnl
            @Override // com.google.android.gms.internal.ads.zzfry
            public final Object zza() {
                return Integer.valueOf(i);
            }
        }, new zzfry() { // from class: com.google.android.gms.internal.ads.zzfnm
            @Override // com.google.android.gms.internal.ads.zzfry
            public final Object zza() {
                return zzfnn.zze();
            }
        }, zzfnyVar);
    }

    public static zzfnz zzc(zzfry<Integer> zzfryVar, zzfry<Integer> zzfryVar2, zzfny zzfnyVar) {
        return new zzfnz(zzfryVar, zzfryVar2, zzfnyVar);
    }

    static /* synthetic */ Integer zze() {
        return -1;
    }
}
