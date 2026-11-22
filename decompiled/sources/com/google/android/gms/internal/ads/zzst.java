package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzst implements zztu {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzub zzc = new zzub();
    private final zzqt zzd = new zzqt();
    private Looper zze;
    private zzcw zzf;
    private zzoh zzg;

    @Override // com.google.android.gms.internal.ads.zztu
    public /* synthetic */ zzcw zzM() {
        return null;
    }

    protected final zzoh zzb() {
        zzoh zzohVar = this.zzg;
        zzdy.zzb(zzohVar);
        return zzohVar;
    }

    protected final zzqt zzc(zzts zztsVar) {
        return this.zzd.zza(0, zztsVar);
    }

    protected final zzqt zzd(int i, zzts zztsVar) {
        return this.zzd.zza(0, zztsVar);
    }

    protected final zzub zze(zzts zztsVar) {
        return this.zzc.zza(0, zztsVar);
    }

    protected final zzub zzf(int i, zzts zztsVar) {
        return this.zzc.zza(0, zztsVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzg(Handler handler, zzqu zzquVar) {
        this.zzd.zzb(handler, zzquVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzh(Handler handler, zzuc zzucVar) {
        this.zzc.zzb(handler, zzucVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzi(zztt zzttVar) {
        boolean z = !this.zzb.isEmpty();
        this.zzb.remove(zzttVar);
        if (z && this.zzb.isEmpty()) {
            zzj();
        }
    }

    protected void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzk(zztt zzttVar) {
        this.zze.getClass();
        boolean zIsEmpty = this.zzb.isEmpty();
        this.zzb.add(zzttVar);
        if (zIsEmpty) {
            zzl();
        }
    }

    protected void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzm(zztt zzttVar, zzhk zzhkVar, zzoh zzohVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        zzdy.zzd(z);
        this.zzg = zzohVar;
        zzcw zzcwVar = this.zzf;
        this.zza.add(zzttVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzttVar);
            zzn(zzhkVar);
        } else if (zzcwVar != null) {
            zzk(zzttVar);
            zzttVar.zza(this, zzcwVar);
        }
    }

    protected abstract void zzn(zzhk zzhkVar);

    protected final void zzo(zzcw zzcwVar) {
        this.zzf = zzcwVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zztt) arrayList.get(i)).zza(this, zzcwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzp(zztt zzttVar) {
        this.zza.remove(zzttVar);
        if (!this.zza.isEmpty()) {
            zzi(zzttVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzq();
    }

    protected abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzr(zzqu zzquVar) {
        this.zzd.zzc(zzquVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzs(zzuc zzucVar) {
        this.zzc.zzh(zzucVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public /* synthetic */ void zzt(zzbp zzbpVar) {
        throw null;
    }

    protected final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public /* synthetic */ boolean zzv() {
        return true;
    }
}
