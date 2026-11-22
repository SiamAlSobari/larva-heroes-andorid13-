.class Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$3;
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

.field final synthetic val$xs:[F

.field final synthetic val$ys:[F


# direct methods
.method constructor <init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;[I[F[F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 115
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$3;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;

    iput-object p2, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$3;->val$ids:[I

    iput-object p3, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$3;->val$xs:[F

    iput-object p4, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$3;->val$ys:[F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 118
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$3;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;

    iget-object v0, v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->mRenderer:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$3;->val$ids:[I

    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$3;->val$xs:[F

    iget-object v3, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$3;->val$ys:[F

    invoke-virtual {v0, v1, v2, v3}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->handleActionMove([I[F[F)V

    return-void
.end method
