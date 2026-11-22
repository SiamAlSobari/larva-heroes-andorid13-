package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsv implements zzul {
    private final zzabi zza;
    private zzabb zzb;
    private zzabc zzc;

    public zzsv(zzabi zzabiVar) {
        this.zza = zzabiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final long zzb() {
        zzabc zzabcVar = this.zzc;
        if (zzabcVar != null) {
            return zzabcVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzc() {
        zzabb zzabbVar = this.zzb;
        if (zzabbVar != null && (zzabbVar instanceof zzagc)) {
            ((zzagc) zzabbVar).zze();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzd(zzt zztVar, Uri uri, Map map, long j, long j2, zzabe zzabeVar) throws IOException {
        zzaar zzaarVar = new zzaar(zztVar, j, j2);
        this.zzc = zzaarVar;
        if (this.zzb != null) {
            return;
        }
        zzabb[] zzabbVarArrZza = this.zza.zza(uri, map);
        int i = 0;
        boolean z = true;
        if (zzabbVarArrZza.length == 1) {
            this.zzb = zzabbVarArrZza[0];
        } else {
            for (zzabb zzabbVar : zzabbVarArrZza) {
                try {
                    if (zzabbVar.zzd(zzaarVar)) {
                        this.zzb = zzabbVar;
                        if (zzabbVar == null && zzaarVar.zzf() != j) {
                            z = false;
                        }
                        zzdy.zzf(z);
                        zzaarVar.zzj();
                        break;
                    }
                    boolean z2 = this.zzb != null || zzaarVar.zzf() == j;
                    zzdy.zzf(z2);
                    zzaarVar.zzj();
                } catch (EOFException unused) {
                    if (this.zzb != null || zzaarVar.zzf() == j) {
                    }
                } catch (Throwable th) {
                    zzdy.zzf(this.zzb != null || zzaarVar.zzf() == j);
                    zzaarVar.zzj();
                    throw th;
                }
                zzdy.zzf(z2);
                zzaarVar.zzj();
            }
            if (this.zzb == null) {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int length = zzabbVarArrZza.length;
                    if (i >= length) {
                        throw new zzvt("None of the available extractors (" + sb.toString() + ") could read the stream.", uri);
                    }
                    sb.append(zzabbVarArrZza[i].getClass().getSimpleName());
                    if (i < length - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
            }
        }
        this.zzb.zzb(zzabeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final int zza(zzabx zzabxVar) throws IOException {
        zzabb zzabbVar = this.zzb;
        zzabbVar.getClass();
        zzabc zzabcVar = this.zzc;
        zzabcVar.getClass();
        return zzabbVar.zza(zzabcVar, zzabxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzf(long j, long j2) {
        zzabb zzabbVar = this.zzb;
        zzabbVar.getClass();
        zzabbVar.zzc(j, j2);
    }
}
