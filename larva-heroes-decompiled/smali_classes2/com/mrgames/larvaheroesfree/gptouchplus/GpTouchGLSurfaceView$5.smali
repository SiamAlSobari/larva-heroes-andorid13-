.class Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$5;
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

.field final synthetic val$idUp:I

.field final synthetic val$xUp:F

.field final synthetic val$yUp:F


# direct methods
.method constructor <init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;IFF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 143
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$5;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;

    iput p2, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$5;->val$idUp:I

    iput p3, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$5;->val$xUp:F

    iput p4, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$5;->val$yUp:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 146
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$5;->this$0:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;

    iget-object v0, v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;->mRenderer:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;

    iget v1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$5;->val$idUp:I

    iget v2, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$5;->val$xUp:F

    iget v3, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView$5;->val$yUp:F

    invoke-virtual {v0, v1, v2, v3}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->handleActionUp(IFF)V

    return-void
.end method
