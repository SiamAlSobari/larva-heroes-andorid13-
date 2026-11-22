package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaas extends zzwt {
    private zzaas() {
        super(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    @Override // com.google.android.gms.internal.gtm.zzwt
    public final zzxh zzb(zzyu zzyuVar, int i) {
        byte b;
        switch (zzyuVar.getClass().getName()) {
            case "com.google.android.gms.internal.gtm.zzam":
                b = 3;
                break;
            case "com.google.android.gms.internal.gtm.zzvn":
                b = 0;
                break;
            case "com.google.android.gms.internal.gtm.zzwj":
                b = 2;
                break;
            case "com.google.android.gms.internal.gtm.zzwl":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            switch (i) {
                case 21596320:
                    return zzabv.zzd;
                case 21623477:
                    return zzabv.zzb;
                case 21713708:
                    return zzabv.zza;
                case 23459630:
                    return zzabv.zzc;
                case 26652850:
                    return zzabv.zze;
                case 40075780:
                    return zzabn.zza;
                case 40093572:
                    return zzabn.zzd;
                case 40221563:
                    return zzabn.zze;
                case 40223876:
                    return zzabn.zzf;
                case 40270992:
                    return zzabn.zzb;
                case 53697879:
                    return zzabv.zzf;
                case 56871503:
                    return zzabv.zzg;
                case 69646961:
                    return zzabn.zzc;
                default:
                    return null;
            }
        }
        if (b == 1) {
            switch (i) {
                case 21467048:
                    return zzabv.zzk;
                case 21596320:
                    return zzabv.zzj;
                case 21623477:
                    return zzabv.zzi;
                case 21713708:
                    return zzabv.zzh;
                case 26652850:
                    return zzabv.zzl;
                case 41149386:
                    return zzabn.zzg;
                case 41551199:
                    return zzabn.zzh;
                case 41744383:
                    return zzabn.zzj;
                case 41909987:
                    return zzabn.zzk;
                case 69646961:
                    return zzabn.zzi;
                default:
                    return null;
            }
        }
        if (b == 2) {
            switch (i) {
                case 21596320:
                    return zzabv.zzm;
                case 28993747:
                    return zzabv.zzn;
                case 43601160:
                    return zzabn.zzl;
                case 71304954:
                    return zzabn.zzm;
                default:
                    return null;
            }
        }
        if (b != 3) {
            return null;
        }
        if (i == 101) {
            return zzag.zza;
        }
        if (i != 47497405) {
            return null;
        }
        return zze.zza;
    }

    /* synthetic */ zzaas(zzaaq zzaaqVar) {
        super(true);
    }
}
