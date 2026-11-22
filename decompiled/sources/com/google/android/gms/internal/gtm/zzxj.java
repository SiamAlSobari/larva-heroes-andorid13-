package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzxd;
import com.google.android.gms.internal.gtm.zzxj;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzxj<MessageType extends zzxj<MessageType, BuilderType>, BuilderType extends zzxd<MessageType, BuilderType>> extends zztl<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzzz zzc = zzzz.zzc();

    public static zzxh zzaa(zzyu zzyuVar, zzyu zzyuVar2, zzxm zzxmVar, int i, zzaao zzaaoVar, boolean z, Class cls) {
        return new zzxh(zzyuVar, Collections.emptyList(), zzyuVar2, new zzxg(null, i, zzaaoVar, true, false), cls);
    }

    public static zzxh zzab(zzyu zzyuVar, Object obj, zzyu zzyuVar2, zzxm zzxmVar, int i, zzaao zzaaoVar, Class cls) {
        return new zzxh(zzyuVar, obj, zzyuVar2, new zzxg(zzxmVar, i, zzaaoVar, false, false), cls);
    }

    static zzxj zzac(Class cls) {
        Map map = zza;
        zzxj zzxjVar = (zzxj) map.get(cls);
        if (zzxjVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzxjVar = (zzxj) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzxjVar == null) {
            zzxjVar = (zzxj) ((zzxj) zzaai.zze(cls)).zzb(6, null, null);
            if (zzxjVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzxjVar);
        }
        return zzxjVar;
    }

    protected static zzxj zzae(zzxj zzxjVar, InputStream inputStream, zzwt zzwtVar) throws zzxu {
        zzuh zzuhVar = new zzuh(inputStream, 4096, null);
        zzxj zzxjVarZzad = zzxjVar.zzad();
        try {
            zzzh zzzhVarZzb = zzzd.zza().zzb(zzxjVarZzad.getClass());
            zzzhVarZzb.zzh(zzxjVarZzad, zzuk.zzq(zzuhVar), zzwtVar);
            zzzhVarZzb.zzf(zzxjVarZzad);
            zze(zzxjVarZzad);
            return zzxjVarZzad;
        } catch (zzxu e) {
            e = e;
            if (e.zzl()) {
                e = new zzxu(e);
            }
            e.zzh(zzxjVarZzad);
            throw e;
        } catch (zzzx e2) {
            zzxu zzxuVarZza = e2.zza();
            zzxuVarZza.zzh(zzxjVarZzad);
            throw zzxuVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzxu) {
                throw ((zzxu) e3.getCause());
            }
            zzxu zzxuVar = new zzxu(e3);
            zzxuVar.zzh(zzxjVarZzad);
            throw zzxuVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzxu) {
                throw ((zzxu) e4.getCause());
            }
            throw e4;
        }
    }

    protected static zzxj zzaf(zzxj zzxjVar, byte[] bArr, zzwt zzwtVar) throws zzxu {
        zzxj zzxjVarZzf = zzf(zzxjVar, bArr, 0, bArr.length, zzwtVar);
        zze(zzxjVarZzf);
        return zzxjVarZzf;
    }

    protected static zzxo zzag() {
        return zzxk.zzf();
    }

    protected static zzxr zzah() {
        return zzze.zze();
    }

    protected static zzxr zzai(zzxr zzxrVar) {
        int size = zzxrVar.size();
        return zzxrVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzaj(Method method, Object obj, Object... objArr) {
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

    protected static Object zzak(zzyu zzyuVar, String str, Object[] objArr) {
        return new zzzf(zzyuVar, str, objArr);
    }

    protected static void zzan(Class cls, zzxj zzxjVar) {
        zzxjVar.zzam();
        zza.put(cls, zzxjVar);
    }

    protected static final boolean zzap(zzxj zzxjVar, boolean z) {
        byte bByteValue = ((Byte) zzxjVar.zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzzd.zza().zzb(zzxjVar.getClass()).zzk(zzxjVar);
        if (z) {
            zzxjVar.zzb(2, true != zZzk ? null : zzxjVar, null);
        }
        return zZzk;
    }

    private final int zzc(zzzh zzzhVar) {
        return zzzd.zza().zzb(getClass()).zza(this);
    }

    private static zzxj zze(zzxj zzxjVar) throws zzxu {
        if (zzxjVar == null || zzxjVar.zzay()) {
            return zzxjVar;
        }
        zzxu zzxuVarZza = new zzzx(zzxjVar).zza();
        zzxuVarZza.zzh(zzxjVar);
        throw zzxuVarZza;
    }

    private static zzxj zzf(zzxj zzxjVar, byte[] bArr, int i, int i2, zzwt zzwtVar) throws zzxu {
        zzxj zzxjVarZzad = zzxjVar.zzad();
        try {
            zzzh zzzhVarZzb = zzzd.zza().zzb(zzxjVarZzad.getClass());
            zzzhVarZzb.zzi(zzxjVarZzad, bArr, 0, i2, new zztp(zzwtVar));
            zzzhVarZzb.zzf(zzxjVarZzad);
            return zzxjVarZzad;
        } catch (zzxu e) {
            e = e;
            if (e.zzl()) {
                e = new zzxu(e);
            }
            e.zzh(zzxjVarZzad);
            throw e;
        } catch (zzzx e2) {
            zzxu zzxuVarZza = e2.zza();
            zzxuVarZza.zzh(zzxjVarZzad);
            throw zzxuVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzxu) {
                throw ((zzxu) e3.getCause());
            }
            zzxu zzxuVar = new zzxu(e3);
            zzxuVar.zzh(zzxjVarZzad);
            throw zzxuVar;
        } catch (IndexOutOfBoundsException unused) {
            zzxu zzxuVarZzj = zzxu.zzj();
            zzxuVarZzj.zzh(zzxjVarZzad);
            throw zzxuVarZzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzzd.zza().zzb(getClass()).zzj(this, (zzxj) obj);
    }

    public final int hashCode() {
        if (zzaq()) {
            return zzW();
        }
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int iZzW = zzW();
        this.zzb = iZzW;
        return iZzW;
    }

    public final String toString() {
        return zzyw.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zztl
    final int zzQ(zzzh zzzhVar) {
        if (zzaq()) {
            int iZza = zzzhVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zzzhVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    final int zzW() {
        return zzzd.zza().zzb(getClass()).zzb(this);
    }

    protected final zzxd zzY() {
        return (zzxd) zzb(5, null, null);
    }

    public final zzxd zzZ() {
        zzxd zzxdVar = (zzxd) zzb(5, null, null);
        zzxdVar.zzA(this);
        return zzxdVar;
    }

    final zzxj zzad() {
        return (zzxj) zzb(4, null, null);
    }

    protected final void zzal() {
        zzzd.zza().zzb(getClass()).zzf(this);
        zzam();
    }

    final void zzam() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzao(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean zzaq() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final /* synthetic */ zzyt zzau() {
        return (zzxd) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final /* synthetic */ zzyt zzav() {
        zzxd zzxdVar = (zzxd) zzb(5, null, null);
        zzxdVar.zzA(this);
        return zzxdVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final void zzaw(zzuq zzuqVar) throws IOException {
        zzzd.zza().zzb(getClass()).zzm(this, zzur.zza(zzuqVar));
    }

    @Override // com.google.android.gms.internal.gtm.zzyv
    public final /* synthetic */ zzyu zzax() {
        return (zzxj) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzyv
    public final boolean zzay() {
        Boolean bool = Boolean.TRUE;
        return zzap(this, true);
    }

    protected abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.gtm.zzyu
    public final int zzX() {
        int iZzc;
        if (zzaq()) {
            iZzc = zzc(null);
            if (iZzc < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iZzc);
            }
        } else {
            iZzc = this.zzd & Integer.MAX_VALUE;
            if (iZzc == Integer.MAX_VALUE) {
                iZzc = zzc(null);
                if (iZzc < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iZzc);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzc;
            }
        }
        return iZzc;
    }
}
