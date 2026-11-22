package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgrm;
import com.google.android.gms.internal.ads.zzgrq;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgrq<MessageType extends zzgrq<MessageType, BuilderType>, BuilderType extends zzgrm<MessageType, BuilderType>> extends zzgpr<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzgul zzc = zzgul.zzc();

    private final int zza(zzgtt zzgttVar) {
        return zzgti.zza().zzb(getClass()).zza(this);
    }

    static zzgrq zzaC(Class cls) {
        Map map = zzb;
        zzgrq zzgrqVar = (zzgrq) map.get(cls);
        if (zzgrqVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgrqVar = (zzgrq) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgrqVar == null) {
            zzgrqVar = (zzgrq) ((zzgrq) zzguu.zzg(cls)).zzb(6, null, null);
            if (zzgrqVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzgrqVar);
        }
        return zzgrqVar;
    }

    protected static zzgrq zzaE(zzgrq zzgrqVar, zzgqi zzgqiVar) throws zzgsc {
        zzgrc zzgrcVar = zzgrc.zza;
        zzgqq zzgqqVarZzl = zzgqiVar.zzl();
        zzgrq zzgrqVarZzaD = zzgrqVar.zzaD();
        try {
            zzgtt zzgttVarZzb = zzgti.zza().zzb(zzgrqVarZzaD.getClass());
            zzgttVarZzb.zzh(zzgrqVarZzaD, zzgqr.zzq(zzgqqVarZzl), zzgrcVar);
            zzgttVarZzb.zzf(zzgrqVarZzaD);
            try {
                zzgqqVarZzl.zzz(0);
                zzc(zzgrqVarZzaD);
                zzc(zzgrqVarZzaD);
                return zzgrqVarZzaD;
            } catch (zzgsc e) {
                e.zzh(zzgrqVarZzaD);
                throw e;
            }
        } catch (zzgsc e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgsc(e);
            }
            e.zzh(zzgrqVarZzaD);
            throw e;
        } catch (zzguj e3) {
            zzgsc zzgscVarZza = e3.zza();
            zzgscVarZza.zzh(zzgrqVarZzaD);
            throw zzgscVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgsc) {
                throw ((zzgsc) e4.getCause());
            }
            zzgsc zzgscVar = new zzgsc(e4);
            zzgscVar.zzh(zzgrqVarZzaD);
            throw zzgscVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgsc) {
                throw ((zzgsc) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzgrq zzaF(zzgrq zzgrqVar, byte[] bArr) throws zzgsc {
        zzgrq zzgrqVarZzd = zzd(zzgrqVar, bArr, 0, bArr.length, zzgrc.zza);
        zzc(zzgrqVarZzd);
        return zzgrqVarZzd;
    }

    protected static zzgrq zzaG(zzgrq zzgrqVar, zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        zzgqq zzgqqVarZzl = zzgqiVar.zzl();
        zzgrq zzgrqVarZzaD = zzgrqVar.zzaD();
        try {
            zzgtt zzgttVarZzb = zzgti.zza().zzb(zzgrqVarZzaD.getClass());
            zzgttVarZzb.zzh(zzgrqVarZzaD, zzgqr.zzq(zzgqqVarZzl), zzgrcVar);
            zzgttVarZzb.zzf(zzgrqVarZzaD);
            try {
                zzgqqVarZzl.zzz(0);
                zzc(zzgrqVarZzaD);
                return zzgrqVarZzaD;
            } catch (zzgsc e) {
                e.zzh(zzgrqVarZzaD);
                throw e;
            }
        } catch (zzgsc e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgsc(e);
            }
            e.zzh(zzgrqVarZzaD);
            throw e;
        } catch (zzguj e3) {
            zzgsc zzgscVarZza = e3.zza();
            zzgscVarZza.zzh(zzgrqVarZzaD);
            throw zzgscVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgsc) {
                throw ((zzgsc) e4.getCause());
            }
            zzgsc zzgscVar = new zzgsc(e4);
            zzgscVar.zzh(zzgrqVarZzaD);
            throw zzgscVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgsc) {
                throw ((zzgsc) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzgrq zzaH(zzgrq zzgrqVar, InputStream inputStream, zzgrc zzgrcVar) throws zzgsc {
        zzgqq zzgqqVarZzH = zzgqq.zzH(inputStream, 4096);
        zzgrq zzgrqVarZzaD = zzgrqVar.zzaD();
        try {
            zzgtt zzgttVarZzb = zzgti.zza().zzb(zzgrqVarZzaD.getClass());
            zzgttVarZzb.zzh(zzgrqVarZzaD, zzgqr.zzq(zzgqqVarZzH), zzgrcVar);
            zzgttVarZzb.zzf(zzgrqVarZzaD);
            zzc(zzgrqVarZzaD);
            return zzgrqVarZzaD;
        } catch (zzgsc e) {
            e = e;
            if (e.zzl()) {
                e = new zzgsc(e);
            }
            e.zzh(zzgrqVarZzaD);
            throw e;
        } catch (zzguj e2) {
            zzgsc zzgscVarZza = e2.zza();
            zzgscVarZza.zzh(zzgrqVarZzaD);
            throw zzgscVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgsc) {
                throw ((zzgsc) e3.getCause());
            }
            zzgsc zzgscVar = new zzgsc(e3);
            zzgscVar.zzh(zzgrqVarZzaD);
            throw zzgscVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgsc) {
                throw ((zzgsc) e4.getCause());
            }
            throw e4;
        }
    }

    protected static zzgrq zzaI(zzgrq zzgrqVar, byte[] bArr, zzgrc zzgrcVar) throws zzgsc {
        zzgrq zzgrqVarZzd = zzd(zzgrqVar, bArr, 0, bArr.length, zzgrcVar);
        zzc(zzgrqVarZzd);
        return zzgrqVarZzd;
    }

    protected static zzgrv zzaJ() {
        return zzgrr.zzf();
    }

    protected static zzgrv zzaK(zzgrv zzgrvVar) {
        int size = zzgrvVar.size();
        return zzgrvVar.zzd(size == 0 ? 10 : size + size);
    }

    protected static zzgry zzaL() {
        return zzgsp.zzf();
    }

    protected static zzgry zzaM(zzgry zzgryVar) {
        int size = zzgryVar.size();
        return zzgryVar.zzd(size == 0 ? 10 : size + size);
    }

    protected static zzgrz zzaN() {
        return zzgtj.zze();
    }

    protected static zzgrz zzaO(zzgrz zzgrzVar) {
        int size = zzgrzVar.size();
        return zzgrzVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzaQ(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzaR(zzgta zzgtaVar, String str, Object[] objArr) {
        return new zzgtk(zzgtaVar, str, objArr);
    }

    protected static void zzaU(Class cls, zzgrq zzgrqVar) {
        zzgrqVar.zzaT();
        zzb.put(cls, zzgrqVar);
    }

    private static zzgrq zzc(zzgrq zzgrqVar) throws zzgsc {
        if (zzgrqVar == null || zzgrqVar.zzaX()) {
            return zzgrqVar;
        }
        zzgsc zzgscVarZza = new zzguj(zzgrqVar).zza();
        zzgscVarZza.zzh(zzgrqVar);
        throw zzgscVarZza;
    }

    private static zzgrq zzd(zzgrq zzgrqVar, byte[] bArr, int i, int i2, zzgrc zzgrcVar) throws zzgsc {
        zzgrq zzgrqVarZzaD = zzgrqVar.zzaD();
        try {
            zzgtt zzgttVarZzb = zzgti.zza().zzb(zzgrqVarZzaD.getClass());
            zzgttVarZzb.zzi(zzgrqVarZzaD, bArr, 0, i2, new zzgpu(zzgrcVar));
            zzgttVarZzb.zzf(zzgrqVarZzaD);
            return zzgrqVarZzaD;
        } catch (zzgsc e) {
            e = e;
            if (e.zzl()) {
                e = new zzgsc(e);
            }
            e.zzh(zzgrqVarZzaD);
            throw e;
        } catch (zzguj e2) {
            zzgsc zzgscVarZza = e2.zza();
            zzgscVarZza.zzh(zzgrqVarZzaD);
            throw zzgscVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgsc) {
                throw ((zzgsc) e3.getCause());
            }
            zzgsc zzgscVar = new zzgsc(e3);
            zzgscVar.zzh(zzgrqVarZzaD);
            throw zzgscVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgsc zzgscVarZzj = zzgsc.zzj();
            zzgscVarZzj.zzh(zzgrqVarZzaD);
            throw zzgscVarZzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgti.zza().zzb(getClass()).zzj(this, (zzgrq) obj);
    }

    public final int hashCode() {
        if (zzaY()) {
            return zzay();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzay = zzay();
        this.zza = iZzay;
        return iZzay;
    }

    public final String toString() {
        return zzgtc.zza(this, super.toString());
    }

    protected final zzgrm zzaA() {
        return (zzgrm) zzb(5, null, null);
    }

    public final zzgrm zzaB() {
        zzgrm zzgrmVar = (zzgrm) zzb(5, null, null);
        zzgrmVar.zzaj(this);
        return zzgrmVar;
    }

    final zzgrq zzaD() {
        return (zzgrq) zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final /* synthetic */ zzgsz zzaP() {
        return (zzgrm) zzb(5, null, null);
    }

    protected final void zzaS() {
        zzgti.zza().zzb(getClass()).zzf(this);
        zzaT();
    }

    final void zzaT() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzaV(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final void zzaW(zzgqx zzgqxVar) throws IOException {
        zzgti.zza().zzb(getClass()).zzm(this, zzgqy.zza(zzgqxVar));
    }

    public final boolean zzaX() {
        Boolean bool = Boolean.TRUE;
        byte bByteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzgti.zza().zzb(getClass()).zzk(this);
        zzb(2, true != zZzk ? null : this, null);
        return zZzk;
    }

    final boolean zzaY() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    final int zzat(zzgtt zzgttVar) {
        if (zzaY()) {
            int iZza = zzgttVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zzgttVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    final int zzay() {
        return zzgti.zza().zzb(getClass()).zzb(this);
    }

    protected abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final /* synthetic */ zzgta zzbf() {
        return (zzgrq) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final int zzaz() {
        int iZza;
        if (zzaY()) {
            iZza = zza(null);
            if (iZza < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
            }
        } else {
            iZza = this.zzd & Integer.MAX_VALUE;
            if (iZza == Integer.MAX_VALUE) {
                iZza = zza(null);
                if (iZza < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza;
            }
        }
        return iZza;
    }
}
