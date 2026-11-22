.class public final enum Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;
.super Ljava/lang/Enum;
.source "BillingManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "connectStatusTypes"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

.field public static final enum connected:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

.field public static final enum disconnected:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

.field public static final enum fail:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

.field public static final enum waiting:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;


# direct methods
.method private static synthetic $values()[Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    const/4 v1, 0x0

    .line 57
    sget-object v2, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->waiting:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->connected:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->fail:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->disconnected:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 57
    new-instance v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    const-string v1, "waiting"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->waiting:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    new-instance v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    const-string v1, "connected"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->connected:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    new-instance v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    const-string v1, "fail"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->fail:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    new-instance v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    const-string v1, "disconnected"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->disconnected:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    invoke-static {}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->$values()[Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    move-result-object v0

    sput-object v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->$VALUES:[Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 57
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;
    .locals 1

    .line 57
    const-class v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    return-object p0
.end method

.method public static values()[Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;
    .locals 1

    .line 57
    sget-object v0, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->$VALUES:[Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    invoke-virtual {v0}, [Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mrgames/larvaheroesfree/billingClient/BillingManager$connectStatusTypes;

    return-object v0
.end method
