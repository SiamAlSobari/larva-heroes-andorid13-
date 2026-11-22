package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import com.google.android.gms.internal.p002firebaseauthapi.zzakk;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public class zzakg<MessageType extends zzakk<MessageType, BuilderType>, BuilderType extends zzakg<MessageType, BuilderType>> extends zzaio<MessageType, BuilderType> {
    protected zzakk zza;
    private final zzakk zzb;

    protected zzakg(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzL()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzw();
    }

    private static void zza(Object obj, Object obj2) {
        zzalx.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalq
    public final /* synthetic */ zzalp zzM() {
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaio
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzakg clone() {
        zzakg zzakgVar = (zzakg) this.zzb.zzj(5, null, null);
        zzakgVar.zza = zzk();
        return zzakgVar;
    }

    public final zzakg zzh(zzakk zzakkVar) {
        if (!this.zzb.equals(zzakkVar)) {
            if (!this.zza.zzL()) {
                zzn();
            }
            zza(this.zza, zzakkVar);
        }
        return this;
    }

    public final MessageType zzi() {
        MessageType messagetype = (MessageType) zzk();
        if (messagetype.zzK()) {
            return messagetype;
        }
        throw new zzamu(messagetype);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalo
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public MessageType zzk() {
        if (!this.zza.zzL()) {
            return (MessageType) this.zza;
        }
        this.zza.zzF();
        return (MessageType) this.zza;
    }

    protected final void zzm() {
        if (this.zza.zzL()) {
            return;
        }
        zzn();
    }

    protected void zzn() {
        zzakk zzakkVarZzw = this.zzb.zzw();
        zza(zzakkVarZzw, this.zza);
        this.zza = zzakkVarZzw;
    }
}
