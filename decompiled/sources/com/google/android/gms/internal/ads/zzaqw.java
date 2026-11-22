package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaqw extends zzaqv {
    protected zzaqw(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzaqw zzt(String str, Context context, boolean z) {
        zzr(context, false);
        return new zzaqw(context, str, false);
    }

    @Deprecated
    public static zzaqw zzu(String str, Context context, boolean z, int i) {
        zzr(context, z);
        return new zzaqw(context, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaqv
    protected final List zzp(zzary zzaryVar, Context context, zzanv zzanvVar, zzano zzanoVar) {
        if (zzaryVar.zzk() == null || !this.zzu) {
            return super.zzp(zzaryVar, context, zzanvVar, null);
        }
        int iZza = zzaryVar.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzp(zzaryVar, context, zzanvVar, null));
        arrayList.add(new zzasq(zzaryVar, "9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", zzanvVar, iZza, 24));
        return arrayList;
    }
}
