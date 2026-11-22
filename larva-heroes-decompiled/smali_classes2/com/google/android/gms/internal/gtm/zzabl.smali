.class final Lcom/google/android/gms/internal/gtm/zzabl;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzxn;


# static fields
.field static final zza:Lcom/google/android/gms/internal/gtm/zzxn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/gtm/zzabl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gtm/zzabl;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzabl;->zza:Lcom/google/android/gms/internal/gtm/zzxn;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(I)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/gtm/zzabm;->zzc(I)Lcom/google/android/gms/internal/gtm/zzabm;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
