package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzajv implements zzajn {
    final /* synthetic */ zzajw zza;
    private final zzfa zzb = new zzfa(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzajv(zzajw zzajwVar, int i) {
        this.zza = zzajwVar;
        this.zze = i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x0105  */
    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    @Override // com.google.android.gms.internal.ads.zzajn
    public final void zza(zzfb zzfbVar) {
        zzfi zzfiVar;
        int i;
        int i2;
        if (zzfbVar.zzl() != 2) {
            return;
        }
        zzfi zzfiVar2 = (zzfi) this.zza.zzb.get(0);
        if ((zzfbVar.zzl() & 128) == 0) {
            return;
        }
        zzfbVar.zzH(1);
        int iZzp = zzfbVar.zzp();
        int i3 = 3;
        zzfbVar.zzH(3);
        zzfbVar.zzB(this.zzb, 2);
        this.zzb.zzl(3);
        int i4 = 13;
        this.zza.zzq = this.zzb.zzd(13);
        zzfbVar.zzB(this.zzb, 2);
        int i5 = 4;
        this.zzb.zzl(4);
        int i6 = 12;
        zzfbVar.zzH(this.zzb.zzd(12));
        this.zzc.clear();
        this.zzd.clear();
        int iZza = zzfbVar.zza();
        while (iZza > 0) {
            int i7 = 5;
            zzfbVar.zzB(this.zzb, 5);
            int iZzd = this.zzb.zzd(8);
            this.zzb.zzl(i3);
            int iZzd2 = this.zzb.zzd(i4);
            this.zzb.zzl(i5);
            int iZzd3 = this.zzb.zzd(i6);
            int iZzc = zzfbVar.zzc();
            int i8 = iZzc + iZzd3;
            ArrayList arrayList = null;
            String strTrim = null;
            int i9 = -1;
            while (zzfbVar.zzc() < i8) {
                int iZzl = zzfbVar.zzl();
                int iZzc2 = zzfbVar.zzc() + zzfbVar.zzl();
                if (iZzc2 > i8) {
                    break;
                }
                if (iZzl == i7) {
                    long jZzt = zzfbVar.zzt();
                    if (jZzt == 1094921523) {
                        zzfiVar2 = zzfiVar2;
                        i2 = iZzp;
                        i9 = 129;
                    } else if (jZzt == 1161904947) {
                        zzfiVar2 = zzfiVar2;
                        i2 = iZzp;
                        i9 = 135;
                    } else if (jZzt == 1094921524) {
                        zzfiVar2 = zzfiVar2;
                        i2 = iZzp;
                        i9 = 172;
                    } else if (jZzt == 1212503619) {
                        zzfiVar2 = zzfiVar2;
                        i2 = iZzp;
                        i9 = 36;
                    } else {
                        i2 = iZzp;
                    }
                } else if (iZzl == 106) {
                    zzfiVar2 = zzfiVar2;
                    i2 = iZzp;
                    i9 = 129;
                } else if (iZzl == 122) {
                    zzfiVar2 = zzfiVar2;
                    i2 = iZzp;
                    i9 = 135;
                } else if (iZzl == 127) {
                    if (zzfbVar.zzl() == 21) {
                        zzfiVar2 = zzfiVar2;
                        i2 = iZzp;
                        i9 = 172;
                    } else {
                        i2 = iZzp;
                    }
                } else if (iZzl == 123) {
                    zzfiVar2 = zzfiVar2;
                    i2 = iZzp;
                    i9 = 138;
                } else if (iZzl == 10) {
                    strTrim = zzfbVar.zzy(i3, zzfqu.zzc).trim();
                    i2 = iZzp;
                } else if (iZzl == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (zzfbVar.zzc() < iZzc2) {
                        String strTrim2 = zzfbVar.zzy(i3, zzfqu.zzc).trim();
                        int iZzl2 = zzfbVar.zzl();
                        zzfi zzfiVar3 = zzfiVar2;
                        byte[] bArr = new byte[4];
                        zzfbVar.zzC(bArr, 0, 4);
                        arrayList2.add(new zzajx(strTrim2, iZzl2, bArr));
                        zzfiVar2 = zzfiVar3;
                        iZzp = iZzp;
                        i3 = 3;
                    }
                    zzfiVar2 = zzfiVar2;
                    i2 = iZzp;
                    arrayList = arrayList2;
                    i9 = 89;
                } else {
                    zzfiVar2 = zzfiVar2;
                    i2 = iZzp;
                    if (iZzl == 111) {
                        i9 = 257;
                    }
                }
                zzfbVar.zzH(iZzc2 - zzfbVar.zzc());
                zzfiVar2 = zzfiVar2;
                iZzp = i2;
                i3 = 3;
                i7 = 5;
            }
            zzfi zzfiVar4 = zzfiVar2;
            int i10 = iZzp;
            zzfbVar.zzG(i8);
            zzajy zzajyVar = new zzajy(i9, strTrim, arrayList, Arrays.copyOfRange(zzfbVar.zzI(), iZzc, i8));
            if (iZzd == 6 || iZzd == 5) {
                iZzd = zzajyVar.zza;
            }
            iZza -= iZzd3 + 5;
            if (!this.zza.zzg.get(iZzd2)) {
                zzakb zzakbVarZza = this.zza.zze.zza(iZzd, zzajyVar);
                this.zzd.put(iZzd2, iZzd2);
                this.zzc.put(iZzd2, zzakbVarZza);
            }
            zzfiVar2 = zzfiVar4;
            iZzp = i10;
            i3 = 3;
            i5 = 4;
            i6 = 12;
            i4 = 13;
        }
        zzfi zzfiVar5 = zzfiVar2;
        int i11 = iZzp;
        int size = this.zzd.size();
        int i12 = 0;
        while (i12 < size) {
            int iKeyAt = this.zzd.keyAt(i12);
            int iValueAt = this.zzd.valueAt(i12);
            this.zza.zzg.put(iKeyAt, true);
            this.zza.zzh.put(iValueAt, true);
            zzakb zzakbVar = (zzakb) this.zzc.valueAt(i12);
            if (zzakbVar != null) {
                zzabe zzabeVar = this.zza.zzk;
                i = i11;
                zzaka zzakaVar = new zzaka(i, iKeyAt, 8192);
                zzfiVar = zzfiVar5;
                zzakbVar.zzb(zzfiVar, zzabeVar, zzakaVar);
                this.zza.zzf.put(iValueAt, zzakbVar);
            } else {
                zzfiVar = zzfiVar5;
                i = i11;
            }
            i12++;
            zzfiVar5 = zzfiVar;
            i11 = i;
        }
        this.zza.zzf.remove(this.zze);
        this.zza.zzl = 0;
        zzajw zzajwVar = this.zza;
        if (zzajwVar.zzl == 0) {
            zzajwVar.zzk.zzC();
            this.zza.zzm = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final void zzb(zzfi zzfiVar, zzabe zzabeVar, zzaka zzakaVar) {
    }
}
