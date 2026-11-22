package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzuk implements zzzg {
    private final zzuj zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzuk(zzuj zzujVar) {
        byte[] bArr = zzxs.zzd;
        this.zza = zzujVar;
        zzujVar.zzc = this;
    }

    private final Object zzR(zzzh zzzhVar, zzwt zzwtVar) throws IOException {
        Object objZze = zzzhVar.zze();
        zzT(objZze, zzzhVar, zzwtVar);
        zzzhVar.zzf(objZze);
        return objZze;
    }

    private final Object zzS(zzzh zzzhVar, zzwt zzwtVar) throws IOException {
        Object objZze = zzzhVar.zze();
        zzU(objZze, zzzhVar, zzwtVar);
        zzzhVar.zzf(objZze);
        return objZze;
    }

    private final void zzT(Object obj, zzzh zzzhVar, zzwt zzwtVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzzhVar.zzh(obj, this, zzwtVar);
            if (this.zzb != this.zzc) {
                throw zzxu.zzg();
            }
            this.zzc = i;
        } catch (Throwable th) {
            this.zzc = i;
            throw th;
        }
    }

    private final void zzU(Object obj, zzzh zzzhVar, zzwt zzwtVar) throws IOException {
        int iZzn = this.zza.zzn();
        zzuj zzujVar = this.zza;
        if (zzujVar.zza >= zzujVar.zzb) {
            throw new zzxu("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZze = zzujVar.zze(iZzn);
        this.zza.zza++;
        zzzhVar.zzh(obj, this, zzwtVar);
        this.zza.zzz(0);
        zzuj zzujVar2 = this.zza;
        zzujVar2.zza--;
        zzujVar2.zzA(iZze);
    }

    private final void zzV(int i) throws IOException {
        if (this.zza.zzd() != i) {
            throw zzxu.zzj();
        }
    }

    private final void zzW(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzxu.zza();
        }
    }

    private static final void zzX(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzxu.zzg();
        }
    }

    private static final void zzY(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzxu.zzg();
        }
    }

    public static zzuk zzq(zzuj zzujVar) {
        zzuk zzukVar = zzujVar.zzc;
        return zzukVar != null ? zzukVar : new zzuk(zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzA(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzxk)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i != 2) {
                throw zzxu.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzd() < iZzd);
            zzV(iZzd);
            return;
        }
        zzxk zzxkVar = (zzxk) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzxkVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzxu.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzxkVar.zzh(this.zza.zzf());
        } while (this.zza.zzd() < iZzd2);
        zzV(iZzd2);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzB(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzxk)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zzxu.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            this.zzd = iZzm;
            return;
        }
        zzxk zzxkVar = (zzxk) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int iZzn2 = this.zza.zzn();
            zzX(iZzn2);
            int iZzd2 = this.zza.zzd() + iZzn2;
            do {
                zzxkVar.zzh(this.zza.zzg());
            } while (this.zza.zzd() < iZzd2);
            return;
        }
        if (i2 != 5) {
            throw zzxu.zza();
        }
        do {
            zzxkVar.zzh(this.zza.zzg());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm2 = this.zza.zzm();
            }
        } while (iZzm2 == this.zzb);
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzC(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzyj)) {
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i != 2) {
                throw zzxu.zza();
            }
            int iZzn = this.zza.zzn();
            zzY(iZzn);
            int iZzd = this.zza.zzd() + iZzn;
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzd() < iZzd);
            return;
        }
        zzyj zzyjVar = (zzyj) list;
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                zzyjVar.zzf(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzxu.zza();
        }
        int iZzn2 = this.zza.zzn();
        zzY(iZzn2);
        int iZzd2 = this.zza.zzd() + iZzn2;
        do {
            zzyjVar.zzf(this.zza.zzo());
        } while (this.zza.zzd() < iZzd2);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzD(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzxa)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zzxu.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            this.zzd = iZzm;
            return;
        }
        zzxa zzxaVar = (zzxa) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int iZzn2 = this.zza.zzn();
            zzX(iZzn2);
            int iZzd2 = this.zza.zzd() + iZzn2;
            do {
                zzxaVar.zze(this.zza.zzc());
            } while (this.zza.zzd() < iZzd2);
            return;
        }
        if (i2 != 5) {
            throw zzxu.zza();
        }
        do {
            zzxaVar.zze(this.zza.zzc());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm2 = this.zza.zzm();
            }
        } while (iZzm2 == this.zzb);
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    @Deprecated
    public final void zzE(List list, zzzh zzzhVar, zzwt zzwtVar) throws IOException {
        int iZzm;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzxu.zza();
        }
        do {
            list.add(zzR(zzzhVar, zzwtVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzF(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzxk)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i != 2) {
                throw zzxu.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzd() < iZzd);
            zzV(iZzd);
            return;
        }
        zzxk zzxkVar = (zzxk) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzxkVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzxu.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzxkVar.zzh(this.zza.zzh());
        } while (this.zza.zzd() < iZzd2);
        zzV(iZzd2);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzG(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzyj)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i != 2) {
                throw zzxu.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzd() < iZzd);
            zzV(iZzd);
            return;
        }
        zzyj zzyjVar = (zzyj) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzyjVar.zzf(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzxu.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzyjVar.zzf(this.zza.zzp());
        } while (this.zza.zzd() < iZzd2);
        zzV(iZzd2);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzH(List list, zzzh zzzhVar, zzwt zzwtVar) throws IOException {
        int iZzm;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzxu.zza();
        }
        do {
            list.add(zzS(zzzhVar, zzwtVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzI(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzxk)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zzxu.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            this.zzd = iZzm;
            return;
        }
        zzxk zzxkVar = (zzxk) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int iZzn2 = this.zza.zzn();
            zzX(iZzn2);
            int iZzd2 = this.zza.zzd() + iZzn2;
            do {
                zzxkVar.zzh(this.zza.zzk());
            } while (this.zza.zzd() < iZzd2);
            return;
        }
        if (i2 != 5) {
            throw zzxu.zza();
        }
        do {
            zzxkVar.zzh(this.zza.zzk());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm2 = this.zza.zzm();
            }
        } while (iZzm2 == this.zzb);
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzJ(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzyj)) {
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i != 2) {
                throw zzxu.zza();
            }
            int iZzn = this.zza.zzn();
            zzY(iZzn);
            int iZzd = this.zza.zzd() + iZzn;
            do {
                list.add(Long.valueOf(this.zza.zzt()));
            } while (this.zza.zzd() < iZzd);
            return;
        }
        zzyj zzyjVar = (zzyj) list;
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                zzyjVar.zzf(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzxu.zza();
        }
        int iZzn2 = this.zza.zzn();
        zzY(iZzn2);
        int iZzd2 = this.zza.zzd() + iZzn2;
        do {
            zzyjVar.zzf(this.zza.zzt());
        } while (this.zza.zzd() < iZzd2);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzK(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzxk)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i != 2) {
                throw zzxu.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
            } while (this.zza.zzd() < iZzd);
            zzV(iZzd);
            return;
        }
        zzxk zzxkVar = (zzxk) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzxkVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzxu.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzxkVar.zzh(this.zza.zzl());
        } while (this.zza.zzd() < iZzd2);
        zzV(iZzd2);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzL(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzyj)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i != 2) {
                throw zzxu.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzu()));
            } while (this.zza.zzd() < iZzd);
            zzV(iZzd);
            return;
        }
        zzyj zzyjVar = (zzyj) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzyjVar.zzf(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzxu.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzyjVar.zzf(this.zza.zzu());
        } while (this.zza.zzd() < iZzd2);
        zzV(iZzd2);
    }

    public final void zzM(List list, boolean z) throws IOException {
        int iZzm;
        int iZzm2;
        if ((this.zzb & 7) != 2) {
            throw zzxu.zza();
        }
        if (!(list instanceof zzyc) || z) {
            do {
                list.add(z ? zzu() : zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            this.zzd = iZzm;
            return;
        }
        zzyc zzycVar = (zzyc) list;
        do {
            zzycVar.zzi(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm2 = this.zza.zzm();
            }
        } while (iZzm2 == this.zzb);
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzN(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzxk)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i != 2) {
                throw zzxu.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
            } while (this.zza.zzd() < iZzd);
            zzV(iZzd);
            return;
        }
        zzxk zzxkVar = (zzxk) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzxkVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzxu.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzxkVar.zzh(this.zza.zzn());
        } while (this.zza.zzd() < iZzd2);
        zzV(iZzd2);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzO(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzyj)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i != 2) {
                throw zzxu.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzv()));
            } while (this.zza.zzd() < iZzd);
            zzV(iZzd);
            return;
        }
        zzyj zzyjVar = (zzyj) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzyjVar.zzf(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzxu.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzyjVar.zzf(this.zza.zzv());
        } while (this.zza.zzd() < iZzd2);
        zzV(iZzd2);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final boolean zzP() throws IOException {
        zzW(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final boolean zzQ() throws IOException {
        int i;
        if (this.zza.zzC() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final double zza() throws IOException {
        zzW(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final float zzb() throws IOException {
        zzW(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final int zzc() throws IOException {
        int iZzm = this.zzd;
        if (iZzm != 0) {
            this.zzb = iZzm;
            this.zzd = 0;
        } else {
            iZzm = this.zza.zzm();
            this.zzb = iZzm;
        }
        if (iZzm == 0 || iZzm == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZzm >>> 3;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final int zze() throws IOException {
        zzW(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final int zzf() throws IOException {
        zzW(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final int zzg() throws IOException {
        zzW(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final int zzh() throws IOException {
        zzW(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final int zzi() throws IOException {
        zzW(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final int zzj() throws IOException {
        zzW(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final long zzk() throws IOException {
        zzW(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final long zzl() throws IOException {
        zzW(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final long zzm() throws IOException {
        zzW(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final long zzn() throws IOException {
        zzW(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final long zzo() throws IOException {
        zzW(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final zzud zzp() throws IOException {
        zzW(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    @Deprecated
    public final Object zzr(Class cls, zzwt zzwtVar) throws IOException {
        zzW(3);
        return zzR(zzzd.zza().zzb(cls), zzwtVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final Object zzs(Class cls, zzwt zzwtVar) throws IOException {
        zzW(2);
        return zzS(zzzd.zza().zzb(cls), zzwtVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final String zzt() throws IOException {
        zzW(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final String zzu() throws IOException {
        zzW(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzv(Object obj, zzzh zzzhVar, zzwt zzwtVar) throws IOException {
        zzW(3);
        zzT(obj, zzzhVar, zzwtVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzw(Object obj, zzzh zzzhVar, zzwt zzwtVar) throws IOException {
        zzW(2);
        zzU(obj, zzzhVar, zzwtVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzx(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzts)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i != 2) {
                throw zzxu.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
            } while (this.zza.zzd() < iZzd);
            zzV(iZzd);
            return;
        }
        zzts zztsVar = (zzts) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zztsVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzxu.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zztsVar.zze(this.zza.zzD());
        } while (this.zza.zzd() < iZzd2);
        zzV(iZzd2);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzy(List list) throws IOException {
        int iZzm;
        if ((this.zzb & 7) != 2) {
            throw zzxu.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == this.zzb);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzz(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzwq)) {
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i != 2) {
                throw zzxu.zza();
            }
            int iZzn = this.zza.zzn();
            zzY(iZzn);
            int iZzd = this.zza.zzd() + iZzn;
            do {
                list.add(Double.valueOf(this.zza.zzb()));
            } while (this.zza.zzd() < iZzd);
            return;
        }
        zzwq zzwqVar = (zzwq) list;
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                zzwqVar.zze(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i2 != 2) {
            throw zzxu.zza();
        }
        int iZzn2 = this.zza.zzn();
        zzY(iZzn2);
        int iZzd2 = this.zza.zzd() + iZzn2;
        do {
            zzwqVar.zze(this.zza.zzb());
        } while (this.zza.zzd() < iZzd2);
    }
}
