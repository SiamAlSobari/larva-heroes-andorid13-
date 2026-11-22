.class final Lcom/google/android/gms/internal/firebase-auth-api/zzjk;
.super Lcom/google/android/gms/internal/firebase-auth-api/zznf;
.source "com.google.firebase:firebase-auth@@22.1.2"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjl;Ljava/lang/Class;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjk;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjl;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zznf;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzalp;)Lcom/google/android/gms/internal/firebase-auth-api/zzalp;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzuj;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzuj;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzum;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzum;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzuv;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzuv;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzux;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzlj;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzux;)I

    move-result v0

    .line 4
    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzym;->zzi(I)Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzym;->zzc(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    .line 6
    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPrivateKey;

    .line 7
    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v1

    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzus;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzur;

    move-result-object v2

    const/4 v3, 0x0

    .line 9
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzur;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzur;

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzuj;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzum;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzur;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzum;)Lcom/google/android/gms/internal/firebase-auth-api/zzur;

    .line 11
    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzajf;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzajf;

    .line 12
    array-length v4, p1

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzajf;->zzn([BII)Lcom/google/android/gms/internal/firebase-auth-api/zzajf;

    move-result-object p1

    .line 11
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzur;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzajf;)Lcom/google/android/gms/internal/firebase-auth-api/zzur;

    .line 13
    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    .line 14
    array-length v1, p1

    invoke-static {p1, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajf;->zzn([BII)Lcom/google/android/gms/internal/firebase-auth-api/zzajf;

    move-result-object p1

    .line 13
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzur;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzajf;)Lcom/google/android/gms/internal/firebase-auth-api/zzur;

    .line 15
    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->zzi()Lcom/google/android/gms/internal/firebase-auth-api/zzakk;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzus;

    .line 16
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzup;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzuo;

    move-result-object v1

    .line 17
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzuo;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzuo;

    .line 18
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzuo;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzus;)Lcom/google/android/gms/internal/firebase-auth-api/zzuo;

    .line 19
    invoke-interface {v0}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    .line 20
    array-length v0, p1

    invoke-static {p1, v3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajf;->zzn([BII)Lcom/google/android/gms/internal/firebase-auth-api/zzajf;

    move-result-object p1

    .line 19
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzuo;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzajf;)Lcom/google/android/gms/internal/firebase-auth-api/zzuo;

    .line 21
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->zzi()Lcom/google/android/gms/internal/firebase-auth-api/zzakk;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzup;

    return-object p1
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzajf;)Lcom/google/android/gms/internal/firebase-auth-api/zzalp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/firebase-auth-api/zzaks;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    move-result-object v0

    .line 2
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzuj;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzajf;Lcom/google/android/gms/internal/firebase-auth-api/zzajx;)Lcom/google/android/gms/internal/firebase-auth-api/zzuj;

    move-result-object p1

    return-object p1
.end method

.method public final zzc()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2
    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjq;)V

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    .line 3
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjs;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjt;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    .line 4
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzjt;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    .line 5
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzju;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjv;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    .line 6
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzjv;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzey;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    move-result-object v3

    const/16 v4, 0xc

    .line 7
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    const/16 v5, 0x10

    .line 8
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 9
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzew;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzew;

    .line 10
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzew;)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 11
    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzey;

    move-result-object v3

    .line 12
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzce;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v1

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM"

    .line 14
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjq;)V

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    .line 15
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjs;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjt;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    .line 16
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzjt;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    .line 17
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzju;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjv;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    .line 18
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzjv;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzey;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    move-result-object v3

    .line 19
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 20
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 21
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzew;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzew;

    .line 22
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzew;)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 23
    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzey;

    move-result-object v3

    .line 24
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzce;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    .line 25
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v1

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    .line 26
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjq;)V

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    .line 27
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjs;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjt;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    .line 28
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzjt;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    .line 29
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzju;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjv;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    .line 30
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzjv;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzey;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    move-result-object v3

    .line 31
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 32
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 33
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzew;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzew;

    .line 34
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzew;)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 35
    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzey;

    move-result-object v3

    .line 36
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzce;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    .line 37
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v1

    const-string v3, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM"

    .line 38
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjq;)V

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    .line 39
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjs;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjt;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    .line 40
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzjt;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    .line 41
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzju;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjv;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    .line 42
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzjv;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzey;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    move-result-object v3

    .line 43
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 44
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 45
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzew;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzew;

    .line 46
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzew;)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 47
    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzey;

    move-result-object v3

    .line 48
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzce;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    .line 49
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v1

    const-string v3, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    .line 50
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjq;)V

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    .line 51
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjs;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjt;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    .line 52
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzjt;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    .line 53
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzju;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjv;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    .line 54
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzjv;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzey;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    move-result-object v3

    .line 55
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 56
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 57
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzew;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzew;

    .line 58
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzew;)Lcom/google/android/gms/internal/firebase-auth-api/zzev;

    .line 59
    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzev;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzey;

    move-result-object v3

    .line 60
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzce;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    .line 61
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v1

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX"

    .line 62
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjq;)V

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    .line 63
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjs;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjt;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    .line 64
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzjt;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    .line 65
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzju;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjv;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    .line 66
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzjv;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdn;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    move-result-object v3

    .line 67
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    const/16 v4, 0x20

    .line 68
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 69
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 70
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzdk;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdk;

    .line 71
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzdk;)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzdl;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdl;

    .line 72
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzdl;)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 73
    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzdn;

    move-result-object v3

    .line 74
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzce;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    .line 75
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v1

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    .line 76
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjq;)V

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    .line 77
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjs;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjt;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    .line 78
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzjt;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    .line 79
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzju;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjv;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    .line 80
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzjv;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdn;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    move-result-object v3

    .line 81
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 82
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 83
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 84
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzdk;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdk;

    .line 85
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzdk;)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzdl;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdl;

    .line 86
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzdl;)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 87
    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzdn;

    move-result-object v3

    .line 88
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzce;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    .line 89
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v1

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    .line 90
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjq;)V

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    .line 91
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjs;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjt;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    .line 92
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzjt;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    .line 93
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzju;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjv;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    .line 94
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzjv;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdn;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    move-result-object v3

    .line 95
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 96
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 97
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 98
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzdk;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdk;

    .line 99
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzdk;)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzdl;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdl;

    .line 100
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzdl;)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 101
    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzdn;

    move-result-object v3

    .line 102
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzce;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    .line 103
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v1

    const-string v3, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    .line 104
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjq;)V

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzjs;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    .line 105
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjs;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzjt;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    .line 106
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzjt;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzju;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    .line 107
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzju;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzjv;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    .line 108
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzjv;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdn;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    move-result-object v2

    .line 109
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 110
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 111
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 112
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzdk;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdk;

    .line 113
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzdk;)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzdl;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdl;

    .line 114
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzdl;)Lcom/google/android/gms/internal/firebase-auth-api/zzdj;

    .line 115
    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzdn;

    move-result-object v2

    .line 116
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzce;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;

    .line 117
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v1

    const-string v2, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    .line 118
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzalp;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzuj;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzuj;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzum;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzlj;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzum;)V

    return-void
.end method
