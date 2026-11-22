.class Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$3;
.super Landroid/os/Handler;
.source "GpTouchActivity.java"


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

    .line 687
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$3;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 690
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 692
    :cond_0
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$3;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->access$202(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;Z)Z

    :goto_0
    return-void
.end method
