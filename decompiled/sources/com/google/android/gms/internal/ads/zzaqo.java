package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaqo implements zzfmx {
    final /* synthetic */ zzfkx zza;

    zzaqo(zzaqq zzaqqVar, zzfkx zzfkxVar) {
        this.zza = zzfkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmx
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
