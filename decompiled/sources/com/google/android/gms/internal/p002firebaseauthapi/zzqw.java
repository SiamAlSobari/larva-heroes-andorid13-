package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzqw implements zzcm {
    private static final zzqw zza = new zzqw();
    private static final zzof zzb = zzof.zzb(new zzod() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqt
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzod
        public final Object zza(zzbn zzbnVar) {
            return zzrl.zzb((zzni) zzbnVar);
        }
    }, zzni.class, zzcd.class);

    zzqw() {
    }

    public static void zzd() throws GeneralSecurityException {
        zzcq.zzh(zza);
        zznq.zza().zze(zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final Class zza() {
        return zzcd.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final Class zzb() {
        return zzcd.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final /* bridge */ /* synthetic */ Object zzc(zzcl zzclVar) throws GeneralSecurityException {
        Iterator it = zzclVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzch zzchVar : (List) it.next()) {
                if (zzchVar.zzb() instanceof zzqr) {
                    zzqr zzqrVar = (zzqr) zzchVar.zzb();
                    zzzo zzzoVarZzb = zzzo.zzb(zzchVar.zzg());
                    if (!zzzoVarZzb.equals(zzqrVar.zzc())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + String.valueOf(zzqrVar.zzb()) + " has wrong output prefix (" + zzqrVar.zzc().toString() + ") instead of (" + zzzoVarZzb.toString() + ")");
                    }
                }
            }
        }
        return new zzqv(zzclVar, null);
    }
}
