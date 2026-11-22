.class public abstract Lcom/google/android/gms/internal/gtm/zztl;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzyu;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/gtm/zztl<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/gtm/zztk<",
        "TMessageType;TBuilderType;>;>",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/gtm/zzyu;"
    }
.end annotation


# instance fields
.field protected zzb:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/gtm/zztl;->zzb:I

    return-void
.end method


# virtual methods
.method zzQ(Lcom/google/android/gms/internal/gtm/zzzh;)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final zzR()Lcom/google/android/gms/internal/gtm/zzud;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zztl;->zzX()I

    move-result v0

    sget-object v1, Lcom/google/android/gms/internal/gtm/zzud;->zzb:Lcom/google/android/gms/internal/gtm/zzud;

    .line 2
    new-array v1, v0, [B

    .line 3
    new-instance v2, Lcom/google/android/gms/internal/gtm/zzum;

    const/4 v3, 0x0

    .line 4
    invoke-direct {v2, v1, v3, v0}, Lcom/google/android/gms/internal/gtm/zzum;-><init>([BII)V

    .line 5
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/gtm/zztl;->zzaw(Lcom/google/android/gms/internal/gtm/zzuq;)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/gtm/zzuq;->zzb()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/gtm/zzua;

    .line 6
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/gtm/zzua;-><init>([B)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Ljava/lang/RuntimeException;

    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Serializing "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to a ByteString threw an IOException (should never happen)."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final zzS(Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zztl;->zzX()I

    move-result v0

    sget v1, Lcom/google/android/gms/internal/gtm/zzuq;->zzf:I

    const/16 v1, 0x1000

    if-le v0, v1, :cond_0

    const/16 v0, 0x1000

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/gtm/zzuo;

    .line 2
    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/gtm/zzuo;-><init>(Ljava/io/OutputStream;I)V

    .line 3
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/gtm/zztl;->zzaw(Lcom/google/android/gms/internal/gtm/zzuq;)V

    .line 4
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzuq;->zzJ()V

    return-void
.end method
