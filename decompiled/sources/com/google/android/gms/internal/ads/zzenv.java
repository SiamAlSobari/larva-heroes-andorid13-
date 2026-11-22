package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import javax.annotation.Nullable;
import kotlin.time.DurationKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzenv implements zzesi {

    @Nullable
    private final Integer zza;

    private zzenv(@Nullable Integer num) {
        this.zza = num;
    }

    static /* bridge */ /* synthetic */ zzenv zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjo)).booleanValue()) {
            return new zzenv(null);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        int extensionVersion = 0;
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
            extensionVersion = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
        }
        return new zzenv(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.zzesi
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Integer num = this.zza;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
