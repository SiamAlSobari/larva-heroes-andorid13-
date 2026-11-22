package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyy {
    private final zzzk zza;
    private final zzyz zzb;
    private final zzdj zze;
    private Handler zzf;
    private zzdl zzg;
    private CopyOnWriteArrayList zzh;
    private zzdz zzi;
    private Pair zzj;
    private final ArrayDeque zzc = new ArrayDeque();
    private final ArrayDeque zzd = new ArrayDeque();
    private boolean zzk = true;
    private final zzdn zzl = zzdn.zza;

    public zzyy(zzdj zzdjVar, zzzk zzzkVar, zzyz zzyzVar) {
        this.zze = zzdjVar;
        this.zza = zzzkVar;
        this.zzb = zzyzVar;
    }

    public final void zza(String str) {
        Context context = this.zzb.zze;
        if (zzfk.zza >= 29) {
            int i = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
        }
    }

    public final void zzb(Surface surface, zzfc zzfcVar) {
        Pair pair = this.zzj;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzfc) this.zzj.second).equals(zzfcVar)) {
            return;
        }
        this.zzj = Pair.create(surface, zzfcVar);
    }

    public final void zzc(List list) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzh;
        if (copyOnWriteArrayList == null) {
            this.zzh = new CopyOnWriteArrayList(list);
        } else {
            copyOnWriteArrayList.clear();
            this.zzh.addAll(list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    public final boolean zzd(zzam zzamVar, long j, zzdz zzdzVar) throws zzil {
        Pair pairCreate;
        int i;
        if (!this.zzk) {
            return false;
        }
        if (this.zzh == null) {
            this.zzk = false;
            return false;
        }
        this.zzf = zzfk.zzu(null);
        this.zzi = zzdzVar;
        zzs zzsVar = zzamVar.zzy;
        zzs zzsVar2 = zzs.zza;
        if (zzsVar == null) {
            zzs zzsVar3 = zzs.zza;
            pairCreate = Pair.create(zzsVar3, zzsVar3);
        } else {
            int i2 = zzsVar.zzf;
            if (i2 == 7) {
                zzr zzrVarZzc = zzsVar.zzc();
                zzrVarZzc.zzc(6);
                pairCreate = Pair.create(zzsVar, zzrVarZzc.zzd());
            } else if (i2 == 6) {
                pairCreate = Pair.create(zzsVar, zzsVar);
            } else {
                zzs zzsVar4 = zzs.zza;
                pairCreate = Pair.create(zzsVar4, zzsVar4);
            }
        }
        try {
            if (!zzyz.zzaS() && (i = zzamVar.zzu) != 0) {
                this.zzh.add(0, zzyx.zza(i));
            }
            zzdj zzdjVar = this.zze;
            Context context = this.zzb.zze;
            zzv zzvVar = zzv.zzb;
            zzs zzsVar5 = (zzs) pairCreate.first;
            zzs zzsVar6 = (zzs) pairCreate.second;
            final Handler handler = this.zzf;
            handler.getClass();
            this.zzg = zzdjVar.zza(context, zzvVar, zzsVar5, zzsVar6, false, new Executor() { // from class: com.google.android.gms.internal.ads.zzyv
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, new zzyw(this, zzamVar));
            throw null;
        } catch (Exception e) {
            throw this.zzb.zzi(e, zzamVar, false, 7000);
        }
    }
}
