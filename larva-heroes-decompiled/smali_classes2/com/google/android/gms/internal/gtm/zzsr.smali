.class final Lcom/google/android/gms/internal/gtm/zzsr;
.super Lcom/google/android/gms/internal/gtm/zzsn;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/gtm/zzst;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gtm/zzst;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzst;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/gtm/zzsn;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzsr;->zza:Lcom/google/android/gms/internal/gtm/zzst;

    return-void
.end method


# virtual methods
.method protected final zza(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzsr;->zza:Lcom/google/android/gms/internal/gtm/zzst;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/gtm/zzst;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
