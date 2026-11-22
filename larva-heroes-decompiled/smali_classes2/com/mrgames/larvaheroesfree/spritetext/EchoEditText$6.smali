.class Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$6;
.super Ljava/lang/Object;
.source "EchoEditText.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


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

    .line 221
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$6;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x6

    const/4 p3, 0x0

    if-ne p2, p1, :cond_0

    .line 226
    invoke-static {p3, p3}, Lcom/mrgames/larvaheroesfree/Natives;->nativeTextEnter(II)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return p3
.end method
