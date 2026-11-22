.class public abstract Lcom/google/android/gms/internal/gtm/zztk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzyt;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/gtm/zztl<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/gtm/zztk<",
        "TMessageType;TBuilderType;>;>",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/gtm/zzyt;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zztk;->zzv()Lcom/google/android/gms/internal/gtm/zztk;

    move-result-object v0

    return-object v0
.end method

.method public abstract zzv()Lcom/google/android/gms/internal/gtm/zztk;
.end method

.method protected abstract zzw(Lcom/google/android/gms/internal/gtm/zztl;)Lcom/google/android/gms/internal/gtm/zztk;
.end method

.method public final bridge synthetic zzx(Lcom/google/android/gms/internal/gtm/zzyu;)Lcom/google/android/gms/internal/gtm/zzyt;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zztk;->zzax()Lcom/google/android/gms/internal/gtm/zzyu;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/google/android/gms/internal/gtm/zztl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/gtm/zztk;->zzw(Lcom/google/android/gms/internal/gtm/zztl;)Lcom/google/android/gms/internal/gtm/zztk;

    move-result-object p1

    return-object p1

    .line 1
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "mergeFrom(MessageLite) can only merge messages of the same type."

    .line 2
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic zzy(Lcom/google/android/gms/internal/gtm/zzuj;Lcom/google/android/gms/internal/gtm/zzwt;)Lcom/google/android/gms/internal/gtm/zzyt;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method
