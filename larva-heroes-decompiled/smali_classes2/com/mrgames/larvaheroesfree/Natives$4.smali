.class Lcom/mrgames/larvaheroesfree/Natives$4;
.super Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAdLoadCallback;
.source "Natives.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/Natives;->loadAd_Interstitial()V
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

    .line 511
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/Natives$4;->this$0:Lcom/mrgames/larvaheroesfree/Natives;

    invoke-direct {p0}, Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAdLoadCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 1

    const-string v0, "Natives"

    .line 569
    invoke-virtual {p1}, Lcom/google/android/gms/ads/LoadAdError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    .line 570
    sput-object p1, Lcom/mrgames/larvaheroesfree/Natives;->mgrInterstitialAd:Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

    const/4 p1, 0x0

    .line 571
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/Natives;->access$002(Z)Z

    const/4 p1, 0x2

    .line 574
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetFullAdState(I)V

    return-void
.end method

.method public onAdLoaded(Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;)V
    .locals 2

    .line 516
    sput-object p1, Lcom/mrgames/larvaheroesfree/Natives;->mgrInterstitialAd:Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

    const/4 p1, 0x0

    .line 517
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/Natives;->access$002(Z)Z

    const-string p1, "Natives"

    const-string v0, "onAdLoaded"

    .line 518
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    .line 519
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetFullAdState(I)V

    .line 524
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->mgrInterstitialAd:Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

    new-instance v1, Lcom/mrgames/larvaheroesfree/Natives$4$1;

    invoke-direct {v1, p0}, Lcom/mrgames/larvaheroesfree/Natives$4$1;-><init>(Lcom/mrgames/larvaheroesfree/Natives$4;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;->setFullScreenContentCallback(Lcom/google/android/gms/ads/FullScreenContentCallback;)V

    .line 559
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/Natives$4;->this$0:Lcom/mrgames/larvaheroesfree/Natives;

    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/Natives;->access$100(Lcom/mrgames/larvaheroesfree/Natives;)Z

    move-result v0

    if-ne v0, p1, :cond_0

    .line 561
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/Natives$4;->this$0:Lcom/mrgames/larvaheroesfree/Natives;

    invoke-virtual {p1}, Lcom/mrgames/larvaheroesfree/Natives;->showInterstitial()V

    :cond_0
    return-void
.end method

.method public bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 0

    .line 511
    check-cast p1, Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/Natives$4;->onAdLoaded(Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;)V

    return-void
.end method
