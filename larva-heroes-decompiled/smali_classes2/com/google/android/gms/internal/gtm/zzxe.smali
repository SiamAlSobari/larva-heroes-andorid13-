.class public Lcom/google/android/gms/internal/gtm/zzxe;
.super Lcom/google/android/gms/internal/gtm/zzxd;
.source "com.google.android.gms:play-services-analytics-impl@@18.0.3"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzyv;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/gtm/zzxf;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gtm/zzxd;-><init>(Lcom/google/android/gms/internal/gtm/zzxj;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzC()Lcom/google/android/gms/internal/gtm/zzxj;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxe;->zzJ()Lcom/google/android/gms/internal/gtm/zzxf;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzE()Lcom/google/android/gms/internal/gtm/zzyu;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzxe;->zzJ()Lcom/google/android/gms/internal/gtm/zzxf;

    move-result-object v0

    return-object v0
.end method

.method protected final zzH()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/internal/gtm/zzxd;->zzH()V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxe;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxf;

    iget-object v0, v0, Lcom/google/android/gms/internal/gtm/zzxf;->zza:Lcom/google/android/gms/internal/gtm/zzwy;

    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzwy;->zze()Lcom/google/android/gms/internal/gtm/zzwy;

    move-result-object v1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxe;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    .line 3
    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxf;

    iget-object v1, v0, Lcom/google/android/gms/internal/gtm/zzxf;->zza:Lcom/google/android/gms/internal/gtm/zzwy;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzwy;->zzd()Lcom/google/android/gms/internal/gtm/zzwy;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/gtm/zzxf;->zza:Lcom/google/android/gms/internal/gtm/zzwy;

    :cond_0
    return-void
.end method

.method public final zzJ()Lcom/google/android/gms/internal/gtm/zzxf;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxe;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzxj;->zzaq()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxe;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxf;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzxe;->zza:Lcom/google/android/gms/internal/gtm/zzxj;

    .line 3
    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxf;

    iget-object v0, v0, Lcom/google/android/gms/internal/gtm/zzxf;->zza:Lcom/google/android/gms/internal/gtm/zzwy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzwy;->zzi()V

    .line 4
    invoke-super {p0}, Lcom/google/android/gms/internal/gtm/zzxd;->zzC()Lcom/google/android/gms/internal/gtm/zzxj;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gtm/zzxf;

    return-object v0
.end method
