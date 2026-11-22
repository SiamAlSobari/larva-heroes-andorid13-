.class final Lcom/google/android/gms/internal/ads/zzcbw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.4.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:Z

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcbx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcbx;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbw;->zzb:Lcom/google/android/gms/internal/ads/zzcbx;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzcbw;->zza:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbw;->zzb:Lcom/google/android/gms/internal/ads/zzcbx;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzcbw;->zza:Z

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "isVisible"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "windowVisibilityChanged"

    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzcbx;->zzm(Lcom/google/android/gms/internal/ads/zzcbx;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method
