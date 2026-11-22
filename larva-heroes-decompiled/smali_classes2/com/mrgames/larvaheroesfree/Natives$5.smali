.class Lcom/mrgames/larvaheroesfree/Natives$5;
.super Ljava/lang/Object;
.source "Natives.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/Natives;->OnSetAbMob(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1399
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1402
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->isShowAdMob()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1408
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->adview:Lcom/google/android/gms/ads/AdView;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/AdView;->setEnabled(Z)V

    .line 1409
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->adview:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    goto :goto_0

    .line 1413
    :cond_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->adview:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setEnabled(Z)V

    .line 1414
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->adview:Lcom/google/android/gms/ads/AdView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    :goto_0
    return-void
.end method
