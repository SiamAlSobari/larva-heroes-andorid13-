package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfca {
    public final com.google.android.gms.ads.internal.client.zzfl zza;
    public final zzbla zzb;
    public final zzekx zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbek zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzfbn zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final com.google.android.gms.ads.internal.client.zzcf zzr;

    /* synthetic */ zzfca(zzfby zzfbyVar, zzfbz zzfbzVar) {
        this.zze = zzfbyVar.zzb;
        this.zzf = zzfbyVar.zzc;
        this.zzr = zzfbyVar.zzs;
        int i = zzfbyVar.zza.zza;
        long j = zzfbyVar.zza.zzb;
        Bundle bundle = zzfbyVar.zza.zzc;
        int i2 = zzfbyVar.zza.zzd;
        List list = zzfbyVar.zza.zze;
        boolean z = zzfbyVar.zza.zzf;
        int i3 = zzfbyVar.zza.zzg;
        boolean z2 = true;
        if (!zzfbyVar.zza.zzh && !zzfbyVar.zze) {
            z2 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i, j, bundle, i2, list, z, i3, z2, zzfbyVar.zza.zzi, zzfbyVar.zza.zzj, zzfbyVar.zza.zzk, zzfbyVar.zza.zzl, zzfbyVar.zza.zzm, zzfbyVar.zza.zzn, zzfbyVar.zza.zzo, zzfbyVar.zza.zzp, zzfbyVar.zza.zzq, zzfbyVar.zza.zzr, zzfbyVar.zza.zzs, zzfbyVar.zza.zzt, zzfbyVar.zza.zzu, zzfbyVar.zza.zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfbyVar.zza.zzw), zzfbyVar.zza.zzx);
        this.zza = zzfbyVar.zzd != null ? zzfbyVar.zzd : zzfbyVar.zzh != null ? zzfbyVar.zzh.zzf : null;
        this.zzg = zzfbyVar.zzf;
        this.zzh = zzfbyVar.zzg;
        this.zzi = zzfbyVar.zzf == null ? null : zzfbyVar.zzh == null ? new zzbek(new NativeAdOptions.Builder().build()) : zzfbyVar.zzh;
        this.zzj = zzfbyVar.zzi;
        this.zzk = zzfbyVar.zzm;
        this.zzl = zzfbyVar.zzj;
        this.zzm = zzfbyVar.zzk;
        this.zzn = zzfbyVar.zzl;
        this.zzb = zzfbyVar.zzn;
        this.zzo = new zzfbn(zzfbyVar.zzo, null);
        this.zzp = zzfbyVar.zzp;
        this.zzc = zzfbyVar.zzq;
        this.zzq = zzfbyVar.zzr;
    }

    public final zzbgn zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcS));
    }
}
