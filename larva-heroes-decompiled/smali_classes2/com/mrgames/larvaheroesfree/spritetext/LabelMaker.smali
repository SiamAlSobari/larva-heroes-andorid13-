.class public Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;
.super Ljava/lang/Object;
.source "LabelMaker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;
    }
.end annotation


# static fields
.field private static final STATE_ADDING:I = 0x2

.field private static final STATE_DRAWING:I = 0x3

.field private static final STATE_INITIALIZED:I = 0x1

.field private static final STATE_NEW:I


# instance fields
.field private mBitmap:Landroid/graphics/Bitmap;

.field private mCanvas:Landroid/graphics/Canvas;

.field private mClearPaint:Landroid/graphics/Paint;

.field private mFullColor:Z

.field private mLabels:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;",
            ">;"
        }
    .end annotation
.end field

.field private mLineHeight:I

.field private mState:I

.field private mStrikeHeight:I

.field private mStrikeWidth:I

.field private mTexelHeight:F

.field private mTexelWidth:F

.field private mTextureID:I

.field private mU:I

.field private mV:I


# direct methods
.method public constructor <init>(ZII)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 434
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mLabels:Ljava/util/ArrayList;

    .line 69
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mFullColor:Z

    .line 70
    iput p2, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mStrikeWidth:I

    .line 71
    iput p3, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mStrikeHeight:I

    int-to-double p1, p2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 72
    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    div-double p1, v0, p1

    double-to-float p1, p1

    iput p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mTexelWidth:F

    int-to-double p1, p3

    .line 73
    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, p1

    double-to-float p1, v0

    iput p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mTexelHeight:F

    .line 74
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mClearPaint:Landroid/graphics/Paint;

    const/4 p2, 0x0

    .line 75
    invoke-virtual {p1, p2, p2, p2, p2}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 76
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mClearPaint:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 77
    iput p2, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mState:I

    return-void
.end method

.method private checkState(II)V
    .locals 1

    .line 389
    iget v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mState:I

    if-ne v0, p1, :cond_0

    .line 392
    iput p2, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mState:I

    return-void

    .line 390
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Can\'t call this method now."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public add(Ljavax/microedition/khronos/opengles/GL10;Landroid/graphics/drawable/Drawable;II)I
    .locals 7

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    move v6, p4

    .line 198
    invoke-virtual/range {v0 .. v6}, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->add(Ljavax/microedition/khronos/opengles/GL10;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/Paint;II)I

    move-result p1

    return p1
.end method

.method public add(Ljavax/microedition/khronos/opengles/GL10;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/Paint;)I
    .locals 7

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 190
    invoke-virtual/range {v0 .. v6}, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->add(Ljavax/microedition/khronos/opengles/GL10;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/Paint;II)I

    move-result p1

    return p1
.end method

.method public add(Ljavax/microedition/khronos/opengles/GL10;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/Paint;II)I
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const/4 v4, 0x2

    .line 210
    invoke-direct {v0, v4, v4}, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->checkState(II)V

    if-eqz v1, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    .line 214
    :goto_1
    sget-object v9, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v10, "add()"

    invoke-virtual {v9, v10}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 216
    new-instance v9, Landroid/graphics/Rect;

    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    if-eqz v7, :cond_2

    .line 218
    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 219
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v10

    move/from16 v11, p5

    invoke-static {v11, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 220
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v11

    move/from16 v12, p6

    invoke-static {v12, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    goto :goto_2

    :cond_2
    move/from16 v11, p5

    move/from16 v12, p6

    move v10, v11

    move v11, v12

    :goto_2
    if-eqz v8, :cond_3

    .line 228
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Paint;->ascent()F

    move-result v12

    neg-float v12, v12

    float-to-double v12, v12

    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v12

    double-to-int v12, v12

    .line 229
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Paint;->descent()F

    move-result v13

    float-to-double v13, v13

    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v13

    double-to-int v13, v13

    .line 230
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v14

    float-to-double v14, v14

    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v14

    double-to-int v14, v14

    goto :goto_3

    :cond_3
    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_3
    add-int/2addr v13, v12

    .line 233
    iget v15, v0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mStrikeWidth:I

    invoke-static {v15, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    .line 235
    iget v15, v9, Landroid/graphics/Rect;->top:I

    iget v6, v9, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v15, v6

    .line 236
    iget v6, v9, Landroid/graphics/Rect;->left:I

    iget v5, v9, Landroid/graphics/Rect;->right:I

    add-int/2addr v6, v5

    add-int v5, v13, v15

    .line 237
    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int v11, v14, v6

    .line 238
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v10

    sub-int v11, v5, v15

    sub-int v6, v10, v6

    sub-int/2addr v11, v13

    .line 242
    div-int/2addr v11, v4

    sub-int/2addr v6, v14

    .line 243
    div-int/2addr v6, v4

    .line 249
    iget v4, v0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mU:I

    .line 250
    iget v13, v0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mV:I

    .line 251
    iget v14, v0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mLineHeight:I

    .line 253
    iget v15, v0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mStrikeWidth:I

    if-le v10, v15, :cond_4

    move v10, v15

    :cond_4
    add-int v2, v4, v10

    if-le v2, v15, :cond_5

    add-int/2addr v13, v14

    const/4 v4, 0x0

    const/4 v14, 0x0

    .line 264
    :cond_5
    invoke-static {v14, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int v14, v13, v2

    .line 265
    iget v15, v0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mStrikeHeight:I

    if-gt v14, v15, :cond_8

    add-int v14, v4, v10

    add-int v15, v13, v12

    move/from16 p1, v12

    add-int v12, v13, v5

    if-eqz v7, :cond_6

    .line 274
    invoke-virtual {v1, v4, v13, v14, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 275
    iget-object v7, v0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v1, v7}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_6
    if-eqz v8, :cond_7

    .line 279
    iget-object v1, v0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mCanvas:Landroid/graphics/Canvas;

    iget v7, v9, Landroid/graphics/Rect;->left:I

    add-int/2addr v7, v4

    add-int/2addr v7, v6

    int-to-float v6, v7

    iget v7, v9, Landroid/graphics/Rect;->top:I

    add-int/2addr v15, v7

    add-int/2addr v15, v11

    int-to-float v7, v15

    move-object/from16 v8, p3

    invoke-virtual {v1, v8, v6, v7, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 299
    :cond_7
    iput v14, v0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mU:I

    .line 300
    iput v13, v0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mV:I

    .line 301
    iput v2, v0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mLineHeight:I

    .line 302
    iget-object v1, v0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mLabels:Ljava/util/ArrayList;

    new-instance v2, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;

    int-to-float v3, v10

    int-to-float v6, v5

    move/from16 v7, p1

    int-to-float v7, v7

    neg-int v5, v5

    move-object/from16 v16, v2

    move/from16 v17, v3

    move/from16 v18, v6

    move/from16 v19, v7

    move/from16 v20, v4

    move/from16 v21, v12

    move/from16 v22, v10

    move/from16 v23, v5

    invoke-direct/range {v16 .. v23}, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;-><init>(FFFIIII)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    iget-object v1, v0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mLabels:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    return v1

    .line 266
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Out of texture space."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public add(Ljavax/microedition/khronos/opengles/GL10;Ljava/lang/String;Landroid/graphics/Paint;)I
    .locals 1

    const/4 v0, 0x0

    .line 153
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->add(Ljavax/microedition/khronos/opengles/GL10;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/Paint;)I

    move-result p1

    return p1
.end method

.method public beginAdding(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 3

    const/4 p1, 0x1

    const/4 v0, 0x2

    .line 129
    invoke-direct {p0, p1, v0}, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->checkState(II)V

    .line 130
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mLabels:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    const/4 p1, 0x0

    .line 132
    iput p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mU:I

    .line 133
    iput p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mV:I

    .line 134
    iput p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mLineHeight:I

    .line 135
    iget-boolean v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mFullColor:Z

    if-eqz v0, :cond_0

    .line 136
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    .line 139
    :goto_0
    iget v1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mStrikeWidth:I

    iget v2, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mStrikeHeight:I

    invoke-static {v1, v2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mBitmap:Landroid/graphics/Bitmap;

    .line 140
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mBitmap:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mCanvas:Landroid/graphics/Canvas;

    .line 141
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0, p1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    return-void
.end method

.method public beginDrawing(Ljavax/microedition/khronos/opengles/GL10;FF)V
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x3

    .line 164
    invoke-direct {p0, v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->checkState(II)V

    const/16 v0, 0xde1

    .line 165
    iget v1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mTextureID:I

    invoke-interface {p1, v0, v1}, Ljavax/microedition/khronos/opengles/GL10;->glBindTexture(II)V

    const/16 v0, 0x1d00

    .line 166
    invoke-interface {p1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glShadeModel(I)V

    const/16 v0, 0xbe2

    .line 167
    invoke-interface {p1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glEnable(I)V

    const/16 v0, 0x302

    const/16 v1, 0x303

    .line 168
    invoke-interface {p1, v0, v1}, Ljavax/microedition/khronos/opengles/GL10;->glBlendFunc(II)V

    const/high16 v0, 0x10000

    .line 169
    invoke-interface {p1, v0, v0, v0, v0}, Ljavax/microedition/khronos/opengles/GL10;->glColor4x(IIII)V

    const/16 v0, 0x1701

    .line 170
    invoke-interface {p1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glMatrixMode(I)V

    .line 171
    invoke-interface {p1}, Ljavax/microedition/khronos/opengles/GL10;->glPushMatrix()V

    .line 172
    invoke-interface {p1}, Ljavax/microedition/khronos/opengles/GL10;->glLoadIdentity()V

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    move-object v1, p1

    move v3, p2

    move v5, p3

    .line 173
    invoke-interface/range {v1 .. v7}, Ljavax/microedition/khronos/opengles/GL10;->glOrthof(FFFFFF)V

    const/16 p2, 0x1700

    .line 174
    invoke-interface {p1, p2}, Ljavax/microedition/khronos/opengles/GL10;->glMatrixMode(I)V

    .line 175
    invoke-interface {p1}, Ljavax/microedition/khronos/opengles/GL10;->glPushMatrix()V

    .line 176
    invoke-interface {p1}, Ljavax/microedition/khronos/opengles/GL10;->glLoadIdentity()V

    const/high16 p2, 0x3ec00000    # 0.375f

    const/4 p3, 0x0

    .line 178
    invoke-interface {p1, p2, p2, p3}, Ljavax/microedition/khronos/opengles/GL10;->glTranslatef(FFF)V

    return-void
.end method

.method public draw(Ljavax/microedition/khronos/opengles/GL10;FFI)V
    .locals 11

    const/4 v0, 0x3

    .line 365
    invoke-direct {p0, v0, v0}, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->checkState(II)V

    .line 366
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mLabels:Ljava/util/ArrayList;

    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;

    const/16 v0, 0xde1

    .line 367
    invoke-interface {p1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glEnable(I)V

    .line 368
    move-object v1, p1

    check-cast v1, Ljavax/microedition/khronos/opengles/GL11;

    iget-object v2, p4, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;->mCrop:[I

    const/4 v3, 0x0

    const v4, 0x8b9d

    invoke-interface {v1, v0, v4, v2, v3}, Ljavax/microedition/khronos/opengles/GL11;->glTexParameteriv(II[II)V

    .line 370
    move-object v5, p1

    check-cast v5, Ljavax/microedition/khronos/opengles/GL11Ext;

    float-to-int v6, p2

    float-to-int v7, p3

    const/4 v8, 0x0

    iget p1, p4, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;->width:F

    float-to-int v9, p1

    iget p1, p4, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;->height:F

    float-to-int v10, p1

    invoke-interface/range {v5 .. v10}, Ljavax/microedition/khronos/opengles/GL11Ext;->glDrawTexiOES(IIIII)V

    return-void
.end method

.method public endAdding(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x1

    .line 313
    invoke-direct {p0, v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->checkState(II)V

    .line 314
    iget v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mTextureID:I

    const/16 v1, 0xde1

    invoke-interface {p1, v1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glBindTexture(II)V

    const/4 p1, 0x0

    .line 315
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mBitmap:Landroid/graphics/Bitmap;

    invoke-static {v1, p1, v0, p1}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    .line 318
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    const/4 p1, 0x0

    .line 319
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mBitmap:Landroid/graphics/Bitmap;

    .line 320
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mCanvas:Landroid/graphics/Canvas;

    return-void
.end method

.method public endDrawing(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x1

    .line 380
    invoke-direct {p0, v0, v1}, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->checkState(II)V

    const/16 v0, 0x1701

    .line 382
    invoke-interface {p1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glMatrixMode(I)V

    .line 383
    invoke-interface {p1}, Ljavax/microedition/khronos/opengles/GL10;->glPopMatrix()V

    const/16 v0, 0x1700

    .line 384
    invoke-interface {p1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glMatrixMode(I)V

    .line 385
    invoke-interface {p1}, Ljavax/microedition/khronos/opengles/GL10;->glPopMatrix()V

    return-void
.end method

.method public getBaseline(I)F
    .locals 1

    .line 352
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mLabels:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;

    iget p1, p1, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;->baseline:F

    return p1
.end method

.method public getHeight(I)F
    .locals 1

    .line 340
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mLabels:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;

    iget p1, p1, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;->height:F

    return p1
.end method

.method public getWidth(I)F
    .locals 1

    .line 330
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mLabels:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;

    iget p1, p1, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker$Label;->width:F

    return p1
.end method

.method public initialize(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 3

    const/4 v0, 0x1

    .line 87
    iput v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mState:I

    new-array v1, v0, [I

    const/4 v2, 0x0

    .line 89
    invoke-interface {p1, v0, v1, v2}, Ljavax/microedition/khronos/opengles/GL10;->glGenTextures(I[II)V

    aget v0, v1, v2

    .line 90
    iput v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mTextureID:I

    const/16 v1, 0xde1

    .line 91
    invoke-interface {p1, v1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glBindTexture(II)V

    const/16 v0, 0x2801

    const/high16 v2, 0x46180000    # 9728.0f

    .line 94
    invoke-interface {p1, v1, v0, v2}, Ljavax/microedition/khronos/opengles/GL10;->glTexParameterf(IIF)V

    const/16 v0, 0x2800

    .line 96
    invoke-interface {p1, v1, v0, v2}, Ljavax/microedition/khronos/opengles/GL10;->glTexParameterf(IIF)V

    const/16 v0, 0x2802

    const v2, 0x47012f00    # 33071.0f

    .line 99
    invoke-interface {p1, v1, v0, v2}, Ljavax/microedition/khronos/opengles/GL10;->glTexParameterf(IIF)V

    const/16 v0, 0x2803

    .line 101
    invoke-interface {p1, v1, v0, v2}, Ljavax/microedition/khronos/opengles/GL10;->glTexParameterf(IIF)V

    return-void
.end method

.method public shutdown(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 113
    iget v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mState:I

    if-lez v0, :cond_0

    .line 115
    iget v0, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mTextureID:I

    filled-new-array {v0}, [I

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 116
    invoke-interface {p1, v1, v0, v2}, Ljavax/microedition/khronos/opengles/GL10;->glDeleteTextures(I[II)V

    .line 117
    iput v2, p0, Lcom/mrgames/larvaheroesfree/spritetext/LabelMaker;->mState:I

    :cond_0
    return-void
.end method
