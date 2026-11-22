.class Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Lcom/android/billingclient/api/SkuDetailsResponseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->GetSkuDetailList(I)V
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

    .line 146
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSkuDetailsResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/BillingResult;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;)V"
        }
    .end annotation

    .line 149
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    const-string v0, "BillingManager"

    if-eqz p1, :cond_0

    const-string p1, "Billing SkuList Get Fail."

    .line 151
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-nez p2, :cond_1

    const-string p1, "No Billing SkuList."

    .line 156
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 161
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/billingclient/api/SkuDetails;

    .line 163
    invoke-virtual {p2}, Lcom/android/billingclient/api/SkuDetails;->getSku()Ljava/lang/String;

    move-result-object v1

    .line 164
    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$200(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 165
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v1, p2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$302(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;

    const-string p2, "Get skuID_1_Details Success"

    .line 166
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 168
    :cond_3
    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$400(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 169
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v1, p2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$502(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;

    const-string p2, "Get skuID_2_Details Success"

    .line 170
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 172
    :cond_4
    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$600(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 173
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v1, p2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$702(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;

    const-string p2, "Get skuID_3_Details Success"

    .line 174
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 176
    :cond_5
    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$800(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 177
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v1, p2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$902(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;

    const-string p2, "Get skuID_4_Details Success"

    .line 178
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 180
    :cond_6
    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$1000(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 181
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v1, p2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$1102(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;

    const-string p2, "Get skuID_5_Details Success"

    .line 182
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 184
    :cond_7
    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$1200(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 185
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v1, p2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$1302(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;

    const-string p2, "Get skuID_6_Details Success"

    .line 186
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 188
    :cond_8
    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$1400(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 189
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-static {v1, p2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->access$1502(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;

    const-string p2, "Get skuID_7_Details Success"

    .line 190
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    :cond_9
    return-void
.end method
