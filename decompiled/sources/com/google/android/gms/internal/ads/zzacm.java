package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacm implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzacl
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzacm.zza;
            return new zzabb[]{new zzacm(0)};
        }
    };
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzabe zzp;
    private zzace zzq;
    private zzaca zzr;
    private boolean zzs;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        int i = zzfk.zza;
        zzd = "#!AMR\n".getBytes(zzfqu.zzc);
        zze = "#!AMR-WB\n".getBytes(zzfqu.zzc);
        zzf = iArr[8];
    }

    public zzacm() {
        this(0);
    }

    public zzacm(int i) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    private static boolean zzf(zzabc zzabcVar, byte[] bArr) throws IOException {
        zzabcVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzaar) zzabcVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzg(zzabc zzabcVar) throws IOException {
        byte[] bArr = zzd;
        if (zzf(zzabcVar, bArr)) {
            this.zzh = false;
            ((zzaar) zzabcVar).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (!zzf(zzabcVar, bArr2)) {
            return false;
        }
        this.zzh = true;
        ((zzaar) zzabcVar).zzo(bArr2.length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        zzdy.zzb(this.zzq);
        int i = zzfk.zza;
        if (zzabcVar.zzf() == 0 && !zzg(zzabcVar)) {
            throw zzcd.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzh;
            String str = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z ? GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY : 16000;
            zzace zzaceVar = this.zzq;
            zzak zzakVar = new zzak();
            zzakVar.zzS(str);
            zzakVar.zzL(zzf);
            zzakVar.zzw(1);
            zzakVar.zzT(i2);
            zzaceVar.zzk(zzakVar.zzY());
        }
        int iZze = zze(zzabcVar);
        if (this.zzl) {
            return iZze;
        }
        zzabz zzabzVar = new zzabz(-9223372036854775807L, 0L);
        this.zzr = zzabzVar;
        this.zzp.zzN(zzabzVar);
        this.zzl = true;
        return iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzp = zzabeVar;
        this.zzq = zzabeVar.zzv(0, 1);
        zzabeVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        return zzg(zzabcVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    @RequiresNonNull({"trackOutput"})
    private final int zze(zzabc zzabcVar) throws IOException {
        int i = this.zzk;
        if (i == 0) {
            try {
                zzabcVar.zzj();
                ((zzaar) zzabcVar).zzm(this.zzg, 0, 1, false);
                byte b = this.zzg[0];
                if ((b & 131) > 0) {
                    throw zzcd.zza("Invalid padding bits for frame header " + ((int) b), null);
                }
                int i2 = b >> 3;
                boolean z = this.zzh;
                int i3 = i2 & 15;
                if (!z) {
                    if (!z) {
                        if (i3 >= 12 && i3 <= 14) {
                        }
                    }
                    throw zzcd.zza("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i3, null);
                }
                if (i3 >= 10 && i3 <= 13) {
                    if (!z) {
                        if (i3 >= 12) {
                        }
                    }
                    if (true != z) {
                    }
                    throw zzcd.zza("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i3, null);
                }
                i = z ? zzc[i3] : zzb[i3];
                this.zzj = i;
                this.zzk = i;
                int i4 = this.zzm;
                if (i4 == -1) {
                    this.zzm = i;
                    i4 = i;
                }
                if (i4 == i) {
                    this.zzn++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iZza = zzacc.zza(this.zzq, zzabcVar, i, true);
        if (iZza == -1) {
            return -1;
        }
        int i5 = this.zzk - iZza;
        this.zzk = i5;
        if (i5 > 0) {
            return 0;
        }
        this.zzq.zzs(this.zzi, 1, this.zzj, 0, null);
        this.zzi += 20000;
        return 0;
    }
}
