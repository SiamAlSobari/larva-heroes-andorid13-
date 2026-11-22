package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabf {
    public static int zza(zzabc zzabcVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iZzb = zzabcVar.zzb(bArr, i + i3, i2 - i3);
            if (iZzb == -1) {
                break;
            }
            i3 += iZzb;
        }
        return i3;
    }

    @Pure
    public static void zzb(boolean z, String str) throws zzcd {
        if (!z) {
            throw zzcd.zza(str, null);
        }
    }

    public static boolean zzc(zzabc zzabcVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzabcVar.zzm(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzabc zzabcVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((zzaar) zzabcVar).zzn(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzabc zzabcVar, int i) throws IOException {
        try {
            ((zzaar) zzabcVar).zzo(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
