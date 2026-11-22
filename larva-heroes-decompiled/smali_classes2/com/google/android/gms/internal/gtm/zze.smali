.class public final Lcom/google/android/gms/internal/gtm/zze;
.super Lcom/google/android/gms/internal/gtm/zzxj;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzyv;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/gtm/zzxh;

.field private static final zzd:Lcom/google/android/gms/internal/gtm/zze;


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/gtm/zzm;

.field private zzg:Lcom/google/android/gms/internal/gtm/zzg;

.field private zzh:B


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v2, Lcom/google/android/gms/internal/gtm/zze;

    invoke-direct {v2}, Lcom/google/android/gms/internal/gtm/zze;-><init>()V

    sput-object v2, Lcom/google/android/gms/internal/gtm/zze;->zzd:Lcom/google/android/gms/internal/gtm/zze;

    const-class v0, Lcom/google/android/gms/internal/gtm/zze;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/gtm/zzxj;->zzan(Ljava/lang/Class;Lcom/google/android/gms/internal/gtm/zzxj;)V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzam;->zzj()Lcom/google/android/gms/internal/gtm/zzam;

    move-result-object v0

    const/4 v3, 0x0

    const v4, 0x2d4c0bd

    .line 3
    sget-object v5, Lcom/google/android/gms/internal/gtm/zzaao;->zzk:Lcom/google/android/gms/internal/gtm/zzaao;

    const-class v6, Lcom/google/android/gms/internal/gtm/zze;

    move-object v1, v2

    .line 4
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/gtm/zzxj;->zzab(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/Object;Lcom/google/android/gms/internal/gtm/zzyu;Lcom/google/android/gms/internal/gtm/zzxm;ILcom/google/android/gms/internal/gtm/zzaao;Ljava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzxh;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/gtm/zze;->zza:Lcom/google/android/gms/internal/gtm/zzxh;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzxj;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/gtm/zze;->zzh:B

    return-void
.end method

.method static synthetic zza()Lcom/google/android/gms/internal/gtm/zze;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zze;->zzd:Lcom/google/android/gms/internal/gtm/zze;

    return-object v0
.end method


# virtual methods
.method protected final zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

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
    iput-byte p3, p0, Lcom/google/android/gms/internal/gtm/zze;->zzh:B

    return-object v2

    .line 1
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/gtm/zze;->zzd:Lcom/google/android/gms/internal/gtm/zze;

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzd;

    .line 3
    invoke-direct {p1, v2}, Lcom/google/android/gms/internal/gtm/zzd;-><init>(Lcom/google/android/gms/internal/gtm/zzc;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/gtm/zze;

    invoke-direct {p1}, Lcom/google/android/gms/internal/gtm/zze;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zze"

    aput-object p2, p1, v0

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const-string p2, "zzg"

    aput-object p2, p1, v2

    .line 2
    sget-object p2, Lcom/google/android/gms/internal/gtm/zze;->zzd:Lcom/google/android/gms/internal/gtm/zze;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/gtm/zze;->zzak(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lcom/google/android/gms/internal/gtm/zze;->zzh:B

    .line 1
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
