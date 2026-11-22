package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzuq extends zztt {
    private static final Logger zza = Logger.getLogger(zzuq.class.getName());
    private static final boolean zzb = zzaai.zzx();
    public static final /* synthetic */ int zzf = 0;
    zzur zze;

    private zzuq() {
    }

    /* synthetic */ zzuq(zzup zzupVar) {
    }

    public static int zzA(zzyu zzyuVar) {
        int iZzX = zzyuVar.zzX();
        return zzD(iZzX) + iZzX;
    }

    static int zzB(zzyu zzyuVar, zzzh zzzhVar) {
        int iZzQ = ((zztl) zzyuVar).zzQ(zzzhVar);
        return zzD(iZzQ) + iZzQ;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzaan.zzc(str);
        } catch (zzaam unused) {
            length = str.getBytes(zzxs.zzb).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzE(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            j >>>= 14;
            i += 2;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    @Deprecated
    static int zzy(int i, zzyu zzyuVar, zzzh zzzhVar) {
        int iZzQ = ((zztl) zzyuVar).zzQ(zzzhVar);
        int iZzD = zzD(i << 3);
        return iZzD + iZzD + iZzQ;
    }

    public static int zzz(int i) {
        if (i >= 0) {
            return zzD(i);
        }
        return 10;
    }

    final void zzF(String str, zzaam zzaamVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzaamVar);
        byte[] bytes = str.getBytes(zzxs.zzb);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzun(e);
        }
    }

    public abstract void zzJ() throws IOException;

    public abstract void zzK(byte b) throws IOException;

    public abstract void zzL(int i, boolean z) throws IOException;

    public abstract void zzM(int i, zzud zzudVar) throws IOException;

    @Override // com.google.android.gms.internal.gtm.zztt
    public abstract void zza(byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzi(int i) throws IOException;

    public abstract void zzj(int i, long j) throws IOException;

    public abstract void zzk(long j) throws IOException;

    public abstract void zzl(int i, int i2) throws IOException;

    public abstract void zzm(int i) throws IOException;

    abstract void zzn(int i, zzyu zzyuVar, zzzh zzzhVar) throws IOException;

    public abstract void zzo(int i, zzyu zzyuVar) throws IOException;

    public abstract void zzp(int i, zzud zzudVar) throws IOException;

    public abstract void zzq(int i, String str) throws IOException;

    public abstract void zzs(int i, int i2) throws IOException;

    public abstract void zzt(int i, int i2) throws IOException;

    public abstract void zzu(int i) throws IOException;

    public abstract void zzv(int i, long j) throws IOException;

    public abstract void zzw(long j) throws IOException;
}
