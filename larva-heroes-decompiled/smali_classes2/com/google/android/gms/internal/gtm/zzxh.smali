.class public final Lcom/google/android/gms/internal/gtm/zzxh;
.super Lcom/google/android/gms/internal/gtm/zzwr;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"


# instance fields
.field final zza:Lcom/google/android/gms/internal/gtm/zzyu;

.field final zzb:Ljava/lang/Object;

.field final zzc:Lcom/google/android/gms/internal/gtm/zzyu;

.field final zzd:Lcom/google/android/gms/internal/gtm/zzxg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gtm/zzyu;Ljava/lang/Object;Lcom/google/android/gms/internal/gtm/zzyu;Lcom/google/android/gms/internal/gtm/zzxg;Ljava/lang/Class;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzwr;-><init>()V

    if-eqz p1, :cond_2

    iget-object p5, p4, Lcom/google/android/gms/internal/gtm/zzxg;->zzc:Lcom/google/android/gms/internal/gtm/zzaao;

    .line 2
    sget-object v0, Lcom/google/android/gms/internal/gtm/zzaao;->zzk:Lcom/google/android/gms/internal/gtm/zzaao;

    if-ne p5, v0, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null messageDefaultInstance"

    .line 3
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzxh;->zza:Lcom/google/android/gms/internal/gtm/zzyu;

    iput-object p2, p0, Lcom/google/android/gms/internal/gtm/zzxh;->zzb:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/gtm/zzxh;->zzc:Lcom/google/android/gms/internal/gtm/zzyu;

    iput-object p4, p0, Lcom/google/android/gms/internal/gtm/zzxh;->zzd:Lcom/google/android/gms/internal/gtm/zzxg;

    return-void

    .line 1
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null containingTypeDefaultInstance"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxh;->zzd:Lcom/google/android/gms/internal/gtm/zzxg;

    iget-object v0, v0, Lcom/google/android/gms/internal/gtm/zzxg;->zzc:Lcom/google/android/gms/internal/gtm/zzaao;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzaao;->zza()Lcom/google/android/gms/internal/gtm/zzaap;

    move-result-object v0

    .line 2
    sget-object v1, Lcom/google/android/gms/internal/gtm/zzaap;->zzh:Lcom/google/android/gms/internal/gtm/zzaap;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxh;->zzd:Lcom/google/android/gms/internal/gtm/zzxg;

    iget-object v0, v0, Lcom/google/android/gms/internal/gtm/zzxg;->zza:Lcom/google/android/gms/internal/gtm/zzxm;

    .line 3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/gtm/zzxm;->zza(I)Lcom/google/android/gms/internal/gtm/zzxl;

    move-result-object p1

    :cond_0
    return-object p1
.end method
