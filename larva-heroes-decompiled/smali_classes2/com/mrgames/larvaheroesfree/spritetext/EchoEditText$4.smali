.class Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$4;
.super Ljava/lang/Object;
.source "EchoEditText.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->showInputKeyboard()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;


# direct methods
.method constructor <init>(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$4;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 178
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$4;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->access$002(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;I)I

    .line 179
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$4;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    iget-object v0, v0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->access$102(Landroid/view/View;)Landroid/view/View;

    .line 180
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$4;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->access$000(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setVisibility(I)V

    .line 181
    invoke-static {}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->access$200()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    invoke-static {}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->access$100()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 182
    sget-object v0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->mSingleton:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->requestFocus()Z

    return-void
.end method
