.class Lcom/mrgames/larvaheroesfree/Natives$1;
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

    .line 294
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/Natives$1;->this$0:Lcom/mrgames/larvaheroesfree/Natives;

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

    .line 302
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/Natives$1;->this$0:Lcom/mrgames/larvaheroesfree/Natives;

    iget-boolean p1, p1, Lcom/mrgames/larvaheroesfree/Natives;->adLoadingCheck1:Z

    if-nez p1, :cond_0

    .line 303
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/Natives$1;->this$0:Lcom/mrgames/larvaheroesfree/Natives;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/mrgames/larvaheroesfree/Natives;->adLoadingCheck1:Z

    const/4 p1, 0x3

    .line 304
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetBannerAdState(I)V

    :cond_0
    return-void
.end method

.method public onAdLoaded()V
    .locals 2

    const/4 v0, 0x1

    .line 321
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetBannerAdState(I)V

    .line 322
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/Natives$1;->this$0:Lcom/mrgames/larvaheroesfree/Natives;

    iput-boolean v0, v1, Lcom/mrgames/larvaheroesfree/Natives;->adLoadingCheck1:Z

    return-void
.end method

.method public onAdOpened()V
    .locals 0

    return-void
.end method
