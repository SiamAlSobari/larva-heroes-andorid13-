package com.google.android.recaptcha.internal;

import java.util.HashMap;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbn {
    private final zzbm zza;
    private byte zzb;
    private final HashMap zzc;

    public zzbn() {
        zzbm zzbmVar = new zzbm();
        this.zza = zzbmVar;
        this.zzb = (byte) RangesKt.random(new IntRange(1, WorkQueueKt.MASK), Random.INSTANCE);
        HashMap map = new HashMap();
        this.zzc = map;
        zzbmVar.zze(173, map);
    }

    public final byte zza() {
        return this.zzb;
    }

    public final zzbm zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zzd();
        this.zza.zze(173, this.zzc);
    }

    public final void zzd(byte b) {
        this.zzb = b;
    }

    public final void zze(int i, Object obj) {
        this.zzc.put(1, obj);
    }
}
