package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzws extends zzakg implements zzalq {
    private zzws() {
        super(zzwv.zzb);
    }

    public final int zza() {
        return ((zzwv) this.zza).zza();
    }

    public final zzws zzb(zzwu zzwuVar) {
        zzm();
        zzwv.zzk((zzwv) this.zza, zzwuVar);
        return this;
    }

    public final zzws zzc(int i) {
        zzm();
        ((zzwv) this.zza).zzd = i;
        return this;
    }

    public final zzwu zzd(int i) {
        return ((zzwv) this.zza).zzd(i);
    }

    public final List zze() {
        return Collections.unmodifiableList(((zzwv) this.zza).zzh());
    }

    /* synthetic */ zzws(zzwr zzwrVar) {
        super(zzwv.zzb);
    }
}
