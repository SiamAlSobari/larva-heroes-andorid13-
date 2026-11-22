package com.google.android.gms.internal.ads;

import com.google.common.net.HttpHeaders;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzamt extends zzalp {
    private final Object zza;
    private final zzalu zzb;

    public zzamt(int i, String str, zzalu zzaluVar, zzalt zzaltVar) {
        super(i, str, zzaltVar);
        this.zza = new Object();
        this.zzb = zzaluVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    protected final zzalv zzh(zzall zzallVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzallVar.zzb;
            Map map = zzallVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get(HttpHeaders.CONTENT_TYPE)) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzallVar.zzb);
        }
        return zzalv.zzb(str, zzamm.zzb(zzallVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzalp
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzalu zzaluVar;
        synchronized (this.zza) {
            zzaluVar = this.zzb;
        }
        zzaluVar.zza(str);
    }
}
