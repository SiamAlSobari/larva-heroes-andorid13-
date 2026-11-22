.class Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$4;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Lcom/android/billingclient/api/ConsumeResponseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->handlePurchase(Lcom/android/billingclient/api/Purchase;)V
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

    .line 298
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$4;->this$0:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConsumeResponse(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V
    .locals 0

    .line 301
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    return-void
.end method
