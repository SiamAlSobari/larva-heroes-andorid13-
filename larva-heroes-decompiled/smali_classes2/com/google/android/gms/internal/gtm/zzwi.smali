.class public final enum Lcom/google/android/gms/internal/gtm/zzwi;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzxl;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/gtm/zzwi;

.field public static final enum zzb:Lcom/google/android/gms/internal/gtm/zzwi;

.field public static final enum zzc:Lcom/google/android/gms/internal/gtm/zzwi;

.field private static final zzd:Lcom/google/android/gms/internal/gtm/zzxm;

.field private static final synthetic zze:[Lcom/google/android/gms/internal/gtm/zzwi;


# instance fields
.field private final zzf:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzwi;

    const-string v1, "SPEED"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/gtm/zzwi;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzwi;->zza:Lcom/google/android/gms/internal/gtm/zzwi;

    new-instance v1, Lcom/google/android/gms/internal/gtm/zzwi;

    const-string v4, "CODE_SIZE"

    const/4 v5, 0x2

    .line 2
    invoke-direct {v1, v4, v3, v5}, Lcom/google/android/gms/internal/gtm/zzwi;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/gtm/zzwi;->zzb:Lcom/google/android/gms/internal/gtm/zzwi;

    new-instance v4, Lcom/google/android/gms/internal/gtm/zzwi;

    const-string v6, "LITE_RUNTIME"

    const/4 v7, 0x3

    .line 3
    invoke-direct {v4, v6, v5, v7}, Lcom/google/android/gms/internal/gtm/zzwi;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/gtm/zzwi;->zzc:Lcom/google/android/gms/internal/gtm/zzwi;

    new-array v6, v7, [Lcom/google/android/gms/internal/gtm/zzwi;

    aput-object v0, v6, v2

    aput-object v1, v6, v3

    aput-object v4, v6, v5

    sput-object v6, Lcom/google/android/gms/internal/gtm/zzwi;->zze:[Lcom/google/android/gms/internal/gtm/zzwi;

    new-instance v0, Lcom/google/android/gms/internal/gtm/zzwg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gtm/zzwg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzwi;->zzd:Lcom/google/android/gms/internal/gtm/zzxm;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/gtm/zzwi;->zzf:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/gtm/zzwi;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/gtm/zzwi;->zze:[Lcom/google/android/gms/internal/gtm/zzwi;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/gtm/zzwi;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/gtm/zzwi;

    return-object v0
.end method

.method public static zzb(I)Lcom/google/android/gms/internal/gtm/zzwi;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/gtm/zzwi;->zzc:Lcom/google/android/gms/internal/gtm/zzwi;

    return-object p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/gtm/zzwi;->zzb:Lcom/google/android/gms/internal/gtm/zzwi;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/gtm/zzwi;->zza:Lcom/google/android/gms/internal/gtm/zzwi;

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzwi;->zzf:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzwi;->zzf:I

    return v0
.end method
