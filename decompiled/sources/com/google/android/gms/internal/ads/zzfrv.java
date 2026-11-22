package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfrv {
    private final zzfqt zza;
    private final zzfru zzb;

    private zzfrv(zzfru zzfruVar) {
        zzfqs zzfqsVar = zzfqs.zza;
        this.zzb = zzfruVar;
        this.zza = zzfqsVar;
    }

    public static zzfrv zzb(int i) {
        return new zzfrv(new zzfrr(GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND));
    }

    public static zzfrv zzc(zzfqt zzfqtVar) {
        return new zzfrv(new zzfrp(zzfqtVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfrs(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator itZzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzg.hasNext()) {
            arrayList.add((String) itZzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
