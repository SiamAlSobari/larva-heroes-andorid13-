package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import com.google.android.gms.internal.p002firebaseauthapi.zzakk;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzakk<MessageType extends zzakk<MessageType, BuilderType>, BuilderType extends zzakg<MessageType, BuilderType>> extends zzaip<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzamw zzc = zzamw.zzc();

    protected static zzakp zzA() {
        return zzaly.zze();
    }

    protected static zzakp zzB(zzakp zzakpVar) {
        int size = zzakpVar.size();
        return zzakpVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzD(Method method, Object obj, Object... objArr) {
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

    protected static Object zzE(zzalp zzalpVar, String str, Object[] objArr) {
        return new zzalz(zzalpVar, str, objArr);
    }

    protected static void zzH(Class cls, zzakk zzakkVar) {
        zzakkVar.zzG();
        zzb.put(cls, zzakkVar);
    }

    private final int zza(zzamb zzambVar) {
        return zzalx.zza().zzb(getClass()).zza(this);
    }

    private static zzakk zzb(zzakk zzakkVar) throws zzaks {
        if (zzakkVar == null || zzakkVar.zzK()) {
            return zzakkVar;
        }
        zzaks zzaksVarZza = new zzamu(zzakkVar).zza();
        zzaksVarZza.zzh(zzakkVar);
        throw zzaksVarZza;
    }

    private static zzakk zzc(zzakk zzakkVar, byte[] bArr, int i, int i2, zzajx zzajxVar) throws zzaks {
        zzakk zzakkVarZzw = zzakkVar.zzw();
        try {
            zzamb zzambVarZzb = zzalx.zza().zzb(zzakkVarZzw.getClass());
            zzambVarZzb.zzi(zzakkVarZzw, bArr, 0, i2, new zzais(zzajxVar));
            zzambVarZzb.zzf(zzakkVarZzw);
            return zzakkVarZzw;
        } catch (zzaks e) {
            e = e;
            if (e.zzl()) {
                e = new zzaks(e);
            }
            e.zzh(zzakkVarZzw);
            throw e;
        } catch (zzamu e2) {
            zzaks zzaksVarZza = e2.zza();
            zzaksVarZza.zzh(zzakkVarZzw);
            throw zzaksVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzaks) {
                throw ((zzaks) e3.getCause());
            }
            zzaks zzaksVar = new zzaks(e3);
            zzaksVar.zzh(zzakkVarZzw);
            throw zzaksVar;
        } catch (IndexOutOfBoundsException unused) {
            zzaks zzaksVarZzj = zzaks.zzj();
            zzaksVarZzj.zzh(zzakkVarZzw);
            throw zzaksVarZzj;
        }
    }

    static zzakk zzv(Class cls) {
        Map map = zzb;
        zzakk zzakkVar = (zzakk) map.get(cls);
        if (zzakkVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzakkVar = (zzakk) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzakkVar == null) {
            zzakkVar = (zzakk) ((zzakk) zzanf.zze(cls)).zzj(6, null, null);
            if (zzakkVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzakkVar);
        }
        return zzakkVar;
    }

    protected static zzakk zzx(zzakk zzakkVar, zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        zzajl zzajlVarZzh = zzajfVar.zzh();
        zzakk zzakkVarZzw = zzakkVar.zzw();
        try {
            zzamb zzambVarZzb = zzalx.zza().zzb(zzakkVarZzw.getClass());
            zzambVarZzb.zzh(zzakkVarZzw, zzajm.zzq(zzajlVarZzh), zzajxVar);
            zzambVarZzb.zzf(zzakkVarZzw);
            try {
                zzajlVarZzh.zzz(0);
                zzb(zzakkVarZzw);
                return zzakkVarZzw;
            } catch (zzaks e) {
                e.zzh(zzakkVarZzw);
                throw e;
            }
        } catch (zzaks e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzaks(e);
            }
            e.zzh(zzakkVarZzw);
            throw e;
        } catch (zzamu e3) {
            zzaks zzaksVarZza = e3.zza();
            zzaksVarZza.zzh(zzakkVarZzw);
            throw zzaksVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzaks) {
                throw ((zzaks) e4.getCause());
            }
            zzaks zzaksVar = new zzaks(e4);
            zzaksVar.zzh(zzakkVarZzw);
            throw zzaksVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzaks) {
                throw ((zzaks) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzakk zzy(zzakk zzakkVar, InputStream inputStream, zzajx zzajxVar) throws zzaks {
        zzajj zzajjVar = new zzajj(inputStream, 4096, null);
        zzakk zzakkVarZzw = zzakkVar.zzw();
        try {
            zzamb zzambVarZzb = zzalx.zza().zzb(zzakkVarZzw.getClass());
            zzambVarZzb.zzh(zzakkVarZzw, zzajm.zzq(zzajjVar), zzajxVar);
            zzambVarZzb.zzf(zzakkVarZzw);
            zzb(zzakkVarZzw);
            return zzakkVarZzw;
        } catch (zzaks e) {
            e = e;
            if (e.zzl()) {
                e = new zzaks(e);
            }
            e.zzh(zzakkVarZzw);
            throw e;
        } catch (zzamu e2) {
            zzaks zzaksVarZza = e2.zza();
            zzaksVarZza.zzh(zzakkVarZzw);
            throw zzaksVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzaks) {
                throw ((zzaks) e3.getCause());
            }
            zzaks zzaksVar = new zzaks(e3);
            zzaksVar.zzh(zzakkVarZzw);
            throw zzaksVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzaks) {
                throw ((zzaks) e4.getCause());
            }
            throw e4;
        }
    }

    protected static zzakk zzz(zzakk zzakkVar, byte[] bArr, zzajx zzajxVar) throws zzaks {
        zzakk zzakkVarZzc = zzc(zzakkVar, bArr, 0, bArr.length, zzajxVar);
        zzb(zzakkVarZzc);
        return zzakkVarZzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzalx.zza().zzb(getClass()).zzj(this, (zzakk) obj);
    }

    public final int hashCode() {
        if (zzL()) {
            return zzr();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzr = zzr();
        this.zza = iZzr;
        return iZzr;
    }

    public final String toString() {
        return zzalr.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
    public final /* synthetic */ zzalo zzC() {
        return (zzakg) zzj(5, null, null);
    }

    protected final void zzF() {
        zzalx.zza().zzb(getClass()).zzf(this);
        zzG();
    }

    final void zzG() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzI(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
    public final void zzJ(zzajs zzajsVar) throws IOException {
        zzalx.zza().zzb(getClass()).zzm(this, zzajt.zza(zzajsVar));
    }

    public final boolean zzK() {
        Boolean bool = Boolean.TRUE;
        byte bByteValue = ((Byte) zzj(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzalx.zza().zzb(getClass()).zzk(this);
        zzj(2, true != zZzk ? null : this, null);
        return zZzk;
    }

    final boolean zzL() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalq
    public final /* synthetic */ zzalp zzM() {
        return (zzakk) zzj(6, null, null);
    }

    protected abstract Object zzj(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    final int zzn(zzamb zzambVar) {
        if (zzL()) {
            int iZza = zzambVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zzambVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    final int zzr() {
        return zzalx.zza().zzb(getClass()).zzb(this);
    }

    protected final zzakg zzt() {
        return (zzakg) zzj(5, null, null);
    }

    public final zzakg zzu() {
        zzakg zzakgVar = (zzakg) zzj(5, null, null);
        zzakgVar.zzh(this);
        return zzakgVar;
    }

    final zzakk zzw() {
        return (zzakk) zzj(4, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
    public final int zzs() {
        int iZza;
        if (zzL()) {
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
