.class public Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;
.super Ljava/lang/Object;
.source "GpTouchNetwork.java"

# interfaces
.implements Lcom/mrgames/larvaheroesfree/network/GpTouchConstants;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;
    }
.end annotation


# static fields
.field private static final INSERT_PAGE:Ljava/lang/String; = "http://115.68.42.98:5509/itembuy.asp"

.field private static PURCHASE_DEBUG:Z = true

.field static final RC_REQUEST:I = 0x2711

.field private static final SEND_PACKET_HEADER_SIZE:I = 0x0

.field protected static ServerIP:Ljava/lang/String; = "211.108.62.19"

.field protected static ServerPort:I = 0x3715

.field private static final TAG:Ljava/lang/String; = "MrgamesPurchase"

.field protected static appContext:Landroid/content/Context; = null

.field private static doRecvPacket:Z = false

.field private static doSendPacket:Z = false

.field protected static errorCounter:B = 0x0t

.field protected static inputStream:Ljava/io/DataInputStream; = null

.field private static isBigEndian:Z = false

.field private static isFullNetwork:Z = false

.field private static isRequestPurchase:Z = false

.field protected static isRunning:Z = false

.field private static isUseServerPayCode:Z = true

.field private static mAid:Ljava/lang/String; = ""

.field private static mBpinfo:Ljava/lang/String; = ""

.field private static mButton:Landroid/widget/Button; = null

.field private static mHandler:Landroid/os/Handler; = null

.field private static mPid:Ljava/lang/String; = ""

.field private static mPname:Ljava/lang/String; = ""

.field private static mProgressDialog:Landroid/app/ProgressDialog; = null

.field private static mRequestId:Ljava/lang/String; = null

.field private static mTid:Ljava/lang/String; = ""

.field protected static myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity; = null

.field protected static myAppId:Ljava/lang/String; = null

.field protected static myBPIp:Ljava/lang/String; = null

.field protected static myBPPort:I = 0x0

.field private static nResultCode:I = 0x63

.field protected static nextSyncTime:J = 0x0L

.field protected static outputStream:Ljava/io/DataOutputStream; = null

.field private static pItemBuySeq:I = 0x0

.field private static pItemName:Ljava/lang/String; = null

.field public static pItemPaycode:Ljava/lang/String; = null

.field private static pItemServerCode:Ljava/lang/String; = null

.field protected static recvCmd:S = 0x0s

.field protected static recvLength:I = 0x0

.field public static recvPacket:[B = null

.field private static recvPayCodeOffset:I = 0xa

.field public static recvlength:I = 0x0

.field private static self:Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork; = null

.field protected static sendCmd:S = 0x0s

.field protected static sendLength:S = 0x0s

.field private static sendPayCode:Ljava/lang/String; = null

.field private static sendPayCodeOffset:I = 0x4

.field protected static socketConnection:Ljava/net/Socket;

.field private static thread:Ljava/lang/Thread;


# instance fields
.field private purchaseItemQueue:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;",
            ">;"
        }
    .end annotation
.end field

.field private purchaseSequenceQueue:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field protected requestQueue:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "[B>;"
        }
    .end annotation
.end field

.field protected result:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 866
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    sput-object v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->mHandler:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 1273
    sput-object v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->self:Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 221
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->result:Ljava/util/Vector;

    .line 133
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->requestQueue:Ljava/util/Vector;

    .line 176
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->purchaseSequenceQueue:Ljava/util/Vector;

    .line 218
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->purchaseItemQueue:Ljava/util/Vector;

    .line 222
    sput-object p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->self:Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;

    .line 224
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    sput-object v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    .line 225
    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->appContext:Landroid/content/Context;

    .line 226
    sput-boolean p1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isFullNetwork:Z

    .line 227
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetAppId()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->myAppId:Ljava/lang/String;

    .line 228
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetBpIp()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->myBPIp:Ljava/lang/String;

    .line 229
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetBpPort()I

    move-result p1

    sput p1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->myBPPort:I

    return-void
.end method

.method public static GpTouchNetConnect()Z
    .locals 1

    .line 835
    invoke-static {}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->commonNetAvailable()Z

    move-result v0

    return v0
.end method

.method public static GpTouchNetworkConnect()Z
    .locals 1

    .line 840
    invoke-static {}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->GpTouchNetConnect()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    .line 843
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->setRunning(Z)V

    .line 847
    invoke-static {}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->openTCPConnection()Z

    move-result v0

    return v0
.end method

.method public static GpTouchNetworkDisconnect()Z
    .locals 1

    .line 852
    invoke-static {}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->closeTCPConnection()Z

    move-result v0

    return v0
.end method

.method public static GpTouchRequestPurchase(ILjava/lang/String;[B)V
    .locals 4

    .line 871
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "KSC5601"

    invoke-direct {v0, p2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 875
    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    const/4 v0, 0x0

    .line 877
    :goto_0
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "[GPTOUCHNetwork][GPTOUCHRequestPurchase] requestPurchase id:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " name:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 879
    invoke-static {p0, p1, v0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->requestPurchase(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static GpTouchServer(Ljava/lang/String;I)Z
    .locals 1

    const/4 v0, 0x0

    .line 698
    sput-byte v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->errorCounter:B

    .line 699
    sput v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->recvLength:I

    .line 701
    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->serverInfo(Ljava/lang/String;I)V

    .line 702
    invoke-static {}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->GpTouchNetworkConnect()Z

    move-result p0

    return p0
.end method

.method public static SendPurchaseData()V
    .locals 2

    .line 1203
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$1;

    invoke-direct {v1}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$1;-><init>()V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1270
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static final byte2int([BI)I
    .locals 2

    .line 1099
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isBigEndian:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1100
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    goto :goto_0

    :cond_0
    add-int/lit8 v0, p1, 0x3

    .line 1108
    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    aget-byte p0, p0, p1

    :goto_0
    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static final byte2short([BI)S
    .locals 2

    .line 1136
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isBigEndian:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1137
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    add-int/2addr p1, v1

    aget-byte p0, p0, p1

    goto :goto_0

    :cond_0
    add-int/lit8 v0, p1, 0x1

    .line 1140
    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    aget-byte p0, p0, p1

    :goto_0
    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    int-to-short p0, p0

    return p0
.end method

.method private checkInputPurchaseSequence([B)Z
    .locals 4

    .line 756
    sget-short v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->recvCmd:S

    invoke-direct {p0, v0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isPurchaseSequence(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x9

    .line 757
    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/16 v0, 0xa

    .line 762
    invoke-static {p1, v0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->byte2int([BI)I

    .line 763
    sget-boolean v2, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isUseServerPayCode:Z

    if-eqz v2, :cond_0

    .line 764
    new-instance v2, Ljava/lang/String;

    sget v3, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->recvPayCodeOffset:I

    invoke-direct {v2, p1, v3, v0}, Ljava/lang/String;-><init>([BII)V

    goto :goto_0

    .line 766
    :cond_0
    sget-object v2, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->sendPayCode:Ljava/lang/String;

    .line 767
    :goto_0
    invoke-direct {p0, v2}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->getPurchaseItemQueue(Ljava/lang/String;)Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 775
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "[GPTOUCHSemiNetwork][DEBUG] requestPurchase!!"

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private checkOutputPurchaseSequence([B)V
    .locals 3

    .line 744
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isUseServerPayCode:Z

    if-nez v0, :cond_0

    .line 745
    sget-short v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->sendCmd:S

    invoke-direct {p0, v0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isPurchaseSequence(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 746
    new-instance v0, Ljava/lang/String;

    sget v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->sendPayCodeOffset:I

    const/16 v2, 0xa

    invoke-direct {v0, p1, v1, v2}, Ljava/lang/String;-><init>([BII)V

    sput-object v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->sendPayCode:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static closeTCPConnection()Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 664
    :try_start_0
    sget-object v2, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->outputStream:Ljava/io/DataOutputStream;

    if-eqz v2, :cond_0

    .line 665
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V

    .line 666
    sput-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->outputStream:Ljava/io/DataOutputStream;

    .line 668
    :cond_0
    sget-object v2, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->inputStream:Ljava/io/DataInputStream;

    if-eqz v2, :cond_1

    .line 669
    invoke-virtual {v2}, Ljava/io/DataInputStream;->close()V

    .line 670
    sput-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->inputStream:Ljava/io/DataInputStream;

    .line 672
    :cond_1
    sget-object v2, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->socketConnection:Ljava/net/Socket;

    if-eqz v2, :cond_2

    .line 673
    invoke-virtual {v2}, Ljava/net/Socket;->close()V

    .line 674
    sput-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->socketConnection:Ljava/net/Socket;

    .line 676
    :cond_2
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v3, "[GPTOUCHNetwork][DEBUG] GPTOUCHDisconnection Success!!"

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-wide/16 v2, 0x1f4

    .line 677
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 686
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->setRunning(Z)V

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v2

    .line 680
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 681
    sput-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->outputStream:Ljava/io/DataOutputStream;

    .line 682
    sput-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->inputStream:Ljava/io/DataInputStream;

    .line 683
    sput-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->socketConnection:Ljava/net/Socket;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 686
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->setRunning(Z)V

    return v0

    :goto_0
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->setRunning(Z)V

    .line 687
    throw v1
.end method

.method private static commonNetAvailable()Z
    .locals 4

    .line 599
    sget-object v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->appContext:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    const/4 v1, 0x0

    .line 600
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v2

    const/4 v3, 0x1

    .line 601
    invoke-virtual {v0, v3}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    .line 605
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    return v3
.end method

.method public static getLittleInt16(I)[B
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [B

    shr-int/lit8 v1, p0, 0x0

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    shr-int/lit8 p0, p0, 0x8

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    const/4 v1, 0x1

    aput-byte p0, v0, v1

    return-object v0
.end method

.method public static getLittleInt32(I)[B
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [B

    shr-int/lit8 v1, p0, 0x0

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    shr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v2, 0x1

    aput-byte v1, v0, v2

    shr-int/lit8 v1, p0, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v2, 0x2

    aput-byte v1, v0, v2

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    const/4 v1, 0x3

    aput-byte p0, v0, v1

    return-object v0
.end method

.method public static getLittleInt64(J)[B
    .locals 7

    const/16 v0, 0x8

    new-array v1, v0, [B

    const/4 v2, 0x0

    shr-long v3, p0, v2

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    long-to-int v4, v3

    int-to-byte v3, v4

    aput-byte v3, v1, v2

    shr-long v2, p0, v0

    and-long/2addr v2, v5

    long-to-int v0, v2

    int-to-byte v0, v0

    const/4 v2, 0x1

    aput-byte v0, v1, v2

    const/16 v0, 0x10

    shr-long v2, p0, v0

    and-long/2addr v2, v5

    long-to-int v0, v2

    int-to-byte v0, v0

    const/4 v2, 0x2

    aput-byte v0, v1, v2

    const/16 v0, 0x18

    shr-long v2, p0, v0

    and-long/2addr v2, v5

    long-to-int v0, v2

    int-to-byte v0, v0

    const/4 v2, 0x3

    aput-byte v0, v1, v2

    const/16 v0, 0x20

    shr-long v2, p0, v0

    and-long/2addr v2, v5

    long-to-int v0, v2

    int-to-byte v0, v0

    const/4 v2, 0x4

    aput-byte v0, v1, v2

    const/16 v0, 0x28

    shr-long v2, p0, v0

    and-long/2addr v2, v5

    long-to-int v0, v2

    int-to-byte v0, v0

    const/4 v2, 0x5

    aput-byte v0, v1, v2

    const/16 v0, 0x30

    shr-long v2, p0, v0

    and-long/2addr v2, v5

    long-to-int v0, v2

    int-to-byte v0, v0

    const/4 v2, 0x6

    aput-byte v0, v1, v2

    const/16 v0, 0x38

    shr-long/2addr p0, v0

    and-long/2addr p0, v5

    long-to-int p1, p0

    int-to-byte p0, p1

    const/4 p1, 0x7

    aput-byte p0, v1, p1

    return-object v1
.end method

.method public static getLittleInt8(I)[B
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    int-to-byte p0, p0

    aput-byte p0, v0, v1

    return-object v0
.end method

.method private getPurchaseItemQueue(Ljava/lang/String;)Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;
    .locals 3

    .line 812
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->purchaseItemQueue:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 813
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->purchaseItemQueue:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 814
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;

    .line 815
    iget-object v2, v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;->payCode:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public static getRecvLength()I
    .locals 1

    .line 293
    sget v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->recvLength:I

    return v0
.end method

.method private static getTCPData([B)[B
    .locals 3

    const/4 v0, 0x0

    .line 517
    :try_start_0
    sget-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->outputStream:Ljava/io/DataOutputStream;

    if-nez v1, :cond_0

    .line 518
    new-instance v1, Ljava/io/DataOutputStream;

    sget-object v2, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->socketConnection:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    sput-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->outputStream:Ljava/io/DataOutputStream;

    .line 519
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "[GPTOUCHFullNetwork][DEBUG] outputStream Create!!!"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 522
    :cond_0
    sget-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->outputStream:Ljava/io/DataOutputStream;

    invoke-virtual {v1, p0}, Ljava/io/DataOutputStream;->write([B)V

    .line 523
    sget-object p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->outputStream:Ljava/io/DataOutputStream;

    invoke-virtual {p0}, Ljava/io/DataOutputStream;->flush()V

    const/4 p0, 0x1

    .line 525
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->doSendPacket:Z

    const/4 p0, 0x0

    .line 526
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->doRecvPacket:Z

    .line 528
    sget-object p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->inputStream:Ljava/io/DataInputStream;

    if-nez p0, :cond_1

    .line 529
    new-instance p0, Ljava/io/DataInputStream;

    sget-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->socketConnection:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {p0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    sput-object p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->inputStream:Ljava/io/DataInputStream;

    .line 530
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "[GPTOUCHFullNetwork][DEBUG] inputStream Create!!!"

    invoke-virtual {p0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 533
    :cond_1
    sget-object p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->inputStream:Ljava/io/DataInputStream;

    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->readTCPInput(Ljava/io/DataInputStream;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 543
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    return-object v0

    :catch_1
    move-exception p0

    .line 540
    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    return-object v0

    :catch_2
    move-exception p0

    .line 536
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "[GPTOUCHFullNetwork][DEBUG] getTCPData Socket Time Out!!!"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 537
    invoke-virtual {p0}, Ljava/net/SocketTimeoutException;->printStackTrace()V

    return-object v0
.end method

.method private static insertPacketHeader([B)[B
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 557
    :cond_0
    array-length v0, p0

    const/4 v1, 0x0

    add-int/2addr v0, v1

    new-array v0, v0, [B

    .line 559
    array-length v2, p0

    invoke-static {p0, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static final int2byte(I)[B
    .locals 6

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 1080
    sget-boolean v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isBigEndian:Z

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v1, v5, :cond_0

    and-int/lit16 v1, p0, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v2

    ushr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    ushr-int/lit8 v1, p0, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v5

    ushr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    aput-byte p0, v0, v4

    goto :goto_0

    :cond_0
    and-int/lit16 v1, p0, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v4

    ushr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v5

    ushr-int/lit8 v1, p0, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    ushr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    aput-byte p0, v0, v2

    :goto_0
    return-object v0
.end method

.method private isPurchaseSequence(I)Z
    .locals 2

    .line 717
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->purchaseSequenceQueue:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 718
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->purchaseSequenceQueue:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 719
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 720
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public static openTCPConnection()Z
    .locals 6

    const-string v0, "[GPTOUCHNetwork][DEBUG] openTCPConnection IP : "

    .line 617
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "@ openTCPConnectionopenTCPConnectionopenTCPConnection ="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->ServerIP:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "openTCPConnection"

    invoke-static {v3, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 618
    sget-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->socketConnection:Ljava/net/Socket;

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    .line 620
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->ServerIP:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v4

    :cond_0
    const/4 v1, 0x0

    .line 624
    :try_start_0
    sget-object v2, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->ServerIP:Ljava/lang/String;

    invoke-static {v2}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v2

    .line 625
    new-instance v3, Ljava/net/Socket;

    sget v5, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->ServerPort:I

    invoke-direct {v3, v2, v5}, Ljava/net/Socket;-><init>(Ljava/net/InetAddress;I)V

    sput-object v3, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->socketConnection:Ljava/net/Socket;

    const/16 v2, 0x2710

    .line 630
    invoke-virtual {v3, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 632
    sget-object v2, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->socketConnection:Ljava/net/Socket;

    if-eqz v2, :cond_1

    .line 634
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->ServerIP:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " PORT : "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->ServerPort:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " Success!!"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return v4

    :catchall_0
    move-exception v0

    .line 653
    throw v0

    :catch_0
    move-exception v0

    .line 647
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 648
    invoke-static {}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->closeTCPConnection()Z

    return v1

    :catch_1
    move-exception v0

    .line 640
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v3, "[GPTOUCHNetwork][DEBUG] openTCPConnection Socket TimeOut!!"

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 641
    invoke-virtual {v0}, Ljava/net/SocketTimeoutException;->printStackTrace()V

    .line 642
    invoke-static {}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->closeTCPConnection()Z

    return v1
.end method

.method private static parseHeader(Ljava/io/DataInputStream;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "[GPTOUCHSemiNetwork][DEBUG] parseHeader========= length:"

    const/16 v1, 0x9

    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 419
    sput v3, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->recvLength:I

    .line 421
    :try_start_0
    invoke-virtual {p0, v2, v3, v1}, Ljava/io/DataInputStream;->read([BII)I

    const/4 p0, 0x5

    .line 422
    invoke-static {v2, p0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->byte2short([BI)S

    move-result p0

    sput p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->recvLength:I

    const/4 p0, 0x3

    .line 423
    invoke-static {v2, p0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->byte2short([BI)S

    move-result p0

    sput-short p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->recvCmd:S

    .line 424
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->recvLength:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " cmd:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-short v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->recvCmd:S

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 430
    sget p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->recvLength:I

    return p0

    :catch_0
    move-exception p0

    .line 426
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, -0x1

    return p0
.end method

.method public static parseInt(Ljava/lang/String;I)I
    .locals 0

    if-nez p0, :cond_0

    return p1

    .line 1195
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return p1
.end method

.method private static readTCPInput(Ljava/io/DataInputStream;)[B
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "[GPTOUCHFullNetwork][DEBUG] readTCPInput datalen"

    const-string v1, "[GPTOUCHFullNetwork][DEBUG] readTCPInput available"

    const/4 v2, 0x0

    .line 450
    :try_start_0
    invoke-virtual {p0}, Ljava/io/DataInputStream;->available()I

    move-result v3

    .line 452
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-gtz v3, :cond_0

    new-array v0, v1, [B

    .line 455
    invoke-virtual {p0, v0}, Ljava/io/DataInputStream;->read([B)I

    const-wide/16 v0, 0x1f4

    .line 456
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    return-object v2

    .line 461
    :cond_0
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->parseHeader(Ljava/io/DataInputStream;)I

    move-result v3

    .line 462
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    if-gez v3, :cond_1

    return-object v2

    :cond_1
    if-nez v3, :cond_2

    new-array p0, v1, [B

    return-object p0

    .line 471
    :cond_2
    new-array v0, v3, [B

    .line 480
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v5, "[GPTOUCHFullNetwork][DEBUG] readTCPInput recvLength9"

    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/16 v4, 0x9

    const/4 v4, 0x0

    const/16 v5, 0x9

    :goto_0
    const/4 v6, 0x1

    if-nez v1, :cond_4

    mul-int/lit16 v7, v4, 0x400

    add-int/lit16 v8, v7, 0x400

    if-lt v8, v3, :cond_3

    sub-int v1, v3, v7

    goto :goto_1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    const/16 v6, 0x400

    move v6, v1

    const/16 v1, 0x400

    :goto_1
    add-int/2addr v5, v1

    .line 495
    invoke-virtual {p0, v0, v7, v1}, Ljava/io/DataInputStream;->read([BII)I

    .line 496
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "[GPTOUCHFullNetwork][DEBUG] readTCPInput recvLength Size"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 497
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "[GPTOUCHFullNetwork][DEBUG] readTCPInput datalen Size"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 498
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "[GPTOUCHFullNetwork][DEBUG] readTCPInput isEnd!!!!!"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 499
    invoke-static {}, Ljava/lang/Thread;->yield()V

    move v1, v6

    goto :goto_0

    .line 502
    :cond_4
    sput-boolean v6, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->doRecvPacket:Z
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 509
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    return-object v2

    :catch_1
    move-exception p0

    .line 505
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "[GPTOUCHFullNetwork][DEBUG] readTCPInput Socket Time Out!!!"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 506
    invoke-virtual {p0}, Ljava/net/SocketTimeoutException;->printStackTrace()V

    return-object v2
.end method

.method static requestPurchase(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    .line 884
    sput-boolean v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isRequestPurchase:Z

    .line 886
    sput p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->pItemBuySeq:I

    .line 887
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->pItemServerCode:Ljava/lang/String;

    .line 888
    sput-object p1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->pItemPaycode:Ljava/lang/String;

    .line 889
    sput-object p2, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->pItemName:Ljava/lang/String;

    return-void
.end method

.method private static sendTCPRequest([B)[B
    .locals 1

    .line 578
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->insertPacketHeader([B)[B

    move-result-object p0

    .line 581
    :try_start_0
    invoke-static {}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->openTCPConnection()Z

    .line 582
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->getTCPData([B)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 589
    throw p0

    :catch_0
    move-exception p0

    .line 585
    sget-byte v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->errorCounter:B

    add-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    sput-byte v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->errorCounter:B

    .line 586
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static serverInfo(Ljava/lang/String;I)V
    .locals 0

    .line 288
    sput-object p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->ServerIP:Ljava/lang/String;

    .line 289
    sput p1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->ServerPort:I

    return-void
.end method

.method public static setAppId(Ljava/lang/String;)V
    .locals 0

    .line 245
    sput-object p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->myAppId:Ljava/lang/String;

    return-void
.end method

.method public static setBpIp(Ljava/lang/String;)V
    .locals 0

    .line 249
    sput-object p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->myBPIp:Ljava/lang/String;

    return-void
.end method

.method public static setBpPort(I)V
    .locals 0

    .line 257
    sput p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->myBPPort:I

    return-void
.end method

.method public static setFullNetwork(Z)V
    .locals 0

    .line 284
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isFullNetwork:Z

    return-void
.end method

.method public static setRunning(Z)V
    .locals 2

    .line 262
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isRunning:Z

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    .line 264
    new-instance p0, Ljava/lang/Thread;

    sget-object v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->self:Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;

    invoke-direct {p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    sput-object p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->thread:Ljava/lang/Thread;

    .line 265
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 266
    sget-object p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->thread:Ljava/lang/Thread;

    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 270
    :cond_0
    :try_start_0
    sget-object p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->thread:Ljava/lang/Thread;

    invoke-virtual {p0}, Ljava/lang/Thread;->join()V

    const/4 p0, 0x0

    .line 271
    sput-object p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->thread:Ljava/lang/Thread;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 274
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static setServerEndian(Z)V
    .locals 0

    .line 280
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isBigEndian:Z

    return-void
.end method

.method public static final short2byte(S)[B
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [B

    .line 1122
    sget-boolean v1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isBigEndian:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    and-int/lit16 v1, p0, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    ushr-int/lit8 p0, p0, 0x8

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    aput-byte p0, v0, v2

    goto :goto_0

    :cond_0
    and-int/lit16 v1, p0, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v2

    ushr-int/lit8 p0, p0, 0x8

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    aput-byte p0, v0, v3

    :goto_0
    return-object v0
.end method


# virtual methods
.method public doSendTCP([B)V
    .locals 1

    .line 301
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->requestQueue:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    return-void
.end method

.method public getResponse()[B
    .locals 3

    .line 314
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->result:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 315
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->result:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->firstElement()Ljava/lang/Object;

    move-result-object v0

    .line 316
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->result:Ljava/util/Vector;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/Vector;->removeElementAt(I)V

    .line 317
    instance-of v1, v0, [B

    if-eqz v1, :cond_0

    check-cast v0, [B

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public initPurchaseItemQueue([I[Ljava/lang/String;[Ljava/lang/String;)V
    .locals 6

    .line 791
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 793
    new-instance v2, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;

    aget v3, p1, v1

    aget-object v4, p2, v1

    aget-object v5, p3, v1

    invoke-direct {v2, p0, v3, v4, v5}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;-><init>(Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;ILjava/lang/String;Ljava/lang/String;)V

    .line 794
    iget-object v3, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->purchaseItemQueue:Ljava/util/Vector;

    invoke-virtual {v3, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public initPurchaseItemQueue([Ljava/lang/String;[Ljava/lang/String;)V
    .locals 5

    .line 799
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 801
    new-instance v2, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;

    aget-object v3, p1, v1

    aget-object v4, p2, v1

    invoke-direct {v2, p0, v3, v4}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork$cPurchaseItem;-><init>(Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;Ljava/lang/String;Ljava/lang/String;)V

    .line 802
    iget-object v3, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->purchaseItemQueue:Ljava/util/Vector;

    invoke-virtual {v3, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public initPurchaseSequenceQueue([I)V
    .locals 4

    .line 710
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 712
    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->purchaseSequenceQueue:Ljava/util/Vector;

    aget v3, p1, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public isBusy()Z
    .locals 1

    .line 331
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->requestQueue:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->result:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isNotRecvYet()Z
    .locals 1

    .line 340
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->doSendPacket:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->doRecvPacket:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isRequestPurchase()Z
    .locals 1

    .line 823
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isRequestPurchase:Z

    return v0
.end method

.method public run()V
    .locals 5

    .line 351
    :cond_0
    :goto_0
    :try_start_0
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isRunning:Z

    if-eqz v0, :cond_7

    if-nez v0, :cond_1

    goto/16 :goto_1

    .line 357
    :cond_1
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isFullNetwork:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 359
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->requestQueue:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 360
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 361
    sget-wide v2, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->nextSyncTime:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isBusy()Z

    move-result v0

    if-nez v0, :cond_0

    .line 362
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x1388

    add-long/2addr v0, v2

    sput-wide v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->nextSyncTime:J

    goto :goto_0

    .line 370
    :cond_2
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->requestQueue:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 372
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->sendTCPRequest([B)[B

    move-result-object v0

    .line 373
    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->result:Ljava/util/Vector;

    invoke-virtual {v2, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 374
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->requestQueue:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->removeElementAt(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 377
    :try_start_1
    sget-byte v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->errorCounter:B

    const/16 v1, 0x1f4

    shl-int v0, v1, v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 379
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 386
    :cond_3
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->requestQueue:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 387
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->requestQueue:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 388
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->sendTCPRequest([B)[B

    move-result-object v2

    .line 389
    invoke-direct {p0, v0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->checkOutputPurchaseSequence([B)V

    .line 390
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->requestQueue:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->removeElementAt(I)V

    if-nez v2, :cond_4

    goto :goto_0

    .line 393
    :cond_4
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->result:Ljava/util/Vector;

    invoke-virtual {v0, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 396
    :cond_5
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isNotRecvYet()Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    if-eqz v0, :cond_0

    .line 399
    :try_start_3
    sget-object v0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->inputStream:Ljava/io/DataInputStream;

    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->readTCPInput(Ljava/io/DataInputStream;)[B

    move-result-object v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    .line 402
    :cond_6
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->result:Ljava/util/Vector;

    invoke-virtual {v1, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v0

    .line 407
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0

    :catch_2
    move-exception v0

    .line 404
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "[GPTOUCHSemiNetwork][DEBUG] GPTOUCHNetwork Socket TimeOut!!"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 405
    invoke-virtual {v0}, Ljava/net/SocketTimeoutException;->printStackTrace()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto/16 :goto_0

    :catch_3
    move-exception v0

    .line 413
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_7
    :goto_1
    return-void
.end method

.method public setPayCodeOffsetInPacket(II)V
    .locals 0

    .line 735
    sput p1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->sendPayCodeOffset:I

    .line 736
    sput p2, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->recvPayCodeOffset:I

    return-void
.end method

.method public setUseServerPayCode(Z)V
    .locals 0

    .line 824
    sput-boolean p1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;->isUseServerPayCode:Z

    return-void
.end method
