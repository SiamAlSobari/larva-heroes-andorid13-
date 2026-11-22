package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcw {
    public static final zzwn zza = zzc(16);
    public static final zzwn zzb = zzc(32);
    public static final zzwn zzc = zzb(16, 16);
    public static final zzwn zzd = zzb(32, 16);
    public static final zzwn zze = zza(16, 16, 32, 16, zzvc.SHA256);
    public static final zzwn zzf = zza(32, 16, 32, 32, zzvc.SHA256);
    public static final zzwn zzg;
    public static final zzwn zzh;

    static {
        zzwm zzwmVarZza = zzwn.zza();
        new zzfy();
        zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzwmVarZza.zza(zzxo.TINK);
        zzg = (zzwn) zzwmVarZza.zzi();
        zzwm zzwmVarZza2 = zzwn.zza();
        new zzhp();
        zzwmVarZza2.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzwmVarZza2.zza(zzxo.TINK);
        zzh = (zzwn) zzwmVarZza2.zzi();
    }

    public static zzwn zza(int i, int i2, int i3, int i4, zzvc zzvcVar) {
        zzsq zzsqVarZzb = zzsr.zzb();
        zzst zzstVarZzb = zzsu.zzb();
        zzstVarZzb.zza(16);
        zzsqVarZzb.zzb((zzsu) zzstVarZzb.zzi());
        zzsqVarZzb.zza(i);
        zzsr zzsrVar = (zzsr) zzsqVarZzb.zzi();
        zzvh zzvhVarZzc = zzvi.zzc();
        zzvk zzvkVarZzc = zzvl.zzc();
        zzvkVarZzc.zza(zzvcVar);
        zzvkVarZzc.zzb(i4);
        zzvhVarZzc.zzb((zzvl) zzvkVarZzc.zzi());
        zzvhVarZzc.zza(32);
        zzvi zzviVar = (zzvi) zzvhVarZzc.zzi();
        zzsk zzskVarZza = zzsl.zza();
        zzskVarZza.zza(zzsrVar);
        zzskVarZza.zzb(zzviVar);
        zzsl zzslVar = (zzsl) zzskVarZza.zzi();
        zzwm zzwmVarZza = zzwn.zza();
        zzwmVarZza.zzc(zzslVar.zzo());
        new zzdh();
        zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzwmVarZza.zza(zzxo.TINK);
        return (zzwn) zzwmVarZza.zzi();
    }

    public static zzwn zzb(int i, int i2) {
        zzsz zzszVarZzb = zzta.zzb();
        zzszVarZzb.zza(i);
        zztc zztcVarZzb = zztd.zzb();
        zztcVarZzb.zza(16);
        zzszVarZzb.zzb((zztd) zztcVarZzb.zzi());
        zzta zztaVar = (zzta) zzszVarZzb.zzi();
        zzwm zzwmVarZza = zzwn.zza();
        zzwmVarZza.zzc(zztaVar.zzo());
        new zzec();
        zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzwmVarZza.zza(zzxo.TINK);
        return (zzwn) zzwmVarZza.zzi();
    }

    public static zzwn zzc(int i) {
        zzti zztiVarZzc = zztj.zzc();
        zztiVarZzc.zza(i);
        zztj zztjVar = (zztj) zztiVarZzc.zzi();
        zzwm zzwmVarZza = zzwn.zza();
        zzwmVarZza.zzc(zztjVar.zzo());
        new zzet();
        zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzwmVarZza.zza(zzxo.TINK);
        return (zzwn) zzwmVarZza.zzi();
    }
}
