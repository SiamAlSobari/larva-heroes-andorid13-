package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfrs implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfrv zzb;

    zzfrs(zzfrv zzfrvVar, CharSequence charSequence) {
        this.zzb = zzfrvVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfqx.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
