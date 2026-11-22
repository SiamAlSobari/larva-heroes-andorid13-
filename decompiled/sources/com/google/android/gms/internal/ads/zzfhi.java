package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhi implements zzfhg {
    private final Context zza;
    private final int zzo;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzp = 2;
    private int zzq = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private boolean zzm = false;
    private boolean zzn = false;

    zzfhi(Context context, int i) {
        this.zza = context;
        this.zzo = i;
    }

    public final synchronized zzfhi zzH(int i) {
        this.zzp = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzb(zzfbq zzfbqVar) {
        zzr(zzfbqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzc(String str) {
        zzs(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzd(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zze(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzf(boolean z) {
        zzv(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzg(Throwable th) {
        zzw(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzh() {
        zzx();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzi() {
        zzy();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final synchronized boolean zzj() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final boolean zzk() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final synchronized zzfhk zzl() {
        zzfhj zzfhjVar = null;
        if (this.zzm) {
            return null;
        }
        this.zzm = true;
        if (!this.zzn) {
            zzx();
        }
        if (this.zzc < 0) {
            zzy();
        }
        return new zzfhk(this, zzfhjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzm(int i) {
        zzH(i);
        return this;
    }

    public final synchronized zzfhi zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder == null) {
            return this;
        }
        zzcwb zzcwbVar = (zzcwb) iBinder;
        String strZzk = zzcwbVar.zzk();
        if (!TextUtils.isEmpty(strZzk)) {
            this.zzf = strZzk;
        }
        String strZzi = zzcwbVar.zzi();
        if (!TextUtils.isEmpty(strZzi)) {
            this.zzg = strZzi;
        }
        return this;
    }

    public final synchronized zzfhi zzr(zzfbq zzfbqVar) {
        if (!TextUtils.isEmpty(zzfbqVar.zzb.zzb)) {
            this.zzf = zzfbqVar.zzb.zzb;
        }
        for (zzfbe zzfbeVar : zzfbqVar.zza) {
            if (!TextUtils.isEmpty(zzfbeVar.zzac)) {
                this.zzg = zzfbeVar.zzac;
                break;
            }
        }
        return this;
    }

    public final synchronized zzfhi zzs(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziu)).booleanValue()) {
            this.zzl = str;
        }
        return this;
    }

    public final synchronized zzfhi zzt(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfhi zzu(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfhi zzv(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfhi zzw(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziu)).booleanValue()) {
            this.zzk = zzbtf.zzd(th);
            this.zzj = (String) zzfrv.zzc(zzfqt.zzc('\n')).zzd(zzbtf.zzc(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfhi zzx() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzt.zzq().zzn(this.zza);
        Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzq = i;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        this.zzn = true;
        return this;
    }

    public final synchronized zzfhi zzy() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        return this;
    }
}
