.class public Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;
.super Ljava/lang/Object;
.source "GpTouchRenderer.java"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# static fields
.field public static mRenderer:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;

.field public static sNativeInitDone:Z


# instance fields
.field public bfirstNativeInit:Z

.field private mGL:Ljavax/microedition/khronos/opengles/GL10;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->mGL:Ljavax/microedition/khronos/opengles/GL10;

    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->bfirstNativeInit:Z

    .line 36
    sput-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->mRenderer:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;

    return-void
.end method

.method public static setAnimationInterval(D)V
    .locals 0

    return-void
.end method


# virtual methods
.method public handleActionCancel([I[F[F)V
    .locals 0

    return-void
.end method

.method public handleActionDown(IFF)V
    .locals 1

    .line 62
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->sNativeInitDone:Z

    if-eqz v0, :cond_0

    invoke-static {p1, p2, p3}, Lcom/mrgames/larvaheroesfree/Natives;->nativeTouchesBegin(IFF)V

    :cond_0
    return-void
.end method

.method public handleActionMove([I[F[F)V
    .locals 1

    .line 83
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->sNativeInitDone:Z

    if-eqz v0, :cond_0

    invoke-static {p1, p2, p3}, Lcom/mrgames/larvaheroesfree/Natives;->nativeTouchesMove([I[F[F)V

    :cond_0
    return-void
.end method

.method public handleActionUp(IFF)V
    .locals 1

    .line 67
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->sNativeInitDone:Z

    if-eqz v0, :cond_0

    invoke-static {p1, p2, p3}, Lcom/mrgames/larvaheroesfree/Natives;->nativeTouchesEnd(IFF)V

    :cond_0
    return-void
.end method

.method public handleAtcionClear(IFF)V
    .locals 1

    .line 72
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->sNativeInitDone:Z

    if-eqz v0, :cond_0

    invoke-static {p1, p2, p3}, Lcom/mrgames/larvaheroesfree/Natives;->nativeTouchesClear(IFF)V

    :cond_0
    return-void
.end method

.method public handlePurchaseState(II)V
    .locals 0

    .line 88
    invoke-static {p1, p2}, Lcom/mrgames/larvaheroesfree/Natives;->nativePurchaseState(II)V

    return-void
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 1

    .line 56
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->sNativeInitDone:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/mrgames/larvaheroesfree/Natives;->nativeRender()V

    :cond_0
    return-void
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 0

    .line 45
    iget-boolean p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->bfirstNativeInit:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->bfirstNativeInit:Z

    .line 48
    invoke-static {p2, p3}, Lcom/mrgames/larvaheroesfree/Natives;->nativeInit(II)V

    sput-boolean p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->sNativeInitDone:Z

    .line 49
    sput p2, Lcom/mrgames/larvaheroesfree/Natives;->screenWidth:I

    .line 50
    sput p3, Lcom/mrgames/larvaheroesfree/Natives;->screenHeight:I

    :cond_0
    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 0

    return-void
.end method
