package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzasm extends zzatm {
    private static final zzatn zzi = new zzatn();
    private final Context zzj;

    public zzasm(zzary zzaryVar, String str, String str2, zzanv zzanvVar, int i, int i2, Context context, zzano zzanoVar) {
        super(zzaryVar, "p0JEft1H0Ux+/zQoofBGK8/hHhAdN3veKIjNmetX6I2+7J67s0tf2NBKaWy11XvI", "yaxGJhC1WxugM+8EfEc/xAIuDWtPkz77G//hU7f/vWw=", zzanvVar, i, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaos zzaosVarZzc = this.zzb.zzc();
            if (zzaosVarZzc == null || !zzaosVarZzc.zzaj()) {
                return null;
            }
            return zzaosVarZzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzapj zzapjVar;
        AtomicReference atomicReferenceZza = zzi.zza(this.zzj.getPackageName());
        synchronized (atomicReferenceZza) {
            zzapj zzapjVar2 = (zzapj) atomicReferenceZza.get();
            if (zzapjVar2 == null || zzasb.zzd(zzapjVar2.zza) || zzapjVar2.zza.equals("E") || zzapjVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzasb.zzd(null)) {
                    (!zzasb.zzd(null) ? false : false).booleanValue();
                    i = 3;
                } else {
                    i = 5;
                }
                Boolean boolValueOf = Boolean.valueOf(i == 3);
                Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzci);
                String strZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzch)).booleanValue() ? zzb() : null;
                if (bool.booleanValue() && this.zzb.zzp() && zzasb.zzd(strZzb)) {
                    strZzb = zzc();
                }
                zzapj zzapjVar3 = new zzapj((String) this.zzf.invoke(null, this.zzj, boolValueOf, strZzb));
                if (zzasb.zzd(zzapjVar3.zza) || zzapjVar3.zza.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String strZzc = zzc();
                        if (!zzasb.zzd(strZzc)) {
                            zzapjVar3.zza = strZzc;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                atomicReferenceZza.set(zzapjVar3);
            }
            zzapjVar = (zzapj) atomicReferenceZza.get();
        }
        synchronized (this.zze) {
            if (zzapjVar != null) {
                this.zze.zzx(zzapjVar.zza);
                this.zze.zzX(zzapjVar.zzb);
                this.zze.zzZ(zzapjVar.zzc);
                this.zze.zzi(zzapjVar.zzd);
                this.zze.zzw(zzapjVar.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrZzf = zzasb.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcj));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzasb.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzck)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzfyw zzfywVarZze = zzfyw.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzato
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    zzfyw zzfywVar = zzfywVarZze;
                    if (list == null) {
                        zzfywVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksumM210m = com.android.billingclient.api.zzg$$ExternalSyntheticApiModelOutline0.m210m(list.get(i));
                            if (apkChecksumM210m.getType() == 8) {
                                zzfywVar.zzc(zzasb.zzb(apkChecksumM210m.getValue()));
                                return;
                            }
                        }
                        zzfywVar.zzc(null);
                    } catch (Throwable unused) {
                        zzfywVar.zzc(null);
                    }
                }
            });
            return (String) zzfywVarZze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
