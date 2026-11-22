.class public Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;
.super Ljava/lang/Object;
.source "GpTouchNetwork.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "cPurchaseItem"
.end annotation


# instance fields
.field itemName:Ljava/lang/String;

.field itemNameSeq:I

.field payCode:Ljava/lang/String;

.field final synthetic this$0:Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;


# direct methods
.method constructor <init>(Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;)V
    .locals 0

    .line 203
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;->this$0:Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 208
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;->this$0:Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    iput p2, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;->itemNameSeq:I

    .line 210
    iput-object p3, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;->payCode:Ljava/lang/String;

    .line 211
    iput-object p4, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;->itemName:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;->this$0:Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 205
    iput-object p2, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;->payCode:Ljava/lang/String;

    .line 206
    iput-object p3, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;->itemName:Ljava/lang/String;

    return-void
.end method
