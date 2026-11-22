package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfjg extends zzfjj {
    private static final zzfjg zzb = new zzfjg();

    private zzfjg() {
    }

    public static zzfjg zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final void zzb(boolean z) {
        Iterator it = zzfjh.zza().zzc().iterator();
        while (it.hasNext()) {
            zzfju zzfjuVarZzg = ((zzfit) it.next()).zzg();
            if (zzfjuVarZzg.zzl()) {
                zzfjn.zza().zzb(zzfjuVarZzg.zza(), "setState", true != z ? "backgrounded" : "foregrounded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final boolean zzc() {
        Iterator it = zzfjh.zza().zzb().iterator();
        while (it.hasNext()) {
            View viewZzf = ((zzfit) it.next()).zzf();
            if (viewZzf != null && viewZzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
