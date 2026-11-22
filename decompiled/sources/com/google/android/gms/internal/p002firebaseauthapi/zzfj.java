package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfj extends zznf {
    final /* synthetic */ zzfk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfj(zzfk zzfkVar, Class cls) {
        super(cls);
        this.zza = zzfkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        zztl zztlVarZzb = zztm.zzb();
        byte[] bArrZzb = zzor.zzb(((zztp) zzalpVar).zza());
        zztlVarZzb.zza(zzajf.zzn(bArrZzb, 0, bArrZzb.length));
        zztlVarZzb.zzb(0);
        return (zztm) zztlVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zztp.zze(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        zzfm zzfmVar = new zzfm(null);
        zzfmVar.zza(16);
        zzfmVar.zzb(zzfn.zza);
        map.put("AES128_GCM_SIV", zzfmVar.zzc());
        zzfm zzfmVar2 = new zzfm(null);
        zzfmVar2.zza(16);
        zzfmVar2.zzb(zzfn.zzc);
        map.put("AES128_GCM_SIV_RAW", zzfmVar2.zzc());
        zzfm zzfmVar3 = new zzfm(null);
        zzfmVar3.zza(32);
        zzfmVar3.zzb(zzfn.zza);
        map.put("AES256_GCM_SIV", zzfmVar3.zzc());
        zzfm zzfmVar4 = new zzfm(null);
        zzfmVar4.zza(32);
        zzfmVar4.zzb(zzfn.zzc);
        map.put("AES256_GCM_SIV_RAW", zzfmVar4.zzc());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
        zzzl.zzb(((zztp) zzalpVar).zza());
    }
}
