.class public final enum Lcom/unity3d/services/banners/view/a;
.super Ljava/lang/Enum;
.source "BannerPosition.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/unity3d/services/banners/view/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/unity3d/services/banners/view/a;

.field public static final enum b:Lcom/unity3d/services/banners/view/a;

.field public static final enum c:Lcom/unity3d/services/banners/view/a;

.field public static final enum d:Lcom/unity3d/services/banners/view/a;

.field public static final enum e:Lcom/unity3d/services/banners/view/a;

.field public static final enum f:Lcom/unity3d/services/banners/view/a;

.field public static final enum g:Lcom/unity3d/services/banners/view/a;

.field public static final enum h:Lcom/unity3d/services/banners/view/a;

.field private static final synthetic i:[Lcom/unity3d/services/banners/view/a;


# instance fields
.field private final j:[I

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/unity3d/services/banners/view/a;

    const/16 v1, 0xa

    const/16 v2, 0x9

    filled-new-array {v1, v2}, [I

    move-result-object v3

    const/16 v4, 0x33

    const-string v5, "TOP_LEFT"

    const/4 v6, 0x0

    invoke-direct {v0, v5, v6, v3, v4}, Lcom/unity3d/services/banners/view/a;-><init>(Ljava/lang/String;I[II)V

    sput-object v0, Lcom/unity3d/services/banners/view/a;->a:Lcom/unity3d/services/banners/view/a;

    .line 2
    new-instance v3, Lcom/unity3d/services/banners/view/a;

    const/16 v4, 0xe

    filled-new-array {v1, v4}, [I

    move-result-object v5

    const/16 v7, 0x31

    const-string v8, "TOP_CENTER"

    const/4 v9, 0x1

    invoke-direct {v3, v8, v9, v5, v7}, Lcom/unity3d/services/banners/view/a;-><init>(Ljava/lang/String;I[II)V

    sput-object v3, Lcom/unity3d/services/banners/view/a;->b:Lcom/unity3d/services/banners/view/a;

    .line 3
    new-instance v5, Lcom/unity3d/services/banners/view/a;

    const/16 v7, 0xb

    filled-new-array {v1, v7}, [I

    move-result-object v1

    const/16 v8, 0x35

    const-string v10, "TOP_RIGHT"

    const/4 v11, 0x2

    invoke-direct {v5, v10, v11, v1, v8}, Lcom/unity3d/services/banners/view/a;-><init>(Ljava/lang/String;I[II)V

    sput-object v5, Lcom/unity3d/services/banners/view/a;->c:Lcom/unity3d/services/banners/view/a;

    .line 4
    new-instance v1, Lcom/unity3d/services/banners/view/a;

    const/16 v8, 0xc

    filled-new-array {v8, v2}, [I

    move-result-object v2

    const/16 v10, 0x53

    const-string v12, "BOTTOM_LEFT"

    const/4 v13, 0x3

    invoke-direct {v1, v12, v13, v2, v10}, Lcom/unity3d/services/banners/view/a;-><init>(Ljava/lang/String;I[II)V

    sput-object v1, Lcom/unity3d/services/banners/view/a;->d:Lcom/unity3d/services/banners/view/a;

    .line 5
    new-instance v2, Lcom/unity3d/services/banners/view/a;

    filled-new-array {v8, v4}, [I

    move-result-object v4

    const/16 v10, 0x51

    const-string v12, "BOTTOM_CENTER"

    const/4 v14, 0x4

    invoke-direct {v2, v12, v14, v4, v10}, Lcom/unity3d/services/banners/view/a;-><init>(Ljava/lang/String;I[II)V

    sput-object v2, Lcom/unity3d/services/banners/view/a;->e:Lcom/unity3d/services/banners/view/a;

    .line 6
    new-instance v4, Lcom/unity3d/services/banners/view/a;

    filled-new-array {v8, v7}, [I

    move-result-object v7

    const/16 v8, 0x55

    const-string v10, "BOTTOM_RIGHT"

    const/4 v12, 0x5

    invoke-direct {v4, v10, v12, v7, v8}, Lcom/unity3d/services/banners/view/a;-><init>(Ljava/lang/String;I[II)V

    sput-object v4, Lcom/unity3d/services/banners/view/a;->f:Lcom/unity3d/services/banners/view/a;

    .line 7
    new-instance v7, Lcom/unity3d/services/banners/view/a;

    const/16 v8, 0xd

    filled-new-array {v8}, [I

    move-result-object v8

    const/16 v10, 0x11

    const-string v15, "CENTER"

    const/4 v12, 0x6

    invoke-direct {v7, v15, v12, v8, v10}, Lcom/unity3d/services/banners/view/a;-><init>(Ljava/lang/String;I[II)V

    sput-object v7, Lcom/unity3d/services/banners/view/a;->g:Lcom/unity3d/services/banners/view/a;

    .line 8
    new-instance v8, Lcom/unity3d/services/banners/view/a;

    new-array v10, v6, [I

    const-string v15, "NONE"

    const/4 v12, 0x7

    invoke-direct {v8, v15, v12, v10, v6}, Lcom/unity3d/services/banners/view/a;-><init>(Ljava/lang/String;I[II)V

    sput-object v8, Lcom/unity3d/services/banners/view/a;->h:Lcom/unity3d/services/banners/view/a;

    const/16 v10, 0x8

    new-array v10, v10, [Lcom/unity3d/services/banners/view/a;

    aput-object v0, v10, v6

    aput-object v3, v10, v9

    aput-object v5, v10, v11

    aput-object v1, v10, v13

    aput-object v2, v10, v14

    const/4 v0, 0x5

    aput-object v4, v10, v0

    const/4 v0, 0x6

    aput-object v7, v10, v0

    aput-object v8, v10, v12

    .line 9
    sput-object v10, Lcom/unity3d/services/banners/view/a;->i:[Lcom/unity3d/services/banners/view/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I[II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/unity3d/services/banners/view/a;->j:[I

    .line 3
    iput p4, p0, Lcom/unity3d/services/banners/view/a;->k:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/unity3d/services/banners/view/a;
    .locals 1

    .line 1
    const-class v0, Lcom/unity3d/services/banners/view/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/unity3d/services/banners/view/a;

    return-object p0
.end method

.method public static values()[Lcom/unity3d/services/banners/view/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/unity3d/services/banners/view/a;->i:[Lcom/unity3d/services/banners/view/a;

    invoke-virtual {v0}, [Lcom/unity3d/services/banners/view/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/unity3d/services/banners/view/a;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/unity3d/services/banners/view/a;->k:I

    return v0
.end method
