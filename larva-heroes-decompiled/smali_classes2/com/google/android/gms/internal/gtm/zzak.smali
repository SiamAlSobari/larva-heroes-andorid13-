.class public final Lcom/google/android/gms/internal/gtm/zzak;
.super Lcom/google/android/gms/internal/gtm/zzxj;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzyv;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/gtm/zzak;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/gtm/zzxr;

.field private zzf:Lcom/google/android/gms/internal/gtm/zzac;

.field private zzg:Ljava/lang/String;

.field private zzh:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzak;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gtm/zzak;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzak;->zza:Lcom/google/android/gms/internal/gtm/zzak;

    const-class v1, Lcom/google/android/gms/internal/gtm/zzak;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzan(Ljava/lang/Class;Lcom/google/android/gms/internal/gtm/zzxj;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzxj;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/gtm/zzak;->zzh:B

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzak;->zzah()Lcom/google/android/gms/internal/gtm/zzxr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzak;->zze:Lcom/google/android/gms/internal/gtm/zzxr;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzak;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static zzd()Lcom/google/android/gms/internal/gtm/zzaj;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/gtm/zzak;->zza:Lcom/google/android/gms/internal/gtm/zzak;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzY()Lcom/google/android/gms/internal/gtm/zzxd;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gtm/zzaj;

    return-object v0
.end method

.method static synthetic zze()Lcom/google/android/gms/internal/gtm/zzak;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzak;->zza:Lcom/google/android/gms/internal/gtm/zzak;

    return-object v0
.end method

.method public static zzf()Lcom/google/android/gms/internal/gtm/zzak;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzak;->zza:Lcom/google/android/gms/internal/gtm/zzak;

    return-object v0
.end method

.method public static zzg([BLcom/google/android/gms/internal/gtm/zzwt;)Lcom/google/android/gms/internal/gtm/zzak;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/gtm/zzxu;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/gtm/zzak;->zza:Lcom/google/android/gms/internal/gtm/zzak;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzaf(Lcom/google/android/gms/internal/gtm/zzxj;[BLcom/google/android/gms/internal/gtm/zzwt;)Lcom/google/android/gms/internal/gtm/zzxj;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/gtm/zzak;

    return-object p0
.end method

.method static synthetic zzj(Lcom/google/android/gms/internal/gtm/zzak;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzak;->zzah()Lcom/google/android/gms/internal/gtm/zzxr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzak;->zze:Lcom/google/android/gms/internal/gtm/zzxr;

    return-void
.end method

.method static synthetic zzk(Lcom/google/android/gms/internal/gtm/zzak;Lcom/google/android/gms/internal/gtm/zzac;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzak;->zzf:Lcom/google/android/gms/internal/gtm/zzac;

    iget p1, p0, Lcom/google/android/gms/internal/gtm/zzak;->zzd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/gtm/zzak;->zzd:I

    return-void
.end method

.method static synthetic zzl(Lcom/google/android/gms/internal/gtm/zzak;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzak;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/gtm/zzak;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzak;->zzg:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzak;->zze:Lcom/google/android/gms/internal/gtm/zzxr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/gtm/zzxr;->size()I

    move-result v0

    return v0
.end method

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
    iput-byte p3, p0, Lcom/google/android/gms/internal/gtm/zzak;->zzh:B

    return-object v3

    .line 1
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzak;->zza:Lcom/google/android/gms/internal/gtm/zzak;

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzaj;

    .line 3
    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/gtm/zzaj;-><init>(Lcom/google/android/gms/internal/gtm/zzn;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzak;

    .line 4
    invoke-direct {p1}, Lcom/google/android/gms/internal/gtm/zzak;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    const-string p2, "zze"

    aput-object p2, p1, p3

    .line 2
    const-class p2, Lcom/google/android/gms/internal/gtm/zzai;

    aput-object p2, p1, v4

    const-string p2, "zzf"

    aput-object p2, p1, v3

    const-string p2, "zzg"

    aput-object p2, p1, v2

    sget-object p2, Lcom/google/android/gms/internal/gtm/zzak;->zza:Lcom/google/android/gms/internal/gtm/zzak;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000\u0003\u1008\u0001"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/gtm/zzak;->zzak(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lcom/google/android/gms/internal/gtm/zzak;->zzh:B

    .line 1
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final zzc()Lcom/google/android/gms/internal/gtm/zzac;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzak;->zzf:Lcom/google/android/gms/internal/gtm/zzac;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzac;->zzk()Lcom/google/android/gms/internal/gtm/zzac;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final zzh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzak;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final zzi()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzak;->zze:Lcom/google/android/gms/internal/gtm/zzxr;

    return-object v0
.end method

.method public final zzm()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzak;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
