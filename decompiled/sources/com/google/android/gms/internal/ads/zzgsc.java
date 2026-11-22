package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgsc extends IOException {
    private zzgta zza;
    private boolean zzb;

    public zzgsc(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    static zzgsb zza() {
        return new zzgsb("Protocol message tag had invalid wire type.");
    }

    static zzgsc zzb() {
        return new zzgsc("Protocol message end-group tag did not match expected tag.");
    }

    static zzgsc zzc() {
        return new zzgsc("Protocol message contained an invalid tag (zero).");
    }

    static zzgsc zzd() {
        return new zzgsc("Protocol message had invalid UTF-8.");
    }

    static zzgsc zze() {
        return new zzgsc("CodedInputStream encountered a malformed varint.");
    }

    static zzgsc zzf() {
        return new zzgsc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzgsc zzg() {
        return new zzgsc("Failed to parse the message.");
    }

    static zzgsc zzi() {
        return new zzgsc("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzgsc zzj() {
        return new zzgsc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzgsc zzh(zzgta zzgtaVar) {
        this.zza = zzgtaVar;
        return this;
    }

    final void zzk() {
        this.zzb = true;
    }

    final boolean zzl() {
        return this.zzb;
    }

    public zzgsc(String str) {
        super(str);
        this.zza = null;
    }
}
