package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzhb extends zzgj {
    public final zzgn zzb;
    public final int zzc;

    public zzhb(zzgn zzgnVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = zzgnVar;
        this.zzc = 1;
    }

    public static zzhb zza(IOException iOException, zzgn zzgnVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = GamesStatusCodes.STATUS_REQUEST_TOO_MANY_RECIPIENTS;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = PointerIconCompat.TYPE_WAIT;
        } else {
            i2 = (message == null || !zzfqo.zza(message).matches("cleartext.*not permitted.*")) ? GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE : 2007;
        }
        return i2 == 2007 ? new zzha(iOException, zzgnVar) : new zzhb(iOException, zzgnVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        if (i != 2000) {
            return i;
        }
        if (i2 != 1) {
            return 2000;
        }
        return GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE;
    }

    public zzhb(IOException iOException, zzgn zzgnVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = zzgnVar;
        this.zzc = i2;
    }

    public zzhb(String str, zzgn zzgnVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = zzgnVar;
        this.zzc = i2;
    }

    public zzhb(String str, IOException iOException, zzgn zzgnVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = zzgnVar;
        this.zzc = i2;
    }
}
