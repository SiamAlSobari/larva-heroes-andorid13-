.class Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;
.super Ljava/lang/Object;
.source "GpTouchGLSurfaceView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->onTouchEvent(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;

.field final synthetic val$ids:[I

.field final synthetic val$x:F

.field final synthetic val$xs:[F

.field final synthetic val$y:F

.field final synthetic val$ys:[F


# direct methods
.method constructor <init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;[I[FF[FF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 195
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;

    iput-object p2, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->val$ids:[I

    iput-object p3, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->val$xs:[F

    iput p4, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->val$x:F

    iput-object p5, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->val$ys:[F

    iput p6, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->val$y:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 198
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->val$ids:[I

    const/4 v1, 0x0

    aput v1, v0, v1

    .line 199
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->val$xs:[F

    iget v2, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->val$x:F

    aput v2, v0, v1

    .line 200
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->val$ys:[F

    iget v2, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->val$y:F

    aput v2, v0, v1

    .line 201
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;

    iget-object v0, v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->mRenderer:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->val$ids:[I

    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->val$xs:[F

    iget-object v3, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$9;->val$ys:[F

    invoke-virtual {v0, v1, v2, v3}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->handleActionMove([I[F[F)V

    return-void
.end method
