.class Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$5;
.super Ljava/lang/Object;
.source "GpTouchActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->showExitDialog()V
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

    .line 703
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$5;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 705
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->destroyApp()V

    return-void
.end method
