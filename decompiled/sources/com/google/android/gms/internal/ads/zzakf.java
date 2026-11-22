package com.google.android.gms.internal.ads;

import com.mrgames.larvaheroesfree.R;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzakf implements zzakg {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, R.styleable.AppCompatTheme_windowActionBarOverlay, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzabe zzc;
    private final zzace zzd;
    private final zzakj zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfb zzh;
    private final int zzi;
    private final zzam zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzakf(zzabe zzabeVar, zzace zzaceVar, zzakj zzakjVar) throws zzcd {
        this.zzc = zzabeVar;
        this.zzd = zzaceVar;
        this.zze = zzakjVar;
        int iMax = Math.max(1, zzakjVar.zzc / 10);
        this.zzi = iMax;
        zzfb zzfbVar = new zzfb(zzakjVar.zzf);
        zzfbVar.zzj();
        int iZzj = zzfbVar.zzj();
        this.zzf = iZzj;
        int i = zzakjVar.zzb;
        int i2 = (((zzakjVar.zzd - (i * 4)) * 8) / (zzakjVar.zze * i)) + 1;
        if (iZzj != i2) {
            throw zzcd.zza("Expected frames per block: " + i2 + "; got: " + iZzj, null);
        }
        int i3 = zzfk.zza;
        int i4 = ((iMax + iZzj) - 1) / iZzj;
        this.zzg = new byte[zzakjVar.zzd * i4];
        this.zzh = new zzfb(i4 * (iZzj + iZzj) * i);
        int i5 = ((zzakjVar.zzc * zzakjVar.zzd) * 8) / iZzj;
        zzak zzakVar = new zzak();
        zzakVar.zzS("audio/raw");
        zzakVar.zzv(i5);
        zzakVar.zzO(i5);
        zzakVar.zzL((iMax + iMax) * i);
        zzakVar.zzw(zzakjVar.zzb);
        zzakVar.zzT(zzakjVar.zzc);
        zzakVar.zzN(2);
        this.zzj = zzakVar.zzY();
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long jZzq = this.zzl + zzfk.zzq(this.zzn, 1000000L, this.zze.zzc);
        int iZze = zze(i);
        this.zzd.zzs(jZzq, 1, iZze, this.zzm - iZze, null);
        this.zzn += (long) i;
        this.zzm -= iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void zza(int i, long j) {
        this.zzc.zzN(new zzakm(this.zze, this.zzf, i, j));
        this.zzd.zzk(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f A[LOOP:0: B:6:0x0024->B:12:0x003f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.android.gms.internal.ads.zzakg
    public final boolean zzc(com.google.android.gms.internal.ads.zzabc r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakf.zzc(com.google.android.gms.internal.ads.zzabc, long):boolean");
    }
}
