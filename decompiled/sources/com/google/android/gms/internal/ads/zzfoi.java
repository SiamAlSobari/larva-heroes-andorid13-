package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfoi extends zzfog {
    private static zzfoi zzc;

    private zzfoi(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfoi zzj(Context context) {
        zzfoi zzfoiVar;
        synchronized (zzfoi.class) {
            if (zzc == null) {
                zzc = new zzfoi(context);
            }
            zzfoiVar = zzc;
        }
        return zzfoiVar;
    }

    public final zzfof zzh(long j, boolean z) throws IOException {
        zzfof zzfofVarZzb;
        synchronized (zzfoi.class) {
            zzfofVarZzb = zzb(null, null, j, z);
        }
        return zzfofVarZzb;
    }

    public final zzfof zzi(String str, String str2, long j, boolean z) throws IOException {
        zzfof zzfofVarZzb;
        synchronized (zzfoi.class) {
            zzfofVarZzb = zzb(str, str2, j, z);
        }
        return zzfofVarZzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzfoi.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfoi.class) {
            zzf(true);
        }
    }
}
