.class Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;
.super Ljava/lang/Object;
.source "EchoEditText.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setMode(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

.field final synthetic val$mode:I


# direct methods
.method constructor <init>(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 134
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    iput p2, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;->val$mode:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 137
    iget v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;->val$mode:I

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    const/4 v2, 0x2

    if-eq v0, v1, :cond_4

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 164
    :cond_0
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-virtual {v0, v2}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setInputType(I)V

    goto :goto_0

    .line 160
    :cond_1
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setInputType(I)V

    goto :goto_0

    .line 155
    :cond_2
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setInputType(I)V

    .line 156
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    const-string v1, "defaultInputmode=korea"

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setPrivateImeOptions(Ljava/lang/String;)V

    goto :goto_0

    .line 150
    :cond_3
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setInputType(I)V

    .line 151
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    const-string v1, "defaultInputmode=symbol=true"

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setPrivateImeOptions(Ljava/lang/String;)V

    goto :goto_0

    .line 146
    :cond_4
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-virtual {v0, v2}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setInputType(I)V

    goto :goto_0

    .line 140
    :cond_5
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setInputType(I)V

    .line 142
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$3;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    const-string v1, "defaultInputmode=english"

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setPrivateImeOptions(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
