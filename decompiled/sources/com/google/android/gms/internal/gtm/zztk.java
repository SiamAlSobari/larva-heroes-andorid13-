package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztk;
import com.google.android.gms.internal.gtm.zztl;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zztk<MessageType extends zztl<MessageType, BuilderType>, BuilderType extends zztk<MessageType, BuilderType>> implements zzyt {
    @Override // 
    public abstract zztk zzv();

    protected abstract zztk zzw(zztl zztlVar);

    @Override // com.google.android.gms.internal.gtm.zzyt
    public final /* bridge */ /* synthetic */ zzyt zzx(zzyu zzyuVar) {
        if (zzax().getClass().isInstance(zzyuVar)) {
            return zzw((zztl) zzyuVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.gms.internal.gtm.zzyt
    public /* bridge */ /* synthetic */ zzyt zzy(zzuj zzujVar, zzwt zzwtVar) throws IOException {
        throw null;
    }
}
