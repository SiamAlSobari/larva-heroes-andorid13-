package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgye implements Iterator, Closeable, zzanc {
    private static final zzanb zza = new zzgyd("eof ");
    private static final zzgyl zzb = zzgyl.zzb(zzgye.class);
    protected zzamy zzc;
    protected zzgyf zzd;
    zzanb zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzanb zzanbVar = this.zze;
        if (zzanbVar == zza) {
            return false;
        }
        if (zzanbVar != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzh.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzanb) this.zzh.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzanb next() {
        zzanb zzanbVarZzb;
        zzanb zzanbVar = this.zze;
        if (zzanbVar != null && zzanbVar != zza) {
            this.zze = null;
            return zzanbVar;
        }
        zzgyf zzgyfVar = this.zzd;
        if (zzgyfVar == null || this.zzf >= this.zzg) {
            this.zze = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzgyfVar) {
                this.zzd.zze(this.zzf);
                zzanbVarZzb = this.zzc.zzb(this.zzd, this);
                this.zzf = this.zzd.zzb();
            }
            return zzanbVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zze() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzgyk(this.zzh, this);
    }

    public final void zzf(zzgyf zzgyfVar, long j, zzamy zzamyVar) throws IOException {
        this.zzd = zzgyfVar;
        this.zzf = zzgyfVar.zzb();
        zzgyfVar.zze(zzgyfVar.zzb() + j);
        this.zzg = zzgyfVar.zzb();
        this.zzc = zzamyVar;
    }
}
