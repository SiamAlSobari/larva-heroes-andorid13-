.class Lcom/mrgames/larvaheroesfree/Natives$11;
.super Landroid/os/Handler;
.source "Natives.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mrgames/larvaheroesfree/Natives;
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

    .line 1908
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/Natives$11;->this$0:Lcom/mrgames/larvaheroesfree/Natives;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1911
    iget p1, p1, Landroid/os/Message;->what:I

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1916
    :cond_0
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->mRenderer:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;

    const/high16 v0, -0x3f000000    # -8.0f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0, v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->handleAtcionClear(IFF)V

    goto :goto_0

    .line 1913
    :cond_1
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/Natives$11;->this$0:Lcom/mrgames/larvaheroesfree/Natives;

    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/Natives;->access$300(Lcom/mrgames/larvaheroesfree/Natives;)V

    :goto_0
    return-void
.end method
