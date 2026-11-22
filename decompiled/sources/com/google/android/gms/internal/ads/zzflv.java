package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzflv {
    private final Context zza;
    private final Executor zzb;
    private final zzflc zzc;
    private final zzfle zzd;
    private final zzflu zze;
    private final zzflu zzf;
    private Task zzg;
    private Task zzh;

    zzflv(Context context, Executor executor, zzflc zzflcVar, zzfle zzfleVar, zzfls zzflsVar, zzflt zzfltVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzflcVar;
        this.zzd = zzfleVar;
        this.zze = zzflsVar;
        this.zzf = zzfltVar;
    }

    public static zzflv zze(Context context, Executor executor, zzflc zzflcVar, zzfle zzfleVar) {
        final zzflv zzflvVar = new zzflv(context, executor, zzflcVar, zzfleVar, new zzfls(), new zzflt());
        if (zzflvVar.zzd.zzd()) {
            zzflvVar.zzg = zzflvVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzflp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzc();
                }
            });
        } else {
            zzflvVar.zzg = Tasks.forResult(zzflvVar.zze.zza());
        }
        zzflvVar.zzh = zzflvVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzflq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzd();
            }
        });
        return zzflvVar;
    }

    private static zzaos zzg(Task task, zzaos zzaosVar) {
        return !task.isSuccessful() ? zzaosVar : (zzaos) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzflr
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zza.zzf(exc);
            }
        });
    }

    public final zzaos zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzaos zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    final /* synthetic */ zzaos zzc() throws Exception {
        Context context = this.zza;
        zzanv zzanvVarZza = zzaos.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zzanvVarZza.zzs(id);
            zzanvVarZza.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zzanvVarZza.zzab(6);
        }
        return (zzaos) zzanvVarZza.zzal();
    }

    final /* synthetic */ zzaos zzd() throws Exception {
        Context context = this.zza;
        return zzflk.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
