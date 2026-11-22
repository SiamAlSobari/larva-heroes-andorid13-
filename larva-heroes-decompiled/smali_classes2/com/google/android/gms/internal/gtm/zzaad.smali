.class public final Lcom/google/android/gms/internal/gtm/zzaad;
.super Ljava/util/AbstractList;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lcom/google/android/gms/internal/gtm/zzyc;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final zza:Lcom/google/android/gms/internal/gtm/zzyc;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/gtm/zzyc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzaad;->zza:Lcom/google/android/gms/internal/gtm/zzyc;

    return-void
.end method

.method static bridge synthetic zza(Lcom/google/android/gms/internal/gtm/zzaad;)Lcom/google/android/gms/internal/gtm/zzyc;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/gtm/zzaad;->zza:Lcom/google/android/gms/internal/gtm/zzyc;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzaad;->zza:Lcom/google/android/gms/internal/gtm/zzyc;

    check-cast v0, Lcom/google/android/gms/internal/gtm/zzyb;

    .line 1
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/gtm/zzyb;->zzg(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzaac;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/gtm/zzaac;-><init>(Lcom/google/android/gms/internal/gtm/zzaad;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzaab;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/gtm/zzaab;-><init>(Lcom/google/android/gms/internal/gtm/zzaad;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzaad;->zza:Lcom/google/android/gms/internal/gtm/zzyc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/gtm/zzyc;->size()I

    move-result v0

    return v0
.end method

.method public final zze()Lcom/google/android/gms/internal/gtm/zzyc;
    .locals 0

    return-object p0
.end method

.method public final zzf(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzaad;->zza:Lcom/google/android/gms/internal/gtm/zzyc;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/gtm/zzyc;->zzf(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzaad;->zza:Lcom/google/android/gms/internal/gtm/zzyc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/gtm/zzyc;->zzh()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final zzi(Lcom/google/android/gms/internal/gtm/zzud;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
