package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahq implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzahp
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzahq.zza;
            return new zzabb[]{new zzahq()};
        }
    };
    private zzabe zzb;
    private zzahy zzc;
    private boolean zzd;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zze(zzabc zzabcVar) throws IOException {
        zzahs zzahsVar = new zzahs();
        if (zzahsVar.zzb(zzabcVar, true) && (zzahsVar.zza & 2) == 2) {
            int iMin = Math.min(zzahsVar.zze, 8);
            zzfb zzfbVar = new zzfb(iMin);
            ((zzaar) zzabcVar).zzm(zzfbVar.zzI(), 0, iMin, false);
            zzfbVar.zzG(0);
            if (zzfbVar.zza() >= 5 && zzfbVar.zzl() == 127 && zzfbVar.zzt() == 1179402563) {
                this.zzc = new zzaho();
            } else {
                zzfbVar.zzG(0);
                try {
                    if (zzack.zzd(1, zzfbVar, true)) {
                        this.zzc = new zzaia();
                    } else {
                        zzfbVar.zzG(0);
                        if (zzahu.zzd(zzfbVar)) {
                            this.zzc = new zzahu();
                        }
                    }
                } catch (zzcd unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        zzdy.zzb(this.zzb);
        if (this.zzc == null) {
            if (!zze(zzabcVar)) {
                throw zzcd.zza("Failed to determine bitstream type", null);
            }
            zzabcVar.zzj();
        }
        if (!this.zzd) {
            zzace zzaceVarZzv = this.zzb.zzv(0, 1);
            this.zzb.zzC();
            this.zzc.zzh(this.zzb, zzaceVarZzv);
            this.zzd = true;
        }
        return this.zzc.zze(zzabcVar, zzabxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzb = zzabeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        zzahy zzahyVar = this.zzc;
        if (zzahyVar != null) {
            zzahyVar.zzj(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        try {
            return zze(zzabcVar);
        } catch (zzcd unused) {
            return false;
        }
    }
}
