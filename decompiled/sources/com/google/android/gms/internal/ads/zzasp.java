package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzasp extends zzatm {
    private final long zzi;

    public zzasp(zzary zzaryVar, String str, String str2, zzanv zzanvVar, long j, int i, int i2) {
        super(zzaryVar, "MbAcGuLi+XGl3MsgqAiQYLikemL120ZFxn+dIhaD+rHWJuTeO/M8+1c58cczHjCs", "Eg2eC3eNesWzbAUINzxj1mXRcYgmzS654CxZFoVQbAM=", zzanvVar, i, 25);
        this.zzi = j;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzt(jLongValue);
            long j = this.zzi;
            if (j != 0) {
                this.zze.zzT(jLongValue - j);
                this.zze.zzU(this.zzi);
            }
        }
    }
}
