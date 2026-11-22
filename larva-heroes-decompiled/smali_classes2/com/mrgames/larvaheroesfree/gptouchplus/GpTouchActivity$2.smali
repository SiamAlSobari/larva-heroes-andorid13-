.class Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$2;
.super Ljava/lang/Object;
.source "GpTouchActivity.java"

# interfaces
.implements Lcom/unity3d/ads/IUnityAdsShowListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;


# direct methods
.method constructor <init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)V
    .locals 0

    .line 360
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$2;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onUnityAdsShowClick(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onUnityAdsShowComplete(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;)V
    .locals 3

    .line 385
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onUnityAdsShowComplete: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "UnityAdsExample"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 387
    sget-object p1, Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;->COMPLETED:Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;

    invoke-virtual {p2, p1}, Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 p2, 0x3

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 389
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetADMobRewardCloseState(I)V

    .line 390
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetADMobRewardState(I)V

    .line 391
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetUnityAdCloseState(I)V

    .line 392
    invoke-static {p2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetUnityAdState(I)V

    .line 393
    invoke-static {v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetADLoaded(Z)V

    .line 394
    invoke-static {v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetUnityADLoaded(Z)V

    goto :goto_0

    :cond_0
    const-string p1, "UnityAD skipped"

    const-string v2, "Video was skipped!"

    .line 403
    invoke-static {p1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 404
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetADMobRewardState(I)V

    .line 405
    invoke-static {p2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetUnityAdState(I)V

    .line 406
    invoke-static {v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetADLoaded(Z)V

    .line 407
    invoke-static {v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetUnityADLoaded(Z)V

    .line 408
    invoke-static {v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetUnityAdCloseState(I)V

    .line 409
    invoke-static {v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetADMobRewardCloseState(I)V

    :goto_0
    return-void
.end method

.method public onUnityAdsShowFailure(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsShowError;Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x2

    .line 366
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetUnityAdState(I)V

    return-void
.end method

.method public onUnityAdsShowStart(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
