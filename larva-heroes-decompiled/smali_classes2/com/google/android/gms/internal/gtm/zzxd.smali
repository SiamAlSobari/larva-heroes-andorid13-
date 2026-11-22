.class public Lcom/google/android/gms/internal/gtm/zzxd;
.super Lcom/google/android/gms/internal/gtm/zztk;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/gtm/zzxj<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/gtm/zzxd<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/android/gms/internal/gtm/zztk<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field protected zza:Lcom/google/android/gms/internal/gtm/zzxj;

.field private final zzb:Lcom/google/android/gms/internal/gtm/zzxj;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/gtm/zzxj;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zztk;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zzb:Lcom/google/android/gms/internal/gtm/zzxj;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzaq()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzad()Lcom/google/android/gms/internal/gtm/zzxj;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    return-void

    .line 1
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    .line 3
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static zza(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzzd;->zza()Lcom/google/android/gms/internal/gtm/zzzd;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gtm/zzzd;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzzh;

    move-result-object v0

    .line 1
    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/gtm/zzzh;->zzg(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxd;->zzz()Lcom/google/android/gms/internal/gtm/zzxd;

    move-result-object v0

    return-object v0
.end method

.method public final zzA(Lcom/google/android/gms/internal/gtm/zzxj;)Lcom/google/android/gms/internal/gtm/zzxd;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zzb:Lcom/google/android/gms/internal/gtm/zzxj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/gtm/zzxj;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzaq()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxd;->zzH()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    .line 4
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/gtm/zzxd;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public final zzB()Lcom/google/android/gms/internal/gtm/zzxj;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxd;->zzC()Lcom/google/android/gms/internal/gtm/zzxj;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzay()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/gtm/zzzx;

    .line 3
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/gtm/zzzx;-><init>(Lcom/google/android/gms/internal/gtm/zzyu;)V

    .line 4
    throw v1
.end method

.method public zzC()Lcom/google/android/gms/internal/gtm/zzxj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzaq()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzal()V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    return-object v0
.end method

.method public bridge synthetic zzD()Lcom/google/android/gms/internal/gtm/zzyu;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxd;->zzB()Lcom/google/android/gms/internal/gtm/zzxj;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic zzE()Lcom/google/android/gms/internal/gtm/zzyu;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxd;->zzC()Lcom/google/android/gms/internal/gtm/zzxj;

    move-result-object v0

    return-object v0
.end method

.method protected final zzG()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzaq()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxd;->zzH()V

    :cond_0
    return-void
.end method

.method protected zzH()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zzb:Lcom/google/android/gms/internal/gtm/zzxj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzad()Lcom/google/android/gms/internal/gtm/zzxj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/gtm/zzxd;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    return-void
.end method

.method public final synthetic zzax()Lcom/google/android/gms/internal/gtm/zzyu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zzb:Lcom/google/android/gms/internal/gtm/zzxj;

    return-object v0
.end method

.method public final zzay()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzap(Lcom/google/android/gms/internal/gtm/zzxj;Z)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic zzv()Lcom/google/android/gms/internal/gtm/zztk;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxd;->zzz()Lcom/google/android/gms/internal/gtm/zzxd;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic zzw(Lcom/google/android/gms/internal/gtm/zztl;)Lcom/google/android/gms/internal/gtm/zztk;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/gtm/zzxj;

    .line 2
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/gtm/zzxd;->zzA(Lcom/google/android/gms/internal/gtm/zzxj;)Lcom/google/android/gms/internal/gtm/zzxd;

    return-object p0
.end method

.method public final bridge synthetic zzy(Lcom/google/android/gms/internal/gtm/zzuj;Lcom/google/android/gms/internal/gtm/zzwt;)Lcom/google/android/gms/internal/gtm/zzyt;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzaq()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxd;->zzH()V

    .line 3
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzzd;->zza()Lcom/google/android/gms/internal/gtm/zzzd;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gtm/zzzd;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzzh;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    .line 5
    invoke-static {p1}, Lcom/google/android/gms/internal/gtm/zzuk;->zzq(Lcom/google/android/gms/internal/gtm/zzuj;)Lcom/google/android/gms/internal/gtm/zzuk;

    move-result-object p1

    .line 3
    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/internal/gtm/zzzh;->zzh(Ljava/lang/Object;Lcom/google/android/gms/internal/gtm/zzzg;Lcom/google/android/gms/internal/gtm/zzwt;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/io/IOException;

    if-eqz p2, :cond_1

    .line 7
    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/io/IOException;

    throw p1

    .line 8
    :cond_1
    throw p1
.end method

.method public final zzz()Lcom/google/android/gms/internal/gtm/zzxd;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxd;->zzb:Lcom/google/android/gms/internal/gtm/zzxj;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/gtm/zzxj;->zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxd;

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxd;->zzC()Lcom/google/android/gms/internal/gtm/zzxj;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/gtm/zzxd;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    return-object v0
.end method
