package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyy implements zzzh {
    private final zzyu zza;
    private final zzzy zzb;
    private final boolean zzc;
    private final zzwu zzd;

    private zzyy(zzzy zzzyVar, zzwu zzwuVar, zzyu zzyuVar) {
        this.zzb = zzzyVar;
        this.zzc = zzwuVar.zzi(zzyuVar);
        this.zzd = zzwuVar;
        this.zza = zzyuVar;
    }

    static zzyy zzc(zzzy zzzyVar, zzwu zzwuVar, zzyu zzyuVar) {
        return new zzyy(zzzyVar, zzwuVar, zzyuVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final int zza(Object obj) {
        zzzy zzzyVar = this.zzb;
        int iZzb = zzzyVar.zzb(zzzyVar.zzd(obj));
        return this.zzc ? iZzb + this.zzd.zzb(obj).zzc() : iZzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final Object zze() {
        zzyu zzyuVar = this.zza;
        return zzyuVar instanceof zzxj ? ((zzxj) zzyuVar).zzad() : zzyuVar.zzau().zzE();
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final void zzg(Object obj, Object obj2) {
        zzzj.zzD(this.zzb, obj, obj2);
        if (this.zzc) {
            zzzj.zzC(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final void zzh(Object obj, zzzg zzzgVar, zzwt zzwtVar) throws IOException {
        boolean zZzQ;
        zzzy zzzyVar = this.zzb;
        zzwu zzwuVar = this.zzd;
        Object objZzc = zzzyVar.zzc(obj);
        zzwy zzwyVarZzc = zzwuVar.zzc(obj);
        while (zzzgVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzzgVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZzd = zzwuVar.zzd(zzwtVar, this.zza, iZzd >>> 3);
                        if (objZzd != null) {
                            zzwuVar.zzg(zzzgVar, objZzd, zzwtVar, zzwyVarZzc);
                        } else {
                            zZzQ = zzzyVar.zzp(objZzc, zzzgVar);
                        }
                    } else {
                        zZzQ = zzzgVar.zzQ();
                    }
                    if (!zZzQ) {
                        zzzyVar.zzn(obj, objZzc);
                        return;
                    }
                } else {
                    Object objZzd2 = null;
                    zzud zzudVarZzp = null;
                    int iZzj = 0;
                    while (zzzgVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzzgVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzzgVar.zzj();
                            objZzd2 = zzwuVar.zzd(zzwtVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZzd2 != null) {
                                zzwuVar.zzg(zzzgVar, objZzd2, zzwtVar, zzwyVarZzc);
                            } else {
                                zzudVarZzp = zzzgVar.zzp();
                            }
                        } else if (!zzzgVar.zzQ()) {
                            break;
                        }
                    }
                    if (zzzgVar.zzd() != 12) {
                        throw zzxu.zzb();
                    }
                    if (zzudVarZzp != null) {
                        if (objZzd2 != null) {
                            zzwuVar.zzh(zzudVarZzp, objZzd2, zzwtVar, zzwyVarZzc);
                        } else {
                            zzzyVar.zzk(objZzc, iZzj, zzudVarZzp);
                        }
                    }
                }
            } catch (Throwable th) {
                zzzyVar.zzn(obj, objZzc);
                throw th;
            }
        }
        zzzyVar.zzn(obj, objZzc);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf A[EDGE_INSN: B:58:0x00bf->B:33:0x00bf BREAK  A[LOOP:1: B:18:0x0067->B:61:0x0067], SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzzh
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zztp zztpVar) throws IOException {
        zzxj zzxjVar = (zzxj) obj;
        zzzz zzzzVarZzf = zzxjVar.zzc;
        if (zzzzVarZzf == zzzz.zzc()) {
            zzzzVarZzf = zzzz.zzf();
            zzxjVar.zzc = zzzzVarZzf;
        }
        zzwy zzwyVarZzT = ((zzxf) obj).zzT();
        Object objZzd = null;
        while (i < i2) {
            int iZzj = zztq.zzj(bArr, i, zztpVar);
            int i3 = zztpVar.zza;
            if (i3 == 11) {
                int i4 = 0;
                zzud zzudVar = null;
                while (iZzj < i2) {
                    iZzj = zztq.zzj(bArr, iZzj, zztpVar);
                    int i5 = zztpVar.zza;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 == 2) {
                        if (i7 != 0) {
                            if (i5 != 12) {
                                break;
                                break;
                            }
                            iZzj = zztq.zzp(i5, bArr, iZzj, i2, zztpVar);
                        } else {
                            iZzj = zztq.zzj(bArr, iZzj, zztpVar);
                            i4 = zztpVar.zza;
                            objZzd = this.zzd.zzd(zztpVar.zzd, this.zza, i4);
                        }
                    } else {
                        if (i6 == 3) {
                            if (objZzd != null) {
                                zzxh zzxhVar = (zzxh) objZzd;
                                iZzj = zztq.zzd(zzzd.zza().zzb(zzxhVar.zzc.getClass()), bArr, iZzj, i2, zztpVar);
                                zzwyVarZzT.zzk(zzxhVar.zzd, zztpVar.zzc);
                            } else if (i7 == 2) {
                                iZzj = zztq.zza(bArr, iZzj, zztpVar);
                                zzudVar = (zzud) zztpVar.zzc;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            iZzj = zztq.zzp(i5, bArr, iZzj, i2, zztpVar);
                        }
                    }
                }
                if (zzudVar != null) {
                    zzzzVarZzf.zzj((i4 << 3) | 2, zzudVar);
                }
                i = iZzj;
            } else if ((i3 & 7) == 2) {
                Object objZzd2 = this.zzd.zzd(zztpVar.zzd, this.zza, i3 >>> 3);
                if (objZzd2 != null) {
                    zzxh zzxhVar2 = (zzxh) objZzd2;
                    i = zztq.zzd(zzzd.zza().zzb(zzxhVar2.zzc.getClass()), bArr, iZzj, i2, zztpVar);
                    zzwyVarZzT.zzk(zzxhVar2.zzd, zztpVar.zzc);
                } else {
                    i = zztq.zzi(i3, bArr, iZzj, i2, zzzzVarZzf, zztpVar);
                }
                objZzd = objZzd2;
            } else {
                i = zztq.zzp(i3, bArr, iZzj, i2, zztpVar);
            }
        }
        if (i != i2) {
            throw zzxu.zzg();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final boolean zzk(Object obj) {
        return this.zzd.zzb(obj).zzm();
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final void zzm(Object obj, zzur zzurVar) throws IOException {
        Iterator itZzg = this.zzd.zzb(obj).zzg();
        while (itZzg.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzg.next();
            zzwx zzwxVar = (zzwx) entry.getKey();
            if (zzwxVar.zze() != zzaap.MESSAGE || zzwxVar.zzg()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzwxVar.zzf();
            if (entry instanceof zzxx) {
                zzurVar.zzw(zzwxVar.zza(), ((zzxx) entry).zza().zzb());
            } else {
                zzurVar.zzw(zzwxVar.zza(), entry.getValue());
            }
        }
        zzzy zzzyVar = this.zzb;
        zzzyVar.zzr(zzzyVar.zzd(obj), zzurVar);
    }
}
