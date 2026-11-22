package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahf;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbc {
    @Nullable
    public static MultiFactorInfo zza(zzahf zzahfVar) {
        if (zzahfVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzahfVar.zzf())) {
            return new PhoneMultiFactorInfo(zzahfVar.zze(), zzahfVar.zzd(), zzahfVar.zza(), Preconditions.checkNotEmpty(zzahfVar.zzf()));
        }
        if (zzahfVar.zzc() != null) {
            return new TotpMultiFactorInfo(zzahfVar.zze(), zzahfVar.zzd(), zzahfVar.zza(), (zzaia) Preconditions.checkNotNull(zzahfVar.zzc(), "totpInfo cannot be null."));
        }
        return null;
    }

    public static List zzb(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfoZza = zza((zzahf) it.next());
            if (multiFactorInfoZza != null) {
                arrayList.add(multiFactorInfoZza);
            }
        }
        return arrayList;
    }
}
