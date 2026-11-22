.class public abstract Lcom/google/android/gms/internal/gtm/zzxj;
.super Lcom/google/android/gms/internal/gtm/zztl;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/gtm/zzxj<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/gtm/zzxd<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/android/gms/internal/gtm/zztl<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# static fields
.field private static final zza:Ljava/util/Map;


# instance fields
.field protected zzc:Lcom/google/android/gms/internal/gtm/zzzz;

.field private zzd:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzxj;->zza:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zztl;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzd:I

    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzzz;->zzc()Lcom/google/android/gms/internal/gtm/zzzz;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzc:Lcom/google/android/gms/internal/gtm/zzzz;

    return-void
.end method

.method public static zzaa(Lcom/google/android/gms/internal/gtm/zzyu;Lcom/google/android/gms/internal/gtm/zzyu;Lcom/google/android/gms/internal/gtm/zzxm;ILcom/google/android/gms/internal/gtm/zzaao;ZLjava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzxh;
    .locals 9

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    new-instance p2, Lcom/google/android/gms/internal/gtm/zzxh;

    new-instance p5, Lcom/google/android/gms/internal/gtm/zzxg;

    const/4 v4, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v3, p5

    move v5, p3

    move-object v6, p4

    .line 2
    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/gtm/zzxg;-><init>(Lcom/google/android/gms/internal/gtm/zzxm;ILcom/google/android/gms/internal/gtm/zzaao;ZZ)V

    move-object v0, p2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/gtm/zzxh;-><init>(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/Object;Lcom/google/android/gms/internal/gtm/zzyu;Lcom/google/android/gms/internal/gtm/zzxg;Ljava/lang/Class;)V

    return-object p2
.end method

.method public static zzab(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/Object;Lcom/google/android/gms/internal/gtm/zzyu;Lcom/google/android/gms/internal/gtm/zzxm;ILcom/google/android/gms/internal/gtm/zzaao;Ljava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzxh;
    .locals 8

    .line 1
    new-instance v6, Lcom/google/android/gms/internal/gtm/zzxh;

    new-instance v7, Lcom/google/android/gms/internal/gtm/zzxg;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v7

    move-object v1, p3

    move v2, p4

    move-object v3, p5

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/gtm/zzxg;-><init>(Lcom/google/android/gms/internal/gtm/zzxm;ILcom/google/android/gms/internal/gtm/zzaao;ZZ)V

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, v7

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/gtm/zzxh;-><init>(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/Object;Lcom/google/android/gms/internal/gtm/zzyu;Lcom/google/android/gms/internal/gtm/zzxg;Ljava/lang/Class;)V

    return-object v6
.end method

.method static zzac(Ljava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzxj;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/gtm/zzxj;->zza:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/gtm/zzxj;

    if-nez v1, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/gtm/zzxj;

    goto :goto_0

    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    .line 3
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v1, :cond_2

    .line 5
    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzaai;->zze(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/gtm/zzxj;

    const/4 v2, 0x6

    const/4 v3, 0x0

    .line 6
    invoke-virtual {v1, v2, v3, v3}, Lcom/google/android/gms/internal/gtm/zzxj;->zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 7
    check-cast v1, Lcom/google/android/gms/internal/gtm/zzxj;

    if-eqz v1, :cond_1

    .line 9
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 7
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 8
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v1
.end method

.method protected static zzae(Lcom/google/android/gms/internal/gtm/zzxj;Ljava/io/InputStream;Lcom/google/android/gms/internal/gtm/zzwt;)Lcom/google/android/gms/internal/gtm/zzxj;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/gtm/zzxu;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzuh;

    const/16 v1, 0x1000

    const/4 v2, 0x0

    .line 2
    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/internal/gtm/zzuh;-><init>(Ljava/io/InputStream;ILcom/google/android/gms/internal/gtm/zzug;)V

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzad()Lcom/google/android/gms/internal/gtm/zzxj;

    move-result-object p0

    .line 4
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzzd;->zza()Lcom/google/android/gms/internal/gtm/zzzd;

    move-result-object p1

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/gtm/zzzd;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzzh;

    move-result-object p1

    .line 6
    invoke-static {v0}, Lcom/google/android/gms/internal/gtm/zzuk;->zzq(Lcom/google/android/gms/internal/gtm/zzuj;)Lcom/google/android/gms/internal/gtm/zzuk;

    move-result-object v0

    invoke-interface {p1, p0, v0, p2}, Lcom/google/android/gms/internal/gtm/zzzh;->zzh(Ljava/lang/Object;Lcom/google/android/gms/internal/gtm/zzzg;Lcom/google/android/gms/internal/gtm/zzwt;)V

    .line 7
    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/gtm/zzzh;->zzf(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/gtm/zzxu; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/android/gms/internal/gtm/zzzx; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzxj;->zze(Lcom/google/android/gms/internal/gtm/zzxj;)Lcom/google/android/gms/internal/gtm/zzxj;

    return-object p0

    :catch_0
    move-exception p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/google/android/gms/internal/gtm/zzxu;

    if-eqz p1, :cond_0

    .line 9
    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/gtm/zzxu;

    throw p0

    .line 10
    :cond_0
    throw p0

    :catch_1
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/google/android/gms/internal/gtm/zzxu;

    if-eqz p2, :cond_1

    .line 12
    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/gtm/zzxu;

    throw p0

    .line 10
    :cond_1
    new-instance p2, Lcom/google/android/gms/internal/gtm/zzxu;

    .line 13
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/gtm/zzxu;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/gtm/zzxu;->zzh(Lcom/google/android/gms/internal/gtm/zzyu;)Lcom/google/android/gms/internal/gtm/zzxu;

    throw p2

    :catch_2
    move-exception p1

    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzzx;->zza()Lcom/google/android/gms/internal/gtm/zzxu;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/gtm/zzxu;->zzh(Lcom/google/android/gms/internal/gtm/zzyu;)Lcom/google/android/gms/internal/gtm/zzxu;

    throw p1

    :catch_3
    move-exception p1

    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzxu;->zzl()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lcom/google/android/gms/internal/gtm/zzxu;

    .line 15
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/gtm/zzxu;-><init>(Ljava/io/IOException;)V

    move-object p1, p2

    .line 16
    :cond_2
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/gtm/zzxu;->zzh(Lcom/google/android/gms/internal/gtm/zzyu;)Lcom/google/android/gms/internal/gtm/zzxu;

    throw p1
.end method

.method protected static zzaf(Lcom/google/android/gms/internal/gtm/zzxj;[BLcom/google/android/gms/internal/gtm/zzwt;)Lcom/google/android/gms/internal/gtm/zzxj;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/gtm/zzxu;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    array-length v1, p1

    .line 2
    invoke-static {p0, p1, v0, v1, p2}, Lcom/google/android/gms/internal/gtm/zzxj;->zzf(Lcom/google/android/gms/internal/gtm/zzxj;[BIILcom/google/android/gms/internal/gtm/zzwt;)Lcom/google/android/gms/internal/gtm/zzxj;

    move-result-object p0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzxj;->zze(Lcom/google/android/gms/internal/gtm/zzxj;)Lcom/google/android/gms/internal/gtm/zzxj;

    return-object p0
.end method

.method protected static zzag()Lcom/google/android/gms/internal/gtm/zzxo;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzxk;->zzf()Lcom/google/android/gms/internal/gtm/zzxk;

    move-result-object v0

    return-object v0
.end method

.method protected static zzah()Lcom/google/android/gms/internal/gtm/zzxr;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzze;->zze()Lcom/google/android/gms/internal/gtm/zzze;

    move-result-object v0

    return-object v0
.end method

.method protected static zzai(Lcom/google/android/gms/internal/gtm/zzxr;)Lcom/google/android/gms/internal/gtm/zzxr;
    .locals 1

    .line 1
    invoke-interface {p0}, Lcom/google/android/gms/internal/gtm/zzxr;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    add-int/2addr v0, v0

    .line 2
    :goto_0
    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/gtm/zzxr;->zzd(I)Lcom/google/android/gms/internal/gtm/zzxr;

    move-result-object p0

    return-object p0
.end method

.method static varargs zzaj(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 2
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    .line 3
    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    .line 5
    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    .line 6
    check-cast p0, Ljava/lang/Error;

    throw p0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    .line 7
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 4
    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    .line 1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    .line 8
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method protected static zzak(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzzf;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/gtm/zzzf;-><init>(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method protected static zzan(Ljava/lang/Class;Lcom/google/android/gms/internal/gtm/zzxj;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzam()V

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzxj;->zza:Ljava/util/Map;

    .line 2
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected static final zzap(Lcom/google/android/gms/internal/gtm/zzxj;Z)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 2
    check-cast v2, Ljava/lang/Byte;

    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    if-ne v2, v0, :cond_0

    return v0

    :cond_0
    if-nez v2, :cond_1

    const/4 p0, 0x0

    return p0

    .line 3
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzzd;->zza()Lcom/google/android/gms/internal/gtm/zzzd;

    move-result-object v2

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/gtm/zzzd;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzzh;

    move-result-object v2

    .line 3
    invoke-interface {v2, p0}, Lcom/google/android/gms/internal/gtm/zzzh;->zzk(Ljava/lang/Object;)Z

    move-result v2

    if-eqz p1, :cond_3

    if-eq v0, v2, :cond_2

    move-object p1, v1

    goto :goto_0

    :cond_2
    move-object p1, p0

    :goto_0
    const/4 v0, 0x2

    .line 5
    invoke-virtual {p0, v0, p1, v1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v2
.end method

.method private final zzc(Lcom/google/android/gms/internal/gtm/zzzh;)I
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzzd;->zza()Lcom/google/android/gms/internal/gtm/zzzd;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 2
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/gtm/zzzd;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzzh;

    move-result-object p1

    .line 1
    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/gtm/zzzh;->zza(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method private static zze(Lcom/google/android/gms/internal/gtm/zzxj;)Lcom/google/android/gms/internal/gtm/zzxj;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/gtm/zzxu;
        }
    .end annotation

    if-eqz p0, :cond_1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzay()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzzx;

    .line 2
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/gtm/zzzx;-><init>(Lcom/google/android/gms/internal/gtm/zzyu;)V

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzzx;->zza()Lcom/google/android/gms/internal/gtm/zzxu;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gtm/zzxu;->zzh(Lcom/google/android/gms/internal/gtm/zzyu;)Lcom/google/android/gms/internal/gtm/zzxu;

    throw v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method private static zzf(Lcom/google/android/gms/internal/gtm/zzxj;[BIILcom/google/android/gms/internal/gtm/zzwt;)Lcom/google/android/gms/internal/gtm/zzxj;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/gtm/zzxu;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzad()Lcom/google/android/gms/internal/gtm/zzxj;

    move-result-object p0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzzd;->zza()Lcom/google/android/gms/internal/gtm/zzzd;

    move-result-object p2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/gtm/zzzd;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzzh;

    move-result-object p2

    const/4 v3, 0x0

    new-instance v5, Lcom/google/android/gms/internal/gtm/zztp;

    .line 4
    invoke-direct {v5, p4}, Lcom/google/android/gms/internal/gtm/zztp;-><init>(Lcom/google/android/gms/internal/gtm/zzwt;)V

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    move v4, p3

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/gtm/zzzh;->zzi(Ljava/lang/Object;[BIILcom/google/android/gms/internal/gtm/zztp;)V

    .line 5
    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/gtm/zzzh;->zzf(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/gtm/zzxu; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/android/gms/internal/gtm/zzzx; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 6
    :catch_0
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzxu;->zzj()Lcom/google/android/gms/internal/gtm/zzxu;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/gtm/zzxu;->zzh(Lcom/google/android/gms/internal/gtm/zzyu;)Lcom/google/android/gms/internal/gtm/zzxu;

    throw p1

    :catch_1
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/google/android/gms/internal/gtm/zzxu;

    if-eqz p2, :cond_0

    .line 8
    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/gtm/zzxu;

    throw p0

    .line 6
    :cond_0
    new-instance p2, Lcom/google/android/gms/internal/gtm/zzxu;

    .line 9
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/gtm/zzxu;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/gtm/zzxu;->zzh(Lcom/google/android/gms/internal/gtm/zzyu;)Lcom/google/android/gms/internal/gtm/zzxu;

    throw p2

    :catch_2
    move-exception p1

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzzx;->zza()Lcom/google/android/gms/internal/gtm/zzxu;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/gtm/zzxu;->zzh(Lcom/google/android/gms/internal/gtm/zzyu;)Lcom/google/android/gms/internal/gtm/zzxu;

    throw p1

    :catch_3
    move-exception p1

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzxu;->zzl()Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Lcom/google/android/gms/internal/gtm/zzxu;

    .line 11
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/gtm/zzxu;-><init>(Ljava/io/IOException;)V

    move-object p1, p2

    .line 12
    :cond_1
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/gtm/zzxu;->zzh(Lcom/google/android/gms/internal/gtm/zzyu;)Lcom/google/android/gms/internal/gtm/zzxu;

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    .line 1
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzzd;->zza()Lcom/google/android/gms/internal/gtm/zzzd;

    move-result-object v1

    .line 2
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/gtm/zzzd;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzzh;

    move-result-object v0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/gtm/zzxj;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/gtm/zzzh;->zzj(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzaq()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzb:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzW()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzb:I

    :cond_0
    return v0

    .line 2
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzW()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/gtm/zzyw;->zza(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final zzQ(Lcom/google/android/gms/internal/gtm/zzzh;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzaq()Z

    move-result v0

    const-string v1, "serialized size must be non-negative, was "

    if-eqz v0, :cond_1

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/gtm/zzzh;->zza(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    .line 2
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzd:I

    const v2, 0x7fffffff

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_3

    .line 3
    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/gtm/zzzh;->zza(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_2

    .line 4
    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzd:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    or-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzd:I

    return p1

    .line 3
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    .line 4
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    return v0
.end method

.method final zzW()I
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzzd;->zza()Lcom/google/android/gms/internal/gtm/zzzd;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gtm/zzzd;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzzh;

    move-result-object v0

    .line 1
    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/gtm/zzzh;->zzb(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zzX()I
    .locals 4

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzaq()Z

    move-result v0

    const-string v1, "serialized size must be non-negative, was "

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/gtm/zzxj;->zzc(Lcom/google/android/gms/internal/gtm/zzzh;)I

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    .line 4
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzd:I

    const v3, 0x7fffffff

    and-int/2addr v0, v3

    if-eq v0, v3, :cond_2

    goto :goto_0

    .line 1
    :cond_2
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/gtm/zzxj;->zzc(Lcom/google/android/gms/internal/gtm/zzzh;)I

    move-result v0

    if-ltz v0, :cond_3

    .line 2
    iget v1, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzd:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    or-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzd:I

    :goto_0
    return v0

    .line 1
    :cond_3
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    .line 2
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method protected final zzY()Lcom/google/android/gms/internal/gtm/zzxd;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxd;

    return-object v0
.end method

.method public final zzZ()Lcom/google/android/gms/internal/gtm/zzxd;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxd;

    .line 3
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gtm/zzxd;->zzA(Lcom/google/android/gms/internal/gtm/zzxj;)Lcom/google/android/gms/internal/gtm/zzxd;

    return-object v0
.end method

.method final zzad()Lcom/google/android/gms/internal/gtm/zzxj;
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxj;

    return-object v0
.end method

.method protected final zzal()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzzd;->zza()Lcom/google/android/gms/internal/gtm/zzzd;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gtm/zzzd;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzzh;

    move-result-object v0

    .line 1
    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/gtm/zzzh;->zzf(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzam()V

    return-void
.end method

.method final zzam()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzd:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzd:I

    return-void
.end method

.method final zzao(I)V
    .locals 1

    iget p1, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzd:I

    const/high16 v0, -0x80000000

    and-int/2addr p1, v0

    const v0, 0x7fffffff

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzd:I

    return-void
.end method

.method final zzaq()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzxj;->zzd:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic zzau()Lcom/google/android/gms/internal/gtm/zzyt;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxd;

    return-object v0
.end method

.method public final synthetic zzav()Lcom/google/android/gms/internal/gtm/zzyt;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxd;

    .line 3
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gtm/zzxd;->zzA(Lcom/google/android/gms/internal/gtm/zzxj;)Lcom/google/android/gms/internal/gtm/zzxd;

    return-object v0
.end method

.method public final zzaw(Lcom/google/android/gms/internal/gtm/zzuq;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzzd;->zza()Lcom/google/android/gms/internal/gtm/zzzd;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gtm/zzzd;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/gtm/zzzh;

    move-result-object v0

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/gtm/zzur;->zza(Lcom/google/android/gms/internal/gtm/zzuq;)Lcom/google/android/gms/internal/gtm/zzur;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/gtm/zzzh;->zzm(Ljava/lang/Object;Lcom/google/android/gms/internal/gtm/zzur;)V

    return-void
.end method

.method public final synthetic zzax()Lcom/google/android/gms/internal/gtm/zzyu;
    .locals 2

    const/4 v0, 0x6

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxj;

    return-object v0
.end method

.method public final zzay()Z
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzap(Lcom/google/android/gms/internal/gtm/zzxj;Z)Z

    move-result v0

    return v0
.end method

.method protected abstract zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method
