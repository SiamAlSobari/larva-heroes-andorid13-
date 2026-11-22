.class Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$2;
.super Ljava/lang/Object;
.source "EchoEditText.java"

# interfaces
.implements Landroid/text/InputFilter;


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

    .line 87
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText$2;->this$0:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 0

    const-string p2, "^[a-zA-Z0-9\u3131-\u314e\uac00-\ud7a3\u314f-\u318c]+$"

    .line 89
    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    .line 90
    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
