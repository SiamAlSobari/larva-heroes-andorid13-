.class Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$2;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Lcom/android/billingclient/api/ConsumeResponseListener;


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

    .line 110
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$2;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConsumeResponse(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V
    .locals 1

    .line 113
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    const-string p2, "BillingManager"

    if-nez p1, :cond_1

    const-string p1, "Google Billing Consume Success."

    .line 115
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$2;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    iget-boolean p1, p1, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->bConsumeCheck:Z

    if-eqz p1, :cond_0

    .line 118
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$2;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    const/4 p2, 0x0

    iput-boolean p2, p1, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->bConsumeCheck:Z

    .line 119
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$2;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$100(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Lcom/android/billingclient/api/BillingClient;

    move-result-object p1

    iget-object p2, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$2;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {p2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$000(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Landroid/app/Activity;

    move-result-object p2

    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$2;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    iget-object v0, v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->consumeParams:Lcom/android/billingclient/api/BillingFlowParams;

    invoke-virtual {p1, p2, v0}, Lcom/android/billingclient/api/BillingClient;->launchBillingFlow(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)Lcom/android/billingclient/api/BillingResult;

    :cond_0
    return-void

    :cond_1
    const-string p1, "Google Billing Consume Fail."

    .line 125
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
