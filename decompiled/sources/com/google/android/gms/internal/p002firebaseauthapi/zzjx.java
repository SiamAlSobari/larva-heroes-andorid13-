package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzjx extends zzlg {
    private static final Set zza = (Set) zzpc.zza(new zzpb() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjp
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpb
        public final Object zza() throws GeneralSecurityException {
            HashSet hashSet = new HashSet();
            zzev zzevVarZzc = zzey.zzc();
            zzevVarZzc.zza(12);
            zzevVarZzc.zzb(16);
            zzevVarZzc.zzc(16);
            zzevVarZzc.zzd(zzew.zzc);
            hashSet.add(zzevVarZzc.zze());
            zzev zzevVarZzc2 = zzey.zzc();
            zzevVarZzc2.zza(12);
            zzevVarZzc2.zzb(32);
            zzevVarZzc2.zzc(16);
            zzevVarZzc2.zzd(zzew.zzc);
            hashSet.add(zzevVarZzc2.zze());
            zzdj zzdjVarZzf = zzdn.zzf();
            zzdjVarZzf.zza(16);
            zzdjVarZzf.zzc(32);
            zzdjVarZzf.zze(16);
            zzdjVarZzf.zzd(16);
            zzdjVarZzf.zzb(zzdk.zzc);
            zzdjVarZzf.zzf(zzdl.zzc);
            hashSet.add(zzdjVarZzf.zzg());
            zzdj zzdjVarZzf2 = zzdn.zzf();
            zzdjVarZzf2.zza(32);
            zzdjVarZzf2.zzc(32);
            zzdjVarZzf2.zze(32);
            zzdjVarZzf2.zzd(16);
            zzdjVarZzf2.zzb(zzdk.zzc);
            zzdjVarZzf2.zzf(zzdl.zzc);
            hashSet.add(zzdjVarZzf2.zzg());
            hashSet.add(zzhr.zzc());
            zzit zzitVarZzc = zziw.zzc();
            zzitVarZzc.zza(64);
            zzitVarZzc.zzb(zziu.zzc);
            hashSet.add(zzitVarZzc.zzc());
            return Collections.unmodifiableSet(hashSet);
        }
    });
    private final zzjs zzb;
    private final zzjt zzc;

    @Nullable
    private final zzju zzd;
    private final zzjv zze;
    private final zzce zzf;

    @Nullable
    private final zzzo zzg;

    /* synthetic */ zzjx(zzjs zzjsVar, zzjt zzjtVar, zzju zzjuVar, zzce zzceVar, zzjv zzjvVar, zzzo zzzoVar, zzjw zzjwVar) {
        this.zzb = zzjsVar;
        this.zzc = zzjtVar;
        this.zzd = zzjuVar;
        this.zzf = zzceVar;
        this.zze = zzjvVar;
        this.zzg = zzzoVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjx)) {
            return false;
        }
        zzjx zzjxVar = (zzjx) obj;
        return zzjo.zza(zzjxVar.zzb, this.zzb) && zzjo.zza(zzjxVar.zzc, this.zzc) && zzjo.zza(zzjxVar.zzd, this.zzd) && zzjo.zza(zzjxVar.zzf, this.zzf) && zzjo.zza(zzjxVar.zze, this.zze) && zzjo.zza(zzjxVar.zzg, this.zzg);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzjx.class, this.zzb, this.zzc, this.zzd, this.zzf, this.zze, this.zzg});
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.zzb, this.zzc, this.zzd, this.zzf, this.zze, this.zzg);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        throw null;
    }

    public final zzce zzb() {
        return this.zzf;
    }

    public final zzjs zzc() {
        return this.zzb;
    }

    public final zzjt zzd() {
        return this.zzc;
    }

    public final zzju zze() {
        return this.zzd;
    }

    public final zzjv zzf() {
        return this.zze;
    }

    @Nullable
    public final zzzo zzg() {
        return this.zzg;
    }
}
