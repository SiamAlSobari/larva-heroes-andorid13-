package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfom {
    public static ListenableFuture zza(Task task) {
        final zzfol zzfolVar = new zzfol(task);
        task.addOnCompleteListener(zzfyu.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfok
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfol zzfolVar2 = zzfolVar;
                if (task2.isCanceled()) {
                    zzfolVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfolVar2.zzc(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzfolVar2.zzd(exception);
            }
        });
        return zzfolVar;
    }
}
