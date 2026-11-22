.class Lcom/mrgames/larvaheroesfree/Natives$10;
.super Ljava/lang/Object;
.source "Natives.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/Natives;->OnSetFullAdView(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1561
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1567
    invoke-static {}, Lcom/mrgames/larvaheroesfree/Natives;->access$200()Lcom/mrgames/larvaheroesfree/Natives;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/Natives;->showInterstitial()V

    return-void
.end method
