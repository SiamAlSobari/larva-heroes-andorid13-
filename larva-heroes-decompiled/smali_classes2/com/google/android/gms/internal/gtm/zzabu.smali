.class public final Lcom/google/android/gms/internal/gtm/zzabu;
.super Lcom/google/android/gms/internal/gtm/zzxj;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzyv;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/gtm/zzabu;


# instance fields
.field private zzd:Lcom/google/android/gms/internal/gtm/zzxr;

.field private zze:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzabu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gtm/zzabu;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzabu;->zza:Lcom/google/android/gms/internal/gtm/zzabu;

    const-class v1, Lcom/google/android/gms/internal/gtm/zzabu;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzan(Ljava/lang/Class;Lcom/google/android/gms/internal/gtm/zzxj;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzxj;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/gtm/zzabu;->zze:B

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzabu;->zzah()Lcom/google/android/gms/internal/gtm/zzxr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzabu;->zzd:Lcom/google/android/gms/internal/gtm/zzxr;

    return-void
.end method

.method static synthetic zzc()Lcom/google/android/gms/internal/gtm/zzabu;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzabu;->zza:Lcom/google/android/gms/internal/gtm/zzabu;

    return-object v0
.end method

.method public static zze()Lcom/google/android/gms/internal/gtm/zzabu;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzabu;->zza:Lcom/google/android/gms/internal/gtm/zzabu;

    return-object v0
.end method


# virtual methods
.method protected final zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    const/4 p3, 0x0

    .line 2
    :cond_0
    iput-byte p3, p0, Lcom/google/android/gms/internal/gtm/zzabu;->zze:B

    return-object v2

    .line 1
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabu;->zza:Lcom/google/android/gms/internal/gtm/zzabu;

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzabr;

    .line 3
    invoke-direct {p1, v2}, Lcom/google/android/gms/internal/gtm/zzabr;-><init>(Lcom/google/android/gms/internal/gtm/zzabo;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzabu;

    .line 4
    invoke-direct {p1}, Lcom/google/android/gms/internal/gtm/zzabu;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    .line 2
    const-class p2, Lcom/google/android/gms/internal/gtm/zzabt;

    aput-object p2, p1, p3

    sget-object p2, Lcom/google/android/gms/internal/gtm/zzabu;->zza:Lcom/google/android/gms/internal/gtm/zzabu;

    const-string p3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/gtm/zzabu;->zzak(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lcom/google/android/gms/internal/gtm/zzabu;->zze:B

    .line 1
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
