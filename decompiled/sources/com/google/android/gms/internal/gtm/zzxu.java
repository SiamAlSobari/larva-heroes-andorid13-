package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public class zzxu extends IOException {
    private zzyu zza;
    private boolean zzb;

    public zzxu(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    static zzxt zza() {
        return new zzxt("Protocol message tag had invalid wire type.");
    }

    static zzxu zzb() {
        return new zzxu("Protocol message end-group tag did not match expected tag.");
    }

    static zzxu zzc() {
        return new zzxu("Protocol message contained an invalid tag (zero).");
    }

    static zzxu zzd() {
        return new zzxu("Protocol message had invalid UTF-8.");
    }

    static zzxu zze() {
        return new zzxu("CodedInputStream encountered a malformed varint.");
    }

    static zzxu zzf() {
        return new zzxu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzxu zzg() {
        return new zzxu("Failed to parse the message.");
    }

    static zzxu zzi() {
        return new zzxu("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzxu zzj() {
        return new zzxu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzxu zzh(zzyu zzyuVar) {
        this.zza = zzyuVar;
        return this;
    }

    final void zzk() {
        this.zzb = true;
    }

    final boolean zzl() {
        return this.zzb;
    }

    public zzxu(String str) {
        super(str);
        this.zza = null;
    }
}
