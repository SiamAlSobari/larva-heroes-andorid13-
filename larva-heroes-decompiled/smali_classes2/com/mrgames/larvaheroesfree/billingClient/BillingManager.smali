.class public Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;
.super Ljava/lang/Object;
.source "BillingManager.java"

# interfaces
.implements Lcom/android/billingclient/api/PurchasesUpdatedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;
    }
.end annotation


# static fields
.field public static final BILLING_MANAGER_NOT_INITIALIZED:I = -0x1

.field private static final TAG:Ljava/lang/String; = "BillingManager"


# instance fields
.field bConsumeCheck:Z

.field public connectStatus:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

.field consumeParams:Lcom/android/billingclient/api/BillingFlowParams;

.field private mActivity:Landroid/app/Activity;

.field private mBillingClient:Lcom/android/billingclient/api/BillingClient;

.field private mConsumeResListnere:Lcom/android/billingclient/api/ConsumeResponseListener;

.field private skuID_1:Ljava/lang/String;

.field private skuID_1_Details:Lcom/android/billingclient/api/SkuDetails;

.field private skuID_2:Ljava/lang/String;

.field private skuID_2_Details:Lcom/android/billingclient/api/SkuDetails;

.field private skuID_3:Ljava/lang/String;

.field private skuID_3_Details:Lcom/android/billingclient/api/SkuDetails;

.field private skuID_4:Ljava/lang/String;

.field private skuID_4_Details:Lcom/android/billingclient/api/SkuDetails;

.field private skuID_5:Ljava/lang/String;

.field private skuID_5_Details:Lcom/android/billingclient/api/SkuDetails;

.field private skuID_6:Ljava/lang/String;

.field private skuID_6_Details:Lcom/android/billingclient/api/SkuDetails;

.field private skuID_7:Ljava/lang/String;

.field private skuID_7_Details:Lcom/android/billingclient/api/SkuDetails;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    sget-object v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->waiting:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->connectStatus:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->bConsumeCheck:Z

    const-string v0, "larvadef_f_1000"

    .line 63
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_1:Ljava/lang/String;

    const-string v0, "larvadef_f_3000"

    .line 64
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_2:Ljava/lang/String;

    const-string v0, "larvadef_f_10000"

    .line 65
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_3:Ljava/lang/String;

    const-string v0, "larvadef_f_30000"

    .line 66
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_4:Ljava/lang/String;

    const-string v0, "larvadef_p_3000"

    .line 67
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_5:Ljava/lang/String;

    const-string v0, "larvadef_ticket_1000"

    .line 68
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_6:Ljava/lang/String;

    const-string v0, "larvadef_s_1100"

    .line 69
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_7:Ljava/lang/String;

    .line 77
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->mActivity:Landroid/app/Activity;

    const-string p1, "BillingManager"

    const-string v0, "Billing Init()"

    .line 78
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->mActivity:Landroid/app/Activity;

    invoke-static {p1}, Lcom/android/billingclient/api/BillingClient;->newBuilder(Landroid/content/Context;)Lcom/android/billingclient/api/BillingClient$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingClient$Builder;->enablePendingPurchases()Lcom/android/billingclient/api/BillingClient$Builder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/android/billingclient/api/BillingClient$Builder;->setListener(Lcom/android/billingclient/api/PurchasesUpdatedListener;)Lcom/android/billingclient/api/BillingClient$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingClient$Builder;->build()Lcom/android/billingclient/api/BillingClient;

    move-result-object p1

    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    .line 82
    new-instance v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;

    invoke-direct {v0, p0}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$1;-><init>(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)V

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/BillingClient;->startConnection(Lcom/android/billingclient/api/BillingClientStateListener;)V

    .line 110
    new-instance p1, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$2;

    invoke-direct {p1, p0}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$2;-><init>(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)V

    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->mConsumeResListnere:Lcom/android/billingclient/api/ConsumeResponseListener;

    return-void
.end method

.method static synthetic access$000(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Landroid/app/Activity;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->mActivity:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic access$100(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Lcom/android/billingclient/api/BillingClient;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_5:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1102(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_5_Details:Lcom/android/billingclient/api/SkuDetails;

    return-object p1
.end method

.method static synthetic access$1200(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_6:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1302(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_6_Details:Lcom/android/billingclient/api/SkuDetails;

    return-object p1
.end method

.method static synthetic access$1400(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_7:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1502(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_7_Details:Lcom/android/billingclient/api/SkuDetails;

    return-object p1
.end method

.method static synthetic access$200(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$302(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_1_Details:Lcom/android/billingclient/api/SkuDetails;

    return-object p1
.end method

.method static synthetic access$400(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_2:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$502(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_2_Details:Lcom/android/billingclient/api/SkuDetails;

    return-object p1
.end method

.method static synthetic access$600(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_3:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$702(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_3_Details:Lcom/android/billingclient/api/SkuDetails;

    return-object p1
.end method

.method static synthetic access$800(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)Ljava/lang/String;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_4:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$902(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_4_Details:Lcom/android/billingclient/api/SkuDetails;

    return-object p1
.end method

.method private handlePurchase(Lcom/android/billingclient/api/Purchase;)V
    .locals 4

    .line 294
    invoke-static {}, Lcom/android/billingclient/api/ConsumeParams;->newBuilder()Lcom/android/billingclient/api/ConsumeParams$Builder;

    move-result-object v0

    .line 295
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->getPurchaseToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/ConsumeParams$Builder;->setPurchaseToken(Ljava/lang/String;)Lcom/android/billingclient/api/ConsumeParams$Builder;

    move-result-object v0

    .line 296
    invoke-virtual {v0}, Lcom/android/billingclient/api/ConsumeParams$Builder;->build()Lcom/android/billingclient/api/ConsumeParams;

    move-result-object v0

    .line 298
    new-instance v1, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$4;

    invoke-direct {v1, p0}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$4;-><init>(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)V

    .line 308
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->getOriginalJson()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetPurchaseCode(Ljava/lang/String;)V

    .line 309
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->getSignature()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetSignatureCode(Ljava/lang/String;)V

    .line 311
    new-instance p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;

    invoke-direct {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;-><init>()V

    const/16 v2, 0x400

    const/4 v3, 0x1

    .line 312
    invoke-virtual {p1, v2, v3}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->handlePurchaseState(II)V

    .line 314
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {p1, v0, v1}, Lcom/android/billingclient/api/BillingClient;->consumeAsync(Lcom/android/billingclient/api/ConsumeParams;Lcom/android/billingclient/api/ConsumeResponseListener;)V

    return-void
.end method


# virtual methods
.method public GetSkuDetailList(I)V
    .locals 2

    .line 134
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    .line 135
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_1:Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    .line 136
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_2:Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    if-ne p1, v1, :cond_2

    .line 137
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_3:Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/4 v1, 0x3

    if-ne p1, v1, :cond_3

    .line 138
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_4:Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    const/4 v1, 0x4

    if-ne p1, v1, :cond_4

    .line 139
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_5:Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    const/4 v1, 0x5

    if-ne p1, v1, :cond_5

    .line 140
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_6:Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    const/4 v1, 0x6

    if-ne p1, v1, :cond_6

    .line 141
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_7:Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    :cond_6
    :goto_0
    invoke-static {}, Lcom/android/billingclient/api/SkuDetailsParams;->newBuilder()Lcom/android/billingclient/api/SkuDetailsParams$Builder;

    move-result-object p1

    .line 144
    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/SkuDetailsParams$Builder;->setSkusList(Ljava/util/List;)Lcom/android/billingclient/api/SkuDetailsParams$Builder;

    move-result-object v0

    const-string v1, "inapp"

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/SkuDetailsParams$Builder;->setType(Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetailsParams$Builder;

    .line 146
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {p1}, Lcom/android/billingclient/api/SkuDetailsParams$Builder;->build()Lcom/android/billingclient/api/SkuDetailsParams;

    move-result-object p1

    new-instance v1, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;

    invoke-direct {v1, p0}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$3;-><init>(Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;)V

    invoke-virtual {v0, p1, v1}, Lcom/android/billingclient/api/BillingClient;->querySkuDetailsAsync(Lcom/android/billingclient/api/SkuDetailsParams;Lcom/android/billingclient/api/SkuDetailsResponseListener;)V

    return-void
.end method

.method public destroy()V
    .locals 1

    .line 320
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingClient;->isReady()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 321
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingClient;->endConnection()V

    const/4 v0, 0x0

    .line 322
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    :cond_0
    return-void
.end method

.method public onPurchasesUpdated(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/BillingResult;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    .line 263
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result v0

    const-string v1, "BillingManager"

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    .line 265
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/billingclient/api/Purchase;

    const-string v0, "Billing Success."

    .line 266
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 267
    invoke-direct {p0, p2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->handlePurchase(Lcom/android/billingclient/api/Purchase;)V

    goto :goto_0

    .line 269
    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p2

    const/4 v0, 0x1

    const/4 v2, -0x1

    const/16 v3, 0x403

    if-ne p2, v0, :cond_1

    const-string p1, "Billing Canceled."

    .line 270
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 271
    new-instance p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;

    invoke-direct {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;-><init>()V

    .line 272
    invoke-virtual {p1, v3, v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->handlePurchaseState(II)V

    goto :goto_1

    .line 274
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Billing Another Fail : "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 275
    new-instance p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;

    invoke-direct {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;-><init>()V

    .line 276
    invoke-virtual {p1, v3, v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->handlePurchaseState(II)V

    :cond_2
    :goto_1
    return-void
.end method

.method public requestPurchase(I)V
    .locals 3

    const/4 v0, 0x0

    .line 199
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->bConsumeCheck:Z

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 203
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_1_Details:Lcom/android/billingclient/api/SkuDetails;

    if-nez p1, :cond_0

    return-void

    .line 204
    :cond_0
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_1_Details:Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setSkuDetails(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams;

    move-result-object p1

    goto/16 :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    .line 208
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_2_Details:Lcom/android/billingclient/api/SkuDetails;

    if-nez p1, :cond_2

    return-void

    .line 209
    :cond_2
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_2_Details:Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setSkuDetails(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams;

    move-result-object p1

    goto/16 :goto_0

    :cond_3
    const/4 v0, 0x4

    if-ne p1, v0, :cond_5

    .line 213
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_3_Details:Lcom/android/billingclient/api/SkuDetails;

    if-nez p1, :cond_4

    return-void

    .line 214
    :cond_4
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_3_Details:Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setSkuDetails(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams;

    move-result-object p1

    goto :goto_0

    :cond_5
    const/4 v0, 0x5

    if-ne p1, v0, :cond_7

    .line 218
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_4_Details:Lcom/android/billingclient/api/SkuDetails;

    if-nez p1, :cond_6

    return-void

    .line 219
    :cond_6
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_4_Details:Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setSkuDetails(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams;

    move-result-object p1

    goto :goto_0

    :cond_7
    const/4 v0, 0x6

    if-ne p1, v0, :cond_9

    .line 223
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_5_Details:Lcom/android/billingclient/api/SkuDetails;

    if-nez p1, :cond_8

    return-void

    .line 224
    :cond_8
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_5_Details:Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setSkuDetails(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams;

    move-result-object p1

    goto :goto_0

    :cond_9
    const/4 v0, 0x7

    if-ne p1, v0, :cond_b

    .line 228
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_6_Details:Lcom/android/billingclient/api/SkuDetails;

    if-nez p1, :cond_a

    return-void

    .line 229
    :cond_a
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_6_Details:Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setSkuDetails(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams;

    move-result-object p1

    goto :goto_0

    :cond_b
    const/16 v0, 0x8

    if-ne p1, v0, :cond_d

    .line 233
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_7_Details:Lcom/android/billingclient/api/SkuDetails;

    if-nez p1, :cond_c

    return-void

    .line 234
    :cond_c
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->skuID_7_Details:Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setSkuDetails(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams;

    move-result-object p1

    goto :goto_0

    :cond_d
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_e

    return-void

    .line 240
    :cond_e
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->consumeParams:Lcom/android/billingclient/api/BillingFlowParams;

    .line 242
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->mBillingClient:Lcom/android/billingclient/api/BillingClient;

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/android/billingclient/api/BillingClient;->launchBillingFlow(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)Lcom/android/billingclient/api/BillingResult;

    move-result-object p1

    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "requestPurchase result :"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BillingManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "requestPurchase responseString :"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getDebugMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    return-void
.end method
