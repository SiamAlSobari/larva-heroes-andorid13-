package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdo {
    private final zzfud zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private zzdp zzd = zzdp.zza;
    private zzdp zze = zzdp.zza;
    private boolean zzf = false;

    public zzdo(zzfud zzfudVar) {
        this.zza = zzfudVar;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z;
        do {
            z = false;
            for (int i = 0; i <= zzi(); i++) {
                if (!this.zzc[i].hasRemaining()) {
                    zzdr zzdrVar = (zzdr) this.zzb.get(i);
                    if (!zzdrVar.zzh()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzdr.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzdrVar.zze(byteBuffer2);
                        this.zzc[i] = zzdrVar.zzb();
                        boolean z2 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzi()) {
                        ((zzdr) this.zzb.get(i + 1)).zzd();
                    }
                }
            }
        } while (z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdo)) {
            return false;
        }
        zzdo zzdoVar = (zzdo) obj;
        if (this.zza.size() != zzdoVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (this.zza.get(i) != zzdoVar.zza.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdp zza(zzdp zzdpVar) throws zzdq {
        if (zzdpVar.equals(zzdp.zza)) {
            throw new zzdq("Unhandled input format:", zzdpVar);
        }
        for (int i = 0; i < this.zza.size(); i++) {
            zzdr zzdrVar = (zzdr) this.zza.get(i);
            zzdp zzdpVarZza = zzdrVar.zza(zzdpVar);
            if (zzdrVar.zzg()) {
                zzdy.zzf(!zzdpVarZza.equals(zzdp.zza));
                zzdpVar = zzdpVarZza;
            }
        }
        this.zze = zzdpVar;
        return zzdpVar;
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzdr.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (!byteBuffer.hasRemaining()) {
            zzj(zzdr.zza);
        }
        return byteBuffer;
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for (int i = 0; i < this.zza.size(); i++) {
            zzdr zzdrVar = (zzdr) this.zza.get(i);
            zzdrVar.zzc();
            if (zzdrVar.zzg()) {
                this.zzb.add(zzdrVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i2 = 0; i2 <= zzi(); i2++) {
            this.zzc[i2] = ((zzdr) this.zzb.get(i2)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzf) {
            return;
        }
        this.zzf = true;
        ((zzdr) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzf) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        for (int i = 0; i < this.zza.size(); i++) {
            zzdr zzdrVar = (zzdr) this.zza.get(i);
            zzdrVar.zzc();
            zzdrVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        this.zzd = zzdp.zza;
        this.zze = zzdp.zza;
        this.zzf = false;
    }

    public final boolean zzg() {
        return this.zzf && ((zzdr) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
