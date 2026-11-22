package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajf implements zzakb {
    private final zzaio zza;
    private final zzfa zzb = new zzfa(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfi zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzajf(zzaio zzaioVar) {
        this.zza = zzaioVar;
    }

    private final void zzd(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zze(zzfb zzfbVar, byte[] bArr, int i) {
        int iMin = Math.min(zzfbVar.zza(), i - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzfbVar.zzH(iMin);
        } else {
            zzfbVar.zzC(bArr, this.zzd, iMin);
        }
        int i2 = this.zzd + iMin;
        this.zzd = i2;
        return i2 == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zza(zzfb zzfbVar, int i) throws zzcd {
        int i2;
        long jZzb;
        zzdy.zzb(this.zze);
        int i3 = -1;
        int i4 = 2;
        ?? r6 = 0;
        int i5 = 1;
        if ((i & 1) != 0) {
            int i6 = this.zzc;
            if (i6 != 0 && i6 != 1) {
                if (i6 != 2) {
                    int i7 = this.zzj;
                    if (i7 != -1) {
                        zzes.zzf("PesReader", "Unexpected start indicator: expected " + i7 + " more bytes");
                    }
                    this.zza.zzc(zzfbVar.zzd() == 0);
                } else {
                    zzes.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i8 = i;
        while (zzfbVar.zza() > 0) {
            int i9 = this.zzc;
            if (i9 == 0) {
                zzfbVar.zzH(zzfbVar.zza());
            } else if (i9 != i5) {
                if (i9 != i4) {
                    int iZza = zzfbVar.zza();
                    int i10 = this.zzj;
                    int i11 = i10 == i3 ? 0 : iZza - i10;
                    if (i11 > 0) {
                        iZza -= i11;
                        zzfbVar.zzF(zzfbVar.zzc() + iZza);
                    }
                    this.zza.zza(zzfbVar);
                    int i12 = this.zzj;
                    if (i12 != i3) {
                        int i13 = i12 - iZza;
                        this.zzj = i13;
                        if (i13 == 0) {
                            this.zza.zzc(r6);
                            zzd(i5);
                        }
                    }
                } else {
                    if (zze(zzfbVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzfbVar, null, this.zzi)) {
                        this.zzb.zzj(r6);
                        if (this.zzf) {
                            this.zzb.zzl(4);
                            long jZzd = this.zzb.zzd(3);
                            this.zzb.zzl(i5);
                            int iZzd = this.zzb.zzd(15) << 15;
                            this.zzb.zzl(i5);
                            long jZzd2 = this.zzb.zzd(15);
                            this.zzb.zzl(i5);
                            if (!this.zzh && this.zzg) {
                                this.zzb.zzl(4);
                                long jZzd3 = ((long) this.zzb.zzd(3)) << 30;
                                this.zzb.zzl(i5);
                                int iZzd2 = this.zzb.zzd(15) << 15;
                                this.zzb.zzl(i5);
                                long jZzd4 = this.zzb.zzd(15);
                                this.zzb.zzl(i5);
                                this.zze.zzb(jZzd3 | ((long) iZzd2) | jZzd4);
                                this.zzh = true;
                            }
                            jZzb = this.zze.zzb((jZzd << 30) | ((long) iZzd) | jZzd2);
                        } else {
                            jZzb = -9223372036854775807L;
                        }
                        i8 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(jZzb, i8);
                        zzd(3);
                        i3 = -1;
                    }
                }
            } else if (zze(zzfbVar, this.zzb.zza, 9)) {
                this.zzb.zzj(0);
                int iZzd3 = this.zzb.zzd(24);
                if (iZzd3 != 1) {
                    zzes.zzf("PesReader", "Unexpected start code prefix: " + iZzd3);
                    i3 = -1;
                    this.zzj = -1;
                    i2 = 0;
                } else {
                    this.zzb.zzl(8);
                    int iZzd4 = this.zzb.zzd(16);
                    this.zzb.zzl(5);
                    this.zzk = this.zzb.zzn();
                    this.zzb.zzl(2);
                    this.zzf = this.zzb.zzn();
                    this.zzg = this.zzb.zzn();
                    this.zzb.zzl(6);
                    int iZzd5 = this.zzb.zzd(8);
                    this.zzi = iZzd5;
                    if (iZzd4 == 0) {
                        this.zzj = -1;
                    } else {
                        int i14 = (iZzd4 - 3) - iZzd5;
                        this.zzj = i14;
                        if (i14 < 0) {
                            zzes.zzf("PesReader", "Found negative packet payload size: " + i14);
                            i3 = -1;
                            this.zzj = -1;
                        }
                        i2 = 2;
                    }
                    i3 = -1;
                    i2 = 2;
                }
                zzd(i2);
            } else {
                i3 = -1;
            }
            i4 = 2;
            r6 = 0;
            i5 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zzb(zzfi zzfiVar, zzabe zzabeVar, zzaka zzakaVar) {
        this.zze = zzfiVar;
        this.zza.zzb(zzabeVar, zzakaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
