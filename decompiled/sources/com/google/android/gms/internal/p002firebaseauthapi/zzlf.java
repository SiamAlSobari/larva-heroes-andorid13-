package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlf {
    public static final zzwn zza;
    public static final zzwn zzb;
    public static final zzwn zzc;
    private static final byte[] zzd;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zza = zza(zzux.NIST_P256, zzvc.SHA256, zzud.UNCOMPRESSED, zzcw.zza, zzxo.TINK, bArr);
        zzb = zza(zzux.NIST_P256, zzvc.SHA256, zzud.COMPRESSED, zzcw.zza, zzxo.RAW, bArr);
        zzc = zza(zzux.NIST_P256, zzvc.SHA256, zzud.UNCOMPRESSED, zzcw.zze, zzxo.TINK, bArr);
    }

    @Deprecated
    static zzwn zza(zzux zzuxVar, zzvc zzvcVar, zzud zzudVar, zzwn zzwnVar, zzxo zzxoVar, byte[] bArr) {
        zzui zzuiVarZza = zzuj.zza();
        zzuu zzuuVarZza = zzuv.zza();
        zzuuVarZza.zza(zzuxVar);
        zzuuVarZza.zzb(zzvcVar);
        zzuuVarZza.zzc(zzajf.zzn(bArr, 0, 0));
        zzuv zzuvVar = (zzuv) zzuuVarZza.zzi();
        zzuf zzufVarZza = zzug.zza();
        zzufVarZza.zza(zzwnVar);
        zzug zzugVar = (zzug) zzufVarZza.zzi();
        zzul zzulVarZzc = zzum.zzc();
        zzulVarZzc.zzc(zzuvVar);
        zzulVarZzc.zza(zzugVar);
        zzulVarZzc.zzb(zzudVar);
        zzuiVarZza.zza((zzum) zzulVarZzc.zzi());
        zzuj zzujVar = (zzuj) zzuiVarZza.zzi();
        zzwm zzwmVarZza = zzwn.zza();
        new zzjl();
        zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zzwmVarZza.zza(zzxoVar);
        zzwmVarZza.zzc(zzujVar.zzo());
        return (zzwn) zzwmVarZza.zzi();
    }
}
