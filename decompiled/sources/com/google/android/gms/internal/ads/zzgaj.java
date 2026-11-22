package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgaj {
    private final Class zza;
    private zzgak zzd;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private final List zzc = new ArrayList();
    private zzgjt zze = zzgjt.zza;

    /* synthetic */ zzgaj(Class cls, zzgai zzgaiVar) {
        this.zza = cls;
    }

    private final zzgaj zze(@Nullable Object obj, @Nullable Object obj2, zzgnc zzgncVar, boolean z) throws GeneralSecurityException {
        byte[] bArrArray;
        if (this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (zzgncVar.zzk() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        Integer numValueOf = Integer.valueOf(zzgncVar.zza());
        if (zzgncVar.zzf() == zzgnw.RAW) {
            numValueOf = null;
        }
        zzfzp zzfzpVarZza = zzggi.zzc().zza(zzghc.zza(zzgncVar.zzc().zzg(), zzgncVar.zzc().zzf(), zzgncVar.zzc().zzc(), zzgncVar.zzf(), numValueOf), zzgas.zza());
        int iOrdinal = zzgncVar.zzf().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgncVar.zza()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgncVar.zza()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgncVar.zza()).array();
        } else {
            bArrArray = zzfzn.zza;
        }
        zzgak zzgakVar = new zzgak(obj, obj2, bArrArray, zzgncVar.zzk(), zzgncVar.zzf(), zzgncVar.zza(), zzgncVar.zzc().zzg(), zzfzpVarZza);
        ConcurrentMap concurrentMap = this.zzb;
        List list = this.zzc;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzgakVar);
        zzgam zzgamVar = new zzgam(zzgakVar.zzg(), null);
        List list2 = (List) concurrentMap.put(zzgamVar, Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(zzgakVar);
            concurrentMap.put(zzgamVar, Collections.unmodifiableList(arrayList2));
        }
        list.add(zzgakVar);
        if (z) {
            if (this.zzd != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.zzd = zzgakVar;
        }
        return this;
    }

    public final zzgaj zza(@Nullable Object obj, @Nullable Object obj2, zzgnc zzgncVar) throws GeneralSecurityException {
        zze(obj, obj2, zzgncVar, false);
        return this;
    }

    public final zzgaj zzb(@Nullable Object obj, @Nullable Object obj2, zzgnc zzgncVar) throws GeneralSecurityException {
        zze(obj, obj2, zzgncVar, true);
        return this;
    }

    public final zzgaj zzc(zzgjt zzgjtVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzgjtVar;
        return this;
    }

    public final zzgao zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzgao zzgaoVar = new zzgao(concurrentMap, this.zzc, this.zzd, this.zze, this.zza, null);
        this.zzb = null;
        return zzgaoVar;
    }
}
