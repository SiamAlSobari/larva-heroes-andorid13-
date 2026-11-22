.class final Lcom/google/android/gms/internal/gtm/zzaas;
.super Lcom/google/android/gms/internal/gtm/zzwt;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/gtm/zzwt;-><init>(Z)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/gtm/zzaaq;)V
    .locals 0

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gtm/zzwt;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/internal/gtm/zzyu;I)Lcom/google/android/gms/internal/gtm/zzxh;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "com.google.android.gms.internal.gtm.zzwl"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_1

    :sswitch_1
    const-string v0, "com.google.android.gms.internal.gtm.zzwj"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_2
    const-string v0, "com.google.android.gms.internal.gtm.zzvn"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :sswitch_3
    const-string v0, "com.google.android.gms.internal.gtm.zzam"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, -0x1

    :goto_1
    const/4 v0, 0x0

    if-eqz p1, :cond_6

    if-eq p1, v3, :cond_5

    if-eq p1, v2, :cond_4

    if-eq p1, v1, :cond_1

    return-object v0

    :cond_1
    const/16 p1, 0x65

    if-eq p2, p1, :cond_3

    const p1, 0x2d4c0bd

    if-eq p2, p1, :cond_2

    return-object v0

    .line 2
    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/gtm/zze;->zza:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 3
    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzag;->zza:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    :cond_4
    sparse-switch p2, :sswitch_data_1

    return-object v0

    .line 4
    :sswitch_4
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabn;->zzm:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 5
    :sswitch_5
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabn;->zzl:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 6
    :sswitch_6
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zzn:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 7
    :sswitch_7
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zzm:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    :cond_5
    sparse-switch p2, :sswitch_data_2

    return-object v0

    .line 8
    :sswitch_8
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabn;->zzi:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 9
    :sswitch_9
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabn;->zzk:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 10
    :sswitch_a
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabn;->zzj:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 11
    :sswitch_b
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabn;->zzh:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 12
    :sswitch_c
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabn;->zzg:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 13
    :sswitch_d
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zzl:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 14
    :sswitch_e
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zzh:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 15
    :sswitch_f
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zzi:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 16
    :sswitch_10
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zzj:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 17
    :sswitch_11
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zzk:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    :cond_6
    sparse-switch p2, :sswitch_data_3

    return-object v0

    .line 18
    :sswitch_12
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabn;->zzc:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 19
    :sswitch_13
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zzg:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 20
    :sswitch_14
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zzf:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 21
    :sswitch_15
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabn;->zzb:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 22
    :sswitch_16
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabn;->zzf:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 23
    :sswitch_17
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabn;->zze:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 24
    :sswitch_18
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabn;->zzd:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 25
    :sswitch_19
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabn;->zza:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 26
    :sswitch_1a
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zze:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 27
    :sswitch_1b
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zzc:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 28
    :sswitch_1c
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zza:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 29
    :sswitch_1d
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zzb:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    .line 30
    :sswitch_1e
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzabv;->zzd:Lcom/google/android/gms/internal/gtm/zzxh;

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4f2c46bd -> :sswitch_3
        -0x4f2c4431 -> :sswitch_2
        -0x4f2c4416 -> :sswitch_1
        -0x4f2c4414 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x14988a0 -> :sswitch_7
        0x1ba68d3 -> :sswitch_6
        0x2994d08 -> :sswitch_5
        0x44006fa -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x1478fa8 -> :sswitch_11
        0x14988a0 -> :sswitch_10
        0x149f2b5 -> :sswitch_f
        0x14b532c -> :sswitch_e
        0x196b0b2 -> :sswitch_d
        0x273e3ca -> :sswitch_c
        0x27a055f -> :sswitch_b
        0x27cf7ff -> :sswitch_a
        0x27f7ee3 -> :sswitch_9
        0x426ba71 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x14988a0 -> :sswitch_1e
        0x149f2b5 -> :sswitch_1d
        0x14b532c -> :sswitch_1c
        0x165f72e -> :sswitch_1b
        0x196b0b2 -> :sswitch_1a
        0x2638204 -> :sswitch_19
        0x263c784 -> :sswitch_18
        0x265bb7b -> :sswitch_17
        0x265c484 -> :sswitch_16
        0x2667c90 -> :sswitch_15
        0x3335d57 -> :sswitch_14
        0x363ca4f -> :sswitch_13
        0x426ba71 -> :sswitch_12
    .end sparse-switch
.end method
