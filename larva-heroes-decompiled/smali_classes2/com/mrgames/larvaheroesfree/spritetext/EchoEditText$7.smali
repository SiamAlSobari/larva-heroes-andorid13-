.class Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$7;
.super Ljava/lang/Object;
.source "EchoEditText.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;
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

    .line 233
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$7;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 246
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 247
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/Natives;->getTextEdit(Ljava/lang/String;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
