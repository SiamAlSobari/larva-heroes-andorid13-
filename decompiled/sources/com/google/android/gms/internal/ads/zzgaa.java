package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgaa {
    private final List zza = new ArrayList();
    private final zzgjt zzb = zzgjt.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzfzy) it.next()).zza = false;
        }
    }

    public final zzgaa zza(zzfzy zzfzyVar) {
        if (zzfzyVar.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzfzyVar.zza) {
            zzd();
        }
        zzfzyVar.zzf = this;
        this.zza.add(zzfzyVar);
        return this;
    }

    public final zzgad zzb() throws GeneralSecurityException {
        int i;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        zzgna zzgnaVarZzd = zzgnd.zzd();
        List list = this.zza;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            if (((zzfzy) list.get(i2)).zze == zzfzz.zza && ((zzfzy) list.get(i2 + 1)).zze != zzfzz.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzfzy zzfzyVar : this.zza) {
            zzfzu unused = zzfzyVar.zzb;
            if (zzfzyVar.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i3 = 3;
            if (zzfzyVar.zze == zzfzz.zza) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i4 = 0;
                    while (i4 == 0) {
                        secureRandom.nextBytes(bArr);
                        i4 = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
                    i = i4;
                }
            } else {
                zzfzz unused2 = zzfzyVar.zze;
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            zzfzy.zza(zzfzyVar);
            zzgah zzgahVar = zzfzyVar.zzd;
            zzfzu zzfzuVarZzc = zzfzyVar.zzc();
            if (!zzfzu.zza.equals(zzfzuVarZzc)) {
                if (zzfzu.zzb.equals(zzfzuVarZzc)) {
                    i3 = 4;
                } else {
                    if (!zzfzu.zzc.equals(zzfzuVarZzc)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i3 = 5;
                }
            }
            zzghd zzghdVar = (zzghd) (zzgahVar instanceof zzgfz ? ((zzgfz) zzgahVar).zza() : zzggi.zzc().zzd(zzgahVar, zzghd.class));
            zzgmq zzgmqVarZza = zzgar.zza(zzghdVar.zzc());
            zzgnb zzgnbVarZzd = zzgnc.zzd();
            zzgnbVarZzd.zzb(i);
            zzgnbVarZzd.zzd(i3);
            zzgnbVarZzd.zza(zzgmqVarZza);
            zzgnbVarZzd.zzc(zzghdVar.zzc().zzf());
            zzgnaVarZzd.zza((zzgnc) zzgnbVarZzd.zzal());
            if (zzfzyVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = numValueOf;
            }
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzgnaVarZzd.zzb(num.intValue());
        return zzgad.zzb((zzgnd) zzgnaVarZzd.zzal(), this.zzb);
    }
}
