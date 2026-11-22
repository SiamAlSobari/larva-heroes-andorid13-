.class Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$1;
.super Ljava/lang/Object;
.source "GameHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->onStart(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;


# direct methods
.method constructor <init>(Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;)V
    .locals 0

    .line 411
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$1;->this$0:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 414
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$1;->this$0:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->notifyListener(Z)V

    return-void
.end method
