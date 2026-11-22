package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgrm;
import com.google.android.gms.internal.ads.zzgrq;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgrm<MessageType extends zzgrq<MessageType, BuilderType>, BuilderType extends zzgrm<MessageType, BuilderType>> extends zzgpq<MessageType, BuilderType> {
    protected zzgrq zza;
    private final zzgrq zzb;

    protected zzgrm(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaY()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzaD();
    }

    private static void zza(Object obj, Object obj2) {
        zzgti.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    /* JADX INFO: renamed from: zzai, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzgrm zzah() {
        zzgrm zzgrmVar = (zzgrm) this.zzb.zzb(5, null, null);
        zzgrmVar.zza = zzan();
        return zzgrmVar;
    }

    public final zzgrm zzaj(zzgrq zzgrqVar) {
        if (!this.zzb.equals(zzgrqVar)) {
            if (!this.zza.zzaY()) {
                zzaq();
            }
            zza(this.zza, zzgrqVar);
        }
        return this;
    }

    public final zzgrm zzak(byte[] bArr, int i, int i2, zzgrc zzgrcVar) throws zzgsc {
        if (!this.zza.zzaY()) {
            zzaq();
        }
        try {
            zzgti.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new zzgpu(zzgrcVar));
            return this;
        } catch (zzgsc e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgsc.zzj();
        }
    }

    public final MessageType zzal() {
        MessageType messagetype = (MessageType) zzan();
        if (messagetype.zzaX()) {
            return messagetype;
        }
        throw new zzguj(messagetype);
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    /* JADX INFO: renamed from: zzam, reason: merged with bridge method [inline-methods] */
    public MessageType zzan() {
        if (!this.zza.zzaY()) {
            return (MessageType) this.zza;
        }
        this.zza.zzaS();
        return (MessageType) this.zza;
    }

    protected final void zzap() {
        if (this.zza.zzaY()) {
            return;
        }
        zzaq();
    }

    protected void zzaq() {
        zzgrq zzgrqVarZzaD = this.zzb.zzaD();
        zza(zzgrqVarZzaD, this.zza);
        this.zza = zzgrqVarZzaD;
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final /* synthetic */ zzgta zzbf() {
        throw null;
    }
}
