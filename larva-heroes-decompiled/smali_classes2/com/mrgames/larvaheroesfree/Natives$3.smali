.class Lcom/mrgames/larvaheroesfree/Natives$3;
.super Lcom/google/android/gms/ads/AdListener;
.source "Natives.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/Natives;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mrgames/larvaheroesfree/Natives;


# direct methods
.method constructor <init>(Lcom/mrgames/larvaheroesfree/Natives;)V
    .locals 0

    .line 405
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/Natives$3;->this$0:Lcom/mrgames/larvaheroesfree/Natives;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClosed()V
    .locals 0

    return-void
.end method

.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 1

    const-string p1, "ADMOB"

    const-string v0, "error"

    .line 413
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 414
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/Natives$3;->this$0:Lcom/mrgames/larvaheroesfree/Natives;

    iget-boolean p1, p1, Lcom/mrgames/larvaheroesfree/Natives;->adLoadingCheck3:Z

    if-nez p1, :cond_0

    .line 415
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/Natives$3;->this$0:Lcom/mrgames/larvaheroesfree/Natives;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/mrgames/larvaheroesfree/Natives;->adLoadingCheck3:Z

    const/4 p1, 0x3

    .line 416
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetBannerAdLevelViewState(I)V

    :cond_0
    return-void
.end method

.method public onAdLoaded()V
    .locals 2

    const-string v0, "LOG_TAG"

    const-string v1, "onAdLoaded_Level_View"

    .line 432
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 433
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetBannerAdLevelViewState(I)V

    .line 434
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/Natives$3;->this$0:Lcom/mrgames/larvaheroesfree/Natives;

    iput-boolean v0, v1, Lcom/mrgames/larvaheroesfree/Natives;->adLoadingCheck3:Z

    return-void
.end method

.method public onAdOpened()V
    .locals 0

    return-void
.end method
