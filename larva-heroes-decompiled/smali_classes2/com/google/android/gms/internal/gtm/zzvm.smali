.class public final Lcom/google/android/gms/internal/gtm/zzvm;
.super Lcom/google/android/gms/internal/gtm/zzxf;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzyv;


# static fields
.field private static final zzd:Lcom/google/android/gms/internal/gtm/zzvm;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:I

.field private zzh:I

.field private zzi:I

.field private zzj:I

.field private zzk:I

.field private zzl:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzvm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gtm/zzvm;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzvm;->zzd:Lcom/google/android/gms/internal/gtm/zzvm;

    const-class v1, Lcom/google/android/gms/internal/gtm/zzvm;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzan(Ljava/lang/Class;Lcom/google/android/gms/internal/gtm/zzxj;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzxf;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/gtm/zzvm;->zzl:B

    return-void
.end method

.method static synthetic zzc()Lcom/google/android/gms/internal/gtm/zzvm;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzvm;->zzd:Lcom/google/android/gms/internal/gtm/zzvm;

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
    iput-byte p3, p0, Lcom/google/android/gms/internal/gtm/zzvm;->zzl:B

    return-object v3

    .line 1
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzvm;->zzd:Lcom/google/android/gms/internal/gtm/zzvm;

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzut;

    .line 9
    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/gtm/zzut;-><init>(Lcom/google/android/gms/internal/gtm/zzus;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzvm;

    .line 10
    invoke-direct {p1}, Lcom/google/android/gms/internal/gtm/zzvm;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0xd

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zze"

    aput-object p2, p1, v0

    const-string p2, "zzf"

    aput-object p2, p1, p3

    .line 2
    sget-object p2, Lcom/google/android/gms/internal/gtm/zzuy;->zza:Lcom/google/android/gms/internal/gtm/zzxn;

    aput-object p2, p1, v4

    const-string p2, "zzg"

    aput-object p2, p1, v3

    .line 3
    sget-object p2, Lcom/google/android/gms/internal/gtm/zzuv;->zza:Lcom/google/android/gms/internal/gtm/zzxn;

    aput-object p2, p1, v2

    const-string p2, "zzh"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    .line 4
    sget-object p3, Lcom/google/android/gms/internal/gtm/zzvh;->zza:Lcom/google/android/gms/internal/gtm/zzxn;

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    .line 5
    sget-object p3, Lcom/google/android/gms/internal/gtm/zzvk;->zza:Lcom/google/android/gms/internal/gtm/zzxn;

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    .line 6
    sget-object p3, Lcom/google/android/gms/internal/gtm/zzve;->zza:Lcom/google/android/gms/internal/gtm/zzxn;

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    .line 7
    sget-object p3, Lcom/google/android/gms/internal/gtm/zzvb;->zza:Lcom/google/android/gms/internal/gtm/zzxn;

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/gtm/zzvm;->zzd:Lcom/google/android/gms/internal/gtm/zzvm;

    new-instance p3, Lcom/google/android/gms/internal/gtm/zzzf;

    const-string v0, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u180c\u0002\u0004\u180c\u0003\u0005\u180c\u0004\u0006\u180c\u0005"

    .line 8
    invoke-direct {p3, p2, v0, p1}, Lcom/google/android/gms/internal/gtm/zzzf;-><init>(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p3

    :cond_5
    iget-byte p1, p0, Lcom/google/android/gms/internal/gtm/zzvm;->zzl:B

    .line 1
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
