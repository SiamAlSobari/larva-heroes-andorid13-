package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzalp implements Comparable {
    private final zzama zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzalt zzf;
    private Integer zzg;
    private zzals zzh;
    private boolean zzi;
    private zzaky zzj;
    private zzalo zzk;
    private final zzald zzl;

    public zzalp(int i, String str, zzalt zzaltVar) {
        Uri uri;
        String host;
        this.zza = zzama.zza ? new zzama() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzaltVar;
        this.zzl = new zzald();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzalp) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        return "[ ] " + this.zzc + " " + "0x".concat(strValueOf) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzaky zzd() {
        return this.zzj;
    }

    public final zzalp zze(zzaky zzakyVar) {
        this.zzj = zzakyVar;
        return this;
    }

    public final zzalp zzf(zzals zzalsVar) {
        this.zzh = zzalsVar;
        return this;
    }

    public final zzalp zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    protected abstract zzalv zzh(zzall zzallVar);

    public final String zzj() {
        String str = this.zzc;
        if (this.zzb == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzakx {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzama.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzaly zzalyVar) {
        zzalt zzaltVar;
        synchronized (this.zze) {
            zzaltVar = this.zzf;
        }
        zzaltVar.zza(zzalyVar);
    }

    protected abstract void zzo(Object obj);

    final void zzp(String str) {
        zzals zzalsVar = this.zzh;
        if (zzalsVar != null) {
            zzalsVar.zzb(this);
        }
        if (zzama.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaln(this, str, id));
            } else {
                this.zza.zza(str, id);
                this.zza.zzb(toString());
            }
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    final void zzr() {
        zzalo zzaloVar;
        synchronized (this.zze) {
            zzaloVar = this.zzk;
        }
        if (zzaloVar != null) {
            zzaloVar.zza(this);
        }
    }

    final void zzs(zzalv zzalvVar) {
        zzalo zzaloVar;
        synchronized (this.zze) {
            zzaloVar = this.zzk;
        }
        if (zzaloVar != null) {
            zzaloVar.zzb(this, zzalvVar);
        }
    }

    final void zzt(int i) {
        zzals zzalsVar = this.zzh;
        if (zzalsVar != null) {
            zzalsVar.zzc(this, i);
        }
    }

    final void zzu(zzalo zzaloVar) {
        synchronized (this.zze) {
            this.zzk = zzaloVar;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzakx {
        return null;
    }

    public final zzald zzy() {
        return this.zzl;
    }
}
