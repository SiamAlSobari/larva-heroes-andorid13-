package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbi {
    public final Uri zzb;
    public final List zzf;
    public final zzfud zzh;

    @Deprecated
    public final List zzi;
    public final Object zzj;
    private static final String zzk = Integer.toString(0, 36);
    private static final String zzl = Integer.toString(1, 36);
    private static final String zzm = Integer.toString(2, 36);
    private static final String zzn = Integer.toString(3, 36);
    private static final String zzo = Integer.toString(4, 36);
    private static final String zzp = Integer.toString(5, 36);
    private static final String zzq = Integer.toString(6, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzbg
    };
    public final String zzc = null;
    public final zzbb zzd = null;
    public final zzaq zze = null;
    public final String zzg = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ zzbi(Uri uri, String str, zzbb zzbbVar, zzaq zzaqVar, List list, String str2, zzfud zzfudVar, Object obj, zzbh zzbhVar) {
        this.zzb = uri;
        this.zzf = list;
        this.zzh = zzfudVar;
        zzfua zzfuaVar = new zzfua();
        if (zzfudVar.size() > 0) {
            throw null;
        }
        this.zzi = zzfuaVar.zzi();
        this.zzj = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbi)) {
            return false;
        }
        zzbi zzbiVar = (zzbi) obj;
        if (this.zzb.equals(zzbiVar.zzb)) {
            String str = zzbiVar.zzc;
            if (zzfk.zzD(null, null)) {
                zzbb zzbbVar = zzbiVar.zzd;
                if (zzfk.zzD(null, null)) {
                    zzaq zzaqVar = zzbiVar.zze;
                    if (zzfk.zzD(null, null) && this.zzf.equals(zzbiVar.zzf)) {
                        String str2 = zzbiVar.zzg;
                        if (zzfk.zzD(null, null) && this.zzh.equals(zzbiVar.zzh)) {
                            Object obj2 = zzbiVar.zzj;
                            if (zzfk.zzD(null, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zzb.hashCode() * 923521) + this.zzf.hashCode()) * 961) + this.zzh.hashCode()) * 31;
    }
}
