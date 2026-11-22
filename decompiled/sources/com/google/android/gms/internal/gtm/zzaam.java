package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaam extends IllegalArgumentException {
    zzaam(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
