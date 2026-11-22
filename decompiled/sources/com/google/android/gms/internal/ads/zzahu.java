package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzahu extends zzahy {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzahu() {
    }

    public static boolean zzd(zzfb zzfbVar) {
        return zzk(zzfbVar, zza);
    }

    private static boolean zzk(zzfb zzfbVar, byte[] bArr) {
        if (zzfbVar.zza() < 8) {
            return false;
        }
        int iZzc = zzfbVar.zzc();
        byte[] bArr2 = new byte[8];
        zzfbVar.zzC(bArr2, 0, 8);
        zzfbVar.zzG(iZzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    protected final long zza(zzfb zzfbVar) {
        return zzg(zzabw.zzc(zzfbVar.zzI()));
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfb zzfbVar, long j, zzahv zzahvVar) throws zzcd {
        if (zzk(zzfbVar, zza)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzfbVar.zzI(), zzfbVar.zzd());
            int i = bArrCopyOf[9] & 255;
            List listZzd = zzabw.zzd(bArrCopyOf);
            if (zzahvVar.zza != null) {
                return true;
            }
            zzak zzakVar = new zzak();
            zzakVar.zzS("audio/opus");
            zzakVar.zzw(i);
            zzakVar.zzT(48000);
            zzakVar.zzI(listZzd);
            zzahvVar.zza = zzakVar.zzY();
            return true;
        }
        if (!zzk(zzfbVar, zzb)) {
            zzdy.zzb(zzahvVar.zza);
            return false;
        }
        zzdy.zzb(zzahvVar.zza);
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzfbVar.zzH(8);
        zzbz zzbzVarZzb = zzack.zzb(zzfud.zzk(zzack.zzc(zzfbVar, false, false).zzb));
        if (zzbzVarZzb == null) {
            return true;
        }
        zzak zzakVarZzb = zzahvVar.zza.zzb();
        zzakVarZzb.zzM(zzbzVarZzb.zzd(zzahvVar.zza.zzk));
        zzahvVar.zza = zzakVarZzb.zzY();
        return true;
    }
}
