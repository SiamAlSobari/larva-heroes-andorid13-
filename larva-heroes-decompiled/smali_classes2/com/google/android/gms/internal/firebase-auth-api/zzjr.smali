.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzjr;
.super Ljava/lang/Object;
.source "com.google.firebase:firebase-auth@@22.1.2"


# instance fields
.field private zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

.field private zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

.field private zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

.field private zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzce;

.field private zze:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

.field private zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzo;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzce;

    .line 2
    throw v0
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjq;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzce;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjv;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzo;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjs;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    return-object p0
.end method

.method public final zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzce;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzh()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzce;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid DEM parameters "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/firebase-auth-api/zzjt;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    return-object p0
.end method

.method public final zzd(Lcom/google/android/gms/internal/firebase-auth-api/zzju;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    return-object p0
.end method

.method public final zze(Lcom/google/android/gms/internal/firebase-auth-api/zzzo;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzzo;->zza()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzo;

    return-object p0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzo;

    return-object p0
.end method

.method public final zzf(Lcom/google/android/gms/internal/firebase-auth-api/zzjv;)Lcom/google/android/gms/internal/firebase-auth-api/zzjr;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    return-object p0
.end method

.method public final zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    if-eqz v1, :cond_6

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzce;

    if-eqz v1, :cond_5

    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    if-eqz v1, :cond_4

    .line 4
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjs;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    if-eq v0, v1, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    if-eqz v2, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Point format is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-ne v0, v1, :cond_3

    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    if-nez v0, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "For Curve25519 point format must not be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5
    :cond_3
    :goto_1
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjs;

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjt;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzju;

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzce;

    iget-object v7, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzjv;

    iget-object v8, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjr;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzzo;

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjs;Lcom/google/android/gms/internal/firebase-auth-api/zzjt;Lcom/google/android/gms/internal/firebase-auth-api/zzju;Lcom/google/android/gms/internal/firebase-auth-api/zzce;Lcom/google/android/gms/internal/firebase-auth-api/zzjv;Lcom/google/android/gms/internal/firebase-auth-api/zzzo;Lcom/google/android/gms/internal/firebase-auth-api/zzjw;)V

    return-object v0

    .line 4
    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "DEM parameters are not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2
    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1
    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Elliptic curve type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
