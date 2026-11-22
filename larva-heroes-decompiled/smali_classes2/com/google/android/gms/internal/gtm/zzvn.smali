.class public final Lcom/google/android/gms/internal/gtm/zzvn;
.super Lcom/google/android/gms/internal/gtm/zzxf;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzyv;


# static fields
.field private static final zzd:Lcom/google/android/gms/internal/gtm/zzxp;

.field private static final zze:Lcom/google/android/gms/internal/gtm/zzvn;


# instance fields
.field private zzf:I

.field private zzg:I

.field private zzh:Z

.field private zzi:I

.field private zzj:Z

.field private zzk:Z

.field private zzl:Z

.field private zzm:Z

.field private zzn:Lcom/google/android/gms/internal/gtm/zzxr;

.field private zzo:Z

.field private zzp:Z

.field private zzq:Z

.field private zzr:Z

.field private zzs:I

.field private zzt:Lcom/google/android/gms/internal/gtm/zzxo;

.field private zzu:Lcom/google/android/gms/internal/gtm/zzxr;

.field private zzv:Lcom/google/android/gms/internal/gtm/zzvm;

.field private zzw:Lcom/google/android/gms/internal/gtm/zzxr;

.field private zzx:I

.field private zzy:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzvn$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gtm/zzvn$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzvn;->zzd:Lcom/google/android/gms/internal/gtm/zzxp;

    new-instance v0, Lcom/google/android/gms/internal/gtm/zzvn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gtm/zzvn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzvn;->zze:Lcom/google/android/gms/internal/gtm/zzvn;

    const-class v1, Lcom/google/android/gms/internal/gtm/zzvn;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzan(Ljava/lang/Class;Lcom/google/android/gms/internal/gtm/zzxj;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzxf;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/gtm/zzvn;->zzy:B

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzze;->zze()Lcom/google/android/gms/internal/gtm/zzze;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzvn;->zzn:Lcom/google/android/gms/internal/gtm/zzxr;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzvn;->zzp:Z

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzxk;->zzf()Lcom/google/android/gms/internal/gtm/zzxk;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzvn;->zzt:Lcom/google/android/gms/internal/gtm/zzxo;

    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzze;->zze()Lcom/google/android/gms/internal/gtm/zzze;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzvn;->zzu:Lcom/google/android/gms/internal/gtm/zzxr;

    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzze;->zze()Lcom/google/android/gms/internal/gtm/zzze;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzvn;->zzw:Lcom/google/android/gms/internal/gtm/zzxr;

    return-void
.end method

.method static synthetic zzc()Lcom/google/android/gms/internal/gtm/zzvn;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzvn;->zze:Lcom/google/android/gms/internal/gtm/zzvn;

    return-object v0
.end method

.method public static zze()Lcom/google/android/gms/internal/gtm/zzvn;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzvn;->zze:Lcom/google/android/gms/internal/gtm/zzvn;

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
    iput-byte p3, p0, Lcom/google/android/gms/internal/gtm/zzvn;->zzy:B

    return-object v3

    .line 1
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzvn;->zze:Lcom/google/android/gms/internal/gtm/zzvn;

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzvo;

    .line 7
    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/gtm/zzvo;-><init>(Lcom/google/android/gms/internal/gtm/zzus;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzvn;

    .line 8
    invoke-direct {p1}, Lcom/google/android/gms/internal/gtm/zzvn;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x1b

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzf"

    aput-object p2, p1, v0

    const-string p2, "zzg"

    aput-object p2, p1, p3

    .line 2
    sget-object p2, Lcom/google/android/gms/internal/gtm/zzvq;->zza:Lcom/google/android/gms/internal/gtm/zzxn;

    aput-object p2, p1, v4

    const-string p2, "zzh"

    aput-object p2, p1, v3

    const-string p2, "zzl"

    aput-object p2, p1, v2

    const-string p2, "zzj"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    .line 3
    sget-object p3, Lcom/google/android/gms/internal/gtm/zzvv;->zza:Lcom/google/android/gms/internal/gtm/zzxn;

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-class p3, Lcom/google/android/gms/internal/gtm/zzwe;

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzq"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zzr"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zzs"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    .line 4
    sget-object p3, Lcom/google/android/gms/internal/gtm/zzvy;->zza:Lcom/google/android/gms/internal/gtm/zzxn;

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zzx"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    .line 5
    sget-object p3, Lcom/google/android/gms/internal/gtm/zzwb;->zza:Lcom/google/android/gms/internal/gtm/zzxn;

    aput-object p3, p1, p2

    const/16 p2, 0x14

    const-string p3, "zzt"

    aput-object p3, p1, p2

    const/16 p2, 0x15

    sget-object p3, Lcom/google/android/gms/internal/gtm/zzwb;->zza:Lcom/google/android/gms/internal/gtm/zzxn;

    aput-object p3, p1, p2

    const/16 p2, 0x16

    const-string p3, "zzu"

    aput-object p3, p1, p2

    const/16 p2, 0x17

    const-class p3, Lcom/google/android/gms/internal/gtm/zzvt;

    aput-object p3, p1, p2

    const/16 p2, 0x18

    const-string p3, "zzv"

    aput-object p3, p1, p2

    const/16 p2, 0x19

    const-string p3, "zzw"

    aput-object p3, p1, p2

    const/16 p2, 0x1a

    const-class p3, Lcom/google/android/gms/internal/gtm/zzwp;

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/gtm/zzvn;->zze:Lcom/google/android/gms/internal/gtm/zzvn;

    new-instance p3, Lcom/google/android/gms/internal/gtm/zzzf;

    const-string v0, "\u0001\u0012\u0000\u0001\u0001\u03e7\u0012\u0000\u0004\u0002\u0001\u180c\u0000\u0002\u1007\u0001\u0003\u1007\u0005\u0005\u1007\u0003\u0006\u180c\u0002\n\u1007\u0006\u000b\u001b\u000c\u1007\u0007\r\u1007\u0008\u000e\u1007\t\u000f\u1007\u0004\u0010\u1007\n\u0011\u180c\u000b\u0012\u180c\r\u0013\u081e\u0014\u001b\u0015\u1409\u000c\u03e7\u041b"

    .line 6
    invoke-direct {p3, p2, v0, p1}, Lcom/google/android/gms/internal/gtm/zzzf;-><init>(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p3

    :cond_5
    iget-byte p1, p0, Lcom/google/android/gms/internal/gtm/zzvn;->zzy:B

    .line 1
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
