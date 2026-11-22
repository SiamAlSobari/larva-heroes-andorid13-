.class public final Lcom/google/android/gms/internal/gtm/zzwp;
.super Lcom/google/android/gms/internal/gtm/zzxj;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzyv;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/gtm/zzwp;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/gtm/zzxr;

.field private zzf:Ljava/lang/String;

.field private zzg:J

.field private zzh:J

.field private zzi:D

.field private zzj:Lcom/google/android/gms/internal/gtm/zzud;

.field private zzk:Ljava/lang/String;

.field private zzl:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzwp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gtm/zzwp;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzwp;->zza:Lcom/google/android/gms/internal/gtm/zzwp;

    const-class v1, Lcom/google/android/gms/internal/gtm/zzwp;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzan(Ljava/lang/Class;Lcom/google/android/gms/internal/gtm/zzxj;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzxj;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/gtm/zzwp;->zzl:B

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzze;->zze()Lcom/google/android/gms/internal/gtm/zzze;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzwp;->zze:Lcom/google/android/gms/internal/gtm/zzxr;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzwp;->zzf:Ljava/lang/String;

    .line 3
    sget-object v1, Lcom/google/android/gms/internal/gtm/zzud;->zzb:Lcom/google/android/gms/internal/gtm/zzud;

    iput-object v1, p0, Lcom/google/android/gms/internal/gtm/zzwp;->zzj:Lcom/google/android/gms/internal/gtm/zzud;

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzwp;->zzk:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzc()Lcom/google/android/gms/internal/gtm/zzwp;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzwp;->zza:Lcom/google/android/gms/internal/gtm/zzwp;

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
    iput-byte p3, p0, Lcom/google/android/gms/internal/gtm/zzwp;->zzl:B

    return-object v3

    .line 1
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzwp;->zza:Lcom/google/android/gms/internal/gtm/zzwp;

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzwm;

    .line 3
    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/gtm/zzwm;-><init>(Lcom/google/android/gms/internal/gtm/zzus;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzwp;

    .line 4
    invoke-direct {p1}, Lcom/google/android/gms/internal/gtm/zzwp;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x9

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    const-string p2, "zze"

    aput-object p2, p1, p3

    .line 2
    const-class p2, Lcom/google/android/gms/internal/gtm/zzwo;

    aput-object p2, p1, v4

    const-string p2, "zzf"

    aput-object p2, p1, v3

    const-string p2, "zzg"

    aput-object p2, p1, v2

    const-string p2, "zzh"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzk"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/gtm/zzwp;->zza:Lcom/google/android/gms/internal/gtm/zzwp;

    new-instance p3, Lcom/google/android/gms/internal/gtm/zzzf;

    const-string v0, "\u0001\u0007\u0000\u0001\u0002\u0008\u0007\u0000\u0001\u0001\u0002\u041b\u0003\u1008\u0000\u0004\u1003\u0001\u0005\u1002\u0002\u0006\u1000\u0003\u0007\u100a\u0004\u0008\u1008\u0005"

    invoke-direct {p3, p2, v0, p1}, Lcom/google/android/gms/internal/gtm/zzzf;-><init>(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p3

    :cond_5
    iget-byte p1, p0, Lcom/google/android/gms/internal/gtm/zzwp;->zzl:B

    .line 1
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
