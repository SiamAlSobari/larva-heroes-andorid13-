package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzka;
import com.google.android.gms.internal.measurement.zzke;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* JADX INFO: loaded from: classes2.dex */
public class zzka<MessageType extends zzke<MessageType, BuilderType>, BuilderType extends zzka<MessageType, BuilderType>> extends zzim<MessageType, BuilderType> {
    protected zzke zza;
    protected boolean zzb = false;
    private final zzke zzc;

    protected zzka(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzke) messagetype.zzl(4, null, null);
    }

    private static final void zza(zzke zzkeVar, zzke zzkeVar2) {
        zzlt.zza().zzb(zzkeVar.getClass()).zzg(zzkeVar, zzkeVar2);
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzka zzau() {
        zzka zzkaVar = (zzka) this.zzc.zzl(5, null, null);
        zzkaVar.zzaC(zzaG());
        return zzkaVar;
    }

    public final zzka zzaC(zzke zzkeVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zza(this.zza, zzkeVar);
        return this;
    }

    public final zzka zzaD(byte[] bArr, int i, int i2, zzjq zzjqVar) throws zzko {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        try {
            zzlt.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i2, new zziq(zzjqVar));
            return this;
        } catch (zzko e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzko.zzf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessageType zzaE() {
        MessageType messagetype = (MessageType) zzaG();
        Boolean bool = Boolean.TRUE;
        byte bByteValue = ((Byte) messagetype.zzl(1, null, null)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue != 0) {
                boolean zZzk = zzlt.zza().zzb(messagetype.getClass()).zzk(messagetype);
                messagetype.zzl(2, true != zZzk ? null : messagetype, null);
            }
            throw new zzmm(messagetype);
        }
        return messagetype;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public MessageType zzaG() {
        if (this.zzb) {
            return (MessageType) this.zza;
        }
        zzke zzkeVar = this.zza;
        zzlt.zza().zzb(zzkeVar.getClass()).zzf(zzkeVar);
        this.zzb = true;
        return (MessageType) this.zza;
    }

    protected void zzaI() {
        zzke zzkeVar = (zzke) this.zza.zzl(4, null, null);
        zza(zzkeVar, this.zza);
        this.zza = zzkeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    protected final /* synthetic */ zzim zzav(zzin zzinVar) {
        zzaC((zzke) zzinVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final /* bridge */ /* synthetic */ zzim zzaw(byte[] bArr, int i, int i2) throws zzko {
        zzaD(bArr, 0, i2, zzjq.zza);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final /* bridge */ /* synthetic */ zzim zzax(byte[] bArr, int i, int i2, zzjq zzjqVar) throws zzko {
        zzaD(bArr, 0, i2, zzjqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final /* synthetic */ zzll zzbO() {
        return this.zzc;
    }
}
