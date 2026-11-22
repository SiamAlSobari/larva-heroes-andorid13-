package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzub {
    public final int zza;
    public final zzts zzb;
    private final CopyOnWriteArrayList zzc;

    public zzub() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzub(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzts zztsVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztsVar;
    }

    public final zzub zza(int i, zzts zztsVar) {
        return new zzub(this.zzc, 0, zztsVar);
    }

    public final void zzb(Handler handler, zzuc zzucVar) {
        this.zzc.add(new zzua(handler, zzucVar));
    }

    public final void zzc(final zzto zztoVar) {
        for (zzua zzuaVar : this.zzc) {
            final zzuc zzucVar = zzuaVar.zzb;
            zzfk.zzG(zzuaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztv
                @Override // java.lang.Runnable
                public final void run() {
                    zzub zzubVar = this.zza;
                    zzucVar.zzac(0, zzubVar.zzb, zztoVar);
                }
            });
        }
    }

    public final void zzd(final zztj zztjVar, final zzto zztoVar) {
        for (zzua zzuaVar : this.zzc) {
            final zzuc zzucVar = zzuaVar.zzb;
            zzfk.zzG(zzuaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztw
                @Override // java.lang.Runnable
                public final void run() {
                    zzub zzubVar = this.zza;
                    zzucVar.zzad(0, zzubVar.zzb, zztjVar, zztoVar);
                }
            });
        }
    }

    public final void zze(final zztj zztjVar, final zzto zztoVar) {
        for (zzua zzuaVar : this.zzc) {
            final zzuc zzucVar = zzuaVar.zzb;
            zzfk.zzG(zzuaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztz
                @Override // java.lang.Runnable
                public final void run() {
                    zzub zzubVar = this.zza;
                    zzucVar.zzae(0, zzubVar.zzb, zztjVar, zztoVar);
                }
            });
        }
    }

    public final void zzf(final zztj zztjVar, final zzto zztoVar, final IOException iOException, final boolean z) {
        for (zzua zzuaVar : this.zzc) {
            final zzuc zzucVar = zzuaVar.zzb;
            zzfk.zzG(zzuaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zztx
                @Override // java.lang.Runnable
                public final void run() {
                    zzub zzubVar = this.zza;
                    zzucVar.zzaf(0, zzubVar.zzb, zztjVar, zztoVar, iOException, z);
                }
            });
        }
    }

    public final void zzg(final zztj zztjVar, final zzto zztoVar) {
        for (zzua zzuaVar : this.zzc) {
            final zzuc zzucVar = zzuaVar.zzb;
            zzfk.zzG(zzuaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzty
                @Override // java.lang.Runnable
                public final void run() {
                    zzub zzubVar = this.zza;
                    zzucVar.zzag(0, zzubVar.zzb, zztjVar, zztoVar);
                }
            });
        }
    }

    public final void zzh(zzuc zzucVar) {
        for (zzua zzuaVar : this.zzc) {
            if (zzuaVar.zzb == zzucVar) {
                this.zzc.remove(zzuaVar);
            }
        }
    }
}
