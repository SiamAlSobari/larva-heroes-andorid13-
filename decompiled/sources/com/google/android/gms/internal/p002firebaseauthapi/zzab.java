package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzab {
    private final zzj zza;
    private final zzaa zzb;

    private zzab(zzaa zzaaVar) {
        zzi zziVar = zzi.zza;
        this.zzb = zzaaVar;
        this.zza = zziVar;
    }

    public static zzab zzb(zzj zzjVar) {
        return new zzab(new zzw(zzjVar));
    }

    public static zzab zzc(String str) {
        zzp zzpVar = new zzp(Pattern.compile("[.-]"));
        if (!((zzo) zzpVar.zza("")).zza.matches()) {
            return new zzab(new zzy(zzpVar));
        }
        throw new IllegalArgumentException(zzac.zzb("The pattern may not match the empty string: %s", zzpVar));
    }

    public final List zzd(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZza = this.zzb.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZza.hasNext()) {
            arrayList.add((String) itZza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
