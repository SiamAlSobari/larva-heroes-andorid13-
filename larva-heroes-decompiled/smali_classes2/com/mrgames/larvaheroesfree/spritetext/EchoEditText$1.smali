.class Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$1;
.super Ljava/lang/Object;
.source "EchoEditText.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setText([B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

.field final synthetic val$text:[B


# direct methods
.method constructor <init>(Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 72
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$1;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    iput-object p2, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$1;->val$text:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 76
    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$1;->val$text:[B

    const-string v2, "KSC5601"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 77
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    .line 78
    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$1;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-virtual {v2, v0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setText(Ljava/lang/CharSequence;)V

    .line 79
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$1;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setSelection(I)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 81
    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    :goto_0
    return-void
.end method
