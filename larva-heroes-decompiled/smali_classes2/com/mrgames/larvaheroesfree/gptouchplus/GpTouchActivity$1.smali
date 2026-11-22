.class Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$1;
.super Ljava/lang/Object;
.source "GpTouchActivity.java"

# interfaces
.implements Lcom/unity3d/ads/IUnityAdsLoadListener;


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

    .line 342
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$1;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onUnityAdsAdLoaded(Ljava/lang/String;)V
    .locals 3

    .line 347
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$1;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->access$000(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/unity3d/ads/UnityAdsShowOptions;

    invoke-direct {v1}, Lcom/unity3d/ads/UnityAdsShowOptions;-><init>()V

    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$1;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-static {v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->access$100(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)Lcom/unity3d/ads/IUnityAdsShowListener;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lcom/unity3d/ads/UnityAds;->show(Landroid/app/Activity;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/IUnityAdsShowListener;)V

    return-void
.end method

.method public onUnityAdsFailedToLoad(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;Ljava/lang/String;)V
    .locals 2

    .line 355
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unity Ads failed to load ad for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " with error: ["

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "] "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "UnityAdsExample"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x2

    .line 356
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetUnityAdState(I)V

    return-void
.end method
