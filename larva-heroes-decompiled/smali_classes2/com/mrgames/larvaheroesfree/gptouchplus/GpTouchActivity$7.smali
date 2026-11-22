.class Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$7;
.super Ljava/lang/Object;
.source "GpTouchActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->showDialogExitForUPlus(Ljava/lang/String;Ljava/lang/String;)V
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

    .line 739
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$7;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 742
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$7;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->finish()V

    return-void
.end method
