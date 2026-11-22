.class Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;
.super Ljava/lang/Object;
.source "LabelMaker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Label"
.end annotation


# instance fields
.field public baseline:F

.field public height:F

.field public mCrop:[I

.field public width:F


# direct methods
.method public constructor <init>(FFFIIII)V
    .locals 0

    .line 397
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 399
    iput p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;->width:F

    .line 400
    iput p2, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;->height:F

    .line 401
    iput p3, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;->baseline:F

    .line 406
    filled-new-array {p4, p5, p6, p7}, [I

    move-result-object p1

    .line 407
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;->mCrop:[I

    return-void
.end method
