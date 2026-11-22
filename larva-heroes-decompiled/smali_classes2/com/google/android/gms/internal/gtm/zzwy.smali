.class final Lcom/google/android/gms/internal/gtm/zzwy;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/gtm/zzwy;


# instance fields
.field final zza:Lcom/google/android/gms/internal/gtm/zzzu;

.field private zzc:Z

.field private zzd:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzwy;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/gtm/zzwy;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzwy;->zzb:Lcom/google/android/gms/internal/gtm/zzwy;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/gtm/zzzk;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/gtm/zzzk;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 2
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzzk;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/gtm/zzzk;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzwy;->zzi()V

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzwy;->zzi()V

    return-void
.end method

.method static zza(Lcom/google/android/gms/internal/gtm/zzaao;ILjava/lang/Object;)I
    .locals 4

    .line 1
    sget v0, Lcom/google/android/gms/internal/gtm/zzuq;->zzf:I

    shl-int/lit8 p1, p1, 0x3

    invoke-static {p1}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result p1

    .line 2
    sget-object v0, Lcom/google/android/gms/internal/gtm/zzaao;->zzj:Lcom/google/android/gms/internal/gtm/zzaao;

    if-ne p0, v0, :cond_1

    .line 3
    move-object v0, p2

    check-cast v0, Lcom/google/android/gms/internal/gtm/zzyu;

    sget-object v1, Lcom/google/android/gms/internal/gtm/zzxs;->zzd:[B

    instance-of v1, v0, Lcom/google/android/gms/internal/gtm/zztm;

    if-nez v1, :cond_0

    add-int/2addr p1, p1

    goto :goto_0

    .line 33
    :cond_0
    check-cast v0, Lcom/google/android/gms/internal/gtm/zztm;

    const/4 p0, 0x0

    .line 34
    throw p0

    .line 4
    :cond_1
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/gtm/zzaap;->zza:Lcom/google/android/gms/internal/gtm/zzaap;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzaao;->ordinal()I

    move-result p0

    const/4 v0, 0x4

    const/16 v1, 0x8

    packed-switch p0, :pswitch_data_0

    .line 31
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "There is no way to get here, but the compiler thinks otherwise."

    .line 32
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 7
    :pswitch_0
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-long v2, v0, v0

    const/16 p0, 0x3f

    shr-long/2addr v0, p0

    xor-long/2addr v0, v2

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/gtm/zzuq;->zzE(J)I

    move-result v0

    goto/16 :goto_3

    .line 8
    :pswitch_1
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p0

    add-int p2, p0, p0

    shr-int/lit8 p0, p0, 0x1f

    xor-int/2addr p0, p2

    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result v0

    goto/16 :goto_3

    .line 9
    :pswitch_2
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    goto/16 :goto_2

    .line 10
    :pswitch_3
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    goto/16 :goto_3

    .line 7
    :pswitch_4
    instance-of p0, p2, Lcom/google/android/gms/internal/gtm/zzxl;

    if-eqz p0, :cond_2

    .line 5
    check-cast p2, Lcom/google/android/gms/internal/gtm/zzxl;

    invoke-interface {p2}, Lcom/google/android/gms/internal/gtm/zzxl;->zza()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzuq;->zzz(I)I

    move-result v0

    goto/16 :goto_3

    .line 6
    :cond_2
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzuq;->zzz(I)I

    move-result v0

    goto/16 :goto_3

    .line 11
    :pswitch_5
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result v0

    goto/16 :goto_3

    .line 23
    :pswitch_6
    instance-of p0, p2, Lcom/google/android/gms/internal/gtm/zzud;

    if-eqz p0, :cond_3

    .line 12
    check-cast p2, Lcom/google/android/gms/internal/gtm/zzud;

    .line 13
    invoke-virtual {p2}, Lcom/google/android/gms/internal/gtm/zzud;->zzd()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result p2

    goto :goto_1

    .line 14
    :cond_3
    check-cast p2, [B

    .line 15
    array-length p0, p2

    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result p2

    goto :goto_1

    .line 18
    :pswitch_7
    instance-of p0, p2, Lcom/google/android/gms/internal/gtm/zzxz;

    if-eqz p0, :cond_4

    .line 19
    check-cast p2, Lcom/google/android/gms/internal/gtm/zzxz;

    .line 20
    invoke-virtual {p2}, Lcom/google/android/gms/internal/gtm/zzya;->zza()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result p2

    goto :goto_1

    .line 21
    :cond_4
    check-cast p2, Lcom/google/android/gms/internal/gtm/zzyu;

    invoke-static {p2}, Lcom/google/android/gms/internal/gtm/zzuq;->zzA(Lcom/google/android/gms/internal/gtm/zzyu;)I

    move-result v0

    goto :goto_3

    .line 22
    :pswitch_8
    check-cast p2, Lcom/google/android/gms/internal/gtm/zzyu;

    .line 23
    invoke-interface {p2}, Lcom/google/android/gms/internal/gtm/zzyu;->zzX()I

    move-result v0

    goto :goto_3

    .line 15
    :pswitch_9
    instance-of p0, p2, Lcom/google/android/gms/internal/gtm/zzud;

    if-eqz p0, :cond_5

    .line 16
    check-cast p2, Lcom/google/android/gms/internal/gtm/zzud;

    .line 17
    invoke-virtual {p2}, Lcom/google/android/gms/internal/gtm/zzud;->zzd()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result p2

    :goto_1
    add-int v0, p2, p0

    goto :goto_3

    .line 18
    :cond_5
    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Lcom/google/android/gms/internal/gtm/zzuq;->zzC(Ljava/lang/String;)I

    move-result v0

    goto :goto_3

    .line 24
    :pswitch_a
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    const/4 v0, 0x1

    goto :goto_3

    .line 25
    :pswitch_b
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    goto :goto_3

    .line 26
    :pswitch_c
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    goto :goto_2

    .line 27
    :pswitch_d
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzuq;->zzz(I)I

    move-result v0

    goto :goto_3

    .line 28
    :pswitch_e
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/gtm/zzuq;->zzE(J)I

    move-result v0

    goto :goto_3

    .line 29
    :pswitch_f
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/gtm/zzuq;->zzE(J)I

    move-result v0

    goto :goto_3

    .line 30
    :pswitch_10
    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    goto :goto_3

    .line 31
    :pswitch_11
    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    :goto_2
    const/16 v0, 0x8

    :goto_3
    add-int/2addr p1, v0

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static zzb(Lcom/google/android/gms/internal/gtm/zzwx;Ljava/lang/Object;)I
    .locals 3

    .line 1
    invoke-interface {p0}, Lcom/google/android/gms/internal/gtm/zzwx;->zzd()Lcom/google/android/gms/internal/gtm/zzaao;

    move-result-object v0

    .line 2
    invoke-interface {p0}, Lcom/google/android/gms/internal/gtm/zzwx;->zza()I

    move-result v1

    .line 3
    invoke-interface {p0}, Lcom/google/android/gms/internal/gtm/zzwx;->zzg()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 4
    check-cast p1, Ljava/util/List;

    .line 5
    invoke-interface {p0}, Lcom/google/android/gms/internal/gtm/zzwx;->zzf()Z

    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 7
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/gtm/zzwy;->zza(Lcom/google/android/gms/internal/gtm/zzaao;ILjava/lang/Object;)I

    move-result v2

    add-int/2addr p1, v2

    goto :goto_0

    :cond_0
    return p1

    .line 8
    :cond_1
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/gtm/zzwy;->zza(Lcom/google/android/gms/internal/gtm/zzaao;ILjava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static zze()Lcom/google/android/gms/internal/gtm/zzwy;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gtm/zzwy;->zzb:Lcom/google/android/gms/internal/gtm/zzwy;

    return-object v0
.end method

.method private static zzn(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    instance-of v0, p0, Lcom/google/android/gms/internal/gtm/zzyz;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/gtm/zzyz;

    invoke-interface {p0}, Lcom/google/android/gms/internal/gtm/zzyz;->zzc()Lcom/google/android/gms/internal/gtm/zzyz;

    move-result-object p0

    return-object p0

    .line 2
    :cond_0
    instance-of v0, p0, [B

    if-eqz v0, :cond_1

    .line 3
    check-cast p0, [B

    .line 4
    array-length v0, p0

    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 5
    invoke-static {p0, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1

    :cond_1
    return-object p0
.end method

.method private final zzo(Ljava/util/Map$Entry;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gtm/zzwx;

    .line 2
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lcom/google/android/gms/internal/gtm/zzxz;

    if-nez v1, :cond_6

    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/gtm/zzwx;->zzg()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gtm/zzwy;->zzf(Lcom/google/android/gms/internal/gtm/zzwx;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    :cond_0
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 7
    move-object v3, v1

    check-cast v3, Ljava/util/List;

    invoke-static {v2}, Lcom/google/android/gms/internal/gtm/zzwy;->zzn(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 8
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/gtm/zzzu;->zze(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 9
    :cond_2
    invoke-interface {v0}, Lcom/google/android/gms/internal/gtm/zzwx;->zze()Lcom/google/android/gms/internal/gtm/zzaap;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/gtm/zzaap;->zzi:Lcom/google/android/gms/internal/gtm/zzaap;

    if-ne v1, v2, :cond_5

    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gtm/zzwy;->zzf(Lcom/google/android/gms/internal/gtm/zzwx;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 11
    invoke-static {p1}, Lcom/google/android/gms/internal/gtm/zzwy;->zzn(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/gtm/zzzu;->zze(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_3
    instance-of v2, v1, Lcom/google/android/gms/internal/gtm/zzyz;

    if-eqz v2, :cond_4

    .line 12
    check-cast v1, Lcom/google/android/gms/internal/gtm/zzyz;

    check-cast p1, Lcom/google/android/gms/internal/gtm/zzyz;

    .line 13
    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/gtm/zzwx;->zzc(Lcom/google/android/gms/internal/gtm/zzyz;Lcom/google/android/gms/internal/gtm/zzyz;)Lcom/google/android/gms/internal/gtm/zzyz;

    move-result-object p1

    goto :goto_1

    .line 14
    :cond_4
    check-cast v1, Lcom/google/android/gms/internal/gtm/zzyu;

    .line 15
    invoke-interface {v1}, Lcom/google/android/gms/internal/gtm/zzyu;->zzav()Lcom/google/android/gms/internal/gtm/zzyt;

    move-result-object v1

    check-cast p1, Lcom/google/android/gms/internal/gtm/zzyu;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/gtm/zzwx;->zzb(Lcom/google/android/gms/internal/gtm/zzyt;Lcom/google/android/gms/internal/gtm/zzyu;)Lcom/google/android/gms/internal/gtm/zzyt;

    .line 16
    invoke-interface {v1}, Lcom/google/android/gms/internal/gtm/zzyt;->zzD()Lcom/google/android/gms/internal/gtm/zzyu;

    move-result-object p1

    .line 13
    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 17
    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/gtm/zzzu;->zze(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 20
    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 18
    invoke-static {p1}, Lcom/google/android/gms/internal/gtm/zzwy;->zzn(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/gtm/zzzu;->zze(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 19
    :cond_6
    check-cast p1, Lcom/google/android/gms/internal/gtm/zzxz;

    const/4 p1, 0x0

    .line 20
    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method private static zzp(Ljava/util/Map$Entry;)Z
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gtm/zzwx;

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/internal/gtm/zzwx;->zze()Lcom/google/android/gms/internal/gtm/zzaap;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/gtm/zzaap;->zzi:Lcom/google/android/gms/internal/gtm/zzaap;

    if-ne v1, v2, :cond_2

    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/gtm/zzwx;->zzg()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/android/gms/internal/gtm/zzwy;->zzq(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 6
    :cond_1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzwy;->zzq(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method private static zzq(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/google/android/gms/internal/gtm/zzyv;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/gtm/zzyv;

    invoke-interface {p0}, Lcom/google/android/gms/internal/gtm/zzyv;->zzay()Z

    move-result p0

    return p0

    :cond_0
    instance-of p0, p0, Lcom/google/android/gms/internal/gtm/zzxz;

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong object type used with protocol message reflection."

    .line 2
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final zzr(Ljava/util/Map$Entry;)I
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gtm/zzwx;

    .line 2
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/gtm/zzwx;->zze()Lcom/google/android/gms/internal/gtm/zzaap;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/gtm/zzaap;->zzi:Lcom/google/android/gms/internal/gtm/zzaap;

    if-ne v2, v3, :cond_1

    .line 4
    invoke-interface {v0}, Lcom/google/android/gms/internal/gtm/zzwx;->zzg()Z

    move-result v2

    if-nez v2, :cond_1

    .line 6
    invoke-interface {v0}, Lcom/google/android/gms/internal/gtm/zzwx;->zzf()Z

    instance-of v0, v1, Lcom/google/android/gms/internal/gtm/zzxz;

    const/16 v2, 0x8

    const/16 v3, 0x10

    const/16 v4, 0x18

    if-eqz v0, :cond_0

    .line 7
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/gtm/zzwx;

    invoke-interface {p0}, Lcom/google/android/gms/internal/gtm/zzwx;->zza()I

    move-result p0

    check-cast v1, Lcom/google/android/gms/internal/gtm/zzxz;

    .line 8
    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result p0

    .line 9
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzya;->zza()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result v1

    add-int/2addr v1, v0

    invoke-static {v4}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result v0

    invoke-static {v3}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result v3

    invoke-static {v2}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result v2

    add-int/2addr v2, v2

    add-int/2addr v3, p0

    add-int/2addr v2, v3

    add-int/2addr v0, v1

    add-int/2addr v2, v0

    return v2

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/gtm/zzwx;

    invoke-interface {p0}, Lcom/google/android/gms/internal/gtm/zzwx;->zza()I

    move-result p0

    check-cast v1, Lcom/google/android/gms/internal/gtm/zzyu;

    .line 11
    invoke-static {p0}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result p0

    .line 12
    invoke-static {v1}, Lcom/google/android/gms/internal/gtm/zzuq;->zzA(Lcom/google/android/gms/internal/gtm/zzyu;)I

    move-result v0

    invoke-static {v4}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result v1

    add-int/2addr v1, v0

    invoke-static {v3}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result v0

    invoke-static {v2}, Lcom/google/android/gms/internal/gtm/zzuq;->zzD(I)I

    move-result v2

    add-int/2addr v2, v2

    add-int/2addr v0, p0

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    return v2

    .line 5
    :cond_1
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/gtm/zzwy;->zzb(Lcom/google/android/gms/internal/gtm/zzwx;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private static final zzs(Lcom/google/android/gms/internal/gtm/zzwx;Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-interface {p0}, Lcom/google/android/gms/internal/gtm/zzwx;->zzd()Lcom/google/android/gms/internal/gtm/zzaao;

    move-result-object v0

    .line 2
    sget-object v1, Lcom/google/android/gms/internal/gtm/zzxs;->zzd:[B

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    sget-object v1, Lcom/google/android/gms/internal/gtm/zzaao;->zza:Lcom/google/android/gms/internal/gtm/zzaao;

    sget-object v1, Lcom/google/android/gms/internal/gtm/zzaap;->zza:Lcom/google/android/gms/internal/gtm/zzaap;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzaao;->zza()Lcom/google/android/gms/internal/gtm/zzaap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzaap;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    .line 4
    :pswitch_0
    instance-of v0, p1, Lcom/google/android/gms/internal/gtm/zzyu;

    if-nez v0, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/internal/gtm/zzxz;

    if-eqz v0, :cond_1

    goto :goto_1

    :pswitch_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/internal/gtm/zzxl;

    if-eqz v0, :cond_1

    goto :goto_1

    .line 6
    :pswitch_2
    instance-of v0, p1, Lcom/google/android/gms/internal/gtm/zzud;

    if-nez v0, :cond_0

    .line 5
    instance-of v0, p1, [B

    if-eqz v0, :cond_1

    goto :goto_1

    .line 6
    :pswitch_3
    instance-of v0, p1, Ljava/lang/String;

    goto :goto_0

    .line 7
    :pswitch_4
    instance-of v0, p1, Ljava/lang/Boolean;

    goto :goto_0

    .line 8
    :pswitch_5
    instance-of v0, p1, Ljava/lang/Double;

    goto :goto_0

    .line 9
    :pswitch_6
    instance-of v0, p1, Ljava/lang/Float;

    goto :goto_0

    .line 10
    :pswitch_7
    instance-of v0, p1, Ljava/lang/Long;

    goto :goto_0

    .line 11
    :pswitch_8
    instance-of v0, p1, Ljava/lang/Integer;

    :goto_0
    if-eqz v0, :cond_1

    :cond_0
    :goto_1
    return-void

    .line 3
    :cond_1
    :goto_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    .line 12
    invoke-interface {p0}, Lcom/google/android/gms/internal/gtm/zzwx;->zza()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 13
    invoke-interface {p0}, Lcom/google/android/gms/internal/gtm/zzwx;->zzd()Lcom/google/android/gms/internal/gtm/zzaao;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzaao;->zza()Lcom/google/android/gms/internal/gtm/zzaap;

    move-result-object p0

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x2

    aput-object p0, v1, p1

    const-string p0, "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"

    .line 15
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzwy;->zzd()Lcom/google/android/gms/internal/gtm/zzwy;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/gtm/zzwy;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/gtm/zzwy;

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 2
    iget-object p1, p1, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/gtm/zzzu;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzzu;->hashCode()I

    move-result v0

    return v0
.end method

.method public final zzc()I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/gtm/zzzu;->zzb()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 2
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/gtm/zzzu;->zzg(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/gtm/zzwy;->zzr(Ljava/util/Map$Entry;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzzu;->zzc()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 4
    invoke-static {v2}, Lcom/google/android/gms/internal/gtm/zzwy;->zzr(Ljava/util/Map$Entry;)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_1

    :cond_1
    return v1
.end method

.method public final zzd()Lcom/google/android/gms/internal/gtm/zzwy;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzwy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gtm/zzwy;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/gtm/zzzu;->zzb()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 3
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/gtm/zzzu;->zzg(I)Ljava/util/Map$Entry;

    move-result-object v2

    .line 4
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/gtm/zzwx;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/internal/gtm/zzwy;->zzk(Lcom/google/android/gms/internal/gtm/zzwx;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzzu;->zzc()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 6
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/gtm/zzwx;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/internal/gtm/zzwy;->zzk(Lcom/google/android/gms/internal/gtm/zzwx;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zzd:Z

    iput-boolean v1, v0, Lcom/google/android/gms/internal/gtm/zzwy;->zzd:Z

    return-object v0
.end method

.method public final zzf(Lcom/google/android/gms/internal/gtm/zzwx;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/gtm/zzzu;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/google/android/gms/internal/gtm/zzxz;

    if-nez v0, :cond_0

    return-object p1

    .line 2
    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/gtm/zzxz;

    const/4 p1, 0x0

    .line 3
    throw p1
.end method

.method public final zzg()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zzd:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/gtm/zzxy;

    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzzu;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/gtm/zzxy;-><init>(Ljava/util/Iterator;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzzu;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final zzh(Lcom/google/android/gms/internal/gtm/zzwx;Ljava/lang/Object;)V
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxg;

    .line 1
    iget-boolean v0, v0, Lcom/google/android/gms/internal/gtm/zzxg;->zzd:Z

    if-eqz v0, :cond_1

    .line 2
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/gtm/zzwy;->zzs(Lcom/google/android/gms/internal/gtm/zzwx;Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/gtm/zzwy;->zzf(Lcom/google/android/gms/internal/gtm/zzwx;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 5
    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/gtm/zzzu;->zze(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 6
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 7
    :goto_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 1
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "addRepeatedField() can only be called on repeated fields."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzi()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zzc:Z

    if-nez v0, :cond_2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzzu;->zzb()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 2
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/gtm/zzzu;->zzg(I)Ljava/util/Map$Entry;

    move-result-object v1

    .line 3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/google/android/gms/internal/gtm/zzxj;

    if-eqz v2, :cond_0

    .line 4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/gtm/zzxj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzxj;->zzal()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzzu;->zza()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zzc:Z

    :cond_2
    return-void
.end method

.method public final zzj(Lcom/google/android/gms/internal/gtm/zzwy;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzzu;->zzb()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p1, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/gtm/zzzu;->zzg(I)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/gtm/zzwy;->zzo(Ljava/util/Map$Entry;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p1, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzzu;->zzc()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 4
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/gtm/zzwy;->zzo(Ljava/util/Map$Entry;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final zzk(Lcom/google/android/gms/internal/gtm/zzwx;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lcom/google/android/gms/internal/gtm/zzwx;->zzg()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    check-cast p2, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 6
    invoke-static {p1, v2}, Lcom/google/android/gms/internal/gtm/zzwy;->zzs(Lcom/google/android/gms/internal/gtm/zzwx;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move-object p2, v0

    goto :goto_1

    .line 2
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong object type used with protocol message reflection."

    .line 3
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_2
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/gtm/zzwy;->zzs(Lcom/google/android/gms/internal/gtm/zzwx;Ljava/lang/Object;)V

    .line 6
    :goto_1
    instance-of v0, p2, Lcom/google/android/gms/internal/gtm/zzxz;

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zzd:Z

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 8
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/gtm/zzzu;->zze(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final zzl()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zzc:Z

    return v0
.end method

.method public final zzm()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/gtm/zzzu;->zzb()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 2
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/gtm/zzzu;->zzg(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/gtm/zzwy;->zzp(Ljava/util/Map$Entry;)Z

    move-result v2

    if-nez v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzwy;->zza:Lcom/google/android/gms/internal/gtm/zzzu;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzzu;->zzc()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 4
    invoke-static {v2}, Lcom/google/android/gms/internal/gtm/zzwy;->zzp(Ljava/util/Map$Entry;)Z

    move-result v2

    if-nez v2, :cond_2

    return v0

    :cond_3
    const/4 v0, 0x1

    return v0
.end method
