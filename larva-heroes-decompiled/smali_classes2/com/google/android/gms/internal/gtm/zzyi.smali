.class abstract Lcom/google/android/gms/internal/gtm/zzyi;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/gtm/zzyi;

.field private static final zzb:Lcom/google/android/gms/internal/gtm/zzyi;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzye;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/gtm/zzye;-><init>(Lcom/google/android/gms/internal/gtm/zzyd;)V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzyi;->zza:Lcom/google/android/gms/internal/gtm/zzyi;

    new-instance v0, Lcom/google/android/gms/internal/gtm/zzyg;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/gtm/zzyg;-><init>(Lcom/google/android/gms/internal/gtm/zzyf;)V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzyi;->zzb:Lcom/google/android/gms/internal/gtm/zzyi;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/gtm/zzyh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static zzd()Lcom/google/android/gms/internal/gtm/zzyi;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzyi;->zza:Lcom/google/android/gms/internal/gtm/zzyi;

    return-object v0
.end method

.method static zze()Lcom/google/android/gms/internal/gtm/zzyi;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzyi;->zzb:Lcom/google/android/gms/internal/gtm/zzyi;

    return-object v0
.end method


# virtual methods
.method abstract zza(Ljava/lang/Object;J)Ljava/util/List;
.end method

.method abstract zzb(Ljava/lang/Object;J)V
.end method

.method abstract zzc(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
