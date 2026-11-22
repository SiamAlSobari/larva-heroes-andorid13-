.class Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$1;
.super Ljava/lang/Object;
.source "GpTouchNetwork.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->SendPurchaseData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1207
    :try_start_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    sget-object v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->appContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getSendPhoneNumber(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 1211
    sget-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getPackageName()Ljava/lang/String;

    const-string v1, ""

    if-ne v0, v1, :cond_0

    return-void

    .line 1215
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    const/4 v2, 0x0

    .line 1216
    aget-byte v3, v1, v2

    add-int/lit8 v3, v3, 0x21

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    const/4 v2, 0x1

    .line 1217
    aget-byte v3, v1, v2

    add-int/lit8 v3, v3, 0x2f

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    const/4 v2, 0x2

    .line 1218
    aget-byte v3, v1, v2

    add-int/lit8 v3, v3, 0xf

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    const/4 v2, 0x3

    .line 1219
    aget-byte v3, v1, v2

    add-int/lit8 v3, v3, 0x11

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    const/4 v2, 0x4

    .line 1220
    aget-byte v3, v1, v2

    add-int/lit8 v3, v3, 0x13

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    const/4 v2, 0x5

    .line 1221
    aget-byte v3, v1, v2

    add-int/lit8 v3, v3, 0x15

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    const/4 v2, 0x6

    .line 1222
    aget-byte v3, v1, v2

    add-int/lit8 v3, v3, 0x17

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    const/4 v2, 0x7

    .line 1223
    aget-byte v3, v1, v2

    add-int/lit8 v3, v3, 0x19

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    const/16 v2, 0x8

    .line 1224
    aget-byte v3, v1, v2

    add-int/lit8 v3, v3, 0x1b

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    const/16 v2, 0x9

    .line 1225
    aget-byte v3, v1, v2

    add-int/lit8 v3, v3, 0x1d

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 1226
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0xa

    if-le v0, v2, :cond_1

    aget-byte v0, v1, v2

    add-int/lit8 v0, v0, 0x1f

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    .line 1227
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1267
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
