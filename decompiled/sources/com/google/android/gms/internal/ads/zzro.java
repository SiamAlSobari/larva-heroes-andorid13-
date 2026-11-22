package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.DriveFile;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzro extends zzht {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzro() {
        super(2, 0);
        this.zzh = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzht, com.google.android.gms.internal.ads.zzhn
    public final void zzb() {
        super.zzb();
        this.zzg = 0;
    }

    public final int zzm() {
        return this.zzg;
    }

    public final long zzn() {
        return this.zzf;
    }

    public final void zzo(int i) {
        this.zzh = i;
    }

    public final boolean zzp(zzht zzhtVar) {
        ByteBuffer byteBuffer;
        zzdy.zzd(!zzhtVar.zzd(Ints.MAX_POWER_OF_TWO));
        zzdy.zzd(!zzhtVar.zzd(DriveFile.MODE_READ_ONLY));
        zzdy.zzd(!zzhtVar.zzd(4));
        if (zzq()) {
            if (this.zzg >= this.zzh || zzhtVar.zzd(Integer.MIN_VALUE) != zzd(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzhtVar.zzb;
            if (byteBuffer2 != null && (byteBuffer = this.zzb) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.zzg;
        this.zzg = i + 1;
        if (i == 0) {
            this.zzd = zzhtVar.zzd;
            if (zzhtVar.zzd(1)) {
                zzc(1);
            }
        }
        if (zzhtVar.zzd(Integer.MIN_VALUE)) {
            zzc(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = zzhtVar.zzb;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzb.put(byteBuffer3);
        }
        this.zzf = zzhtVar.zzd;
        return true;
    }

    public final boolean zzq() {
        return this.zzg > 0;
    }
}
