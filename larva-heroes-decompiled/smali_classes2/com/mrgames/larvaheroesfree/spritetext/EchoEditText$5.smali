.class Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$5;
.super Ljava/lang/Object;
.source "EchoEditText.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->hideInputKeyboard()V
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

    .line 189
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$5;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 192
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$5;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->access$002(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;I)I

    .line 193
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$5;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->access$000(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setVisibility(I)V

    .line 194
    invoke-static {}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->access$200()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    invoke-static {}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->access$100()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 195
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$5;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->requestFocus()Z

    return-void
.end method
