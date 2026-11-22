package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdq extends Exception {
    public final zzdp zza;

    public zzdq(String str, zzdp zzdpVar) {
        super("Unhandled input format: ".concat(String.valueOf(String.valueOf(zzdpVar))));
        this.zza = zzdpVar;
    }
}
