.class Lcom/mrgames/larvaheroesfree/Natives$9;
.super Ljava/lang/Object;
.source "Natives.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/Natives;->OnSetFullAdMob(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1497
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    const/4 v0, 0x0

    .line 1500
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetFullAdState(I)V

    .line 1507
    invoke-static {}, Lcom/mrgames/larvaheroesfree/Natives;->access$200()Lcom/mrgames/larvaheroesfree/Natives;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/Natives;->loadAd_Interstitial()V

    return-void
.end method
