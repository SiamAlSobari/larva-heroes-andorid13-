.class Lcom/mrgames/larvaheroesfree/Natives$13;
.super Ljava/lang/Object;
.source "Natives.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/Natives;->SetWebView(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 2053
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 2056
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetWebview()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2057
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->ShowNotice()V

    goto :goto_0

    .line 2059
    :cond_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->HideNotice()V

    :goto_0
    return-void
.end method
