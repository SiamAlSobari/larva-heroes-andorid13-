.class Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Lcom/android/billingclient/api/BillingClientStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;-><init>(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;


# direct methods
.method constructor <init>(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBillingServiceDisconnected()V
    .locals 2

    .line 105
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    sget-object v1, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->disconnected:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    iput-object v1, v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->connectStatus:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    const-string v0, "BillingManager"

    const-string v1, "Google Billing Server Disconnected"

    .line 106
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onBillingSetupFinished(Lcom/android/billingclient/api/BillingResult;)V
    .locals 3

    .line 85
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result v0

    const-string v1, "BillingManager"

    if-nez v0, :cond_0

    .line 86
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    sget-object v2, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->connected:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    iput-object v2, v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->connectStatus:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Google Billing Server Success : "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->GetSkuDetailList(I)V

    .line 89
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->GetSkuDetailList(I)V

    .line 90
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->GetSkuDetailList(I)V

    .line 91
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->GetSkuDetailList(I)V

    .line 92
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->GetSkuDetailList(I)V

    .line 93
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->GetSkuDetailList(I)V

    .line 94
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->GetSkuDetailList(I)V

    goto :goto_0

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    sget-object v2, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->fail:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    iput-object v2, v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->connectStatus:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Google Billing Server Fail : "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method
