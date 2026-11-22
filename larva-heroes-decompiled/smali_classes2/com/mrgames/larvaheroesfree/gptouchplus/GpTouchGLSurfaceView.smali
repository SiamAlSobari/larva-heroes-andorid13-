.class public Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;
.super Landroid/opengl/GLSurfaceView;
.source "GpTouchGLSurfaceView.java"


# static fields
.field private static mFindPointerIndex:Ljava/lang/reflect/Method; = null

.field private static mGetPointerId:Ljava/lang/reflect/Method; = null

.field private static mGetX:Ljava/lang/reflect/Method; = null

.field private static mGetY:Ljava/lang/reflect/Method; = null

.field public static mIsMultiTouchSupported:Z = true


# instance fields
.field public mActivePointerId:I

.field private mHolder:Landroid/view/SurfaceHolder;

.field public mMovePointerId:I

.field public mPointX:I

.field public mPointY:I

.field mRenderer:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    const/4 p1, -0x1

    .line 32
    iput p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->mActivePointerId:I

    .line 33
    iput p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->mMovePointerId:I

    const/4 p1, 0x2

    .line 48
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->setEGLContextClientVersion(I)V

    .line 50
    new-instance p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;

    invoke-direct {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;-><init>()V

    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->mRenderer:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;

    .line 51
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    const/4 p1, 0x1

    .line 52
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->setFocusable(Z)V

    .line 53
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->setFocusableInTouchMode(Z)V

    .line 54
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->requestFocus()Z

    .line 56
    invoke-direct {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->init()V

    return-void
.end method

.method private init()V
    .locals 2

    .line 62
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->mHolder:Landroid/view/SurfaceHolder;

    const/4 v1, 0x2

    .line 64
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setType(I)V

    return-void
.end method


# virtual methods
.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 69
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->mIsMultiTouchSupported:Z

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_7

    .line 71
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 72
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v3

    .line 73
    new-array v4, v3, [I

    .line 74
    new-array v5, v3, [F

    .line 75
    new-array v6, v3, [F

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v3, :cond_0

    .line 78
    invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v9

    aput v9, v4, v8

    .line 79
    invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getX(I)F

    move-result v9

    aput v9, v5, v8

    .line 80
    invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getY(I)F

    move-result v9

    aput v9, v6, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_0
    and-int/lit16 v3, v0, 0xff

    if-eqz v3, :cond_6

    if-eq v3, v2, :cond_5

    if-eq v3, v1, :cond_4

    const/4 v1, 0x3

    if-eq v3, v1, :cond_3

    const/4 v1, 0x5

    if-eq v3, v1, :cond_2

    const/4 v1, 0x6

    if-eq v3, v1, :cond_1

    goto/16 :goto_1

    :cond_1
    shr-int/lit8 v0, v0, 0x8

    .line 125
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 126
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    .line 127
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    .line 129
    new-instance v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$4;

    invoke-direct {v0, p0, v1, v3, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$4;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;IFF)V

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V

    goto/16 :goto_1

    :cond_2
    shr-int/lit8 v0, v0, 0x8

    .line 88
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 89
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    .line 90
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    .line 92
    new-instance v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$1;

    invoke-direct {v0, p0, v1, v3, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$1;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;IFF)V

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V

    goto/16 :goto_1

    .line 152
    :cond_3
    new-instance p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$6;

    invoke-direct {p1, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$6;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;)V

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 115
    :cond_4
    new-instance p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$3;

    invoke-direct {p1, p0, v4, v5, v6}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$3;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;[I[F[F)V

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 139
    :cond_5
    invoke-virtual {p1, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    .line 140
    aget v0, v5, v7

    .line 141
    aget v1, v6, v7

    .line 143
    new-instance v3, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$5;

    invoke-direct {v3, p0, p1, v0, v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$5;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;IFF)V

    invoke-virtual {p0, v3}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 102
    :cond_6
    invoke-virtual {p1, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    .line 103
    aget v0, v5, v7

    .line 104
    aget v1, v6, v7

    .line 106
    new-instance v3, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$2;

    invoke-direct {v3, p0, p1, v0, v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$2;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;IFF)V

    invoke-virtual {p0, v3}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 163
    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v8

    .line 164
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    new-array v6, v2, [I

    new-array v7, v2, [F

    new-array v9, v2, [F

    .line 170
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-eqz p1, :cond_a

    if-eq p1, v2, :cond_9

    if-eq p1, v1, :cond_8

    goto :goto_1

    .line 195
    :cond_8
    new-instance p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;

    move-object v4, p1

    move-object v5, p0

    invoke-direct/range {v4 .. v10}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;[I[FF[FF)V

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 181
    :cond_9
    new-instance p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$8;

    invoke-direct {p1, p0, v8, v10}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$8;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;FF)V

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 172
    :cond_a
    new-instance p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$7;

    invoke-direct {p1, p0, v8, v10}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$7;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;FF)V

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V

    :goto_1
    return v2
.end method
