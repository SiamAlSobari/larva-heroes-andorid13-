package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzic implements zzil {
    private final zzhy zza;
    private final zzjf zzb;
    private final boolean zzc;
    private final zzga zzd;

    private zzic(zzjf zzjfVar, zzga zzgaVar, zzhy zzhyVar) {
        this.zzb = zzjfVar;
        this.zzc = zzgaVar.zzj(zzhyVar);
        this.zzd = zzgaVar;
        this.zza = zzhyVar;
    }

    static zzic zzc(zzjf zzjfVar, zzga zzgaVar, zzhy zzhyVar) {
        return new zzic(zzjfVar, zzgaVar, zzhyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final int zza(Object obj) {
        zzjf zzjfVar = this.zzb;
        int iZzb = zzjfVar.zzb(zzjfVar.zzd(obj));
        return this.zzc ? iZzb + this.zzd.zzb(obj).zzb() : iZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final Object zze() {
        zzhy zzhyVar = this.zza;
        return zzhyVar instanceof zzgo ? ((zzgo) zzhyVar).zzs() : zzhyVar.zzV().zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzg(Object obj, Object obj2) {
        zzin.zzE(this.zzb, obj, obj2);
        if (this.zzc) {
            zzin.zzD(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzh(Object obj, zzik zzikVar, zzfz zzfzVar) throws IOException {
        boolean zZzO;
        zzjf zzjfVar = this.zzb;
        zzga zzgaVar = this.zzd;
        Object objZzc = zzjfVar.zzc(obj);
        zzge zzgeVarZzc = zzgaVar.zzc(obj);
        while (zzikVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzikVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZzd = zzgaVar.zzd(zzfzVar, this.zza, iZzd >>> 3);
                        if (objZzd != null) {
                            zzgaVar.zzg(zzikVar, objZzd, zzfzVar, zzgeVarZzc);
                        } else {
                            zZzO = zzjfVar.zzr(objZzc, zzikVar);
                        }
                    } else {
                        zZzO = zzikVar.zzO();
                    }
                    if (!zZzO) {
                        zzjfVar.zzn(obj, objZzc);
                        return;
                    }
                } else {
                    Object objZzd2 = null;
                    zzez zzezVarZzp = null;
                    int iZzj = 0;
                    while (zzikVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzikVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzikVar.zzj();
                            objZzd2 = zzgaVar.zzd(zzfzVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZzd2 != null) {
                                zzgaVar.zzg(zzikVar, objZzd2, zzfzVar, zzgeVarZzc);
                            } else {
                                zzezVarZzp = zzikVar.zzp();
                            }
                        } else if (!zzikVar.zzO()) {
                            break;
                        }
                    }
                    if (zzikVar.zzd() != 12) {
                        throw zzgy.zzb();
                    }
                    if (zzezVarZzp != null) {
                        if (objZzd2 != null) {
                            zzgaVar.zzh(zzezVarZzp, objZzd2, zzfzVar, zzgeVarZzc);
                        } else {
                            zzjfVar.zzk(objZzc, iZzj, zzezVarZzp);
                        }
                    }
                }
            } catch (Throwable th) {
                zzjfVar.zzn(obj, objZzc);
                throw th;
            }
        }
        zzjfVar.zzn(obj, objZzc);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:57:0x0088 A[EDGE_INSN: B:57:0x0088->B:34:0x0088 BREAK  A[LOOP:1: B:18:0x004a->B:62:0x004a], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzem zzemVar) throws IOException {
        zzgo zzgoVar = (zzgo) obj;
        zzjg zzjgVarZzf = zzgoVar.zzc;
        if (zzjgVarZzf == zzjg.zzc()) {
            zzjgVarZzf = zzjg.zzf();
            zzgoVar.zzc = zzjgVarZzf;
        }
        ((zzgk) obj).zzi();
        Object objZzd = null;
        while (i < i2) {
            int iZzj = zzen.zzj(bArr, i, zzemVar);
            int i3 = zzemVar.zza;
            if (i3 == 11) {
                int i4 = 0;
                zzez zzezVar = null;
                while (iZzj < i2) {
                    iZzj = zzen.zzj(bArr, iZzj, zzemVar);
                    int i5 = zzemVar.zza;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 == 2) {
                        if (i7 != 0) {
                            if (i5 != 12) {
                                break;
                                break;
                            }
                            iZzj = zzen.zzp(i5, bArr, iZzj, i2, zzemVar);
                        } else {
                            iZzj = zzen.zzj(bArr, iZzj, zzemVar);
                            i4 = zzemVar.zza;
                            objZzd = this.zzd.zzd(zzemVar.zzd, this.zza, i4);
                        }
                    } else {
                        if (i6 == 3) {
                            if (objZzd != null) {
                                int i8 = zzih.zza;
                                throw null;
                            }
                            if (i7 == 2) {
                                iZzj = zzen.zza(bArr, iZzj, zzemVar);
                                zzezVar = (zzez) zzemVar.zzc;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            iZzj = zzen.zzp(i5, bArr, iZzj, i2, zzemVar);
                        }
                    }
                }
                if (zzezVar != null) {
                    zzjgVarZzf.zzj((i4 << 3) | 2, zzezVar);
                }
                i = iZzj;
            } else if ((i3 & 7) == 2) {
                objZzd = this.zzd.zzd(zzemVar.zzd, this.zza, i3 >>> 3);
                if (objZzd != null) {
                    int i9 = zzih.zza;
                    throw null;
                }
                i = zzen.zzi(i3, bArr, iZzj, i2, zzjgVarZzf, zzemVar);
            } else {
                i = zzen.zzp(i3, bArr, iZzj, i2, zzemVar);
            }
        }
        if (i != i2) {
            throw zzgy.zzg();
        }
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzj(Object obj, zzjx zzjxVar) throws IOException {
        Iterator itZzf = this.zzd.zzb(obj).zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzgd zzgdVar = (zzgd) entry.getKey();
            if (zzgdVar.zze() != zzjw.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzgdVar.zzg();
            zzgdVar.zzf();
            if (entry instanceof zzhb) {
                zzjxVar.zzw(zzgdVar.zza(), ((zzhb) entry).zza().zzb());
            } else {
                zzjxVar.zzw(zzgdVar.zza(), entry.getValue());
            }
        }
        zzjf zzjfVar = this.zzb;
        zzjfVar.zzp(zzjfVar.zzd(obj), zzjxVar);
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final boolean zzk(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final boolean zzl(Object obj) {
        return this.zzd.zzb(obj).zzk();
    }
}
