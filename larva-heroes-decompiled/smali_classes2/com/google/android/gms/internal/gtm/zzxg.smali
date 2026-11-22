.class final Lcom/google/android/gms/internal/gtm/zzxg;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzwx;


# instance fields
.field final zza:Lcom/google/android/gms/internal/gtm/zzxm;

.field final zzb:I

.field final zzc:Lcom/google/android/gms/internal/gtm/zzaao;

.field final zzd:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gtm/zzxm;ILcom/google/android/gms/internal/gtm/zzaao;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzxg;->zza:Lcom/google/android/gms/internal/gtm/zzxm;

    iput p2, p0, Lcom/google/android/gms/internal/gtm/zzxg;->zzb:I

    iput-object p3, p0, Lcom/google/android/gms/internal/gtm/zzxg;->zzc:Lcom/google/android/gms/internal/gtm/zzaao;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/gtm/zzxg;->zzd:Z

    return-void
.end method


# virtual methods
.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/gtm/zzxg;

    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzxg;->zzb:I

    .line 2
    iget p1, p1, Lcom/google/android/gms/internal/gtm/zzxg;->zzb:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzxg;->zzb:I

    return v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/gtm/zzyt;Lcom/google/android/gms/internal/gtm/zzyu;)Lcom/google/android/gms/internal/gtm/zzyt;
    .locals 1

    .line 1
    check-cast p2, Lcom/google/android/gms/internal/gtm/zzxj;

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxd;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/gtm/zzxd;->zzA(Lcom/google/android/gms/internal/gtm/zzxj;)Lcom/google/android/gms/internal/gtm/zzxd;

    return-object p1
.end method

.method public final zzc(Lcom/google/android/gms/internal/gtm/zzyz;Lcom/google/android/gms/internal/gtm/zzyz;)Lcom/google/android/gms/internal/gtm/zzyz;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final zzd()Lcom/google/android/gms/internal/gtm/zzaao;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxg;->zzc:Lcom/google/android/gms/internal/gtm/zzaao;

    return-object v0
.end method

.method public final zze()Lcom/google/android/gms/internal/gtm/zzaap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxg;->zzc:Lcom/google/android/gms/internal/gtm/zzaao;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzaao;->zza()Lcom/google/android/gms/internal/gtm/zzaap;

    move-result-object v0

    return-object v0
.end method

.method public final zzf()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final zzg()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzxg;->zzd:Z

    return v0
.end method
