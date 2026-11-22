.class Lcom/mrgames/larvaheroesfree/Natives$4$1;
.super Lcom/google/android/gms/ads/FullScreenContentCallback;
.source "Natives.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/Natives$4;->onAdLoaded(Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/mrgames/larvaheroesfree/Natives$4;


# direct methods
.method constructor <init>(Lcom/mrgames/larvaheroesfree/Natives$4;)V
    .locals 0

    .line 525
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/Natives$4$1;->this$1:Lcom/mrgames/larvaheroesfree/Natives$4;

    invoke-direct {p0}, Lcom/google/android/gms/ads/FullScreenContentCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdDismissedFullScreenContent()V
    .locals 2

    const-string v0, "Natives"

    const-string v1, "The ad was dismissed."

    .line 529
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 532
    sput-object v0, Lcom/mrgames/larvaheroesfree/Natives;->mgrInterstitialAd:Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

    const/4 v0, 0x3

    .line 536
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetFullAdState(I)V

    return-void
.end method

.method public onAdFailedToShowFullScreenContent(Lcom/google/android/gms/ads/AdError;)V
    .locals 1

    const-string p1, "Natives"

    const-string v0, "The ad failed to show."

    .line 542
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    .line 545
    sput-object p1, Lcom/mrgames/larvaheroesfree/Natives;->mgrInterstitialAd:Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

    const/4 p1, 0x2

    .line 548
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetFullAdState(I)V

    return-void
.end method

.method public onAdShowedFullScreenContent()V
    .locals 2

    const-string v0, "Natives"

    const-string v1, "The ad was shown."

    .line 554
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
