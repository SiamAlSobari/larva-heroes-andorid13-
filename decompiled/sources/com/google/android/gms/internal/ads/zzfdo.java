package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfdo implements zzfdn {
    private final ConcurrentHashMap zza;
    private final zzfdu zzb;
    private final zzfdq zzc = new zzfdq();

    public zzfdo(zzfdu zzfduVar) {
        this.zza = new ConcurrentHashMap(zzfduVar.zzd);
        this.zzb = zzfduVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfdu> creator = zzfdu.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgk)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfdx) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfdm) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int iZzb = ((zzfdm) entry.getValue()).zzb(); iZzb < this.zzb.zzd; iZzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfdm) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzcaa.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final zzfdu zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final synchronized zzfdw zzb(zzfdx zzfdxVar) {
        zzfdw zzfdwVarZze;
        zzfdm zzfdmVar = (zzfdm) this.zza.get(zzfdxVar);
        if (zzfdmVar != null) {
            zzfdwVarZze = zzfdmVar.zze();
            if (zzfdwVarZze == null) {
                this.zzc.zze();
            }
            zzfek zzfekVarZzf = zzfdmVar.zzf();
            if (zzfdwVarZze != null) {
                zzaxt zzaxtVarZza = zzaxz.zza();
                zzaxr zzaxrVarZza = zzaxs.zza();
                zzaxrVarZza.zzd(2);
                zzaxv zzaxvVarZza = zzaxw.zza();
                zzaxvVarZza.zza(zzfekVarZzf.zza);
                zzaxvVarZza.zzb(zzfekVarZzf.zzb);
                zzaxrVarZza.zza(zzaxvVarZza);
                zzaxtVarZza.zza(zzaxrVarZza);
                zzfdwVarZze.zza.zzb().zzc().zzi((zzaxz) zzaxtVarZza.zzal());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfdwVarZze = null;
        }
        return zzfdwVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    @Deprecated
    public final zzfdx zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfdy(zzlVar, str, new zzbur(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final synchronized boolean zzd(zzfdx zzfdxVar, zzfdw zzfdwVar) {
        boolean zZzh;
        zzfdm zzfdmVar = (zzfdm) this.zza.get(zzfdxVar);
        zzfdwVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        if (zzfdmVar == null) {
            zzfdu zzfduVar = this.zzb;
            zzfdmVar = new zzfdm(zzfduVar.zzd, zzfduVar.zze * 1000);
            int size = this.zza.size();
            zzfdu zzfduVar2 = this.zzb;
            if (size == zzfduVar2.zzc) {
                int i = zzfduVar2.zzg;
                int i2 = i - 1;
                zzfdx zzfdxVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long jZzc = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : this.zza.entrySet()) {
                        if (((zzfdm) entry.getValue()).zzc() < jZzc) {
                            jZzc = ((zzfdm) entry.getValue()).zzc();
                            zzfdxVar2 = (zzfdx) entry.getKey();
                        }
                    }
                    if (zzfdxVar2 != null) {
                        this.zza.remove(zzfdxVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry entry2 : this.zza.entrySet()) {
                        if (((zzfdm) entry2.getValue()).zzd() < jZzc) {
                            jZzc = ((zzfdm) entry2.getValue()).zzd();
                            zzfdxVar2 = (zzfdx) entry2.getKey();
                        }
                    }
                    if (zzfdxVar2 != null) {
                        this.zza.remove(zzfdxVar2);
                    }
                } else if (i2 == 2) {
                    int iZza = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : this.zza.entrySet()) {
                        if (((zzfdm) entry3.getValue()).zza() < iZza) {
                            iZza = ((zzfdm) entry3.getValue()).zza();
                            zzfdxVar2 = (zzfdx) entry3.getKey();
                        }
                    }
                    if (zzfdxVar2 != null) {
                        this.zza.remove(zzfdxVar2);
                    }
                }
                this.zzc.zzg();
            }
            this.zza.put(zzfdxVar, zzfdmVar);
            this.zzc.zzd();
        }
        zZzh = zzfdmVar.zzh(zzfdwVar);
        this.zzc.zzc();
        zzfdp zzfdpVarZza = this.zzc.zza();
        zzfek zzfekVarZzf = zzfdmVar.zzf();
        if (zzfdwVar != null) {
            zzaxt zzaxtVarZza = zzaxz.zza();
            zzaxr zzaxrVarZza = zzaxs.zza();
            zzaxrVarZza.zzd(2);
            zzaxx zzaxxVarZza = zzaxy.zza();
            zzaxxVarZza.zza(zzfdpVarZza.zza);
            zzaxxVarZza.zzb(zzfdpVarZza.zzb);
            zzaxxVarZza.zzc(zzfekVarZzf.zzb);
            zzaxrVarZza.zzc(zzaxxVarZza);
            zzaxtVarZza.zza(zzaxrVarZza);
            zzfdwVar.zza.zzb().zzc().zzj((zzaxz) zzaxtVarZza.zzal());
        }
        zzf();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final synchronized boolean zze(zzfdx zzfdxVar) {
        zzfdm zzfdmVar = (zzfdm) this.zza.get(zzfdxVar);
        if (zzfdmVar != null) {
            return zzfdmVar.zzb() < this.zzb.zzd;
        }
        return true;
    }
}
