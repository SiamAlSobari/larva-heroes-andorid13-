.class public abstract Lcom/google/android/gms/internal/gtm/zzxf;
.super Lcom/google/android/gms/internal/gtm/zzxj;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzyv;


# instance fields
.field protected zza:Lcom/google/android/gms/internal/gtm/zzwy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzxj;-><init>()V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzwy;->zze()Lcom/google/android/gms/internal/gtm/zzwy;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxf;->zza:Lcom/google/android/gms/internal/gtm/zzwy;

    return-void
.end method

.method private final zzc(Lcom/google/android/gms/internal/gtm/zzxh;)V
    .locals 2

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/internal/gtm/zzxh;->zza:Lcom/google/android/gms/internal/gtm/zzyu;

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxj;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."

    .line 3
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method final zzT()Lcom/google/android/gms/internal/gtm/zzwy;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxf;->zza:Lcom/google/android/gms/internal/gtm/zzwy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzwy;->zzl()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxf;->zza:Lcom/google/android/gms/internal/gtm/zzwy;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzwy;->zzd()Lcom/google/android/gms/internal/gtm/zzwy;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxf;->zza:Lcom/google/android/gms/internal/gtm/zzwy;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxf;->zza:Lcom/google/android/gms/internal/gtm/zzwy;

    return-object v0
.end method

.method public final zzU(Lcom/google/android/gms/internal/gtm/zzwr;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/gtm/zzxh;

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gtm/zzxf;->zzc(Lcom/google/android/gms/internal/gtm/zzxh;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxf;->zza:Lcom/google/android/gms/internal/gtm/zzwy;

    .line 2
    iget-object v1, p1, Lcom/google/android/gms/internal/gtm/zzxh;->zzd:Lcom/google/android/gms/internal/gtm/zzxg;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gtm/zzwy;->zzf(Lcom/google/android/gms/internal/gtm/zzwx;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    iget-object p1, p1, Lcom/google/android/gms/internal/gtm/zzxh;->zzb:Ljava/lang/Object;

    return-object p1

    :cond_0
    iget-object v1, p1, Lcom/google/android/gms/internal/gtm/zzxh;->zzd:Lcom/google/android/gms/internal/gtm/zzxg;

    iget-boolean v2, v1, Lcom/google/android/gms/internal/gtm/zzxg;->zzd:Z

    if-eqz v2, :cond_2

    iget-object v1, v1, Lcom/google/android/gms/internal/gtm/zzxg;->zzc:Lcom/google/android/gms/internal/gtm/zzaao;

    .line 4
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzaao;->zza()Lcom/google/android/gms/internal/gtm/zzaap;

    move-result-object v1

    .line 5
    sget-object v2, Lcom/google/android/gms/internal/gtm/zzaap;->zzh:Lcom/google/android/gms/internal/gtm/zzaap;

    if-ne v1, v2, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    .line 6
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 8
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/gtm/zzxh;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_1

    .line 9
    :cond_2
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/gtm/zzxh;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_3
    :goto_1
    return-object v0
.end method

.method public final zzV(Lcom/google/android/gms/internal/gtm/zzwr;)Z
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/gtm/zzxh;

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gtm/zzxf;->zzc(Lcom/google/android/gms/internal/gtm/zzxh;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxf;->zza:Lcom/google/android/gms/internal/gtm/zzwy;

    .line 2
    iget-object p1, p1, Lcom/google/android/gms/internal/gtm/zzxh;->zzd:Lcom/google/android/gms/internal/gtm/zzxg;

    iget-boolean v1, p1, Lcom/google/android/gms/internal/gtm/zzxg;->zzd:Z

    if-nez v1, :cond_1

    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 4
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/gtm/zzzu;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 2
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "hasField() can only be called on non-repeated fields."

    .line 3
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
