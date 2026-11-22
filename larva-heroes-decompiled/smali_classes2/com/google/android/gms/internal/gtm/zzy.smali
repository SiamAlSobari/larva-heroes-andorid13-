.class public final Lcom/google/android/gms/internal/gtm/zzy;
.super Lcom/google/android/gms/internal/gtm/zzxj;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzyv;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/gtm/zzy;


# instance fields
.field private zzd:Lcom/google/android/gms/internal/gtm/zzxr;

.field private zze:Lcom/google/android/gms/internal/gtm/zzxr;

.field private zzf:Lcom/google/android/gms/internal/gtm/zzxr;

.field private zzg:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gtm/zzy;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzy;->zza:Lcom/google/android/gms/internal/gtm/zzy;

    const-class v1, Lcom/google/android/gms/internal/gtm/zzy;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzan(Ljava/lang/Class;Lcom/google/android/gms/internal/gtm/zzxj;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzxj;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/gtm/zzy;->zzg:B

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzy;->zzah()Lcom/google/android/gms/internal/gtm/zzxr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzy;->zzd:Lcom/google/android/gms/internal/gtm/zzxr;

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzy;->zzah()Lcom/google/android/gms/internal/gtm/zzxr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzy;->zze:Lcom/google/android/gms/internal/gtm/zzxr;

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzy;->zzah()Lcom/google/android/gms/internal/gtm/zzxr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzy;->zzf:Lcom/google/android/gms/internal/gtm/zzxr;

    return-void
.end method

.method static synthetic zza()Lcom/google/android/gms/internal/gtm/zzy;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzy;->zza:Lcom/google/android/gms/internal/gtm/zzy;

    return-object v0
.end method

.method public static zzc()Lcom/google/android/gms/internal/gtm/zzy;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzy;->zza:Lcom/google/android/gms/internal/gtm/zzy;

    return-object v0
.end method


# virtual methods
.method protected final zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq p1, v4, :cond_4

    if-eq p1, v3, :cond_3

    const/4 v3, 0x0

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    const/4 p3, 0x0

    .line 2
    :cond_0
    iput-byte p3, p0, Lcom/google/android/gms/internal/gtm/zzy;->zzg:B

    return-object v3

    .line 1
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzy;->zza:Lcom/google/android/gms/internal/gtm/zzy;

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzx;

    .line 3
    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/gtm/zzx;-><init>(Lcom/google/android/gms/internal/gtm/zzn;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzy;

    .line 4
    invoke-direct {p1}, Lcom/google/android/gms/internal/gtm/zzy;-><init>()V

    return-object p1

    :cond_4
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    .line 2
    const-class p2, Lcom/google/android/gms/internal/gtm/zzam;

    aput-object p2, p1, p3

    const-string p2, "zze"

    aput-object p2, p1, v4

    const-class p2, Lcom/google/android/gms/internal/gtm/zzam;

    aput-object p2, p1, v3

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-class p2, Lcom/google/android/gms/internal/gtm/zzw;

    aput-object p2, p1, v1

    sget-object p2, Lcom/google/android/gms/internal/gtm/zzy;->zza:Lcom/google/android/gms/internal/gtm/zzy;

    const-string p3, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0002\u0001\u041b\u0002\u041b\u0003\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/gtm/zzy;->zzak(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lcom/google/android/gms/internal/gtm/zzy;->zzg:B

    .line 1
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final zzd()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzy;->zzf:Lcom/google/android/gms/internal/gtm/zzxr;

    return-object v0
.end method

.method public final zze()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzy;->zze:Lcom/google/android/gms/internal/gtm/zzxr;

    return-object v0
.end method

.method public final zzf()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzy;->zzd:Lcom/google/android/gms/internal/gtm/zzxr;

    return-object v0
.end method
