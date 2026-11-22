package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsw implements zzvj {
    public final zzvj zza;
    final /* synthetic */ zzsx zzb;
    private boolean zzc;

    public zzsw(zzsx zzsxVar, zzvj zzvjVar) {
        this.zzb = zzsxVar;
        this.zza = zzvjVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zza(zzkn zzknVar, zzht zzhtVar, int i) {
        zzsx zzsxVar = this.zzb;
        if (zzsxVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhtVar.zzc(4);
            return -4;
        }
        long jZzb = zzsxVar.zzb();
        int iZza = this.zza.zza(zzknVar, zzhtVar, i);
        if (iZza != -5) {
            long j = this.zzb.zzb;
            if (j == Long.MIN_VALUE || ((iZza != -4 || zzhtVar.zzd < j) && !(iZza == -3 && jZzb == Long.MIN_VALUE && !zzhtVar.zzc))) {
                return iZza;
            }
            zzhtVar.zzb();
            zzhtVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        zzam zzamVar = zzknVar.zza;
        zzamVar.getClass();
        int i2 = zzamVar.zzC;
        if (i2 != 0) {
            int i3 = this.zzb.zzb == Long.MIN_VALUE ? zzamVar.zzD : 0;
            zzak zzakVarZzb = zzamVar.zzb();
            zzakVarZzb.zzC(i2);
            zzakVarZzb.zzD(i3);
            zzknVar.zza = zzakVarZzb.zzY();
        } else if (zzamVar.zzD != 0) {
            i2 = 0;
            if (this.zzb.zzb == Long.MIN_VALUE) {
            }
            zzak zzakVarZzb2 = zzamVar.zzb();
            zzakVarZzb2.zzC(i2);
            zzakVarZzb2.zzD(i3);
            zzknVar.zza = zzakVarZzb2.zzY();
        }
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
