package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzxd;
import com.google.android.gms.internal.gtm.zzxj;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public class zzxd<MessageType extends zzxj<MessageType, BuilderType>, BuilderType extends zzxd<MessageType, BuilderType>> extends zztk<MessageType, BuilderType> {
    protected zzxj zza;
    private final zzxj zzb;

    protected zzxd(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaq()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzad();
    }

    private static void zza(Object obj, Object obj2) {
        zzzd.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    public final zzxd zzA(zzxj zzxjVar) {
        if (!this.zzb.equals(zzxjVar)) {
            if (!this.zza.zzaq()) {
                zzH();
            }
            zza(this.zza, zzxjVar);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.gtm.zzyt
    /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final MessageType zzD() {
        MessageType messagetype = (MessageType) zzE();
        if (messagetype.zzay()) {
            return messagetype;
        }
        throw new zzzx(messagetype);
    }

    @Override // com.google.android.gms.internal.gtm.zzyt
    /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public MessageType zzE() {
        if (!this.zza.zzaq()) {
            return (MessageType) this.zza;
        }
        this.zza.zzal();
        return (MessageType) this.zza;
    }

    protected final void zzG() {
        if (this.zza.zzaq()) {
            return;
        }
        zzH();
    }

    protected void zzH() {
        zzxj zzxjVarZzad = this.zzb.zzad();
        zza(zzxjVarZzad, this.zza);
        this.zza = zzxjVarZzad;
    }

    @Override // com.google.android.gms.internal.gtm.zzyv
    public final /* synthetic */ zzyu zzax() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzyv
    public final boolean zzay() {
        return zzxj.zzap(this.zza, false);
    }

    @Override // com.google.android.gms.internal.gtm.zztk
    protected final /* synthetic */ zztk zzw(zztl zztlVar) {
        zzA((zzxj) zztlVar);
        return this;
    }

    @Override // com.google.android.gms.internal.gtm.zztk, com.google.android.gms.internal.gtm.zzyt
    public final /* bridge */ /* synthetic */ zzyt zzy(zzuj zzujVar, zzwt zzwtVar) throws IOException {
        if (!this.zza.zzaq()) {
            zzH();
        }
        try {
            zzzd.zza().zzb(this.zza.getClass()).zzh(this.zza, zzuk.zzq(zzujVar), zzwtVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zztk
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzxd zzv() {
        zzxd zzxdVar = (zzxd) this.zzb.zzb(5, null, null);
        zzxdVar.zza = zzE();
        return zzxdVar;
    }
}
